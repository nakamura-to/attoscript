// $ANTLR 3.4 Atto.g 2012-09-01 07:30:54

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APPLY", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "CLASS", "COLON", "COMMA", "COMPOSITE", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "EXTENDS", "FIELD_ACCESS", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "LBRACK", "LCURLY", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "NUMBER", "OBJ", "OR", "PARAMS", "PIPELINE", "PLUS", "RBRACK", "RCURLY", "REVERSE_PIPELINE", "RPAREN", "SEMICOLON", "SEND", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "VARDEF", "WHILE", "WS", "'end'", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__68=68;
    public static final int T__69=69;
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
    public static final int REVERSE_PIPELINE=56;
    public static final int RPAREN=57;
    public static final int SEMICOLON=58;
    public static final int SEND=59;
    public static final int SPACE=60;
    public static final int STMT=61;
    public static final int STRING=62;
    public static final int UNARY_MINUS=63;
    public static final int UPPER=64;
    public static final int VARDEF=65;
    public static final int WHILE=66;
    public static final int WS=67;

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
    // Atto.g:28:1: block : ( expr ( terminator expr )* )? ( terminator )? -> ^( BLOCK ( expr )* ) ;
    public final AttoParser.block_return block() throws RecognitionException {
        AttoParser.block_return retval = new AttoParser.block_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.expr_return expr2 =null;

        AttoParser.terminator_return terminator3 =null;

        AttoParser.expr_return expr4 =null;

        AttoParser.terminator_return terminator5 =null;


        RewriteRuleSubtreeStream stream_terminator=new RewriteRuleSubtreeStream(adaptor,"rule terminator");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:29:2: ( ( expr ( terminator expr )* )? ( terminator )? -> ^( BLOCK ( expr )* ) )
            // Atto.g:29:4: ( expr ( terminator expr )* )? ( terminator )?
            {
            // Atto.g:29:4: ( expr ( terminator expr )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==AT||LA2_0==BOOL||LA2_0==IF||(LA2_0 >= LBRACK && LA2_0 <= LCURLY)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NAME||(LA2_0 >= NOT && LA2_0 <= NUMBER)||LA2_0==STRING||LA2_0==WHILE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Atto.g:29:5: expr ( terminator expr )*
                    {
                    pushFollow(FOLLOW_expr_in_block144);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr2.getTree());

                    // Atto.g:29:10: ( terminator expr )*
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
                    	    // Atto.g:29:11: terminator expr
                    	    {
                    	    pushFollow(FOLLOW_terminator_in_block147);
                    	    terminator3=terminator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_terminator.add(terminator3.getTree());

                    	    pushFollow(FOLLOW_expr_in_block149);
                    	    expr4=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr4.getTree());

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
            // 29:43: -> ^( BLOCK ( expr )* )
            {
                // Atto.g:29:46: ^( BLOCK ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:29:54: ( expr )*
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
    // $ANTLR end "block"


    public static class terminator_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "terminator"
    // Atto.g:32:1: terminator : ( SEMICOLON ( NEWLINE )? | NEWLINE );
    public final AttoParser.terminator_return terminator() throws RecognitionException {
        AttoParser.terminator_return retval = new AttoParser.terminator_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token SEMICOLON6=null;
        Token NEWLINE7=null;
        Token NEWLINE8=null;

        AttoTree SEMICOLON6_tree=null;
        AttoTree NEWLINE7_tree=null;
        AttoTree NEWLINE8_tree=null;

        try {
            // Atto.g:33:2: ( SEMICOLON ( NEWLINE )? | NEWLINE )
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
                    // Atto.g:33:4: SEMICOLON ( NEWLINE )?
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_terminator176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON6_tree = 
                    (AttoTree)adaptor.create(SEMICOLON6)
                    ;
                    adaptor.addChild(root_0, SEMICOLON6_tree);
                    }

                    // Atto.g:33:14: ( NEWLINE )?
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
                            // Atto.g:33:14: NEWLINE
                            {
                            NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terminator178); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NEWLINE7_tree = 
                            (AttoTree)adaptor.create(NEWLINE7)
                            ;
                            adaptor.addChild(root_0, NEWLINE7_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Atto.g:33:25: NEWLINE
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terminator183); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE8_tree = 
                    (AttoTree)adaptor.create(NEWLINE8)
                    ;
                    adaptor.addChild(root_0, NEWLINE8_tree);
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
    // Atto.g:36:1: expr : ( ( assign )=> assign | or | if_ | while_ );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.assign_return assign9 =null;

        AttoParser.or_return or10 =null;

        AttoParser.if__return if_11 =null;

        AttoParser.while__return while_12 =null;



        try {
            // Atto.g:37:2: ( ( assign )=> assign | or | if_ | while_ )
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
                    // Atto.g:37:4: ( assign )=> assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr200);
                    assign9=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign9.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:38:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr205);
                    or10=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or10.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:39:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr210);
                    if_11=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_11.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:40:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr215);
                    while_12=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_12.getTree());

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
    // Atto.g:43:1: assign : postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN14=null;
        Token NEWLINE15=null;
        Token PLUS17=null;
        Token ASSIGN18=null;
        Token NEWLINE19=null;
        Token MINUS21=null;
        Token ASSIGN22=null;
        Token NEWLINE23=null;
        Token MUL25=null;
        Token ASSIGN26=null;
        Token NEWLINE27=null;
        Token DIV29=null;
        Token ASSIGN30=null;
        Token NEWLINE31=null;
        Token MOD33=null;
        Token ASSIGN34=null;
        Token NEWLINE35=null;
        AttoParser.postfix_return postfix13 =null;

        AttoParser.expr_return expr16 =null;

        AttoParser.expr_return expr20 =null;

        AttoParser.expr_return expr24 =null;

        AttoParser.expr_return expr28 =null;

        AttoParser.expr_return expr32 =null;

        AttoParser.expr_return expr36 =null;


        AttoTree ASSIGN14_tree=null;
        AttoTree NEWLINE15_tree=null;
        AttoTree PLUS17_tree=null;
        AttoTree ASSIGN18_tree=null;
        AttoTree NEWLINE19_tree=null;
        AttoTree MINUS21_tree=null;
        AttoTree ASSIGN22_tree=null;
        AttoTree NEWLINE23_tree=null;
        AttoTree MUL25_tree=null;
        AttoTree ASSIGN26_tree=null;
        AttoTree NEWLINE27_tree=null;
        AttoTree DIV29_tree=null;
        AttoTree ASSIGN30_tree=null;
        AttoTree NEWLINE31_tree=null;
        AttoTree MOD33_tree=null;
        AttoTree ASSIGN34_tree=null;
        AttoTree NEWLINE35_tree=null;
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
            // Atto.g:44:2: ( postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) ) )
            // Atto.g:44:4: postfix ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
            {
            pushFollow(FOLLOW_postfix_in_assign226);
            postfix13=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfix.add(postfix13.getTree());

            // Atto.g:45:4: ( ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix expr ) | ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) ) )
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
                    // Atto.g:45:6: ASSIGN ( NEWLINE )? expr
                    {
                    ASSIGN14=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN14);


                    // Atto.g:45:13: ( NEWLINE )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NEWLINE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Atto.g:45:13: NEWLINE
                            {
                            NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign236); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE15);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expr_in_assign239);
                    expr16=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr16.getTree());

                    // AST REWRITE
                    // elements: postfix, expr, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 45:27: -> ^( ASSIGN postfix expr )
                    {
                        // Atto.g:45:30: ^( ASSIGN postfix expr )
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
                    // Atto.g:46:6: ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
                    {
                    // Atto.g:46:6: ( PLUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( PLUS postfix expr ) ) | MINUS ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MINUS postfix expr ) ) | MUL ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MUL postfix expr ) ) | DIV ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( DIV postfix expr ) ) | MOD ASSIGN ( NEWLINE )? expr -> ^( ASSIGN postfix ^( MOD postfix expr ) ) )
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
                            // Atto.g:46:8: PLUS ASSIGN ( NEWLINE )? expr
                            {
                            PLUS17=(Token)match(input,PLUS,FOLLOW_PLUS_in_assign258); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PLUS.add(PLUS17);


                            ASSIGN18=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign260); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN18);


                            // Atto.g:46:20: ( NEWLINE )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==NEWLINE) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // Atto.g:46:20: NEWLINE
                                    {
                                    NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign262); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE19);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign265);
                            expr20=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr20.getTree());

                            // AST REWRITE
                            // elements: postfix, ASSIGN, PLUS, postfix, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 46:34: -> ^( ASSIGN postfix ^( PLUS postfix expr ) )
                            {
                                // Atto.g:46:37: ^( ASSIGN postfix ^( PLUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:46:54: ^( PLUS postfix expr )
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
                            // Atto.g:47:8: MINUS ASSIGN ( NEWLINE )? expr
                            {
                            MINUS21=(Token)match(input,MINUS,FOLLOW_MINUS_in_assign290); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MINUS.add(MINUS21);


                            ASSIGN22=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign292); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN22);


                            // Atto.g:47:21: ( NEWLINE )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==NEWLINE) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // Atto.g:47:21: NEWLINE
                                    {
                                    NEWLINE23=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign294); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE23);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign297);
                            expr24=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr24.getTree());

                            // AST REWRITE
                            // elements: postfix, postfix, expr, MINUS, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 47:35: -> ^( ASSIGN postfix ^( MINUS postfix expr ) )
                            {
                                // Atto.g:47:38: ^( ASSIGN postfix ^( MINUS postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:47:55: ^( MINUS postfix expr )
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
                            // Atto.g:48:8: MUL ASSIGN ( NEWLINE )? expr
                            {
                            MUL25=(Token)match(input,MUL,FOLLOW_MUL_in_assign322); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MUL.add(MUL25);


                            ASSIGN26=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign324); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN26);


                            // Atto.g:48:19: ( NEWLINE )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NEWLINE) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // Atto.g:48:19: NEWLINE
                                    {
                                    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign326); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE27);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign329);
                            expr28=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr28.getTree());

                            // AST REWRITE
                            // elements: ASSIGN, MUL, expr, postfix, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 48:33: -> ^( ASSIGN postfix ^( MUL postfix expr ) )
                            {
                                // Atto.g:48:36: ^( ASSIGN postfix ^( MUL postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:48:53: ^( MUL postfix expr )
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
                            // Atto.g:49:8: DIV ASSIGN ( NEWLINE )? expr
                            {
                            DIV29=(Token)match(input,DIV,FOLLOW_DIV_in_assign354); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIV.add(DIV29);


                            ASSIGN30=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign356); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN30);


                            // Atto.g:49:19: ( NEWLINE )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==NEWLINE) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // Atto.g:49:19: NEWLINE
                                    {
                                    NEWLINE31=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign358); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE31);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign361);
                            expr32=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr32.getTree());

                            // AST REWRITE
                            // elements: expr, DIV, ASSIGN, postfix, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 49:33: -> ^( ASSIGN postfix ^( DIV postfix expr ) )
                            {
                                // Atto.g:49:36: ^( ASSIGN postfix ^( DIV postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:49:53: ^( DIV postfix expr )
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
                            // Atto.g:50:8: MOD ASSIGN ( NEWLINE )? expr
                            {
                            MOD33=(Token)match(input,MOD,FOLLOW_MOD_in_assign386); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MOD.add(MOD33);


                            ASSIGN34=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign388); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN34);


                            // Atto.g:50:19: ( NEWLINE )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NEWLINE) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // Atto.g:50:19: NEWLINE
                                    {
                                    NEWLINE35=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign390); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE35);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_assign393);
                            expr36=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr36.getTree());

                            // AST REWRITE
                            // elements: postfix, MOD, expr, postfix, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 50:33: -> ^( ASSIGN postfix ^( MOD postfix expr ) )
                            {
                                // Atto.g:50:36: ^( ASSIGN postfix ^( MOD postfix expr ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:50:53: ^( MOD postfix expr )
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
    // Atto.g:55:1: paramsdef : ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) ;
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA38=null;
        AttoParser.vardef_return vardef37 =null;

        AttoParser.vardef_return vardef39 =null;


        AttoTree COMMA38_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:56:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) )
            // Atto.g:56:4: ( vardef ( COMMA vardef )* )?
            {
            // Atto.g:56:4: ( vardef ( COMMA vardef )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==AT||LA16_0==NAME) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Atto.g:56:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_paramsdef434);
                    vardef37=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef37.getTree());

                    // Atto.g:56:12: ( COMMA vardef )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Atto.g:56:13: COMMA vardef
                    	    {
                    	    COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef437); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA38);


                    	    pushFollow(FOLLOW_vardef_in_paramsdef439);
                    	    vardef39=vardef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_vardef.add(vardef39.getTree());

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
            // 56:30: -> ^( PARAMS ( vardef )* )
            {
                // Atto.g:56:33: ^( PARAMS ( vardef )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // Atto.g:56:42: ( vardef )*
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
    // Atto.g:59:1: if_ : 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal40=null;
        Token NEWLINE41=null;
        Token NEWLINE43=null;
        Token string_literal46=null;
        Token string_literal47=null;
        Token string_literal48=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block42 =null;

        AttoParser.elif_return elif44 =null;

        AttoParser.else__return else_45 =null;


        AttoTree string_literal40_tree=null;
        AttoTree NEWLINE41_tree=null;
        AttoTree NEWLINE43_tree=null;
        AttoTree string_literal46_tree=null;
        AttoTree string_literal47_tree=null;
        AttoTree string_literal48_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:60:2: ( 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:60:4: 'if' cond_expr= expr ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal40=(Token)match(input,IF,FOLLOW_IF_in_if_465); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal40);


            pushFollow(FOLLOW_expr_in_if_469);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:61:4: ( NEWLINE block NEWLINE ( elif )* ( else_ )? 'end' -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NEWLINE) ) {
                alt20=1;
            }
            else if ( (LA20_0==69) ) {
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
                    // Atto.g:61:6: NEWLINE block NEWLINE ( elif )* ( else_ )? 'end'
                    {
                    NEWLINE41=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE41);


                    pushFollow(FOLLOW_block_in_if_479);
                    block42=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block42.getTree());

                    NEWLINE43=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE43);


                    // Atto.g:61:28: ( elif )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==ELIF) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Atto.g:61:28: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_483);
                    	    elif44=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    // Atto.g:61:34: ( else_ )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ELSE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Atto.g:61:34: else_
                            {
                            pushFollow(FOLLOW_else__in_if_486);
                            else_45=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_45.getTree());

                            }
                            break;

                    }


                    string_literal46=(Token)match(input,68,FOLLOW_68_in_if_489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal46);


                    // AST REWRITE
                    // elements: block, elif, else_, cond_expr
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
                    // 62:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:62:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:62:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:62:36: ( else_ )?
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
                    // Atto.g:63:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal47=(Token)match(input,69,FOLLOW_69_in_if_517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal47);


                    pushFollow(FOLLOW_expr_in_if_521);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:63:28: ( 'else' else_expr= expr )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ELSE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Atto.g:63:29: 'else' else_expr= expr
                            {
                            string_literal48=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_524); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal48);


                            pushFollow(FOLLOW_expr_in_if_528);
                            else_expr=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: else_expr, cond_expr, then_expr
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
                    // 64:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:64:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:64:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:64:35: ^( ELSE $else_expr)
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
    // Atto.g:68:1: elif : 'elif' expr NEWLINE block NEWLINE -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal49=null;
        Token NEWLINE51=null;
        Token NEWLINE53=null;
        AttoParser.expr_return expr50 =null;

        AttoParser.block_return block52 =null;


        AttoTree string_literal49_tree=null;
        AttoTree NEWLINE51_tree=null;
        AttoTree NEWLINE53_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:69:2: ( 'elif' expr NEWLINE block NEWLINE -> ^( ELIF expr block ) )
            // Atto.g:69:4: 'elif' expr NEWLINE block NEWLINE
            {
            string_literal49=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif571); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal49);


            pushFollow(FOLLOW_expr_in_elif573);
            expr50=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr50.getTree());

            NEWLINE51=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE51);


            pushFollow(FOLLOW_block_in_elif577);
            block52=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block52.getTree());

            NEWLINE53=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE53);


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
            // 69:38: -> ^( ELIF expr block )
            {
                // Atto.g:69:41: ^( ELIF expr block )
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
    // Atto.g:72:1: else_ : 'else' NEWLINE block NEWLINE -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal54=null;
        Token NEWLINE55=null;
        Token NEWLINE57=null;
        AttoParser.block_return block56 =null;


        AttoTree string_literal54_tree=null;
        AttoTree NEWLINE55_tree=null;
        AttoTree NEWLINE57_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:73:2: ( 'else' NEWLINE block NEWLINE -> ^( ELSE block ) )
            // Atto.g:73:4: 'else' NEWLINE block NEWLINE
            {
            string_literal54=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal54);


            NEWLINE55=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE55);


            pushFollow(FOLLOW_block_in_else_604);
            block56=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block56.getTree());

            NEWLINE57=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE57);


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
            // 73:34: -> ^( ELSE block )
            {
                // Atto.g:73:37: ^( ELSE block )
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
    // Atto.g:76:1: while_ : 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal58=null;
        Token NEWLINE59=null;
        Token NEWLINE61=null;
        Token string_literal62=null;
        Token string_literal63=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block60 =null;


        AttoTree string_literal58_tree=null;
        AttoTree NEWLINE59_tree=null;
        AttoTree NEWLINE61_tree=null;
        AttoTree string_literal62_tree=null;
        AttoTree string_literal63_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:77:2: ( 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:77:4: 'while' cond_expr= expr ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal58=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal58);


            pushFollow(FOLLOW_expr_in_while_631);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:78:4: ( NEWLINE block NEWLINE 'end' -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NEWLINE) ) {
                alt21=1;
            }
            else if ( (LA21_0==69) ) {
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
                    // Atto.g:78:6: NEWLINE block NEWLINE 'end'
                    {
                    NEWLINE59=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE59);


                    pushFollow(FOLLOW_block_in_while_641);
                    block60=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block60.getTree());

                    NEWLINE61=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE61);


                    string_literal62=(Token)match(input,68,FOLLOW_68_in_while_645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal62);


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
                    // 79:5: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:79:8: ^( WHILE $cond_expr block )
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
                    // Atto.g:80:6: 'then' then_expr= expr
                    {
                    string_literal63=(Token)match(input,69,FOLLOW_69_in_while_668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal63);


                    pushFollow(FOLLOW_expr_in_while_672);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // AST REWRITE
                    // elements: cond_expr, then_expr
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
                    // 81:5: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:81:8: ^( WHILE $cond_expr $then_expr)
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
    // Atto.g:85:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR65=null;
        AttoParser.and_return and64 =null;

        AttoParser.and_return and66 =null;


        AttoTree OR65_tree=null;

        try {
            // Atto.g:86:2: ( and ( OR ^ and )* )
            // Atto.g:86:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or704);
            and64=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and64.getTree());

            // Atto.g:86:8: ( OR ^ and )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==OR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Atto.g:86:9: OR ^ and
            	    {
            	    OR65=(Token)match(input,OR,FOLLOW_OR_in_or707); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR65_tree = 
            	    (AttoTree)adaptor.create(OR65)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR65_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or710);
            	    and66=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and66.getTree());

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
    // Atto.g:89:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND68=null;
        AttoParser.rel_return rel67 =null;

        AttoParser.rel_return rel69 =null;


        AttoTree AND68_tree=null;

        try {
            // Atto.g:90:2: ( rel ( AND ^ rel )* )
            // Atto.g:90:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and723);
            rel67=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel67.getTree());

            // Atto.g:90:8: ( AND ^ rel )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Atto.g:90:9: AND ^ rel
            	    {
            	    AND68=(Token)match(input,AND,FOLLOW_AND_in_and726); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND68_tree = 
            	    (AttoTree)adaptor.create(AND68)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND68_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and729);
            	    rel69=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel69.getTree());

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
    // Atto.g:93:1: rel : reverse_pipeline ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set71=null;
        AttoParser.reverse_pipeline_return reverse_pipeline70 =null;

        AttoParser.reverse_pipeline_return reverse_pipeline72 =null;


        AttoTree set71_tree=null;

        try {
            // Atto.g:94:2: ( reverse_pipeline ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline )* )
            // Atto.g:94:4: reverse_pipeline ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_reverse_pipeline_in_rel742);
            reverse_pipeline70=reverse_pipeline();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, reverse_pipeline70.getTree());

            // Atto.g:94:21: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMPOSITE||LA24_0==EQ||(LA24_0 >= GE && LA24_0 <= GT)||LA24_0==LE||LA24_0==LT||LA24_0==NE||LA24_0==PIPELINE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Atto.g:94:22: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ reverse_pipeline
            	    {
            	    set71=(Token)input.LT(1);

            	    set71=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set71)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_reverse_pipeline_in_rel764);
            	    reverse_pipeline72=reverse_pipeline();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, reverse_pipeline72.getTree());

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


    public static class reverse_pipeline_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reverse_pipeline"
    // Atto.g:97:1: reverse_pipeline : add ( REVERSE_PIPELINE ^ rel )* ;
    public final AttoParser.reverse_pipeline_return reverse_pipeline() throws RecognitionException {
        AttoParser.reverse_pipeline_return retval = new AttoParser.reverse_pipeline_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token REVERSE_PIPELINE74=null;
        AttoParser.add_return add73 =null;

        AttoParser.rel_return rel75 =null;


        AttoTree REVERSE_PIPELINE74_tree=null;

        try {
            // Atto.g:98:2: ( add ( REVERSE_PIPELINE ^ rel )* )
            // Atto.g:98:4: add ( REVERSE_PIPELINE ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_reverse_pipeline777);
            add73=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add73.getTree());

            // Atto.g:98:8: ( REVERSE_PIPELINE ^ rel )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==REVERSE_PIPELINE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Atto.g:98:9: REVERSE_PIPELINE ^ rel
            	    {
            	    REVERSE_PIPELINE74=(Token)match(input,REVERSE_PIPELINE,FOLLOW_REVERSE_PIPELINE_in_reverse_pipeline780); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    REVERSE_PIPELINE74_tree = 
            	    (AttoTree)adaptor.create(REVERSE_PIPELINE74)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(REVERSE_PIPELINE74_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_reverse_pipeline783);
            	    rel75=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel75.getTree());

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
    // $ANTLR end "reverse_pipeline"


    public static class add_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // Atto.g:101:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set77=null;
        AttoParser.mul_return mul76 =null;

        AttoParser.mul_return mul78 =null;


        AttoTree set77_tree=null;

        try {
            // Atto.g:102:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:102:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add796);
            mul76=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul76.getTree());

            // Atto.g:102:8: ( ( PLUS | MINUS ) ^ mul )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==PLUS) ) {
                    alt26=1;
                }
                else if ( (LA26_0==MINUS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Atto.g:102:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set77=(Token)input.LT(1);

            	    set77=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set77)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add806);
            	    mul78=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul78.getTree());

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
    // Atto.g:105:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set80=null;
        AttoParser.unary_return unary79 =null;

        AttoParser.unary_return unary81 =null;


        AttoTree set80_tree=null;

        try {
            // Atto.g:106:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:106:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul819);
            unary79=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary79.getTree());

            // Atto.g:106:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case MUL:
                    {
                    alt27=1;
                    }
                    break;
                case DIV:
                    {
                    alt27=1;
                    }
                    break;
                case MOD:
                    {
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // Atto.g:106:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set80=(Token)input.LT(1);

            	    set80=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set80)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mul831);
            	    unary81=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary81.getTree());

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
    // Atto.g:109:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT83=null;
        Token MINUS85=null;
        AttoParser.postfix_return postfix82 =null;

        AttoParser.postfix_return postfix84 =null;

        AttoParser.postfix_return postfix86 =null;


        AttoTree NOT83_tree=null;
        AttoTree MINUS85_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:110:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
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
                    // Atto.g:110:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary845);
                    postfix82=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix82.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:111:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_unary850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT83_tree = 
                    (AttoTree)adaptor.create(NOT83)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT83_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary853);
                    postfix84=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix84.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:112:4: MINUS postfix
                    {
                    MINUS85=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS85);


                    pushFollow(FOLLOW_postfix_in_unary860);
                    postfix86=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix86.getTree());

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
                    // 112:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:112:21: ^( UNARY_MINUS postfix )
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
    // Atto.g:115:1: postfix : ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) |{...}? => expr -> ^( APPLY $postfix expr ) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN88=null;
        Token COMMA90=null;
        Token RPAREN92=null;
        Token LBRACK93=null;
        Token RBRACK95=null;
        Token DOT96=null;
        AttoParser.primary_return primary87 =null;

        AttoParser.expr_return expr89 =null;

        AttoParser.expr_return expr91 =null;

        AttoParser.expr_return expr94 =null;

        AttoParser.primary_return primary97 =null;

        AttoParser.expr_return expr98 =null;


        AttoTree LPAREN88_tree=null;
        AttoTree COMMA90_tree=null;
        AttoTree RPAREN92_tree=null;
        AttoTree LBRACK93_tree=null;
        AttoTree RBRACK95_tree=null;
        AttoTree DOT96_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:116:2: ( ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) |{...}? => expr -> ^( APPLY $postfix expr ) )* )
            // Atto.g:116:4: ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) |{...}? => expr -> ^( APPLY $postfix expr ) )*
            {
            // Atto.g:116:4: ( primary -> primary )
            // Atto.g:116:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix883);
            primary87=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary87.getTree());

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
            // 116:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:117:4: ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT primary -> ^( FIELD_ACCESS $postfix primary ) |{...}? => expr -> ^( APPLY $postfix expr ) )*
            loop31:
            do {
                int alt31=5;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==MINUS) ) {
                    int LA31_3 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==LPAREN) ) {
                    alt31=1;
                }
                else if ( (LA31_0==LBRACK) ) {
                    alt31=2;
                }
                else if ( (LA31_0==DOT) ) {
                    alt31=3;
                }
                else if ( (LA31_0==NAME) && (( input.LA(1) != MINUS ))) {
                    int LA31_23 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==AT) && (( input.LA(1) != MINUS ))) {
                    int LA31_24 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==NUMBER) && (( input.LA(1) != MINUS ))) {
                    int LA31_25 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==STRING) && (( input.LA(1) != MINUS ))) {
                    int LA31_26 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==BOOL) && (( input.LA(1) != MINUS ))) {
                    int LA31_27 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==NULL) && (( input.LA(1) != MINUS ))) {
                    int LA31_28 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==LCURLY) && (( input.LA(1) != MINUS ))) {
                    int LA31_29 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==NOT) && (( input.LA(1) != MINUS ))) {
                    int LA31_30 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==IF) && (( input.LA(1) != MINUS ))) {
                    int LA31_31 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }
                else if ( (LA31_0==WHILE) && (( input.LA(1) != MINUS ))) {
                    int LA31_32 = input.LA(2);

                    if ( (( input.LA(1) != MINUS )) ) {
                        alt31=4;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // Atto.g:117:6: LPAREN ( expr ( COMMA expr )* )? RPAREN
            	    {
            	    LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix895); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN88);


            	    // Atto.g:117:13: ( expr ( COMMA expr )* )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==AT||LA30_0==BOOL||LA30_0==IF||(LA30_0 >= LBRACK && LA30_0 <= LCURLY)||LA30_0==LPAREN||LA30_0==MINUS||LA30_0==NAME||(LA30_0 >= NOT && LA30_0 <= NUMBER)||LA30_0==STRING||LA30_0==WHILE) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // Atto.g:117:14: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix898);
            	            expr89=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr89.getTree());

            	            // Atto.g:117:19: ( COMMA expr )*
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==COMMA) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // Atto.g:117:20: COMMA expr
            	            	    {
            	            	    COMMA90=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix901); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA90);


            	            	    pushFollow(FOLLOW_expr_in_postfix903);
            	            	    expr91=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr91.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop29;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix909); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN92);


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
            	    // 118:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:118:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:118:24: ( expr )*
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
            	    // Atto.g:119:6: LBRACK expr RBRACK
            	    {
            	    LBRACK93=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix934); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK93);


            	    pushFollow(FOLLOW_expr_in_postfix936);
            	    expr94=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr94.getTree());

            	    RBRACK95=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix938); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK95);


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
            	    // 120:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:120:8: ^( INDEX $postfix expr )
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
            	    // Atto.g:121:6: DOT primary
            	    {
            	    DOT96=(Token)match(input,DOT,FOLLOW_DOT_in_postfix961); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT96);


            	    pushFollow(FOLLOW_primary_in_postfix963);
            	    primary97=primary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_primary.add(primary97.getTree());

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
            	    // 122:5: -> ^( FIELD_ACCESS $postfix primary )
            	    {
            	        // Atto.g:122:8: ^( FIELD_ACCESS $postfix primary )
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
            	    // Atto.g:123:6: {...}? => expr
            	    {
            	    if ( !(( input.LA(1) != MINUS )) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "postfix", " input.LA(1) != MINUS ");
            	    }

            	    pushFollow(FOLLOW_expr_in_postfix989);
            	    expr98=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr98.getTree());

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
            	    // 124:5: -> ^( APPLY $postfix expr )
            	    {
            	        // Atto.g:124:8: ^( APPLY $postfix expr )
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
    // $ANTLR end "postfix"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:128:1: primary : ( NAME | AT ^ NAME | NUMBER | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | ( obj )=> obj | fun | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME99=null;
        Token AT100=null;
        Token NAME101=null;
        Token NUMBER102=null;
        Token STRING103=null;
        Token BOOL104=null;
        Token NULL105=null;
        Token LPAREN106=null;
        Token RPAREN108=null;
        AttoParser.expr_return expr107 =null;

        AttoParser.obj_return obj109 =null;

        AttoParser.fun_return fun110 =null;

        AttoParser.array_return array111 =null;


        AttoTree NAME99_tree=null;
        AttoTree AT100_tree=null;
        AttoTree NAME101_tree=null;
        AttoTree NUMBER102_tree=null;
        AttoTree STRING103_tree=null;
        AttoTree BOOL104_tree=null;
        AttoTree NULL105_tree=null;
        AttoTree LPAREN106_tree=null;
        AttoTree RPAREN108_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:129:2: ( NAME | AT ^ NAME | NUMBER | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | ( obj )=> obj | fun | array )
            int alt32=10;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt32=1;
                }
                break;
            case AT:
                {
                alt32=2;
                }
                break;
            case NUMBER:
                {
                alt32=3;
                }
                break;
            case STRING:
                {
                alt32=4;
                }
                break;
            case BOOL:
                {
                alt32=5;
                }
                break;
            case NULL:
                {
                alt32=6;
                }
                break;
            case LPAREN:
                {
                alt32=7;
                }
                break;
            case LCURLY:
                {
                int LA32_8 = input.LA(2);

                if ( (LA32_8==NEWLINE) ) {
                    int LA32_10 = input.LA(3);

                    if ( (LA32_10==NAME) ) {
                        int LA32_15 = input.LA(4);

                        if ( (LA32_15==COLON) && (synpred2_Atto())) {
                            alt32=8;
                        }
                        else if ( (LA32_15==AND||(LA32_15 >= ASSIGN && LA32_15 <= AT)||LA32_15==BOOL||LA32_15==COMPOSITE||(LA32_15 >= DIV && LA32_15 <= DOT)||LA32_15==EQ||(LA32_15 >= GE && LA32_15 <= GT)||LA32_15==IF||(LA32_15 >= LBRACK && LA32_15 <= LE)||(LA32_15 >= LPAREN && LA32_15 <= NUMBER)||LA32_15==OR||(LA32_15 >= PIPELINE && LA32_15 <= PLUS)||(LA32_15 >= RCURLY && LA32_15 <= REVERSE_PIPELINE)||LA32_15==SEMICOLON||LA32_15==STRING||LA32_15==WHILE) ) {
                            alt32=9;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 15, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA32_10==COMMA) && (synpred2_Atto())) {
                        alt32=8;
                    }
                    else if ( (LA32_10==NEWLINE) ) {
                        int LA32_16 = input.LA(4);

                        if ( (LA32_16==RCURLY) ) {
                            int LA32_19 = input.LA(5);

                            if ( (synpred2_Atto()) ) {
                                alt32=8;
                            }
                            else if ( (true) ) {
                                alt32=9;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 16, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA32_10==RCURLY) ) {
                        int LA32_17 = input.LA(4);

                        if ( (synpred2_Atto()) ) {
                            alt32=8;
                        }
                        else if ( (true) ) {
                            alt32=9;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 17, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA32_10==AT||LA32_10==BOOL||LA32_10==IF||(LA32_10 >= LBRACK && LA32_10 <= LCURLY)||LA32_10==LPAREN||LA32_10==MINUS||(LA32_10 >= NOT && LA32_10 <= NUMBER)||LA32_10==SEMICOLON||LA32_10==STRING||LA32_10==WHILE) ) {
                        alt32=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 10, input);

                        throw nvae;

                    }
                }
                else if ( (LA32_8==NAME) ) {
                    int LA32_11 = input.LA(3);

                    if ( (LA32_11==COLON) && (synpred2_Atto())) {
                        alt32=8;
                    }
                    else if ( (LA32_11==AND||(LA32_11 >= ARROW && LA32_11 <= AT)||LA32_11==BOOL||(LA32_11 >= COMMA && LA32_11 <= COMPOSITE)||(LA32_11 >= DIV && LA32_11 <= DOT)||LA32_11==EQ||(LA32_11 >= GE && LA32_11 <= GT)||LA32_11==IF||(LA32_11 >= LBRACK && LA32_11 <= LE)||(LA32_11 >= LPAREN && LA32_11 <= NUMBER)||LA32_11==OR||(LA32_11 >= PIPELINE && LA32_11 <= PLUS)||(LA32_11 >= RCURLY && LA32_11 <= REVERSE_PIPELINE)||LA32_11==SEMICOLON||LA32_11==STRING||LA32_11==WHILE) ) {
                        alt32=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 11, input);

                        throw nvae;

                    }
                }
                else if ( (LA32_8==COMMA) && (synpred2_Atto())) {
                    alt32=8;
                }
                else if ( (LA32_8==RCURLY) ) {
                    int LA32_13 = input.LA(3);

                    if ( (synpred2_Atto()) ) {
                        alt32=8;
                    }
                    else if ( (true) ) {
                        alt32=9;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 13, input);

                        throw nvae;

                    }
                }
                else if ( (LA32_8==ARROW||LA32_8==AT||LA32_8==BOOL||LA32_8==IF||(LA32_8 >= LBRACK && LA32_8 <= LCURLY)||LA32_8==LPAREN||LA32_8==MINUS||(LA32_8 >= NOT && LA32_8 <= NUMBER)||LA32_8==SEMICOLON||LA32_8==STRING||LA32_8==WHILE) ) {
                    alt32=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 8, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                alt32=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // Atto.g:129:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME99=(Token)match(input,NAME,FOLLOW_NAME_in_primary1022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME99_tree = 
                    (AttoTree)adaptor.create(NAME99)
                    ;
                    adaptor.addChild(root_0, NAME99_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:130:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT100=(Token)match(input,AT,FOLLOW_AT_in_primary1027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT100_tree = 
                    (AttoTree)adaptor.create(AT100)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT100_tree, root_0);
                    }

                    NAME101=(Token)match(input,NAME,FOLLOW_NAME_in_primary1030); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME101_tree = 
                    (AttoTree)adaptor.create(NAME101)
                    ;
                    adaptor.addChild(root_0, NAME101_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:131:4: NUMBER
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NUMBER102=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_primary1035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER102_tree = 
                    (AttoTree)adaptor.create(NUMBER102)
                    ;
                    adaptor.addChild(root_0, NUMBER102_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:132:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING103=(Token)match(input,STRING,FOLLOW_STRING_in_primary1040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING103_tree = 
                    (AttoTree)adaptor.create(STRING103)
                    ;
                    adaptor.addChild(root_0, STRING103_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:133:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL104=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary1045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL104_tree = 
                    (AttoTree)adaptor.create(BOOL104)
                    ;
                    adaptor.addChild(root_0, BOOL104_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:134:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL105=(Token)match(input,NULL,FOLLOW_NULL_in_primary1050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL105_tree = 
                    (AttoTree)adaptor.create(NULL105)
                    ;
                    adaptor.addChild(root_0, NULL105_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:135:4: LPAREN expr RPAREN
                    {
                    LPAREN106=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN106);


                    pushFollow(FOLLOW_expr_in_primary1057);
                    expr107=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr107.getTree());

                    RPAREN108=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN108);


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
                    // 135:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:136:4: ( obj )=> obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary1073);
                    obj109=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj109.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:137:4: fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_primary1078);
                    fun110=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun110.getTree());

                    }
                    break;
                case 10 :
                    // Atto.g:138:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary1083);
                    array111=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array111.getTree());

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
    // Atto.g:141:1: obj : LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY112=null;
        Token NEWLINE113=null;
        Token COMMA115=null;
        Token COMMA116=null;
        Token NEWLINE117=null;
        Token COMMA119=null;
        Token COMMA120=null;
        Token NEWLINE121=null;
        Token RCURLY122=null;
        AttoParser.pair_return pair114 =null;

        AttoParser.pair_return pair118 =null;


        AttoTree LCURLY112_tree=null;
        AttoTree NEWLINE113_tree=null;
        AttoTree COMMA115_tree=null;
        AttoTree COMMA116_tree=null;
        AttoTree NEWLINE117_tree=null;
        AttoTree COMMA119_tree=null;
        AttoTree COMMA120_tree=null;
        AttoTree NEWLINE121_tree=null;
        AttoTree RCURLY122_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:142:2: ( LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:142:4: LCURLY ( NEWLINE )? ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )? ( COMMA | ( COMMA )? NEWLINE )? RCURLY
            {
            LCURLY112=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj1095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY112);


            // Atto.g:142:11: ( NEWLINE )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NEWLINE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Atto.g:142:11: NEWLINE
                    {
                    NEWLINE113=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1097); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE113);


                    }
                    break;

            }


            // Atto.g:142:20: ( pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==NAME) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Atto.g:142:21: pair ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj1101);
                    pair114=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair114.getTree());

                    // Atto.g:142:26: ( ( COMMA | ( COMMA )? NEWLINE ) pair )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==COMMA) ) {
                            int LA36_1 = input.LA(2);

                            if ( (LA36_1==NEWLINE) ) {
                                int LA36_2 = input.LA(3);

                                if ( (LA36_2==NAME) ) {
                                    alt36=1;
                                }


                            }
                            else if ( (LA36_1==NAME) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0==NEWLINE) ) {
                            int LA36_2 = input.LA(2);

                            if ( (LA36_2==NAME) ) {
                                alt36=1;
                            }


                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Atto.g:142:27: ( COMMA | ( COMMA )? NEWLINE ) pair
                    	    {
                    	    // Atto.g:142:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( (LA35_0==COMMA) ) {
                    	        int LA35_1 = input.LA(2);

                    	        if ( (LA35_1==NAME) ) {
                    	            alt35=1;
                    	        }
                    	        else if ( (LA35_1==NEWLINE) ) {
                    	            alt35=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 35, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA35_0==NEWLINE) ) {
                    	        alt35=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 35, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // Atto.g:142:28: COMMA
                    	            {
                    	            COMMA115=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1105); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA115);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:142:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:142:34: ( COMMA )?
                    	            int alt34=2;
                    	            int LA34_0 = input.LA(1);

                    	            if ( (LA34_0==COMMA) ) {
                    	                alt34=1;
                    	            }
                    	            switch (alt34) {
                    	                case 1 :
                    	                    // Atto.g:142:34: COMMA
                    	                    {
                    	                    COMMA116=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1107); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA116);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE117=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1110); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE117);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_obj1113);
                    	    pair118=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair118.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:142:59: ( COMMA | ( COMMA )? NEWLINE )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COMMA) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RCURLY) ) {
                    alt39=1;
                }
                else if ( (LA39_1==NEWLINE) ) {
                    alt39=2;
                }
            }
            else if ( (LA39_0==NEWLINE) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // Atto.g:142:60: COMMA
                    {
                    COMMA119=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA119);


                    }
                    break;
                case 2 :
                    // Atto.g:142:66: ( COMMA )? NEWLINE
                    {
                    // Atto.g:142:66: ( COMMA )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==COMMA) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // Atto.g:142:66: COMMA
                            {
                            COMMA120=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1122); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA120);


                            }
                            break;

                    }


                    NEWLINE121=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_obj1125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE121);


                    }
                    break;

            }


            RCURLY122=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj1129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY122);


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
            // 142:90: -> ^( OBJ ( pair )* )
            {
                // Atto.g:142:93: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:142:99: ( pair )*
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
    // Atto.g:145:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME123=null;
        Token COLON124=null;
        AttoParser.expr_return expr125 =null;


        AttoTree NAME123_tree=null;
        AttoTree COLON124_tree=null;

        try {
            // Atto.g:146:2: ( NAME COLON ^ expr )
            // Atto.g:146:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME123=(Token)match(input,NAME,FOLLOW_NAME_in_pair1149); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME123_tree = 
            (AttoTree)adaptor.create(NAME123)
            ;
            adaptor.addChild(root_0, NAME123_tree);
            }

            COLON124=(Token)match(input,COLON,FOLLOW_COLON_in_pair1151); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON124_tree = 
            (AttoTree)adaptor.create(COLON124)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON124_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair1154);
            expr125=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr125.getTree());

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
    // Atto.g:149:1: fun : LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY -> ^( FUN ( paramsdef )? block ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY126=null;
        Token ARROW128=null;
        Token NEWLINE129=null;
        Token RCURLY131=null;
        AttoParser.paramsdef_return paramsdef127 =null;

        AttoParser.block_return block130 =null;


        AttoTree LCURLY126_tree=null;
        AttoTree ARROW128_tree=null;
        AttoTree NEWLINE129_tree=null;
        AttoTree RCURLY131_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:150:2: ( LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY -> ^( FUN ( paramsdef )? block ) )
            // Atto.g:150:4: LCURLY ( paramsdef ARROW )? ( NEWLINE )? block RCURLY
            {
            LCURLY126=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_fun1165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY126);


            // Atto.g:150:11: ( paramsdef ARROW )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case AT:
                    {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==NAME) ) {
                        int LA40_5 = input.LA(3);

                        if ( (LA40_5==ARROW||LA40_5==COMMA) ) {
                            alt40=1;
                        }
                    }
                    }
                    break;
                case NAME:
                    {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==ARROW||LA40_2==COMMA) ) {
                        alt40=1;
                    }
                    }
                    break;
                case ARROW:
                    {
                    alt40=1;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // Atto.g:150:12: paramsdef ARROW
                    {
                    pushFollow(FOLLOW_paramsdef_in_fun1168);
                    paramsdef127=paramsdef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef127.getTree());

                    ARROW128=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun1170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(ARROW128);


                    }
                    break;

            }


            // Atto.g:150:30: ( NEWLINE )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==NEWLINE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Atto.g:150:30: NEWLINE
                    {
                    NEWLINE129=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_fun1174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE129);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_fun1177);
            block130=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block130.getTree());

            RCURLY131=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_fun1179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY131);


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
            // 150:52: -> ^( FUN ( paramsdef )? block )
            {
                // Atto.g:150:55: ^( FUN ( paramsdef )? block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(FUN, "FUN")
                , root_1);

                // Atto.g:150:61: ( paramsdef )?
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
    // Atto.g:153:1: array : LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK132=null;
        Token NEWLINE133=null;
        Token COMMA135=null;
        Token COMMA136=null;
        Token NEWLINE137=null;
        Token COMMA139=null;
        Token COMMA140=null;
        Token NEWLINE141=null;
        Token RBRACK142=null;
        AttoParser.expr_return expr134 =null;

        AttoParser.expr_return expr138 =null;


        AttoTree LBRACK132_tree=null;
        AttoTree NEWLINE133_tree=null;
        AttoTree COMMA135_tree=null;
        AttoTree COMMA136_tree=null;
        AttoTree NEWLINE137_tree=null;
        AttoTree COMMA139_tree=null;
        AttoTree COMMA140_tree=null;
        AttoTree NEWLINE141_tree=null;
        AttoTree RBRACK142_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:154:2: ( LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:154:4: LBRACK ( NEWLINE )? ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )? ( COMMA | ( COMMA )? NEWLINE )? RBRACK
            {
            LBRACK132=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK132);


            // Atto.g:154:11: ( NEWLINE )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==NEWLINE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Atto.g:154:11: NEWLINE
                    {
                    NEWLINE133=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE133);


                    }
                    break;

            }


            // Atto.g:154:20: ( expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AT||LA46_0==BOOL||LA46_0==IF||(LA46_0 >= LBRACK && LA46_0 <= LCURLY)||LA46_0==LPAREN||LA46_0==MINUS||LA46_0==NAME||(LA46_0 >= NOT && LA46_0 <= NUMBER)||LA46_0==STRING||LA46_0==WHILE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Atto.g:154:21: expr ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1208);
                    expr134=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr134.getTree());

                    // Atto.g:154:26: ( ( COMMA | ( COMMA )? NEWLINE ) expr )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==COMMA) ) {
                            int LA45_1 = input.LA(2);

                            if ( (LA45_1==NEWLINE) ) {
                                int LA45_2 = input.LA(3);

                                if ( (LA45_2==AT||LA45_2==BOOL||LA45_2==IF||(LA45_2 >= LBRACK && LA45_2 <= LCURLY)||LA45_2==LPAREN||LA45_2==MINUS||LA45_2==NAME||(LA45_2 >= NOT && LA45_2 <= NUMBER)||LA45_2==STRING||LA45_2==WHILE) ) {
                                    alt45=1;
                                }


                            }
                            else if ( (LA45_1==AT||LA45_1==BOOL||LA45_1==IF||(LA45_1 >= LBRACK && LA45_1 <= LCURLY)||LA45_1==LPAREN||LA45_1==MINUS||LA45_1==NAME||(LA45_1 >= NOT && LA45_1 <= NUMBER)||LA45_1==STRING||LA45_1==WHILE) ) {
                                alt45=1;
                            }


                        }
                        else if ( (LA45_0==NEWLINE) ) {
                            int LA45_2 = input.LA(2);

                            if ( (LA45_2==AT||LA45_2==BOOL||LA45_2==IF||(LA45_2 >= LBRACK && LA45_2 <= LCURLY)||LA45_2==LPAREN||LA45_2==MINUS||LA45_2==NAME||(LA45_2 >= NOT && LA45_2 <= NUMBER)||LA45_2==STRING||LA45_2==WHILE) ) {
                                alt45=1;
                            }


                        }


                        switch (alt45) {
                    	case 1 :
                    	    // Atto.g:154:27: ( COMMA | ( COMMA )? NEWLINE ) expr
                    	    {
                    	    // Atto.g:154:27: ( COMMA | ( COMMA )? NEWLINE )
                    	    int alt44=2;
                    	    int LA44_0 = input.LA(1);

                    	    if ( (LA44_0==COMMA) ) {
                    	        int LA44_1 = input.LA(2);

                    	        if ( (LA44_1==AT||LA44_1==BOOL||LA44_1==IF||(LA44_1 >= LBRACK && LA44_1 <= LCURLY)||LA44_1==LPAREN||LA44_1==MINUS||LA44_1==NAME||(LA44_1 >= NOT && LA44_1 <= NUMBER)||LA44_1==STRING||LA44_1==WHILE) ) {
                    	            alt44=1;
                    	        }
                    	        else if ( (LA44_1==NEWLINE) ) {
                    	            alt44=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 44, 1, input);

                    	            throw nvae;

                    	        }
                    	    }
                    	    else if ( (LA44_0==NEWLINE) ) {
                    	        alt44=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 44, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt44) {
                    	        case 1 :
                    	            // Atto.g:154:28: COMMA
                    	            {
                    	            COMMA135=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1212); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA135);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Atto.g:154:34: ( COMMA )? NEWLINE
                    	            {
                    	            // Atto.g:154:34: ( COMMA )?
                    	            int alt43=2;
                    	            int LA43_0 = input.LA(1);

                    	            if ( (LA43_0==COMMA) ) {
                    	                alt43=1;
                    	            }
                    	            switch (alt43) {
                    	                case 1 :
                    	                    // Atto.g:154:34: COMMA
                    	                    {
                    	                    COMMA136=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1214); if (state.failed) return retval; 
                    	                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA136);


                    	                    }
                    	                    break;

                    	            }


                    	            NEWLINE137=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1217); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE137);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_expr_in_array1220);
                    	    expr138=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr138.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:154:60: ( COMMA | ( COMMA )? NEWLINE )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==COMMA) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RBRACK) ) {
                    alt48=1;
                }
                else if ( (LA48_1==NEWLINE) ) {
                    alt48=2;
                }
            }
            else if ( (LA48_0==NEWLINE) ) {
                alt48=2;
            }
            switch (alt48) {
                case 1 :
                    // Atto.g:154:61: COMMA
                    {
                    COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA139);


                    }
                    break;
                case 2 :
                    // Atto.g:154:67: ( COMMA )? NEWLINE
                    {
                    // Atto.g:154:67: ( COMMA )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==COMMA) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // Atto.g:154:67: COMMA
                            {
                            COMMA140=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1230); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA140);


                            }
                            break;

                    }


                    NEWLINE141=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_array1233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE141);


                    }
                    break;

            }


            RBRACK142=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK142);


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
            // 154:91: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:154:94: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:154:102: ( expr )*
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
    // Atto.g:157:1: vardef : ( AT )? NAME -> ^( VARDEF ( AT )? NAME ) ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AT143=null;
        Token NAME144=null;

        AttoTree AT143_tree=null;
        AttoTree NAME144_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

        try {
            // Atto.g:158:2: ( ( AT )? NAME -> ^( VARDEF ( AT )? NAME ) )
            // Atto.g:158:4: ( AT )? NAME
            {
            // Atto.g:158:4: ( AT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==AT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Atto.g:158:4: AT
                    {
                    AT143=(Token)match(input,AT,FOLLOW_AT_in_vardef1257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT.add(AT143);


                    }
                    break;

            }


            NAME144=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1260); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME144);


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
            // 158:13: -> ^( VARDEF ( AT )? NAME )
            {
                // Atto.g:158:16: ^( VARDEF ( AT )? NAME )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(VARDEF, "VARDEF")
                , root_1);

                // Atto.g:158:25: ( AT )?
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
        // Atto.g:37:4: ( assign )
        // Atto.g:37:5: assign
        {
        pushFollow(FOLLOW_assign_in_synpred1_Atto196);
        assign();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Atto

    // $ANTLR start synpred2_Atto
    public final void synpred2_Atto_fragment() throws RecognitionException {
        // Atto.g:136:4: ( obj )
        // Atto.g:136:5: obj
        {
        pushFollow(FOLLOW_obj_in_synpred2_Atto1069);
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
    public static final BitSet FOLLOW_expr_in_block144 = new BitSet(new long[]{0x0400200000000002L});
    public static final BitSet FOLLOW_terminator_in_block147 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_block149 = new BitSet(new long[]{0x0400200000000002L});
    public static final BitSet FOLLOW_terminator_in_block155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_terminator176 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terminator178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terminator183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign226 = new BitSet(new long[]{0x0020070000080100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign234 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_assign236 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assign239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_assign258 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign260 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_assign262 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assign265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_assign290 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign292 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_assign294 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assign297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_assign322 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign324 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_assign326 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assign329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_assign354 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign356 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_assign358 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assign361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_assign386 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign388 = new BitSet(new long[]{0x4001E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_assign390 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assign393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef434 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef437 = new BitSet(new long[]{0x0000080000000200L});
    public static final BitSet FOLLOW_vardef_in_paramsdef439 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_IF_in_if_465 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_469 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_if_477 = new BitSet(new long[]{0x4401E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_if_479 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_if_481 = new BitSet(new long[]{0x0000000000600000L,0x0000000000000010L});
    public static final BitSet FOLLOW_elif_in_if_483 = new BitSet(new long[]{0x0000000000600000L,0x0000000000000010L});
    public static final BitSet FOLLOW_else__in_if_486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_if_489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_if_517 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_521 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_524 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif571 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_elif573 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif575 = new BitSet(new long[]{0x4401E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_elif577 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_600 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_602 = new BitSet(new long[]{0x4401E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_else_604 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_627 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_631 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_while_639 = new BitSet(new long[]{0x4401E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_while_641 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_while_643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_while_645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_while_668 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or704 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_OR_in_or707 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_and_in_or710 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rel_in_and723 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and726 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_rel_in_and729 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_reverse_pipeline_in_rel742 = new BitSet(new long[]{0x0010108818810002L});
    public static final BitSet FOLLOW_set_in_rel745 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_reverse_pipeline_in_rel764 = new BitSet(new long[]{0x0010108818810002L});
    public static final BitSet FOLLOW_add_in_reverse_pipeline777 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_REVERSE_PIPELINE_in_reverse_pipeline780 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_rel_in_reverse_pipeline783 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_mul_in_add796 = new BitSet(new long[]{0x0020010000000002L});
    public static final BitSet FOLLOW_set_in_add799 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_mul_in_add806 = new BitSet(new long[]{0x0020010000000002L});
    public static final BitSet FOLLOW_unary_in_mul819 = new BitSet(new long[]{0x0000060000080002L});
    public static final BitSet FOLLOW_set_in_mul822 = new BitSet(new long[]{0x4001C94600000A00L});
    public static final BitSet FOLLOW_unary_in_mul831 = new BitSet(new long[]{0x0000060000080002L});
    public static final BitSet FOLLOW_postfix_in_unary845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary850 = new BitSet(new long[]{0x4001884600000A00L});
    public static final BitSet FOLLOW_postfix_in_unary853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary858 = new BitSet(new long[]{0x4001884600000A00L});
    public static final BitSet FOLLOW_postfix_in_unary860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix883 = new BitSet(new long[]{0x4001C94640100A02L,0x0000000000000004L});
    public static final BitSet FOLLOW_LPAREN_in_postfix895 = new BitSet(new long[]{0x4201C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_postfix898 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_COMMA_in_postfix901 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_postfix903 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix909 = new BitSet(new long[]{0x4001C94640100A02L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_postfix934 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_postfix936 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix938 = new BitSet(new long[]{0x4001C94640100A02L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOT_in_postfix961 = new BitSet(new long[]{0x4001884600000A00L});
    public static final BitSet FOLLOW_primary_in_postfix963 = new BitSet(new long[]{0x4001C94640100A02L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_postfix989 = new BitSet(new long[]{0x4001C94640100A02L,0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_primary1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary1027 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NAME_in_primary1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_primary1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary1055 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_primary1057 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_primary1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj1095 = new BitSet(new long[]{0x0080280000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1097 = new BitSet(new long[]{0x0080280000008000L});
    public static final BitSet FOLLOW_pair_in_obj1101 = new BitSet(new long[]{0x0080200000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1105 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1107 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1110 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_pair_in_obj1113 = new BitSet(new long[]{0x0080200000008000L});
    public static final BitSet FOLLOW_COMMA_in_obj1120 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_obj1122 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_obj1125 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair1149 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COLON_in_pair1151 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_pair1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_fun1165 = new BitSet(new long[]{0x4481E94640000A80L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramsdef_in_fun1168 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_fun1170 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_fun1174 = new BitSet(new long[]{0x4481E94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_fun1177 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_fun1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1202 = new BitSet(new long[]{0x4041E94640008A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_array1204 = new BitSet(new long[]{0x4041E94640008A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_array1208 = new BitSet(new long[]{0x0040200000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1212 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_array1214 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1217 = new BitSet(new long[]{0x4001C94640000A00L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_array1220 = new BitSet(new long[]{0x0040200000008000L});
    public static final BitSet FOLLOW_COMMA_in_array1228 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array1230 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_array1233 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_vardef1257 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NAME_in_vardef1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_synpred2_Atto1069 = new BitSet(new long[]{0x0000000000000002L});

}