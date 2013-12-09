grammar jj;

options {
	language = Java;
//	output = AST;
}

/*------------------------------------------------------------------
 * SETTINGS
 *------------------------------------------------------------------*/

@lexer::members {
/** Handles context-sensitive lexing of implicit line joining such as
 *  the case where newline is ignored in cases like this:
 *  a = [3,
 *       4]
 */
int implicitLineJoiningLevel = 0;
}

@lexer::header{
package Compilador;
}

@parser::header{
package Compilador;
import Compilador.Semanticator;
import java.util.HashMap;
}

@parser::members {
Semanticator s = new Semanticator(this);
}

/*------------------------------------------------------------------
 * TOKENS
 *------------------------------------------------------------------*/

LPAREN    		: '(' {implicitLineJoiningLevel++;} ;
RPAREN   		: ')' {implicitLineJoiningLevel--;} ;
LBRACK    		: '[' {implicitLineJoiningLevel++;} ;
RBRACK    		: ']' {implicitLineJoiningLevel--;} ;

COLON     		: ':' ;
COMMA     		: ',' ;
SEMI      		: ';' ;
DOT 			: '.' ;

PLUS      		: '+' ;
MINUS    		: '-' ;
STAR    	  	: '*' ;
SLASH         	: '/' ;
POWER	      	: '^';

LESS          	: '<' ;
GREATER       	: '>' ;
ASSIGN    	  	: '=' ;
PERCENT   	  	: '%' ;
LCURLY    	  	: '{' {implicitLineJoiningLevel++;} ;
RCURLY    	  	: '}' {implicitLineJoiningLevel--;} ;
EQUAL     	  	: '==' ;
NOTEQUAL      	: '<>' ;
LESSEQUAL     	: '<=' ;
GREATEREQUAL  	: '>=' ;

AND 			: 'and' ;
OR 				: 'or' ;
NOT 			: 'not' ;
FALSE			: 'false';
TRUE			: 'true';

TO 				: '..';
FOR 			: 'for';
REPEAT			: 'repeat';
WHILE			: 'while';
IF				: 'if';
ELSE 	 		: 'else';
ELSEIF 	 		: 'elif';
UNTIL 	 		: 'until';
DO 	 			: 'do';
WITH 	 		: 'with';
IN 	 			: 'in';
END 	 		: 'end';
RETURN 	 		: 'return';
CHEST 	 		: 'chest';
THEN 	 		: 'then';

T_INT			: 'int';
T_REAL			: 'real';
T_STRING		: 'string';
T_CHAIN			: 'chain';
T_VOID			: 'void';
T_BOOL			: 'bool';


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

javax 
	:	((vardecl SEMI)*(stat))+
	;

stat 
	:	def_func		 
	|	def_chest
	;

weakstat returns [ String type ]
	:	varatrib	SEMI	
	|	vardecl     SEMI	
	|	funccall	SEMI	
	|	def_if				
	|	def_while				
	|	t=def_return {$type=t;}	SEMI	
	|	chestaccess SEMI    
	|	def_repeat
	;

varatrib 
	: 	n=NAME ASSIGN t=logic_op_expr { s.eval_assign(s.get_type(n.getText()), t, n); }
	;

vardecl
	: 	t=type v=NAME { s.add_variable(v.getText(), t);}  (COMMA v=NAME { s.add_variable(v.getText(), t);})*   
	;

funccall returns [ String type ]
	: 	n=NAME LPAREN h=arglist RPAREN { $type=s.eval_funccall(n.getText(), h);} 
	;

def_func 
	: 	t=type n=NAME LPAREN h=typedarglist RPAREN 
			{s.open_function_decl(t,h,n.getText());} tw=weakstat* {s.close_function_decl(tw);} END
	;

def_if 
	: 	IF logic_op_expr THEN weakstat* ( END | ( ELSE weakstat* END ) ) 
	;

def_repeat 
	: 	REPEAT weakstat* UNTIL LPAREN logic_op_expr RPAREN END
	;

