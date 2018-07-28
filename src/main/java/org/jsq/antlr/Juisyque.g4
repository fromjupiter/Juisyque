grammar Juisyque;

//options {tokenVocab = JuisyqueLex;}

stmt: simple_stmt ; // | compound_stmt;

simple_stmt
:
    small_stmt(SEMI small_stmt)* SEMI
;

small_stmt
:
    assignment
    |expr
;

assignment
:
    variable ASSIGN expr
;

variable
:
    DOLLAR ID
;

expr
:
    atom
    |expr COMP_OP expr
    |expr OP expr
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
    |STRING
    |NUMBER
;

note
:
    NOTE_SYMBOL
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
    | LBRACK vector_element (COMMA vector_element)* RBRACK
    //| LBRACK vector_element ((COMMA vector_element)*|(SPACE vector_element)) RBRACK
;

vector_element
:
    vector
    |chord
    |note
    |variable
;

matrix
:
    LBRACK SEMI RBRACK
    | LBRACK matrix_row ( SEMI RBRACK
                       |( SEMI matrix_row )+ RBRACK )
;

matrix_row
:
    vector
    |variable
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

NOTE_SYMBOL
:
    PITCH (OCTAVE)?
;
PITCH
:
    [a-gA-G] (PLUS|MINUS)?
    | [tTrR]
;

OCTAVE
:
    [oO] (PLUS|MINUS)? INT
;


// Symbols
DOLLAR : '$' ;

COLON : ':' ;

COMP_OP: LT|GT|EQUALS|GE|LE|NE|IN|NIN;

OP: PLUS|MINUS|MTIMES|RDIVIDE|NORMDIVIDE;

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