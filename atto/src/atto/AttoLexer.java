// $ANTLR 3.4 Atto.g 2012-09-02 16:50:28

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
    public static final int AND=4;
    public static final int ARGS=5;
    public static final int ARRAY=6;
    public static final int ARROW=7;
    public static final int ASSIGN=8;
    public static final int AT=9;
    public static final int BLOCK=10;
    public static final int BOOLEAN=11;
    public static final int CALL=12;
    public static final int CLASS=13;
    public static final int COLON=14;
    public static final int COMMA=15;
    public static final int COMMENT=16;
    public static final int COMPOSITE=17;
    public static final int DEDENT=18;
    public static final int DIGIT=19;
    public static final int DIV=20;
    public static final int DOT=21;
    public static final int ELIF=22;
    public static final int ELSE=23;
    public static final int END=24;
    public static final int EQ=25;
    public static final int EXTENDS=26;
    public static final int FIELD_ACCESS=27;
    public static final int FUN=28;
    public static final int GE=29;
    public static final int GT=30;
    public static final int ID_CHAR=31;
    public static final int IF=32;
    public static final int INDENT=33;
    public static final int INDEX=34;
    public static final int LBRACK=35;
    public static final int LCURLY=36;
    public static final int LE=37;
    public static final int LETTER=38;
    public static final int LOWER=39;
    public static final int LPAREN=40;
    public static final int LT=41;
    public static final int MINUS=42;
    public static final int MOD=43;
    public static final int MUL=44;
    public static final int NAME=45;
    public static final int NE=46;
    public static final int NEWLINE=47;
    public static final int NOT=48;
    public static final int NULL=49;
    public static final int NUMBER=50;
    public static final int OBJ=51;
    public static final int OR=52;
    public static final int PARAMS=53;
    public static final int PARENT_CLASS=54;
    public static final int PIPELINE=55;
    public static final int PLUS=56;
    public static final int RBRACK=57;
    public static final int RCURLY=58;
    public static final int REVERSE_PIPELINE=59;
    public static final int RPAREN=60;
    public static final int SEMICOLON=61;
    public static final int SEND=62;
    public static final int SPACE=63;
    public static final int STMT=64;
    public static final int STRING=65;
    public static final int TEXT=66;
    public static final int THEN=67;
    public static final int UNARY_MINUS=68;
    public static final int UPPER=69;
    public static final int VARDEF=70;
    public static final int WHILE=71;
    public static final int WS=72;

    	int startPos;
    	boolean memberMode;
    	
    	@Override
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

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:175:5: ({...}? => 'if' )
            // Atto.g:175:7: {...}? => 'if'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "IF", " !memberMode ");
            }

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

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:176:7: ({...}? => 'elif' )
            // Atto.g:176:9: {...}? => 'elif'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "ELIF", " !memberMode ");
            }

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
            // Atto.g:177:7: ({...}? => 'else' )
            // Atto.g:177:9: {...}? => 'else'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "ELSE", " !memberMode ");
            }

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

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:178:8: ({...}? => 'while' )
            // Atto.g:178:10: {...}? => 'while'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "WHILE", " !memberMode ");
            }

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

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:179:7: ({...}? => 'then' )
            // Atto.g:179:9: {...}? => 'then'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "THEN", " !memberMode ");
            }

            match("then"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:180:6: ({...}? => 'end' )
            // Atto.g:180:8: {...}? => 'end'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "END", " !memberMode ");
            }

            match("end"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:181:8: ({...}? => 'class' )
            // Atto.g:181:10: {...}? => 'class'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "CLASS", " !memberMode ");
            }

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

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:182:10: ({...}? => 'extends' )
            // Atto.g:182:12: {...}? => 'extends'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "EXTENDS", " !memberMode ");
            }

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

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:183:10: ({...}? => 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') && (( !memberMode ))) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Atto.g:183:12: {...}? => 'true'
                    {
                    if ( !(( !memberMode )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "BOOLEAN", " !memberMode ");
                    }

                    match("true"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Atto.g:183:40: 'false'
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
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:184:7: ({...}? => 'null' )
            // Atto.g:184:9: {...}? => 'null'
            {
            if ( !(( !memberMode )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "NULL", " !memberMode ");
            }

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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:186:9: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // Atto.g:186:11: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // Atto.g:186:11: ( DIGIT )+
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


            // Atto.g:186:18: ( '.' ( DIGIT )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Atto.g:186:19: '.' ( DIGIT )+
                    {
                    match('.'); if (state.failed) return ;

                    // Atto.g:186:23: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
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
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
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
            // Atto.g:187:9: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
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
                    // Atto.g:187:11: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    // Atto.g:187:15: (~ ( '\\\\' | '\"' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
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
                    	    break loop5;
                        }
                    } while (true);


                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Atto.g:187:36: '\\'' (~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); if (state.failed) return ;

                    // Atto.g:187:41: (~ ( '\\\\' | '\\'' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
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
                    	    break loop6;
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

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:188:7: ( ( UPPER | LOWER | '_' ) ( ID_CHAR )* )
            // Atto.g:188:9: ( UPPER | LOWER | '_' ) ( ID_CHAR )*
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


            // Atto.g:188:32: ( ID_CHAR )*
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


            if ( state.backtracking==0 ) { memberMode = false; }

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
            // Atto.g:190:11: ( ';' )
            // Atto.g:190:13: ';'
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
            // Atto.g:191:8: ( ':' )
            // Atto.g:191:10: ':'
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
            // Atto.g:192:6: ( '.' )
            // Atto.g:192:8: '.'
            {
            match('.'); if (state.failed) return ;

            if ( state.backtracking==0 ) { memberMode = true; }

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
            // Atto.g:193:8: ( ',' )
            // Atto.g:193:10: ','
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
            // Atto.g:194:9: ( '(' )
            // Atto.g:194:11: '('
            {
            match('('); if (state.failed) return ;

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
            // Atto.g:195:9: ( ')' )
            // Atto.g:195:11: ')'
            {
            match(')'); if (state.failed) return ;

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
            // Atto.g:196:9: ( '{' )
            // Atto.g:196:11: '{'
            {
            match('{'); if (state.failed) return ;

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
            // Atto.g:197:9: ( '}' )
            // Atto.g:197:11: '}'
            {
            match('}'); if (state.failed) return ;

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
            // Atto.g:198:9: ( '[' )
            // Atto.g:198:11: '['
            {
            match('['); if (state.failed) return ;

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
            // Atto.g:199:9: ( ']' )
            // Atto.g:199:11: ']'
            {
            match(']'); if (state.failed) return ;

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
            // Atto.g:200:5: ( '@' )
            // Atto.g:200:7: '@'
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
            // Atto.g:201:5: ( '==' )
            // Atto.g:201:7: '=='
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
            // Atto.g:202:5: ( '!=' )
            // Atto.g:202:7: '!='
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
            // Atto.g:203:5: ( '<=' )
            // Atto.g:203:7: '<='
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
            // Atto.g:204:5: ( '>=' )
            // Atto.g:204:7: '>='
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
            // Atto.g:205:5: ( '<' )
            // Atto.g:205:7: '<'
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
            // Atto.g:206:5: ( '>' )
            // Atto.g:206:7: '>'
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
            // Atto.g:207:7: ( '+' )
            // Atto.g:207:9: '+'
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
            // Atto.g:208:8: ( '-' )
            // Atto.g:208:10: '-'
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
            // Atto.g:209:6: ( '*' )
            // Atto.g:209:8: '*'
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
            // Atto.g:210:6: ( '/' )
            // Atto.g:210:8: '/'
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
            // Atto.g:211:6: ( '%' )
            // Atto.g:211:8: '%'
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
            // Atto.g:212:6: ( '&&' )
            // Atto.g:212:8: '&&'
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
            // Atto.g:213:5: ( '||' )
            // Atto.g:213:7: '||'
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
            // Atto.g:214:6: ( '!' )
            // Atto.g:214:8: '!'
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
            // Atto.g:215:9: ( '=' )
            // Atto.g:215:11: '='
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
            // Atto.g:216:8: ( '->' )
            // Atto.g:216:10: '->'
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
            // Atto.g:217:11: ( '>>' )
            // Atto.g:217:13: '>>'
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
            // Atto.g:218:10: ( '|>' )
            // Atto.g:218:12: '|>'
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

    // $ANTLR start "REVERSE_PIPELINE"
    public final void mREVERSE_PIPELINE() throws RecognitionException {
        try {
            int _type = REVERSE_PIPELINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:219:17: ( '<|' )
            // Atto.g:219:19: '<|'
            {
            match("<|"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REVERSE_PIPELINE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:221:10: ({...}? => '#' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )* | '#' (~ ( '\\r' | '\\n' ) )* )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='#') ) {
                int LA13_1 = input.LA(2);

                if ( ((startPos==0)) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // Atto.g:221:12: {...}? => '#' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )*
                    {
                    if ( !((startPos==0)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "COMMENT", "startPos==0");
                    }

                    match('#'); if (state.failed) return ;

                    // Atto.g:221:34: (~ ( '\\r' | '\\n' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
                    	    break loop9;
                        }
                    } while (true);


                    // Atto.g:221:48: ( ( '\\r' )? '\\n' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Atto.g:221:49: ( '\\r' )? '\\n'
                    	    {
                    	    // Atto.g:221:49: ( '\\r' )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0=='\r') ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // Atto.g:221:50: '\\r'
                    	            {
                    	            match('\r'); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { _channel = HIDDEN; }

                    }
                    break;
                case 2 :
                    // Atto.g:222:5: '#' (~ ( '\\r' | '\\n' ) )*
                    {
                    match('#'); if (state.failed) return ;

                    // Atto.g:222:10: (~ ( '\\r' | '\\n' ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Atto.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
                    	    break loop12;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { _channel = HIDDEN; }

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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Atto.g:225:3: ( ( ( ( '\\r' )? '\\n' )+ ( SPACE )* ( DOT | PIPELINE | REVERSE_PIPELINE ) )=> ( ( '\\r' )? '\\n' )+ | ( ( '\\r' )? '\\n' )+ )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\r') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='\n') ) {
                    int LA18_3 = input.LA(3);

                    if ( (synpred1_Atto()) ) {
                        alt18=1;
                    }
                    else if ( (true) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA18_0=='\n') ) {
                int LA18_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Atto.g:225:5: ( ( ( '\\r' )? '\\n' )+ ( SPACE )* ( DOT | PIPELINE | REVERSE_PIPELINE ) )=> ( ( '\\r' )? '\\n' )+
                    {
                    // Atto.g:225:66: ( ( '\\r' )? '\\n' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Atto.g:225:67: ( '\\r' )? '\\n'
                    	    {
                    	    // Atto.g:225:67: ( '\\r' )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0=='\r') ) {
                    	        alt14=1;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // Atto.g:225:68: '\\r'
                    	            {
                    	            match('\r'); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); if (state.failed) return ;

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
                    break;
                case 2 :
                    // Atto.g:226:5: ( ( '\\r' )? '\\n' )+
                    {
                    // Atto.g:226:5: ( ( '\\r' )? '\\n' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Atto.g:226:6: ( '\\r' )? '\\n'
                    	    {
                    	    // Atto.g:226:6: ( '\\r' )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0=='\r') ) {
                    	        alt16=1;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // Atto.g:226:7: '\\r'
                    	            {
                    	            match('\r'); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); if (state.failed) return ;

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
            // Atto.g:228:5: ( ( SPACE )+ )
            // Atto.g:228:7: ( SPACE )+
            {
            // Atto.g:228:7: ( SPACE )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\t'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // Atto.g:231:17: ( LOWER | UPPER )
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
            // Atto.g:232:17: ( LETTER | DIGIT | '_' )
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
            // Atto.g:233:16: ( 'a' .. 'z' )
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
            // Atto.g:234:16: ( 'A' .. 'Z' )
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
            // Atto.g:235:16: ( '0' .. '9' )
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
            // Atto.g:236:16: ( ' ' | '\\t' )
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
        // Atto.g:1:8: ( IF | ELIF | ELSE | WHILE | THEN | END | CLASS | EXTENDS | BOOLEAN | NULL | NUMBER | STRING | NAME | SEMICOLON | COLON | DOT | COMMA | LPAREN | RPAREN | LCURLY | RCURLY | LBRACK | RBRACK | AT | EQ | NE | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | ARROW | COMPOSITE | PIPELINE | REVERSE_PIPELINE | COMMENT | NEWLINE | WS )
        int alt20=46;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // Atto.g:1:10: IF
                {
                mIF(); if (state.failed) return ;


                }
                break;
            case 2 :
                // Atto.g:1:13: ELIF
                {
                mELIF(); if (state.failed) return ;


                }
                break;
            case 3 :
                // Atto.g:1:18: ELSE
                {
                mELSE(); if (state.failed) return ;


                }
                break;
            case 4 :
                // Atto.g:1:23: WHILE
                {
                mWHILE(); if (state.failed) return ;


                }
                break;
            case 5 :
                // Atto.g:1:29: THEN
                {
                mTHEN(); if (state.failed) return ;


                }
                break;
            case 6 :
                // Atto.g:1:34: END
                {
                mEND(); if (state.failed) return ;


                }
                break;
            case 7 :
                // Atto.g:1:38: CLASS
                {
                mCLASS(); if (state.failed) return ;


                }
                break;
            case 8 :
                // Atto.g:1:44: EXTENDS
                {
                mEXTENDS(); if (state.failed) return ;


                }
                break;
            case 9 :
                // Atto.g:1:52: BOOLEAN
                {
                mBOOLEAN(); if (state.failed) return ;


                }
                break;
            case 10 :
                // Atto.g:1:60: NULL
                {
                mNULL(); if (state.failed) return ;


                }
                break;
            case 11 :
                // Atto.g:1:65: NUMBER
                {
                mNUMBER(); if (state.failed) return ;


                }
                break;
            case 12 :
                // Atto.g:1:72: STRING
                {
                mSTRING(); if (state.failed) return ;


                }
                break;
            case 13 :
                // Atto.g:1:79: NAME
                {
                mNAME(); if (state.failed) return ;


                }
                break;
            case 14 :
                // Atto.g:1:84: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;


                }
                break;
            case 15 :
                // Atto.g:1:94: COLON
                {
                mCOLON(); if (state.failed) return ;


                }
                break;
            case 16 :
                // Atto.g:1:100: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 17 :
                // Atto.g:1:104: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 18 :
                // Atto.g:1:110: LPAREN
                {
                mLPAREN(); if (state.failed) return ;


                }
                break;
            case 19 :
                // Atto.g:1:117: RPAREN
                {
                mRPAREN(); if (state.failed) return ;


                }
                break;
            case 20 :
                // Atto.g:1:124: LCURLY
                {
                mLCURLY(); if (state.failed) return ;


                }
                break;
            case 21 :
                // Atto.g:1:131: RCURLY
                {
                mRCURLY(); if (state.failed) return ;


                }
                break;
            case 22 :
                // Atto.g:1:138: LBRACK
                {
                mLBRACK(); if (state.failed) return ;


                }
                break;
            case 23 :
                // Atto.g:1:145: RBRACK
                {
                mRBRACK(); if (state.failed) return ;


                }
                break;
            case 24 :
                // Atto.g:1:152: AT
                {
                mAT(); if (state.failed) return ;


                }
                break;
            case 25 :
                // Atto.g:1:155: EQ
                {
                mEQ(); if (state.failed) return ;


                }
                break;
            case 26 :
                // Atto.g:1:158: NE
                {
                mNE(); if (state.failed) return ;


                }
                break;
            case 27 :
                // Atto.g:1:161: LE
                {
                mLE(); if (state.failed) return ;


                }
                break;
            case 28 :
                // Atto.g:1:164: GE
                {
                mGE(); if (state.failed) return ;


                }
                break;
            case 29 :
                // Atto.g:1:167: LT
                {
                mLT(); if (state.failed) return ;


                }
                break;
            case 30 :
                // Atto.g:1:170: GT
                {
                mGT(); if (state.failed) return ;


                }
                break;
            case 31 :
                // Atto.g:1:173: PLUS
                {
                mPLUS(); if (state.failed) return ;


                }
                break;
            case 32 :
                // Atto.g:1:178: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 33 :
                // Atto.g:1:184: MUL
                {
                mMUL(); if (state.failed) return ;


                }
                break;
            case 34 :
                // Atto.g:1:188: DIV
                {
                mDIV(); if (state.failed) return ;


                }
                break;
            case 35 :
                // Atto.g:1:192: MOD
                {
                mMOD(); if (state.failed) return ;


                }
                break;
            case 36 :
                // Atto.g:1:196: AND
                {
                mAND(); if (state.failed) return ;


                }
                break;
            case 37 :
                // Atto.g:1:200: OR
                {
                mOR(); if (state.failed) return ;


                }
                break;
            case 38 :
                // Atto.g:1:203: NOT
                {
                mNOT(); if (state.failed) return ;


                }
                break;
            case 39 :
                // Atto.g:1:207: ASSIGN
                {
                mASSIGN(); if (state.failed) return ;


                }
                break;
            case 40 :
                // Atto.g:1:214: ARROW
                {
                mARROW(); if (state.failed) return ;


                }
                break;
            case 41 :
                // Atto.g:1:220: COMPOSITE
                {
                mCOMPOSITE(); if (state.failed) return ;


                }
                break;
            case 42 :
                // Atto.g:1:230: PIPELINE
                {
                mPIPELINE(); if (state.failed) return ;


                }
                break;
            case 43 :
                // Atto.g:1:239: REVERSE_PIPELINE
                {
                mREVERSE_PIPELINE(); if (state.failed) return ;


                }
                break;
            case 44 :
                // Atto.g:1:256: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;


                }
                break;
            case 45 :
                // Atto.g:1:264: NEWLINE
                {
                mNEWLINE(); if (state.failed) return ;


                }
                break;
            case 46 :
                // Atto.g:1:272: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_Atto
    public final void synpred1_Atto_fragment() throws RecognitionException {
        // Atto.g:225:5: ( ( ( '\\r' )? '\\n' )+ ( SPACE )* ( DOT | PIPELINE | REVERSE_PIPELINE ) )
        // Atto.g:225:7: ( ( '\\r' )? '\\n' )+ ( SPACE )* ( DOT | PIPELINE | REVERSE_PIPELINE )
        {
        // Atto.g:225:7: ( ( '\\r' )? '\\n' )+
        int cnt22=0;
        loop22:
        do {
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }


            switch (alt22) {
        	case 1 :
        	    // Atto.g:225:8: ( '\\r' )? '\\n'
        	    {
        	    // Atto.g:225:8: ( '\\r' )?
        	    int alt21=2;
        	    int LA21_0 = input.LA(1);

        	    if ( (LA21_0=='\r') ) {
        	        alt21=1;
        	    }
        	    switch (alt21) {
        	        case 1 :
        	            // Atto.g:225:9: '\\r'
        	            {
        	            match('\r'); if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    match('\n'); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt22 >= 1 ) break loop22;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(22, input);
                    throw eee;
            }
            cnt22++;
        } while (true);


        // Atto.g:225:23: ( SPACE )*
        loop23:
        do {
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\t'||LA23_0==' ') ) {
                alt23=1;
            }


            switch (alt23) {
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
        	    break loop23;
            }
        } while (true);


        // Atto.g:225:30: ( DOT | PIPELINE | REVERSE_PIPELINE )
        int alt24=3;
        switch ( input.LA(1) ) {
        case '.':
            {
            alt24=1;
            }
            break;
        case '|':
            {
            alt24=2;
            }
            break;
        case '<':
            {
            alt24=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 24, 0, input);

            throw nvae;

        }

        switch (alt24) {
            case 1 :
                // Atto.g:225:31: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 2 :
                // Atto.g:225:35: PIPELINE
                {
                mPIPELINE(); if (state.failed) return ;


                }
                break;
            case 3 :
                // Atto.g:225:44: REVERSE_PIPELINE
                {
                mREVERSE_PIPELINE(); if (state.failed) return ;


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


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\7\12\16\uffff\1\57\1\61\1\64\1\67\1\uffff\1\71\10\uffff"+
        "\1\74\11\12\17\uffff\2\12\1\112\7\12\1\uffff\1\122\1\123\1\uffff"+
        "\2\12\1\127\1\130\2\12\1\133\3\uffff\1\12\1\137\2\uffff\1\142\1"+
        "\143\3\uffff\1\12\6\uffff\1\150\4\uffff";
    static final String DFA20_eofS =
        "\152\uffff";
    static final String DFA20_minS =
        "\1\11\1\146\1\154\2\150\1\154\1\141\1\165\16\uffff\4\75\1\uffff"+
        "\1\76\4\uffff\1\76\3\uffff\1\60\1\151\1\144\1\164\1\151\1\145\1"+
        "\165\1\141\2\154\16\uffff\1\0\1\146\1\145\1\60\1\145\1\154\1\156"+
        "\1\145\2\163\1\154\1\uffff\2\60\1\0\1\156\1\145\2\60\1\163\1\145"+
        "\1\60\2\0\1\uffff\1\144\1\60\2\0\2\60\1\0\2\uffff\1\163\1\0\2\uffff"+
        "\1\0\2\uffff\1\60\2\uffff\1\0\1\uffff";
    static final String DFA20_maxS =
        "\1\175\1\146\1\170\1\150\1\162\1\154\1\141\1\165\16\uffff\2\75\1"+
        "\174\1\76\1\uffff\1\76\4\uffff\1\174\3\uffff\1\172\1\163\1\144\1"+
        "\164\1\151\1\145\1\165\1\141\2\154\16\uffff\1\0\1\146\1\145\1\172"+
        "\1\145\1\154\1\156\1\145\2\163\1\154\1\uffff\2\172\1\0\1\156\1\145"+
        "\2\172\1\163\1\145\1\172\2\0\1\uffff\1\144\1\172\2\0\2\172\1\0\2"+
        "\uffff\1\163\1\0\2\uffff\1\0\2\uffff\1\172\2\uffff\1\0\1\uffff";
    static final String DFA20_acceptS =
        "\10\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\4\uffff\1\37\1\uffff\1\41\1\42\1\43\1\44\1\uffff"+
        "\1\54\1\55\1\56\12\uffff\1\31\1\47\1\32\1\46\1\33\1\53\1\35\1\34"+
        "\1\51\1\36\1\50\1\40\1\45\1\52\13\uffff\1\1\14\uffff\1\6\7\uffff"+
        "\1\2\1\3\2\uffff\1\5\1\11\1\uffff\1\11\1\12\1\uffff\1\4\1\7\1\uffff"+
        "\1\10";
    static final String DFA20_specialS =
        "\74\uffff\1\10\15\uffff\1\5\7\uffff\1\11\1\6\3\uffff\1\4\1\0\2\uffff"+
        "\1\1\3\uffff\1\7\2\uffff\1\2\5\uffff\1\3\1\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\43\1\42\2\uffff\1\42\22\uffff\1\43\1\27\1\11\1\41\1\uffff"+
            "\1\36\1\37\1\11\1\17\1\20\1\34\1\32\1\16\1\33\1\15\1\35\12\10"+
            "\1\14\1\13\1\30\1\26\1\31\1\uffff\1\25\32\12\1\23\1\uffff\1"+
            "\24\1\uffff\1\12\1\uffff\2\12\1\5\1\12\1\2\1\6\2\12\1\1\4\12"+
            "\1\7\5\12\1\4\2\12\1\3\3\12\1\21\1\40\1\22",
            "\1\44",
            "\1\45\1\uffff\1\46\11\uffff\1\47",
            "\1\50",
            "\1\51\11\uffff\1\52",
            "\1\53",
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
            "",
            "\1\56",
            "\1\60",
            "\1\62\76\uffff\1\63",
            "\1\65\1\66",
            "",
            "\1\70",
            "",
            "",
            "",
            "",
            "\1\73\75\uffff\1\72",
            "",
            "",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\75\11\uffff\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
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
            "",
            "\1\uffff",
            "\1\110",
            "\1\111",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\uffff",
            "\1\125",
            "\1\126",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\131",
            "\1\132",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\136",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\uffff",
            "\1\uffff",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\uffff",
            "",
            "",
            "\1\145",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            "\1\uffff",
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
            return "1:1: Tokens : ( IF | ELIF | ELSE | WHILE | THEN | END | CLASS | EXTENDS | BOOLEAN | NULL | NUMBER | STRING | NAME | SEMICOLON | COLON | DOT | COMMA | LPAREN | RPAREN | LCURLY | RCURLY | LBRACK | RBRACK | AT | EQ | NE | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | ARROW | COMPOSITE | PIPELINE | REVERSE_PIPELINE | COMMENT | NEWLINE | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_88 = input.LA(1);

                         
                        int index20_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 97;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_88);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA20_91 = input.LA(1);

                         
                        int index20_91 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 100;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_91);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA20_98 = input.LA(1);

                         
                        int index20_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 103;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_98);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA20_104 = input.LA(1);

                         
                        int index20_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 105;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_104);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA20_87 = input.LA(1);

                         
                        int index20_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 96;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_87);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA20_74 = input.LA(1);

                         
                        int index20_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 84;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_74);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA20_83 = input.LA(1);

                         
                        int index20_83 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 93;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_83);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA20_95 = input.LA(1);

                         
                        int index20_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 102;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_95);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA20_60 = input.LA(1);

                         
                        int index20_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 71;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_60);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA20_82 = input.LA(1);

                         
                        int index20_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !memberMode )) ) {s = 92;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_82);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}