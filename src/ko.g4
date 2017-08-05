grammar ko;
options {
language=Java;
}

input
        : expr EOF
        ;

expr
        : expr  expr OPER_OR_FUNC   # oper
        | INT                     # int

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