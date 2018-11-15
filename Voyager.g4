grammar Voyager;


/*
 * Parser Rules
 */

voyager                : program+ EOF ;

program                : PROGRAMA bloqueprogram;

bloqueprogram          : ABRE_BRACKET bloque2 bloque3 main CIERRA_BRACKET;
main                   : MAIN ABRE_BRACKET bloque1 CIERRA_BRACKET;
bloque1                : estatuto bloque1 | /*epsilon*/;
bloque2                : declaracion bloque2 | /*epsilon*/;
bloque3                : func bloque3 | /*epsilon*/;

func                   : typefunc ID ABRE_PAREN parametros CIERRA_PAREN bloquefunc;

parametros             : tipo ID (COMA tipo ID )* |  /*epsilon*/;

bloquefunc1            : REGRESA expresion SEMI_COLON | /*epsilon*/;

typefunc               : tipo | VACIO;

bloquefunc             : ABRE_BRACKET bloque2 bloque1 bloquefunc1 CIERRA_BRACKET;
bloque                 : ABRE_BRACKET bloque1 CIERRA_BRACKET;


vector                 : ID ABRE_CORCHETE exp CIERRA_CORCHETE | /*epsilon*/;
vector_asigna          : ID ABRE_CORCHETE exp CIERRA_CORCHETE | /*epsilon*/;

estatuto               : asignacion | condicion | imprimir | (llamada SEMI_COLON) | ciclo;

asignacion             : idvector_asigna IGUAL expresion SEMI_COLON;
idvector_asigna        : ID | vector_asigna;

condicion              : SI ABRE_PAREN expresion CIERRA_PAREN lee_condicion bloque condicion1;
condicion1             : SINO bloque | /*epsilon*/;

declaracion            : VAR tipo idvector SEMI_COLON;
idvector               : ID | vector;

imprimir               : IMPRIMIR ABRE_PAREN imprimir1 CIERRA_PAREN SEMI_COLON;
imprimir1              : expresion | LETRERO;

ciclo                  : MIENTRAS ABRE_PAREN expresion CIERRA_PAREN lee_condicion bloque;

llamada                : ID ABRE_PAREN argumentos CIERRA_PAREN;

argumentos             : expresion (COMA expresion )* |  /*epsilon*/;

expbool                : exp expbool1;
expbool1               : MAS_QUE exp | MENOS_QUE exp | IGUAL_IGUAL exp | DIFERENTE_DE exp | /*epsilon*/;

expresion              : expbool expresion1;
expresion1             : AND expbool | OR expbool | /*epsilon*/;

exp                    : termino exp1;
exp1                   : SUMA termino | RESTA termino | /*epsilon*/;

termino                : factor termino2;
termino2               : MULT factor | DIV factor| /*epsilon*/;

factor                 : ABRE_PAREN expresion CIERRA_PAREN | operando;

operando               : 'verdadero' | 'falso' | CTE_E | CTE_F | CTE_C | llamada | ID |  vector_acceso;

vector_acceso          : ID ABRE_CORCHETE exp CIERRA_CORCHETE | /*epsilon*/;

tipo                   : ENTERO | FLOTANTE | BOOL | CHAR;

/*Puntos neuralgicos de condición *///////////////////////////////////////
lee_condicion : /*punto neuralgico 1 de if y punto neuralgico 2 de ciclo*/;
//enterCondición1 es punto neuralgico 3
//exitCondiciín es el punto neuralgico 2

/*Puntos neuralgicos de ciclo *////////////////////////////////////////////
//enterCiclo es el punto neuralgico 1
//exitCiclo es mi punto neuralgico 3

/*Puntos neuralgicos de llamada a func */////////////////////////////////////
//enterllamada punto neuralgico 1
//enter llamada punto neuralgico 2
verifica_tipo: /* punto neuralgico3 */;
sig_argumento: /* punto neuralgico4 */;
//exitllamada punto neuralgico5
//exit llamada punto neuralgico6

