// $ANTLR 3.4 Atto.g 2012-08-29 21:51:41

package atto;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AttoLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__67=67;
    public static final int AND=4;
    public static final int ARRAY=5;
    public static final int ARROW=6;
    public static final int ASSIGN=7;
    public static final int AT=8;
    public static final int BLOCK=9;
    public static final int BOOL=10;
    public static final int CALL=11;
    public static final int CLASS=12;
    public static final int COLON=13;
    public static final int COMMA=14;
    public static final int COMMENT=15;
    public static final int COMPOSITE=16;
    public static final int DEDENT=17;
    public static final int DIGIT=18;
    public static final int DIV=19;
    public static final int DOT=20;
    public static final int ELIF=21;
    public static final int ELSE=22;
    public static final int EQ=23;
    public static final int EXTENDS=24;
    public static final int FIELD_ACCESS=25;
    public static final int GE=26;
    public static final int GT=27;
    public static final int ID_CHAR=28;
    public static final int IF=29;
    public static final int INDENT=30;
    public static final int INDEX=31;
    public static final int LBRACK=32;
    public static final int LCURLY=33;
    public static final int LE=34;
    public static final int LEADING_WS=35;
    public static final int LETTER=36;
    public static final int LOWER=37;
    public static final int LPAREN=38;
    public static final int LT=39;
    public static final int MINUS=40;
    public static final int MOD=41;
    public static final int MUL=42;
    public static final int NAME=43;
    public static final int NE=44;
    public static final int NEWLINE=45;
    public static final int NOT=46;
    public static final int NULL=47;
    public static final int NUMBER=48;
    public static final int OBJ=49;
    public static final int OR=50;
    public static final int PARAMS=51;
    public static final int PIPELINE=52;
    public static final int PLUS=53;
    public static final int PROP=54;
    public static final int RBRACK=55;
    public static final int RCURLY=56;
    public static final int RPAREN=57;
    public static final int SEMICOLON=58;
    public static final int SEND=59;
    public static final int SPACE=60;
    public static final int STMT=61;
    public static final int STRING=62;
    public static final int UNARY_MINUS=63;
    public static final int UPPER=64;
    public static final int WHILE=65;
    public static final int WS=66;

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

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:15:7: ( 'class' )
            // Atto.g:15:9: 'class'
            {
            match("class"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:16:6: ( 'elif' )
            // Atto.g:16:8: 'elif'
            {
            match("elif"); if (state.failed) return ;



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
            // Atto.g:17:6: ( 'else' )
            // Atto.g:17:8: 'else'
            {
            match("else"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:18:9: ( 'extends' )
            // Atto.g:18:11: 'extends'
            {
            match("extends"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:19:4: ( 'if' )
            // Atto.g:19:6: 'if'
            {
            match("if"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:20:7: ( 'while' )
            // Atto.g:20:9: 'while'
            {
            match("while"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:21:7: ( 'then' )
            // Atto.g:21:9: 'then'
            {
            match("then"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:214:9: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // Atto.g:214:11: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // Atto.g:214:11: ( DIGIT )+
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
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // Atto.g:214:18: ( '.' ( DIGIT )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Atto.g:214:19: '.' ( DIGIT )+
                    {
                    match('.'); if (state.failed) return ;

                    // Atto.g:214:23: ( DIGIT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
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
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:215:9: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Atto.g:215:11: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    // Atto.g:215:15: (~ ( '\\\\' | '\"' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Atto.g:215:36: '\\'' (~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); if (state.failed) return ;

                    // Atto.g:215:41: (~ ( '\\\\' | '\\'' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match('\''); if (state.failed) return ;

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
            // Atto.g:216:7: ( 'true' | 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='t') ) {
                alt7=1;
            }
            else if ( (LA7_0=='f') ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Atto.g:216:9: 'true'
                    {
                    match("true"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Atto.g:216:18: 'false'
                    {
                    match("false"); if (state.failed) return ;



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
            // Atto.g:217:7: ( 'null' )
            // Atto.g:217:9: 'null'
            {
            match("null"); if (state.failed) return ;



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
            // Atto.g:218:7: ( ( UPPER | LOWER | '_' ) ( ID_CHAR )* )
            // Atto.g:218:9: ( UPPER | LOWER | '_' ) ( ID_CHAR )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Atto.g:218:32: ( ID_CHAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Atto.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:220:11: ( ';' )
            // Atto.g:220:13: ';'
            {
            match(';'); if (state.failed) return ;

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
            // Atto.g:221:8: ( ':' )
            // Atto.g:221:10: ':'
            {
            match(':'); if (state.failed) return ;

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
            // Atto.g:222:6: ( '.' )
            // Atto.g:222:8: '.'
            {
            match('.'); if (state.failed) return ;

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
            // Atto.g:223:8: ( ',' )
            // Atto.g:223:10: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:224:9: ( '(' )
            // Atto.g:224:11: '('
            {
            match('('); if (state.failed) return ;

            if ( state.backtracking==0 ) { implicitLineJoiningLevel++; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:225:9: ( ')' )
            // Atto.g:225:11: ')'
            {
            match(')'); if (state.failed) return ;

            if ( state.backtracking==0 ) { implicitLineJoiningLevel--; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:226:9: ( '{' )
            // Atto.g:226:11: '{'
            {
            match('{'); if (state.failed) return ;

            if ( state.backtracking==0 ) { implicitLineJoiningLevel++; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:227:9: ( '}' )
            // Atto.g:227:11: '}'
            {
            match('}'); if (state.failed) return ;

            if ( state.backtracking==0 ) { implicitLineJoiningLevel--; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:228:9: ( '[' )
            // Atto.g:228:11: '['
            {
            match('['); if (state.failed) return ;

            if ( state.backtracking==0 ) { implicitLineJoiningLevel++; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:229:9: ( ']' )
            // Atto.g:229:11: ']'
            {
            match(']'); if (state.failed) return ;

            if ( state.backtracking==0 ) { implicitLineJoiningLevel--; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:230:5: ( '@' )
            // Atto.g:230:7: '@'
            {
            match('@'); if (state.failed) return ;

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
            // Atto.g:231:5: ( '==' )
            // Atto.g:231:7: '=='
            {
            match("=="); if (state.failed) return ;



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
            // Atto.g:232:5: ( '!=' )
            // Atto.g:232:7: '!='
            {
            match("!="); if (state.failed) return ;



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
            // Atto.g:233:5: ( '<=' )
            // Atto.g:233:7: '<='
            {
            match("<="); if (state.failed) return ;



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
            // Atto.g:234:5: ( '>=' )
            // Atto.g:234:7: '>='
            {
            match(">="); if (state.failed) return ;



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
            // Atto.g:235:5: ( '<' )
            // Atto.g:235:7: '<'
            {
            match('<'); if (state.failed) return ;

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
            // Atto.g:236:5: ( '>' )
            // Atto.g:236:7: '>'
            {
            match('>'); if (state.failed) return ;

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
            // Atto.g:237:7: ( '+' )
            // Atto.g:237:9: '+'
            {
            match('+'); if (state.failed) return ;

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
            // Atto.g:238:8: ( '-' )
            // Atto.g:238:10: '-'
            {
            match('-'); if (state.failed) return ;

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
            // Atto.g:239:6: ( '*' )
            // Atto.g:239:8: '*'
            {
            match('*'); if (state.failed) return ;

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
            // Atto.g:240:6: ( '/' )
            // Atto.g:240:8: '/'
            {
            match('/'); if (state.failed) return ;

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
            // Atto.g:241:6: ( '%' )
            // Atto.g:241:8: '%'
            {
            match('%'); if (state.failed) return ;

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
            // Atto.g:242:6: ( '&&' )
            // Atto.g:242:8: '&&'
            {
            match("&&"); if (state.failed) return ;



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
            // Atto.g:243:5: ( '||' )
            // Atto.g:243:7: '||'
            {
            match("||"); if (state.failed) return ;



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
            // Atto.g:244:6: ( '!' )
            // Atto.g:244:8: '!'
            {
            match('!'); if (state.failed) return ;

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
            // Atto.g:245:9: ( '=' )
            // Atto.g:245:11: '='
            {
            match('='); if (state.failed) return ;

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
            // Atto.g:246:8: ( '->' )
            // Atto.g:246:10: '->'
            {
            match("->"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "COMPOSITE"
    public final void mCOMPOSITE() throws RecognitionException {
        try {
            int _type = COMPOSITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:247:11: ( '>>' )
            // Atto.g:247:13: '>>'
            {
            match(">>"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPOSITE"

    // $ANTLR start "PIPELINE"
    public final void mPIPELINE() throws RecognitionException {
        try {
            int _type = PIPELINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:248:10: ( '|>' )
            // Atto.g:248:12: '|>'
            {
            match("|>"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIPELINE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:251:3: ( ( ( ( '\\r' )? '\\n' )+ ( ' ' | '\\t' )* ( DOT | PIPELINE ) )=> ( ( '\\r' )? '\\n' )+ ( ' ' | '\\t' )* | ( ( '\\r' )? '\\n' )+ )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='\n') ) {
                    int LA14_3 = input.LA(3);

                    if ( (synpred1_Atto()) ) {
                        alt14=1;
                    }
                    else if ( (true) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA14_0=='\n') ) {
                int LA14_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Atto.g:251:5: ( ( ( '\\r' )? '\\n' )+ ( ' ' | '\\t' )* ( DOT | PIPELINE ) )=> ( ( '\\r' )? '\\n' )+ ( ' ' | '\\t' )*
                    {
                    // Atto.g:251:54: ( ( '\\r' )? '\\n' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Atto.g:251:55: ( '\\r' )? '\\n'
                    	    {
                    	    // Atto.g:251:55: ( '\\r' )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0=='\r') ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // Atto.g:251:56: '\\r'
                    	            {
                    	            match('\r'); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    // Atto.g:251:70: ( ' ' | '\\t' )*
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
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { _channel=HIDDEN; }

                    }
                    break;
                case 2 :
                    // Atto.g:252:5: ( ( '\\r' )? '\\n' )+
                    {
                    // Atto.g:252:5: ( ( '\\r' )? '\\n' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Atto.g:252:6: ( '\\r' )? '\\n'
                    	    {
                    	    // Atto.g:252:6: ( '\\r' )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0=='\r') ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // Atto.g:252:7: '\\r'
                    	            {
                    	            match('\r'); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    if ( state.backtracking==0 ) { if (startPos == 0 || implicitLineJoiningLevel > 0) _channel=HIDDEN; }

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
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:254:5: ({...}? => ( SPACE )+ )
            // Atto.g:254:7: {...}? => ( SPACE )+
            {
            if ( !(( startPos > 0 )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "WS", " startPos > 0 ");
            }

            // Atto.g:254:27: ( SPACE )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\t'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Atto.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            if ( state.backtracking==0 ) { _channel = HIDDEN; }

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
            // Atto.g:257:3: ({...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* ) )
            // Atto.g:257:5: {...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            {
            if ( !(( startPos == 0 )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "LEADING_WS", " startPos == 0 ");
            }

            // Atto.g:258:4: ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==' ') ) {
                int LA20_1 = input.LA(2);

                if ( (( implicitLineJoiningLevel > 0 )) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA20_0=='\t') ) {
                int LA20_2 = input.LA(2);

                if ( (( implicitLineJoiningLevel > 0 )) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Atto.g:258:6: {...}? ( ' ' | '\\t' )+
                    {
                    if ( !(( implicitLineJoiningLevel > 0 )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "LEADING_WS", " implicitLineJoiningLevel > 0 ");
                    }

                    // Atto.g:258:40: ( ' ' | '\\t' )+
                    int cnt16=0;
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
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    if ( state.backtracking==0 ) { _channel = HIDDEN; }

                    }
                    break;
                case 2 :
                    // Atto.g:259:6: ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )*
                    {
                    // Atto.g:259:6: ( ' ' | '\\t' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==' ') ) {
                            alt17=1;
                        }
                        else if ( (LA17_0=='\t') ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Atto.g:259:7: ' '
                    	    {
                    	    match(' '); if (state.failed) return ;

                    	    if ( state.backtracking==0 ) { spaces++; }

                    	    }
                    	    break;
                    	case 2 :
                    	    // Atto.g:259:27: '\\t'
                    	    {
                    	    match('\t'); if (state.failed) return ;

                    	    if ( state.backtracking==0 ) { spaces += 8; spaces -= (spaces % 8); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    					// make a string of n spaces where n is column number - 1
                    					char[] indentation = new char[spaces];
                    					for (int i = 0; i < spaces; i++) {
                    						indentation[i] = ' ';
                    					}
                    					emit(new ClassicToken(LEADING_WS, new String(indentation)));
                    				}

                    // Atto.g:269:5: ( ( '\\r' )? '\\n' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Atto.g:269:7: ( '\\r' )? '\\n'
                    	    {
                    	    // Atto.g:269:7: ( '\\r' )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0=='\r') ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // Atto.g:269:8: '\\r'
                    	            {
                    	            match('\r'); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); if (state.failed) return ;

                    	    if ( state.backtracking==0 ) { 
                    	    						if (state.token != null) state.token.setChannel(HIDDEN); 
                    	    						else _channel = HIDDEN; 
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
            // Atto.g:279:3: ({...}? => ( SPACE )* '#' (~ '\\n' )* ( '\\n' )+ |{...}? => '#' (~ '\\n' )* )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // Atto.g:279:5: {...}? => ( SPACE )* '#' (~ '\\n' )* ( '\\n' )+
                    {
                    if ( !(( startPos == 0 )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "COMMENT", " startPos == 0 ");
                    }

                    // Atto.g:279:26: ( SPACE )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\t'||LA21_0==' ') ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    match('#'); if (state.failed) return ;

                    // Atto.g:279:37: (~ '\\n' )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\t')||(LA22_0 >= '\u000B' && LA22_0 <= '\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    // Atto.g:279:46: ( '\\n' )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\n') ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Atto.g:279:46: '\\n'
                    	    {
                    	    match('\n'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Atto.g:280:5: {...}? => '#' (~ '\\n' )*
                    {
                    if ( !(( startPos > 0 )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "COMMENT", " startPos > 0 ");
                    }

                    match('#'); if (state.failed) return ;

                    // Atto.g:280:29: (~ '\\n' )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0 >= '\u0000' && LA24_0 <= '\t')||(LA24_0 >= '\u000B' && LA24_0 <= '\uFFFF')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
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
            // Atto.g:283:17: ( LOWER | UPPER )
            // Atto.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
            // Atto.g:284:17: ( LETTER | DIGIT | '_' )
            // Atto.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
            // Atto.g:285:16: ( 'a' .. 'z' )
            // Atto.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
            // Atto.g:286:16: ( 'A' .. 'Z' )
            // Atto.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
            // Atto.g:287:16: ( '0' .. '9' )
            // Atto.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
            // Atto.g:288:16: ( ' ' | '\\t' )
            // Atto.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
        // Atto.g:1:8: ( CLASS | ELIF | ELSE | EXTENDS | IF | WHILE | T__67 | NUMBER | STRING | BOOL | NULL | NAME | SEMICOLON | COLON | DOT | COMMA | LPAREN | RPAREN | LCURLY | RCURLY | LBRACK | RBRACK | AT | EQ | NE | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | ARROW | COMPOSITE | PIPELINE | NEWLINE | WS | LEADING_WS | COMMENT )
        int alt26=45;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // Atto.g:1:10: CLASS
                {
                mCLASS(); if (state.failed) return ;


                }
                break;
            case 2 :
                // Atto.g:1:16: ELIF
                {
                mELIF(); if (state.failed) return ;


                }
                break;
            case 3 :
                // Atto.g:1:21: ELSE
                {
                mELSE(); if (state.failed) return ;


                }
                break;
            case 4 :
                // Atto.g:1:26: EXTENDS
                {
                mEXTENDS(); if (state.failed) return ;


                }
                break;
            case 5 :
                // Atto.g:1:34: IF
                {
                mIF(); if (state.failed) return ;


                }
                break;
            case 6 :
                // Atto.g:1:37: WHILE
                {
                mWHILE(); if (state.failed) return ;


                }
                break;
            case 7 :
                // Atto.g:1:43: T__67
                {
                mT__67(); if (state.failed) return ;


                }
                break;
            case 8 :
                // Atto.g:1:49: NUMBER
                {
                mNUMBER(); if (state.failed) return ;


                }
                break;
            case 9 :
                // Atto.g:1:56: STRING
                {
                mSTRING(); if (state.failed) return ;


                }
                break;
            case 10 :
                // Atto.g:1:63: BOOL
                {
                mBOOL(); if (state.failed) return ;


                }
                break;
            case 11 :
                // Atto.g:1:68: NULL
                {
                mNULL(); if (state.failed) return ;


                }
                break;
            case 12 :
                // Atto.g:1:73: NAME
                {
                mNAME(); if (state.failed) return ;


                }
                break;
            case 13 :
                // Atto.g:1:78: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;


                }
                break;
            case 14 :
                // Atto.g:1:88: COLON
                {
                mCOLON(); if (state.failed) return ;


                }
                break;
            case 15 :
                // Atto.g:1:94: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 16 :
                // Atto.g:1:98: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 17 :
                // Atto.g:1:104: LPAREN
                {
                mLPAREN(); if (state.failed) return ;


                }
                break;
            case 18 :
                // Atto.g:1:111: RPAREN
                {
                mRPAREN(); if (state.failed) return ;


                }
                break;
            case 19 :
                // Atto.g:1:118: LCURLY
                {
                mLCURLY(); if (state.failed) return ;


                }
                break;
            case 20 :
                // Atto.g:1:125: RCURLY
                {
                mRCURLY(); if (state.failed) return ;


                }
                break;
            case 21 :
                // Atto.g:1:132: LBRACK
                {
                mLBRACK(); if (state.failed) return ;


                }
                break;
            case 22 :
                // Atto.g:1:139: RBRACK
                {
                mRBRACK(); if (state.failed) return ;


                }
                break;
            case 23 :
                // Atto.g:1:146: AT
                {
                mAT(); if (state.failed) return ;


                }
                break;
            case 24 :
                // Atto.g:1:149: EQ
                {
                mEQ(); if (state.failed) return ;


                }
                break;
            case 25 :
                // Atto.g:1:152: NE
                {
                mNE(); if (state.failed) return ;


                }
                break;
            case 26 :
                // Atto.g:1:155: LE
                {
                mLE(); if (state.failed) return ;


                }
                break;
            case 27 :
                // Atto.g:1:158: GE
                {
                mGE(); if (state.failed) return ;


                }
                break;
            case 28 :
                // Atto.g:1:161: LT
                {
                mLT(); if (state.failed) return ;


                }
                break;
            case 29 :
                // Atto.g:1:164: GT
                {
                mGT(); if (state.failed) return ;


                }
                break;
            case 30 :
                // Atto.g:1:167: PLUS
                {
                mPLUS(); if (state.failed) return ;


                }
                break;
            case 31 :
                // Atto.g:1:172: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 32 :
                // Atto.g:1:178: MUL
                {
                mMUL(); if (state.failed) return ;


                }
                break;
            case 33 :
                // Atto.g:1:182: DIV
                {
                mDIV(); if (state.failed) return ;


                }
                break;
            case 34 :
                // Atto.g:1:186: MOD
                {
                mMOD(); if (state.failed) return ;


                }
                break;
            case 35 :
                // Atto.g:1:190: AND
                {
                mAND(); if (state.failed) return ;


                }
                break;
            case 36 :
                // Atto.g:1:194: OR
                {
                mOR(); if (state.failed) return ;


                }
                break;
            case 37 :
                // Atto.g:1:197: NOT
                {
                mNOT(); if (state.failed) return ;


                }
                break;
            case 38 :
                // Atto.g:1:201: ASSIGN
                {
                mASSIGN(); if (state.failed) return ;


                }
                break;
            case 39 :
                // Atto.g:1:208: ARROW
                {
                mARROW(); if (state.failed) return ;


                }
                break;
            case 40 :
                // Atto.g:1:214: COMPOSITE
                {
                mCOMPOSITE(); if (state.failed) return ;


                }
                break;
            case 41 :
                // Atto.g:1:224: PIPELINE
                {
                mPIPELINE(); if (state.failed) return ;


                }
                break;
            case 42 :
                // Atto.g:1:233: NEWLINE
                {
                mNEWLINE(); if (state.failed) return ;


                }
                break;
            case 43 :
                // Atto.g:1:241: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 44 :
                // Atto.g:1:244: LEADING_WS
                {
                mLEADING_WS(); if (state.failed) return ;


                }
                break;
            case 45 :
                // Atto.g:1:255: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_Atto
    public final void synpred1_Atto_fragment() throws RecognitionException {
        // Atto.g:251:5: ( ( ( '\\r' )? '\\n' )+ ( ' ' | '\\t' )* ( DOT | PIPELINE ) )
        // Atto.g:251:7: ( ( '\\r' )? '\\n' )+ ( ' ' | '\\t' )* ( DOT | PIPELINE )
        {
        // Atto.g:251:7: ( ( '\\r' )? '\\n' )+
        int cnt28=0;
        loop28:
        do {
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                alt28=1;
            }


            switch (alt28) {
        	case 1 :
        	    // Atto.g:251:8: ( '\\r' )? '\\n'
        	    {
        	    // Atto.g:251:8: ( '\\r' )?
        	    int alt27=2;
        	    int LA27_0 = input.LA(1);

        	    if ( (LA27_0=='\r') ) {
        	        alt27=1;
        	    }
        	    switch (alt27) {
        	        case 1 :
        	            // Atto.g:251:9: '\\r'
        	            {
        	            match('\r'); if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    match('\n'); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt28 >= 1 ) break loop28;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(28, input);
                    throw eee;
            }
            cnt28++;
        } while (true);


        // Atto.g:251:23: ( ' ' | '\\t' )*
        loop29:
        do {
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\t'||LA29_0==' ') ) {
                alt29=1;
            }


            switch (alt29) {
        	case 1 :
        	    // Atto.g:
        	    {
        	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
        	        input.consume();
        	        state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        recover(mse);
        	        throw mse;
        	    }


        	    }
        	    break;

        	default :
        	    break loop29;
            }
        } while (true);


        // Atto.g:251:35: ( DOT | PIPELINE )
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0=='.') ) {
            alt30=1;
        }
        else if ( (LA30_0=='|') ) {
            alt30=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 30, 0, input);

            throw nvae;

        }
        switch (alt30) {
            case 1 :
                // Atto.g:251:36: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 2 :
                // Atto.g:251:40: PIPELINE
                {
                mPIPELINE(); if (state.failed) return ;


                }
                break;

        }


        }

    }
    // $ANTLR end synpred1_Atto

    public final boolean synpred1_Atto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Atto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA25_eotS =
        "\2\uffff\2\4\1\uffff";
    static final String DFA25_eofS =
        "\5\uffff";
    static final String DFA25_minS =
        "\1\11\1\uffff\2\0\1\uffff";
    static final String DFA25_maxS =
        "\1\43\1\uffff\2\uffff\1\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\2\uffff\1\2";
    static final String DFA25_specialS =
        "\1\0\1\uffff\1\2\1\1\1\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\26\uffff\1\1\2\uffff\1\2",
            "",
            "\12\3\1\1\ufff5\3",
            "\12\3\1\1\ufff5\3",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "277:1: COMMENT : ({...}? => ( SPACE )* '#' (~ '\\n' )* ( '\\n' )+ |{...}? => '#' (~ '\\n' )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA25_0=='\t'||LA25_0==' ') && (( startPos == 0 ))) {s = 1;}

                        else if ( (LA25_0=='#') && ((( startPos == 0 )||( startPos > 0 )))) {s = 2;}

                         
                        input.seek(index25_0);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA25_3=='\n') && (( startPos == 0 ))) {s = 1;}

                        else if ( ((LA25_3 >= '\u0000' && LA25_3 <= '\t')||(LA25_3 >= '\u000B' && LA25_3 <= '\uFFFF')) && ((( startPos == 0 )||( startPos > 0 )))) {s = 3;}

                        else s = 4;

                         
                        input.seek(index25_3);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA25_2 >= '\u0000' && LA25_2 <= '\t')||(LA25_2 >= '\u000B' && LA25_2 <= '\uFFFF')) && ((( startPos == 0 )||( startPos > 0 )))) {s = 3;}

                        else if ( (LA25_2=='\n') && (( startPos == 0 ))) {s = 1;}

                        else s = 4;

                         
                        input.seek(index25_2);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA26_eotS =
        "\1\uffff\5\12\2\uffff\2\12\14\uffff\1\57\1\61\1\63\1\66\1\uffff"+
        "\1\70\6\uffff\2\73\1\uffff\3\12\1\102\5\12\20\uffff\4\12\1\uffff"+
        "\5\12\1\uffff\1\12\1\123\1\124\2\12\1\127\1\130\1\12\1\132\1\133"+
        "\2\uffff\1\12\1\135\2\uffff\1\130\2\uffff\1\12\1\uffff\1\137\1\uffff";
    static final String DFA26_eofS =
        "\140\uffff";
    static final String DFA26_minS =
        "\1\11\2\154\1\146\2\150\2\uffff\1\141\1\165\14\uffff\4\75\1\uffff"+
        "\1\76\4\uffff\1\76\1\uffff\2\11\1\uffff\1\141\1\151\1\164\1\60\1"+
        "\151\1\145\1\165\2\154\15\uffff\1\0\2\uffff\1\163\1\146\2\145\1"+
        "\uffff\1\154\1\156\1\145\1\163\1\154\1\uffff\1\163\2\60\1\156\1"+
        "\145\2\60\1\145\2\60\2\uffff\1\144\1\60\2\uffff\1\60\2\uffff\1\163"+
        "\1\uffff\1\60\1\uffff";
    static final String DFA26_maxS =
        "\1\175\1\154\1\170\1\146\1\150\1\162\2\uffff\1\141\1\165\14\uffff"+
        "\3\75\1\76\1\uffff\1\76\4\uffff\1\174\1\uffff\2\43\1\uffff\1\141"+
        "\1\163\1\164\1\172\1\151\1\145\1\165\2\154\15\uffff\1\0\2\uffff"+
        "\1\163\1\146\2\145\1\uffff\1\154\1\156\1\145\1\163\1\154\1\uffff"+
        "\1\163\2\172\1\156\1\145\2\172\1\145\2\172\2\uffff\1\144\1\172\2"+
        "\uffff\1\172\2\uffff\1\163\1\uffff\1\172\1\uffff";
    static final String DFA26_acceptS =
        "\6\uffff\1\10\1\11\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1"+
        "\23\1\24\1\25\1\26\1\27\4\uffff\1\36\1\uffff\1\40\1\41\1\42\1\43"+
        "\1\uffff\1\52\2\uffff\1\55\11\uffff\1\30\1\46\1\31\1\45\1\32\1\34"+
        "\1\33\1\50\1\35\1\47\1\37\1\44\1\51\1\uffff\1\54\1\55\4\uffff\1"+
        "\5\5\uffff\1\53\12\uffff\1\2\1\3\2\uffff\1\7\1\12\1\uffff\1\13\1"+
        "\1\1\uffff\1\6\1\uffff\1\4";
    static final String DFA26_specialS =
        "\1\3\41\uffff\1\0\1\1\27\uffff\1\2\44\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\43\1\41\2\uffff\1\41\22\uffff\1\42\1\27\1\7\1\44\1\uffff"+
            "\1\36\1\37\1\7\1\17\1\20\1\34\1\32\1\16\1\33\1\15\1\35\12\6"+
            "\1\14\1\13\1\30\1\26\1\31\1\uffff\1\25\32\12\1\23\1\uffff\1"+
            "\24\1\uffff\1\12\1\uffff\2\12\1\1\1\12\1\2\1\10\2\12\1\3\4\12"+
            "\1\11\5\12\1\5\2\12\1\4\3\12\1\21\1\40\1\22",
            "\1\45",
            "\1\46\13\uffff\1\47",
            "\1\50",
            "\1\51",
            "\1\52\11\uffff\1\53",
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
            "\1\56",
            "\1\60",
            "\1\62",
            "\1\64\1\65",
            "",
            "\1\67",
            "",
            "",
            "",
            "",
            "\1\72\75\uffff\1\71",
            "",
            "\1\43\1\74\2\uffff\1\74\22\uffff\1\42\2\uffff\1\75",
            "\1\43\1\74\2\uffff\1\74\22\uffff\1\42\2\uffff\1\75",
            "",
            "\1\76",
            "\1\77\11\uffff\1\100",
            "\1\101",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
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
            "\1\uffff",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\125",
            "\1\126",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\131",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            "\1\134",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            "\1\136",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CLASS | ELIF | ELSE | EXTENDS | IF | WHILE | T__67 | NUMBER | STRING | BOOL | NULL | NAME | SEMICOLON | COLON | DOT | COMMA | LPAREN | RPAREN | LCURLY | RCURLY | LBRACK | RBRACK | AT | EQ | NE | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | ARROW | COMPOSITE | PIPELINE | NEWLINE | WS | LEADING_WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_34 = input.LA(1);

                         
                        int index26_34 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA26_34==' ') && ((( startPos == 0 )||( startPos > 0 )))) {s = 34;}

                        else if ( (LA26_34=='\n'||LA26_34=='\r') && (( startPos == 0 ))) {s = 60;}

                        else if ( (LA26_34=='\t') && ((( startPos == 0 )||( startPos > 0 )))) {s = 35;}

                        else if ( (LA26_34=='#') && (( startPos == 0 ))) {s = 61;}

                        else s = 59;

                         
                        input.seek(index26_34);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA26_35 = input.LA(1);

                         
                        int index26_35 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA26_35==' ') && ((( startPos == 0 )||( startPos > 0 )))) {s = 34;}

                        else if ( (LA26_35=='\n'||LA26_35=='\r') && (( startPos == 0 ))) {s = 60;}

                        else if ( (LA26_35=='\t') && ((( startPos == 0 )||( startPos > 0 )))) {s = 35;}

                        else if ( (LA26_35=='#') && (( startPos == 0 ))) {s = 61;}

                        else s = 59;

                         
                        input.seek(index26_35);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA26_59 = input.LA(1);

                         
                        int index26_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( startPos > 0 )) ) {s = 72;}

                        else if ( (( startPos == 0 )) ) {s = 60;}

                         
                        input.seek(index26_59);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA26_0=='c') ) {s = 1;}

                        else if ( (LA26_0=='e') ) {s = 2;}

                        else if ( (LA26_0=='i') ) {s = 3;}

                        else if ( (LA26_0=='w') ) {s = 4;}

                        else if ( (LA26_0=='t') ) {s = 5;}

                        else if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {s = 6;}

                        else if ( (LA26_0=='\"'||LA26_0=='\'') ) {s = 7;}

                        else if ( (LA26_0=='f') ) {s = 8;}

                        else if ( (LA26_0=='n') ) {s = 9;}

                        else if ( ((LA26_0 >= 'A' && LA26_0 <= 'Z')||LA26_0=='_'||(LA26_0 >= 'a' && LA26_0 <= 'b')||LA26_0=='d'||(LA26_0 >= 'g' && LA26_0 <= 'h')||(LA26_0 >= 'j' && LA26_0 <= 'm')||(LA26_0 >= 'o' && LA26_0 <= 's')||(LA26_0 >= 'u' && LA26_0 <= 'v')||(LA26_0 >= 'x' && LA26_0 <= 'z')) ) {s = 10;}

                        else if ( (LA26_0==';') ) {s = 11;}

                        else if ( (LA26_0==':') ) {s = 12;}

                        else if ( (LA26_0=='.') ) {s = 13;}

                        else if ( (LA26_0==',') ) {s = 14;}

                        else if ( (LA26_0=='(') ) {s = 15;}

                        else if ( (LA26_0==')') ) {s = 16;}

                        else if ( (LA26_0=='{') ) {s = 17;}

                        else if ( (LA26_0=='}') ) {s = 18;}

                        else if ( (LA26_0=='[') ) {s = 19;}

                        else if ( (LA26_0==']') ) {s = 20;}

                        else if ( (LA26_0=='@') ) {s = 21;}

                        else if ( (LA26_0=='=') ) {s = 22;}

                        else if ( (LA26_0=='!') ) {s = 23;}

                        else if ( (LA26_0=='<') ) {s = 24;}

                        else if ( (LA26_0=='>') ) {s = 25;}

                        else if ( (LA26_0=='+') ) {s = 26;}

                        else if ( (LA26_0=='-') ) {s = 27;}

                        else if ( (LA26_0=='*') ) {s = 28;}

                        else if ( (LA26_0=='/') ) {s = 29;}

                        else if ( (LA26_0=='%') ) {s = 30;}

                        else if ( (LA26_0=='&') ) {s = 31;}

                        else if ( (LA26_0=='|') ) {s = 32;}

                        else if ( (LA26_0=='\n'||LA26_0=='\r') ) {s = 33;}

                        else if ( (LA26_0==' ') && ((( startPos == 0 )||( startPos > 0 )))) {s = 34;}

                        else if ( (LA26_0=='\t') && ((( startPos == 0 )||( startPos > 0 )))) {s = 35;}

                        else if ( (LA26_0=='#') && ((( startPos == 0 )||( startPos > 0 )))) {s = 36;}

                         
                        input.seek(index26_0);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}