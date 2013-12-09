grammar AnaliseSemantica;

program : classlist?;

classlist : classdecl (classlist)?;

classdecl : 'class' ident ('extends' ident)? classbody;

classbody : '{' (classlist)? (vardecl ';')* (constructdecl)* (methoddecl)* '}';

vardecl : type ident ('[' ']')* (',' ident ('['']')*)*;

type : 'string' | 'int' | 'char' | ident;

constructdecl : 'constructor' methodbody;

methoddecl : type ('['']')* ident methodbody;

methodbody : '(' paramlist ')' statement;

paramlist : (type ident ('['']')* (',' type ident ('['']')*)*)?;

statement : vardecl ';' # vardeclstat
            | atribstat ';'
            | printstat ';'
            | readstat ';'
            | returnstat ';'
            | superstat ';'
            | ifstat
            | whilestat
            | forstat
            | '{' statlist '}'
            | dowhilestat ';'
            | switchcasestat
            | 'break' ';'
            | ';';

expr : numexpr (( '<' | '>' | '<=' | '>=' | '==' | '!=') numexpr)?;

atribstat : lvalue '=' (expr | alocexpr);

printstat : 'print' expr;

readstat : 'read' lvalue;

returnstat : 'return' (expr)?;

superstat : 'super' '(' arglist ')';

ifstat : 'if' '(' expr ')' statement ('else' statement)?;

forstat : 'for' '(' ((atribstat? ';' expr? ';' atribstat?) | ( type 'ident' ( '[' ']' )* ':' lvalue )) ')' statement;

whilestat : 'while' '(' expr ')' statement;

dowhilestat : 'do' statement 'while' '(' expr ')';

switchcasestat : 'switch' '(' ident ')' '{'
                ('case' expr ':' statement
                'break' ';')*
                'default' ':' statement
                '}';

lvalue : ident ('[' expr ']' | '.' ident ('(' arglist ')')?)*;

alocexpr : 'new' ( ident '(' arglist ')')
            | type ('[' expr ']')+;

arglist : (expr (',' expr)*)?;

numexpr : term (('+' | '-') term)*;

term : unaryexpr (('*' | '/' | '%' | '**') unaryexpr)*;

unaryexpr : ('+' | '-')? factor;

factor : (INT | '\"' STRING '\"' | 'null' | lvalue | '(' expr ')');

statlist : statement (statlist)*;

ident : (CHAR | STRING) '_'*;

CHAR : [a-zA-Z];
STRING : CHAR + INT*;
INT : [0-9]+;

TI : [' ', '\t','\n', '\r', '\f'] -> skip; // ignora um espaço em branco, uma tabulação, final de linha...
