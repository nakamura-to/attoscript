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

/*
 Indentation logic is based on a Python.g which is from a following URL.
 - https://github.com/antlr/examples-v3/blob/master/java/python/Python.g
*/
 
grammar Atto;

options {
	output = AST;
	ASTLabelType = AttoTree;
}

tokens {
	INDENT; DEDENT; OBJ; ARRAY; BLOCK; STMT; PRINT='print';
	CALL; FUN='fun'; IF='if'; ELIF='elif'; ELSE='else'; WHILE='while';
	PARAMS;
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

@members {
	boolean calling;

	Scope scope;
	
	public AttoParser(TokenStream input, Scope scope) {
		this(input);
		this.scope = scope;
	}
}

root
	: stmt* EOF -> ^(BLOCK stmt*)
	;

stmt	
	: expr NEWLINE? -> ^(STMT expr)
	;

block	 
	: NEWLINE INDENT stmt* DEDENT -> ^(BLOCK stmt*)
	;

expr
	: fun
	| assign
	| or
	| if_
	| while_
	| obj
	| array
	| print
	;

print
	: 'print' expr -> ^(PRINT expr)
	;

obj	
	: OPEN_BRACKET (pair (COLON pair)* COLON?)? CLOSE_BRACKET -> ^(OBJ pair*)
	;

pair
	: NAME COLON^ expr
	;

array	
	: OPEN_S_BRACKET (expr (COMMA expr)* COMMA?)? CLOSE_S_BRACKET -> ^(ARRAY expr*)
	;

if_	
	: 'if' expr block elif* else_? -> ^(IF expr block elif* else_?)
	;

elif	
	: 'elif' expr block -> ^(ELIF expr block)
	;

else_	
	: 'else' block -> ^(ELSE block)
	;

while_	
	: 'while' expr block -> ^(WHILE expr block)
	;
	
assign
	: qname ASSIGN^ expr
	;

fun
@after { $fun.tree.scope = scope; }
	: 'fun'
	  {
	  	scope = new Scope(scope); // push function args scope
	  } 
	  (vardef (COMMA vardef)*)? ARROW 
	  {
	  	scope = new Scope(scope); // push function body scope
	  }
	  (expr -> ^(FUN vardef* expr) | block -> ^(FUN vardef* block)) // TODO block
	  {
	  	scope = scope.getEnclosingScope(); // pop function body scope
	  	scope = scope.getEnclosingScope(); // pop function args scope
	  }
	;

or
	: and (OR^ and)*
	;

and
	: rel (AND^ rel)*
	;

rel
	: add ((EQ|NE|LE|GE|LT|GT)^ add)*
	;

add
	: mul ((PLUS|MINUS)^ mul)*
	;

mul
	: unary ((MUL|DIV|MOD)^ unary)*
	;
	
unary
	: primary
	| NOT^ primary
	;

primary 
	: (call)=> call
	| atom
	;

atom	
	: qname	
	| INT
	| STRING
	| BOOL
	| NULL
	| OPEN_PARENT expr CLOSE_PARENT -> expr
	;

qname	
	: NAME (DOT^ NAME)*
	;

vardef
	: NAME
	  {
	  	$NAME.tree.scope = scope;
	  	Symbol symbol = new Symbol($NAME.text);
	  	scope.define(symbol);
	  }
	;
		
call
	: atom OPEN_PARENT (primary (COMMA primary)*)? CLOSE_PARENT -> ^(CALL atom primary*)
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
INT		: MINUS? DIGIT+;	           
STRING		: '"' ~('\\' | '"')* '"' | '\'' ~('\\' | '\'')* '\'' ;
BOOL		: 'true' | 'false';
NULL		: 'null';
NAME		: (LOWER | '_') ID_CHAR*;
CONSTANT	: UPPER ID_CHAR*;

SEMICOLON	: ';';
COLON		: ':';
DOT		: '.';
COMMA		: ',';
OPEN_PARENT	: '(';
CLOSE_PARENT	: ')';
OPEN_BRACKET	: '{';
CLOSE_BRACKET	: '}';
OPEN_S_BRACKET	: '[';
CLOSE_S_BRACKET	: ']';
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

NEWLINE		: (('\r')? '\n' )+ { if (startPos == 0 || implicitLineJoiningLevel > 0) $channel=HIDDEN; } ;
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