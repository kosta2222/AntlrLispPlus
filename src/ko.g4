grammar ko;
options {
language=Java;
}
prog: expr ';' | '#' COMMENT | EOF;
expr
        : expr  expr OPER_OR_FUNC   # oper
        | INT                     # int
	| '(' expr ')'             #braces   
        ;

INT     : [0-9]+;


OPER_OR_FUNC    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
LPAR    : '(';
RPAR    : ')';

CHAR : ~[\ \r\n];

COMMENT:  (CHAR)* ->skip;
WS      : [ \t\r\n]+ -> skip;