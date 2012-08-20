// $ANTLR 3.4 Atto.g 2012-08-20 16:59:37

package atto;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AttoLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ARRAY=5;
    public static final int ARROW=6;
    public static final int ASSIGN=7;
    public static final int AT=8;
    public static final int BLOCK=9;
    public static final int BOOL=10;
    public static final int CALL=11;
    public static final int CLOSE_BRACKET=12;
    public static final int CLOSE_PARENT=13;
    public static final int CLOSE_S_BRACKET=14;
    public static final int COLON=15;
    public static final int COMMA=16;
    public static final int COMMENT=17;
    public static final int CONSTANT=18;
    public static final int DEDENT=19;
    public static final int DIGIT=20;
    public static final int DIV=21;
    public static final int DOT=22;
    public static final int ELIF=23;
    public static final int ELSE=24;
    public static final int EQ=25;
    public static final int FLOAT=26;
    public static final int FUN=27;
    public static final int GE=28;
    public static final int GT=29;
    public static final int ID_CHAR=30;
    public static final int IF=31;
    public static final int INDENT=32;
    public static final int INT=33;
    public static final int INTEGER=34;
    public static final int LE=35;
    public static final int LEADING_WS=36;
    public static final int LETTER=37;
    public static final int LOWER=38;
    public static final int LT=39;
    public static final int MINUS=40;
    public static final int MOD=41;
    public static final int MUL=42;
    public static final int NAME=43;
    public static final int NE=44;
    public static final int NEWLINE=45;
    public static final int NOT=46;
    public static final int NULL=47;
    public static final int OBJ=48;
    public static final int OPEN_BRACKET=49;
    public static final int OPEN_PARENT=50;
    public static final int OPEN_S_BRACKET=51;
    public static final int OR=52;
    public static final int PARAMS=53;
    public static final int PLUS=54;
    public static final int PRINT=55;
    public static final int SEMICOLON=56;
    public static final int SPACE=57;
    public static final int STMT=58;
    public static final int STRING=59;
    public static final int UNARY_MINUS=60;
    public static final int UPPER=61;
    public static final int WHILE=62;
    public static final int WS=63;

    	int implicitLineJoiningLevel = 0;
    	int startPos = -1;
    	
    	public Token nextToken() {
    	    startPos = getCharPositionInLine();
    	    return super.nextToken();
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AttoLexer() {} 
    public AttoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AttoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Atto.g"; }

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:15:6: ( 'elif' )
            // Atto.g:15:8: 'elif'
            {
            match("elif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:16:6: ( 'else' )
            // Atto.g:16:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FUN"
    public final void mFUN() throws RecognitionException {
        try {
            int _type = FUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:17:5: ( 'fun' )
            // Atto.g:17:7: 'fun'
            {
            match("fun"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:18:4: ( 'if' )
            // Atto.g:18:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:19:7: ( 'print' )
            // Atto.g:19:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:20:7: ( 'while' )
            // Atto.g:20:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // Atto.g:210:17: ()
            // Atto.g:210:18: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // Atto.g:211:15: ()
            // Atto.g:211:16: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:219:6: ( ( DIGIT )+ )
            // Atto.g:219:8: ( DIGIT )+
            {
            // Atto.g:219:8: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Atto.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:220:9: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Atto.g:220:11: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 

                    // Atto.g:220:15: (~ ( '\\\\' | '\"' ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // Atto.g:220:36: '\\'' (~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 

                    // Atto.g:220:41: (~ ( '\\\\' | '\\'' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:221:7: ( 'true' | 'false' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='t') ) {
                alt5=1;
            }
            else if ( (LA5_0=='f') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Atto.g:221:9: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // Atto.g:221:18: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:222:7: ( 'null' )
            // Atto.g:222:9: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:223:7: ( ( LOWER | '_' ) ( ID_CHAR )* )
            // Atto.g:223:9: ( LOWER | '_' ) ( ID_CHAR )*
            {
            if ( input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Atto.g:223:23: ( ID_CHAR )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Atto.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:224:10: ( UPPER ( ID_CHAR )* )
            // Atto.g:224:12: UPPER ( ID_CHAR )*
            {
            mUPPER(); 


            // Atto.g:224:18: ( ID_CHAR )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Atto.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:226:11: ( ';' )
            // Atto.g:226:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:227:8: ( ':' )
            // Atto.g:227:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:228:6: ( '.' )
            // Atto.g:228:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:229:8: ( ',' )
            // Atto.g:229:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "OPEN_PARENT"
    public final void mOPEN_PARENT() throws RecognitionException {
        try {
            int _type = OPEN_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:230:13: ( '(' )
            // Atto.g:230:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_PARENT"

    // $ANTLR start "CLOSE_PARENT"
    public final void mCLOSE_PARENT() throws RecognitionException {
        try {
            int _type = CLOSE_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:231:14: ( ')' )
            // Atto.g:231:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_PARENT"

    // $ANTLR start "OPEN_BRACKET"
    public final void mOPEN_BRACKET() throws RecognitionException {
        try {
            int _type = OPEN_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:232:14: ( '{' )
            // Atto.g:232:16: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BRACKET"

    // $ANTLR start "CLOSE_BRACKET"
    public final void mCLOSE_BRACKET() throws RecognitionException {
        try {
            int _type = CLOSE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:233:15: ( '}' )
            // Atto.g:233:17: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BRACKET"

    // $ANTLR start "OPEN_S_BRACKET"
    public final void mOPEN_S_BRACKET() throws RecognitionException {
        try {
            int _type = OPEN_S_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:234:16: ( '[' )
            // Atto.g:234:18: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_S_BRACKET"

    // $ANTLR start "CLOSE_S_BRACKET"
    public final void mCLOSE_S_BRACKET() throws RecognitionException {
        try {
            int _type = CLOSE_S_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:235:17: ( ']' )
            // Atto.g:235:19: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_S_BRACKET"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:236:5: ( '@' )
            // Atto.g:236:7: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:237:5: ( '==' )
            // Atto.g:237:7: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:238:5: ( '!=' )
            // Atto.g:238:7: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:239:5: ( '<=' )
            // Atto.g:239:7: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:240:5: ( '>=' )
            // Atto.g:240:7: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:241:5: ( '<' )
            // Atto.g:241:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:242:5: ( '>' )
            // Atto.g:242:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:243:7: ( '+' )
            // Atto.g:243:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:244:8: ( '-' )
            // Atto.g:244:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:245:6: ( '*' )
            // Atto.g:245:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:246:6: ( '/' )
            // Atto.g:246:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:247:6: ( '%' )
            // Atto.g:247:8: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:248:6: ( '&&' )
            // Atto.g:248:8: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:249:5: ( '||' )
            // Atto.g:249:7: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:250:6: ( '!' )
            // Atto.g:250:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:251:9: ( '=' )
            // Atto.g:251:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:252:8: ( '->' )
            // Atto.g:252:10: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:254:10: ( ( ( '\\r' )? '\\n' )+ )
            // Atto.g:254:12: ( ( '\\r' )? '\\n' )+
            {
            // Atto.g:254:12: ( ( '\\r' )? '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Atto.g:254:13: ( '\\r' )? '\\n'
            	    {
            	    // Atto.g:254:13: ( '\\r' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0=='\r') ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // Atto.g:254:14: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }


            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


             if (startPos == 0 || implicitLineJoiningLevel > 0) _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:255:5: ({...}? => ( SPACE )+ )
            // Atto.g:255:7: {...}? => ( SPACE )+
            {
            if ( !(( startPos > 0 )) ) {
                throw new FailedPredicateException(input, "WS", " startPos > 0 ");
            }

            // Atto.g:255:27: ( SPACE )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Atto.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LEADING_WS"
    public final void mLEADING_WS() throws RecognitionException {
        try {
            int _type = LEADING_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             int spaces = 0; 
            // Atto.g:258:3: ({...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* ) )
            // Atto.g:258:5: {...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            {
            if ( !(( startPos == 0 )) ) {
                throw new FailedPredicateException(input, "LEADING_WS", " startPos == 0 ");
            }

            // Atto.g:259:4: ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==' ') ) {
                int LA15_1 = input.LA(2);

                if ( (( implicitLineJoiningLevel > 0 )) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA15_0=='\t') ) {
                int LA15_2 = input.LA(2);

                if ( (( implicitLineJoiningLevel > 0 )) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Atto.g:259:6: {...}? ( ' ' | '\\t' )+
                    {
                    if ( !(( implicitLineJoiningLevel > 0 )) ) {
                        throw new FailedPredicateException(input, "LEADING_WS", " implicitLineJoiningLevel > 0 ");
                    }

                    // Atto.g:259:40: ( ' ' | '\\t' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\t'||LA11_0==' ') ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                     _channel = HIDDEN; 

                    }
                    break;
                case 2 :
                    // Atto.g:260:8: ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )*
                    {
                    // Atto.g:260:8: ( ' ' | '\\t' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==' ') ) {
                            alt12=1;
                        }
                        else if ( (LA12_0=='\t') ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Atto.g:260:9: ' '
                    	    {
                    	    match(' '); 

                    	     spaces++; 

                    	    }
                    	    break;
                    	case 2 :
                    	    // Atto.g:260:29: '\\t'
                    	    {
                    	    match('\t'); 

                    	     spaces += 8; spaces -= (spaces % 8); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);



                    					// make a string of n spaces where n is column number - 1
                    					char[] indentation = new char[spaces];
                    					for (int i = 0; i < spaces; i++) {
                    						indentation[i] = ' ';
                    					}
                    					emit(new ClassicToken(LEADING_WS, new String(indentation)));
                    				

                    // Atto.g:270:5: ( ( '\\r' )? '\\n' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Atto.g:270:7: ( '\\r' )? '\\n'
                    	    {
                    	    // Atto.g:270:7: ( '\\r' )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0=='\r') ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // Atto.g:270:8: '\\r'
                    	            {
                    	            match('\r'); 

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); 

                    	     
                    	    						if (state.token != null) state.token.setChannel(HIDDEN); 
                    	    						else _channel = HIDDEN; 
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEADING_WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             _channel = HIDDEN; 
            // Atto.g:280:3: ({...}? => ( SPACE )* '#' (~ '\\n' )* ( '\\n' )+ |{...}? => '#' (~ '\\n' )* )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // Atto.g:280:5: {...}? => ( SPACE )* '#' (~ '\\n' )* ( '\\n' )+
                    {
                    if ( !(( startPos == 0 )) ) {
                        throw new FailedPredicateException(input, "COMMENT", " startPos == 0 ");
                    }

                    // Atto.g:280:26: ( SPACE )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\t'||LA16_0==' ') ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    match('#'); 

                    // Atto.g:280:37: (~ '\\n' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    // Atto.g:280:46: ( '\\n' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\n') ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Atto.g:280:46: '\\n'
                    	    {
                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Atto.g:281:5: {...}? => '#' (~ '\\n' )*
                    {
                    if ( !(( startPos > 0 )) ) {
                        throw new FailedPredicateException(input, "COMMENT", " startPos > 0 ");
                    }

                    match('#'); 

                    // Atto.g:281:29: (~ '\\n' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // Atto.g:284:17: ( LOWER | UPPER )
            // Atto.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ID_CHAR"
    public final void mID_CHAR() throws RecognitionException {
        try {
            // Atto.g:285:17: ( LETTER | DIGIT | '_' )
            // Atto.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_CHAR"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // Atto.g:286:16: ( 'a' .. 'z' )
            // Atto.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // Atto.g:287:16: ( 'A' .. 'Z' )
            // Atto.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Atto.g:288:16: ( '0' .. '9' )
            // Atto.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // Atto.g:289:16: ( ' ' | '\\t' )
            // Atto.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPACE"

    public void mTokens() throws RecognitionException {
        // Atto.g:1:8: ( ELIF | ELSE | FUN | IF | PRINT | WHILE | INT | STRING | BOOL | NULL | NAME | CONSTANT | SEMICOLON | COLON | DOT | COMMA | OPEN_PARENT | CLOSE_PARENT | OPEN_BRACKET | CLOSE_BRACKET | OPEN_S_BRACKET | CLOSE_S_BRACKET | AT | EQ | NE | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | ARROW | NEWLINE | WS | LEADING_WS | COMMENT )
        int alt21=43;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // Atto.g:1:10: ELIF
                {
                mELIF(); 


                }
                break;
            case 2 :
                // Atto.g:1:15: ELSE
                {
                mELSE(); 


                }
                break;
            case 3 :
                // Atto.g:1:20: FUN
                {
                mFUN(); 


                }
                break;
            case 4 :
                // Atto.g:1:24: IF
                {
                mIF(); 


                }
                break;
            case 5 :
                // Atto.g:1:27: PRINT
                {
                mPRINT(); 


                }
                break;
            case 6 :
                // Atto.g:1:33: WHILE
                {
                mWHILE(); 


                }
                break;
            case 7 :
                // Atto.g:1:39: INT
                {
                mINT(); 


                }
                break;
            case 8 :
                // Atto.g:1:43: STRING
                {
                mSTRING(); 


                }
                break;
            case 9 :
                // Atto.g:1:50: BOOL
                {
                mBOOL(); 


                }
                break;
            case 10 :
                // Atto.g:1:55: NULL
                {
                mNULL(); 


                }
                break;
            case 11 :
                // Atto.g:1:60: NAME
                {
                mNAME(); 


                }
                break;
            case 12 :
                // Atto.g:1:65: CONSTANT
                {
                mCONSTANT(); 


                }
                break;
            case 13 :
                // Atto.g:1:74: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 14 :
                // Atto.g:1:84: COLON
                {
                mCOLON(); 


                }
                break;
            case 15 :
                // Atto.g:1:90: DOT
                {
                mDOT(); 


                }
                break;
            case 16 :
                // Atto.g:1:94: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 17 :
                // Atto.g:1:100: OPEN_PARENT
                {
                mOPEN_PARENT(); 


                }
                break;
            case 18 :
                // Atto.g:1:112: CLOSE_PARENT
                {
                mCLOSE_PARENT(); 


                }
                break;
            case 19 :
                // Atto.g:1:125: OPEN_BRACKET
                {
                mOPEN_BRACKET(); 


                }
                break;
            case 20 :
                // Atto.g:1:138: CLOSE_BRACKET
                {
                mCLOSE_BRACKET(); 


                }
                break;
            case 21 :
                // Atto.g:1:152: OPEN_S_BRACKET
                {
                mOPEN_S_BRACKET(); 


                }
                break;
            case 22 :
                // Atto.g:1:167: CLOSE_S_BRACKET
                {
                mCLOSE_S_BRACKET(); 


                }
                break;
            case 23 :
                // Atto.g:1:183: AT
                {
                mAT(); 


                }
                break;
            case 24 :
                // Atto.g:1:186: EQ
                {
                mEQ(); 


                }
                break;
            case 25 :
                // Atto.g:1:189: NE
                {
                mNE(); 


                }
                break;
            case 26 :
                // Atto.g:1:192: LE
                {
                mLE(); 


                }
                break;
            case 27 :
                // Atto.g:1:195: GE
                {
                mGE(); 


                }
                break;
            case 28 :
                // Atto.g:1:198: LT
                {
                mLT(); 


                }
                break;
            case 29 :
                // Atto.g:1:201: GT
                {
                mGT(); 


                }
                break;
            case 30 :
                // Atto.g:1:204: PLUS
                {
                mPLUS(); 


                }
                break;
            case 31 :
                // Atto.g:1:209: MINUS
                {
                mMINUS(); 


                }
                break;
            case 32 :
                // Atto.g:1:215: MUL
                {
                mMUL(); 


                }
                break;
            case 33 :
                // Atto.g:1:219: DIV
                {
                mDIV(); 


                }
                break;
            case 34 :
                // Atto.g:1:223: MOD
                {
                mMOD(); 


                }
                break;
            case 35 :
                // Atto.g:1:227: AND
                {
                mAND(); 


                }
                break;
            case 36 :
                // Atto.g:1:231: OR
                {
                mOR(); 


                }
                break;
            case 37 :
                // Atto.g:1:234: NOT
                {
                mNOT(); 


                }
                break;
            case 38 :
                // Atto.g:1:238: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 39 :
                // Atto.g:1:245: ARROW
                {
                mARROW(); 


                }
                break;
            case 40 :
                // Atto.g:1:251: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 41 :
                // Atto.g:1:259: WS
                {
                mWS(); 


                }
                break;
            case 42 :
                // Atto.g:1:262: LEADING_WS
                {
                mLEADING_WS(); 


                }
                break;
            case 43 :
                // Atto.g:1:273: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA20_eotS =
        "\2\uffff\2\4\1\uffff";
    static final String DFA20_eofS =
        "\5\uffff";
    static final String DFA20_minS =
        "\1\11\1\uffff\2\0\1\uffff";
    static final String DFA20_maxS =
        "\1\43\1\uffff\2\uffff\1\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\2\uffff\1\2";
    static final String DFA20_specialS =
        "\1\1\1\uffff\1\0\1\2\1\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\26\uffff\1\1\2\uffff\1\2",
            "",
            "\12\3\1\1\ufff5\3",
            "\12\3\1\1\ufff5\3",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "278:1: COMMENT : ({...}? => ( SPACE )* '#' (~ '\\n' )* ( '\\n' )+ |{...}? => '#' (~ '\\n' )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA20_2 >= '\u0000' && LA20_2 <= '\t')||(LA20_2 >= '\u000B' && LA20_2 <= '\uFFFF')) && ((( startPos == 0 )||( startPos > 0 )))) {s = 3;}

                        else if ( (LA20_2=='\n') && (( startPos == 0 ))) {s = 1;}

                        else s = 4;

                         
                        input.seek(index20_2);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA20_0=='\t'||LA20_0==' ') && (( startPos == 0 ))) {s = 1;}

                        else if ( (LA20_0=='#') && ((( startPos == 0 )||( startPos > 0 )))) {s = 2;}

                         
                        input.seek(index20_0);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA20_3=='\n') && (( startPos == 0 ))) {s = 1;}

                        else if ( ((LA20_3 >= '\u0000' && LA20_3 <= '\t')||(LA20_3 >= '\u000B' && LA20_3 <= '\uFFFF')) && ((( startPos == 0 )||( startPos > 0 )))) {s = 3;}

                        else s = 4;

                         
                        input.seek(index20_3);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA21_eotS =
        "\1\uffff\5\12\2\uffff\2\12\15\uffff\1\57\1\61\1\63\1\65\1\uffff"+
        "\1\67\6\uffff\2\70\1\uffff\3\12\1\77\4\12\15\uffff\2\12\1\107\1"+
        "\12\1\uffff\4\12\1\uffff\1\115\1\116\1\uffff\3\12\1\122\1\123\2"+
        "\uffff\1\122\1\124\1\125\4\uffff";
    static final String DFA21_eofS =
        "\126\uffff";
    static final String DFA21_minS =
        "\1\11\1\154\1\141\1\146\1\162\1\150\2\uffff\1\162\1\165\15\uffff"+
        "\4\75\1\uffff\1\76\6\uffff\2\11\1\uffff\1\151\1\156\1\154\1\60\2"+
        "\151\1\165\1\154\12\uffff\1\0\2\uffff\1\146\1\145\1\60\1\163\1\uffff"+
        "\1\156\1\154\1\145\1\154\1\uffff\2\60\1\uffff\1\145\1\164\1\145"+
        "\2\60\2\uffff\3\60\4\uffff";
    static final String DFA21_maxS =
        "\1\175\1\154\1\165\1\146\1\162\1\150\2\uffff\1\162\1\165\15\uffff"+
        "\4\75\1\uffff\1\76\6\uffff\2\43\1\uffff\1\163\1\156\1\154\1\172"+
        "\2\151\1\165\1\154\12\uffff\1\0\2\uffff\1\146\1\145\1\172\1\163"+
        "\1\uffff\1\156\1\154\1\145\1\154\1\uffff\2\172\1\uffff\1\145\1\164"+
        "\1\145\2\172\2\uffff\3\172\4\uffff";
    static final String DFA21_acceptS =
        "\6\uffff\1\7\1\10\2\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\26\1\27\4\uffff\1\36\1\uffff\1\40\1\41\1\42\1"+
        "\43\1\44\1\50\2\uffff\1\53\10\uffff\1\30\1\46\1\31\1\45\1\32\1\34"+
        "\1\33\1\35\1\47\1\37\1\uffff\1\52\1\53\4\uffff\1\4\4\uffff\1\51"+
        "\2\uffff\1\3\5\uffff\1\1\1\2\3\uffff\1\11\1\12\1\5\1\6";
    static final String DFA21_specialS =
        "\1\0\42\uffff\1\1\1\2\23\uffff\1\3\35\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\44\1\42\2\uffff\1\42\22\uffff\1\43\1\30\1\7\1\45\1\uffff"+
            "\1\37\1\40\1\7\1\20\1\21\1\35\1\33\1\17\1\34\1\16\1\36\12\6"+
            "\1\15\1\14\1\31\1\27\1\32\1\uffff\1\26\32\13\1\24\1\uffff\1"+
            "\25\1\uffff\1\12\1\uffff\4\12\1\1\1\2\2\12\1\3\4\12\1\11\1\12"+
            "\1\4\3\12\1\10\2\12\1\5\3\12\1\22\1\41\1\23",
            "\1\46",
            "\1\50\23\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\60",
            "\1\62",
            "\1\64",
            "",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\71\2\uffff\1\71\22\uffff\1\43\2\uffff\1\72",
            "\1\44\1\71\2\uffff\1\71\22\uffff\1\43\2\uffff\1\72",
            "",
            "\1\73\11\uffff\1\74",
            "\1\75",
            "\1\76",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\105",
            "\1\106",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ELIF | ELSE | FUN | IF | PRINT | WHILE | INT | STRING | BOOL | NULL | NAME | CONSTANT | SEMICOLON | COLON | DOT | COMMA | OPEN_PARENT | CLOSE_PARENT | OPEN_BRACKET | CLOSE_BRACKET | OPEN_S_BRACKET | CLOSE_S_BRACKET | AT | EQ | NE | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | ARROW | NEWLINE | WS | LEADING_WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA21_0=='e') ) {s = 1;}

                        else if ( (LA21_0=='f') ) {s = 2;}

                        else if ( (LA21_0=='i') ) {s = 3;}

                        else if ( (LA21_0=='p') ) {s = 4;}

                        else if ( (LA21_0=='w') ) {s = 5;}

                        else if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {s = 6;}

                        else if ( (LA21_0=='\"'||LA21_0=='\'') ) {s = 7;}

                        else if ( (LA21_0=='t') ) {s = 8;}

                        else if ( (LA21_0=='n') ) {s = 9;}

                        else if ( (LA21_0=='_'||(LA21_0 >= 'a' && LA21_0 <= 'd')||(LA21_0 >= 'g' && LA21_0 <= 'h')||(LA21_0 >= 'j' && LA21_0 <= 'm')||LA21_0=='o'||(LA21_0 >= 'q' && LA21_0 <= 's')||(LA21_0 >= 'u' && LA21_0 <= 'v')||(LA21_0 >= 'x' && LA21_0 <= 'z')) ) {s = 10;}

                        else if ( ((LA21_0 >= 'A' && LA21_0 <= 'Z')) ) {s = 11;}

                        else if ( (LA21_0==';') ) {s = 12;}

                        else if ( (LA21_0==':') ) {s = 13;}

                        else if ( (LA21_0=='.') ) {s = 14;}

                        else if ( (LA21_0==',') ) {s = 15;}

                        else if ( (LA21_0=='(') ) {s = 16;}

                        else if ( (LA21_0==')') ) {s = 17;}

                        else if ( (LA21_0=='{') ) {s = 18;}

                        else if ( (LA21_0=='}') ) {s = 19;}

                        else if ( (LA21_0=='[') ) {s = 20;}

                        else if ( (LA21_0==']') ) {s = 21;}

                        else if ( (LA21_0=='@') ) {s = 22;}

                        else if ( (LA21_0=='=') ) {s = 23;}

                        else if ( (LA21_0=='!') ) {s = 24;}

                        else if ( (LA21_0=='<') ) {s = 25;}

                        else if ( (LA21_0=='>') ) {s = 26;}

                        else if ( (LA21_0=='+') ) {s = 27;}

                        else if ( (LA21_0=='-') ) {s = 28;}

                        else if ( (LA21_0=='*') ) {s = 29;}

                        else if ( (LA21_0=='/') ) {s = 30;}

                        else if ( (LA21_0=='%') ) {s = 31;}

                        else if ( (LA21_0=='&') ) {s = 32;}

                        else if ( (LA21_0=='|') ) {s = 33;}

                        else if ( (LA21_0=='\n'||LA21_0=='\r') ) {s = 34;}

                        else if ( (LA21_0==' ') && ((( startPos == 0 )||( startPos > 0 )))) {s = 35;}

                        else if ( (LA21_0=='\t') && ((( startPos == 0 )||( startPos > 0 )))) {s = 36;}

                        else if ( (LA21_0=='#') && ((( startPos == 0 )||( startPos > 0 )))) {s = 37;}

                         
                        input.seek(index21_0);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA21_35 = input.LA(1);

                         
                        int index21_35 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA21_35==' ') && ((( startPos == 0 )||( startPos > 0 )))) {s = 35;}

                        else if ( (LA21_35=='\n'||LA21_35=='\r') && (( startPos == 0 ))) {s = 57;}

                        else if ( (LA21_35=='\t') && ((( startPos == 0 )||( startPos > 0 )))) {s = 36;}

                        else if ( (LA21_35=='#') && (( startPos == 0 ))) {s = 58;}

                        else s = 56;

                         
                        input.seek(index21_35);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA21_36 = input.LA(1);

                         
                        int index21_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA21_36==' ') && ((( startPos == 0 )||( startPos > 0 )))) {s = 35;}

                        else if ( (LA21_36=='\n'||LA21_36=='\r') && (( startPos == 0 ))) {s = 57;}

                        else if ( (LA21_36=='\t') && ((( startPos == 0 )||( startPos > 0 )))) {s = 36;}

                        else if ( (LA21_36=='#') && (( startPos == 0 ))) {s = 58;}

                        else s = 56;

                         
                        input.seek(index21_36);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA21_56 = input.LA(1);

                         
                        int index21_56 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( startPos > 0 )) ) {s = 68;}

                        else if ( (( startPos == 0 )) ) {s = 57;}

                         
                        input.seek(index21_56);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}