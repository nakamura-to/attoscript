/*
 Indentation logic is based on Python.g which is from a following URL.
 - https://github.com/antlr/examples-v3/blob/master/java/python/Python.g
*/

/*
 [The 'BSD licence']
 Copyright (c) 2004 Terence Parr and Loring Craymer
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
 
grammar Atto;

options {
	output = AST;
	ASTLabelType = AttoTree;
}

tokens {
	INDENT; DEDENT; OBJ; ARRAY; BLOCK; STMT;
	IF='if'; ELIF='elif'; ELSE='else'; WHILE='while';
	UNARY_MINUS; PARAMS; CALL; INDEX; FIELD_ACCESS; SEND;
}

@lexer::header {
package atto;
}

@lexer::members {
	int implicitLineJoiningLevel = 0;
	int startPos = -1;
	
	public Token nextToken() {
	    startPos = getCharPositionInLine();
	    return super.nextToken();
	}
}

@header {
package atto;
}

root
	: stmt* EOF -> ^(BLOCK stmt*)
	;

stmt	
	: expr (NEWLINE)? -> ^(STMT expr)
	;

block	 
	: NEWLINE INDENT stmt* DEDENT -> ^(BLOCK stmt*)
	;

expr
	: (assign)=> assign
	| (fun)=> fun
	| if_
	| while_
	| or
	;

assign
	: postfix 
	  ( ASSIGN body -> ^(ASSIGN postfix body)
	  | ( PLUS ASSIGN body -> ^(ASSIGN postfix ^(PLUS postfix body))
	    | MINUS ASSIGN body -> ^(ASSIGN postfix ^(MINUS postfix body))
	    | MUL ASSIGN body -> ^(ASSIGN postfix ^(MUL postfix body))
	    | DIV ASSIGN body -> ^(ASSIGN postfix ^(DIV postfix body))
	    | MOD ASSIGN body -> ^(ASSIGN postfix ^(MOD postfix body))
	    ) 
	  )
	;

fun
	: paramsdef ARROW^ body
	;

paramsdef
	: (vardef (COMMA vardef)*)? -> ^(PARAMS vardef*)
	| LPAREN (vardef (COMMA vardef)*)? RPAREN -> ^(PARAMS vardef*)
	;

body	
	: expr
	| block
	;
	
if_	
	: 'if' cond_expr=expr 
	  ( block elif* else_? 
	  	-> ^(IF $cond_expr block elif* else_?)
	  | 'then' then_expr=expr ('else' else_expr=expr)? 
	  	-> ^(IF $cond_expr $then_expr ^(ELSE $else_expr)?)
	  )
	;

elif	
	: 'elif' expr block -> ^(ELIF expr block)
	;

else_
	: 'else' block -> ^(ELSE block)
	;

while_	
	: 'while' cond_expr=expr 
	  ( block -> ^(WHILE $cond_expr block)
	  | 'then' then_expr=expr -> ^(WHILE $cond_expr $then_expr)
	  )
	;

or
	: and (OR^ and)*
	;

and
	: rel (AND^ rel)*
	;

rel
	: add ((EQ|NE|LE|GE|LT|GT|COMPOSITE|PIPELINE)^ add)*
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
	  ( LPAREN (expr (COMMA expr)*)? COMMA? RPAREN 
	  	-> ^(CALL $postfix expr*)	  	
	  | LBRACK expr RBRACK 
	  	-> ^(INDEX $postfix expr)
	  | DOT p=primary
	  	-> ^(FIELD_ACCESS $postfix $p) 
	  | p=primary
	  	-> ^(CALL $postfix $p)
	  )*
	;

primary 
	: NAME
	| AT^ NAME	
	| INT
	| STRING
	| BOOL
	| NULL
	| LPAREN expr RPAREN -> expr
	| obj
	| array	
	;

obj	
	: LCURLY (pair (COMMA pair)*)? COMMA? RCURLY -> ^(OBJ pair*)
	;

pair
	: NAME COLON^ expr
	;

array	
	: LBRACK (expr (COMMA expr)* )? COMMA? RBRACK -> ^(ARRAY expr*)
	;

vardef
	: NAME
	;

// Literals
fragment INTEGER:;
fragment FLOAT:;
/*
NUMBER:             '-'? DIGIT+
                      // Fix ambiguity with dot for message sending (DOT NAME).
                      ( {isNum(input.LA(2))}?=> '.' DIGIT+  { $type = FLOAT; }
                      |                                     { $type = INTEGER; }
                      );
*/           
INT		: DIGIT+;	           
STRING		: '"' ~('\\' | '"')* '"' | '\'' ~('\\' | '\'')* '\'' ;
BOOL		: 'true' | 'false';
NULL		: 'null';
NAME		: (LOWER | '_') ID_CHAR*;
CONSTANT	: UPPER ID_CHAR*;

SEMICOLON	: ';';
COLON		: ':';
DOT		: '.';
COMMA		: ',';
LPAREN		: '(' { implicitLineJoiningLevel++; } ;
RPAREN		: ')' { implicitLineJoiningLevel--; } ;
LCURLY		: '{' { implicitLineJoiningLevel++; } ;
RCURLY		: '}' { implicitLineJoiningLevel--; } ;
LBRACK		: '[' { implicitLineJoiningLevel++; } ;
RBRACK		: ']' { implicitLineJoiningLevel--; } ;
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

NEWLINE
		: ( (('\r')? '\n')+ (' '|'\t')* (DOT|PIPELINE) )=> (('\r')? '\n')+ (' '|'\t')* { $channel=HIDDEN; } 
		| (('\r')? '\n' )+ { if (startPos == 0 || implicitLineJoiningLevel > 0) $channel=HIDDEN; }
		;
WS		: { startPos > 0 }?=> SPACE+ { $channel = HIDDEN; };
LEADING_WS
@init { int spaces = 0; }
		: { startPos == 0 }?=>
			( { implicitLineJoiningLevel > 0 }? ( ' ' | '\t' )+ { $channel = HIDDEN; }
			| (' ' { spaces++; } | '\t' { spaces += 8; spaces -= (spaces \% 8); })+
				{
					// make a string of n spaces where n is column number - 1
					char[] indentation = new char[spaces];
					for (int i = 0; i < spaces; i++) {
						indentation[i] = ' ';
					}
					emit(new ClassicToken(LEADING_WS, new String(indentation)));
				}
				// kill trailing newline if present and then ignore
				( ('\r')? '\n' 
					{ 
						if (state.token != null) state.token.setChannel(HIDDEN); 
						else $channel = HIDDEN; 
					}
				)*
			)
		;
COMMENT
@init { $channel = HIDDEN; }
		: { startPos == 0 }?=> SPACE* '#' (~'\n')* '\n'+
		| { startPos > 0 }?=> '#' (~'\n')* 
		;

fragment LETTER	: LOWER | UPPER;
fragment ID_CHAR: LETTER | DIGIT | '_';
fragment LOWER	: 'a'..'z';
fragment UPPER	: 'A'..'Z';
fragment DIGIT	: '0'..'9';
fragment SPACE	: ' ' | '\t';