grammar Fast;

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
CodeGenerator g = new CodeGenerator(s);
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

PRINT 			: 'print';

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

fast 
	:	((vardecl SEMI)*(stat))+
	;

stat 
	:	def_func		 
	|	def_chest
	|   funccall	SEMI
	|	def_print	SEMI
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
	|	def_print	SEMI
	;

varatrib 
	: 	n=NAME ASSIGN le=logic_op_expr { s.eval_assign(s.get_type(n.getText()), le.type); g.storeVariable(n.getText(), le.type);}
	;

vardecl 
	: 	t=type v=NAME { s.add_variable(v.getText(), t); g.addVariable(v.getText(), t); }  
		(COMMA v=NAME { s.add_variable(v.getText(), t); g.addVariable(v.getText(), t); })*   
	;

funccall returns [ String type ]
	: 	n=NAME LPAREN h=arglist RPAREN { $type=s.eval_funccall(n.getText(), h); g.pushFunctionCall(n.getText(), h, type); } 
	;

def_func 
	: 	t=type n=NAME LPAREN h=typedarglist RPAREN 
			{s.open_function_decl(t,h,n.getText()); 
			 g.pushFunction(n.getText(), h, t);    
			} (tw=weakstat)*
			{s.close_function_decl(tw);
			 g.pushEnd(t);
			} END
	;

def_if 
	: 	IF e=logic_op_expr { g.pushIf(e.type, e.opr, "Else");} THEN 
		weakstat* 
		{ g.pushGotoLabel("Done"+g.popLabel("Done"));
		  g.pushElseLabel();
		}
		( END | ( ELSE weakstat* END ) )
		{ g.pushDoneLabel(); } 
	;

def_repeat 
	: 	REPEAT weakstat* UNTIL LPAREN logic_op_expr RPAREN END
	;

def_chest 
	:	CHEST NAME COLON ( vardecl SEMI | funccall SEMI )* END
	;

def_while
	:	{g.pushWhileLabel();}
		WHILE LPAREN le=logic_op_expr { g.pushWhile(le.type, le.opr); } RPAREN 
		weakstat*
		{ g.pushGotoLabel("While"+g.popLabel("While")); } 
		END
		{ g.pushDoneLabel(); }
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
	|   f=funccall { $type = f; } 
	|	n=number { $type = n; }
	|	str=string { $type = str; }
	;

unary_op_expr returns [ String type ]
	:	op=( MINUS | NOT )? t=term { $type=t; }
	;

strong_op_expr returns [ String type ]
	:	t1=unary_op_expr 
		{$type = t1;}( op=( STAR | SLASH | PERCENT ) t2=unary_op_expr 
		{ $type = s.eval_strong_expr(t1,t2,op.getText()); 
		  g.pushOperator(op.getText(), t1); } )*
	;

weak_op_expr returns [ String type ]
	:	t1=strong_op_expr { $type=t1;} ( op=( PLUS | MINUS ) t2=strong_op_expr 
	{$type=s.eval_weak_expr(t1,t2,op.getText());
	 g.pushOperator(op.getText(), t1); } )* 
	| f=FALSE {g.pushBoolean(f.getText()); }
	| t=TRUE  {g.pushBoolean(t.getText()); }
	;

relational_op_expr returns [ String type, String opr ]
	:	t1=weak_op_expr { $type=t1;} ( op=( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2=weak_op_expr
		{ s.eval_relational_expr(t1,t2,op.getText());
		  $opr = op.getText();} )*
	;

logic_op_expr returns [ String type, String opr ]
	:	r1=relational_op_expr {$type=r1.type; $opr = r1.opr;} ( op=( OR | AND ) r2=relational_op_expr 
		{ s.eval_logic_expr(r1.type,r2.type,op.getText());
		  $opr = op.getText();} )*
	;

typedarglist returns [ HashMap<String,String> tamap ]
	:{ $tamap = new HashMap<String,String>(); }	
	( t=type n=NAME { tamap.put(n.getText(), t); }( COMMA t=type n=NAME { tamap.put(n.getText(), t); } )* )?
	;

chestaccess 
	:	NAME ( DOT NAME )+ 
	;

def_return returns [ String type ]
	: RETURN t=logic_op_expr { $type=t.type;}
	;

arglist returns [ HashMap<String,String> amap ]
	:{ $amap = new HashMap<String,String>(); }
	( n=variable {amap.put(n, s.get_type(n));}( COMMA n1=variable {amap.put(n1, s.get_type(n1));} )* )?
	;

variable returns [ String name ]
	:	n=NAME { $name = n.getText(); g.loadVariable(n.getText(), s.get_type(n.getText())); }
	| chestaccess 
	;

number returns [ String type ]
	: inteiro=INT { $type = "Integer"; g.pushConstant(inteiro.getText());}
	| real=FLOAT { $type = "Real"; g.pushConstant(real.getText());}
	;

string returns [ String type ]
	:	strg=NORMALSTRING { $type = "String"; g.pushConstant(strg.getText()); }
	;	

def_print returns [ String type ]
	:	{g.pushPrint();}
		PRINT LPAREN t=term RPAREN
		{g.pushInvokePrint(t);
		 $type = t;}
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

