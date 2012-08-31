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
	: (expr (terminator expr)*)? terminator? -> ^(BLOCK expr*)
	;

terminator
	: SEMICOLON NEWLINE? | NEWLINE
	; 

expr
	: (assign)=> assign
	| or
	| if_
	| while_
	;

assign
	: postfix 
	  ( ASSIGN NEWLINE? expr -> ^(ASSIGN postfix expr)
	  | ( PLUS ASSIGN NEWLINE? expr -> ^(ASSIGN postfix ^(PLUS postfix expr))
	    | MINUS ASSIGN NEWLINE? expr -> ^(ASSIGN postfix ^(MINUS postfix expr))
	    | MUL ASSIGN NEWLINE? expr -> ^(ASSIGN postfix ^(MUL postfix expr))
	    | DIV ASSIGN NEWLINE? expr -> ^(ASSIGN postfix ^(DIV postfix expr))
	    | MOD ASSIGN NEWLINE? expr -> ^(ASSIGN postfix ^(MOD postfix expr))
	    ) 
	  )
	;

paramsdef
	: (vardef (COMMA vardef)*)? -> ^(PARAMS vardef*)
	;
	
if_	
	: 'if' cond_expr=expr 
	  ( NEWLINE block NEWLINE elif* else_? 'end'
	  	-> ^(IF $cond_expr block elif* else_?)
	  | 'then' then_expr=expr ('else' else_expr=expr)?
	  	-> ^(IF $cond_expr $then_expr ^(ELSE $else_expr)?)
	  )
	;

elif	
	: 'elif' expr NEWLINE block NEWLINE -> ^(ELIF expr block)
	;

else_
	: 'else' NEWLINE block  NEWLINE -> ^(ELSE block)
	;

while_	
	: 'while' cond_expr=expr 
	  ( NEWLINE block NEWLINE 'end' 
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
	: reverse_pipeline ((EQ|NE|LE|GE|LT|GT|COMPOSITE|PIPELINE)^ reverse_pipeline)*
	;

reverse_pipeline
	: add (REVERSE_PIPELINE^ rel)*
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
	: ( primary -> primary
	  )
	  ( LPAREN (expr (COMMA expr)*)? RPAREN 
	  	-> ^(CALL $postfix expr*)	
	  | LBRACK expr RBRACK 
	  	-> ^(INDEX $postfix expr)
	  | DOT primary 
	  	-> ^(FIELD_ACCESS $postfix primary)
	  | { input.LA(1) != MINUS }?=> expr
	  	-> ^(APPLY $postfix expr)
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
	| (obj)=> obj
	| fun
	| array
	;

obj	
	: LCURLY NEWLINE? (pair ((COMMA|COMMA? NEWLINE) pair)*)? (COMMA|COMMA? NEWLINE)? RCURLY -> ^(OBJ pair*)
	;

pair
	: NAME COLON^ expr
	;

fun
	: LCURLY (paramsdef ARROW)? NEWLINE? block RCURLY -> ^(FUN paramsdef? block)
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
APPLY		: '^';
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
REVERSE_PIPELINE	: '<|';

NEWLINE
		: ( (('\r')? '\n')+ (' '|'\t')* (DOT|PIPELINE|REVERSE_PIPELINE) )=> (('\r')? '\n')+ { $channel=HIDDEN; }
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