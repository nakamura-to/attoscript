grammar Atto;

options {
	output = AST;
	ASTLabelType = AttoTree;
}

tokens {
	INDENT; DEDENT; OBJ; ARRAY; BLOCK; STMT;
	UNARY_MINUS; PARAMS; CALL; INDEX; FIELD_ACCESS; SEND;
	FUN; VARDEF; PARENT_CLASS;
}

@lexer::header {
package atto;
}

@header {
package atto;
}

@lexer::members {
	int startPos;
	boolean memberMode;
	
	@Override
	public Token nextToken() {
		startPos = getCharPositionInLine();
		return super.nextToken();
	}
}

root
	: block 
	;

block
	: (stmt (terminator stmt)*)? terminator? -> ^(BLOCK stmt*)
	;

stmt
	: expr
	| CLASS c=NAME (EXTENDS p=NAME)? NEWLINE (pair ((COMMA|COMMA? NEWLINE) pair)*)? (COMMA|COMMA? NEWLINE)? END
		-> ^(CLASS $c ^(PARENT_CLASS $p?) pair*)
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
	: IF cond_expr=expr 
	  ( NEWLINE block NEWLINE elif* else_? END
	  	-> ^(IF $cond_expr block elif* else_?)
	  | THEN then_expr=expr (ELSE else_expr=expr)?
	  	-> ^(IF $cond_expr $then_expr ^(ELSE $else_expr)?)
	  )
	;

elif	
	: ELIF expr NEWLINE block NEWLINE -> ^(ELIF expr block)
	;

else_
	: ELSE NEWLINE block  NEWLINE -> ^(ELSE block)
	;

while_	
	: WHILE cond_expr=expr 
	  ( NEWLINE block NEWLINE END 
	  	-> ^(WHILE $cond_expr block)
	  | THEN then_expr=expr
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
	: add ((EQ|NE|LE|GE|LT|GT|COMPOSITE|PIPELINE|REVERSE_PIPELINE)^ add)*
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
	: ( primary -> primary)
	  ( LPAREN (expr (COMMA expr)*)? RPAREN 
	  	-> ^(CALL $postfix expr*)	
	  | LBRACK expr RBRACK 
	  	-> ^(INDEX $postfix expr)
	  | DOT primary 
	  	-> ^(FIELD_ACCESS $postfix primary)
	  )*
	;

primary 
	: NAME
	| AT^ NAME
	| NUMBER
	| STRING
	| BOOLEAN
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
	: AT? NAME -> ^(VARDEF AT? NAME)
	;

IF		: { !memberMode }?=> 'if';
ELIF		: { !memberMode }?=> 'elif'; 
ELSE		: { !memberMode }?=> 'else'; 
WHILE		: { !memberMode }?=> 'while';
THEN		: { !memberMode }?=> 'then';
END		: { !memberMode }?=> 'end';
CLASS		: { !memberMode }?=> 'class';
EXTENDS		: { !memberMode }?=> 'extends';
BOOLEAN		: { !memberMode }?=> 'true' | 'false';
NULL		: { !memberMode }?=> 'null';

NUMBER		: '-'? DIGIT+ ('.' DIGIT+)?;
STRING		: '"' ~('\\' | '"')* '"' | '\'' ~('\\' | '\'')* '\'' ;
NAME		: ( UPPER | LOWER | '_') ID_CHAR* { memberMode = false; };

SEMICOLON	: ';';
COLON		: ':';
DOT		: '.' { memberMode = true; };
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
REVERSE_PIPELINE: '<|';

COMMENT		: {startPos==0}?=> '#'  ~('\r'|'\n')* (('\r')? '\n')* { $channel = HIDDEN; }
		| '#'  ~('\r'|'\n')* { $channel = HIDDEN; }
		;
NEWLINE
		: ( (('\r')? '\n')+ SPACE* (DOT|PIPELINE|REVERSE_PIPELINE) )=> (('\r')? '\n')+ { $channel = HIDDEN; }
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