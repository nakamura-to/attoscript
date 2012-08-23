// $ANTLR 3.4 Atto.g 2012-08-23 19:19:24

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "COLON", "COMMA", "COMMENT", "COMPOSITE", "CONSTANT", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "FIELD_ACCESS", "FLOAT", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "INT", "INTEGER", "LBRACK", "LCURLY", "LE", "LEADING_WS", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OR", "PARAMS", "PIPELINE", "PLUS", "RBRACK", "RCURLY", "RPAREN", "SEMICOLON", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__66=66;
    public static final int AND=4;
    public static final int ARRAY=5;
    public static final int ARROW=6;
    public static final int ASSIGN=7;
    public static final int AT=8;
    public static final int BLOCK=9;
    public static final int BOOL=10;
    public static final int CALL=11;
    public static final int COLON=12;
    public static final int COMMA=13;
    public static final int COMMENT=14;
    public static final int COMPOSITE=15;
    public static final int CONSTANT=16;
    public static final int DEDENT=17;
    public static final int DIGIT=18;
    public static final int DIV=19;
    public static final int DOT=20;
    public static final int ELIF=21;
    public static final int ELSE=22;
    public static final int EQ=23;
    public static final int FIELD_ACCESS=24;
    public static final int FLOAT=25;
    public static final int GE=26;
    public static final int GT=27;
    public static final int ID_CHAR=28;
    public static final int IF=29;
    public static final int INDENT=30;
    public static final int INDEX=31;
    public static final int INT=32;
    public static final int INTEGER=33;
    public static final int LBRACK=34;
    public static final int LCURLY=35;
    public static final int LE=36;
    public static final int LEADING_WS=37;
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
    public static final int OBJ=50;
    public static final int OR=51;
    public static final int PARAMS=52;
    public static final int PIPELINE=53;
    public static final int PLUS=54;
    public static final int RBRACK=55;
    public static final int RCURLY=56;
    public static final int RPAREN=57;
    public static final int SEMICOLON=58;
    public static final int SPACE=59;
    public static final int STMT=60;
    public static final int STRING=61;
    public static final int UNARY_MINUS=62;
    public static final int UPPER=63;
    public static final int WHILE=64;
    public static final int WS=65;

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


    	boolean thenMode = false;


    public static class root_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "root"
    // Atto.g:69:1: root : ( stmt )* EOF -> ^( BLOCK ( stmt )* ) ;
    public final AttoParser.root_return root() throws RecognitionException {
        AttoParser.root_return retval = new AttoParser.root_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token EOF2=null;
        AttoParser.stmt_return stmt1 =null;


        AttoTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // Atto.g:70:2: ( ( stmt )* EOF -> ^( BLOCK ( stmt )* ) )
            // Atto.g:70:4: ( stmt )* EOF
            {
            // Atto.g:70:4: ( stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ARROW||LA1_0==BOOL||LA1_0==IF||LA1_0==INT||(LA1_0 >= LBRACK && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NAME||(LA1_0 >= NOT && LA1_0 <= NULL)||LA1_0==STRING||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Atto.g:70:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_root130);
            	    stmt1=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);


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
            // 70:14: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:70:17: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:70:25: ( stmt )*
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
    // $ANTLR end "root"


    public static class stmt_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // Atto.g:73:1: stmt : expr ( NEWLINE )? -> ^( STMT expr ) ;
    public final AttoParser.stmt_return stmt() throws RecognitionException {
        AttoParser.stmt_return retval = new AttoParser.stmt_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NEWLINE4=null;
        AttoParser.expr_return expr3 =null;


        AttoTree NEWLINE4_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:74:2: ( expr ( NEWLINE )? -> ^( STMT expr ) )
            // Atto.g:74:4: expr ( NEWLINE )?
            {
            pushFollow(FOLLOW_expr_in_stmt154);
            expr3=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr3.getTree());

            // Atto.g:74:9: ( NEWLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Atto.g:74:9: NEWLINE
                    {
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE4);


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
            // 74:18: -> ^( STMT expr )
            {
                // Atto.g:74:21: ^( STMT expr )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(STMT, "STMT")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

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
    // $ANTLR end "stmt"


    public static class block_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // Atto.g:77:1: block : NEWLINE INDENT ( stmt )* DEDENT -> ^( BLOCK ( stmt )* ) ;
    public final AttoParser.block_return block() throws RecognitionException {
        AttoParser.block_return retval = new AttoParser.block_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NEWLINE5=null;
        Token INDENT6=null;
        Token DEDENT8=null;
        AttoParser.stmt_return stmt7 =null;


        AttoTree NEWLINE5_tree=null;
        AttoTree INDENT6_tree=null;
        AttoTree DEDENT8_tree=null;
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // Atto.g:78:2: ( NEWLINE INDENT ( stmt )* DEDENT -> ^( BLOCK ( stmt )* ) )
            // Atto.g:78:4: NEWLINE INDENT ( stmt )* DEDENT
            {
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            INDENT6=(Token)match(input,INDENT,FOLLOW_INDENT_in_block180); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT6);


            // Atto.g:78:19: ( stmt )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==BOOL||LA3_0==IF||LA3_0==INT||(LA3_0 >= LBRACK && LA3_0 <= LCURLY)||LA3_0==LPAREN||LA3_0==MINUS||LA3_0==NAME||(LA3_0 >= NOT && LA3_0 <= NULL)||LA3_0==STRING||LA3_0==WHILE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Atto.g:78:19: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block182);
            	    stmt7=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            DEDENT8=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEDENT.add(DEDENT8);


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
            // 78:32: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:78:35: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:78:43: ( stmt )*
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


    public static class expr_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // Atto.g:81:1: expr : ( ( assign )=> assign | ( fun )=> fun | if_ | while_ | or );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.assign_return assign9 =null;

        AttoParser.fun_return fun10 =null;

        AttoParser.if__return if_11 =null;

        AttoParser.while__return while_12 =null;

        AttoParser.or_return or13 =null;



        try {
            // Atto.g:82:2: ( ( assign )=> assign | ( fun )=> fun | if_ | while_ | or )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NAME) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (synpred2_Atto()) ) {
                    alt4=2;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==INT) ) {
                int LA4_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==STRING) ) {
                int LA4_3 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==BOOL) ) {
                int LA4_4 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==NULL) ) {
                int LA4_5 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==LPAREN) ) {
                int LA4_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (synpred2_Atto()) ) {
                    alt4=2;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==LCURLY) ) {
                int LA4_7 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==LBRACK) ) {
                int LA4_8 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==ARROW) && (synpred2_Atto())) {
                alt4=2;
            }
            else if ( (LA4_0==IF) ) {
                alt4=3;
            }
            else if ( (LA4_0==WHILE) ) {
                alt4=4;
            }
            else if ( (LA4_0==MINUS||LA4_0==NOT) ) {
                alt4=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Atto.g:82:4: ( assign )=> assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr210);
                    assign9=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign9.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:83:4: ( fun )=> fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_expr220);
                    fun10=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun10.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:84:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr225);
                    if_11=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_11.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:85:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr230);
                    while_12=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_12.getTree());

                    }
                    break;
                case 5 :
                    // Atto.g:86:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr235);
                    or13=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or13.getTree());

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
    // Atto.g:89:1: assign : postfix ASSIGN ^ body ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN15=null;
        AttoParser.postfix_return postfix14 =null;

        AttoParser.body_return body16 =null;


        AttoTree ASSIGN15_tree=null;

        try {
            // Atto.g:90:2: ( postfix ASSIGN ^ body )
            // Atto.g:90:4: postfix ASSIGN ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_postfix_in_assign246);
            postfix14=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix14.getTree());

            ASSIGN15=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign248); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN15_tree = 
            (AttoTree)adaptor.create(ASSIGN15)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ASSIGN15_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_assign251);
            body16=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body16.getTree());

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
    // Atto.g:93:1: fun : paramsdef ARROW ^ body ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ARROW18=null;
        AttoParser.paramsdef_return paramsdef17 =null;

        AttoParser.body_return body19 =null;


        AttoTree ARROW18_tree=null;

        try {
            // Atto.g:94:2: ( paramsdef ARROW ^ body )
            // Atto.g:94:4: paramsdef ARROW ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_paramsdef_in_fun262);
            paramsdef17=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramsdef17.getTree());

            ARROW18=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun264); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARROW18_tree = 
            (AttoTree)adaptor.create(ARROW18)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ARROW18_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_fun267);
            body19=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body19.getTree());

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
    // Atto.g:97:1: paramsdef : ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( COMMA vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) );
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA21=null;
        Token LPAREN23=null;
        Token COMMA25=null;
        Token RPAREN27=null;
        AttoParser.vardef_return vardef20 =null;

        AttoParser.vardef_return vardef22 =null;

        AttoParser.vardef_return vardef24 =null;

        AttoParser.vardef_return vardef26 =null;


        AttoTree COMMA21_tree=null;
        AttoTree LPAREN23_tree=null;
        AttoTree COMMA25_tree=null;
        AttoTree RPAREN27_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:98:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( COMMA vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ARROW||LA9_0==NAME) ) {
                alt9=1;
            }
            else if ( (LA9_0==LPAREN) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Atto.g:98:4: ( vardef ( COMMA vardef )* )?
                    {
                    // Atto.g:98:4: ( vardef ( COMMA vardef )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==NAME) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Atto.g:98:5: vardef ( COMMA vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef279);
                            vardef20=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef20.getTree());

                            // Atto.g:98:12: ( COMMA vardef )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==COMMA) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // Atto.g:98:13: COMMA vardef
                            	    {
                            	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef282); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA21);


                            	    pushFollow(FOLLOW_vardef_in_paramsdef284);
                            	    vardef22=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef22.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
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
                    // 98:30: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:98:33: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:98:42: ( vardef )*
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
                    break;
                case 2 :
                    // Atto.g:99:4: LPAREN ( vardef ( COMMA vardef )* )? RPAREN
                    {
                    LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paramsdef302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN23);


                    // Atto.g:99:11: ( vardef ( COMMA vardef )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NAME) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Atto.g:99:12: vardef ( COMMA vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef305);
                            vardef24=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef24.getTree());

                            // Atto.g:99:19: ( COMMA vardef )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==COMMA) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // Atto.g:99:20: COMMA vardef
                            	    {
                            	    COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef308); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA25);


                            	    pushFollow(FOLLOW_vardef_in_paramsdef310);
                            	    vardef26=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef26.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paramsdef316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN27);


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
                    // 99:44: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:99:47: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:99:56: ( vardef )*
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
    // $ANTLR end "paramsdef"


    public static class body_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // Atto.g:102:1: body : ( expr | block );
    public final AttoParser.body_return body() throws RecognitionException {
        AttoParser.body_return retval = new AttoParser.body_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.expr_return expr28 =null;

        AttoParser.block_return block29 =null;



        try {
            // Atto.g:103:2: ( expr | block )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ARROW||LA10_0==BOOL||LA10_0==IF||LA10_0==INT||(LA10_0 >= LBRACK && LA10_0 <= LCURLY)||LA10_0==LPAREN||LA10_0==MINUS||LA10_0==NAME||(LA10_0 >= NOT && LA10_0 <= NULL)||LA10_0==STRING||LA10_0==WHILE) ) {
                alt10=1;
            }
            else if ( (LA10_0==NEWLINE) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Atto.g:103:4: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_body337);
                    expr28=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr28.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:104:4: block
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_body342);
                    block29=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block29.getTree());

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
    // $ANTLR end "body"


    public static class if__return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_"
    // Atto.g:107:1: if_ : 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal30=null;
        Token string_literal34=null;
        Token string_literal35=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block31 =null;

        AttoParser.elif_return elif32 =null;

        AttoParser.else__return else_33 =null;


        AttoTree string_literal30_tree=null;
        AttoTree string_literal34_tree=null;
        AttoTree string_literal35_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:108:2: ( 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:108:4: 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal30=(Token)match(input,IF,FOLLOW_IF_in_if_355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal30);


            pushFollow(FOLLOW_expr_in_if_359);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:109:4: ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NEWLINE) ) {
                alt14=1;
            }
            else if ( (LA14_0==66) ) {
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
                    // Atto.g:109:6: block ( elif )* ( else_ )?
                    {
                    pushFollow(FOLLOW_block_in_if_367);
                    block31=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block31.getTree());

                    // Atto.g:109:12: ( elif )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ELIF) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Atto.g:109:12: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_369);
                    	    elif32=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif32.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // Atto.g:109:18: ( else_ )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ELSE) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==NEWLINE) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // Atto.g:109:18: else_
                            {
                            pushFollow(FOLLOW_else__in_if_372);
                            else_33=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_33.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: else_, elif, cond_expr, block
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
                    // 110:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:110:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:110:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:110:36: ( else_ )?
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
                    // Atto.g:111:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal34=(Token)match(input,66,FOLLOW_66_in_if_402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal34);


                    pushFollow(FOLLOW_expr_in_if_406);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:111:28: ( 'else' else_expr= expr )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ELSE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Atto.g:111:29: 'else' else_expr= expr
                            {
                            string_literal35=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_409); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal35);


                            pushFollow(FOLLOW_expr_in_if_413);
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
                    // 112:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:112:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:112:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:112:35: ^( ELSE $else_expr)
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
    // Atto.g:116:1: elif : 'elif' expr block -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal36=null;
        AttoParser.expr_return expr37 =null;

        AttoParser.block_return block38 =null;


        AttoTree string_literal36_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:117:2: ( 'elif' expr block -> ^( ELIF expr block ) )
            // Atto.g:117:4: 'elif' expr block
            {
            string_literal36=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal36);


            pushFollow(FOLLOW_expr_in_elif459);
            expr37=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr37.getTree());

            pushFollow(FOLLOW_block_in_elif461);
            block38=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block38.getTree());

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
            // 117:22: -> ^( ELIF expr block )
            {
                // Atto.g:117:25: ^( ELIF expr block )
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
    // Atto.g:120:1: else_ : 'else' block -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal39=null;
        AttoParser.block_return block40 =null;


        AttoTree string_literal39_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:121:2: ( 'else' block -> ^( ELSE block ) )
            // Atto.g:121:4: 'else' block
            {
            string_literal39=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal39);


            pushFollow(FOLLOW_block_in_else_484);
            block40=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block40.getTree());

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
            // 121:17: -> ^( ELSE block )
            {
                // Atto.g:121:20: ^( ELSE block )
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
    // Atto.g:124:1: while_ : 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal41=null;
        Token string_literal43=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block42 =null;


        AttoTree string_literal41_tree=null;
        AttoTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:125:2: ( 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:125:4: 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal41=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal41);


            pushFollow(FOLLOW_expr_in_while_508);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:126:4: ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NEWLINE) ) {
                alt15=1;
            }
            else if ( (LA15_0==66) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Atto.g:126:6: block
                    {
                    pushFollow(FOLLOW_block_in_while_516);
                    block42=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block42.getTree());

                    // AST REWRITE
                    // elements: cond_expr, block
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
                    // 126:12: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:126:15: ^( WHILE $cond_expr block )
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
                    // Atto.g:127:6: 'then' then_expr= expr
                    {
                    string_literal43=(Token)match(input,66,FOLLOW_66_in_while_534); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal43);


                    pushFollow(FOLLOW_expr_in_while_538);
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
                    // 127:28: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:127:31: ^( WHILE $cond_expr $then_expr)
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
    // Atto.g:131:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR45=null;
        AttoParser.and_return and44 =null;

        AttoParser.and_return and46 =null;


        AttoTree OR45_tree=null;

        try {
            // Atto.g:132:2: ( and ( OR ^ and )* )
            // Atto.g:132:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or566);
            and44=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and44.getTree());

            // Atto.g:132:8: ( OR ^ and )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Atto.g:132:9: OR ^ and
            	    {
            	    OR45=(Token)match(input,OR,FOLLOW_OR_in_or569); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR45_tree = 
            	    (AttoTree)adaptor.create(OR45)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR45_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or572);
            	    and46=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and46.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // Atto.g:135:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND48=null;
        AttoParser.rel_return rel47 =null;

        AttoParser.rel_return rel49 =null;


        AttoTree AND48_tree=null;

        try {
            // Atto.g:136:2: ( rel ( AND ^ rel )* )
            // Atto.g:136:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and585);
            rel47=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel47.getTree());

            // Atto.g:136:8: ( AND ^ rel )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Atto.g:136:9: AND ^ rel
            	    {
            	    AND48=(Token)match(input,AND,FOLLOW_AND_in_and588); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND48_tree = 
            	    (AttoTree)adaptor.create(AND48)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND48_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and591);
            	    rel49=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel49.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // Atto.g:139:1: rel : add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set51=null;
        AttoParser.add_return add50 =null;

        AttoParser.add_return add52 =null;


        AttoTree set51_tree=null;

        try {
            // Atto.g:140:2: ( add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* )
            // Atto.g:140:4: add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel604);
            add50=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add50.getTree());

            // Atto.g:140:8: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMPOSITE||LA18_0==EQ||(LA18_0 >= GE && LA18_0 <= GT)||LA18_0==LE||LA18_0==LT||LA18_0==NE||LA18_0==PIPELINE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Atto.g:140:9: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add
            	    {
            	    set51=(Token)input.LT(1);

            	    set51=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set51)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_rel626);
            	    add52=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add52.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // Atto.g:143:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set54=null;
        AttoParser.mul_return mul53 =null;

        AttoParser.mul_return mul55 =null;


        AttoTree set54_tree=null;

        try {
            // Atto.g:144:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:144:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add639);
            mul53=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul53.getTree());

            // Atto.g:144:8: ( ( PLUS | MINUS ) ^ mul )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==MINUS) ) {
                    alt19=1;
                }
                else if ( (LA19_0==PLUS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Atto.g:144:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set54=(Token)input.LT(1);

            	    set54=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set54)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add649);
            	    mul55=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul55.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // Atto.g:147:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set57=null;
        AttoParser.unary_return unary56 =null;

        AttoParser.unary_return unary58 =null;


        AttoTree set57_tree=null;

        try {
            // Atto.g:148:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:148:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul662);
            unary56=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary56.getTree());

            // Atto.g:148:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||(LA20_0 >= MOD && LA20_0 <= MUL)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Atto.g:148:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set57=(Token)input.LT(1);

            	    set57=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set57)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mul674);
            	    unary58=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary58.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // Atto.g:151:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT60=null;
        Token MINUS62=null;
        AttoParser.postfix_return postfix59 =null;

        AttoParser.postfix_return postfix61 =null;

        AttoParser.postfix_return postfix63 =null;


        AttoTree NOT60_tree=null;
        AttoTree MINUS62_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:152:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
            case LBRACK:
            case LCURLY:
            case LPAREN:
            case NAME:
            case NULL:
            case STRING:
                {
                alt21=1;
                }
                break;
            case NOT:
                {
                alt21=2;
                }
                break;
            case MINUS:
                {
                alt21=3;
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
                    // Atto.g:152:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary688);
                    postfix59=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix59.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:153:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT60=(Token)match(input,NOT,FOLLOW_NOT_in_unary693); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT60_tree = 
                    (AttoTree)adaptor.create(NOT60)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT60_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary696);
                    postfix61=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix61.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:154:4: MINUS postfix
                    {
                    MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS62);


                    pushFollow(FOLLOW_postfix_in_unary703);
                    postfix63=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix63.getTree());

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
                    // 154:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:154:21: ^( UNARY_MINUS postfix )
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
    // Atto.g:157:1: postfix : ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN65=null;
        Token COMMA67=null;
        Token RPAREN69=null;
        Token LBRACK70=null;
        Token RBRACK72=null;
        Token DOT73=null;
        AttoParser.primary_return p =null;

        AttoParser.primary_return primary64 =null;

        AttoParser.expr_return expr66 =null;

        AttoParser.expr_return expr68 =null;

        AttoParser.expr_return expr71 =null;


        AttoTree LPAREN65_tree=null;
        AttoTree COMMA67_tree=null;
        AttoTree RPAREN69_tree=null;
        AttoTree LBRACK70_tree=null;
        AttoTree RBRACK72_tree=null;
        AttoTree DOT73_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:158:2: ( ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* )
            // Atto.g:158:4: ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            {
            // Atto.g:158:4: ( primary -> primary )
            // Atto.g:158:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix725);
            primary64=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary64.getTree());

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
            // 158:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:159:4: ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            loop24:
            do {
                int alt24=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt24=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt24=2;
                    }
                    break;
                case DOT:
                    {
                    alt24=3;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // Atto.g:159:6: LPAREN ( expr ( COMMA expr )* )? RPAREN
            	    {
            	    LPAREN65=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix738); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN65);


            	    // Atto.g:159:13: ( expr ( COMMA expr )* )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==ARROW||LA23_0==BOOL||LA23_0==IF||LA23_0==INT||(LA23_0 >= LBRACK && LA23_0 <= LCURLY)||LA23_0==LPAREN||LA23_0==MINUS||LA23_0==NAME||(LA23_0 >= NOT && LA23_0 <= NULL)||LA23_0==STRING||LA23_0==WHILE) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // Atto.g:159:14: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix741);
            	            expr66=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr66.getTree());

            	            // Atto.g:159:19: ( COMMA expr )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==COMMA) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // Atto.g:159:20: COMMA expr
            	            	    {
            	            	    COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix744); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA67);


            	            	    pushFollow(FOLLOW_expr_in_postfix746);
            	            	    expr68=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr68.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop22;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN69=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix752); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN69);


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
            	    // 160:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:160:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:160:24: ( expr )*
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
            	    // Atto.g:161:6: LBRACK expr RBRACK
            	    {
            	    LBRACK70=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix776); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK70);


            	    pushFollow(FOLLOW_expr_in_postfix778);
            	    expr71=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr71.getTree());

            	    RBRACK72=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix780); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK72);


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
            	    // 162:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:162:8: ^( INDEX $postfix expr )
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
            	    // Atto.g:163:6: DOT p= primary
            	    {
            	    DOT73=(Token)match(input,DOT,FOLLOW_DOT_in_postfix803); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT73);


            	    pushFollow(FOLLOW_primary_in_postfix807);
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
            	    // 164:5: -> ^( FIELD_ACCESS $postfix $p)
            	    {
            	        // Atto.g:164:8: ^( FIELD_ACCESS $postfix $p)
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
    // $ANTLR end "postfix"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:168:1: primary : ( NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME74=null;
        Token INT75=null;
        Token STRING76=null;
        Token BOOL77=null;
        Token NULL78=null;
        Token LPAREN79=null;
        Token RPAREN81=null;
        AttoParser.expr_return expr80 =null;

        AttoParser.obj_return obj82 =null;

        AttoParser.array_return array83 =null;


        AttoTree NAME74_tree=null;
        AttoTree INT75_tree=null;
        AttoTree STRING76_tree=null;
        AttoTree BOOL77_tree=null;
        AttoTree NULL78_tree=null;
        AttoTree LPAREN79_tree=null;
        AttoTree RPAREN81_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:169:2: ( NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array )
            int alt25=8;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt25=1;
                }
                break;
            case INT:
                {
                alt25=2;
                }
                break;
            case STRING:
                {
                alt25=3;
                }
                break;
            case BOOL:
                {
                alt25=4;
                }
                break;
            case NULL:
                {
                alt25=5;
                }
                break;
            case LPAREN:
                {
                alt25=6;
                }
                break;
            case LCURLY:
                {
                alt25=7;
                }
                break;
            case LBRACK:
                {
                alt25=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // Atto.g:169:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME74=(Token)match(input,NAME,FOLLOW_NAME_in_primary842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME74_tree = 
                    (AttoTree)adaptor.create(NAME74)
                    ;
                    adaptor.addChild(root_0, NAME74_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:170:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT75=(Token)match(input,INT,FOLLOW_INT_in_primary848); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT75_tree = 
                    (AttoTree)adaptor.create(INT75)
                    ;
                    adaptor.addChild(root_0, INT75_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:171:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING76=(Token)match(input,STRING,FOLLOW_STRING_in_primary853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING76_tree = 
                    (AttoTree)adaptor.create(STRING76)
                    ;
                    adaptor.addChild(root_0, STRING76_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:172:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL77=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL77_tree = 
                    (AttoTree)adaptor.create(BOOL77)
                    ;
                    adaptor.addChild(root_0, BOOL77_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:173:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL78=(Token)match(input,NULL,FOLLOW_NULL_in_primary863); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL78_tree = 
                    (AttoTree)adaptor.create(NULL78)
                    ;
                    adaptor.addChild(root_0, NULL78_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:174:4: LPAREN expr RPAREN
                    {
                    LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN79);


                    pushFollow(FOLLOW_expr_in_primary870);
                    expr80=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr80.getTree());

                    RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN81);


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
                    // 174:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:175:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary881);
                    obj82=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj82.getTree());

                    }
                    break;
                case 8 :
                    // Atto.g:176:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary886);
                    array83=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array83.getTree());

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
    // Atto.g:179:1: obj : LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY84=null;
        Token COMMA86=null;
        Token COMMA88=null;
        Token RCURLY89=null;
        AttoParser.pair_return pair85 =null;

        AttoParser.pair_return pair87 =null;


        AttoTree LCURLY84_tree=null;
        AttoTree COMMA86_tree=null;
        AttoTree COMMA88_tree=null;
        AttoTree RCURLY89_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:180:2: ( LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:180:4: LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY
            {
            LCURLY84=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj899); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY84);


            // Atto.g:180:11: ( pair ( COMMA pair )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NAME) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Atto.g:180:12: pair ( COMMA pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj902);
                    pair85=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair85.getTree());

                    // Atto.g:180:17: ( COMMA pair )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==COMMA) ) {
                            int LA26_1 = input.LA(2);

                            if ( (LA26_1==NAME) ) {
                                alt26=1;
                            }


                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Atto.g:180:18: COMMA pair
                    	    {
                    	    COMMA86=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj905); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA86);


                    	    pushFollow(FOLLOW_pair_in_obj907);
                    	    pair87=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair87.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:180:33: ( COMMA )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==COMMA) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Atto.g:180:33: COMMA
                    {
                    COMMA88=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA88);


                    }
                    break;

            }


            RCURLY89=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj916); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY89);


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
            // 180:47: -> ^( OBJ ( pair )* )
            {
                // Atto.g:180:50: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:180:56: ( pair )*
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
    // Atto.g:183:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME90=null;
        Token COLON91=null;
        AttoParser.expr_return expr92 =null;


        AttoTree NAME90_tree=null;
        AttoTree COLON91_tree=null;

        try {
            // Atto.g:184:2: ( NAME COLON ^ expr )
            // Atto.g:184:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME90=(Token)match(input,NAME,FOLLOW_NAME_in_pair936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME90_tree = 
            (AttoTree)adaptor.create(NAME90)
            ;
            adaptor.addChild(root_0, NAME90_tree);
            }

            COLON91=(Token)match(input,COLON,FOLLOW_COLON_in_pair938); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON91_tree = 
            (AttoTree)adaptor.create(COLON91)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON91_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair941);
            expr92=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr92.getTree());

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
    // Atto.g:187:1: array : LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK93=null;
        Token COMMA95=null;
        Token COMMA97=null;
        Token RBRACK98=null;
        AttoParser.expr_return expr94 =null;

        AttoParser.expr_return expr96 =null;


        AttoTree LBRACK93_tree=null;
        AttoTree COMMA95_tree=null;
        AttoTree COMMA97_tree=null;
        AttoTree RBRACK98_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:188:2: ( LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:188:4: LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK
            {
            LBRACK93=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK93);


            // Atto.g:188:11: ( expr ( COMMA expr )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ARROW||LA30_0==BOOL||LA30_0==IF||LA30_0==INT||(LA30_0 >= LBRACK && LA30_0 <= LCURLY)||LA30_0==LPAREN||LA30_0==MINUS||LA30_0==NAME||(LA30_0 >= NOT && LA30_0 <= NULL)||LA30_0==STRING||LA30_0==WHILE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Atto.g:188:12: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array956);
                    expr94=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr94.getTree());

                    // Atto.g:188:17: ( COMMA expr )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==COMMA) ) {
                            int LA29_1 = input.LA(2);

                            if ( (LA29_1==ARROW||LA29_1==BOOL||LA29_1==IF||LA29_1==INT||(LA29_1 >= LBRACK && LA29_1 <= LCURLY)||LA29_1==LPAREN||LA29_1==MINUS||LA29_1==NAME||(LA29_1 >= NOT && LA29_1 <= NULL)||LA29_1==STRING||LA29_1==WHILE) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Atto.g:188:18: COMMA expr
                    	    {
                    	    COMMA95=(Token)match(input,COMMA,FOLLOW_COMMA_in_array959); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA95);


                    	    pushFollow(FOLLOW_expr_in_array961);
                    	    expr96=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr96.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:188:34: ( COMMA )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COMMA) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Atto.g:188:34: COMMA
                    {
                    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_array968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA97);


                    }
                    break;

            }


            RBRACK98=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array971); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK98);


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
            // 188:48: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:188:51: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:188:59: ( expr )*
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
    // Atto.g:191:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME99=null;

        AttoTree NAME99_tree=null;

        try {
            // Atto.g:192:2: ( NAME )
            // Atto.g:192:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME99=(Token)match(input,NAME,FOLLOW_NAME_in_vardef991); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME99_tree = 
            (AttoTree)adaptor.create(NAME99)
            ;
            adaptor.addChild(root_0, NAME99_tree);
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
        // Atto.g:82:4: ( assign )
        // Atto.g:82:5: assign
        {
        pushFollow(FOLLOW_assign_in_synpred1_Atto206);
        assign();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Atto

    // $ANTLR start synpred2_Atto
    public final void synpred2_Atto_fragment() throws RecognitionException {
        // Atto.g:83:4: ( fun )
        // Atto.g:83:5: fun
        {
        pushFollow(FOLLOW_fun_in_synpred2_Atto216);
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


 

    public static final BitSet FOLLOW_stmt_in_root130 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_EOF_in_root133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt154 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block178 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INDENT_in_block180 = new BitSet(new long[]{0x2003250D20020440L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_block182 = new BitSet(new long[]{0x2003250D20020440L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEDENT_in_block185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign246 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign248 = new BitSet(new long[]{0x2003A50D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_assign251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramsdef_in_fun262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fun264 = new BitSet(new long[]{0x2003A50D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_fun267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef279 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef282 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef284 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LPAREN_in_paramsdef302 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef305 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef308 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef310 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_paramsdef316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_body337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_355 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_359 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_if_367 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elif_in_if_369 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_else__in_if_372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_if_402 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_406 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_409 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif457 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_elif459 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_block_in_elif461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_482 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_block_in_else_484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_504 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_508 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_while_516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_while_534 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or566 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_or569 = new BitSet(new long[]{0x2003250D00000400L});
    public static final BitSet FOLLOW_and_in_or572 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rel_in_and585 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and588 = new BitSet(new long[]{0x2003250D00000400L});
    public static final BitSet FOLLOW_rel_in_and591 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel604 = new BitSet(new long[]{0x002042100C808002L});
    public static final BitSet FOLLOW_set_in_rel607 = new BitSet(new long[]{0x2003250D00000400L});
    public static final BitSet FOLLOW_add_in_rel626 = new BitSet(new long[]{0x002042100C808002L});
    public static final BitSet FOLLOW_mul_in_add639 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_set_in_add642 = new BitSet(new long[]{0x2003250D00000400L});
    public static final BitSet FOLLOW_mul_in_add649 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_unary_in_mul662 = new BitSet(new long[]{0x0000180000080002L});
    public static final BitSet FOLLOW_set_in_mul665 = new BitSet(new long[]{0x2003250D00000400L});
    public static final BitSet FOLLOW_unary_in_mul674 = new BitSet(new long[]{0x0000180000080002L});
    public static final BitSet FOLLOW_postfix_in_unary688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary693 = new BitSet(new long[]{0x2002210D00000400L});
    public static final BitSet FOLLOW_postfix_in_unary696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary701 = new BitSet(new long[]{0x2002210D00000400L});
    public static final BitSet FOLLOW_postfix_in_unary703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix725 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix738 = new BitSet(new long[]{0x2203250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix741 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_postfix744 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix746 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix752 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_LBRACK_in_postfix776 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix778 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix780 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_DOT_in_postfix803 = new BitSet(new long[]{0x2002210D00000400L});
    public static final BitSet FOLLOW_primary_in_postfix807 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_NAME_in_primary842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary868 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_primary870 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj899 = new BitSet(new long[]{0x0100200000002000L});
    public static final BitSet FOLLOW_pair_in_obj902 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj905 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_pair_in_obj907 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj913 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair936 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_pair938 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_pair941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array953 = new BitSet(new long[]{0x2083250D20002440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array956 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_COMMA_in_array959 = new BitSet(new long[]{0x2003250D20000440L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array961 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_COMMA_in_array968 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_vardef991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_synpred2_Atto216 = new BitSet(new long[]{0x0000000000000002L});

}