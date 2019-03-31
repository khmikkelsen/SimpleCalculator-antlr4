grammar SimpleCalculator;

program
    : expression* EOF
    ;
expression
    : term (PLUS term | MINUS term)*
    ;
term
    : primary ( TIMES primary | DIVIDE primary )*
    ;
primary
    : NUMBER | LPAR expression RPAR | MINUS primary
    ;

NUMBER
    : ('1'..'9') ('0'..'9')* ( '.' ('0'..'9')*)?
    ;
LPAR
    : '('
    ;
RPAR
    : ')'
    ;
PLUS
    : '+'
    ;
MINUS
    : '-'
    ;
DIVIDE
    : '/'
    ;
TIMES
    : '*'
    ;
WS
    : [ \r\n\t]+ -> skip
    ;
