grammar Juisyque;

//options {tokenVocab = JuisyqueLex;}

stmts : stmt * ;

stmt: small_stmt SEMI ; // | compound_stmt;

small_stmt
:
    assignment
    |expr
;

assignment
:
    variable (index_expr)? ASSIGN expr
;

variable
:
    DOLLAR name
;

name
:
    ID
    |NOTE
;

expr
:
    atom
    |expr COMP_OP expr
    |expr OP expr
    |expr index_expr
;

index_expr
:
    LBRACK expr RBRACK
    //slice
    | LBRACK expr? COLON expr? RBRACK
;

atom
:
    LPAREN expr RPAREN
    |note
    |chord
    |vector
    |matrix
    |dict
    |variable
    |function_call
    |STRING
    |NUMBER
;

note
:
    NOTE
;

chord
:
    LPAREN RPAREN
    | LPAREN chord_element (COMMA chord_element)* RPAREN
;

chord_element
:
    note
    |variable
;

vector
:
    LBRACK RBRACK
    | LBRACK expr ( (COMMA | bar_delim) expr)* RBRACK
    //| LBRACK vector_element ((COMMA vector_element)*|(SPACE vector_element)) RBRACK
;

bar_delim
:
    (COMMA)? VECOR
;

matrix
:
    LBRACK SEMI RBRACK
    | LBRACK expr ( SEMI RBRACK
                       |( SEMI expr )+ RBRACK )
;

dict
:
    LBRACE RBRACE
    |LBRACE dict_pair (COMMA dict_pair)* RBRACE
;

dict_pair
:
    STRING COLON expr
;

function_call
:
    func_name LPAREN args? RPAREN
;

func_name
:
    ID
;

args
:
    arg ( COMMA arg )*
;

arg
:
    expr
;

// DSL important tokens

STRING :
    '\'' .*? '\''
    | '"' .*? '"'
;

NUMBER
:
    INT
    |FLOAT
;

OCTAVE
:
    [oO] (PLUS|MINUS)? INT
;


// Symbols
DOLLAR : '$' ;

COLON : ':' ;

COMP_OP: LT|GT|EQUALS|GE|LE|NE|IN|NIN;

OP: PLUS|MINUS|MTIMES|RDIVIDE|NORMDIVIDE|NORMTIMES;

ASSIGN : '=' ;

EQUALS : '==' ;

NE : '!=' | '<>' ;

GT : '>' ;

LT : '<' ;

GE : '>=' ;

LE : '<=' ;

IN : 'in' ;

NIN : 'not in' ;

PLUS : '+' ;

MINUS : '-' ;

DOT : '.' ;

VECAND : '&' ;

VECOR : '|' ;

SCALAND : '&&' ;

SCALOR : '||' ;

LPAREN : '(' ;

RPAREN : ')' ;

LBRACE : '{' ;

RBRACE : '}' ;

LBRACK : '[' ;

RBRACK : ']' ;

MTIMES : '*' ;

TIMES : '.*' ;

NORMTIMES : '**' ;

RDIVIDE : '/' ;

LDIVIDE : '\\' ;

MRDIVIDE : './' ;

MLDIVIDE : '.\\' ;

NORMDIVIDE : '//' ;

POW : '.^' ;

MPOW : '^' ;

NOT : '~' ;

TRANS : '.\'' ;

CTRANS : '\'' ;


// General rules

INT : DIGIT+;

FLOAT : DIGIT+ '.' DIGIT*
      | '.' DIGIT+
      ;

SCI : (INT|FLOAT) 'e' INT ;

NOTE
:
    PITCH_LETTER (SHARP|FLAT)? (OCTAVE)?
    |EVENT_LETTER
;

ID  : LETTER (LETTER|DIGIT|'_')* ;

COMMA : ',' ;

SEMI  : ';' ;

SKIP_
:
    ( SPACE+ | COMMENT | NEWLINE ) -> skip
;

SPACE : [ \t] ;

fragment
LETTER  : [a-zA-Z] ;

fragment
PITCH_LETTER
:
    [A-G]
;

fragment
SHARP : '#';

fragment
FLAT : 'b';

fragment
EVENT_LETTER
:
    [tTrR]
;

fragment
DIGIT   : [0-9] ;

fragment COMMENT
:
    '#' ~[\r\n\f]*
;

fragment NEWLINE
:
    '\r' '\n'?
    | '\n'
;