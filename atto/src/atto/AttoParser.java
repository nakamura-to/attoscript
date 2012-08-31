// $ANTLR 3.4 Atto.g 2012-08-31 20:00:44

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APPLY", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "CLASS", "COLON", "COMMA", "COMPOSITE", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "EXTENDS", "FIELD_ACCESS", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "LBRACK", "LCURLY", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "NUMBER", "OBJ", "OR", "PARAMS", "PIPELINE", "PLUS", "RBRACK", "RCURLY", "RPAREN", "R_PIPELINE", "SEMICOLON", "SEND", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'end'", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__67=67;
    public static final int T__68=68;
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
    public static final int FUN=26;
    public static final int GE=27;
    public static final int GT=28;
    public static final int ID_CHAR=29;
    public static final int IF=30;
    public static final int INDENT=31;
    public static final int INDEX=32;
    public static final int LBRACK=33;
    public static final int LCURLY=34;
    public static final int LE=35;
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
    public static final int RBRACK=54;
    public static final int RCURLY=55;
    public static final int RPAREN=56;
    public static final int R_PIPELINE=57;
    public static final int SEMICOLON=58;
    public static final int SEND=59;
    public static final int SPACE=60;
    public static final int STMT=61;
    public static final int STRING=62;
    public static final int UNARY_MINUS=63;
    public static final int UPPER=64;
    public static final int WHILE=65;
    public static final int WS=66;

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


            pushFollow(FOLLOW_block_in_root129);
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

            if ( (LA2_0==AT||LA2_0==BOOL||LA2_0==IF||(LA2_0 >= LBRACK && LA2_0 <= LCURLY)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NAME||(LA2_0 >= NOT && LA2_0 <= NUMBER)||LA2_0==STRING||LA2_0==WHILE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Atto.g:29:5: stmt ( terminator stmt )*
                    {
                    pushFollow(FOLLOW_stmt_in_block141);
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

                                if ( (LA1_4==AT||LA1_4==BOOL||LA1_4==IF||(LA1_4 >= LBRACK && LA1_4 <= LCURLY)||LA1_4==LPAREN||LA1_4==MINUS||LA1_4==NAME||(LA1_4 >= NOT && LA1_4 <= NUMBER)||LA1_4==STRING||LA1_4==WHILE) ) {
                                    alt1=1;
                                }


                            }
                            else if ( (LA1_1==AT||LA1_1==BOOL||LA1_1==IF||(LA1_1 >= LBRACK && LA1_1 <= LCURLY)||LA1_1==LPAREN||LA1_1==MINUS||LA1_1==NAME||(LA1_1 >= NOT && LA1_1 <= NUMBER)||LA1_1==STRING||LA1_1==WHILE) ) {
                                alt1=1;
                            }


                        }
                        else if ( (LA1_0==NEWLINE) ) {
                            int LA1_2 = input.LA(2);

                            if ( (LA1_2==AT||LA1_2==BOOL||LA1_2==IF||(LA1_2 >= LBRACK && LA1_2 <= LCURLY)||LA1_2==LPAREN||LA1_2==MINUS||LA1_2==NAME||(LA1_2 >= NOT && LA1_2 <= NUMBER)||LA1_2==STRING||LA1_2==WHILE) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Atto.g:29:11: terminator stmt
                    	    {
                    	    pushFollow(FOLLOW_terminator_in_block144);
                    	    terminator3=terminator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_terminator.add(terminator3.getTree());

                    	    pushFollow(FOLLOW_stmt_in_block146);
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
                    pushFollow(FOLLOW_terminator_in_block152);
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
    // Atto.g:32:1: stmt : expr ;
    public final AttoParser.stmt_return stmt() throws RecognitionException {
        AttoParser.stmt_return retval = new AttoParser.stmt_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.expr_return expr6 =null;



        try {
            // Atto.g:33:2: ( expr )
            // Atto.g:33:4: expr
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_stmt174);
            expr6=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr6.getTree());

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
    // Atto.g:36:1: terminator : ( SEMICOLON ( NEWLINE )? | NEWLINE );
    public final AttoParser.terminator_return terminator() throws RecognitionException {
        AttoParser.terminator_return retval = new AttoParser.terminator_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token SEMICOLON7=null;
        Token NEWLINE8=null;
        Token NEWLINE9=null;

        AttoTree SEMICOLON7_tree=null;
        AttoTree NEWLINE8_tree=null;
        AttoTree NEWLINE9_tree=null;

        try {
            // Atto.g:37:2: ( SEMICOLON ( NEWLINE )? | NEWLINE )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEMICOLON) ) {
                alt5=1;
            }
            else if ( (LA5_0==NEWLINE) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Atto.g:37:4: SEMICOLON ( NEWLINE )?
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_terminator185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON7_tree = 
                    (AttoTree)adaptor.create(SEMICOLON7)
                    ;
                    adaptor.addChild(root_0, SEMICOLON7_tree);
                    }

                    // Atto.g:37:14: ( NEWLINE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NEWLINE) ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==EOF||LA4_1==AT||LA4_1==BOOL||LA4_1==IF||(LA4_1 >= LBRACK && LA4_1 <= LCURLY)||LA4_1==LPAREN||LA4_1==MINUS||LA4_1==NAME||(LA4_1 >= NEWLINE && LA4_1 <= NUMBER)||LA4_1==RCURLY||LA4_1==STRING||LA4_1==WHILE) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // Atto.g:37:14: NEWLINE
                            {
                            NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terminator187); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NEWLINE8_tree = 
                            (AttoTree)adaptor.create(NEWLINE8)
                            ;
                            adaptor.addChild(root_0, NEWLINE8_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Atto.g:37:23: NEWLINE
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terminator190); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE9_tree = 
                    (AttoTree)adaptor.create(NEWLINE9)
                    ;
                    adaptor.addChild(root_0, NEWLINE9_tree);
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
    // Atto.g:40:1: expr : ( ( assign )=> assign | or | if_ | while_ );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.assign_return assign10 =null;

        AttoParser.or_return or11 =null;

        AttoParser.if__return if_12 =null;

        AttoParser.while__return while_13 =null;



        try {
            // Atto.g:41:2: ( ( assign )=> assign | or | if_ | while_ )
            int alt6=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA6_1 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case AT:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
                {
                int LA6_3 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA6_4 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;

                }
                }
                break;
            case BOOL:
                {
                int LA6_5 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA6_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 6, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA6_7 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 7, input);

                    throw nvae;

                }
                }
                break;
            case LCURLY:
                {
                int LA6_8 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 8, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                int LA6_9 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 9, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
            case NOT:
                {
                alt6=2;
                }
                break;
            case IF:
                {
                alt6=3;
                }
                break;
            case WHILE:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // Atto.g:41:4: ( assign )=> assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr207);
                    assign10=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign10.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:42:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr212);
                    or11=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or11.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:43:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr217);
                    if_12=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_12.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:44:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr222);
                    while_13=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_13.getTree());

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
    // Atto.g:48:1: assign : postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN15=null;
        Token NEWLINE16=null;
        Token PLUS18=null;
        Token ASSIGN19=null;
        Token NEWLINE20=null;
        Token MINUS22=null;
        Token ASSIGN23=null;
        Token NEWLINE24=null;
        Token MUL26=null;
        Token ASSIGN27=null;
        Token NEWLINE28=null;
        Token DIV30=null;
        Token ASSIGN31=null;
        Token NEWLINE32=null;
        Token MOD34=null;
        Token ASSIGN35=null;
        Token NEWLINE36=null;
        AttoParser.postfix_return postfix14 =null;

        AttoParser.expr_return expr17 =null;

        AttoParser.expr_return expr21 =null;

        AttoParser.expr_return expr25 =null;

        AttoParser.expr_return expr29 =null;

        AttoParser.expr_return expr33 =null;

        AttoParser.expr_return expr37 =null;


        AttoTree ASSIGN15_tree=null;
        AttoTree NEWLINE16_tree=null;
        AttoTree PLUS18_tree=null;
        AttoTree ASSIGN19_tree=null;
        AttoTree NEWLINE20_tree=null;
        AttoTree MINUS22_tree=null;
        AttoTree ASSIGN23_tree=null;
        AttoTree NEWLINE24_tree=null;
        AttoTree MUL26_tree=null;
        AttoTree ASSIGN27_tree=null;
        AttoTree NEWLINE28_tree=null;
        AttoTree DIV30_tree=null;
        AttoTree ASSIGN31_tree=null;
        AttoTree NEWLINE32_tree=null;
        AttoTree MOD34_tree=null;
        AttoTree ASSIGN35_tree=null;
        AttoTree NEWLINE36_tree=null;
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
            // Atto.g:49:2: ( postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) )
            // Atto.g:49:4: postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
            {
            pushFollow(FOLLOW_postfix_in_assign234);
            postfix14=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfix.add(postfix14.getTree());

            // Atto.g:50:4: ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ASSIGN) ) {
                alt14=1;
            }
            else if ( (LA14_0==DIV||(LA14_0 >= MINUS && LA14_0 <= MUL)||LA14_0==PLUS) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Atto.g:50:6: ASSIGN ( NEWLINE )? expr
                    {
                    ASSIGN15=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN15);


                    // Atto.g:50:13: ( NEWLINE )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NEWLINE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Atto.g:50:13: NEWLINE
                            {
                            NEWLINE16=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign244); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE16);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expr_in_assign247);
                    expr17=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr17.getTree());

                    // AST REWRITE
                    // elements: ASSIGN, expr, postfix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 50:27: -> ^( ASSIGN postfix expr )
                    {
                        // Atto.g:50:30: ^( ASSIGN postfix expr )
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
                    // Atto.g:51:6: ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
                    {
                    // Atto.g:51:6: ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
                    int alt13=5;
                    switch ( input.LA(1) ) {
                    case PLUS:
                        {
                        alt13=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt13=2;
                        }
                        break;
                    case MUL:
                        {
                        alt13=3;
                        }
                        break;
                    case DIV:
                        {
                        alt13=4;
                        }
                        break;
                    case MOD:
                        {
                        alt13=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // Atto.g:51:8: PLUS ASSIGN ( NEWLINE )? expr
                            {
                            PLUS18=(Token)match(input,PLUS,FOLLOW_PLUS_in_assign266); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PLUS.add(PLUS18);


                            ASSIGN19=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign268); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN19);


                            // Atto.g:51:20: ( NEWLINE )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==NEWLINE) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // Atto.g:51:20: NEWLINE
                                    {
                                    NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign270); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE20);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign273);
                            expr21=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr21.getTree());

                            // AST REWRITE
                            // elements: PLUS, postfix, expr, ASSIGN, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 51:34: -> ^( ASSIGN postfix ^( PLUS postfix expr ) )
                            {
                                // Atto.g:51:37: ^( ASSIGN postfix ^( PLUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:51:54: ^( PLUS postfix expr )
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
                            // Atto.g:52:8: MINUS ASSIGN ( NEWLINE )? expr
                            {
                            MINUS22=(Token)match(input,MINUS,FOLLOW_MINUS_in_assign298); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MINUS.add(MINUS22);


                            ASSIGN23=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign300); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN23);


                            // Atto.g:52:21: ( NEWLINE )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==NEWLINE) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // Atto.g:52:21: NEWLINE
                                    {
                                    NEWLINE24=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign302); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE24);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign305);
                            expr25=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr25.getTree());

                            // AST REWRITE
                            // elements: ASSIGN, expr, MINUS, postfix, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 52:35: -> ^( ASSIGN postfix ^( MINUS postfix expr ) )
                            {
                                // Atto.g:52:38: ^( ASSIGN postfix ^( MINUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:52:55: ^( MINUS postfix expr )
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
                            // Atto.g:53:8: MUL ASSIGN ( NEWLINE )? expr
                            {
                            MUL26=(Token)match(input,MUL,FOLLOW_MUL_in_assign330); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MUL.add(MUL26);


                            ASSIGN27=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign332); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN27);


                            // Atto.g:53:19: ( NEWLINE )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NEWLINE) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // Atto.g:53:19: NEWLINE
                                    {
                                    NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign334); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE28);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign337);
                            expr29=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());

                            // AST REWRITE
                            // elements: postfix, postfix, MUL, ASSIGN, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 53:33: -> ^( ASSIGN postfix ^( MUL postfix expr ) )
                            {
                                // Atto.g:53:36: ^( ASSIGN postfix ^( MUL postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:53:53: ^( MUL postfix expr )
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
                            // Atto.g:54:8: DIV ASSIGN ( NEWLINE )? expr
                            {
                            DIV30=(Token)match(input,DIV,FOLLOW_DIV_in_assign362); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIV.add(DIV30);


                            ASSIGN31=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign364); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN31);


                            // Atto.g:54:19: ( NEWLINE )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==NEWLINE) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // Atto.g:54:19: NEWLINE
                                    {
                                    NEWLINE32=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign366); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE32);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign369);
                            expr33=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr33.getTree());

                            // AST REWRITE
                            // elements: expr, postfix, postfix, DIV, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 54:33: -> ^( ASSIGN postfix ^( DIV postfix expr ) )
                            {
                                // Atto.g:54:36: ^( ASSIGN postfix ^( DIV postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:54:53: ^( DIV postfix expr )
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
                            // Atto.g:55:8: MOD ASSIGN ( NEWLINE )? expr
                            {
                            MOD34=(Token)match(input,MOD,FOLLOW_MOD_in_assign394); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MOD.add(MOD34);


                            ASSIGN35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign396); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN35);


                            // Atto.g:55:19: ( NEWLINE )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NEWLINE) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // Atto.g:55:19: NEWLINE
                                    {
                                    NEWLINE36=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign398); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE36);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign401);
                            expr37=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr37.getTree());

                            // AST REWRITE
                            // elements: MOD, postfix, postfix, ASSIGN, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 55:33: -> ^( ASSIGN postfix ^( MOD postfix expr ) )
                            {
                                // Atto.g:55:36: ^( ASSIGN postfix ^( MOD postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:55:53: ^( MOD postfix expr )
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
    // Atto.g:60:1: paramsdef : ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) ;
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA39=null;
        AttoParser.vardef_return vardef38 =null;

        AttoParser.vardef_return vardef40 =null;


        AttoTree COMMA39_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:61:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) )
            // Atto.g:61:4: ( vardef ( COMMA vardef )* )?
            {
            // Atto.g:61:4: ( vardef ( COMMA vardef )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NAME) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Atto.g:61:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_paramsdef442);
                    vardef38=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef38.getTree());

                    // Atto.g:61:12: ( COMMA vardef )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Atto.g:61:13: COMMA vardef
                    	    {
                    	    COMMA39=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef445); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA39);


                    	    pushFollow(FOLLOW_vardef_in_paramsdef447);
                    	    vardef40=vardef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_vardef.add(vardef40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
            // 61:30: -> ^( PARAMS ( vardef )* )
            {
                // Atto.g:61:33: ^( PARAMS ( vardef )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // Atto.g:61:42: ( vardef )*
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
    // Atto.g:64:1: if_ : 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal41=null;
        Token NEWLINE42=null;
        Token NEWLINE44=null;
        Token string_literal47=null;
        Token string_literal48=null;
        Token string_literal49=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block43 =null;

        AttoParser.elif_return elif45 =null;

        AttoParser.else__return else_46 =null;


        AttoTree string_literal41_tree=null;
        AttoTree NEWLINE42_tree=null;
        AttoTree NEWLINE44_tree=null;
        AttoTree string_literal47_tree=null;
        AttoTree string_literal48_tree=null;
        AttoTree string_literal49_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:65:2: ( 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:65:4: 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal41=(Token)match(input,IF,FOLLOW_IF_in_if_473); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal41);


            pushFollow(FOLLOW_expr_in_if_477);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:66:4: ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NEWLINE) ) {
                alt20=1;
            }
            else if ( (LA20_0==68) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Atto.g:66:6: NEWLINE block NEWLINE ( elif )* ( else_ )? 'end'
                    {
                    NEWLINE42=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE42);


                    pushFollow(FOLLOW_block_in_if_487);
                    block43=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block43.getTree());

                    NEWLINE44=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE44);


                    // Atto.g:66:28: ( elif )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==ELIF) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Atto.g:66:28: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_491);
                    	    elif45=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    // Atto.g:66:34: ( else_ )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ELSE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Atto.g:66:34: else_
                            {
                            pushFollow(FOLLOW_else__in_if_494);
                            else_46=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_46.getTree());

                            }
                            break;

                    }


                    string_literal47=(Token)match(input,67,FOLLOW_67_in_if_497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal47);


                    // AST REWRITE
                    // elements: cond_expr, else_, block, elif
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
                    // 67:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:67:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:67:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:67:36: ( else_ )?
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
                    // Atto.g:68:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal48=(Token)match(input,68,FOLLOW_68_in_if_525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal48);


                    pushFollow(FOLLOW_expr_in_if_529);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:68:28: ( 'else' else_expr= expr )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ELSE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Atto.g:68:29: 'else' else_expr= expr
                            {
                            string_literal49=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_532); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal49);


                            pushFollow(FOLLOW_expr_in_if_536);
                            else_expr=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: then_expr, else_expr, cond_expr
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
                    // 69:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:69:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:69:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:69:35: ^( ELSE $else_expr)
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
    // Atto.g:73:1: elif : 'elif' expr NEWLINE block NEWLINE -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal50=null;
        Token NEWLINE52=null;
        Token NEWLINE54=null;
        AttoParser.expr_return expr51 =null;

        AttoParser.block_return block53 =null;


        AttoTree string_literal50_tree=null;
        AttoTree NEWLINE52_tree=null;
        AttoTree NEWLINE54_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:74:2: ( 'elif' expr NEWLINE block NEWLINE -> ^( ELIF expr block ) )
            // Atto.g:74:4: 'elif' expr NEWLINE block NEWLINE
            {
            string_literal50=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal50);


            pushFollow(FOLLOW_expr_in_elif581);
            expr51=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr51.getTree());

            NEWLINE52=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif583); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE52);


            pushFollow(FOLLOW_block_in_elif585);
            block53=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block53.getTree());

            NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif587); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE54);


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
            // 74:38: -> ^( ELIF expr block )
            {
                // Atto.g:74:41: ^( ELIF expr block )
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
    // Atto.g:77:1: else_ : 'else' NEWLINE block NEWLINE -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal55=null;
        Token NEWLINE56=null;
        Token NEWLINE58=null;
        AttoParser.block_return block57 =null;


        AttoTree string_literal55_tree=null;
        AttoTree NEWLINE56_tree=null;
        AttoTree NEWLINE58_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:78:2: ( 'else' NEWLINE block NEWLINE -> ^( ELSE block ) )
            // Atto.g:78:4: 'else' NEWLINE block NEWLINE
            {
            string_literal55=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal55);


            NEWLINE56=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_610); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE56);


            pushFollow(FOLLOW_block_in_else_612);
            block57=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block57.getTree());

            NEWLINE58=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_615); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE58);


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
            // 78:34: -> ^( ELSE block )
            {
                // Atto.g:78:37: ^( ELSE block )
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
    // Atto.g:81:1: while_ : 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal59=null;
        Token NEWLINE60=null;
        Token NEWLINE62=null;
        Token string_literal63=null;
        Token string_literal64=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block61 =null;


        AttoTree string_literal59_tree=null;
        AttoTree NEWLINE60_tree=null;
        AttoTree NEWLINE62_tree=null;
        AttoTree string_literal63_tree=null;
        AttoTree string_literal64_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:82:2: ( 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:82:4: 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal59=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_635); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal59);


            pushFollow(FOLLOW_expr_in_while_639);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:83:4: ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NEWLINE) ) {
                alt21=1;
            }
            else if ( (LA21_0==68) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // Atto.g:83:6: NEWLINE block NEWLINE 'end'
                    {
                    NEWLINE60=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE60);


                    pushFollow(FOLLOW_block_in_while_649);
                    block61=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block61.getTree());

                    NEWLINE62=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE62);


                    string_literal63=(Token)match(input,67,FOLLOW_67_in_while_653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal63);


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
                    // 84:5: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:84:8: ^( WHILE $cond_expr block )
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
                    // Atto.g:85:6: 'then' then_expr= expr
                    {
                    string_literal64=(Token)match(input,68,FOLLOW_68_in_while_676); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal64);


                    pushFollow(FOLLOW_expr_in_while_680);
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
                    // 86:5: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:86:8: ^( WHILE $cond_expr $then_expr)
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
    // Atto.g:90:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR66=null;
        AttoParser.and_return and65 =null;

        AttoParser.and_return and67 =null;


        AttoTree OR66_tree=null;

        try {
            // Atto.g:91:2: ( and ( OR ^ and )* )
            // Atto.g:91:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or712);
            and65=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and65.getTree());

            // Atto.g:91:8: ( OR ^ and )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==OR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Atto.g:91:9: OR ^ and
            	    {
            	    OR66=(Token)match(input,OR,FOLLOW_OR_in_or715); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR66_tree = 
            	    (AttoTree)adaptor.create(OR66)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR66_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or718);
            	    and67=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and67.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // Atto.g:94:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND69=null;
        AttoParser.rel_return rel68 =null;

        AttoParser.rel_return rel70 =null;


        AttoTree AND69_tree=null;

        try {
            // Atto.g:95:2: ( rel ( AND ^ rel )* )
            // Atto.g:95:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and731);
            rel68=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel68.getTree());

            // Atto.g:95:8: ( AND ^ rel )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Atto.g:95:9: AND ^ rel
            	    {
            	    AND69=(Token)match(input,AND,FOLLOW_AND_in_and734); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND69_tree = 
            	    (AttoTree)adaptor.create(AND69)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND69_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and737);
            	    rel70=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel70.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // Atto.g:98:1: rel : rel2 ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2 )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set72=null;
        AttoParser.rel2_return rel271 =null;

        AttoParser.rel2_return rel273 =null;


        AttoTree set72_tree=null;

        try {
            // Atto.g:99:2: ( rel2 ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2 )* )
            // Atto.g:99:4: rel2 ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2 )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel2_in_rel750);
            rel271=rel2();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel271.getTree());

            // Atto.g:99:9: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMPOSITE||LA24_0==EQ||(LA24_0 >= GE && LA24_0 <= GT)||LA24_0==LE||LA24_0==LT||LA24_0==NE||LA24_0==PIPELINE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Atto.g:99:10: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2
            	    {
            	    set72=(Token)input.LT(1);

            	    set72=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set72)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_rel2_in_rel772);
            	    rel273=rel2();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel273.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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


    public static class rel2_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel2"
    // Atto.g:103:1: rel2 : add ( R_PIPELINE ^ rel )* ;
    public final AttoParser.rel2_return rel2() throws RecognitionException {
        AttoParser.rel2_return retval = new AttoParser.rel2_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token R_PIPELINE75=null;
        AttoParser.add_return add74 =null;

        AttoParser.rel_return rel76 =null;


        AttoTree R_PIPELINE75_tree=null;

        try {
            // Atto.g:104:2: ( add ( R_PIPELINE ^ rel )* )
            // Atto.g:104:4: add ( R_PIPELINE ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel2786);
            add74=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add74.getTree());

            // Atto.g:104:8: ( R_PIPELINE ^ rel )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==R_PIPELINE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Atto.g:104:9: R_PIPELINE ^ rel
            	    {
            	    R_PIPELINE75=(Token)match(input,R_PIPELINE,FOLLOW_R_PIPELINE_in_rel2789); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    R_PIPELINE75_tree = 
            	    (AttoTree)adaptor.create(R_PIPELINE75)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(R_PIPELINE75_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_rel2792);
            	    rel76=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel76.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "rel2"


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

        Token set78=null;
        AttoParser.mul_return mul77 =null;

        AttoParser.mul_return mul79 =null;


        AttoTree set78_tree=null;

        try {
            // Atto.g:108:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:108:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add805);
            mul77=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul77.getTree());

            // Atto.g:108:8: ( ( PLUS | MINUS ) ^ mul )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==MINUS||LA26_0==PLUS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Atto.g:108:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set78=(Token)input.LT(1);

            	    set78=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set78)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add815);
            	    mul79=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul79.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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

        Token set81=null;
        AttoParser.unary_return unary80 =null;

        AttoParser.unary_return unary82 =null;


        AttoTree set81_tree=null;

        try {
            // Atto.g:112:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:112:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul828);
            unary80=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary80.getTree());

            // Atto.g:112:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DIV||(LA27_0 >= MOD && LA27_0 <= MUL)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Atto.g:112:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set81=(Token)input.LT(1);

            	    set81=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set81)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mul840);
            	    unary82=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary82.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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

        Token NOT84=null;
        Token MINUS86=null;
        AttoParser.postfix_return postfix83 =null;

        AttoParser.postfix_return postfix85 =null;

        AttoParser.postfix_return postfix87 =null;


        AttoTree NOT84_tree=null;
        AttoTree MINUS86_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:116:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt28=3;
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
                alt28=1;
                }
                break;
            case NOT:
                {
                alt28=2;
                }
                break;
            case MINUS:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // Atto.g:116:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary854);
                    postfix83=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix83.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:117:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT84=(Token)match(input,NOT,FOLLOW_NOT_in_unary859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT84_tree = 
                    (AttoTree)adaptor.create(NOT84)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT84_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary862);
                    postfix85=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix85.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:118:4: MINUS postfix
                    {
                    MINUS86=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS86);


                    pushFollow(FOLLOW_postfix_in_unary869);
                    postfix87=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix87.getTree());

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
    // Atto.g:121:1: postfix : ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) ) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN89=null;
        Token COMMA91=null;
        Token RPAREN93=null;
        Token LBRACK94=null;
        Token RBRACK96=null;
        Token DOT97=null;
        AttoParser.primary_return p =null;

        AttoParser.primary_return primary88 =null;

        AttoParser.expr_return expr90 =null;

        AttoParser.expr_return expr92 =null;

        AttoParser.expr_return expr95 =null;


        AttoTree LPAREN89_tree=null;
        AttoTree COMMA91_tree=null;
        AttoTree RPAREN93_tree=null;
        AttoTree LBRACK94_tree=null;
        AttoTree RBRACK96_tree=null;
        AttoTree DOT97_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:122:2: ( ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) ) )* )
            // Atto.g:122:4: ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) ) )*
            {
            // Atto.g:122:4: ( primary -> primary )
            // Atto.g:122:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix892);
            primary88=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary88.getTree());

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


            // Atto.g:123:4: ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) ) )*
            loop32:
            do {
                int alt32=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt32=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt32=2;
                    }
                    break;
                case DOT:
                    {
                    alt32=3;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // Atto.g:123:6: LPAREN ( expr ( COMMA expr )* )? RPAREN
            	    {
            	    LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix905); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN89);


            	    // Atto.g:123:13: ( expr ( COMMA expr )* )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==AT||LA30_0==BOOL||LA30_0==IF||(LA30_0 >= LBRACK && LA30_0 <= LCURLY)||LA30_0==LPAREN||LA30_0==MINUS||LA30_0==NAME||(LA30_0 >= NOT && LA30_0 <= NUMBER)||LA30_0==STRING||LA30_0==WHILE) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // Atto.g:123:14: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix908);
            	            expr90=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr90.getTree());

            	            // Atto.g:123:19: ( COMMA expr )*
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==COMMA) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // Atto.g:123:20: COMMA expr
            	            	    {
            	            	    COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix911); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA91);


            	            	    pushFollow(FOLLOW_expr_in_postfix913);
            	            	    expr92=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr92.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop29;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix919); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN93);


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
            	    // 124:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:124:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:124:24: ( expr )*
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
            	    // Atto.g:125:6: LBRACK expr RBRACK
            	    {
            	    LBRACK94=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix944); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK94);


            	    pushFollow(FOLLOW_expr_in_postfix946);
            	    expr95=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr95.getTree());

            	    RBRACK96=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix948); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK96);


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
            	    // 126:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:126:8: ^( INDEX $postfix expr )
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
            	    // Atto.g:127:6: DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) )
            	    {
            	    DOT97=(Token)match(input,DOT,FOLLOW_DOT_in_postfix971); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT97);


            	    // Atto.g:127:10: (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) )
            	    int alt31=2;
            	    switch ( input.LA(1) ) {
            	    case AT:
            	    case BOOL:
            	    case LCURLY:
            	    case NAME:
            	    case NULL:
            	    case NUMBER:
            	    case STRING:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case LPAREN:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case LBRACK:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case EOF:
            	    case AND:
            	    case ASSIGN:
            	    case COMMA:
            	    case COMPOSITE:
            	    case DIV:
            	    case DOT:
            	    case ELSE:
            	    case EQ:
            	    case GE:
            	    case GT:
            	    case LE:
            	    case LT:
            	    case MINUS:
            	    case MOD:
            	    case MUL:
            	    case NE:
            	    case NEWLINE:
            	    case OR:
            	    case PIPELINE:
            	    case PLUS:
            	    case RBRACK:
            	    case RCURLY:
            	    case RPAREN:
            	    case R_PIPELINE:
            	    case SEMICOLON:
            	    case 68:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // Atto.g:127:12: p= primary
            	            {
            	            pushFollow(FOLLOW_primary_in_postfix977);
            	            p=primary();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_primary.add(p.getTree());

            	            // AST REWRITE
            	            // elements: p, postfix
            	            // token labels: 
            	            // rule labels: retval, p
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            if ( state.backtracking==0 ) {

            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.tree:null);

            	            root_0 = (AttoTree)adaptor.nil();
            	            // 127:22: -> ^( FIELD_ACCESS $postfix $p)
            	            {
            	                // Atto.g:127:25: ^( FIELD_ACCESS $postfix $p)
            	                {
            	                AttoTree root_1 = (AttoTree)adaptor.nil();
            	                root_1 = (AttoTree)adaptor.becomeRoot(
            	                (AttoTree)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS")
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_p.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }


            	            retval.tree = root_0;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Atto.g:128:7: 
            	            {
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
            	            // 128:7: -> ^( CALL $postfix)
            	            {
            	                // Atto.g:128:10: ^( CALL $postfix)
            	                {
            	                AttoTree root_1 = (AttoTree)adaptor.nil();
            	                root_1 = (AttoTree)adaptor.becomeRoot(
            	                (AttoTree)adaptor.create(CALL, "CALL")
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

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
    // $ANTLR end "postfix"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:133:1: primary : ( NAME | AT ^ NAME | NUMBER | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | ( obj )=> obj | fun | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME98=null;
        Token AT99=null;
        Token NAME100=null;
        Token NUMBER101=null;
        Token STRING102=null;
        Token BOOL103=null;
        Token NULL104=null;
        Token LPAREN105=null;
        Token RPAREN107=null;
        AttoParser.expr_return expr106 =null;

        AttoParser.obj_return obj108 =null;

        AttoParser.fun_return fun109 =null;

        AttoParser.array_return array110 =null;


        AttoTree NAME98_tree=null;
        AttoTree AT99_tree=null;
        AttoTree NAME100_tree=null;
        AttoTree NUMBER101_tree=null;
        AttoTree STRING102_tree=null;
        AttoTree BOOL103_tree=null;
        AttoTree NULL104_tree=null;
        AttoTree LPAREN105_tree=null;
        AttoTree RPAREN107_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:134:2: ( NAME | AT ^ NAME | NUMBER | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | ( obj )=> obj | fun | array )
            int alt33=10;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt33=1;
                }
                break;
            case AT:
                {
                alt33=2;
                }
                break;
            case NUMBER:
                {
                alt33=3;
                }
                break;
            case STRING:
                {
                alt33=4;
                }
                break;
            case BOOL:
                {
                alt33=5;
                }
                break;
            case NULL:
                {
                alt33=6;
                }
                break;
            case LPAREN:
                {
                alt33=7;
                }
                break;
            case LCURLY:
                {
                int LA33_8 = input.LA(2);

                if ( (LA33_8==NEWLINE) ) {
                    int LA33_10 = input.LA(3);

                    if ( (LA33_10==NAME) ) {
                        int LA33_15 = input.LA(4);

                        if ( (LA33_15==COLON) && (synpred2_Atto())) {
                            alt33=8;
                        }
                        else if ( (LA33_15==AND||LA33_15==ASSIGN||LA33_15==COMPOSITE||(LA33_15 >= DIV && LA33_15 <= DOT)||LA33_15==EQ||(LA33_15 >= GE && LA33_15 <= GT)||LA33_15==LBRACK||LA33_15==LE||(LA33_15 >= LPAREN && LA33_15 <= MUL)||(LA33_15 >= NE && LA33_15 <= NEWLINE)||LA33_15==OR||(LA33_15 >= PIPELINE && LA33_15 <= PLUS)||LA33_15==RCURLY||(LA33_15 >= R_PIPELINE && LA33_15 <= SEMICOLON)) ) {
                            alt33=9;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 15, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA33_10==COMMA) && (synpred2_Atto())) {
                        alt33=8;
                    }
                    else if ( (LA33_10==NEWLINE) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==RCURLY) ) {
                            int LA33_19 = input.LA(5);

                            if ( (synpred2_Atto()) ) {
                                alt33=8;
                            }
                            else if ( (true) ) {
                                alt33=9;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 16, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA33_10==RCURLY) ) {
                        int LA33_17 = input.LA(4);

                        if ( (synpred2_Atto()) ) {
                            alt33=8;
                        }
                        else if ( (true) ) {
                            alt33=9;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 17, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA33_10==AT||LA33_10==BOOL||LA33_10==IF||(LA33_10 >= LBRACK && LA33_10 <= LCURLY)||LA33_10==LPAREN||LA33_10==MINUS||(LA33_10 >= NOT && LA33_10 <= NUMBER)||LA33_10==SEMICOLON||LA33_10==STRING||LA33_10==WHILE) ) {
                        alt33=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 10, input);

                        throw nvae;

                    }
                }
                else if ( (LA33_8==NAME) ) {
                    int LA33_11 = input.LA(3);

                    if ( (LA33_11==COLON) && (synpred2_Atto())) {
                        alt33=8;
                    }
                    else if ( (LA33_11==AND||(LA33_11 >= ARROW && LA33_11 <= ASSIGN)||(LA33_11 >= COMMA && LA33_11 <= COMPOSITE)||(LA33_11 >= DIV && LA33_11 <= DOT)||LA33_11==EQ||(LA33_11 >= GE && LA33_11 <= GT)||LA33_11==LBRACK||LA33_11==LE||(LA33_11 >= LPAREN && LA33_11 <= MUL)||(LA33_11 >= NE && LA33_11 <= NEWLINE)||LA33_11==OR||(LA33_11 >= PIPELINE && LA33_11 <= PLUS)||LA33_11==RCURLY||(LA33_11 >= R_PIPELINE && LA33_11 <= SEMICOLON)) ) {
                        alt33=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 11, input);

                        throw nvae;

                    }
                }
                else if ( (LA33_8==COMMA) && (synpred2_Atto())) {
                    alt33=8;
                }
                else if ( (LA33_8==RCURLY) ) {
                    int LA33_13 = input.LA(3);

                    if ( (synpred2_Atto()) ) {
                        alt33=8;
                    }
                    else if ( (true) ) {
                        alt33=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 13, input);

                        throw nvae;

                    }
                }
                else if ( (LA33_8==ARROW||LA33_8==AT||LA33_8==BOOL||LA33_8==IF||(LA33_8 >= LBRACK && LA33_8 <= LCURLY)||LA33_8==LPAREN||LA33_8==MINUS||(LA33_8 >= NOT && LA33_8 <= NUMBER)||LA33_8==SEMICOLON||LA33_8==STRING||LA33_8==WHILE) ) {
                    alt33=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 8, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                alt33=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // Atto.g:134:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME98=(Token)match(input,NAME,FOLLOW_NAME_in_primary1029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME98_tree = 
                    (AttoTree)adaptor.create(NAME98)
                    ;
                    adaptor.addChild(root_0, NAME98_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:135:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT99=(Token)match(input,AT,FOLLOW_AT_in_primary1034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT99_tree = 
                    (AttoTree)adaptor.create(AT99)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT99_tree, root_0);
                    }

                    NAME100=(Token)match(input,NAME,FOLLOW_NAME_in_primary1037); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME100_tree = 
                    (AttoTree)adaptor.create(NAME100)
                    ;
                    adaptor.addChild(root_0, NAME100_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:136:4: NUMBER
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NUMBER101=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_primary1043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER101_tree = 
                    (AttoTree)adaptor.create(NUMBER101)
                    ;
                    adaptor.addChild(root_0, NUMBER101_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:137:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING102=(Token)match(input,STRING,FOLLOW_STRING_in_primary1048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING102_tree = 
                    (AttoTree)adaptor.create(STRING102)
                    ;
                    adaptor.addChild(root_0, STRING102_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:138:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL103=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary1053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL103_tree = 
                    (AttoTree)adaptor.create(BOOL103)
                    ;
                    adaptor.addChild(root_0, BOOL103_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:139:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL104=(Token)match(input,NULL,FOLLOW_NULL_in_primary1058); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL104_tree = 
                    (AttoTree)adaptor.create(NULL104)
                    ;
                    adaptor.addChild(root_0, NULL104_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:140:4: LPAREN expr RPAREN
                    {
                    LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN105);


                    pushFollow(FOLLOW_expr_in_primary1065);
                    expr106=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr106.getTree());

                    RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN107);


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
                    // 140:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:141:4: ( obj )=> obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary1081);
                    obj108=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj108.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:142:4: fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_primary1086);
                    fun109=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun109.getTree());

                    }
                    break;
                case 10 :
                    // Atto.g:143:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary1091);
                    array110=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array110.getTree());

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
    // Atto.g:146:1: obj : LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY111=null;
        Token NEWLINE112=null;
        Token COMMA114=null;
        Token COMMA115=null;
        Token NEWLINE116=null;
        Token COMMA118=null;
        Token COMMA119=null;
        Token NEWLINE120=null;
        Token RCURLY121=null;
        AttoParser.pair_return pair113 =null;

        AttoParser.pair_return pair117 =null;


        AttoTree LCURLY111_tree=null;
        AttoTree NEWLINE112_tree=null;
        AttoTree COMMA114_tree=null;
        AttoTree COMMA115_tree=null;
        AttoTree NEWLINE116_tree=null;
        AttoTree COMMA118_tree=null;
        AttoTree COMMA119_tree=null;
        AttoTree NEWLINE120_tree=null;
        AttoTree RCURLY121_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:147:2: ( LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:147:4: LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY
            {
            LCURLY111=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj1103); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY111);


            // Atto.g:147:11: ( NEWLINE )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==NEWLINE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Atto.g:147:11: NEWLINE
                    {
                    NEWLINE112=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE112);


                    }
                    break;

            }


            // Atto.g:147:20: ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==NAME) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Atto.g:147:21: pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj1109);
                    pair113=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair113.getTree());

                    // Atto.g:147:26: ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==COMMA) ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1==NEWLINE) ) {
                                int LA37_2 = input.LA(3);

                                if ( (LA37_2==NAME) ) {
                                    alt37=1;
                                }


                            }
                            else if ( (LA37_1==NAME) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0==NEWLINE) ) {
                            int LA37_2 = input.LA(2);

                            if ( (LA37_2==NAME) ) {
                                alt37=1;
                            }


                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Atto.g:147:27: ( COMMA | ( COMMA )? NEWLINE ) pair
                    	    {
                    	    // Atto.g:147:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt36=2;
                    	    int LA36_0 = input.LA(1);

                    	    if ( (LA36_0==COMMA) ) {
                    	        int LA36_1 = input.LA(2);

                    	        if ( (LA36_1==NAME) ) {
                    	            alt36=1;
                    	        }
                    	        else if ( (LA36_1==NEWLINE) ) {
                    	            alt36=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 36, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA36_0==NEWLINE) ) {
                    	        alt36=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 36, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt36) {
                    	        case 1 :
                    	            // Atto.g:147:28: COMMA
                    	            {
                    	            COMMA114=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1113); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA114);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:147:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:147:34: ( COMMA )?
                    	            int alt35=2;
                    	            int LA35_0 = input.LA(1);

                    	            if ( (LA35_0==COMMA) ) {
                    	                alt35=1;
                    	            }
                    	            switch (alt35) {
                    	                case 1 :
                    	                    // Atto.g:147:34: COMMA
                    	                    {
                    	                    COMMA115=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1115); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA115);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE116=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1118); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE116);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_obj1121);
                    	    pair117=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair117.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:147:59: ( COMMA | ( COMMA )? NEWLINE )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==COMMA) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RCURLY) ) {
                    alt40=1;
                }
                else if ( (LA40_1==NEWLINE) ) {
                    alt40=2;
                }
            }
            else if ( (LA40_0==NEWLINE) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // Atto.g:147:60: COMMA
                    {
                    COMMA118=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA118);


                    }
                    break;
                case 2 :
                    // Atto.g:147:66: ( COMMA )? NEWLINE
                    {
                    // Atto.g:147:66: ( COMMA )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==COMMA) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Atto.g:147:66: COMMA
                            {
                            COMMA119=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1130); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA119);


                            }
                            break;

                    }


                    NEWLINE120=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE120);


                    }
                    break;

            }


            RCURLY121=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj1137); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY121);


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
            // 147:90: -> ^( OBJ ( pair )* )
            {
                // Atto.g:147:93: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:147:99: ( pair )*
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
    // Atto.g:150:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME122=null;
        Token COLON123=null;
        AttoParser.expr_return expr124 =null;


        AttoTree NAME122_tree=null;
        AttoTree COLON123_tree=null;

        try {
            // Atto.g:151:2: ( NAME COLON ^ expr )
            // Atto.g:151:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME122=(Token)match(input,NAME,FOLLOW_NAME_in_pair1157); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME122_tree = 
            (AttoTree)adaptor.create(NAME122)
            ;
            adaptor.addChild(root_0, NAME122_tree);
            }

            COLON123=(Token)match(input,COLON,FOLLOW_COLON_in_pair1159); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON123_tree = 
            (AttoTree)adaptor.create(COLON123)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON123_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair1162);
            expr124=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr124.getTree());

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
    // Atto.g:154:1: fun : '{' ( paramsdef '->' )? ( NEWLINE )? block '}' -> ^( FUN ( paramsdef )? block ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token char_literal125=null;
        Token string_literal127=null;
        Token NEWLINE128=null;
        Token char_literal130=null;
        AttoParser.paramsdef_return paramsdef126 =null;

        AttoParser.block_return block129 =null;


        AttoTree char_literal125_tree=null;
        AttoTree string_literal127_tree=null;
        AttoTree NEWLINE128_tree=null;
        AttoTree char_literal130_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:155:2: ( '{' ( paramsdef '->' )? ( NEWLINE )? block '}' -> ^( FUN ( paramsdef )? block ) )
            // Atto.g:155:4: '{' ( paramsdef '->' )? ( NEWLINE )? block '}'
            {
            char_literal125=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_fun1173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal125);


            // Atto.g:155:8: ( paramsdef '->' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==NAME) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==ARROW||LA41_1==COMMA) ) {
                    alt41=1;
                }
            }
            else if ( (LA41_0==ARROW) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Atto.g:155:9: paramsdef '->'
                    {
                    pushFollow(FOLLOW_paramsdef_in_fun1176);
                    paramsdef126=paramsdef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef126.getTree());

                    string_literal127=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun1178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal127);


                    }
                    break;

            }


            // Atto.g:155:26: ( NEWLINE )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==NEWLINE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Atto.g:155:26: NEWLINE
                    {
                    NEWLINE128=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_fun1182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE128);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_fun1185);
            block129=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block129.getTree());

            char_literal130=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_fun1187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal130);


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
            // 155:45: -> ^( FUN ( paramsdef )? block )
            {
                // Atto.g:155:48: ^( FUN ( paramsdef )? block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(FUN, "FUN")
                , root_1);

                // Atto.g:155:54: ( paramsdef )?
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
    // Atto.g:158:1: array : LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK131=null;
        Token NEWLINE132=null;
        Token COMMA134=null;
        Token COMMA135=null;
        Token NEWLINE136=null;
        Token COMMA138=null;
        Token COMMA139=null;
        Token NEWLINE140=null;
        Token RBRACK141=null;
        AttoParser.expr_return expr133 =null;

        AttoParser.expr_return expr137 =null;


        AttoTree LBRACK131_tree=null;
        AttoTree NEWLINE132_tree=null;
        AttoTree COMMA134_tree=null;
        AttoTree COMMA135_tree=null;
        AttoTree NEWLINE136_tree=null;
        AttoTree COMMA138_tree=null;
        AttoTree COMMA139_tree=null;
        AttoTree NEWLINE140_tree=null;
        AttoTree RBRACK141_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:159:2: ( LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:159:4: LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK
            {
            LBRACK131=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK131);


            // Atto.g:159:11: ( NEWLINE )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==NEWLINE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Atto.g:159:11: NEWLINE
                    {
                    NEWLINE132=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE132);


                    }
                    break;

            }


            // Atto.g:159:20: ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==AT||LA47_0==BOOL||LA47_0==IF||(LA47_0 >= LBRACK && LA47_0 <= LCURLY)||LA47_0==LPAREN||LA47_0==MINUS||LA47_0==NAME||(LA47_0 >= NOT && LA47_0 <= NUMBER)||LA47_0==STRING||LA47_0==WHILE) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Atto.g:159:21: expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1216);
                    expr133=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr133.getTree());

                    // Atto.g:159:26: ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==COMMA) ) {
                            int LA46_1 = input.LA(2);

                            if ( (LA46_1==NEWLINE) ) {
                                int LA46_2 = input.LA(3);

                                if ( (LA46_2==AT||LA46_2==BOOL||LA46_2==IF||(LA46_2 >= LBRACK && LA46_2 <= LCURLY)||LA46_2==LPAREN||LA46_2==MINUS||LA46_2==NAME||(LA46_2 >= NOT && LA46_2 <= NUMBER)||LA46_2==STRING||LA46_2==WHILE) ) {
                                    alt46=1;
                                }


                            }
                            else if ( (LA46_1==AT||LA46_1==BOOL||LA46_1==IF||(LA46_1 >= LBRACK && LA46_1 <= LCURLY)||LA46_1==LPAREN||LA46_1==MINUS||LA46_1==NAME||(LA46_1 >= NOT && LA46_1 <= NUMBER)||LA46_1==STRING||LA46_1==WHILE) ) {
                                alt46=1;
                            }


                        }
                        else if ( (LA46_0==NEWLINE) ) {
                            int LA46_2 = input.LA(2);

                            if ( (LA46_2==AT||LA46_2==BOOL||LA46_2==IF||(LA46_2 >= LBRACK && LA46_2 <= LCURLY)||LA46_2==LPAREN||LA46_2==MINUS||LA46_2==NAME||(LA46_2 >= NOT && LA46_2 <= NUMBER)||LA46_2==STRING||LA46_2==WHILE) ) {
                                alt46=1;
                            }


                        }


                        switch (alt46) {
                    	case 1 :
                    	    // Atto.g:159:27: ( COMMA | ( COMMA )? NEWLINE ) expr
                    	    {
                    	    // Atto.g:159:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==COMMA) ) {
                    	        int LA45_1 = input.LA(2);

                    	        if ( (LA45_1==AT||LA45_1==BOOL||LA45_1==IF||(LA45_1 >= LBRACK && LA45_1 <= LCURLY)||LA45_1==LPAREN||LA45_1==MINUS||LA45_1==NAME||(LA45_1 >= NOT && LA45_1 <= NUMBER)||LA45_1==STRING||LA45_1==WHILE) ) {
                    	            alt45=1;
                    	        }
                    	        else if ( (LA45_1==NEWLINE) ) {
                    	            alt45=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 45, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA45_0==NEWLINE) ) {
                    	        alt45=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 45, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // Atto.g:159:28: COMMA
                    	            {
                    	            COMMA134=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1220); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA134);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:159:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:159:34: ( COMMA )?
                    	            int alt44=2;
                    	            int LA44_0 = input.LA(1);

                    	            if ( (LA44_0==COMMA) ) {
                    	                alt44=1;
                    	            }
                    	            switch (alt44) {
                    	                case 1 :
                    	                    // Atto.g:159:34: COMMA
                    	                    {
                    	                    COMMA135=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1222); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA135);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE136=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1225); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE136);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_expr_in_array1228);
                    	    expr137=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr137.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:159:60: ( COMMA | ( COMMA )? NEWLINE )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==COMMA) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RBRACK) ) {
                    alt49=1;
                }
                else if ( (LA49_1==NEWLINE) ) {
                    alt49=2;
                }
            }
            else if ( (LA49_0==NEWLINE) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // Atto.g:159:61: COMMA
                    {
                    COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA138);


                    }
                    break;
                case 2 :
                    // Atto.g:159:67: ( COMMA )? NEWLINE
                    {
                    // Atto.g:159:67: ( COMMA )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==COMMA) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // Atto.g:159:67: COMMA
                            {
                            COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1238); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA139);


                            }
                            break;

                    }


                    NEWLINE140=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE140);


                    }
                    break;

            }


            RBRACK141=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1245); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK141);


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
            // 159:91: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:159:94: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:159:102: ( expr )*
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
    // Atto.g:162:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME142=null;

        AttoTree NAME142_tree=null;

        try {
            // Atto.g:163:2: ( NAME )
            // Atto.g:163:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME142=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME142_tree = 
            (AttoTree)adaptor.create(NAME142)
            ;
            adaptor.addChild(root_0, NAME142_tree);
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
        // Atto.g:41:4: ( assign )
        // Atto.g:41:5: assign
        {
        pushFollow(FOLLOW_assign_in_synpred1_Atto203);
        assign();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Atto

    // $ANTLR start synpred2_Atto
    public final void synpred2_Atto_fragment() throws RecognitionException {
        // Atto.g:141:4: ( obj )
        // Atto.g:141:5: obj
        {
        pushFollow(FOLLOW_obj_in_synpred2_Atto1077);
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


 

    public static final BitSet FOLLOW_block_in_root129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block141 = new BitSet(new long[]{0x0400200000000002L});
    public static final BitSet FOLLOW_terminator_in_block144 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block146 = new BitSet(new long[]{0x0400200000000002L});
    public static final BitSet FOLLOW_terminator_in_block152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_terminator185 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terminator187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terminator190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign234 = new BitSet(new long[]{0x0020070000080100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign242 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_assign244 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_assign266 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign268 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_assign270 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_assign298 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign300 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_assign302 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_assign330 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign332 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_assign334 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_assign362 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign364 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_assign366 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_assign394 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign396 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_assign398 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef442 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef445 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef447 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_IF_in_if_473 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_477 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_if_485 = new BitSet(new long[]{0x4401E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_if_487 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_if_489 = new BitSet(new long[]{0x0000000000600000L,0x0000000000000008L});
    public static final BitSet FOLLOW_elif_in_if_491 = new BitSet(new long[]{0x0000000000600000L,0x0000000000000008L});
    public static final BitSet FOLLOW_else__in_if_494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_if_497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_if_525 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_529 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_532 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif579 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_elif581 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif583 = new BitSet(new long[]{0x4401E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_elif585 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_608 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_610 = new BitSet(new long[]{0x4401E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_else_612 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_635 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_639 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_while_647 = new BitSet(new long[]{0x4401E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_while_649 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_while_651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_while_653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_while_676 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or712 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_OR_in_or715 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_and_in_or718 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rel_in_and731 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and734 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_rel_in_and737 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel2_in_rel750 = new BitSet(new long[]{0x0010108818810002L});
    public static final BitSet FOLLOW_set_in_rel753 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_rel2_in_rel772 = new BitSet(new long[]{0x0010108818810002L});
    public static final BitSet FOLLOW_add_in_rel2786 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_R_PIPELINE_in_rel2789 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_rel_in_rel2792 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_mul_in_add805 = new BitSet(new long[]{0x0020010000000002L});
    public static final BitSet FOLLOW_set_in_add808 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_mul_in_add815 = new BitSet(new long[]{0x0020010000000002L});
    public static final BitSet FOLLOW_unary_in_mul828 = new BitSet(new long[]{0x0000060000080002L});
    public static final BitSet FOLLOW_set_in_mul831 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_unary_in_mul840 = new BitSet(new long[]{0x0000060000080002L});
    public static final BitSet FOLLOW_postfix_in_unary854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary859 = new BitSet(new long[]{0x4001884600000A00L});
    public static final BitSet FOLLOW_postfix_in_unary862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary867 = new BitSet(new long[]{0x4001884600000A00L});
    public static final BitSet FOLLOW_postfix_in_unary869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix892 = new BitSet(new long[]{0x0000004200100002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix905 = new BitSet(new long[]{0x4101C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix908 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_COMMA_in_postfix911 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix913 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix919 = new BitSet(new long[]{0x0000004200100002L});
    public static final BitSet FOLLOW_LBRACK_in_postfix944 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix946 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix948 = new BitSet(new long[]{0x0000004200100002L});
    public static final BitSet FOLLOW_DOT_in_postfix971 = new BitSet(new long[]{0x4001884600100A02L});
    public static final BitSet FOLLOW_primary_in_postfix977 = new BitSet(new long[]{0x0000004200100002L});
    public static final BitSet FOLLOW_NAME_in_primary1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary1034 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NAME_in_primary1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_primary1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary1063 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primary1065 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_primary1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj1103 = new BitSet(new long[]{0x0080280000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1105 = new BitSet(new long[]{0x0080280000008000L});
    public static final BitSet FOLLOW_pair_in_obj1109 = new BitSet(new long[]{0x0080200000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1113 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1115 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1118 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_pair_in_obj1121 = new BitSet(new long[]{0x0080200000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1128 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1130 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1133 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair1157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COLON_in_pair1159 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_pair1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_fun1173 = new BitSet(new long[]{0x4481E94640000A80L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramsdef_in_fun1176 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_fun1178 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_fun1182 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_fun1185 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_fun1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1210 = new BitSet(new long[]{0x4041E94640008A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_array1212 = new BitSet(new long[]{0x4041E94640008A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_array1216 = new BitSet(new long[]{0x0040200000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1220 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_array1222 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1225 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_array1228 = new BitSet(new long[]{0x0040200000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1236 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array1238 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1241 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_vardef1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_synpred2_Atto1077 = new BitSet(new long[]{0x0000000000000002L});

}