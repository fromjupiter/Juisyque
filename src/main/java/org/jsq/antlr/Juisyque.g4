grammar Juisyque;


stmt: simple_stmt | compound_stmt;

simple_stmt
:
    small_stmt(';' small_stmt)* ';'
;

small_stmt
:
    expr_stmt
;

expr_stmt
:
    test (augassign test|('=' test))
;

augassign: '+=';

test
:
    expr (comp_op expr)*
;

comp_op: '<'|'>'|'=='|'>='|'<='|'<>'|'!='|'in'|'not' 'in';

expr
:
    atom_expr
;

atom_expr
:
    atom
;

atom
:
    NAME
    |NOTE
    |CHORD
    |EVENT
    |BAR
;

compound_stmt
:
    'TODO10'
;

NOTE
:
    PITCH_SYMBOL OCTAL_SYMBOL
;

CHORD
:
    'TODO0'
;

EVENT
:
    'TODO1'
;

BAR
:
    'TODO2'
;

NAME
:
    '$' ID_START ID_CONTINUE*
;

SKIP_
:
    ( SPACES | COMMENT | NEWLINE ) -> skip
;


/*
 * fragments
 */

fragment SPACES
:
    [ \t]+
;

fragment COMMENT
:
    '#' ~[\r\n\f]*
;

fragment NEWLINE
:
    '\r' '\n'?
    | '\n'
;


fragment PITCH_SYMBOL
:
    [aAdDgG] ('+'|'-')?
    | [bBeE] '-'?
    | [cCfF] '+'?
    | [tTrR]
;

fragment OCTAL_SYMBOL
:
    'o' [1-8]
;

fragment ID_START
:
    [a-zA-Z_]
;

fragment ID_CONTINUE
:
    ID_START | [0-9]
;