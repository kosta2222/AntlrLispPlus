grammar ko;
options {
language=Java;
}

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
COMMENT: '//' [\\w ]+ ->skip;
WS      : [ \t\r\n]+ -> skip;