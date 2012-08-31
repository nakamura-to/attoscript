grammar Atto;

options {
	output = AST;
	ASTLabelType = AttoTree;
}

tokens {
	INDENT; DEDENT; OBJ; ARRAY; BLOCK; STMT;
	IF='if'; ELIF='elif'; ELSE='else'; WHILE='while';
	UNARY_MINUS; PARAMS; CALL; INDEX; FIELD_ACCESS; SEND;
	CLASS='class'; EXTENDS='extends'; FUN;
	APPLY;
}

@lexer::header {
package atto;
}

@header {
package atto;
}

root
	: block
	;

block
	: (stmt (terminator stmt)*)? terminator? -> ^(BLOCK stmt*)
	;

stmt	
	: expr
	;

terminator
	: SEMICOLON NEWLINE?|NEWLINE
	; 

expr
	: (assign)=> assign
	| or
	| if_
	| while_

	;

assign
	: postfix 
	  ( ASSIGN expr -> ^(ASSIGN postfix expr)
	  | ( PLUS ASSIGN expr -> ^(ASSIGN postfix ^(PLUS postfix expr))
	    | MINUS ASSIGN expr -> ^(ASSIGN postfix ^(MINUS postfix expr))
	    | MUL ASSIGN expr -> ^(ASSIGN postfix ^(MUL postfix expr))
	    | DIV ASSIGN expr -> ^(ASSIGN postfix ^(DIV postfix expr))
	    | MOD ASSIGN expr -> ^(ASSIGN postfix ^(MOD postfix expr))
	    ) 
	  )
	;

fun
	: '{' paramsdef '->' NEWLINE? block '}' -> ^(ARROW paramsdef block)
	;

paramsdef
	: (vardef (COMMA vardef)*)? -> ^(PARAMS vardef*)
	;
	
if_	
	: 'if' cond_expr=expr 
	  ( NEWLINE? '{' NEWLINE? block '}' NEWLINE? elif* else_? 
	  	-> ^(IF $cond_expr block elif* else_?)
	  | 'then' then_expr=expr ('else' else_expr=expr)?
	  	-> ^(IF $cond_expr $then_expr ^(ELSE $else_expr)?)
	  )
	;

elif	
	: 'elif' expr NEWLINE? '{' NEWLINE? block '}' NEWLINE? -> ^(ELIF expr block)
	;

else_
	: 'else' NEWLINE? '{' NEWLINE? block '}' NEWLINE? -> ^(ELSE block)
	;

while_	
	: 'while' cond_expr=expr 
	  ( NEWLINE? '{' NEWLINE? block '}' NEWLINE? 
	  	-> ^(WHILE $cond_expr block)
	  | 'then' then_expr=expr
	  	-> ^(WHILE $cond_expr $then_expr)
	  )
	;

or
	: and (OR^ and)*
	;

and
	: rel (AND^ rel)*
	;

rel
	: rel2 ((EQ|NE|LE|GE|LT|GT|COMPOSITE|PIPELINE)^ rel2)*
	;


rel2
	: add (R_PIPELINE^ rel)*
	;

add
	: mul ((PLUS|MINUS)^ mul)*
	;

mul
	: unary ((MUL|DIV|MOD)^ unary)*
	;
	
unary
	: postfix
	| NOT^ postfix
	| MINUS postfix -> ^(UNARY_MINUS postfix)
	;
	
postfix 
	: ( primary -> primary )
	  ( LPAREN (expr (COMMA expr)*)? RPAREN 
	  	-> ^(CALL $postfix expr*)	
	  | LBRACK expr RBRACK 
	  	-> ^(INDEX $postfix expr)
	  | DOT ( p=primary -> ^(FIELD_ACCESS $postfix $p) 
	  	| -> ^(CALL $postfix)
	  	)
	  )*
	;

primary 
	: NAME
	| AT^ NAME	
	| NUMBER
	| STRING
	| BOOL
	| NULL
	| LPAREN expr RPAREN -> expr
	| (fun)=> fun
	| obj
	| array
	;

obj	
	: LCURLY NEWLINE? (pair ((COMMA|COMMA? NEWLINE) pair)*)? (COMMA|COMMA? NEWLINE)? RCURLY -> ^(OBJ pair*)
	;

pair
	: NAME COLON^ expr
	;


array	
	: LBRACK NEWLINE? (expr ((COMMA|COMMA? NEWLINE) expr)* )? (COMMA|COMMA? NEWLINE)? RBRACK -> ^(ARRAY expr*)
	;

vardef
	: NAME
	;

NUMBER		: '-'? DIGIT+ ('.' DIGIT+)?;	           
STRING		: '"' ~('\\' | '"')* '"' | '\'' ~('\\' | '\'')* '\'' ;
BOOL		: 'true' | 'false';
NULL		: 'null';
NAME		: ( UPPER | LOWER | '_') ID_CHAR*;

SEMICOLON	: ';';
COLON		: ':';
DOT		: '.';
COMMA		: ',';
LPAREN		: '(';
RPAREN		: ')';
LCURLY		: '{';
RCURLY		: '}';
LBRACK		: '[';
RBRACK		: ']';
AT		: '@';
EQ		: '==';
NE		: '!=';
LE		: '<=';
GE		: '>=';
LT		: '<';
GT		: '>';
PLUS		: '+';
MINUS		: '-';
MUL		: '*';
DIV		: '/';
MOD		: '%';
AND		: '&&';
OR		: '||';
NOT		: '!';
ASSIGN		: '=';
ARROW		: '->';
COMPOSITE	: '>>';
PIPELINE	: '|>';
R_PIPELINE	: '<|';

NEWLINE
		: ( (('\r')? '\n')+ (' '|'\t')* (DOT|PIPELINE|R_PIPELINE) )=> (('\r')? '\n')+ { $channel=HIDDEN; }
		| (('\r')? '\n')+
		;		
WS		: SPACE+ { $channel = HIDDEN; }
		;

fragment LETTER	: LOWER | UPPER;
fragment ID_CHAR: LETTER | DIGIT | '_';
fragment LOWER	: 'a'..'z';
fragment UPPER	: 'A'..'Z';
fragment DIGIT	: '0'..'9';
fragment SPACE	: ' ' | '\t';