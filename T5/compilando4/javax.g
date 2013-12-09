grammar javax;

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

weakstat returns [ String typeS ]
	:	varatrib	SEMI	
	|	vardecl     SEMI	
	|	funccall	SEMI	
	|	def_if				
	|	def_while				
	|	t=def_return {$typeS=t;}	SEMI	
	|	chestaccess SEMI    
	|	def_repeat
	;

varatrib 
	: 	n=NAME ASSIGN t=logic_op_expr { s.eval_assign(s.get_type(n.getText()), t, n); }
	;

vardecl
	: 	t=type v=NAME { s.add_variable(v.getText(), t);}  (COMMA v=NAME { s.add_variable(v.getText(), t);})*   
	;

funccall returns [ String typeS ]
	: 	n=NAME LPAREN h=arglist RPAREN { $typeS=s.eval_funccall(n.getText(), h);} 
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


type returns [ String typeS ] 
	:	T_INT  { $typeS = "Integer"; }
	|	T_REAL { $typeS = "Real"; }
	|	T_STRING { $typeS = "String"; }
	|	T_BOOL { $typeS = "Boolean"; }
	|	T_VOID { $typeS = "Void"; }
	|	T_CHAIN { $typeS = "Chain"; }
	;

term returns [ String typeS ]
	:	v=variable { $typeS = s.get_type(v); }
	|   f=funccall { $typeS = f;} 
	|	n=number { $typeS = n; }
	|	str=string { $typeS = str; }
	;

unary_op_expr returns [ String typeS ]
	:	( MINUS | PLUS | NOT )? t=term { $typeS=t; }
	;

strong_op_expr returns [ String typeS ]
	:	t1=unary_op_expr {$typeS = t1;}( op=( STAR | SLASH | PERCENT ) t2=unary_op_expr { $typeS = s.eval_strong_expr(t1,t2,op.getText()); } )*
	;

weak_op_expr returns [ String typeS ]
	:	t1=strong_op_expr { $typeS=t1;} ( op=( PLUS | MINUS ) t2=strong_op_expr {$typeS=s.eval_weak_expr(t1,t2,op.getText()); } )* 
	| FALSE 
	| TRUE
	;

relational_op_expr returns [ String typeS ]
	:	t1=weak_op_expr { $typeS=t1;} ( op=( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2=weak_op_expr
	{ s.eval_relational_expr(t1,t2,op.getText());} )*
	;

logic_op_expr returns [ String typeS ]
	:	t1=relational_op_expr {$typeS=t1;} ( op=( OR | AND ) t2=relational_op_expr { s.eval_logic_expr(t1,t2,op.getText());} )*
	;

typedarglist returns [ HashMap<String,String> tamap ]
	:{ $tamap = new HashMap<String,String>(); }	
	( t=type n=NAME { tamap.put(n.getText(), t); }( COMMA t=type n=NAME { tamap.put(n.getText(), t); } )* )?
	;

chestaccess 
	:	NAME ( DOT NAME )+ 
	;

def_return returns [ String typeS ]
	: RETURN t=logic_op_expr { $typeS=t;} {s.eval_return(t);}
	;

arglist returns [ HashMap<String,String> amap ]
	:{ $amap = new HashMap<String,String>(); }
	( n=NAME {amap.put(n.getText(), s.get_type(n.getText()));}( COMMA n1=NAME {amap.put(n.getText(), s.get_type(n1.getText()));} )* )?
	;

variable returns [ String name ]
	:	n=NAME { $name = n.getText();} {s.eval_atrib(n);}
	| chestaccess 
	;

number returns [ String typeS ]
	: INT { $typeS = "Integer"; }
	| FLOAT { $typeS = "Real"; }
	;

string returns [ String typeS ]
	:	NORMALSTRING { $typeS = "String"; }
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

WS  :  (' ' | '\r' | '\t' | '\n' | '\u000C' ) 
    ;
    
COMMENT
	:	'/*' (.)*? '*/' 
	;

LINE_COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n'
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