/*Puntos neuralgicos de delaración de func */
//enterfuncpunto neuralgico 1
mete_tipo: /*punto neuralgico 3 */;
mete_id: /*punto neuralgico 2 */;
// ignorados puntos 4 y 5 workspace necesario
// enterbloquefunc punto neuralgico 6
// exitfunc punto neuralgico 7

/* Declaración*/
// guardar id y tipo en tabla de vars

/*vectores declaración*/
//enter_vector punto neuralgico 2
//enter_vector punto neuralgico 3
//enter_vector punto neuralgico 4-5
//exit_vector punto neuralgico 8
/*vectores asignación*/

/*vectores acceso*/
//enter_vector punto neuralgico 1
//enter_vector punto neuralgico 2
//enter_vector punto neuralgico 3
//exit_vector punto neuralgico 5


//falta agregar for y puntos neuralgicos de vectores

/*
 * Lexer Rules
 */

fragment A          : ('A'|'a') ;
fragment B          : ('B'|'b') ;
fragment C          : ('C'|'c') ;
fragment D          : ('D'|'d') ;
fragment E          : ('E'|'e') ;
fragment F          : ('F'|'f') ;
fragment G          : ('G'|'g') ;
fragment I          : ('I'|'i') ;
fragment O          : ('O'|'o') ;
fragment S          : ('S'|'s') ;
fragment Y          : ('Y'|'y') ;
fragment H          : ('H'|'h') ;
fragment U          : ('U'|'u') ;
fragment V          : ('V'|'v') ;
fragment T          : ('T'|'t') ;
fragment L          : ('L'|'l') ;
fragment M          : ('M'|'m') ;
fragment N          : ('N'|'n') ;
fragment P          : ('P'|'p') ;
fragment R          : ('R'|'r') ;
fragment X          : ('X'|'x') ;
fragment QUOTE      : ('"') ;
fragment APOST      : ('\'') ;
fragment EQUAL      : ('=') ;
fragment NOT        : ('!') ;
fragment DIGITO     : ('0'..'9');
fragment AMPERSAND  : ('&');
fragment PALITO     : ('|');



fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;

VERDADERO           : V E R D A D E R O ;

FALSO               : F A L S O ;

FUNC                : F U N C ;

VAR                 : V A R;

IMPRIMIR            : I M P R I M I R;

SI                  : S I;

MAIN                : M A I N;

SINO                : S I N O;

ENTERO              : E N T E R O;

CHAR                : C H A R;

FLOTANTE            : F L O T A N T E;

TEXTO               : T E X T O;

BOOL                : B O O L;

VACIO               : V A C I O;

REGRESA             : R E G R E S A;

MIENTRAS            : M I E N T R A S;

ABRE_PAREN          : ('(');

CIERRA_PAREN        : (')');

ABRE_BRACKET        : ('{');

CIERRA_BRACKET      : ('}');

ABRE_CORCHETE       : ('[');

CIERRA_CORCHETE     : (']');

SEMI_COLON          : (';');

DOUBLE_DOT          : (':');

DOT                 : ('.');

COMA                 : (',');

SUMA                : ('+');

RESTA               : ('-');

DIV                 : ('/');

MULT                : ('*');

IGUAL               : ('=');

MAS_QUE             : ('>');

MENOS_QUE           : ('<');

AND                 : AMPERSAND AMPERSAND;

OR                 : PALITO PALITO;

IGUAL_IGUAL         : EQUAL EQUAL;

DIFERENTE_DE        : NOT EQUAL;

LETRERO             : QUOTE .*? QUOTE;

CTE_E               : DIGITO+;

CTE_F               : DIGITO+ DOT DIGITO+;

CTE_C               : APOST [A-Za-z0-9] APOST;

CTE_B               : (VERDADERO | FALSO);

PROGRAMA            : P R O G R A M A;

ID                  : [A-Za-z][A-Za-z0-9_]*;


                    

WS : [ \t\r\n\u000C]+ -> skip ; // skip spaces, tabs, newlines