def_chest 
	:	CHEST NAME COLON ( vardecl SEMI | funccall SEMI )* END
	;

def_while
	:	WHILE LPAREN logic_op_expr RPAREN weakstat* END
	;


type returns [ String type ] 
	:	T_INT  { $type = "Integer"; }
	|	T_REAL { $type = "Real"; }
	|	T_STRING { $type = "String"; }
	|	T_BOOL { $type = "Boolean"; }
	|	T_VOID { $type = "Void"; }
	|	T_CHAIN { $type = "Chain"; }
	;

term returns [ String type ]
	:	v=variable { $type = s.get_type(v); }
	|   f=funccall { $type = f;} 
	|	n=number { $type = n; }
	|	str=string { $type = str; }
	;

unary_op_expr returns [ String type ]
	:	( MINUS | PLUS | NOT )? t=term { $type=t; }
	;

strong_op_expr returns [ String type ]
	:	t1=unary_op_expr {$type = t1;}( op=( STAR | SLASH | PERCENT ) t2=unary_op_expr { $type = s.eval_strong_expr(t1,t2,op.getText()); } )*
	;

weak_op_expr returns [ String type ]
	:	t1=strong_op_expr { $type=t1;} ( op=( PLUS | MINUS ) t2=strong_op_expr {$type=s.eval_weak_expr(t1,t2,op.getText()); } )* 
	| FALSE 
	| TRUE
	;

relational_op_expr returns [ String type ]
	:	t1=weak_op_expr { $type=t1;} ( op=( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2=weak_op_expr
	{ s.eval_relational_expr(t1,t2,op.getText());} )*
	;

logic_op_expr returns [ String type ]
	:	t1=relational_op_expr {$type=t1;} ( op=( OR | AND ) t2=relational_op_expr { s.eval_logic_expr(t1,t2,op.getText());} )*
	;

typedarglist returns [ HashMap<String,String> tamap ]
	:{ $tamap = new HashMap<String,String>(); }	
	( t=type n=NAME { tamap.put(n.getText(), t); }( COMMA t=type n=NAME { tamap.put(n.getText(), t); } )* )?
	;

chestaccess 
	:	NAME ( DOT NAME )+ 
	;

def_return returns [ String type ]
	: RETURN t=logic_op_expr { $type=t;} {s.eval_return(t);}
	;

arglist returns [ HashMap<String,String> amap ]
	:{ $amap = new HashMap<String,String>(); }
	( n=NAME {amap.put(n.getText(), s.get_type(n.getText()));}( COMMA n1=NAME {amap.put(n.getText(), s.get_type(n1.getText()));} )* )?
	;

variable returns [ String name ]
	:	n=NAME { $name = n.getText();} {s.eval_atrib(n);}
	| chestaccess 
	;

number returns [ String type ]
	: INT { $type = "Integer"; }
	| FLOAT { $type = "Real"; }
	;

string returns [ String type ]
	:	NORMALSTRING { $type = "String"; }
	;	

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NAME
	:	LETTER (LETTER | DIGIT)* 
	;

INT
	: (DIGIT)+
	;

FLOAT
	: (DIGIT)+'.'(DIGIT)+
	;

NORMALSTRING
	: '"'( EscapeSequence | ~('\\'|'"'))*'"'
	;

fragment
EscapeSequence
	:	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	;

WS  :  (' ' | '\r' | '\t' | '\n' | '\u000C' ) + { $channel=HIDDEN; }
    ;
    
COMMENT
	:	'/*' (options {greedy=false;} : .)* '*/' { $channel=HIDDEN; }
	;

LINE_COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n'{$channel=HIDDEN;}
	;

fragment DIGIT 
	:	'0'..'9' 
	;

fragment LETTER
	:	LETTERL | LETTERU
	; 
	
fragment LETTERL
	:	'a'..'z'
	;
	
fragment LETTERU
	:	'A'..'Z'
	;

