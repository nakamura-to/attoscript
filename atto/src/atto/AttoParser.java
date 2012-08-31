// $ANTLR 3.4 Atto.g 2012-08-31 16:15:31

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APPLY", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "CLASS", "COLON", "COMMA", "COMPOSITE", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "EXTENDS", "FIELD_ACCESS", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "LBRACK", "LCURLY", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "NUMBER", "OBJ", "OR", "PARAMS", "PIPELINE", "PLUS", "RBRACK", "RCURLY", "RPAREN", "R_PIPELINE", "SEMICOLON", "SEND", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__67=67;
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

            if ( (LA3_0==NEWLINE||LA3_0==SEMICOLON) ) {
                alt3=1;
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
                        alt4=1;
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
    // Atto.g:48:1: assign : postfix ( ASSIGN expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN15=null;
        Token PLUS17=null;
        Token ASSIGN18=null;
        Token MINUS20=null;
        Token ASSIGN21=null;
        Token MUL23=null;
        Token ASSIGN24=null;
        Token DIV26=null;
        Token ASSIGN27=null;
        Token MOD29=null;
        Token ASSIGN30=null;
        AttoParser.postfix_return postfix14 =null;

        AttoParser.expr_return expr16 =null;

        AttoParser.expr_return expr19 =null;

        AttoParser.expr_return expr22 =null;

        AttoParser.expr_return expr25 =null;

        AttoParser.expr_return expr28 =null;

        AttoParser.expr_return expr31 =null;


        AttoTree ASSIGN15_tree=null;
        AttoTree PLUS17_tree=null;
        AttoTree ASSIGN18_tree=null;
        AttoTree MINUS20_tree=null;
        AttoTree ASSIGN21_tree=null;
        AttoTree MUL23_tree=null;
        AttoTree ASSIGN24_tree=null;
        AttoTree DIV26_tree=null;
        AttoTree ASSIGN27_tree=null;
        AttoTree MOD29_tree=null;
        AttoTree ASSIGN30_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_MOD=new RewriteRuleTokenStream(adaptor,"token MOD");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:49:2: ( postfix ( ASSIGN expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) )
            // Atto.g:49:4: postfix ( ASSIGN expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
            {
            pushFollow(FOLLOW_postfix_in_assign234);
            postfix14=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfix.add(postfix14.getTree());

            // Atto.g:50:4: ( ASSIGN expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ASSIGN) ) {
                alt8=1;
            }
            else if ( (LA8_0==DIV||(LA8_0 >= MINUS && LA8_0 <= MUL)||LA8_0==PLUS) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Atto.g:50:6: ASSIGN expr
                    {
                    ASSIGN15=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN15);


                    pushFollow(FOLLOW_expr_in_assign244);
                    expr16=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr16.getTree());

                    // AST REWRITE
                    // elements: postfix, ASSIGN, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 50:18: -> ^( ASSIGN postfix expr )
                    {
                        // Atto.g:50:21: ^( ASSIGN postfix expr )
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
                    // Atto.g:51:6: ( PLUS ASSIGN expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
                    {
                    // Atto.g:51:6: ( PLUS ASSIGN expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
                    int alt7=5;
                    switch ( input.LA(1) ) {
                    case PLUS:
                        {
                        alt7=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt7=2;
                        }
                        break;
                    case MUL:
                        {
                        alt7=3;
                        }
                        break;
                    case DIV:
                        {
                        alt7=4;
                        }
                        break;
                    case MOD:
                        {
                        alt7=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;

                    }

                    switch (alt7) {
                        case 1 :
                            // Atto.g:51:8: PLUS ASSIGN expr
                            {
                            PLUS17=(Token)match(input,PLUS,FOLLOW_PLUS_in_assign263); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PLUS.add(PLUS17);


                            ASSIGN18=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign265); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN18);


                            pushFollow(FOLLOW_expr_in_assign267);
                            expr19=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr19.getTree());

                            // AST REWRITE
                            // elements: PLUS, postfix, expr, postfix, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 51:25: -> ^( ASSIGN postfix ^( PLUS postfix expr ) )
                            {
                                // Atto.g:51:28: ^( ASSIGN postfix ^( PLUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:51:45: ^( PLUS postfix expr )
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
                            // Atto.g:52:8: MINUS ASSIGN expr
                            {
                            MINUS20=(Token)match(input,MINUS,FOLLOW_MINUS_in_assign292); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MINUS.add(MINUS20);


                            ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign294); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN21);


                            pushFollow(FOLLOW_expr_in_assign296);
                            expr22=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr22.getTree());

                            // AST REWRITE
                            // elements: expr, postfix, ASSIGN, MINUS, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 52:26: -> ^( ASSIGN postfix ^( MINUS postfix expr ) )
                            {
                                // Atto.g:52:29: ^( ASSIGN postfix ^( MINUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:52:46: ^( MINUS postfix expr )
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
                            // Atto.g:53:8: MUL ASSIGN expr
                            {
                            MUL23=(Token)match(input,MUL,FOLLOW_MUL_in_assign321); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MUL.add(MUL23);


                            ASSIGN24=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign323); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN24);


                            pushFollow(FOLLOW_expr_in_assign325);
                            expr25=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr25.getTree());

                            // AST REWRITE
                            // elements: postfix, expr, ASSIGN, MUL, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 53:24: -> ^( ASSIGN postfix ^( MUL postfix expr ) )
                            {
                                // Atto.g:53:27: ^( ASSIGN postfix ^( MUL postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:53:44: ^( MUL postfix expr )
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
                            // Atto.g:54:8: DIV ASSIGN expr
                            {
                            DIV26=(Token)match(input,DIV,FOLLOW_DIV_in_assign350); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIV.add(DIV26);


                            ASSIGN27=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign352); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN27);


                            pushFollow(FOLLOW_expr_in_assign354);
                            expr28=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr28.getTree());

                            // AST REWRITE
                            // elements: expr, ASSIGN, DIV, postfix, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 54:24: -> ^( ASSIGN postfix ^( DIV postfix expr ) )
                            {
                                // Atto.g:54:27: ^( ASSIGN postfix ^( DIV postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:54:44: ^( DIV postfix expr )
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
                            // Atto.g:55:8: MOD ASSIGN expr
                            {
                            MOD29=(Token)match(input,MOD,FOLLOW_MOD_in_assign379); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MOD.add(MOD29);


                            ASSIGN30=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign381); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN30);


                            pushFollow(FOLLOW_expr_in_assign383);
                            expr31=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr31.getTree());

                            // AST REWRITE
                            // elements: postfix, expr, MOD, ASSIGN, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 55:24: -> ^( ASSIGN postfix ^( MOD postfix expr ) )
                            {
                                // Atto.g:55:27: ^( ASSIGN postfix ^( MOD postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:55:44: ^( MOD postfix expr )
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


    public static class fun_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fun"
    // Atto.g:60:1: fun : '{' paramsdef '->' ( NEWLINE )? block '}' -> ^( ARROW paramsdef block ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token char_literal32=null;
        Token string_literal34=null;
        Token NEWLINE35=null;
        Token char_literal37=null;
        AttoParser.paramsdef_return paramsdef33 =null;

        AttoParser.block_return block36 =null;


        AttoTree char_literal32_tree=null;
        AttoTree string_literal34_tree=null;
        AttoTree NEWLINE35_tree=null;
        AttoTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:61:2: ( '{' paramsdef '->' ( NEWLINE )? block '}' -> ^( ARROW paramsdef block ) )
            // Atto.g:61:4: '{' paramsdef '->' ( NEWLINE )? block '}'
            {
            char_literal32=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_fun423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal32);


            pushFollow(FOLLOW_paramsdef_in_fun425);
            paramsdef33=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef33.getTree());

            string_literal34=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(string_literal34);


            // Atto.g:61:23: ( NEWLINE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NEWLINE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Atto.g:61:23: NEWLINE
                    {
                    NEWLINE35=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_fun429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE35);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_fun432);
            block36=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block36.getTree());

            char_literal37=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_fun434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal37);


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
            // 61:42: -> ^( ARROW paramsdef block )
            {
                // Atto.g:61:45: ^( ARROW paramsdef block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARROW, "ARROW")
                , root_1);

                adaptor.addChild(root_1, stream_paramsdef.nextTree());

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


    public static class paramsdef_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramsdef"
    // Atto.g:64:1: paramsdef : ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) ;
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
            // Atto.g:65:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) )
            // Atto.g:65:4: ( vardef ( COMMA vardef )* )?
            {
            // Atto.g:65:4: ( vardef ( COMMA vardef )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NAME) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Atto.g:65:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_paramsdef456);
                    vardef38=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef38.getTree());

                    // Atto.g:65:12: ( COMMA vardef )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Atto.g:65:13: COMMA vardef
                    	    {
                    	    COMMA39=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef459); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA39);


                    	    pushFollow(FOLLOW_vardef_in_paramsdef461);
                    	    vardef40=vardef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_vardef.add(vardef40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
            // 65:30: -> ^( PARAMS ( vardef )* )
            {
                // Atto.g:65:33: ^( PARAMS ( vardef )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // Atto.g:65:42: ( vardef )*
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
    // Atto.g:68:1: if_ : 'if' cond_expr= expr ( ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal41=null;
        Token NEWLINE42=null;
        Token char_literal43=null;
        Token NEWLINE44=null;
        Token char_literal46=null;
        Token NEWLINE47=null;
        Token string_literal50=null;
        Token string_literal51=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block45 =null;

        AttoParser.elif_return elif48 =null;

        AttoParser.else__return else_49 =null;


        AttoTree string_literal41_tree=null;
        AttoTree NEWLINE42_tree=null;
        AttoTree char_literal43_tree=null;
        AttoTree NEWLINE44_tree=null;
        AttoTree char_literal46_tree=null;
        AttoTree NEWLINE47_tree=null;
        AttoTree string_literal50_tree=null;
        AttoTree string_literal51_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:69:2: ( 'if' cond_expr= expr ( ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:69:4: 'if' cond_expr= expr ( ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal41=(Token)match(input,IF,FOLLOW_IF_in_if_487); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal41);


            pushFollow(FOLLOW_expr_in_if_491);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:70:4: ( ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LCURLY||LA18_0==NEWLINE) ) {
                alt18=1;
            }
            else if ( (LA18_0==67) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Atto.g:70:6: ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? ( elif )* ( else_ )?
                    {
                    // Atto.g:70:6: ( NEWLINE )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NEWLINE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Atto.g:70:6: NEWLINE
                            {
                            NEWLINE42=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_499); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE42);


                            }
                            break;

                    }


                    char_literal43=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(char_literal43);


                    // Atto.g:70:19: ( NEWLINE )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NEWLINE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Atto.g:70:19: NEWLINE
                            {
                            NEWLINE44=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_504); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE44);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_if_507);
                    block45=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block45.getTree());

                    char_literal46=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCURLY.add(char_literal46);


                    // Atto.g:70:38: ( NEWLINE )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NEWLINE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Atto.g:70:38: NEWLINE
                            {
                            NEWLINE47=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_511); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE47);


                            }
                            break;

                    }


                    // Atto.g:70:47: ( elif )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ELIF) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Atto.g:70:47: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_514);
                    	    elif48=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif48.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    // Atto.g:70:53: ( else_ )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ELSE) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==NEWLINE) ) {
                            alt16=1;
                        }
                        else if ( (LA16_1==LCURLY) ) {
                            switch ( input.LA(3) ) {
                                case NEWLINE:
                                    {
                                    switch ( input.LA(4) ) {
                                        case NAME:
                                            {
                                            int LA16_8 = input.LA(5);

                                            if ( (LA16_8==AND||LA16_8==ASSIGN||LA16_8==COMPOSITE||(LA16_8 >= DIV && LA16_8 <= DOT)||LA16_8==EQ||(LA16_8 >= GE && LA16_8 <= GT)||LA16_8==LBRACK||LA16_8==LE||(LA16_8 >= LPAREN && LA16_8 <= MUL)||(LA16_8 >= NE && LA16_8 <= NEWLINE)||LA16_8==OR||(LA16_8 >= PIPELINE && LA16_8 <= PLUS)||LA16_8==RCURLY||(LA16_8 >= R_PIPELINE && LA16_8 <= SEMICOLON)) ) {
                                                alt16=1;
                                            }
                                            }
                                            break;
                                        case AT:
                                        case BOOL:
                                        case IF:
                                        case LBRACK:
                                        case LCURLY:
                                        case LPAREN:
                                        case MINUS:
                                        case NOT:
                                        case NULL:
                                        case NUMBER:
                                        case RCURLY:
                                        case SEMICOLON:
                                        case STRING:
                                        case WHILE:
                                            {
                                            alt16=1;
                                            }
                                            break;
                                        case NEWLINE:
                                            {
                                            int LA16_9 = input.LA(5);

                                            if ( (LA16_9==RCURLY) ) {
                                                alt16=1;
                                            }
                                            }
                                            break;
                                    }

                                    }
                                    break;
                                case NAME:
                                    {
                                    int LA16_6 = input.LA(4);

                                    if ( (LA16_6==AND||LA16_6==ASSIGN||LA16_6==COMPOSITE||(LA16_6 >= DIV && LA16_6 <= DOT)||LA16_6==EQ||(LA16_6 >= GE && LA16_6 <= GT)||LA16_6==LBRACK||LA16_6==LE||(LA16_6 >= LPAREN && LA16_6 <= MUL)||(LA16_6 >= NE && LA16_6 <= NEWLINE)||LA16_6==OR||(LA16_6 >= PIPELINE && LA16_6 <= PLUS)||LA16_6==RCURLY||(LA16_6 >= R_PIPELINE && LA16_6 <= SEMICOLON)) ) {
                                        alt16=1;
                                    }
                                    }
                                    break;
                                case AT:
                                case BOOL:
                                case IF:
                                case LBRACK:
                                case LCURLY:
                                case LPAREN:
                                case MINUS:
                                case NOT:
                                case NULL:
                                case NUMBER:
                                case SEMICOLON:
                                case STRING:
                                case WHILE:
                                    {
                                    alt16=1;
                                    }
                                    break;
                                case RCURLY:
                                    {
                                    alt16=1;
                                    }
                                    break;
                            }

                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // Atto.g:70:53: else_
                            {
                            pushFollow(FOLLOW_else__in_if_517);
                            else_49=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_49.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: elif, block, else_, cond_expr
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
                    // 71:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:71:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:71:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:71:36: ( else_ )?
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
                    // Atto.g:72:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal50=(Token)match(input,67,FOLLOW_67_in_if_547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal50);


                    pushFollow(FOLLOW_expr_in_if_551);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:72:28: ( 'else' else_expr= expr )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ELSE) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Atto.g:72:29: 'else' else_expr= expr
                            {
                            string_literal51=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_554); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal51);


                            pushFollow(FOLLOW_expr_in_if_558);
                            else_expr=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: cond_expr, else_expr, then_expr
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
                    // 73:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:73:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:73:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:73:35: ^( ELSE $else_expr)
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
    // Atto.g:77:1: elif : 'elif' expr ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal52=null;
        Token NEWLINE54=null;
        Token char_literal55=null;
        Token NEWLINE56=null;
        Token char_literal58=null;
        Token NEWLINE59=null;
        AttoParser.expr_return expr53 =null;

        AttoParser.block_return block57 =null;


        AttoTree string_literal52_tree=null;
        AttoTree NEWLINE54_tree=null;
        AttoTree char_literal55_tree=null;
        AttoTree NEWLINE56_tree=null;
        AttoTree char_literal58_tree=null;
        AttoTree NEWLINE59_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:78:2: ( 'elif' expr ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? -> ^( ELIF expr block ) )
            // Atto.g:78:4: 'elif' expr ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )?
            {
            string_literal52=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal52);


            pushFollow(FOLLOW_expr_in_elif603);
            expr53=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr53.getTree());

            // Atto.g:78:16: ( NEWLINE )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NEWLINE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Atto.g:78:16: NEWLINE
                    {
                    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE54);


                    }
                    break;

            }


            char_literal55=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_elif608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal55);


            // Atto.g:78:29: ( NEWLINE )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NEWLINE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Atto.g:78:29: NEWLINE
                    {
                    NEWLINE56=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE56);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_elif613);
            block57=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block57.getTree());

            char_literal58=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_elif615); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal58);


            // Atto.g:78:48: ( NEWLINE )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NEWLINE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Atto.g:78:48: NEWLINE
                    {
                    NEWLINE59=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE59);


                    }
                    break;

            }


            // AST REWRITE
            // elements: expr, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 78:57: -> ^( ELIF expr block )
            {
                // Atto.g:78:60: ^( ELIF expr block )
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
    // Atto.g:81:1: else_ : 'else' ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal60=null;
        Token NEWLINE61=null;
        Token char_literal62=null;
        Token NEWLINE63=null;
        Token char_literal65=null;
        Token NEWLINE66=null;
        AttoParser.block_return block64 =null;


        AttoTree string_literal60_tree=null;
        AttoTree NEWLINE61_tree=null;
        AttoTree char_literal62_tree=null;
        AttoTree NEWLINE63_tree=null;
        AttoTree char_literal65_tree=null;
        AttoTree NEWLINE66_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:82:2: ( 'else' ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? -> ^( ELSE block ) )
            // Atto.g:82:4: 'else' ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )?
            {
            string_literal60=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal60);


            // Atto.g:82:11: ( NEWLINE )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NEWLINE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Atto.g:82:11: NEWLINE
                    {
                    NEWLINE61=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE61);


                    }
                    break;

            }


            char_literal62=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_else_644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal62);


            // Atto.g:82:24: ( NEWLINE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==NEWLINE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Atto.g:82:24: NEWLINE
                    {
                    NEWLINE63=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE63);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_else_649);
            block64=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block64.getTree());

            char_literal65=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_else_651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal65);


            // Atto.g:82:43: ( NEWLINE )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NEWLINE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Atto.g:82:43: NEWLINE
                    {
                    NEWLINE66=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE66);


                    }
                    break;

            }


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
            // 82:52: -> ^( ELSE block )
            {
                // Atto.g:82:55: ^( ELSE block )
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
    // Atto.g:85:1: while_ : 'while' cond_expr= expr ( ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal67=null;
        Token NEWLINE68=null;
        Token char_literal69=null;
        Token NEWLINE70=null;
        Token char_literal72=null;
        Token NEWLINE73=null;
        Token string_literal74=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block71 =null;


        AttoTree string_literal67_tree=null;
        AttoTree NEWLINE68_tree=null;
        AttoTree char_literal69_tree=null;
        AttoTree NEWLINE70_tree=null;
        AttoTree char_literal72_tree=null;
        AttoTree NEWLINE73_tree=null;
        AttoTree string_literal74_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:86:2: ( 'while' cond_expr= expr ( ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:86:4: 'while' cond_expr= expr ( ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal67=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_674); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal67);


            pushFollow(FOLLOW_expr_in_while_678);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:87:4: ( ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )? -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LCURLY||LA28_0==NEWLINE) ) {
                alt28=1;
            }
            else if ( (LA28_0==67) ) {
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
                    // Atto.g:87:6: ( NEWLINE )? '{' ( NEWLINE )? block '}' ( NEWLINE )?
                    {
                    // Atto.g:87:6: ( NEWLINE )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==NEWLINE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // Atto.g:87:6: NEWLINE
                            {
                            NEWLINE68=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_686); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE68);


                            }
                            break;

                    }


                    char_literal69=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(char_literal69);


                    // Atto.g:87:19: ( NEWLINE )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==NEWLINE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // Atto.g:87:19: NEWLINE
                            {
                            NEWLINE70=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_691); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE70);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_while_694);
                    block71=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block71.getTree());

                    char_literal72=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCURLY.add(char_literal72);


                    // Atto.g:87:38: ( NEWLINE )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NEWLINE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // Atto.g:87:38: NEWLINE
                            {
                            NEWLINE73=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_698); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE73);


                            }
                            break;

                    }


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
                    // 88:5: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:88:8: ^( WHILE $cond_expr block )
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
                    // Atto.g:89:6: 'then' then_expr= expr
                    {
                    string_literal74=(Token)match(input,67,FOLLOW_67_in_while_722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal74);


                    pushFollow(FOLLOW_expr_in_while_726);
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
                    // 90:5: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:90:8: ^( WHILE $cond_expr $then_expr)
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
    // Atto.g:94:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR76=null;
        AttoParser.and_return and75 =null;

        AttoParser.and_return and77 =null;


        AttoTree OR76_tree=null;

        try {
            // Atto.g:95:2: ( and ( OR ^ and )* )
            // Atto.g:95:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or758);
            and75=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and75.getTree());

            // Atto.g:95:8: ( OR ^ and )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==OR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Atto.g:95:9: OR ^ and
            	    {
            	    OR76=(Token)match(input,OR,FOLLOW_OR_in_or761); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR76_tree = 
            	    (AttoTree)adaptor.create(OR76)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR76_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or764);
            	    and77=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and77.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // Atto.g:98:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND79=null;
        AttoParser.rel_return rel78 =null;

        AttoParser.rel_return rel80 =null;


        AttoTree AND79_tree=null;

        try {
            // Atto.g:99:2: ( rel ( AND ^ rel )* )
            // Atto.g:99:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and777);
            rel78=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel78.getTree());

            // Atto.g:99:8: ( AND ^ rel )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Atto.g:99:9: AND ^ rel
            	    {
            	    AND79=(Token)match(input,AND,FOLLOW_AND_in_and780); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND79_tree = 
            	    (AttoTree)adaptor.create(AND79)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND79_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and783);
            	    rel80=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel80.getTree());

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
    // $ANTLR end "and"


    public static class rel_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel"
    // Atto.g:102:1: rel : rel2 ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2 )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set82=null;
        AttoParser.rel2_return rel281 =null;

        AttoParser.rel2_return rel283 =null;


        AttoTree set82_tree=null;

        try {
            // Atto.g:103:2: ( rel2 ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2 )* )
            // Atto.g:103:4: rel2 ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2 )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel2_in_rel796);
            rel281=rel2();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel281.getTree());

            // Atto.g:103:9: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==COMPOSITE||LA31_0==EQ||(LA31_0 >= GE && LA31_0 <= GT)||LA31_0==LE||LA31_0==LT||LA31_0==NE||LA31_0==PIPELINE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Atto.g:103:10: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ rel2
            	    {
            	    set82=(Token)input.LT(1);

            	    set82=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set82)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_rel2_in_rel818);
            	    rel283=rel2();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel283.getTree());

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
    // $ANTLR end "rel"


    public static class rel2_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel2"
    // Atto.g:107:1: rel2 : add ( R_PIPELINE ^ rel )* ;
    public final AttoParser.rel2_return rel2() throws RecognitionException {
        AttoParser.rel2_return retval = new AttoParser.rel2_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token R_PIPELINE85=null;
        AttoParser.add_return add84 =null;

        AttoParser.rel_return rel86 =null;


        AttoTree R_PIPELINE85_tree=null;

        try {
            // Atto.g:108:2: ( add ( R_PIPELINE ^ rel )* )
            // Atto.g:108:4: add ( R_PIPELINE ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel2832);
            add84=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add84.getTree());

            // Atto.g:108:8: ( R_PIPELINE ^ rel )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==R_PIPELINE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Atto.g:108:9: R_PIPELINE ^ rel
            	    {
            	    R_PIPELINE85=(Token)match(input,R_PIPELINE,FOLLOW_R_PIPELINE_in_rel2835); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    R_PIPELINE85_tree = 
            	    (AttoTree)adaptor.create(R_PIPELINE85)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(R_PIPELINE85_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_rel2838);
            	    rel86=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel86.getTree());

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
    // $ANTLR end "rel2"


    public static class add_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // Atto.g:111:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set88=null;
        AttoParser.mul_return mul87 =null;

        AttoParser.mul_return mul89 =null;


        AttoTree set88_tree=null;

        try {
            // Atto.g:112:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:112:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add851);
            mul87=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul87.getTree());

            // Atto.g:112:8: ( ( PLUS | MINUS ) ^ mul )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MINUS||LA33_0==PLUS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Atto.g:112:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set88=(Token)input.LT(1);

            	    set88=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set88)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add861);
            	    mul89=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul89.getTree());

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
    // Atto.g:115:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set91=null;
        AttoParser.unary_return unary90 =null;

        AttoParser.unary_return unary92 =null;


        AttoTree set91_tree=null;

        try {
            // Atto.g:116:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:116:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul874);
            unary90=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary90.getTree());

            // Atto.g:116:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==DIV||(LA34_0 >= MOD && LA34_0 <= MUL)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Atto.g:116:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set91=(Token)input.LT(1);

            	    set91=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set91)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mul886);
            	    unary92=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary92.getTree());

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
    // Atto.g:119:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT94=null;
        Token MINUS96=null;
        AttoParser.postfix_return postfix93 =null;

        AttoParser.postfix_return postfix95 =null;

        AttoParser.postfix_return postfix97 =null;


        AttoTree NOT94_tree=null;
        AttoTree MINUS96_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:120:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt35=3;
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
                    // Atto.g:120:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary900);
                    postfix93=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix93.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:121:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT94=(Token)match(input,NOT,FOLLOW_NOT_in_unary905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT94_tree = 
                    (AttoTree)adaptor.create(NOT94)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT94_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary908);
                    postfix95=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix95.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:122:4: MINUS postfix
                    {
                    MINUS96=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS96);


                    pushFollow(FOLLOW_postfix_in_unary915);
                    postfix97=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix97.getTree());

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
                    // 122:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:122:21: ^( UNARY_MINUS postfix )
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
    // Atto.g:125:1: postfix : ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) ) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN99=null;
        Token COMMA101=null;
        Token RPAREN103=null;
        Token LBRACK104=null;
        Token RBRACK106=null;
        Token DOT107=null;
        AttoParser.primary_return p =null;

        AttoParser.primary_return primary98 =null;

        AttoParser.expr_return expr100 =null;

        AttoParser.expr_return expr102 =null;

        AttoParser.expr_return expr105 =null;


        AttoTree LPAREN99_tree=null;
        AttoTree COMMA101_tree=null;
        AttoTree RPAREN103_tree=null;
        AttoTree LBRACK104_tree=null;
        AttoTree RBRACK106_tree=null;
        AttoTree DOT107_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:126:2: ( ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) ) )* )
            // Atto.g:126:4: ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) ) )*
            {
            // Atto.g:126:4: ( primary -> primary )
            // Atto.g:126:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix938);
            primary98=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary98.getTree());

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
            // 126:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:127:4: ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) ) )*
            loop39:
            do {
                int alt39=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt39=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt39=2;
                    }
                    break;
                case DOT:
                    {
                    alt39=3;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // Atto.g:127:6: LPAREN ( expr ( COMMA expr )* )? RPAREN
            	    {
            	    LPAREN99=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix951); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN99);


            	    // Atto.g:127:13: ( expr ( COMMA expr )* )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==AT||LA37_0==BOOL||LA37_0==IF||(LA37_0 >= LBRACK && LA37_0 <= LCURLY)||LA37_0==LPAREN||LA37_0==MINUS||LA37_0==NAME||(LA37_0 >= NOT && LA37_0 <= NUMBER)||LA37_0==STRING||LA37_0==WHILE) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // Atto.g:127:14: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix954);
            	            expr100=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr100.getTree());

            	            // Atto.g:127:19: ( COMMA expr )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);

            	                if ( (LA36_0==COMMA) ) {
            	                    alt36=1;
            	                }


            	                switch (alt36) {
            	            	case 1 :
            	            	    // Atto.g:127:20: COMMA expr
            	            	    {
            	            	    COMMA101=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix957); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA101);


            	            	    pushFollow(FOLLOW_expr_in_postfix959);
            	            	    expr102=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr102.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix965); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);


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
            	    // 128:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:128:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:128:24: ( expr )*
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
            	    // Atto.g:129:6: LBRACK expr RBRACK
            	    {
            	    LBRACK104=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix990); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK104);


            	    pushFollow(FOLLOW_expr_in_postfix992);
            	    expr105=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr105.getTree());

            	    RBRACK106=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix994); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK106);


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
            	    // 130:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:130:8: ^( INDEX $postfix expr )
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
            	    // Atto.g:131:6: DOT (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) )
            	    {
            	    DOT107=(Token)match(input,DOT,FOLLOW_DOT_in_postfix1017); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT107);


            	    // Atto.g:131:10: (p= primary -> ^( FIELD_ACCESS $postfix $p) | -> ^( CALL $postfix) )
            	    int alt38=2;
            	    switch ( input.LA(1) ) {
            	    case AT:
            	    case BOOL:
            	    case NAME:
            	    case NULL:
            	    case NUMBER:
            	    case STRING:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case LPAREN:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case LCURLY:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case LBRACK:
            	        {
            	        alt38=1;
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
            	    case 67:
            	        {
            	        alt38=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt38) {
            	        case 1 :
            	            // Atto.g:131:12: p= primary
            	            {
            	            pushFollow(FOLLOW_primary_in_postfix1023);
            	            p=primary();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_primary.add(p.getTree());

            	            // AST REWRITE
            	            // elements: postfix, p
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
            	            // 131:22: -> ^( FIELD_ACCESS $postfix $p)
            	            {
            	                // Atto.g:131:25: ^( FIELD_ACCESS $postfix $p)
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
            	            // Atto.g:132:7: 
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
            	            // 132:7: -> ^( CALL $postfix)
            	            {
            	                // Atto.g:132:10: ^( CALL $postfix)
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
    // Atto.g:137:1: primary : ( NAME | AT ^ NAME | NUMBER | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | ( fun )=> fun | obj | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME108=null;
        Token AT109=null;
        Token NAME110=null;
        Token NUMBER111=null;
        Token STRING112=null;
        Token BOOL113=null;
        Token NULL114=null;
        Token LPAREN115=null;
        Token RPAREN117=null;
        AttoParser.expr_return expr116 =null;

        AttoParser.fun_return fun118 =null;

        AttoParser.obj_return obj119 =null;

        AttoParser.array_return array120 =null;


        AttoTree NAME108_tree=null;
        AttoTree AT109_tree=null;
        AttoTree NAME110_tree=null;
        AttoTree NUMBER111_tree=null;
        AttoTree STRING112_tree=null;
        AttoTree BOOL113_tree=null;
        AttoTree NULL114_tree=null;
        AttoTree LPAREN115_tree=null;
        AttoTree RPAREN117_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:138:2: ( NAME | AT ^ NAME | NUMBER | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | ( fun )=> fun | obj | array )
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

                if ( (LA40_8==NAME) ) {
                    int LA40_10 = input.LA(3);

                    if ( (LA40_10==COLON) ) {
                        alt40=9;
                    }
                    else if ( (LA40_10==COMMA) && (synpred2_Atto())) {
                        alt40=8;
                    }
                    else if ( (LA40_10==ARROW) && (synpred2_Atto())) {
                        alt40=8;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 10, input);

                        throw nvae;

                    }
                }
                else if ( (LA40_8==ARROW) && (synpred2_Atto())) {
                    alt40=8;
                }
                else if ( (LA40_8==COMMA||LA40_8==NEWLINE||LA40_8==RCURLY) ) {
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
                    // Atto.g:138:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME108=(Token)match(input,NAME,FOLLOW_NAME_in_primary1075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME108_tree = 
                    (AttoTree)adaptor.create(NAME108)
                    ;
                    adaptor.addChild(root_0, NAME108_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:139:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT109=(Token)match(input,AT,FOLLOW_AT_in_primary1080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT109_tree = 
                    (AttoTree)adaptor.create(AT109)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT109_tree, root_0);
                    }

                    NAME110=(Token)match(input,NAME,FOLLOW_NAME_in_primary1083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME110_tree = 
                    (AttoTree)adaptor.create(NAME110)
                    ;
                    adaptor.addChild(root_0, NAME110_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:140:4: NUMBER
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NUMBER111=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_primary1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER111_tree = 
                    (AttoTree)adaptor.create(NUMBER111)
                    ;
                    adaptor.addChild(root_0, NUMBER111_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:141:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING112=(Token)match(input,STRING,FOLLOW_STRING_in_primary1094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING112_tree = 
                    (AttoTree)adaptor.create(STRING112)
                    ;
                    adaptor.addChild(root_0, STRING112_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:142:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL113=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary1099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL113_tree = 
                    (AttoTree)adaptor.create(BOOL113)
                    ;
                    adaptor.addChild(root_0, BOOL113_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:143:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL114=(Token)match(input,NULL,FOLLOW_NULL_in_primary1104); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL114_tree = 
                    (AttoTree)adaptor.create(NULL114)
                    ;
                    adaptor.addChild(root_0, NULL114_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:144:4: LPAREN expr RPAREN
                    {
                    LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN115);


                    pushFollow(FOLLOW_expr_in_primary1111);
                    expr116=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr116.getTree());

                    RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN117);


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
                    // 144:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:145:4: ( fun )=> fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_primary1127);
                    fun118=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun118.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:146:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary1132);
                    obj119=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj119.getTree());

                    }
                    break;
                case 10 :
                    // Atto.g:147:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary1137);
                    array120=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array120.getTree());

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
    // Atto.g:150:1: obj : LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY121=null;
        Token NEWLINE122=null;
        Token COMMA124=null;
        Token COMMA125=null;
        Token NEWLINE126=null;
        Token COMMA128=null;
        Token COMMA129=null;
        Token NEWLINE130=null;
        Token RCURLY131=null;
        AttoParser.pair_return pair123 =null;

        AttoParser.pair_return pair127 =null;


        AttoTree LCURLY121_tree=null;
        AttoTree NEWLINE122_tree=null;
        AttoTree COMMA124_tree=null;
        AttoTree COMMA125_tree=null;
        AttoTree NEWLINE126_tree=null;
        AttoTree COMMA128_tree=null;
        AttoTree COMMA129_tree=null;
        AttoTree NEWLINE130_tree=null;
        AttoTree RCURLY131_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:151:2: ( LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:151:4: LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY
            {
            LCURLY121=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj1149); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY121);


            // Atto.g:151:11: ( NEWLINE )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==NEWLINE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Atto.g:151:11: NEWLINE
                    {
                    NEWLINE122=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE122);


                    }
                    break;

            }


            // Atto.g:151:20: ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==NAME) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Atto.g:151:21: pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj1155);
                    pair123=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair123.getTree());

                    // Atto.g:151:26: ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
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
                    	    // Atto.g:151:27: ( COMMA | ( COMMA )? NEWLINE ) pair
                    	    {
                    	    // Atto.g:151:27: ( COMMA | ( COMMA )? NEWLINE )
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
                    	            // Atto.g:151:28: COMMA
                    	            {
                    	            COMMA124=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1159); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA124);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:151:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:151:34: ( COMMA )?
                    	            int alt42=2;
                    	            int LA42_0 = input.LA(1);

                    	            if ( (LA42_0==COMMA) ) {
                    	                alt42=1;
                    	            }
                    	            switch (alt42) {
                    	                case 1 :
                    	                    // Atto.g:151:34: COMMA
                    	                    {
                    	                    COMMA125=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1161); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA125);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE126=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1164); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE126);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_obj1167);
                    	    pair127=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair127.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:151:59: ( COMMA | ( COMMA )? NEWLINE )?
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
                    // Atto.g:151:60: COMMA
                    {
                    COMMA128=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA128);


                    }
                    break;
                case 2 :
                    // Atto.g:151:66: ( COMMA )? NEWLINE
                    {
                    // Atto.g:151:66: ( COMMA )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==COMMA) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // Atto.g:151:66: COMMA
                            {
                            COMMA129=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1176); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA129);


                            }
                            break;

                    }


                    NEWLINE130=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE130);


                    }
                    break;

            }


            RCURLY131=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj1183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY131);


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
            // 151:90: -> ^( OBJ ( pair )* )
            {
                // Atto.g:151:93: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:151:99: ( pair )*
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
    // Atto.g:154:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME132=null;
        Token COLON133=null;
        AttoParser.expr_return expr134 =null;


        AttoTree NAME132_tree=null;
        AttoTree COLON133_tree=null;

        try {
            // Atto.g:155:2: ( NAME COLON ^ expr )
            // Atto.g:155:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME132=(Token)match(input,NAME,FOLLOW_NAME_in_pair1203); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME132_tree = 
            (AttoTree)adaptor.create(NAME132)
            ;
            adaptor.addChild(root_0, NAME132_tree);
            }

            COLON133=(Token)match(input,COLON,FOLLOW_COLON_in_pair1205); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON133_tree = 
            (AttoTree)adaptor.create(COLON133)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON133_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair1208);
            expr134=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr134.getTree());

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


    public static class array_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // Atto.g:159:1: array : LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK135=null;
        Token NEWLINE136=null;
        Token COMMA138=null;
        Token COMMA139=null;
        Token NEWLINE140=null;
        Token COMMA142=null;
        Token COMMA143=null;
        Token NEWLINE144=null;
        Token RBRACK145=null;
        AttoParser.expr_return expr137 =null;

        AttoParser.expr_return expr141 =null;


        AttoTree LBRACK135_tree=null;
        AttoTree NEWLINE136_tree=null;
        AttoTree COMMA138_tree=null;
        AttoTree COMMA139_tree=null;
        AttoTree NEWLINE140_tree=null;
        AttoTree COMMA142_tree=null;
        AttoTree COMMA143_tree=null;
        AttoTree NEWLINE144_tree=null;
        AttoTree RBRACK145_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:160:2: ( LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:160:4: LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK
            {
            LBRACK135=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK135);


            // Atto.g:160:11: ( NEWLINE )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==NEWLINE) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Atto.g:160:11: NEWLINE
                    {
                    NEWLINE136=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE136);


                    }
                    break;

            }


            // Atto.g:160:20: ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==AT||LA52_0==BOOL||LA52_0==IF||(LA52_0 >= LBRACK && LA52_0 <= LCURLY)||LA52_0==LPAREN||LA52_0==MINUS||LA52_0==NAME||(LA52_0 >= NOT && LA52_0 <= NUMBER)||LA52_0==STRING||LA52_0==WHILE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Atto.g:160:21: expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1227);
                    expr137=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr137.getTree());

                    // Atto.g:160:26: ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==COMMA) ) {
                            int LA51_1 = input.LA(2);

                            if ( (LA51_1==NEWLINE) ) {
                                int LA51_2 = input.LA(3);

                                if ( (LA51_2==AT||LA51_2==BOOL||LA51_2==IF||(LA51_2 >= LBRACK && LA51_2 <= LCURLY)||LA51_2==LPAREN||LA51_2==MINUS||LA51_2==NAME||(LA51_2 >= NOT && LA51_2 <= NUMBER)||LA51_2==STRING||LA51_2==WHILE) ) {
                                    alt51=1;
                                }


                            }
                            else if ( (LA51_1==AT||LA51_1==BOOL||LA51_1==IF||(LA51_1 >= LBRACK && LA51_1 <= LCURLY)||LA51_1==LPAREN||LA51_1==MINUS||LA51_1==NAME||(LA51_1 >= NOT && LA51_1 <= NUMBER)||LA51_1==STRING||LA51_1==WHILE) ) {
                                alt51=1;
                            }


                        }
                        else if ( (LA51_0==NEWLINE) ) {
                            int LA51_2 = input.LA(2);

                            if ( (LA51_2==AT||LA51_2==BOOL||LA51_2==IF||(LA51_2 >= LBRACK && LA51_2 <= LCURLY)||LA51_2==LPAREN||LA51_2==MINUS||LA51_2==NAME||(LA51_2 >= NOT && LA51_2 <= NUMBER)||LA51_2==STRING||LA51_2==WHILE) ) {
                                alt51=1;
                            }


                        }


                        switch (alt51) {
                    	case 1 :
                    	    // Atto.g:160:27: ( COMMA | ( COMMA )? NEWLINE ) expr
                    	    {
                    	    // Atto.g:160:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( (LA50_0==COMMA) ) {
                    	        int LA50_1 = input.LA(2);

                    	        if ( (LA50_1==AT||LA50_1==BOOL||LA50_1==IF||(LA50_1 >= LBRACK && LA50_1 <= LCURLY)||LA50_1==LPAREN||LA50_1==MINUS||LA50_1==NAME||(LA50_1 >= NOT && LA50_1 <= NUMBER)||LA50_1==STRING||LA50_1==WHILE) ) {
                    	            alt50=1;
                    	        }
                    	        else if ( (LA50_1==NEWLINE) ) {
                    	            alt50=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 50, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA50_0==NEWLINE) ) {
                    	        alt50=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 50, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt50) {
                    	        case 1 :
                    	            // Atto.g:160:28: COMMA
                    	            {
                    	            COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1231); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA138);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:160:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:160:34: ( COMMA )?
                    	            int alt49=2;
                    	            int LA49_0 = input.LA(1);

                    	            if ( (LA49_0==COMMA) ) {
                    	                alt49=1;
                    	            }
                    	            switch (alt49) {
                    	                case 1 :
                    	                    // Atto.g:160:34: COMMA
                    	                    {
                    	                    COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1233); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA139);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE140=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1236); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE140);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_expr_in_array1239);
                    	    expr141=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr141.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:160:60: ( COMMA | ( COMMA )? NEWLINE )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COMMA) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RBRACK) ) {
                    alt54=1;
                }
                else if ( (LA54_1==NEWLINE) ) {
                    alt54=2;
                }
            }
            else if ( (LA54_0==NEWLINE) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // Atto.g:160:61: COMMA
                    {
                    COMMA142=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA142);


                    }
                    break;
                case 2 :
                    // Atto.g:160:67: ( COMMA )? NEWLINE
                    {
                    // Atto.g:160:67: ( COMMA )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==COMMA) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // Atto.g:160:67: COMMA
                            {
                            COMMA143=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1249); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA143);


                            }
                            break;

                    }


                    NEWLINE144=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE144);


                    }
                    break;

            }


            RBRACK145=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK145);


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
            // 160:91: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:160:94: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:160:102: ( expr )*
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
    // Atto.g:163:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME146=null;

        AttoTree NAME146_tree=null;

        try {
            // Atto.g:164:2: ( NAME )
            // Atto.g:164:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME146=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1276); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME146_tree = 
            (AttoTree)adaptor.create(NAME146)
            ;
            adaptor.addChild(root_0, NAME146_tree);
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
        // Atto.g:145:4: ( fun )
        // Atto.g:145:5: fun
        {
        pushFollow(FOLLOW_fun_in_synpred2_Atto1123);
        fun();

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
    public static final BitSet FOLLOW_ASSIGN_in_assign242 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_assign263 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign265 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_assign292 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign294 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_assign321 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign323 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_assign350 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign352 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_assign379 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign381 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_fun423 = new BitSet(new long[]{0x0000080000000080L});
    public static final BitSet FOLLOW_paramsdef_in_fun425 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_fun427 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_fun429 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_fun432 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_fun434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef456 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef459 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef461 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_IF_in_if_487 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_491 = new BitSet(new long[]{0x0000200400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_if_499 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LCURLY_in_if_502 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_if_504 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_if_507 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_if_509 = new BitSet(new long[]{0x0000200000600002L});
    public static final BitSet FOLLOW_NEWLINE_in_if_511 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elif_in_if_514 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_else__in_if_517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_if_547 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_551 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_554 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif601 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_elif603 = new BitSet(new long[]{0x0000200400000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif605 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LCURLY_in_elif608 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_elif610 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_elif613 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_elif615 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_elif617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_639 = new BitSet(new long[]{0x0000200400000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_641 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LCURLY_in_else_644 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_else_646 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_else_649 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_else_651 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_else_653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_674 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_678 = new BitSet(new long[]{0x0000200400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_while_686 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LCURLY_in_while_689 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_while_691 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_while_694 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_while_696 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_while_698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_while_722 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or758 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_OR_in_or761 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_and_in_or764 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rel_in_and777 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and780 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_rel_in_and783 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel2_in_rel796 = new BitSet(new long[]{0x0010108818810002L});
    public static final BitSet FOLLOW_set_in_rel799 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_rel2_in_rel818 = new BitSet(new long[]{0x0010108818810002L});
    public static final BitSet FOLLOW_add_in_rel2832 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_R_PIPELINE_in_rel2835 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_rel_in_rel2838 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_mul_in_add851 = new BitSet(new long[]{0x0020010000000002L});
    public static final BitSet FOLLOW_set_in_add854 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_mul_in_add861 = new BitSet(new long[]{0x0020010000000002L});
    public static final BitSet FOLLOW_unary_in_mul874 = new BitSet(new long[]{0x0000060000080002L});
    public static final BitSet FOLLOW_set_in_mul877 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_unary_in_mul886 = new BitSet(new long[]{0x0000060000080002L});
    public static final BitSet FOLLOW_postfix_in_unary900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary905 = new BitSet(new long[]{0x4001884600000A00L});
    public static final BitSet FOLLOW_postfix_in_unary908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary913 = new BitSet(new long[]{0x4001884600000A00L});
    public static final BitSet FOLLOW_postfix_in_unary915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix938 = new BitSet(new long[]{0x0000004200100002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix951 = new BitSet(new long[]{0x4101C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix954 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_COMMA_in_postfix957 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix959 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix965 = new BitSet(new long[]{0x0000004200100002L});
    public static final BitSet FOLLOW_LBRACK_in_postfix990 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix992 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix994 = new BitSet(new long[]{0x0000004200100002L});
    public static final BitSet FOLLOW_DOT_in_postfix1017 = new BitSet(new long[]{0x4001884600100A02L});
    public static final BitSet FOLLOW_primary_in_postfix1023 = new BitSet(new long[]{0x0000004200100002L});
    public static final BitSet FOLLOW_NAME_in_primary1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary1080 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NAME_in_primary1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_primary1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary1109 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primary1111 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_primary1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj1149 = new BitSet(new long[]{0x0080280000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1151 = new BitSet(new long[]{0x0080280000008000L});
    public static final BitSet FOLLOW_pair_in_obj1155 = new BitSet(new long[]{0x0080200000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1159 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1161 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1164 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_pair_in_obj1167 = new BitSet(new long[]{0x0080200000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1174 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1176 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1179 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair1203 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COLON_in_pair1205 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_pair1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1221 = new BitSet(new long[]{0x4041E94640008A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_array1223 = new BitSet(new long[]{0x4041E94640008A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_array1227 = new BitSet(new long[]{0x0040200000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1231 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_array1233 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1236 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_array1239 = new BitSet(new long[]{0x0040200000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1247 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array1249 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1252 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_vardef1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_synpred2_Atto1123 = new BitSet(new long[]{0x0000000000000002L});

}