grammar javax;

options {
language = Java;
output = AST;
}

@lexer::header{
	package Tools;
}

@parser::header{
	package Tools;
}

@lexer::members {

int implicitLineJoiningLevel = 0;
int startPos=-1;
}

chunk : (stat (SEMI)?)+;

stat :  weakstat |
	deffunc		 |
	defchest;

weakstat : 
	varatrib	SEMI	|
	vardecl     SEMI	|
	funccall	SEMI	|
	defif				|
	deffor				|
	defreturn	SEMI	|
	chestaccess SEMI    |
	defrepeat;

block : (weakstat)*;

varatrib : (NAME | chestaccess) ASSIGN expr;

vardecl : type NAME(COMMA NAME)*;

funccall : NAME LPAREN arglist RPAREN;

deffunc : type NAME LPAREN typedarglist RPAREN DOSTAT block ENDSTAT;

defif : IFSTAT expr THENSTAT block (ELSEIFSTAT expr THENSTAT block)* (ELSESTAT block)? ENDSTAT;

deffor : FORSTAT NAME INSTAT expr DOSTAT block ENDSTAT;

defrepeat : REPEATSTAT block UNTILSTAT expr ENDSTAT;

defchest : CHESTSTAT NAME WITHSTAT (vardecl SEMI)* ENDSTAT;

type : TYPE | NAME;

expr : ('false' | 'true' | number | string | funccall | unop | chestaccess | NAME) (binop expr)*;

arglist : (expr(COMMA expr)*)?;

typedarglist : (type NAME(COMMA type NAME)*)?;

chestaccess : NAME(DOT NAME)+;

defreturn : RETURNSTAT expr;

binop : PLUS | MINUS | STAR  | SLASH | PERCENT | POWER | LESS | TO | LESSEQUAL | GREATER |
	GREATEREQUAL | EQUAL | AND | OR | NOTEQUAL;

unop : MINUS | NOT;

number : INT | FLOAT | HEX;

string : NORMALSTRING;

// LEXER

LPAREN    : '(' {implicitLineJoiningLevel++;} ;

RPAREN    : ')' {implicitLineJoiningLevel--;} ;

LBRACK    : '[' {implicitLineJoiningLevel++;} ;

RBRACK    : ']' {implicitLineJoiningLevel--;} ;

COLON     : ':' ;

COMMA    : ',' ;

SEMI    : ';' ;

PLUS    : '+' ;

MINUS    : '-' ;

STAR    : '*' ;

SLASH    : '/' ;

POWER	 : '^';

LESS    : '<' ;

GREATER    : '>' ;

ASSIGN    : '=' ;

PERCENT    : '%' ;

LCURLY    : '{' {implicitLineJoiningLevel++;} ;

RCURLY    : '}' {implicitLineJoiningLevel--;} ;

EQUAL    : '==' ;

NOTEQUAL: '<>' ;

LESSEQUAL    : '<=' ;

GREATEREQUAL    : '>=' ;

DOT : '.' ;

AND : 'and' ;

OR : 'or' ;

NOT : 'not' ;

TO : '..';

FORSTAT : 'for';

REPEATSTAT : 'repeat';

IFSTAT : 'if';

ELSESTAT : 'else';

ELSEIFSTAT : 'elif';

UNTILSTAT : 'until';

DOSTAT : 'do';

WITHSTAT : 'with';

INSTAT : 'in';

ENDSTAT : 'end';

RETURNSTAT : 'return';

CHESTSTAT : 'chest';

THENSTAT : 'then';

TYPE : 'int' | 'real' | 'bool' | 'string' | 'chain' | 'hex' | 'void'; 

NAME	: ('a'..'z' |'A'..'Z' | '_')(options{greedy=true;}: 'a'..'z'|'A'..'Z'|'_'|'?'|'0'..'9')*;

INT	: ('0'..'9')+;	

FLOAT	: INT'.'INT;

HEX	: '0x' ('0'..'9'|'a'..'f')+;

NORMALSTRING: '"'( EscapeSequence | ~('\\'|'"'))*'"';

fragment
EscapeSequence
	:	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n')+{$channel=HIDDEN;}
    ;
    
COMMENT
	:	'/*' (options {greedy=false;} : .)* '*/'{$channel=HIDDEN;}
	;

LINE_COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n'{$channel=HIDDEN;}
	;

