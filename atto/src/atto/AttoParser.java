// $ANTLR 3.4 Atto.g 2012-09-02 16:50:27

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGS", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOLEAN", "CALL", "CLASS", "COLON", "COMMA", "COMMENT", "COMPOSITE", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "END", "EQ", "EXTENDS", "FIELD_ACCESS", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "LBRACK", "LCURLY", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "NUMBER", "OBJ", "OR", "PARAMS", "PARENT_CLASS", "PIPELINE", "PLUS", "RBRACK", "RCURLY", "REVERSE_PIPELINE", "RPAREN", "SEMICOLON", "SEND", "SPACE", "STMT", "STRING", "TEXT", "THEN", "UNARY_MINUS", "UPPER", "VARDEF", "WHILE", "WS"
    };

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
    // Atto.g:33:1: root : block ;
    public final AttoParser.root_return root() throws RecognitionException {
        AttoParser.root_return retval = new AttoParser.root_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.block_return block1 =null;



        try {
            // Atto.g:34:2: ( block )
            // Atto.g:34:4: block
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_block_in_root115);
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
    // Atto.g:37:1: block : ( stmt ( terminator stmt )* )? ( terminator )? -> ^( BLOCK ( stmt )* ) ;
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
            // Atto.g:38:2: ( ( stmt ( terminator stmt )* )? ( terminator )? -> ^( BLOCK ( stmt )* ) )
            // Atto.g:38:4: ( stmt ( terminator stmt )* )? ( terminator )?
            {
            // Atto.g:38:4: ( stmt ( terminator stmt )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==AT||LA2_0==BOOLEAN||LA2_0==CLASS||LA2_0==IF||(LA2_0 >= LBRACK && LA2_0 <= LCURLY)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NAME||(LA2_0 >= NOT && LA2_0 <= NUMBER)||LA2_0==STRING||LA2_0==WHILE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Atto.g:38:5: stmt ( terminator stmt )*
                    {
                    pushFollow(FOLLOW_stmt_in_block128);
                    stmt2=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmt.add(stmt2.getTree());

                    // Atto.g:38:10: ( terminator stmt )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==SEMICOLON) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==NEWLINE) ) {
                                int LA1_4 = input.LA(3);

                                if ( (LA1_4==AT||LA1_4==BOOLEAN||LA1_4==CLASS||LA1_4==IF||(LA1_4 >= LBRACK && LA1_4 <= LCURLY)||LA1_4==LPAREN||LA1_4==MINUS||LA1_4==NAME||(LA1_4 >= NOT && LA1_4 <= NUMBER)||LA1_4==STRING||LA1_4==WHILE) ) {
                                    alt1=1;
                                }


                            }
                            else if ( (LA1_1==AT||LA1_1==BOOLEAN||LA1_1==CLASS||LA1_1==IF||(LA1_1 >= LBRACK && LA1_1 <= LCURLY)||LA1_1==LPAREN||LA1_1==MINUS||LA1_1==NAME||(LA1_1 >= NOT && LA1_1 <= NUMBER)||LA1_1==STRING||LA1_1==WHILE) ) {
                                alt1=1;
                            }


                        }
                        else if ( (LA1_0==NEWLINE) ) {
                            int LA1_2 = input.LA(2);

                            if ( (LA1_2==AT||LA1_2==BOOLEAN||LA1_2==CLASS||LA1_2==IF||(LA1_2 >= LBRACK && LA1_2 <= LCURLY)||LA1_2==LPAREN||LA1_2==MINUS||LA1_2==NAME||(LA1_2 >= NOT && LA1_2 <= NUMBER)||LA1_2==STRING||LA1_2==WHILE) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Atto.g:38:11: terminator stmt
                    	    {
                    	    pushFollow(FOLLOW_terminator_in_block131);
                    	    terminator3=terminator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_terminator.add(terminator3.getTree());

                    	    pushFollow(FOLLOW_stmt_in_block133);
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


            // Atto.g:38:31: ( terminator )?
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
                    // Atto.g:38:31: terminator
                    {
                    pushFollow(FOLLOW_terminator_in_block139);
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
            // 38:43: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:38:46: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:38:54: ( stmt )*
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
    // Atto.g:41:1: stmt : ( expr | CLASS c= NAME ( EXTENDS p= NAME )? NEWLINE ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? END -> ^( CLASS $c ^( PARENT_CLASS ( $p)? ) ( pair )* ) );
    public final AttoParser.stmt_return stmt() throws RecognitionException {
        AttoParser.stmt_return retval = new AttoParser.stmt_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token c=null;
        Token p=null;
        Token CLASS7=null;
        Token EXTENDS8=null;
        Token NEWLINE9=null;
        Token COMMA11=null;
        Token COMMA12=null;
        Token NEWLINE13=null;
        Token COMMA15=null;
        Token COMMA16=null;
        Token NEWLINE17=null;
        Token END18=null;
        AttoParser.expr_return expr6 =null;

        AttoParser.pair_return pair10 =null;

        AttoParser.pair_return pair14 =null;


        AttoTree c_tree=null;
        AttoTree p_tree=null;
        AttoTree CLASS7_tree=null;
        AttoTree EXTENDS8_tree=null;
        AttoTree NEWLINE9_tree=null;
        AttoTree COMMA11_tree=null;
        AttoTree COMMA12_tree=null;
        AttoTree NEWLINE13_tree=null;
        AttoTree COMMA15_tree=null;
        AttoTree COMMA16_tree=null;
        AttoTree NEWLINE17_tree=null;
        AttoTree END18_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:42:2: ( expr | CLASS c= NAME ( EXTENDS p= NAME )? NEWLINE ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? END -> ^( CLASS $c ^( PARENT_CLASS ( $p)? ) ( pair )* ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==AT||LA11_0==BOOLEAN||LA11_0==IF||(LA11_0 >= LBRACK && LA11_0 <= LCURLY)||LA11_0==LPAREN||LA11_0==MINUS||LA11_0==NAME||(LA11_0 >= NOT && LA11_0 <= NUMBER)||LA11_0==STRING||LA11_0==WHILE) ) {
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
                    // Atto.g:42:4: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt160);
                    expr6=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr6.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:43:4: CLASS c= NAME ( EXTENDS p= NAME )? NEWLINE ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? END
                    {
                    CLASS7=(Token)match(input,CLASS,FOLLOW_CLASS_in_stmt165); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS7);


                    c=(Token)match(input,NAME,FOLLOW_NAME_in_stmt169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAME.add(c);


                    // Atto.g:43:17: ( EXTENDS p= NAME )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==EXTENDS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Atto.g:43:18: EXTENDS p= NAME
                            {
                            EXTENDS8=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_stmt172); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS8);


                            p=(Token)match(input,NAME,FOLLOW_NAME_in_stmt176); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NAME.add(p);


                            }
                            break;

                    }


                    NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE9);


                    // Atto.g:43:43: ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NAME) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Atto.g:43:44: pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                            {
                            pushFollow(FOLLOW_pair_in_stmt183);
                            pair10=pair();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pair.add(pair10.getTree());

                            // Atto.g:43:49: ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
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
                            	    // Atto.g:43:50: ( COMMA | ( COMMA )? NEWLINE ) pair
                            	    {
                            	    // Atto.g:43:50: ( COMMA | ( COMMA )? NEWLINE )
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
                            	            // Atto.g:43:51: COMMA
                            	            {
                            	            COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt187); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);


                            	            }
                            	            break;
                            	        case 2 :
                            	            // Atto.g:43:57: ( COMMA )? NEWLINE
                            	            {
                            	            // Atto.g:43:57: ( COMMA )?
                            	            int alt5=2;
                            	            int LA5_0 = input.LA(1);

                            	            if ( (LA5_0==COMMA) ) {
                            	                alt5=1;
                            	            }
                            	            switch (alt5) {
                            	                case 1 :
                            	                    // Atto.g:43:57: COMMA
                            	                    {
                            	                    COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt189); if (state.failed) return retval; 
                            	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA12);


                            	                    }
                            	                    break;

                            	            }


                            	            NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt192); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE13);


                            	            }
                            	            break;

                            	    }


                            	    pushFollow(FOLLOW_pair_in_stmt195);
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


                    // Atto.g:43:82: ( COMMA | ( COMMA )? NEWLINE )?
                    int alt10=3;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==COMMA) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==END) ) {
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
                            // Atto.g:43:83: COMMA
                            {
                            COMMA15=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt202); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA15);


                            }
                            break;
                        case 2 :
                            // Atto.g:43:89: ( COMMA )? NEWLINE
                            {
                            // Atto.g:43:89: ( COMMA )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==COMMA) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // Atto.g:43:89: COMMA
                                    {
                                    COMMA16=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt204); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA16);


                                    }
                                    break;

                            }


                            NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt207); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE17);


                            }
                            break;

                    }


                    END18=(Token)match(input,END,FOLLOW_END_in_stmt211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END18);


                    // AST REWRITE
                    // elements: p, CLASS, pair, c
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
                    // 44:3: -> ^( CLASS $c ^( PARENT_CLASS ( $p)? ) ( pair )* )
                    {
                        // Atto.g:44:6: ^( CLASS $c ^( PARENT_CLASS ( $p)? ) ( pair )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        stream_CLASS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextNode());

                        // Atto.g:44:17: ^( PARENT_CLASS ( $p)? )
                        {
                        AttoTree root_2 = (AttoTree)adaptor.nil();
                        root_2 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARENT_CLASS, "PARENT_CLASS")
                        , root_2);

                        // Atto.g:44:33: ( $p)?
                        if ( stream_p.hasNext() ) {
                            adaptor.addChild(root_2, stream_p.nextNode());

                        }
                        stream_p.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Atto.g:44:37: ( pair )*
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
    // Atto.g:47:1: terminator : ( SEMICOLON ( NEWLINE )? | NEWLINE );
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
            // Atto.g:48:2: ( SEMICOLON ( NEWLINE )? | NEWLINE )
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
                    // Atto.g:48:4: SEMICOLON ( NEWLINE )?
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    SEMICOLON19=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_terminator244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON19_tree = 
                    (AttoTree)adaptor.create(SEMICOLON19)
                    ;
                    adaptor.addChild(root_0, SEMICOLON19_tree);
                    }

                    // Atto.g:48:14: ( NEWLINE )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NEWLINE) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==EOF||LA12_1==AT||LA12_1==BOOLEAN||LA12_1==CLASS||LA12_1==IF||(LA12_1 >= LBRACK && LA12_1 <= LCURLY)||LA12_1==LPAREN||LA12_1==MINUS||LA12_1==NAME||(LA12_1 >= NEWLINE && LA12_1 <= NUMBER)||LA12_1==RCURLY||LA12_1==STRING||LA12_1==WHILE) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // Atto.g:48:14: NEWLINE
                            {
                            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terminator246); if (state.failed) return retval;
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
                    // Atto.g:48:25: NEWLINE
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terminator251); if (state.failed) return retval;
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
    // Atto.g:51:1: expr : ( ( assign )=> assign | or | if_ | while_ );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.assign_return assign22 =null;

        AttoParser.or_return or23 =null;

        AttoParser.if__return if_24 =null;

        AttoParser.while__return while_25 =null;



        try {
            // Atto.g:52:2: ( ( assign )=> assign | or | if_ | while_ )
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
            case BOOLEAN:
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
                    // Atto.g:52:4: ( assign )=> assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr268);
                    assign22=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign22.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:53:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr273);
                    or23=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or23.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:54:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr278);
                    if_24=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_24.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:55:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr283);
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
    // Atto.g:58:1: assign : postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) ;
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
            // Atto.g:59:2: ( postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) )
            // Atto.g:59:4: postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
            {
            pushFollow(FOLLOW_postfix_in_assign294);
            postfix26=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfix.add(postfix26.getTree());

            // Atto.g:60:4: ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
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
                    // Atto.g:60:6: ASSIGN ( NEWLINE )? expr
                    {
                    ASSIGN27=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN27);


                    // Atto.g:60:13: ( NEWLINE )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NEWLINE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Atto.g:60:13: NEWLINE
                            {
                            NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign304); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE28);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expr_in_assign307);
                    expr29=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());

                    // AST REWRITE
                    // elements: expr, postfix, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 60:27: -> ^( ASSIGN postfix expr )
                    {
                        // Atto.g:60:30: ^( ASSIGN postfix expr )
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
                    // Atto.g:61:6: ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
                    {
                    // Atto.g:61:6: ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
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
                            // Atto.g:61:8: PLUS ASSIGN ( NEWLINE )? expr
                            {
                            PLUS30=(Token)match(input,PLUS,FOLLOW_PLUS_in_assign326); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PLUS.add(PLUS30);


                            ASSIGN31=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign328); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN31);


                            // Atto.g:61:20: ( NEWLINE )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==NEWLINE) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // Atto.g:61:20: NEWLINE
                                    {
                                    NEWLINE32=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign330); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE32);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign333);
                            expr33=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr33.getTree());

                            // AST REWRITE
                            // elements: postfix, PLUS, postfix, ASSIGN, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 61:34: -> ^( ASSIGN postfix ^( PLUS postfix expr ) )
                            {
                                // Atto.g:61:37: ^( ASSIGN postfix ^( PLUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:61:54: ^( PLUS postfix expr )
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
                            // Atto.g:62:8: MINUS ASSIGN ( NEWLINE )? expr
                            {
                            MINUS34=(Token)match(input,MINUS,FOLLOW_MINUS_in_assign358); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MINUS.add(MINUS34);


                            ASSIGN35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign360); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN35);


                            // Atto.g:62:21: ( NEWLINE )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==NEWLINE) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // Atto.g:62:21: NEWLINE
                                    {
                                    NEWLINE36=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign362); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE36);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign365);
                            expr37=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr37.getTree());

                            // AST REWRITE
                            // elements: ASSIGN, postfix, postfix, expr, MINUS
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 62:35: -> ^( ASSIGN postfix ^( MINUS postfix expr ) )
                            {
                                // Atto.g:62:38: ^( ASSIGN postfix ^( MINUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:62:55: ^( MINUS postfix expr )
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
                            // Atto.g:63:8: MUL ASSIGN ( NEWLINE )? expr
                            {
                            MUL38=(Token)match(input,MUL,FOLLOW_MUL_in_assign390); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MUL.add(MUL38);


                            ASSIGN39=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign392); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN39);


                            // Atto.g:63:19: ( NEWLINE )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==NEWLINE) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // Atto.g:63:19: NEWLINE
                                    {
                                    NEWLINE40=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign394); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE40);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign397);
                            expr41=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr41.getTree());

                            // AST REWRITE
                            // elements: postfix, postfix, MUL, expr, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 63:33: -> ^( ASSIGN postfix ^( MUL postfix expr ) )
                            {
                                // Atto.g:63:36: ^( ASSIGN postfix ^( MUL postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:63:53: ^( MUL postfix expr )
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
                            // Atto.g:64:8: DIV ASSIGN ( NEWLINE )? expr
                            {
                            DIV42=(Token)match(input,DIV,FOLLOW_DIV_in_assign422); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIV.add(DIV42);


                            ASSIGN43=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign424); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN43);


                            // Atto.g:64:19: ( NEWLINE )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==NEWLINE) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // Atto.g:64:19: NEWLINE
                                    {
                                    NEWLINE44=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign426); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE44);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign429);
                            expr45=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr45.getTree());

                            // AST REWRITE
                            // elements: postfix, postfix, expr, ASSIGN, DIV
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 64:33: -> ^( ASSIGN postfix ^( DIV postfix expr ) )
                            {
                                // Atto.g:64:36: ^( ASSIGN postfix ^( DIV postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:64:53: ^( DIV postfix expr )
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
                            // Atto.g:65:8: MOD ASSIGN ( NEWLINE )? expr
                            {
                            MOD46=(Token)match(input,MOD,FOLLOW_MOD_in_assign454); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MOD.add(MOD46);


                            ASSIGN47=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign456); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN47);


                            // Atto.g:65:19: ( NEWLINE )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==NEWLINE) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // Atto.g:65:19: NEWLINE
                                    {
                                    NEWLINE48=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign458); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE48);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign461);
                            expr49=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr49.getTree());

                            // AST REWRITE
                            // elements: MOD, postfix, postfix, expr, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 65:33: -> ^( ASSIGN postfix ^( MOD postfix expr ) )
                            {
                                // Atto.g:65:36: ^( ASSIGN postfix ^( MOD postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:65:53: ^( MOD postfix expr )
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
    // Atto.g:70:1: paramsdef : ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) ;
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
            // Atto.g:71:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) )
            // Atto.g:71:4: ( vardef ( COMMA vardef )* )?
            {
            // Atto.g:71:4: ( vardef ( COMMA vardef )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AT||LA24_0==NAME) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Atto.g:71:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_paramsdef502);
                    vardef50=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef50.getTree());

                    // Atto.g:71:12: ( COMMA vardef )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==COMMA) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Atto.g:71:13: COMMA vardef
                    	    {
                    	    COMMA51=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef505); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA51);


                    	    pushFollow(FOLLOW_vardef_in_paramsdef507);
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
            // 71:30: -> ^( PARAMS ( vardef )* )
            {
                // Atto.g:71:33: ^( PARAMS ( vardef )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // Atto.g:71:42: ( vardef )*
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
    // Atto.g:74:1: if_ : IF cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? END -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | THEN then_expr= expr ( ELSE else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token IF53=null;
        Token NEWLINE54=null;
        Token NEWLINE56=null;
        Token END59=null;
        Token THEN60=null;
        Token ELSE61=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block55 =null;

        AttoParser.elif_return elif57 =null;

        AttoParser.else__return else_58 =null;


        AttoTree IF53_tree=null;
        AttoTree NEWLINE54_tree=null;
        AttoTree NEWLINE56_tree=null;
        AttoTree END59_tree=null;
        AttoTree THEN60_tree=null;
        AttoTree ELSE61_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:75:2: ( IF cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? END -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | THEN then_expr= expr ( ELSE else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:75:4: IF cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? END -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | THEN then_expr= expr ( ELSE else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            IF53=(Token)match(input,IF,FOLLOW_IF_in_if_533); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF53);


            pushFollow(FOLLOW_expr_in_if_537);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:76:4: ( NEWLINE block NEWLINE ( elif )* ( else_ )? END -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | THEN then_expr= expr ( ELSE else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NEWLINE) ) {
                alt28=1;
            }
            else if ( (LA28_0==THEN) ) {
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
                    // Atto.g:76:6: NEWLINE block NEWLINE ( elif )* ( else_ )? END
                    {
                    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE54);


                    pushFollow(FOLLOW_block_in_if_547);
                    block55=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block55.getTree());

                    NEWLINE56=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE56);


                    // Atto.g:76:28: ( elif )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==ELIF) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // Atto.g:76:28: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_551);
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


                    // Atto.g:76:34: ( else_ )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ELSE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // Atto.g:76:34: else_
                            {
                            pushFollow(FOLLOW_else__in_if_554);
                            else_58=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_58.getTree());

                            }
                            break;

                    }


                    END59=(Token)match(input,END,FOLLOW_END_in_if_557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END59);


                    // AST REWRITE
                    // elements: else_, block, elif, IF, cond_expr
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
                    // 77:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:77:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:77:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:77:36: ( else_ )?
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
                    // Atto.g:78:6: THEN then_expr= expr ( ELSE else_expr= expr )?
                    {
                    THEN60=(Token)match(input,THEN,FOLLOW_THEN_in_if_585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN60);


                    pushFollow(FOLLOW_expr_in_if_589);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:78:26: ( ELSE else_expr= expr )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==ELSE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // Atto.g:78:27: ELSE else_expr= expr
                            {
                            ELSE61=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_592); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE61);


                            pushFollow(FOLLOW_expr_in_if_596);
                            else_expr=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ELSE, cond_expr, IF, then_expr, else_expr
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
                    // 79:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:79:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:79:35: ( ^( ELSE $else_expr) )?
                        if ( stream_ELSE.hasNext()||stream_else_expr.hasNext() ) {
                            // Atto.g:79:35: ^( ELSE $else_expr)
                            {
                            AttoTree root_2 = (AttoTree)adaptor.nil();
                            root_2 = (AttoTree)adaptor.becomeRoot(
                            stream_ELSE.nextNode()
                            , root_2);

                            adaptor.addChild(root_2, stream_else_expr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ELSE.reset();
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
    // Atto.g:83:1: elif : ELIF expr NEWLINE block NEWLINE -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ELIF62=null;
        Token NEWLINE64=null;
        Token NEWLINE66=null;
        AttoParser.expr_return expr63 =null;

        AttoParser.block_return block65 =null;


        AttoTree ELIF62_tree=null;
        AttoTree NEWLINE64_tree=null;
        AttoTree NEWLINE66_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:84:2: ( ELIF expr NEWLINE block NEWLINE -> ^( ELIF expr block ) )
            // Atto.g:84:4: ELIF expr NEWLINE block NEWLINE
            {
            ELIF62=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(ELIF62);


            pushFollow(FOLLOW_expr_in_elif641);
            expr63=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr63.getTree());

            NEWLINE64=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE64);


            pushFollow(FOLLOW_block_in_elif645);
            block65=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block65.getTree());

            NEWLINE66=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE66);


            // AST REWRITE
            // elements: block, ELIF, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 84:36: -> ^( ELIF expr block )
            {
                // Atto.g:84:39: ^( ELIF expr block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                stream_ELIF.nextNode()
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
    // Atto.g:87:1: else_ : ELSE NEWLINE block NEWLINE -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ELSE67=null;
        Token NEWLINE68=null;
        Token NEWLINE70=null;
        AttoParser.block_return block69 =null;


        AttoTree ELSE67_tree=null;
        AttoTree NEWLINE68_tree=null;
        AttoTree NEWLINE70_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:88:2: ( ELSE NEWLINE block NEWLINE -> ^( ELSE block ) )
            // Atto.g:88:4: ELSE NEWLINE block NEWLINE
            {
            ELSE67=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_668); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE67);


            NEWLINE68=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_670); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE68);


            pushFollow(FOLLOW_block_in_else_672);
            block69=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block69.getTree());

            NEWLINE70=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_675); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE70);


            // AST REWRITE
            // elements: block, ELSE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 88:32: -> ^( ELSE block )
            {
                // Atto.g:88:35: ^( ELSE block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                stream_ELSE.nextNode()
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
    // Atto.g:91:1: while_ : WHILE cond_expr= expr ( NEWLINE block NEWLINE END -> ^( WHILE $cond_expr block ) | THEN then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token WHILE71=null;
        Token NEWLINE72=null;
        Token NEWLINE74=null;
        Token END75=null;
        Token THEN76=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block73 =null;


        AttoTree WHILE71_tree=null;
        AttoTree NEWLINE72_tree=null;
        AttoTree NEWLINE74_tree=null;
        AttoTree END75_tree=null;
        AttoTree THEN76_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:92:2: ( WHILE cond_expr= expr ( NEWLINE block NEWLINE END -> ^( WHILE $cond_expr block ) | THEN then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:92:4: WHILE cond_expr= expr ( NEWLINE block NEWLINE END -> ^( WHILE $cond_expr block ) | THEN then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            WHILE71=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE71);


            pushFollow(FOLLOW_expr_in_while_699);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:93:4: ( NEWLINE block NEWLINE END -> ^( WHILE $cond_expr block ) | THEN then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NEWLINE) ) {
                alt29=1;
            }
            else if ( (LA29_0==THEN) ) {
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
                    // Atto.g:93:6: NEWLINE block NEWLINE END
                    {
                    NEWLINE72=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE72);


                    pushFollow(FOLLOW_block_in_while_709);
                    block73=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block73.getTree());

                    NEWLINE74=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE74);


                    END75=(Token)match(input,END,FOLLOW_END_in_while_713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END75);


                    // AST REWRITE
                    // elements: WHILE, block, cond_expr
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
                    // 94:5: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:94:8: ^( WHILE $cond_expr block )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        stream_WHILE.nextNode()
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
                    // Atto.g:95:6: THEN then_expr= expr
                    {
                    THEN76=(Token)match(input,THEN,FOLLOW_THEN_in_while_736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN76);


                    pushFollow(FOLLOW_expr_in_while_740);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // AST REWRITE
                    // elements: cond_expr, WHILE, then_expr
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
                    // 96:5: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:96:8: ^( WHILE $cond_expr $then_expr)
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        stream_WHILE.nextNode()
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
    // Atto.g:100:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR78=null;
        AttoParser.and_return and77 =null;

        AttoParser.and_return and79 =null;


        AttoTree OR78_tree=null;

        try {
            // Atto.g:101:2: ( and ( OR ^ and )* )
            // Atto.g:101:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or772);
            and77=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and77.getTree());

            // Atto.g:101:8: ( OR ^ and )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==OR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Atto.g:101:9: OR ^ and
            	    {
            	    OR78=(Token)match(input,OR,FOLLOW_OR_in_or775); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR78_tree = 
            	    (AttoTree)adaptor.create(OR78)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR78_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or778);
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
    // Atto.g:104:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND81=null;
        AttoParser.rel_return rel80 =null;

        AttoParser.rel_return rel82 =null;


        AttoTree AND81_tree=null;

        try {
            // Atto.g:105:2: ( rel ( AND ^ rel )* )
            // Atto.g:105:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and791);
            rel80=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel80.getTree());

            // Atto.g:105:8: ( AND ^ rel )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Atto.g:105:9: AND ^ rel
            	    {
            	    AND81=(Token)match(input,AND,FOLLOW_AND_in_and794); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND81_tree = 
            	    (AttoTree)adaptor.create(AND81)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and797);
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
    // Atto.g:108:1: rel : add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE | REVERSE_PIPELINE ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set84=null;
        AttoParser.add_return add83 =null;

        AttoParser.add_return add85 =null;


        AttoTree set84_tree=null;

        try {
            // Atto.g:109:2: ( add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE | REVERSE_PIPELINE ) ^ add )* )
            // Atto.g:109:4: add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE | REVERSE_PIPELINE ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel810);
            add83=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add83.getTree());

            // Atto.g:109:8: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE | REVERSE_PIPELINE ) ^ add )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMPOSITE||LA32_0==EQ||(LA32_0 >= GE && LA32_0 <= GT)||LA32_0==LE||LA32_0==LT||LA32_0==NE||LA32_0==PIPELINE||LA32_0==REVERSE_PIPELINE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Atto.g:109:9: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE | REVERSE_PIPELINE ) ^ add
            	    {
            	    set84=(Token)input.LT(1);

            	    set84=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE||input.LA(1)==REVERSE_PIPELINE ) {
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


            	    pushFollow(FOLLOW_add_in_rel834);
            	    add85=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add85.getTree());

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


    public static class add_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // Atto.g:112:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set87=null;
        AttoParser.mul_return mul86 =null;

        AttoParser.mul_return mul88 =null;


        AttoTree set87_tree=null;

        try {
            // Atto.g:113:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:113:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add847);
            mul86=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul86.getTree());

            // Atto.g:113:8: ( ( PLUS | MINUS ) ^ mul )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MINUS||LA33_0==PLUS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Atto.g:113:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set87=(Token)input.LT(1);

            	    set87=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set87)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add857);
            	    mul88=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul88.getTree());

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
    // $ANTLR end "add"


    public static class mul_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul"
    // Atto.g:116:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set90=null;
        AttoParser.unary_return unary89 =null;

        AttoParser.unary_return unary91 =null;


        AttoTree set90_tree=null;

        try {
            // Atto.g:117:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:117:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul870);
            unary89=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary89.getTree());

            // Atto.g:117:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==DIV||(LA34_0 >= MOD && LA34_0 <= MUL)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Atto.g:117:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set90=(Token)input.LT(1);

            	    set90=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
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


            	    pushFollow(FOLLOW_unary_in_mul882);
            	    unary91=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary91.getTree());

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
    // $ANTLR end "mul"


    public static class unary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // Atto.g:120:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT93=null;
        Token MINUS95=null;
        AttoParser.postfix_return postfix92 =null;

        AttoParser.postfix_return postfix94 =null;

        AttoParser.postfix_return postfix96 =null;


        AttoTree NOT93_tree=null;
        AttoTree MINUS95_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:121:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case AT:
            case BOOLEAN:
            case LBRACK:
            case LCURLY:
            case LPAREN:
            case NAME:
            case NULL:
            case NUMBER:
            case STRING:
                {
                alt35=1;
                }
                break;
            case NOT:
                {
                alt35=2;
                }
                break;
            case MINUS:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // Atto.g:121:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary896);
                    postfix92=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix92.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:122:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT93=(Token)match(input,NOT,FOLLOW_NOT_in_unary901); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT93_tree = 
                    (AttoTree)adaptor.create(NOT93)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT93_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary904);
                    postfix94=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix94.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:123:4: MINUS postfix
                    {
                    MINUS95=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS95);


                    pushFollow(FOLLOW_postfix_in_unary911);
                    postfix96=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix96.getTree());

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
                    // 123:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:123:21: ^( UNARY_MINUS postfix )
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
    // Atto.g:126:1: postfix : ( primary -> primary ) ( LPAREN argsdef RPAREN -> ^( CALL $postfix argsdef ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN98=null;
        Token RPAREN100=null;
        Token LBRACK101=null;
        Token RBRACK103=null;
        Token DOT104=null;
        AttoParser.primary_return primary97 =null;

        AttoParser.argsdef_return argsdef99 =null;

        AttoParser.expr_return expr102 =null;

        AttoParser.primary_return primary105 =null;


        AttoTree LPAREN98_tree=null;
        AttoTree RPAREN100_tree=null;
        AttoTree LBRACK101_tree=null;
        AttoTree RBRACK103_tree=null;
        AttoTree DOT104_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_argsdef=new RewriteRuleSubtreeStream(adaptor,"rule argsdef");
        try {
            // Atto.g:127:2: ( ( primary -> primary ) ( LPAREN argsdef RPAREN -> ^( CALL $postfix argsdef ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) )* )
            // Atto.g:127:4: ( primary -> primary ) ( LPAREN argsdef RPAREN -> ^( CALL $postfix argsdef ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) )*
            {
            // Atto.g:127:4: ( primary -> primary )
            // Atto.g:127:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix934);
            primary97=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary97.getTree());

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
            // 127:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:128:4: ( LPAREN argsdef RPAREN -> ^( CALL $postfix argsdef ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) )*
            loop36:
            do {
                int alt36=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt36=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt36=2;
                    }
                    break;
                case DOT:
                    {
                    alt36=3;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // Atto.g:128:6: LPAREN argsdef RPAREN
            	    {
            	    LPAREN98=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix946); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN98);


            	    pushFollow(FOLLOW_argsdef_in_postfix948);
            	    argsdef99=argsdef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_argsdef.add(argsdef99.getTree());

            	    RPAREN100=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix950); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN100);


            	    // AST REWRITE
            	    // elements: argsdef, postfix
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (AttoTree)adaptor.nil();
            	    // 129:5: -> ^( CALL $postfix argsdef )
            	    {
            	        // Atto.g:129:8: ^( CALL $postfix argsdef )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_argsdef.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Atto.g:130:6: LBRACK expr RBRACK
            	    {
            	    LBRACK101=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix973); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK101);


            	    pushFollow(FOLLOW_expr_in_postfix975);
            	    expr102=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr102.getTree());

            	    RBRACK103=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix977); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK103);


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
            	    // 131:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:131:8: ^( INDEX $postfix expr )
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
            	    // Atto.g:132:6: DOT primary
            	    {
            	    DOT104=(Token)match(input,DOT,FOLLOW_DOT_in_postfix1000); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT104);


            	    pushFollow(FOLLOW_primary_in_postfix1002);
            	    primary105=primary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_primary.add(primary105.getTree());

            	    // AST REWRITE
            	    // elements: primary, postfix
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (AttoTree)adaptor.nil();
            	    // 133:5: -> ^( FIELD_ACCESS $postfix primary )
            	    {
            	        // Atto.g:133:8: ^( FIELD_ACCESS $postfix primary )
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

            	default :
            	    break loop36;
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


    public static class argsdef_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argsdef"
    // Atto.g:137:1: argsdef : ( expr ( COMMA expr )* )? -> ^( ARGS ( expr )* ) ;
    public final AttoParser.argsdef_return argsdef() throws RecognitionException {
        AttoParser.argsdef_return retval = new AttoParser.argsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA107=null;
        AttoParser.expr_return expr106 =null;

        AttoParser.expr_return expr108 =null;


        AttoTree COMMA107_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:138:2: ( ( expr ( COMMA expr )* )? -> ^( ARGS ( expr )* ) )
            // Atto.g:138:4: ( expr ( COMMA expr )* )?
            {
            // Atto.g:138:4: ( expr ( COMMA expr )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==AT||LA38_0==BOOLEAN||LA38_0==IF||(LA38_0 >= LBRACK && LA38_0 <= LCURLY)||LA38_0==LPAREN||LA38_0==MINUS||LA38_0==NAME||(LA38_0 >= NOT && LA38_0 <= NUMBER)||LA38_0==STRING||LA38_0==WHILE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Atto.g:138:5: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_argsdef1036);
                    expr106=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr106.getTree());

                    // Atto.g:138:10: ( COMMA expr )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==COMMA) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Atto.g:138:11: COMMA expr
                    	    {
                    	    COMMA107=(Token)match(input,COMMA,FOLLOW_COMMA_in_argsdef1039); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA107);


                    	    pushFollow(FOLLOW_expr_in_argsdef1041);
                    	    expr108=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr108.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }


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
            // 138:26: -> ^( ARGS ( expr )* )
            {
                // Atto.g:138:29: ^( ARGS ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARGS, "ARGS")
                , root_1);

                // Atto.g:138:36: ( expr )*
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
    // $ANTLR end "argsdef"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:141:1: primary : ( NAME | AT ^ NAME | NUMBER | STRING | BOOLEAN | NULL | LPAREN expr RPAREN -> expr | ( obj )=> obj | fun | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME109=null;
        Token AT110=null;
        Token NAME111=null;
        Token NUMBER112=null;
        Token STRING113=null;
        Token BOOLEAN114=null;
        Token NULL115=null;
        Token LPAREN116=null;
        Token RPAREN118=null;
        AttoParser.expr_return expr117 =null;

        AttoParser.obj_return obj119 =null;

        AttoParser.fun_return fun120 =null;

        AttoParser.array_return array121 =null;


        AttoTree NAME109_tree=null;
        AttoTree AT110_tree=null;
        AttoTree NAME111_tree=null;
        AttoTree NUMBER112_tree=null;
        AttoTree STRING113_tree=null;
        AttoTree BOOLEAN114_tree=null;
        AttoTree NULL115_tree=null;
        AttoTree LPAREN116_tree=null;
        AttoTree RPAREN118_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:142:2: ( NAME | AT ^ NAME | NUMBER | STRING | BOOLEAN | NULL | LPAREN expr RPAREN -> expr | ( obj )=> obj | fun | array )
            int alt39=10;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt39=1;
                }
                break;
            case AT:
                {
                alt39=2;
                }
                break;
            case NUMBER:
                {
                alt39=3;
                }
                break;
            case STRING:
                {
                alt39=4;
                }
                break;
            case BOOLEAN:
                {
                alt39=5;
                }
                break;
            case NULL:
                {
                alt39=6;
                }
                break;
            case LPAREN:
                {
                alt39=7;
                }
                break;
            case LCURLY:
                {
                int LA39_8 = input.LA(2);

                if ( (LA39_8==NEWLINE) ) {
                    int LA39_10 = input.LA(3);

                    if ( (LA39_10==NAME) ) {
                        int LA39_15 = input.LA(4);

                        if ( (LA39_15==COLON) && (synpred2_Atto())) {
                            alt39=8;
                        }
                        else if ( (LA39_15==AND||LA39_15==ASSIGN||LA39_15==COMPOSITE||(LA39_15 >= DIV && LA39_15 <= DOT)||LA39_15==EQ||(LA39_15 >= GE && LA39_15 <= GT)||LA39_15==LBRACK||LA39_15==LE||(LA39_15 >= LPAREN && LA39_15 <= MUL)||(LA39_15 >= NE && LA39_15 <= NEWLINE)||LA39_15==OR||(LA39_15 >= PIPELINE && LA39_15 <= PLUS)||(LA39_15 >= RCURLY && LA39_15 <= REVERSE_PIPELINE)||LA39_15==SEMICOLON) ) {
                            alt39=9;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 15, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA39_10==COMMA) && (synpred2_Atto())) {
                        alt39=8;
                    }
                    else if ( (LA39_10==NEWLINE) ) {
                        int LA39_16 = input.LA(4);

                        if ( (LA39_16==RCURLY) ) {
                            int LA39_19 = input.LA(5);

                            if ( (synpred2_Atto()) ) {
                                alt39=8;
                            }
                            else if ( (true) ) {
                                alt39=9;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 16, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA39_10==RCURLY) ) {
                        int LA39_17 = input.LA(4);

                        if ( (synpred2_Atto()) ) {
                            alt39=8;
                        }
                        else if ( (true) ) {
                            alt39=9;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 17, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA39_10==AT||LA39_10==BOOLEAN||LA39_10==CLASS||LA39_10==IF||(LA39_10 >= LBRACK && LA39_10 <= LCURLY)||LA39_10==LPAREN||LA39_10==MINUS||(LA39_10 >= NOT && LA39_10 <= NUMBER)||LA39_10==SEMICOLON||LA39_10==STRING||LA39_10==WHILE) ) {
                        alt39=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 10, input);

                        throw nvae;

                    }
                }
                else if ( (LA39_8==NAME) ) {
                    int LA39_11 = input.LA(3);

                    if ( (LA39_11==COLON) && (synpred2_Atto())) {
                        alt39=8;
                    }
                    else if ( (LA39_11==AND||(LA39_11 >= ARROW && LA39_11 <= ASSIGN)||LA39_11==COMMA||LA39_11==COMPOSITE||(LA39_11 >= DIV && LA39_11 <= DOT)||LA39_11==EQ||(LA39_11 >= GE && LA39_11 <= GT)||LA39_11==LBRACK||LA39_11==LE||(LA39_11 >= LPAREN && LA39_11 <= MUL)||(LA39_11 >= NE && LA39_11 <= NEWLINE)||LA39_11==OR||(LA39_11 >= PIPELINE && LA39_11 <= PLUS)||(LA39_11 >= RCURLY && LA39_11 <= REVERSE_PIPELINE)||LA39_11==SEMICOLON) ) {
                        alt39=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 11, input);

                        throw nvae;

                    }
                }
                else if ( (LA39_8==COMMA) && (synpred2_Atto())) {
                    alt39=8;
                }
                else if ( (LA39_8==RCURLY) ) {
                    int LA39_13 = input.LA(3);

                    if ( (synpred2_Atto()) ) {
                        alt39=8;
                    }
                    else if ( (true) ) {
                        alt39=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 13, input);

                        throw nvae;

                    }
                }
                else if ( (LA39_8==ARROW||LA39_8==AT||LA39_8==BOOLEAN||LA39_8==CLASS||LA39_8==IF||(LA39_8 >= LBRACK && LA39_8 <= LCURLY)||LA39_8==LPAREN||LA39_8==MINUS||(LA39_8 >= NOT && LA39_8 <= NUMBER)||LA39_8==SEMICOLON||LA39_8==STRING||LA39_8==WHILE) ) {
                    alt39=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 8, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                alt39=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // Atto.g:142:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME109=(Token)match(input,NAME,FOLLOW_NAME_in_primary1066); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME109_tree = 
                    (AttoTree)adaptor.create(NAME109)
                    ;
                    adaptor.addChild(root_0, NAME109_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:143:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT110=(Token)match(input,AT,FOLLOW_AT_in_primary1071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT110_tree = 
                    (AttoTree)adaptor.create(AT110)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT110_tree, root_0);
                    }

                    NAME111=(Token)match(input,NAME,FOLLOW_NAME_in_primary1074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME111_tree = 
                    (AttoTree)adaptor.create(NAME111)
                    ;
                    adaptor.addChild(root_0, NAME111_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:144:4: NUMBER
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NUMBER112=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_primary1079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER112_tree = 
                    (AttoTree)adaptor.create(NUMBER112)
                    ;
                    adaptor.addChild(root_0, NUMBER112_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:145:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING113=(Token)match(input,STRING,FOLLOW_STRING_in_primary1084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING113_tree = 
                    (AttoTree)adaptor.create(STRING113)
                    ;
                    adaptor.addChild(root_0, STRING113_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:146:4: BOOLEAN
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOLEAN114=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primary1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN114_tree = 
                    (AttoTree)adaptor.create(BOOLEAN114)
                    ;
                    adaptor.addChild(root_0, BOOLEAN114_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:147:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL115=(Token)match(input,NULL,FOLLOW_NULL_in_primary1094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL115_tree = 
                    (AttoTree)adaptor.create(NULL115)
                    ;
                    adaptor.addChild(root_0, NULL115_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:148:4: LPAREN expr RPAREN
                    {
                    LPAREN116=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN116);


                    pushFollow(FOLLOW_expr_in_primary1101);
                    expr117=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr117.getTree());

                    RPAREN118=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN118);


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
                    // 148:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:149:4: ( obj )=> obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary1117);
                    obj119=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj119.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:150:4: fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_primary1122);
                    fun120=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun120.getTree());

                    }
                    break;
                case 10 :
                    // Atto.g:151:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary1127);
                    array121=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array121.getTree());

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
    // Atto.g:154:1: obj : LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY122=null;
        Token NEWLINE123=null;
        Token COMMA125=null;
        Token COMMA126=null;
        Token NEWLINE127=null;
        Token COMMA129=null;
        Token COMMA130=null;
        Token NEWLINE131=null;
        Token RCURLY132=null;
        AttoParser.pair_return pair124 =null;

        AttoParser.pair_return pair128 =null;


        AttoTree LCURLY122_tree=null;
        AttoTree NEWLINE123_tree=null;
        AttoTree COMMA125_tree=null;
        AttoTree COMMA126_tree=null;
        AttoTree NEWLINE127_tree=null;
        AttoTree COMMA129_tree=null;
        AttoTree COMMA130_tree=null;
        AttoTree NEWLINE131_tree=null;
        AttoTree RCURLY132_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:155:2: ( LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:155:4: LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY
            {
            LCURLY122=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj1139); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY122);


            // Atto.g:155:11: ( NEWLINE )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==NEWLINE) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Atto.g:155:11: NEWLINE
                    {
                    NEWLINE123=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE123);


                    }
                    break;

            }


            // Atto.g:155:20: ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==NAME) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Atto.g:155:21: pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj1145);
                    pair124=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair124.getTree());

                    // Atto.g:155:26: ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==COMMA) ) {
                            int LA43_1 = input.LA(2);

                            if ( (LA43_1==NEWLINE) ) {
                                int LA43_2 = input.LA(3);

                                if ( (LA43_2==NAME) ) {
                                    alt43=1;
                                }


                            }
                            else if ( (LA43_1==NAME) ) {
                                alt43=1;
                            }


                        }
                        else if ( (LA43_0==NEWLINE) ) {
                            int LA43_2 = input.LA(2);

                            if ( (LA43_2==NAME) ) {
                                alt43=1;
                            }


                        }


                        switch (alt43) {
                    	case 1 :
                    	    // Atto.g:155:27: ( COMMA | ( COMMA )? NEWLINE ) pair
                    	    {
                    	    // Atto.g:155:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( (LA42_0==COMMA) ) {
                    	        int LA42_1 = input.LA(2);

                    	        if ( (LA42_1==NAME) ) {
                    	            alt42=1;
                    	        }
                    	        else if ( (LA42_1==NEWLINE) ) {
                    	            alt42=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 42, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA42_0==NEWLINE) ) {
                    	        alt42=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 42, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt42) {
                    	        case 1 :
                    	            // Atto.g:155:28: COMMA
                    	            {
                    	            COMMA125=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1149); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA125);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:155:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:155:34: ( COMMA )?
                    	            int alt41=2;
                    	            int LA41_0 = input.LA(1);

                    	            if ( (LA41_0==COMMA) ) {
                    	                alt41=1;
                    	            }
                    	            switch (alt41) {
                    	                case 1 :
                    	                    // Atto.g:155:34: COMMA
                    	                    {
                    	                    COMMA126=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1151); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA126);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE127=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1154); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE127);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_obj1157);
                    	    pair128=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair128.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:155:59: ( COMMA | ( COMMA )? NEWLINE )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COMMA) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==RCURLY) ) {
                    alt46=1;
                }
                else if ( (LA46_1==NEWLINE) ) {
                    alt46=2;
                }
            }
            else if ( (LA46_0==NEWLINE) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // Atto.g:155:60: COMMA
                    {
                    COMMA129=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA129);


                    }
                    break;
                case 2 :
                    // Atto.g:155:66: ( COMMA )? NEWLINE
                    {
                    // Atto.g:155:66: ( COMMA )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // Atto.g:155:66: COMMA
                            {
                            COMMA130=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1166); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA130);


                            }
                            break;

                    }


                    NEWLINE131=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE131);


                    }
                    break;

            }


            RCURLY132=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj1173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY132);


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
            // 155:90: -> ^( OBJ ( pair )* )
            {
                // Atto.g:155:93: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:155:99: ( pair )*
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
    // Atto.g:158:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME133=null;
        Token COLON134=null;
        AttoParser.expr_return expr135 =null;


        AttoTree NAME133_tree=null;
        AttoTree COLON134_tree=null;

        try {
            // Atto.g:159:2: ( NAME COLON ^ expr )
            // Atto.g:159:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME133=(Token)match(input,NAME,FOLLOW_NAME_in_pair1193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME133_tree = 
            (AttoTree)adaptor.create(NAME133)
            ;
            adaptor.addChild(root_0, NAME133_tree);
            }

            COLON134=(Token)match(input,COLON,FOLLOW_COLON_in_pair1195); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON134_tree = 
            (AttoTree)adaptor.create(COLON134)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON134_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair1198);
            expr135=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr135.getTree());

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
    // Atto.g:162:1: fun : LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY -> ^( FUN ( paramsdef )? block TEXT[$text] ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY136=null;
        Token ARROW138=null;
        Token NEWLINE139=null;
        Token RCURLY141=null;
        AttoParser.paramsdef_return paramsdef137 =null;

        AttoParser.block_return block140 =null;


        AttoTree LCURLY136_tree=null;
        AttoTree ARROW138_tree=null;
        AttoTree NEWLINE139_tree=null;
        AttoTree RCURLY141_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:163:2: ( LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY -> ^( FUN ( paramsdef )? block TEXT[$text] ) )
            // Atto.g:163:4: LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY
            {
            LCURLY136=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_fun1209); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY136);


            // Atto.g:163:11: ( paramsdef ARROW )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case AT:
                    {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==NAME) ) {
                        int LA47_5 = input.LA(3);

                        if ( (LA47_5==ARROW||LA47_5==COMMA) ) {
                            alt47=1;
                        }
                    }
                    }
                    break;
                case NAME:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==ARROW||LA47_2==COMMA) ) {
                        alt47=1;
                    }
                    }
                    break;
                case ARROW:
                    {
                    alt47=1;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // Atto.g:163:12: paramsdef ARROW
                    {
                    pushFollow(FOLLOW_paramsdef_in_fun1212);
                    paramsdef137=paramsdef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef137.getTree());

                    ARROW138=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun1214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(ARROW138);


                    }
                    break;

            }


            // Atto.g:163:30: ( NEWLINE )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==NEWLINE) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Atto.g:163:30: NEWLINE
                    {
                    NEWLINE139=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_fun1218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE139);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_fun1221);
            block140=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block140.getTree());

            RCURLY141=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_fun1223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY141);


            // AST REWRITE
            // elements: block, paramsdef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 164:3: -> ^( FUN ( paramsdef )? block TEXT[$text] )
            {
                // Atto.g:164:6: ^( FUN ( paramsdef )? block TEXT[$text] )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(FUN, "FUN")
                , root_1);

                // Atto.g:164:12: ( paramsdef )?
                if ( stream_paramsdef.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramsdef.nextTree());

                }
                stream_paramsdef.reset();

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_1, 
                (AttoTree)adaptor.create(TEXT, input.toString(retval.start,input.LT(-1)))
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
    // $ANTLR end "fun"


    public static class array_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // Atto.g:167:1: array : LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK142=null;
        Token NEWLINE143=null;
        Token COMMA145=null;
        Token COMMA146=null;
        Token NEWLINE147=null;
        Token COMMA149=null;
        Token COMMA150=null;
        Token NEWLINE151=null;
        Token RBRACK152=null;
        AttoParser.expr_return expr144 =null;

        AttoParser.expr_return expr148 =null;


        AttoTree LBRACK142_tree=null;
        AttoTree NEWLINE143_tree=null;
        AttoTree COMMA145_tree=null;
        AttoTree COMMA146_tree=null;
        AttoTree NEWLINE147_tree=null;
        AttoTree COMMA149_tree=null;
        AttoTree COMMA150_tree=null;
        AttoTree NEWLINE151_tree=null;
        AttoTree RBRACK152_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:168:2: ( LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:168:4: LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK
            {
            LBRACK142=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK142);


            // Atto.g:168:11: ( NEWLINE )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NEWLINE) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Atto.g:168:11: NEWLINE
                    {
                    NEWLINE143=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE143);


                    }
                    break;

            }


            // Atto.g:168:20: ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==AT||LA53_0==BOOLEAN||LA53_0==IF||(LA53_0 >= LBRACK && LA53_0 <= LCURLY)||LA53_0==LPAREN||LA53_0==MINUS||LA53_0==NAME||(LA53_0 >= NOT && LA53_0 <= NUMBER)||LA53_0==STRING||LA53_0==WHILE) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Atto.g:168:21: expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1258);
                    expr144=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr144.getTree());

                    // Atto.g:168:26: ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==COMMA) ) {
                            int LA52_1 = input.LA(2);

                            if ( (LA52_1==NEWLINE) ) {
                                int LA52_2 = input.LA(3);

                                if ( (LA52_2==AT||LA52_2==BOOLEAN||LA52_2==IF||(LA52_2 >= LBRACK && LA52_2 <= LCURLY)||LA52_2==LPAREN||LA52_2==MINUS||LA52_2==NAME||(LA52_2 >= NOT && LA52_2 <= NUMBER)||LA52_2==STRING||LA52_2==WHILE) ) {
                                    alt52=1;
                                }


                            }
                            else if ( (LA52_1==AT||LA52_1==BOOLEAN||LA52_1==IF||(LA52_1 >= LBRACK && LA52_1 <= LCURLY)||LA52_1==LPAREN||LA52_1==MINUS||LA52_1==NAME||(LA52_1 >= NOT && LA52_1 <= NUMBER)||LA52_1==STRING||LA52_1==WHILE) ) {
                                alt52=1;
                            }


                        }
                        else if ( (LA52_0==NEWLINE) ) {
                            int LA52_2 = input.LA(2);

                            if ( (LA52_2==AT||LA52_2==BOOLEAN||LA52_2==IF||(LA52_2 >= LBRACK && LA52_2 <= LCURLY)||LA52_2==LPAREN||LA52_2==MINUS||LA52_2==NAME||(LA52_2 >= NOT && LA52_2 <= NUMBER)||LA52_2==STRING||LA52_2==WHILE) ) {
                                alt52=1;
                            }


                        }


                        switch (alt52) {
                    	case 1 :
                    	    // Atto.g:168:27: ( COMMA | ( COMMA )? NEWLINE ) expr
                    	    {
                    	    // Atto.g:168:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt51=2;
                    	    int LA51_0 = input.LA(1);

                    	    if ( (LA51_0==COMMA) ) {
                    	        int LA51_1 = input.LA(2);

                    	        if ( (LA51_1==AT||LA51_1==BOOLEAN||LA51_1==IF||(LA51_1 >= LBRACK && LA51_1 <= LCURLY)||LA51_1==LPAREN||LA51_1==MINUS||LA51_1==NAME||(LA51_1 >= NOT && LA51_1 <= NUMBER)||LA51_1==STRING||LA51_1==WHILE) ) {
                    	            alt51=1;
                    	        }
                    	        else if ( (LA51_1==NEWLINE) ) {
                    	            alt51=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 51, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA51_0==NEWLINE) ) {
                    	        alt51=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 51, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt51) {
                    	        case 1 :
                    	            // Atto.g:168:28: COMMA
                    	            {
                    	            COMMA145=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1262); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA145);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:168:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:168:34: ( COMMA )?
                    	            int alt50=2;
                    	            int LA50_0 = input.LA(1);

                    	            if ( (LA50_0==COMMA) ) {
                    	                alt50=1;
                    	            }
                    	            switch (alt50) {
                    	                case 1 :
                    	                    // Atto.g:168:34: COMMA
                    	                    {
                    	                    COMMA146=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1264); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA146);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE147=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1267); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE147);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_expr_in_array1270);
                    	    expr148=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr148.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:168:60: ( COMMA | ( COMMA )? NEWLINE )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==COMMA) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==RBRACK) ) {
                    alt55=1;
                }
                else if ( (LA55_1==NEWLINE) ) {
                    alt55=2;
                }
            }
            else if ( (LA55_0==NEWLINE) ) {
                alt55=2;
            }
            switch (alt55) {
                case 1 :
                    // Atto.g:168:61: COMMA
                    {
                    COMMA149=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA149);


                    }
                    break;
                case 2 :
                    // Atto.g:168:67: ( COMMA )? NEWLINE
                    {
                    // Atto.g:168:67: ( COMMA )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==COMMA) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // Atto.g:168:67: COMMA
                            {
                            COMMA150=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1280); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA150);


                            }
                            break;

                    }


                    NEWLINE151=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE151);


                    }
                    break;

            }


            RBRACK152=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK152);


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
            // 168:91: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:168:94: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:168:102: ( expr )*
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
    // Atto.g:171:1: vardef : ( AT )? NAME -> ^( VARDEF ( AT )? NAME ) ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AT153=null;
        Token NAME154=null;

        AttoTree AT153_tree=null;
        AttoTree NAME154_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

        try {
            // Atto.g:172:2: ( ( AT )? NAME -> ^( VARDEF ( AT )? NAME ) )
            // Atto.g:172:4: ( AT )? NAME
            {
            // Atto.g:172:4: ( AT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==AT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // Atto.g:172:4: AT
                    {
                    AT153=(Token)match(input,AT,FOLLOW_AT_in_vardef1307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT.add(AT153);


                    }
                    break;

            }


            NAME154=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1310); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME154);


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
            // 172:13: -> ^( VARDEF ( AT )? NAME )
            {
                // Atto.g:172:16: ^( VARDEF ( AT )? NAME )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(VARDEF, "VARDEF")
                , root_1);

                // Atto.g:172:25: ( AT )?
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
        // Atto.g:52:4: ( assign )
        // Atto.g:52:5: assign
        {
        pushFollow(FOLLOW_assign_in_synpred1_Atto264);
        assign();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Atto

    // $ANTLR start synpred2_Atto
    public final void synpred2_Atto_fragment() throws RecognitionException {
        // Atto.g:149:4: ( obj )
        // Atto.g:149:5: obj
        {
        pushFollow(FOLLOW_obj_in_synpred2_Atto1113);
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


 

    public static final BitSet FOLLOW_block_in_root115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block128 = new BitSet(new long[]{0x2000800000000002L});
    public static final BitSet FOLLOW_terminator_in_block131 = new BitSet(new long[]{0x0007251900002A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_stmt_in_block133 = new BitSet(new long[]{0x2000800000000002L});
    public static final BitSet FOLLOW_terminator_in_block139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stmt165 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NAME_in_stmt169 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_EXTENDS_in_stmt172 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NAME_in_stmt176 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt180 = new BitSet(new long[]{0x0000A00001008000L});
    public static final BitSet FOLLOW_pair_in_stmt183 = new BitSet(new long[]{0x0000800001008000L});
    public static final BitSet FOLLOW_COMMA_in_stmt187 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_stmt189 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt192 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_pair_in_stmt195 = new BitSet(new long[]{0x0000800001008000L});
    public static final BitSet FOLLOW_COMMA_in_stmt202 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_stmt204 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt207 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_END_in_stmt211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_terminator244 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terminator246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terminator251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign294 = new BitSet(new long[]{0x01001C0000100100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign302 = new BitSet(new long[]{0x0007A51900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_assign304 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_assign307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_assign326 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign328 = new BitSet(new long[]{0x0007A51900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_assign330 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_assign333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_assign358 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign360 = new BitSet(new long[]{0x0007A51900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_assign362 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_assign365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_assign390 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign392 = new BitSet(new long[]{0x0007A51900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_assign394 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_assign397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_assign422 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign424 = new BitSet(new long[]{0x0007A51900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_assign426 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_assign429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_assign454 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign456 = new BitSet(new long[]{0x0007A51900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_assign458 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_assign461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef502 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef505 = new BitSet(new long[]{0x0000200000000200L});
    public static final BitSet FOLLOW_vardef_in_paramsdef507 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_IF_in_if_533 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_if_537 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_if_545 = new BitSet(new long[]{0x2007A51900002A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_block_in_if_547 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_if_549 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_elif_in_if_551 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_else__in_if_554 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_END_in_if_557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_if_585 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_if_589 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ELSE_in_if_592 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_if_596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif639 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_elif641 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif643 = new BitSet(new long[]{0x2007A51900002A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_block_in_elif645 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_668 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_670 = new BitSet(new long[]{0x2007A51900002A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_block_in_else_672 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_695 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_while_699 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_while_707 = new BitSet(new long[]{0x2007A51900002A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_block_in_while_709 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_while_711 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_END_in_while_713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_while_736 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_while_740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or772 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_or775 = new BitSet(new long[]{0x0007251800000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or778 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rel_in_and791 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and794 = new BitSet(new long[]{0x0007251800000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_rel_in_and797 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel810 = new BitSet(new long[]{0x0880422062020002L});
    public static final BitSet FOLLOW_set_in_rel813 = new BitSet(new long[]{0x0007251800000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_rel834 = new BitSet(new long[]{0x0880422062020002L});
    public static final BitSet FOLLOW_mul_in_add847 = new BitSet(new long[]{0x0100040000000002L});
    public static final BitSet FOLLOW_set_in_add850 = new BitSet(new long[]{0x0007251800000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_mul_in_add857 = new BitSet(new long[]{0x0100040000000002L});
    public static final BitSet FOLLOW_unary_in_mul870 = new BitSet(new long[]{0x0000180000100002L});
    public static final BitSet FOLLOW_set_in_mul873 = new BitSet(new long[]{0x0007251800000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mul882 = new BitSet(new long[]{0x0000180000100002L});
    public static final BitSet FOLLOW_postfix_in_unary896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary901 = new BitSet(new long[]{0x0006211800000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_unary904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary909 = new BitSet(new long[]{0x0006211800000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_unary911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix934 = new BitSet(new long[]{0x0000010800200002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix946 = new BitSet(new long[]{0x1007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_argsdef_in_postfix948 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix950 = new BitSet(new long[]{0x0000010800200002L});
    public static final BitSet FOLLOW_LBRACK_in_postfix973 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_postfix975 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix977 = new BitSet(new long[]{0x0000010800200002L});
    public static final BitSet FOLLOW_DOT_in_postfix1000 = new BitSet(new long[]{0x0006211800000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix1002 = new BitSet(new long[]{0x0000010800200002L});
    public static final BitSet FOLLOW_expr_in_argsdef1036 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_argsdef1039 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_argsdef1041 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_NAME_in_primary1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary1071 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NAME_in_primary1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_primary1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primary1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary1099 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_primary1101 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_primary1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj1139 = new BitSet(new long[]{0x0400A00000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1141 = new BitSet(new long[]{0x0400A00000008000L});
    public static final BitSet FOLLOW_pair_in_obj1145 = new BitSet(new long[]{0x0400800000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1149 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1151 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1154 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_pair_in_obj1157 = new BitSet(new long[]{0x0400800000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1164 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1166 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1169 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair1193 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COLON_in_pair1195 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_pair1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_fun1209 = new BitSet(new long[]{0x2407A51900002A80L,0x0000000000000082L});
    public static final BitSet FOLLOW_paramsdef_in_fun1212 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_fun1214 = new BitSet(new long[]{0x2407A51900002A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_fun1218 = new BitSet(new long[]{0x2407A51900002A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_block_in_fun1221 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_fun1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1252 = new BitSet(new long[]{0x0207A51900008A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_array1254 = new BitSet(new long[]{0x0207A51900008A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_array1258 = new BitSet(new long[]{0x0200800000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1262 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_COMMA_in_array1264 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1267 = new BitSet(new long[]{0x0007251900000A00L,0x0000000000000082L});
    public static final BitSet FOLLOW_expr_in_array1270 = new BitSet(new long[]{0x0200800000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1278 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array1280 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1283 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_vardef1307 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NAME_in_vardef1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_synpred2_Atto1113 = new BitSet(new long[]{0x0000000000000002L});

}