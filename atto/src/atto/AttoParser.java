// $ANTLR 3.4 Atto.g 2012-09-01 16:08:56

package atto;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AttoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APPLY", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "CLASS", "COLON", "COMMA", "COMMENT", "COMPOSITE", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "EXTENDS", "FIELD_ACCESS", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "LBRACK", "LCURLY", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "NUMBER", "OBJ", "OR", "PARAMS", "PIPELINE", "PLUS", "RBRACK", "RCURLY", "REVERSE_PIPELINE", "RPAREN", "SEMICOLON", "SEND", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "VARDEF", "WHILE", "WS", "'end'", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int AND=4;
    public static final int APPLY=5;
    public static final int ARRAY=6;
    public static final int ARROW=7;
    public static final int ASSIGN=8;
    public static final int AT=9;
    public static final int BLOCK=10;
    public static final int BOOL=11;
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
    public static final int EQ=24;
    public static final int EXTENDS=25;
    public static final int FIELD_ACCESS=26;
    public static final int FUN=27;
    public static final int GE=28;
    public static final int GT=29;
    public static final int ID_CHAR=30;
    public static final int IF=31;
    public static final int INDENT=32;
    public static final int INDEX=33;
    public static final int LBRACK=34;
    public static final int LCURLY=35;
    public static final int LE=36;
    public static final int LETTER=37;
    public static final int LOWER=38;
    public static final int LPAREN=39;
    public static final int LT=40;
    public static final int MINUS=41;
    public static final int MOD=42;
    public static final int MUL=43;
    public static final int NAME=44;
    public static final int NE=45;
    public static final int NEWLINE=46;
    public static final int NOT=47;
    public static final int NULL=48;
    public static final int NUMBER=49;
    public static final int OBJ=50;
    public static final int OR=51;
    public static final int PARAMS=52;
    public static final int PIPELINE=53;
    public static final int PLUS=54;
    public static final int RBRACK=55;
    public static final int RCURLY=56;
    public static final int REVERSE_PIPELINE=57;
    public static final int RPAREN=58;
    public static final int SEMICOLON=59;
    public static final int SEND=60;
    public static final int SPACE=61;
    public static final int STMT=62;
    public static final int STRING=63;
    public static final int UNARY_MINUS=64;
    public static final int UPPER=65;
    public static final int VARDEF=66;
    public static final int WHILE=67;
    public static final int WS=68;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AttoParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AttoParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AttoParser.tokenNames; }
    public String getGrammarFileName() { return "Atto.g"; }


    public static class root_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "root"
    // Atto.g:24:1: root : block ;
    public final AttoParser.root_return root() throws RecognitionException {
        AttoParser.root_return retval = new AttoParser.root_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.block_return block1 =null;



        try {
            // Atto.g:25:2: ( block )
            // Atto.g:25:4: block
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_block_in_root132);
            block1=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block1.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "root"


    public static class block_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // Atto.g:28:1: block : ( stmt ( terminator stmt )* )? ( terminator )? -> ^( BLOCK ( stmt )* ) ;
    public final AttoParser.block_return block() throws RecognitionException {
        AttoParser.block_return retval = new AttoParser.block_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.stmt_return stmt2 =null;

        AttoParser.terminator_return terminator3 =null;

        AttoParser.stmt_return stmt4 =null;

        AttoParser.terminator_return terminator5 =null;


        RewriteRuleSubtreeStream stream_terminator=new RewriteRuleSubtreeStream(adaptor,"rule terminator");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // Atto.g:29:2: ( ( stmt ( terminator stmt )* )? ( terminator )? -> ^( BLOCK ( stmt )* ) )
            // Atto.g:29:4: ( stmt ( terminator stmt )* )? ( terminator )?
            {
            // Atto.g:29:4: ( stmt ( terminator stmt )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==AT||LA2_0==BOOL||LA2_0==CLASS||LA2_0==IF||(LA2_0 >= LBRACK && LA2_0 <= LCURLY)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NAME||(LA2_0 >= NOT && LA2_0 <= NUMBER)||LA2_0==STRING||LA2_0==WHILE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Atto.g:29:5: stmt ( terminator stmt )*
                    {
                    pushFollow(FOLLOW_stmt_in_block144);
                    stmt2=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmt.add(stmt2.getTree());

                    // Atto.g:29:10: ( terminator stmt )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==SEMICOLON) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==NEWLINE) ) {
                                int LA1_4 = input.LA(3);

                                if ( (LA1_4==AT||LA1_4==BOOL||LA1_4==CLASS||LA1_4==IF||(LA1_4 >= LBRACK && LA1_4 <= LCURLY)||LA1_4==LPAREN||LA1_4==MINUS||LA1_4==NAME||(LA1_4 >= NOT && LA1_4 <= NUMBER)||LA1_4==STRING||LA1_4==WHILE) ) {
                                    alt1=1;
                                }


                            }
                            else if ( (LA1_1==AT||LA1_1==BOOL||LA1_1==CLASS||LA1_1==IF||(LA1_1 >= LBRACK && LA1_1 <= LCURLY)||LA1_1==LPAREN||LA1_1==MINUS||LA1_1==NAME||(LA1_1 >= NOT && LA1_1 <= NUMBER)||LA1_1==STRING||LA1_1==WHILE) ) {
                                alt1=1;
                            }


                        }
                        else if ( (LA1_0==NEWLINE) ) {
                            int LA1_2 = input.LA(2);

                            if ( (LA1_2==AT||LA1_2==BOOL||LA1_2==CLASS||LA1_2==IF||(LA1_2 >= LBRACK && LA1_2 <= LCURLY)||LA1_2==LPAREN||LA1_2==MINUS||LA1_2==NAME||(LA1_2 >= NOT && LA1_2 <= NUMBER)||LA1_2==STRING||LA1_2==WHILE) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Atto.g:29:11: terminator stmt
                    	    {
                    	    pushFollow(FOLLOW_terminator_in_block147);
                    	    terminator3=terminator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_terminator.add(terminator3.getTree());

                    	    pushFollow(FOLLOW_stmt_in_block149);
                    	    stmt4=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stmt.add(stmt4.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:29:31: ( terminator )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEMICOLON) ) {
                alt3=1;
            }
            else if ( (LA3_0==NEWLINE) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==NEWLINE||LA3_2==RCURLY) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // Atto.g:29:31: terminator
                    {
                    pushFollow(FOLLOW_terminator_in_block155);
                    terminator5=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_terminator.add(terminator5.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 29:43: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:29:46: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:29:54: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class stmt_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // Atto.g:32:1: stmt : ( expr | 'class' c= NAME ( 'extends' p= NAME )? NEWLINE ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? 'end' -> ^( CLASS $c ^( EXTENDS ( $p)? ) ( pair )* ) );
    public final AttoParser.stmt_return stmt() throws RecognitionException {
        AttoParser.stmt_return retval = new AttoParser.stmt_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token c=null;
        Token p=null;
        Token string_literal7=null;
        Token string_literal8=null;
        Token NEWLINE9=null;
        Token COMMA11=null;
        Token COMMA12=null;
        Token NEWLINE13=null;
        Token COMMA15=null;
        Token COMMA16=null;
        Token NEWLINE17=null;
        Token string_literal18=null;
        AttoParser.expr_return expr6 =null;

        AttoParser.pair_return pair10 =null;

        AttoParser.pair_return pair14 =null;


        AttoTree c_tree=null;
        AttoTree p_tree=null;
        AttoTree string_literal7_tree=null;
        AttoTree string_literal8_tree=null;
        AttoTree NEWLINE9_tree=null;
        AttoTree COMMA11_tree=null;
        AttoTree COMMA12_tree=null;
        AttoTree NEWLINE13_tree=null;
        AttoTree COMMA15_tree=null;
        AttoTree COMMA16_tree=null;
        AttoTree NEWLINE17_tree=null;
        AttoTree string_literal18_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:33:2: ( expr | 'class' c= NAME ( 'extends' p= NAME )? NEWLINE ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? 'end' -> ^( CLASS $c ^( EXTENDS ( $p)? ) ( pair )* ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==AT||LA11_0==BOOL||LA11_0==IF||(LA11_0 >= LBRACK && LA11_0 <= LCURLY)||LA11_0==LPAREN||LA11_0==MINUS||LA11_0==NAME||(LA11_0 >= NOT && LA11_0 <= NUMBER)||LA11_0==STRING||LA11_0==WHILE) ) {
                alt11=1;
            }
            else if ( (LA11_0==CLASS) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // Atto.g:33:4: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt176);
                    expr6=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr6.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:34:4: 'class' c= NAME ( 'extends' p= NAME )? NEWLINE ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? 'end'
                    {
                    string_literal7=(Token)match(input,CLASS,FOLLOW_CLASS_in_stmt181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(string_literal7);


                    c=(Token)match(input,NAME,FOLLOW_NAME_in_stmt185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAME.add(c);


                    // Atto.g:34:19: ( 'extends' p= NAME )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==EXTENDS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Atto.g:34:20: 'extends' p= NAME
                            {
                            string_literal8=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_stmt188); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EXTENDS.add(string_literal8);


                            p=(Token)match(input,NAME,FOLLOW_NAME_in_stmt192); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NAME.add(p);


                            }
                            break;

                    }


                    NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE9);


                    // Atto.g:34:47: ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NAME) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Atto.g:34:48: pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                            {
                            pushFollow(FOLLOW_pair_in_stmt199);
                            pair10=pair();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pair.add(pair10.getTree());

                            // Atto.g:34:53: ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==COMMA) ) {
                                    int LA7_1 = input.LA(2);

                                    if ( (LA7_1==NEWLINE) ) {
                                        int LA7_2 = input.LA(3);

                                        if ( (LA7_2==NAME) ) {
                                            alt7=1;
                                        }


                                    }
                                    else if ( (LA7_1==NAME) ) {
                                        alt7=1;
                                    }


                                }
                                else if ( (LA7_0==NEWLINE) ) {
                                    int LA7_2 = input.LA(2);

                                    if ( (LA7_2==NAME) ) {
                                        alt7=1;
                                    }


                                }


                                switch (alt7) {
                            	case 1 :
                            	    // Atto.g:34:54: ( COMMA | ( COMMA )? NEWLINE ) pair
                            	    {
                            	    // Atto.g:34:54: ( COMMA | ( COMMA )? NEWLINE )
                            	    int alt6=2;
                            	    int LA6_0 = input.LA(1);

                            	    if ( (LA6_0==COMMA) ) {
                            	        int LA6_1 = input.LA(2);

                            	        if ( (LA6_1==NAME) ) {
                            	            alt6=1;
                            	        }
                            	        else if ( (LA6_1==NEWLINE) ) {
                            	            alt6=2;
                            	        }
                            	        else {
                            	            if (state.backtracking>0) {state.failed=true; return retval;}
                            	            NoViableAltException nvae =
                            	                new NoViableAltException("", 6, 1, input);

                            	            throw nvae;

                            	        }
                            	    }
                            	    else if ( (LA6_0==NEWLINE) ) {
                            	        alt6=2;
                            	    }
                            	    else {
                            	        if (state.backtracking>0) {state.failed=true; return retval;}
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 6, 0, input);

                            	        throw nvae;

                            	    }
                            	    switch (alt6) {
                            	        case 1 :
                            	            // Atto.g:34:55: COMMA
                            	            {
                            	            COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt203); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);


                            	            }
                            	            break;
                            	        case 2 :
                            	            // Atto.g:34:61: ( COMMA )? NEWLINE
                            	            {
                            	            // Atto.g:34:61: ( COMMA )?
                            	            int alt5=2;
                            	            int LA5_0 = input.LA(1);

                            	            if ( (LA5_0==COMMA) ) {
                            	                alt5=1;
                            	            }
                            	            switch (alt5) {
                            	                case 1 :
                            	                    // Atto.g:34:61: COMMA
                            	                    {
                            	                    COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt205); if (state.failed) return retval; 
                            	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA12);


                            	                    }
                            	                    break;

                            	            }


                            	            NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt208); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE13);


                            	            }
                            	            break;

                            	    }


                            	    pushFollow(FOLLOW_pair_in_stmt211);
                            	    pair14=pair();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_pair.add(pair14.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }


                    // Atto.g:34:86: ( COMMA | ( COMMA )? NEWLINE )?
                    int alt10=3;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==COMMA) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==69) ) {
                            alt10=1;
                        }
                        else if ( (LA10_1==NEWLINE) ) {
                            alt10=2;
                        }
                    }
                    else if ( (LA10_0==NEWLINE) ) {
                        alt10=2;
                    }
                    switch (alt10) {
                        case 1 :
                            // Atto.g:34:87: COMMA
                            {
                            COMMA15=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt218); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA15);


                            }
                            break;
                        case 2 :
                            // Atto.g:34:93: ( COMMA )? NEWLINE
                            {
                            // Atto.g:34:93: ( COMMA )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==COMMA) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // Atto.g:34:93: COMMA
                                    {
                                    COMMA16=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt220); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA16);


                                    }
                                    break;

                            }


                            NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt223); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE17);


                            }
                            break;

                    }


                    string_literal18=(Token)match(input,69,FOLLOW_69_in_stmt227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal18);


                    // AST REWRITE
                    // elements: c, pair, p
                    // token labels: c, p
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
                    RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 35:3: -> ^( CLASS $c ^( EXTENDS ( $p)? ) ( pair )* )
                    {
                        // Atto.g:35:6: ^( CLASS $c ^( EXTENDS ( $p)? ) ( pair )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(CLASS, "CLASS")
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextNode());

                        // Atto.g:35:17: ^( EXTENDS ( $p)? )
                        {
                        AttoTree root_2 = (AttoTree)adaptor.nil();
                        root_2 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(EXTENDS, "EXTENDS")
                        , root_2);

                        // Atto.g:35:28: ( $p)?
                        if ( stream_p.hasNext() ) {
                            adaptor.addChild(root_2, stream_p.nextNode());

                        }
                        stream_p.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Atto.g:35:32: ( pair )*
                        while ( stream_pair.hasNext() ) {
                            adaptor.addChild(root_1, stream_pair.nextTree());

                        }
                        stream_pair.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class terminator_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "terminator"
    // Atto.g:38:1: terminator : ( SEMICOLON ( NEWLINE )? | NEWLINE );
    public final AttoParser.terminator_return terminator() throws RecognitionException {
        AttoParser.terminator_return retval = new AttoParser.terminator_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token SEMICOLON19=null;
        Token NEWLINE20=null;
        Token NEWLINE21=null;

        AttoTree SEMICOLON19_tree=null;
        AttoTree NEWLINE20_tree=null;
        AttoTree NEWLINE21_tree=null;

        try {
            // Atto.g:39:2: ( SEMICOLON ( NEWLINE )? | NEWLINE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==SEMICOLON) ) {
                alt13=1;
            }
            else if ( (LA13_0==NEWLINE) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // Atto.g:39:4: SEMICOLON ( NEWLINE )?
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    SEMICOLON19=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_terminator260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON19_tree = 
                    (AttoTree)adaptor.create(SEMICOLON19)
                    ;
                    adaptor.addChild(root_0, SEMICOLON19_tree);
                    }

                    // Atto.g:39:14: ( NEWLINE )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NEWLINE) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==EOF||LA12_1==AT||LA12_1==BOOL||LA12_1==CLASS||LA12_1==IF||(LA12_1 >= LBRACK && LA12_1 <= LCURLY)||LA12_1==LPAREN||LA12_1==MINUS||LA12_1==NAME||(LA12_1 >= NEWLINE && LA12_1 <= NUMBER)||LA12_1==RCURLY||LA12_1==STRING||LA12_1==WHILE) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // Atto.g:39:14: NEWLINE
                            {
                            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terminator262); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NEWLINE20_tree = 
                            (AttoTree)adaptor.create(NEWLINE20)
                            ;
                            adaptor.addChild(root_0, NEWLINE20_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Atto.g:39:25: NEWLINE
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terminator267); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE21_tree = 
                    (AttoTree)adaptor.create(NEWLINE21)
                    ;
                    adaptor.addChild(root_0, NEWLINE21_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "terminator"


    public static class expr_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // Atto.g:42:1: expr : ( ( assign )=> assign | or | if_ | while_ );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.assign_return assign22 =null;

        AttoParser.or_return or23 =null;

        AttoParser.if__return if_24 =null;

        AttoParser.while__return while_25 =null;



        try {
            // Atto.g:43:2: ( ( assign )=> assign | or | if_ | while_ )
            int alt14=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA14_1 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
                }
                break;
            case AT:
                {
                int LA14_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
                {
                int LA14_3 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA14_4 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;

                }
                }
                break;
            case BOOL:
                {
                int LA14_5 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 5, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA14_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 6, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA14_7 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 7, input);

                    throw nvae;

                }
                }
                break;
            case LCURLY:
                {
                int LA14_8 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 8, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                int LA14_9 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 9, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
            case NOT:
                {
                alt14=2;
                }
                break;
            case IF:
                {
                alt14=3;
                }
                break;
            case WHILE:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // Atto.g:43:4: ( assign )=> assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr284);
                    assign22=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign22.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:44:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr289);
                    or23=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or23.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:45:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr294);
                    if_24=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_24.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:46:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr299);
                    while_25=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_25.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class assign_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // Atto.g:49:1: assign : postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN27=null;
        Token NEWLINE28=null;
        Token PLUS30=null;
        Token ASSIGN31=null;
        Token NEWLINE32=null;
        Token MINUS34=null;
        Token ASSIGN35=null;
        Token NEWLINE36=null;
        Token MUL38=null;
        Token ASSIGN39=null;
        Token NEWLINE40=null;
        Token DIV42=null;
        Token ASSIGN43=null;
        Token NEWLINE44=null;
        Token MOD46=null;
        Token ASSIGN47=null;
        Token NEWLINE48=null;
        AttoParser.postfix_return postfix26 =null;

        AttoParser.expr_return expr29 =null;

        AttoParser.expr_return expr33 =null;

        AttoParser.expr_return expr37 =null;

        AttoParser.expr_return expr41 =null;

        AttoParser.expr_return expr45 =null;

        AttoParser.expr_return expr49 =null;


        AttoTree ASSIGN27_tree=null;
        AttoTree NEWLINE28_tree=null;
        AttoTree PLUS30_tree=null;
        AttoTree ASSIGN31_tree=null;
        AttoTree NEWLINE32_tree=null;
        AttoTree MINUS34_tree=null;
        AttoTree ASSIGN35_tree=null;
        AttoTree NEWLINE36_tree=null;
        AttoTree MUL38_tree=null;
        AttoTree ASSIGN39_tree=null;
        AttoTree NEWLINE40_tree=null;
        AttoTree DIV42_tree=null;
        AttoTree ASSIGN43_tree=null;
        AttoTree NEWLINE44_tree=null;
        AttoTree MOD46_tree=null;
        AttoTree ASSIGN47_tree=null;
        AttoTree NEWLINE48_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_MOD=new RewriteRuleTokenStream(adaptor,"token MOD");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:50:2: ( postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) )
            // Atto.g:50:4: postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
            {
            pushFollow(FOLLOW_postfix_in_assign310);
            postfix26=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfix.add(postfix26.getTree());

            // Atto.g:51:4: ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ASSIGN) ) {
                alt22=1;
            }
            else if ( (LA22_0==DIV||(LA22_0 >= MINUS && LA22_0 <= MUL)||LA22_0==PLUS) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Atto.g:51:6: ASSIGN ( NEWLINE )? expr
                    {
                    ASSIGN27=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN27);


                    // Atto.g:51:13: ( NEWLINE )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NEWLINE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Atto.g:51:13: NEWLINE
                            {
                            NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign320); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE28);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expr_in_assign323);
                    expr29=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());

                    // AST REWRITE
                    // elements: expr, ASSIGN, postfix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 51:27: -> ^( ASSIGN postfix expr )
                    {
                        // Atto.g:51:30: ^( ASSIGN postfix expr )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        stream_ASSIGN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_postfix.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:52:6: ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
                    {
                    // Atto.g:52:6: ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
                    int alt21=5;
                    switch ( input.LA(1) ) {
                    case PLUS:
                        {
                        alt21=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt21=2;
                        }
                        break;
                    case MUL:
                        {
                        alt21=3;
                        }
                        break;
                    case DIV:
                        {
                        alt21=4;
                        }
                        break;
                    case MOD:
                        {
                        alt21=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // Atto.g:52:8: PLUS ASSIGN ( NEWLINE )? expr
                            {
                            PLUS30=(Token)match(input,PLUS,FOLLOW_PLUS_in_assign342); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PLUS.add(PLUS30);


                            ASSIGN31=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign344); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN31);


                            // Atto.g:52:20: ( NEWLINE )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==NEWLINE) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // Atto.g:52:20: NEWLINE
                                    {
                                    NEWLINE32=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign346); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE32);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign349);
                            expr33=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr33.getTree());

                            // AST REWRITE
                            // elements: PLUS, ASSIGN, postfix, postfix, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 52:34: -> ^( ASSIGN postfix ^( PLUS postfix expr ) )
                            {
                                // Atto.g:52:37: ^( ASSIGN postfix ^( PLUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:52:54: ^( PLUS postfix expr )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_PLUS.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // Atto.g:53:8: MINUS ASSIGN ( NEWLINE )? expr
                            {
                            MINUS34=(Token)match(input,MINUS,FOLLOW_MINUS_in_assign374); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MINUS.add(MINUS34);


                            ASSIGN35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign376); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN35);


                            // Atto.g:53:21: ( NEWLINE )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==NEWLINE) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // Atto.g:53:21: NEWLINE
                                    {
                                    NEWLINE36=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign378); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE36);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign381);
                            expr37=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr37.getTree());

                            // AST REWRITE
                            // elements: postfix, postfix, ASSIGN, MINUS, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 53:35: -> ^( ASSIGN postfix ^( MINUS postfix expr ) )
                            {
                                // Atto.g:53:38: ^( ASSIGN postfix ^( MINUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:53:55: ^( MINUS postfix expr )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_MINUS.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 3 :
                            // Atto.g:54:8: MUL ASSIGN ( NEWLINE )? expr
                            {
                            MUL38=(Token)match(input,MUL,FOLLOW_MUL_in_assign406); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MUL.add(MUL38);


                            ASSIGN39=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign408); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN39);


                            // Atto.g:54:19: ( NEWLINE )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==NEWLINE) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // Atto.g:54:19: NEWLINE
                                    {
                                    NEWLINE40=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign410); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE40);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign413);
                            expr41=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr41.getTree());

                            // AST REWRITE
                            // elements: ASSIGN, expr, MUL, postfix, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 54:33: -> ^( ASSIGN postfix ^( MUL postfix expr ) )
                            {
                                // Atto.g:54:36: ^( ASSIGN postfix ^( MUL postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:54:53: ^( MUL postfix expr )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_MUL.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 4 :
                            // Atto.g:55:8: DIV ASSIGN ( NEWLINE )? expr
                            {
                            DIV42=(Token)match(input,DIV,FOLLOW_DIV_in_assign438); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIV.add(DIV42);


                            ASSIGN43=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign440); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN43);


                            // Atto.g:55:19: ( NEWLINE )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==NEWLINE) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // Atto.g:55:19: NEWLINE
                                    {
                                    NEWLINE44=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign442); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE44);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign445);
                            expr45=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr45.getTree());

                            // AST REWRITE
                            // elements: postfix, expr, ASSIGN, DIV, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 55:33: -> ^( ASSIGN postfix ^( DIV postfix expr ) )
                            {
                                // Atto.g:55:36: ^( ASSIGN postfix ^( DIV postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:55:53: ^( DIV postfix expr )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_DIV.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 5 :
                            // Atto.g:56:8: MOD ASSIGN ( NEWLINE )? expr
                            {
                            MOD46=(Token)match(input,MOD,FOLLOW_MOD_in_assign470); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MOD.add(MOD46);


                            ASSIGN47=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign472); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN47);


                            // Atto.g:56:19: ( NEWLINE )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==NEWLINE) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // Atto.g:56:19: NEWLINE
                                    {
                                    NEWLINE48=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign474); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE48);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign477);
                            expr49=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr49.getTree());

                            // AST REWRITE
                            // elements: MOD, ASSIGN, postfix, expr, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 56:33: -> ^( ASSIGN postfix ^( MOD postfix expr ) )
                            {
                                // Atto.g:56:36: ^( ASSIGN postfix ^( MOD postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:56:53: ^( MOD postfix expr )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_MOD.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class paramsdef_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramsdef"
    // Atto.g:61:1: paramsdef : ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) ;
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA51=null;
        AttoParser.vardef_return vardef50 =null;

        AttoParser.vardef_return vardef52 =null;


        AttoTree COMMA51_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:62:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) )
            // Atto.g:62:4: ( vardef ( COMMA vardef )* )?
            {
            // Atto.g:62:4: ( vardef ( COMMA vardef )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AT||LA24_0==NAME) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Atto.g:62:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_paramsdef518);
                    vardef50=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef50.getTree());

                    // Atto.g:62:12: ( COMMA vardef )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==COMMA) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Atto.g:62:13: COMMA vardef
                    	    {
                    	    COMMA51=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef521); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA51);


                    	    pushFollow(FOLLOW_vardef_in_paramsdef523);
                    	    vardef52=vardef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_vardef.add(vardef52.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: vardef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 62:30: -> ^( PARAMS ( vardef )* )
            {
                // Atto.g:62:33: ^( PARAMS ( vardef )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // Atto.g:62:42: ( vardef )*
                while ( stream_vardef.hasNext() ) {
                    adaptor.addChild(root_1, stream_vardef.nextTree());

                }
                stream_vardef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramsdef"


    public static class if__return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_"
    // Atto.g:65:1: if_ : 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal53=null;
        Token NEWLINE54=null;
        Token NEWLINE56=null;
        Token string_literal59=null;
        Token string_literal60=null;
        Token string_literal61=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block55 =null;

        AttoParser.elif_return elif57 =null;

        AttoParser.else__return else_58 =null;


        AttoTree string_literal53_tree=null;
        AttoTree NEWLINE54_tree=null;
        AttoTree NEWLINE56_tree=null;
        AttoTree string_literal59_tree=null;
        AttoTree string_literal60_tree=null;
        AttoTree string_literal61_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:66:2: ( 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:66:4: 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal53=(Token)match(input,IF,FOLLOW_IF_in_if_549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal53);


            pushFollow(FOLLOW_expr_in_if_553);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:67:4: ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NEWLINE) ) {
                alt28=1;
            }
            else if ( (LA28_0==70) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // Atto.g:67:6: NEWLINE block NEWLINE ( elif )* ( else_ )? 'end'
                    {
                    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE54);


                    pushFollow(FOLLOW_block_in_if_563);
                    block55=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block55.getTree());

                    NEWLINE56=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE56);


                    // Atto.g:67:28: ( elif )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==ELIF) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // Atto.g:67:28: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_567);
                    	    elif57=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif57.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    // Atto.g:67:34: ( else_ )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ELSE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // Atto.g:67:34: else_
                            {
                            pushFollow(FOLLOW_else__in_if_570);
                            else_58=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_58.getTree());

                            }
                            break;

                    }


                    string_literal59=(Token)match(input,69,FOLLOW_69_in_if_573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal59);


                    // AST REWRITE
                    // elements: elif, else_, block, cond_expr
                    // token labels: 
                    // rule labels: cond_expr, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_cond_expr=new RewriteRuleSubtreeStream(adaptor,"rule cond_expr",cond_expr!=null?cond_expr.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 68:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:68:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:68:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:68:36: ( else_ )?
                        if ( stream_else_.hasNext() ) {
                            adaptor.addChild(root_1, stream_else_.nextTree());

                        }
                        stream_else_.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:69:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal60=(Token)match(input,70,FOLLOW_70_in_if_601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal60);


                    pushFollow(FOLLOW_expr_in_if_605);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:69:28: ( 'else' else_expr= expr )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==ELSE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // Atto.g:69:29: 'else' else_expr= expr
                            {
                            string_literal61=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_608); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal61);


                            pushFollow(FOLLOW_expr_in_if_612);
                            else_expr=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: else_expr, then_expr, cond_expr
                    // token labels: 
                    // rule labels: cond_expr, retval, else_expr, then_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_cond_expr=new RewriteRuleSubtreeStream(adaptor,"rule cond_expr",cond_expr!=null?cond_expr.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr",else_expr!=null?else_expr.tree:null);
                    RewriteRuleSubtreeStream stream_then_expr=new RewriteRuleSubtreeStream(adaptor,"rule then_expr",then_expr!=null?then_expr.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 70:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:70:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:70:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:70:35: ^( ELSE $else_expr)
                            {
                            AttoTree root_2 = (AttoTree)adaptor.nil();
                            root_2 = (AttoTree)adaptor.becomeRoot(
                            (AttoTree)adaptor.create(ELSE, "ELSE")
                            , root_2);

                            adaptor.addChild(root_2, stream_else_expr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_else_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_"


    public static class elif_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elif"
    // Atto.g:74:1: elif : 'elif' expr NEWLINE block NEWLINE -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal62=null;
        Token NEWLINE64=null;
        Token NEWLINE66=null;
        AttoParser.expr_return expr63 =null;

        AttoParser.block_return block65 =null;


        AttoTree string_literal62_tree=null;
        AttoTree NEWLINE64_tree=null;
        AttoTree NEWLINE66_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:75:2: ( 'elif' expr NEWLINE block NEWLINE -> ^( ELIF expr block ) )
            // Atto.g:75:4: 'elif' expr NEWLINE block NEWLINE
            {
            string_literal62=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal62);


            pushFollow(FOLLOW_expr_in_elif657);
            expr63=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr63.getTree());

            NEWLINE64=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE64);


            pushFollow(FOLLOW_block_in_elif661);
            block65=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block65.getTree());

            NEWLINE66=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif663); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE66);


            // AST REWRITE
            // elements: block, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 75:38: -> ^( ELIF expr block )
            {
                // Atto.g:75:41: ^( ELIF expr block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ELIF, "ELIF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elif"


    public static class else__return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_"
    // Atto.g:78:1: else_ : 'else' NEWLINE block NEWLINE -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal67=null;
        Token NEWLINE68=null;
        Token NEWLINE70=null;
        AttoParser.block_return block69 =null;


        AttoTree string_literal67_tree=null;
        AttoTree NEWLINE68_tree=null;
        AttoTree NEWLINE70_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:79:2: ( 'else' NEWLINE block NEWLINE -> ^( ELSE block ) )
            // Atto.g:79:4: 'else' NEWLINE block NEWLINE
            {
            string_literal67=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal67);


            NEWLINE68=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE68);


            pushFollow(FOLLOW_block_in_else_688);
            block69=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block69.getTree());

            NEWLINE70=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE70);


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 79:34: -> ^( ELSE block )
            {
                // Atto.g:79:37: ^( ELSE block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ELSE, "ELSE")
                , root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_"


    public static class while__return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_"
    // Atto.g:82:1: while_ : 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal71=null;
        Token NEWLINE72=null;
        Token NEWLINE74=null;
        Token string_literal75=null;
        Token string_literal76=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block73 =null;


        AttoTree string_literal71_tree=null;
        AttoTree NEWLINE72_tree=null;
        AttoTree NEWLINE74_tree=null;
        AttoTree string_literal75_tree=null;
        AttoTree string_literal76_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:83:2: ( 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:83:4: 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal71=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_711); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal71);


            pushFollow(FOLLOW_expr_in_while_715);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:84:4: ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NEWLINE) ) {
                alt29=1;
            }
            else if ( (LA29_0==70) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // Atto.g:84:6: NEWLINE block NEWLINE 'end'
                    {
                    NEWLINE72=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE72);


                    pushFollow(FOLLOW_block_in_while_725);
                    block73=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block73.getTree());

                    NEWLINE74=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE74);


                    string_literal75=(Token)match(input,69,FOLLOW_69_in_while_729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal75);


                    // AST REWRITE
                    // elements: block, cond_expr
                    // token labels: 
                    // rule labels: cond_expr, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_cond_expr=new RewriteRuleSubtreeStream(adaptor,"rule cond_expr",cond_expr!=null?cond_expr.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 85:5: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:85:8: ^( WHILE $cond_expr block )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(WHILE, "WHILE")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:86:6: 'then' then_expr= expr
                    {
                    string_literal76=(Token)match(input,70,FOLLOW_70_in_while_752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal76);


                    pushFollow(FOLLOW_expr_in_while_756);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // AST REWRITE
                    // elements: then_expr, cond_expr
                    // token labels: 
                    // rule labels: cond_expr, retval, then_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_cond_expr=new RewriteRuleSubtreeStream(adaptor,"rule cond_expr",cond_expr!=null?cond_expr.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_then_expr=new RewriteRuleSubtreeStream(adaptor,"rule then_expr",then_expr!=null?then_expr.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 87:5: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:87:8: ^( WHILE $cond_expr $then_expr)
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(WHILE, "WHILE")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_"


    public static class or_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or"
    // Atto.g:91:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR78=null;
        AttoParser.and_return and77 =null;

        AttoParser.and_return and79 =null;


        AttoTree OR78_tree=null;

        try {
            // Atto.g:92:2: ( and ( OR ^ and )* )
            // Atto.g:92:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or788);
            and77=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and77.getTree());

            // Atto.g:92:8: ( OR ^ and )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==OR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Atto.g:92:9: OR ^ and
            	    {
            	    OR78=(Token)match(input,OR,FOLLOW_OR_in_or791); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR78_tree = 
            	    (AttoTree)adaptor.create(OR78)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR78_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or794);
            	    and79=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and79.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or"


    public static class and_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and"
    // Atto.g:95:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND81=null;
        AttoParser.rel_return rel80 =null;

        AttoParser.rel_return rel82 =null;


        AttoTree AND81_tree=null;

        try {
            // Atto.g:96:2: ( rel ( AND ^ rel )* )
            // Atto.g:96:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and807);
            rel80=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel80.getTree());

            // Atto.g:96:8: ( AND ^ rel )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Atto.g:96:9: AND ^ rel
            	    {
            	    AND81=(Token)match(input,AND,FOLLOW_AND_in_and810); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND81_tree = 
            	    (AttoTree)adaptor.create(AND81)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and813);
            	    rel82=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel82.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and"


    public static class rel_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel"
    // Atto.g:99:1: rel : reverse_pipeline ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set84=null;
        AttoParser.reverse_pipeline_return reverse_pipeline83 =null;

        AttoParser.reverse_pipeline_return reverse_pipeline85 =null;


        AttoTree set84_tree=null;

        try {
            // Atto.g:100:2: ( reverse_pipeline ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline )* )
            // Atto.g:100:4: reverse_pipeline ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_reverse_pipeline_in_rel826);
            reverse_pipeline83=reverse_pipeline();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, reverse_pipeline83.getTree());

            // Atto.g:100:21: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMPOSITE||LA32_0==EQ||(LA32_0 >= GE && LA32_0 <= GT)||LA32_0==LE||LA32_0==LT||LA32_0==NE||LA32_0==PIPELINE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Atto.g:100:22: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline
            	    {
            	    set84=(Token)input.LT(1);

            	    set84=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set84)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_reverse_pipeline_in_rel848);
            	    reverse_pipeline85=reverse_pipeline();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, reverse_pipeline85.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rel"


    public static class reverse_pipeline_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reverse_pipeline"
    // Atto.g:103:1: reverse_pipeline : add ( REVERSE_PIPELINE ^ rel )* ;
    public final AttoParser.reverse_pipeline_return reverse_pipeline() throws RecognitionException {
        AttoParser.reverse_pipeline_return retval = new AttoParser.reverse_pipeline_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token REVERSE_PIPELINE87=null;
        AttoParser.add_return add86 =null;

        AttoParser.rel_return rel88 =null;


        AttoTree REVERSE_PIPELINE87_tree=null;

        try {
            // Atto.g:104:2: ( add ( REVERSE_PIPELINE ^ rel )* )
            // Atto.g:104:4: add ( REVERSE_PIPELINE ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_reverse_pipeline861);
            add86=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add86.getTree());

            // Atto.g:104:8: ( REVERSE_PIPELINE ^ rel )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==REVERSE_PIPELINE) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Atto.g:104:9: REVERSE_PIPELINE ^ rel
            	    {
            	    REVERSE_PIPELINE87=(Token)match(input,REVERSE_PIPELINE,FOLLOW_REVERSE_PIPELINE_in_reverse_pipeline864); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    REVERSE_PIPELINE87_tree = 
            	    (AttoTree)adaptor.create(REVERSE_PIPELINE87)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(REVERSE_PIPELINE87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_reverse_pipeline867);
            	    rel88=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel88.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "reverse_pipeline"


    public static class add_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // Atto.g:107:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set90=null;
        AttoParser.mul_return mul89 =null;

        AttoParser.mul_return mul91 =null;


        AttoTree set90_tree=null;

        try {
            // Atto.g:108:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:108:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add880);
            mul89=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul89.getTree());

            // Atto.g:108:8: ( ( PLUS | MINUS ) ^ mul )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==PLUS) ) {
                    alt34=1;
                }
                else if ( (LA34_0==MINUS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Atto.g:108:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set90=(Token)input.LT(1);

            	    set90=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set90)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add890);
            	    mul91=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul91.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class mul_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul"
    // Atto.g:111:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set93=null;
        AttoParser.unary_return unary92 =null;

        AttoParser.unary_return unary94 =null;


        AttoTree set93_tree=null;

        try {
            // Atto.g:112:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:112:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul903);
            unary92=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary92.getTree());

            // Atto.g:112:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case MUL:
                    {
                    alt35=1;
                    }
                    break;
                case DIV:
                    {
                    alt35=1;
                    }
                    break;
                case MOD:
                    {
                    alt35=1;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // Atto.g:112:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set93=(Token)input.LT(1);

            	    set93=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set93)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mul915);
            	    unary94=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary94.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mul"


    public static class unary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // Atto.g:115:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT96=null;
        Token MINUS98=null;
        AttoParser.postfix_return postfix95 =null;

        AttoParser.postfix_return postfix97 =null;

        AttoParser.postfix_return postfix99 =null;


        AttoTree NOT96_tree=null;
        AttoTree MINUS98_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:116:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case AT:
            case BOOL:
            case LBRACK:
            case LCURLY:
            case LPAREN:
            case NAME:
            case NULL:
            case NUMBER:
            case STRING:
                {
                alt36=1;
                }
                break;
            case NOT:
                {
                alt36=2;
                }
                break;
            case MINUS:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // Atto.g:116:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary929);
                    postfix95=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix95.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:117:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT96=(Token)match(input,NOT,FOLLOW_NOT_in_unary934); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT96_tree = 
                    (AttoTree)adaptor.create(NOT96)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT96_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary937);
                    postfix97=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix97.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:118:4: MINUS postfix
                    {
                    MINUS98=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS98);


                    pushFollow(FOLLOW_postfix_in_unary944);
                    postfix99=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix99.getTree());

                    // AST REWRITE
                    // elements: postfix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 118:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:118:21: ^( UNARY_MINUS postfix )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(UNARY_MINUS, "UNARY_MINUS")
                        , root_1);

                        adaptor.addChild(root_1, stream_postfix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class postfix_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix"
    // Atto.g:121:1: postfix : ( primary -> primary ) ({...}? => LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) |{...}? => expr -> ^( APPLY $postfix expr ) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN101=null;
        Token COMMA103=null;
        Token RPAREN105=null;
        Token LBRACK106=null;
        Token RBRACK108=null;
        Token DOT109=null;
        AttoParser.primary_return primary100 =null;

        AttoParser.expr_return expr102 =null;

        AttoParser.expr_return expr104 =null;

        AttoParser.expr_return expr107 =null;

        AttoParser.primary_return primary110 =null;

        AttoParser.expr_return expr111 =null;


        AttoTree LPAREN101_tree=null;
        AttoTree COMMA103_tree=null;
        AttoTree RPAREN105_tree=null;
        AttoTree LBRACK106_tree=null;
        AttoTree RBRACK108_tree=null;
        AttoTree DOT109_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:122:2: ( ( primary -> primary ) ({...}? => LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) |{...}? => expr -> ^( APPLY $postfix expr ) )* )
            // Atto.g:122:4: ( primary -> primary ) ({...}? => LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) |{...}? => expr -> ^( APPLY $postfix expr ) )*
            {
            // Atto.g:122:4: ( primary -> primary )
            // Atto.g:122:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix967);
            primary100=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary100.getTree());

            // AST REWRITE
            // elements: primary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 122:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:123:4: ({...}? => LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) |{...}? => expr -> ^( APPLY $postfix expr ) )*
            loop39:
            do {
                int alt39=5;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==MINUS) ) {
                    int LA39_3 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==LPAREN) && ((( input.LA(1) != MINUS )||( input.LT(-1).getTokenIndex() + 1 == input.LT(1).getTokenIndex() )))) {
                    int LA39_20 = input.LA(2);

                    if ( (( input.LT(-1).getTokenIndex() + 1 == input.LT(1).getTokenIndex() )) ) {
                        alt39=1;
                    }
                    else if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==LBRACK) ) {
                    alt39=2;
                }
                else if ( (LA39_0==DOT) ) {
                    alt39=3;
                }
                else if ( (LA39_0==NAME) && (( input.LA(1) != MINUS ))) {
                    int LA39_23 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==AT) && (( input.LA(1) != MINUS ))) {
                    int LA39_24 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==NUMBER) && (( input.LA(1) != MINUS ))) {
                    int LA39_25 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==STRING) && (( input.LA(1) != MINUS ))) {
                    int LA39_26 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==BOOL) && (( input.LA(1) != MINUS ))) {
                    int LA39_27 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==NULL) && (( input.LA(1) != MINUS ))) {
                    int LA39_28 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==LCURLY) && (( input.LA(1) != MINUS ))) {
                    int LA39_29 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==NOT) && (( input.LA(1) != MINUS ))) {
                    int LA39_30 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==IF) && (( input.LA(1) != MINUS ))) {
                    int LA39_31 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }
                else if ( (LA39_0==WHILE) && (( input.LA(1) != MINUS ))) {
                    int LA39_32 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt39=4;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // Atto.g:123:6: {...}? => LPAREN ( expr ( COMMA expr )* )? RPAREN
            	    {
            	    if ( !(( input.LT(-1).getTokenIndex() + 1 == input.LT(1).getTokenIndex() )) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "postfix", " input.LT(-1).getTokenIndex() + 1 == input.LT(1).getTokenIndex() ");
            	    }

            	    LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix987); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);


            	    // Atto.g:124:12: ( expr ( COMMA expr )* )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==AT||LA38_0==BOOL||LA38_0==IF||(LA38_0 >= LBRACK && LA38_0 <= LCURLY)||LA38_0==LPAREN||LA38_0==MINUS||LA38_0==NAME||(LA38_0 >= NOT && LA38_0 <= NUMBER)||LA38_0==STRING||LA38_0==WHILE) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // Atto.g:124:13: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix990);
            	            expr102=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr102.getTree());

            	            // Atto.g:124:18: ( COMMA expr )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);

            	                if ( (LA37_0==COMMA) ) {
            	                    alt37=1;
            	                }


            	                switch (alt37) {
            	            	case 1 :
            	            	    // Atto.g:124:19: COMMA expr
            	            	    {
            	            	    COMMA103=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix993); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA103);


            	            	    pushFollow(FOLLOW_expr_in_postfix995);
            	            	    expr104=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr104.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix1001); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN105);


            	    // AST REWRITE
            	    // elements: postfix, expr
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (AttoTree)adaptor.nil();
            	    // 125:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:125:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:125:24: ( expr )*
            	        while ( stream_expr.hasNext() ) {
            	            adaptor.addChild(root_1, stream_expr.nextTree());

            	        }
            	        stream_expr.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Atto.g:126:6: LBRACK expr RBRACK
            	    {
            	    LBRACK106=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix1026); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK106);


            	    pushFollow(FOLLOW_expr_in_postfix1028);
            	    expr107=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr107.getTree());

            	    RBRACK108=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix1030); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK108);


            	    // AST REWRITE
            	    // elements: expr, postfix
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (AttoTree)adaptor.nil();
            	    // 127:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:127:8: ^( INDEX $postfix expr )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(INDEX, "INDEX")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_expr.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 3 :
            	    // Atto.g:128:6: DOT primary
            	    {
            	    DOT109=(Token)match(input,DOT,FOLLOW_DOT_in_postfix1053); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT109);


            	    pushFollow(FOLLOW_primary_in_postfix1055);
            	    primary110=primary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_primary.add(primary110.getTree());

            	    // AST REWRITE
            	    // elements: postfix, primary
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (AttoTree)adaptor.nil();
            	    // 129:5: -> ^( FIELD_ACCESS $postfix primary )
            	    {
            	        // Atto.g:129:8: ^( FIELD_ACCESS $postfix primary )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_primary.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 4 :
            	    // Atto.g:130:6: {...}? => expr
            	    {
            	    if ( !(( input.LA(1) != MINUS )) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "postfix", " input.LA(1) != MINUS ");
            	    }

            	    pushFollow(FOLLOW_expr_in_postfix1081);
            	    expr111=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr111.getTree());

            	    // AST REWRITE
            	    // elements: postfix, expr
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (AttoTree)adaptor.nil();
            	    // 131:5: -> ^( APPLY $postfix expr )
            	    {
            	        // Atto.g:131:8: ^( APPLY $postfix expr )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(APPLY, "APPLY")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_expr.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfix"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:135:1: primary : ( NAME | AT ^ NAME | NUMBER | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | ( obj )=> obj | fun | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME112=null;
        Token AT113=null;
        Token NAME114=null;
        Token NUMBER115=null;
        Token STRING116=null;
        Token BOOL117=null;
        Token NULL118=null;
        Token LPAREN119=null;
        Token RPAREN121=null;
        AttoParser.expr_return expr120 =null;

        AttoParser.obj_return obj122 =null;

        AttoParser.fun_return fun123 =null;

        AttoParser.array_return array124 =null;


        AttoTree NAME112_tree=null;
        AttoTree AT113_tree=null;
        AttoTree NAME114_tree=null;
        AttoTree NUMBER115_tree=null;
        AttoTree STRING116_tree=null;
        AttoTree BOOL117_tree=null;
        AttoTree NULL118_tree=null;
        AttoTree LPAREN119_tree=null;
        AttoTree RPAREN121_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:136:2: ( NAME | AT ^ NAME | NUMBER | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | ( obj )=> obj | fun | array )
            int alt40=10;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt40=1;
                }
                break;
            case AT:
                {
                alt40=2;
                }
                break;
            case NUMBER:
                {
                alt40=3;
                }
                break;
            case STRING:
                {
                alt40=4;
                }
                break;
            case BOOL:
                {
                alt40=5;
                }
                break;
            case NULL:
                {
                alt40=6;
                }
                break;
            case LPAREN:
                {
                alt40=7;
                }
                break;
            case LCURLY:
                {
                int LA40_8 = input.LA(2);

                if ( (LA40_8==NEWLINE) ) {
                    int LA40_10 = input.LA(3);

                    if ( (LA40_10==NAME) ) {
                        int LA40_15 = input.LA(4);

                        if ( (LA40_15==COLON) && (synpred2_Atto())) {
                            alt40=8;
                        }
                        else if ( (LA40_15==AND||(LA40_15 >= ASSIGN && LA40_15 <= AT)||LA40_15==BOOL||LA40_15==COMPOSITE||(LA40_15 >= DIV && LA40_15 <= DOT)||LA40_15==EQ||(LA40_15 >= GE && LA40_15 <= GT)||LA40_15==IF||(LA40_15 >= LBRACK && LA40_15 <= LE)||(LA40_15 >= LPAREN && LA40_15 <= NUMBER)||LA40_15==OR||(LA40_15 >= PIPELINE && LA40_15 <= PLUS)||(LA40_15 >= RCURLY && LA40_15 <= REVERSE_PIPELINE)||LA40_15==SEMICOLON||LA40_15==STRING||LA40_15==WHILE) ) {
                            alt40=9;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 15, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA40_10==COMMA) && (synpred2_Atto())) {
                        alt40=8;
                    }
                    else if ( (LA40_10==NEWLINE) ) {
                        int LA40_16 = input.LA(4);

                        if ( (LA40_16==RCURLY) ) {
                            int LA40_19 = input.LA(5);

                            if ( (synpred2_Atto()) ) {
                                alt40=8;
                            }
                            else if ( (true) ) {
                                alt40=9;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 16, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA40_10==RCURLY) ) {
                        int LA40_17 = input.LA(4);

                        if ( (synpred2_Atto()) ) {
                            alt40=8;
                        }
                        else if ( (true) ) {
                            alt40=9;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 17, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA40_10==AT||LA40_10==BOOL||LA40_10==CLASS||LA40_10==IF||(LA40_10 >= LBRACK && LA40_10 <= LCURLY)||LA40_10==LPAREN||LA40_10==MINUS||(LA40_10 >= NOT && LA40_10 <= NUMBER)||LA40_10==SEMICOLON||LA40_10==STRING||LA40_10==WHILE) ) {
                        alt40=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 10, input);

                        throw nvae;

                    }
                }
                else if ( (LA40_8==NAME) ) {
                    int LA40_11 = input.LA(3);

                    if ( (LA40_11==COLON) && (synpred2_Atto())) {
                        alt40=8;
                    }
                    else if ( (LA40_11==AND||(LA40_11 >= ARROW && LA40_11 <= AT)||LA40_11==BOOL||LA40_11==COMMA||LA40_11==COMPOSITE||(LA40_11 >= DIV && LA40_11 <= DOT)||LA40_11==EQ||(LA40_11 >= GE && LA40_11 <= GT)||LA40_11==IF||(LA40_11 >= LBRACK && LA40_11 <= LE)||(LA40_11 >= LPAREN && LA40_11 <= NUMBER)||LA40_11==OR||(LA40_11 >= PIPELINE && LA40_11 <= PLUS)||(LA40_11 >= RCURLY && LA40_11 <= REVERSE_PIPELINE)||LA40_11==SEMICOLON||LA40_11==STRING||LA40_11==WHILE) ) {
                        alt40=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 11, input);

                        throw nvae;

                    }
                }
                else if ( (LA40_8==COMMA) && (synpred2_Atto())) {
                    alt40=8;
                }
                else if ( (LA40_8==RCURLY) ) {
                    int LA40_13 = input.LA(3);

                    if ( (synpred2_Atto()) ) {
                        alt40=8;
                    }
                    else if ( (true) ) {
                        alt40=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 13, input);

                        throw nvae;

                    }
                }
                else if ( (LA40_8==ARROW||LA40_8==AT||LA40_8==BOOL||LA40_8==CLASS||LA40_8==IF||(LA40_8 >= LBRACK && LA40_8 <= LCURLY)||LA40_8==LPAREN||LA40_8==MINUS||(LA40_8 >= NOT && LA40_8 <= NUMBER)||LA40_8==SEMICOLON||LA40_8==STRING||LA40_8==WHILE) ) {
                    alt40=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 8, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                alt40=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // Atto.g:136:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME112=(Token)match(input,NAME,FOLLOW_NAME_in_primary1114); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME112_tree = 
                    (AttoTree)adaptor.create(NAME112)
                    ;
                    adaptor.addChild(root_0, NAME112_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:137:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT113=(Token)match(input,AT,FOLLOW_AT_in_primary1119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT113_tree = 
                    (AttoTree)adaptor.create(AT113)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT113_tree, root_0);
                    }

                    NAME114=(Token)match(input,NAME,FOLLOW_NAME_in_primary1122); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME114_tree = 
                    (AttoTree)adaptor.create(NAME114)
                    ;
                    adaptor.addChild(root_0, NAME114_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:138:4: NUMBER
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NUMBER115=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_primary1127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER115_tree = 
                    (AttoTree)adaptor.create(NUMBER115)
                    ;
                    adaptor.addChild(root_0, NUMBER115_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:139:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_primary1132); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING116_tree = 
                    (AttoTree)adaptor.create(STRING116)
                    ;
                    adaptor.addChild(root_0, STRING116_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:140:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL117=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary1137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL117_tree = 
                    (AttoTree)adaptor.create(BOOL117)
                    ;
                    adaptor.addChild(root_0, BOOL117_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:141:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL118=(Token)match(input,NULL,FOLLOW_NULL_in_primary1142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL118_tree = 
                    (AttoTree)adaptor.create(NULL118)
                    ;
                    adaptor.addChild(root_0, NULL118_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:142:4: LPAREN expr RPAREN
                    {
                    LPAREN119=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN119);


                    pushFollow(FOLLOW_expr_in_primary1149);
                    expr120=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr120.getTree());

                    RPAREN121=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN121);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 142:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:143:4: ( obj )=> obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary1165);
                    obj122=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj122.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:144:4: fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_primary1170);
                    fun123=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun123.getTree());

                    }
                    break;
                case 10 :
                    // Atto.g:145:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary1175);
                    array124=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array124.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class obj_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "obj"
    // Atto.g:148:1: obj : LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY125=null;
        Token NEWLINE126=null;
        Token COMMA128=null;
        Token COMMA129=null;
        Token NEWLINE130=null;
        Token COMMA132=null;
        Token COMMA133=null;
        Token NEWLINE134=null;
        Token RCURLY135=null;
        AttoParser.pair_return pair127 =null;

        AttoParser.pair_return pair131 =null;


        AttoTree LCURLY125_tree=null;
        AttoTree NEWLINE126_tree=null;
        AttoTree COMMA128_tree=null;
        AttoTree COMMA129_tree=null;
        AttoTree NEWLINE130_tree=null;
        AttoTree COMMA132_tree=null;
        AttoTree COMMA133_tree=null;
        AttoTree NEWLINE134_tree=null;
        AttoTree RCURLY135_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:149:2: ( LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:149:4: LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY
            {
            LCURLY125=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj1187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY125);


            // Atto.g:149:11: ( NEWLINE )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==NEWLINE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Atto.g:149:11: NEWLINE
                    {
                    NEWLINE126=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE126);


                    }
                    break;

            }


            // Atto.g:149:20: ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==NAME) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Atto.g:149:21: pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj1193);
                    pair127=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair127.getTree());

                    // Atto.g:149:26: ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==COMMA) ) {
                            int LA44_1 = input.LA(2);

                            if ( (LA44_1==NEWLINE) ) {
                                int LA44_2 = input.LA(3);

                                if ( (LA44_2==NAME) ) {
                                    alt44=1;
                                }


                            }
                            else if ( (LA44_1==NAME) ) {
                                alt44=1;
                            }


                        }
                        else if ( (LA44_0==NEWLINE) ) {
                            int LA44_2 = input.LA(2);

                            if ( (LA44_2==NAME) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // Atto.g:149:27: ( COMMA | ( COMMA )? NEWLINE ) pair
                    	    {
                    	    // Atto.g:149:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==COMMA) ) {
                    	        int LA43_1 = input.LA(2);

                    	        if ( (LA43_1==NAME) ) {
                    	            alt43=1;
                    	        }
                    	        else if ( (LA43_1==NEWLINE) ) {
                    	            alt43=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 43, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA43_0==NEWLINE) ) {
                    	        alt43=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 43, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // Atto.g:149:28: COMMA
                    	            {
                    	            COMMA128=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1197); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA128);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:149:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:149:34: ( COMMA )?
                    	            int alt42=2;
                    	            int LA42_0 = input.LA(1);

                    	            if ( (LA42_0==COMMA) ) {
                    	                alt42=1;
                    	            }
                    	            switch (alt42) {
                    	                case 1 :
                    	                    // Atto.g:149:34: COMMA
                    	                    {
                    	                    COMMA129=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1199); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA129);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE130=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1202); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE130);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_obj1205);
                    	    pair131=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair131.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:149:59: ( COMMA | ( COMMA )? NEWLINE )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==COMMA) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RCURLY) ) {
                    alt47=1;
                }
                else if ( (LA47_1==NEWLINE) ) {
                    alt47=2;
                }
            }
            else if ( (LA47_0==NEWLINE) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // Atto.g:149:60: COMMA
                    {
                    COMMA132=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA132);


                    }
                    break;
                case 2 :
                    // Atto.g:149:66: ( COMMA )? NEWLINE
                    {
                    // Atto.g:149:66: ( COMMA )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==COMMA) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // Atto.g:149:66: COMMA
                            {
                            COMMA133=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1214); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA133);


                            }
                            break;

                    }


                    NEWLINE134=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE134);


                    }
                    break;

            }


            RCURLY135=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj1221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY135);


            // AST REWRITE
            // elements: pair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 149:90: -> ^( OBJ ( pair )* )
            {
                // Atto.g:149:93: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:149:99: ( pair )*
                while ( stream_pair.hasNext() ) {
                    adaptor.addChild(root_1, stream_pair.nextTree());

                }
                stream_pair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "obj"


    public static class pair_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pair"
    // Atto.g:152:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME136=null;
        Token COLON137=null;
        AttoParser.expr_return expr138 =null;


        AttoTree NAME136_tree=null;
        AttoTree COLON137_tree=null;

        try {
            // Atto.g:153:2: ( NAME COLON ^ expr )
            // Atto.g:153:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME136=(Token)match(input,NAME,FOLLOW_NAME_in_pair1241); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME136_tree = 
            (AttoTree)adaptor.create(NAME136)
            ;
            adaptor.addChild(root_0, NAME136_tree);
            }

            COLON137=(Token)match(input,COLON,FOLLOW_COLON_in_pair1243); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON137_tree = 
            (AttoTree)adaptor.create(COLON137)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON137_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair1246);
            expr138=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr138.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pair"


    public static class fun_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fun"
    // Atto.g:156:1: fun : LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY -> ^( FUN ( paramsdef )? block ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY139=null;
        Token ARROW141=null;
        Token NEWLINE142=null;
        Token RCURLY144=null;
        AttoParser.paramsdef_return paramsdef140 =null;

        AttoParser.block_return block143 =null;


        AttoTree LCURLY139_tree=null;
        AttoTree ARROW141_tree=null;
        AttoTree NEWLINE142_tree=null;
        AttoTree RCURLY144_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:157:2: ( LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY -> ^( FUN ( paramsdef )? block ) )
            // Atto.g:157:4: LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY
            {
            LCURLY139=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_fun1257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY139);


            // Atto.g:157:11: ( paramsdef ARROW )?
            int alt48=2;
            switch ( input.LA(1) ) {
                case AT:
                    {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==NAME) ) {
                        int LA48_5 = input.LA(3);

                        if ( (LA48_5==ARROW||LA48_5==COMMA) ) {
                            alt48=1;
                        }
                    }
                    }
                    break;
                case NAME:
                    {
                    int LA48_2 = input.LA(2);

                    if ( (LA48_2==ARROW||LA48_2==COMMA) ) {
                        alt48=1;
                    }
                    }
                    break;
                case ARROW:
                    {
                    alt48=1;
                    }
                    break;
            }

            switch (alt48) {
                case 1 :
                    // Atto.g:157:12: paramsdef ARROW
                    {
                    pushFollow(FOLLOW_paramsdef_in_fun1260);
                    paramsdef140=paramsdef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef140.getTree());

                    ARROW141=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun1262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(ARROW141);


                    }
                    break;

            }


            // Atto.g:157:30: ( NEWLINE )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NEWLINE) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Atto.g:157:30: NEWLINE
                    {
                    NEWLINE142=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_fun1266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE142);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_fun1269);
            block143=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block143.getTree());

            RCURLY144=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_fun1271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY144);


            // AST REWRITE
            // elements: paramsdef, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 157:52: -> ^( FUN ( paramsdef )? block )
            {
                // Atto.g:157:55: ^( FUN ( paramsdef )? block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(FUN, "FUN")
                , root_1);

                // Atto.g:157:61: ( paramsdef )?
                if ( stream_paramsdef.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramsdef.nextTree());

                }
                stream_paramsdef.reset();

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fun"


    public static class array_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // Atto.g:160:1: array : LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK145=null;
        Token NEWLINE146=null;
        Token COMMA148=null;
        Token COMMA149=null;
        Token NEWLINE150=null;
        Token COMMA152=null;
        Token COMMA153=null;
        Token NEWLINE154=null;
        Token RBRACK155=null;
        AttoParser.expr_return expr147 =null;

        AttoParser.expr_return expr151 =null;


        AttoTree LBRACK145_tree=null;
        AttoTree NEWLINE146_tree=null;
        AttoTree COMMA148_tree=null;
        AttoTree COMMA149_tree=null;
        AttoTree NEWLINE150_tree=null;
        AttoTree COMMA152_tree=null;
        AttoTree COMMA153_tree=null;
        AttoTree NEWLINE154_tree=null;
        AttoTree RBRACK155_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:161:2: ( LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:161:4: LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK
            {
            LBRACK145=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK145);


            // Atto.g:161:11: ( NEWLINE )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==NEWLINE) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Atto.g:161:11: NEWLINE
                    {
                    NEWLINE146=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE146);


                    }
                    break;

            }


            // Atto.g:161:20: ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==AT||LA54_0==BOOL||LA54_0==IF||(LA54_0 >= LBRACK && LA54_0 <= LCURLY)||LA54_0==LPAREN||LA54_0==MINUS||LA54_0==NAME||(LA54_0 >= NOT && LA54_0 <= NUMBER)||LA54_0==STRING||LA54_0==WHILE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Atto.g:161:21: expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1300);
                    expr147=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr147.getTree());

                    // Atto.g:161:26: ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==COMMA) ) {
                            int LA53_1 = input.LA(2);

                            if ( (LA53_1==NEWLINE) ) {
                                int LA53_2 = input.LA(3);

                                if ( (LA53_2==AT||LA53_2==BOOL||LA53_2==IF||(LA53_2 >= LBRACK && LA53_2 <= LCURLY)||LA53_2==LPAREN||LA53_2==MINUS||LA53_2==NAME||(LA53_2 >= NOT && LA53_2 <= NUMBER)||LA53_2==STRING||LA53_2==WHILE) ) {
                                    alt53=1;
                                }


                            }
                            else if ( (LA53_1==AT||LA53_1==BOOL||LA53_1==IF||(LA53_1 >= LBRACK && LA53_1 <= LCURLY)||LA53_1==LPAREN||LA53_1==MINUS||LA53_1==NAME||(LA53_1 >= NOT && LA53_1 <= NUMBER)||LA53_1==STRING||LA53_1==WHILE) ) {
                                alt53=1;
                            }


                        }
                        else if ( (LA53_0==NEWLINE) ) {
                            int LA53_2 = input.LA(2);

                            if ( (LA53_2==AT||LA53_2==BOOL||LA53_2==IF||(LA53_2 >= LBRACK && LA53_2 <= LCURLY)||LA53_2==LPAREN||LA53_2==MINUS||LA53_2==NAME||(LA53_2 >= NOT && LA53_2 <= NUMBER)||LA53_2==STRING||LA53_2==WHILE) ) {
                                alt53=1;
                            }


                        }


                        switch (alt53) {
                    	case 1 :
                    	    // Atto.g:161:27: ( COMMA | ( COMMA )? NEWLINE ) expr
                    	    {
                    	    // Atto.g:161:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt52=2;
                    	    int LA52_0 = input.LA(1);

                    	    if ( (LA52_0==COMMA) ) {
                    	        int LA52_1 = input.LA(2);

                    	        if ( (LA52_1==AT||LA52_1==BOOL||LA52_1==IF||(LA52_1 >= LBRACK && LA52_1 <= LCURLY)||LA52_1==LPAREN||LA52_1==MINUS||LA52_1==NAME||(LA52_1 >= NOT && LA52_1 <= NUMBER)||LA52_1==STRING||LA52_1==WHILE) ) {
                    	            alt52=1;
                    	        }
                    	        else if ( (LA52_1==NEWLINE) ) {
                    	            alt52=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 52, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA52_0==NEWLINE) ) {
                    	        alt52=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 52, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt52) {
                    	        case 1 :
                    	            // Atto.g:161:28: COMMA
                    	            {
                    	            COMMA148=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1304); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA148);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:161:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:161:34: ( COMMA )?
                    	            int alt51=2;
                    	            int LA51_0 = input.LA(1);

                    	            if ( (LA51_0==COMMA) ) {
                    	                alt51=1;
                    	            }
                    	            switch (alt51) {
                    	                case 1 :
                    	                    // Atto.g:161:34: COMMA
                    	                    {
                    	                    COMMA149=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1306); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA149);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE150=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1309); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE150);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_expr_in_array1312);
                    	    expr151=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr151.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:161:60: ( COMMA | ( COMMA )? NEWLINE )?
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COMMA) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RBRACK) ) {
                    alt56=1;
                }
                else if ( (LA56_1==NEWLINE) ) {
                    alt56=2;
                }
            }
            else if ( (LA56_0==NEWLINE) ) {
                alt56=2;
            }
            switch (alt56) {
                case 1 :
                    // Atto.g:161:61: COMMA
                    {
                    COMMA152=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA152);


                    }
                    break;
                case 2 :
                    // Atto.g:161:67: ( COMMA )? NEWLINE
                    {
                    // Atto.g:161:67: ( COMMA )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==COMMA) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // Atto.g:161:67: COMMA
                            {
                            COMMA153=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1322); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA153);


                            }
                            break;

                    }


                    NEWLINE154=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE154);


                    }
                    break;

            }


            RBRACK155=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1329); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK155);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 161:91: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:161:94: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:161:102: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class vardef_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vardef"
    // Atto.g:164:1: vardef : ( AT )? NAME -> ^( VARDEF ( AT )? NAME ) ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AT156=null;
        Token NAME157=null;

        AttoTree AT156_tree=null;
        AttoTree NAME157_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

        try {
            // Atto.g:165:2: ( ( AT )? NAME -> ^( VARDEF ( AT )? NAME ) )
            // Atto.g:165:4: ( AT )? NAME
            {
            // Atto.g:165:4: ( AT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==AT) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Atto.g:165:4: AT
                    {
                    AT156=(Token)match(input,AT,FOLLOW_AT_in_vardef1349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT.add(AT156);


                    }
                    break;

            }


            NAME157=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME157);


            // AST REWRITE
            // elements: NAME, AT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 165:13: -> ^( VARDEF ( AT )? NAME )
            {
                // Atto.g:165:16: ^( VARDEF ( AT )? NAME )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(VARDEF, "VARDEF")
                , root_1);

                // Atto.g:165:25: ( AT )?
                if ( stream_AT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_AT.nextNode()
                    );

                }
                stream_AT.reset();

                adaptor.addChild(root_1, 
                stream_NAME.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AttoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vardef"

    // $ANTLR start synpred1_Atto
    public final void synpred1_Atto_fragment() throws RecognitionException {
        // Atto.g:43:4: ( assign )
        // Atto.g:43:5: assign
        {
        pushFollow(FOLLOW_assign_in_synpred1_Atto280);
        assign();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Atto

    // $ANTLR start synpred2_Atto
    public final void synpred2_Atto_fragment() throws RecognitionException {
        // Atto.g:143:4: ( obj )
        // Atto.g:143:5: obj
        {
        pushFollow(FOLLOW_obj_in_synpred2_Atto1161);
        obj();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Atto

    // Delegated rules

    public final boolean synpred2_Atto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Atto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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


 

    public static final BitSet FOLLOW_block_in_root132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block144 = new BitSet(new long[]{0x0800400000000002L});
    public static final BitSet FOLLOW_terminator_in_block147 = new BitSet(new long[]{0x8003928C80002A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_stmt_in_block149 = new BitSet(new long[]{0x0800400000000002L});
    public static final BitSet FOLLOW_terminator_in_block155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stmt181 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_stmt185 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_EXTENDS_in_stmt188 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_stmt192 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt196 = new BitSet(new long[]{0x0000500000008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_pair_in_stmt199 = new BitSet(new long[]{0x0000400000008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_stmt203 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_COMMA_in_stmt205 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt208 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pair_in_stmt211 = new BitSet(new long[]{0x0000400000008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_stmt218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_stmt220 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_stmt227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_terminator260 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terminator262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terminator267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign310 = new BitSet(new long[]{0x00400E0000100100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign318 = new BitSet(new long[]{0x8003D28C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_assign320 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assign323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_assign342 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign344 = new BitSet(new long[]{0x8003D28C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_assign346 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assign349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_assign374 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign376 = new BitSet(new long[]{0x8003D28C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_assign378 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assign381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_assign406 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign408 = new BitSet(new long[]{0x8003D28C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_assign410 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assign413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_assign438 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign440 = new BitSet(new long[]{0x8003D28C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_assign442 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assign445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_assign470 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign472 = new BitSet(new long[]{0x8003D28C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_assign474 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assign477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef518 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef521 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_vardef_in_paramsdef523 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_IF_in_if_549 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_if_553 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_if_561 = new BitSet(new long[]{0x8803D28C80002A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_if_563 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_if_565 = new BitSet(new long[]{0x0000000000C00000L,0x0000000000000020L});
    public static final BitSet FOLLOW_elif_in_if_567 = new BitSet(new long[]{0x0000000000C00000L,0x0000000000000020L});
    public static final BitSet FOLLOW_else__in_if_570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_if_573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_if_601 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_if_605 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ELSE_in_if_608 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_if_612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif655 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_elif657 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif659 = new BitSet(new long[]{0x8803D28C80002A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_elif661 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_684 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_686 = new BitSet(new long[]{0x8803D28C80002A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_else_688 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_711 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_while_715 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_while_723 = new BitSet(new long[]{0x8803D28C80002A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_while_725 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_while_727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_while_729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_while_752 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_while_756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or788 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_or791 = new BitSet(new long[]{0x8003928C00000A00L});
    public static final BitSet FOLLOW_and_in_or794 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rel_in_and807 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and810 = new BitSet(new long[]{0x8003928C00000A00L});
    public static final BitSet FOLLOW_rel_in_and813 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_reverse_pipeline_in_rel826 = new BitSet(new long[]{0x0020211031020002L});
    public static final BitSet FOLLOW_set_in_rel829 = new BitSet(new long[]{0x8003928C00000A00L});
    public static final BitSet FOLLOW_reverse_pipeline_in_rel848 = new BitSet(new long[]{0x0020211031020002L});
    public static final BitSet FOLLOW_add_in_reverse_pipeline861 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_REVERSE_PIPELINE_in_reverse_pipeline864 = new BitSet(new long[]{0x8003928C00000A00L});
    public static final BitSet FOLLOW_rel_in_reverse_pipeline867 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_mul_in_add880 = new BitSet(new long[]{0x0040020000000002L});
    public static final BitSet FOLLOW_set_in_add883 = new BitSet(new long[]{0x8003928C00000A00L});
    public static final BitSet FOLLOW_mul_in_add890 = new BitSet(new long[]{0x0040020000000002L});
    public static final BitSet FOLLOW_unary_in_mul903 = new BitSet(new long[]{0x00000C0000100002L});
    public static final BitSet FOLLOW_set_in_mul906 = new BitSet(new long[]{0x8003928C00000A00L});
    public static final BitSet FOLLOW_unary_in_mul915 = new BitSet(new long[]{0x00000C0000100002L});
    public static final BitSet FOLLOW_postfix_in_unary929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary934 = new BitSet(new long[]{0x8003108C00000A00L});
    public static final BitSet FOLLOW_postfix_in_unary937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary942 = new BitSet(new long[]{0x8003108C00000A00L});
    public static final BitSet FOLLOW_postfix_in_unary944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix967 = new BitSet(new long[]{0x8003928C80200A02L,0x0000000000000008L});
    public static final BitSet FOLLOW_LPAREN_in_postfix987 = new BitSet(new long[]{0x8403928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_postfix990 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_COMMA_in_postfix993 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_postfix995 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix1001 = new BitSet(new long[]{0x8003928C80200A02L,0x0000000000000008L});
    public static final BitSet FOLLOW_LBRACK_in_postfix1026 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_postfix1028 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix1030 = new BitSet(new long[]{0x8003928C80200A02L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_postfix1053 = new BitSet(new long[]{0x8003108C00000A00L});
    public static final BitSet FOLLOW_primary_in_postfix1055 = new BitSet(new long[]{0x8003928C80200A02L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_postfix1081 = new BitSet(new long[]{0x8003928C80200A02L,0x0000000000000008L});
    public static final BitSet FOLLOW_NAME_in_primary1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary1119 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_primary1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_primary1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary1147 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_primary1149 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_primary1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj1187 = new BitSet(new long[]{0x0100500000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1189 = new BitSet(new long[]{0x0100500000008000L});
    public static final BitSet FOLLOW_pair_in_obj1193 = new BitSet(new long[]{0x0100400000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1197 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1199 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1202 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pair_in_obj1205 = new BitSet(new long[]{0x0100400000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1212 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1214 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1217 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair1241 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COLON_in_pair1243 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_pair1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_fun1257 = new BitSet(new long[]{0x8903D28C80002A80L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramsdef_in_fun1260 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_fun1262 = new BitSet(new long[]{0x8903D28C80002A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_fun1266 = new BitSet(new long[]{0x8903D28C80002A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_fun1269 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_fun1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1294 = new BitSet(new long[]{0x8083D28C80008A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_array1296 = new BitSet(new long[]{0x8083D28C80008A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_array1300 = new BitSet(new long[]{0x0080400000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1304 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_array1306 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1309 = new BitSet(new long[]{0x8003928C80000A00L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_array1312 = new BitSet(new long[]{0x0080400000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1320 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array1322 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1325 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_vardef1349 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_vardef1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_synpred2_Atto1161 = new BitSet(new long[]{0x0000000000000002L});

}