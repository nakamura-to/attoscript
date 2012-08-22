// $ANTLR 3.4 Atto.g 2012-08-23 06:10:31

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "COLON", "COMMA", "COMMENT", "COMPOSITE", "CONSTANT", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "FIELD_ACCESS", "FLOAT", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "INT", "INTEGER", "LBRACK", "LCURLY", "LE", "LEADING_WS", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OR", "PARAMS", "PLUS", "RBRACK", "RCURLY", "RPAREN", "SEMICOLON", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'then'"
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
    public static final int FUN=26;
    public static final int GE=27;
    public static final int GT=28;
    public static final int ID_CHAR=29;
    public static final int IF=30;
    public static final int INDENT=31;
    public static final int INDEX=32;
    public static final int INT=33;
    public static final int INTEGER=34;
    public static final int LBRACK=35;
    public static final int LCURLY=36;
    public static final int LE=37;
    public static final int LEADING_WS=38;
    public static final int LETTER=39;
    public static final int LOWER=40;
    public static final int LPAREN=41;
    public static final int LT=42;
    public static final int MINUS=43;
    public static final int MOD=44;
    public static final int MUL=45;
    public static final int NAME=46;
    public static final int NE=47;
    public static final int NEWLINE=48;
    public static final int NOT=49;
    public static final int NULL=50;
    public static final int OBJ=51;
    public static final int OR=52;
    public static final int PARAMS=53;
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

                if ( (LA1_0==BOOL||LA1_0==FUN||LA1_0==IF||LA1_0==INT||(LA1_0 >= LBRACK && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NAME||(LA1_0 >= NOT && LA1_0 <= NULL)||LA1_0==STRING||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Atto.g:70:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_root135);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root138); if (state.failed) return retval; 
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
            pushFollow(FOLLOW_expr_in_stmt159);
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
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt161); if (state.failed) return retval; 
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
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            INDENT6=(Token)match(input,INDENT,FOLLOW_INDENT_in_block185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT6);


            // Atto.g:78:19: ( stmt )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BOOL||LA3_0==FUN||LA3_0==IF||LA3_0==INT||(LA3_0 >= LBRACK && LA3_0 <= LCURLY)||LA3_0==LPAREN||LA3_0==MINUS||LA3_0==NAME||(LA3_0 >= NOT && LA3_0 <= NULL)||LA3_0==STRING||LA3_0==WHILE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Atto.g:78:19: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block187);
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


            DEDENT8=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block190); if (state.failed) return retval; 
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
    // Atto.g:81:1: expr : ( ( assign )=> assign | fun | or | if_ | while_ );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.assign_return assign9 =null;

        AttoParser.fun_return fun10 =null;

        AttoParser.or_return or11 =null;

        AttoParser.if__return if_12 =null;

        AttoParser.while__return while_13 =null;



        try {
            // Atto.g:82:2: ( ( assign )=> assign | fun | or | if_ | while_ )
            int alt4=5;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;

                }
                }
                break;
            case BOOL:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA4_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    throw nvae;

                }
                }
                break;
            case LCURLY:
                {
                int LA4_7 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 7, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                int LA4_8 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 8, input);

                    throw nvae;

                }
                }
                break;
            case FUN:
                {
                alt4=2;
                }
                break;
            case MINUS:
            case NOT:
                {
                alt4=3;
                }
                break;
            case IF:
                {
                alt4=4;
                }
                break;
            case WHILE:
                {
                alt4=5;
                }
                break;
            default:
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


                    pushFollow(FOLLOW_assign_in_expr215);
                    assign9=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign9.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:83:4: fun
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
                    // Atto.g:84:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr225);
                    or11=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or11.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:85:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr230);
                    if_12=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_12.getTree());

                    }
                    break;
                case 5 :
                    // Atto.g:86:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr235);
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
    // Atto.g:93:1: fun : 'fun' paramsdef ARROW body -> ^( FUN paramsdef body ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal17=null;
        Token ARROW19=null;
        AttoParser.paramsdef_return paramsdef18 =null;

        AttoParser.body_return body20 =null;


        AttoTree string_literal17_tree=null;
        AttoTree ARROW19_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        try {
            // Atto.g:94:2: ( 'fun' paramsdef ARROW body -> ^( FUN paramsdef body ) )
            // Atto.g:94:4: 'fun' paramsdef ARROW body
            {
            string_literal17=(Token)match(input,FUN,FOLLOW_FUN_in_fun262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUN.add(string_literal17);


            pushFollow(FOLLOW_paramsdef_in_fun264);
            paramsdef18=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef18.getTree());

            ARROW19=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW19);


            pushFollow(FOLLOW_body_in_fun268);
            body20=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body20.getTree());

            // AST REWRITE
            // elements: paramsdef, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 94:31: -> ^( FUN paramsdef body )
            {
                // Atto.g:94:34: ^( FUN paramsdef body )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(FUN, "FUN")
                , root_1);

                adaptor.addChild(root_1, stream_paramsdef.nextTree());

                adaptor.addChild(root_1, stream_body.nextTree());

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
    // Atto.g:97:1: paramsdef : ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( COMMA vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) );
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA22=null;
        Token LPAREN24=null;
        Token COMMA26=null;
        Token RPAREN28=null;
        AttoParser.vardef_return vardef21 =null;

        AttoParser.vardef_return vardef23 =null;

        AttoParser.vardef_return vardef25 =null;

        AttoParser.vardef_return vardef27 =null;


        AttoTree COMMA22_tree=null;
        AttoTree LPAREN24_tree=null;
        AttoTree COMMA26_tree=null;
        AttoTree RPAREN28_tree=null;
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
                            pushFollow(FOLLOW_vardef_in_paramsdef290);
                            vardef21=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef21.getTree());

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
                            	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef293); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA22);


                            	    pushFollow(FOLLOW_vardef_in_paramsdef295);
                            	    vardef23=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef23.getTree());

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
                    LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paramsdef313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN24);


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
                            pushFollow(FOLLOW_vardef_in_paramsdef316);
                            vardef25=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef25.getTree());

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
                            	    COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef319); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA26);


                            	    pushFollow(FOLLOW_vardef_in_paramsdef321);
                            	    vardef27=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef27.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paramsdef327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN28);


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

        AttoParser.expr_return expr29 =null;

        AttoParser.block_return block30 =null;



        try {
            // Atto.g:103:2: ( expr | block )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BOOL||LA10_0==FUN||LA10_0==IF||LA10_0==INT||(LA10_0 >= LBRACK && LA10_0 <= LCURLY)||LA10_0==LPAREN||LA10_0==MINUS||LA10_0==NAME||(LA10_0 >= NOT && LA10_0 <= NULL)||LA10_0==STRING||LA10_0==WHILE) ) {
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


                    pushFollow(FOLLOW_expr_in_body348);
                    expr29=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr29.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:104:4: block
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_body353);
                    block30=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block30.getTree());

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

        Token string_literal31=null;
        Token string_literal35=null;
        Token string_literal36=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block32 =null;

        AttoParser.elif_return elif33 =null;

        AttoParser.else__return else_34 =null;


        AttoTree string_literal31_tree=null;
        AttoTree string_literal35_tree=null;
        AttoTree string_literal36_tree=null;
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
            string_literal31=(Token)match(input,IF,FOLLOW_IF_in_if_366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal31);


            pushFollow(FOLLOW_expr_in_if_370);
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
                    pushFollow(FOLLOW_block_in_if_378);
                    block32=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block32.getTree());

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
                    	    pushFollow(FOLLOW_elif_in_if_380);
                    	    elif33=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif33.getTree());

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
                            pushFollow(FOLLOW_else__in_if_383);
                            else_34=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_34.getTree());

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
                    string_literal35=(Token)match(input,66,FOLLOW_66_in_if_413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal35);


                    pushFollow(FOLLOW_expr_in_if_417);
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
                            string_literal36=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_420); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal36);


                            pushFollow(FOLLOW_expr_in_if_424);
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

        Token string_literal37=null;
        AttoParser.expr_return expr38 =null;

        AttoParser.block_return block39 =null;


        AttoTree string_literal37_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:117:2: ( 'elif' expr block -> ^( ELIF expr block ) )
            // Atto.g:117:4: 'elif' expr block
            {
            string_literal37=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal37);


            pushFollow(FOLLOW_expr_in_elif470);
            expr38=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr38.getTree());

            pushFollow(FOLLOW_block_in_elif472);
            block39=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block39.getTree());

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

        Token string_literal40=null;
        AttoParser.block_return block41 =null;


        AttoTree string_literal40_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:121:2: ( 'else' block -> ^( ELSE block ) )
            // Atto.g:121:4: 'else' block
            {
            string_literal40=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_493); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal40);


            pushFollow(FOLLOW_block_in_else_495);
            block41=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block41.getTree());

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

        Token string_literal42=null;
        Token string_literal44=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block43 =null;


        AttoTree string_literal42_tree=null;
        AttoTree string_literal44_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:125:2: ( 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:125:4: 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal42=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal42);


            pushFollow(FOLLOW_expr_in_while_519);
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
                    pushFollow(FOLLOW_block_in_while_527);
                    block43=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block43.getTree());

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
                    string_literal44=(Token)match(input,66,FOLLOW_66_in_while_545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal44);


                    pushFollow(FOLLOW_expr_in_while_549);
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

        Token OR46=null;
        AttoParser.and_return and45 =null;

        AttoParser.and_return and47 =null;


        AttoTree OR46_tree=null;

        try {
            // Atto.g:132:2: ( and ( OR ^ and )* )
            // Atto.g:132:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or577);
            and45=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and45.getTree());

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
            	    OR46=(Token)match(input,OR,FOLLOW_OR_in_or580); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR46_tree = 
            	    (AttoTree)adaptor.create(OR46)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR46_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or583);
            	    and47=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and47.getTree());

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

        Token AND49=null;
        AttoParser.rel_return rel48 =null;

        AttoParser.rel_return rel50 =null;


        AttoTree AND49_tree=null;

        try {
            // Atto.g:136:2: ( rel ( AND ^ rel )* )
            // Atto.g:136:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and596);
            rel48=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel48.getTree());

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
            	    AND49=(Token)match(input,AND,FOLLOW_AND_in_and599); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND49_tree = 
            	    (AttoTree)adaptor.create(AND49)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND49_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and602);
            	    rel50=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel50.getTree());

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
    // Atto.g:139:1: rel : add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set52=null;
        AttoParser.add_return add51 =null;

        AttoParser.add_return add53 =null;


        AttoTree set52_tree=null;

        try {
            // Atto.g:140:2: ( add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* )
            // Atto.g:140:4: add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel615);
            add51=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add51.getTree());

            // Atto.g:140:8: ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==EQ||(LA18_0 >= GE && LA18_0 <= GT)||LA18_0==LE||LA18_0==LT||LA18_0==NE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Atto.g:140:9: ( EQ | NE | LE | GE | LT | GT ) ^ add
            	    {
            	    set52=(Token)input.LT(1);

            	    set52=(Token)input.LT(1);

            	    if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set52)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_rel633);
            	    add53=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add53.getTree());

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

        Token set55=null;
        AttoParser.mul_return mul54 =null;

        AttoParser.mul_return mul56 =null;


        AttoTree set55_tree=null;

        try {
            // Atto.g:144:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:144:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add646);
            mul54=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul54.getTree());

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
            	    set55=(Token)input.LT(1);

            	    set55=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set55)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add656);
            	    mul56=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul56.getTree());

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
    // Atto.g:147:1: mul : composite ( ( MUL | DIV | MOD ) ^ composite )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set58=null;
        AttoParser.composite_return composite57 =null;

        AttoParser.composite_return composite59 =null;


        AttoTree set58_tree=null;

        try {
            // Atto.g:148:2: ( composite ( ( MUL | DIV | MOD ) ^ composite )* )
            // Atto.g:148:4: composite ( ( MUL | DIV | MOD ) ^ composite )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_composite_in_mul669);
            composite57=composite();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, composite57.getTree());

            // Atto.g:148:14: ( ( MUL | DIV | MOD ) ^ composite )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||(LA20_0 >= MOD && LA20_0 <= MUL)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Atto.g:148:15: ( MUL | DIV | MOD ) ^ composite
            	    {
            	    set58=(Token)input.LT(1);

            	    set58=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set58)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_composite_in_mul681);
            	    composite59=composite();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, composite59.getTree());

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


    public static class composite_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "composite"
    // Atto.g:151:1: composite : unary ( COMPOSITE ^ unary )* ;
    public final AttoParser.composite_return composite() throws RecognitionException {
        AttoParser.composite_return retval = new AttoParser.composite_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMPOSITE61=null;
        AttoParser.unary_return unary60 =null;

        AttoParser.unary_return unary62 =null;


        AttoTree COMPOSITE61_tree=null;

        try {
            // Atto.g:152:2: ( unary ( COMPOSITE ^ unary )* )
            // Atto.g:152:4: unary ( COMPOSITE ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_composite694);
            unary60=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary60.getTree());

            // Atto.g:152:10: ( COMPOSITE ^ unary )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMPOSITE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Atto.g:152:11: COMPOSITE ^ unary
            	    {
            	    COMPOSITE61=(Token)match(input,COMPOSITE,FOLLOW_COMPOSITE_in_composite697); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPOSITE61_tree = 
            	    (AttoTree)adaptor.create(COMPOSITE61)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(COMPOSITE61_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_unary_in_composite700);
            	    unary62=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary62.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "composite"


    public static class unary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // Atto.g:155:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT64=null;
        Token MINUS66=null;
        AttoParser.postfix_return postfix63 =null;

        AttoParser.postfix_return postfix65 =null;

        AttoParser.postfix_return postfix67 =null;


        AttoTree NOT64_tree=null;
        AttoTree MINUS66_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:156:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt22=3;
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
                alt22=1;
                }
                break;
            case NOT:
                {
                alt22=2;
                }
                break;
            case MINUS:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // Atto.g:156:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary714);
                    postfix63=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix63.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:157:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT64=(Token)match(input,NOT,FOLLOW_NOT_in_unary719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT64_tree = 
                    (AttoTree)adaptor.create(NOT64)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT64_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary722);
                    postfix65=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix65.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:158:4: MINUS postfix
                    {
                    MINUS66=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS66);


                    pushFollow(FOLLOW_postfix_in_unary729);
                    postfix67=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix67.getTree());

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
                    // 158:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:158:21: ^( UNARY_MINUS postfix )
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
    // Atto.g:161:1: postfix : ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN69=null;
        Token COMMA71=null;
        Token RPAREN73=null;
        Token LBRACK74=null;
        Token RBRACK76=null;
        Token DOT77=null;
        AttoParser.primary_return p =null;

        AttoParser.primary_return primary68 =null;

        AttoParser.expr_return expr70 =null;

        AttoParser.expr_return expr72 =null;

        AttoParser.expr_return expr75 =null;


        AttoTree LPAREN69_tree=null;
        AttoTree COMMA71_tree=null;
        AttoTree RPAREN73_tree=null;
        AttoTree LBRACK74_tree=null;
        AttoTree RBRACK76_tree=null;
        AttoTree DOT77_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:162:2: ( ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* )
            // Atto.g:162:4: ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            {
            // Atto.g:162:4: ( primary -> primary )
            // Atto.g:162:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix751);
            primary68=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary68.getTree());

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
            // 162:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:163:4: ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            loop25:
            do {
                int alt25=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt25=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt25=2;
                    }
                    break;
                case DOT:
                    {
                    alt25=3;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // Atto.g:163:6: LPAREN ( expr ( COMMA expr )* )? RPAREN
            	    {
            	    LPAREN69=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix764); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN69);


            	    // Atto.g:163:13: ( expr ( COMMA expr )* )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==BOOL||LA24_0==FUN||LA24_0==IF||LA24_0==INT||(LA24_0 >= LBRACK && LA24_0 <= LCURLY)||LA24_0==LPAREN||LA24_0==MINUS||LA24_0==NAME||(LA24_0 >= NOT && LA24_0 <= NULL)||LA24_0==STRING||LA24_0==WHILE) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // Atto.g:163:14: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix767);
            	            expr70=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr70.getTree());

            	            // Atto.g:163:19: ( COMMA expr )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==COMMA) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // Atto.g:163:20: COMMA expr
            	            	    {
            	            	    COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix770); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA71);


            	            	    pushFollow(FOLLOW_expr_in_postfix772);
            	            	    expr72=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr72.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop23;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix778); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN73);


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
            	    // 164:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:164:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:164:24: ( expr )*
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
            	    // Atto.g:165:6: LBRACK expr RBRACK
            	    {
            	    LBRACK74=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix802); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK74);


            	    pushFollow(FOLLOW_expr_in_postfix804);
            	    expr75=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr75.getTree());

            	    RBRACK76=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix806); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK76);


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
            	    // 166:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:166:8: ^( INDEX $postfix expr )
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
            	    // Atto.g:167:6: DOT p= primary
            	    {
            	    DOT77=(Token)match(input,DOT,FOLLOW_DOT_in_postfix829); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT77);


            	    pushFollow(FOLLOW_primary_in_postfix833);
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
            	    // 168:5: -> ^( FIELD_ACCESS $postfix $p)
            	    {
            	        // Atto.g:168:8: ^( FIELD_ACCESS $postfix $p)
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
    // $ANTLR end "postfix"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:172:1: primary : ( NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME78=null;
        Token INT79=null;
        Token STRING80=null;
        Token BOOL81=null;
        Token NULL82=null;
        Token LPAREN83=null;
        Token RPAREN85=null;
        AttoParser.expr_return expr84 =null;

        AttoParser.obj_return obj86 =null;

        AttoParser.array_return array87 =null;


        AttoTree NAME78_tree=null;
        AttoTree INT79_tree=null;
        AttoTree STRING80_tree=null;
        AttoTree BOOL81_tree=null;
        AttoTree NULL82_tree=null;
        AttoTree LPAREN83_tree=null;
        AttoTree RPAREN85_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:173:2: ( NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array )
            int alt26=8;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt26=1;
                }
                break;
            case INT:
                {
                alt26=2;
                }
                break;
            case STRING:
                {
                alt26=3;
                }
                break;
            case BOOL:
                {
                alt26=4;
                }
                break;
            case NULL:
                {
                alt26=5;
                }
                break;
            case LPAREN:
                {
                alt26=6;
                }
                break;
            case LCURLY:
                {
                alt26=7;
                }
                break;
            case LBRACK:
                {
                alt26=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Atto.g:173:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME78=(Token)match(input,NAME,FOLLOW_NAME_in_primary868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME78_tree = 
                    (AttoTree)adaptor.create(NAME78)
                    ;
                    adaptor.addChild(root_0, NAME78_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:174:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT79=(Token)match(input,INT,FOLLOW_INT_in_primary874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT79_tree = 
                    (AttoTree)adaptor.create(INT79)
                    ;
                    adaptor.addChild(root_0, INT79_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:175:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING80=(Token)match(input,STRING,FOLLOW_STRING_in_primary879); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING80_tree = 
                    (AttoTree)adaptor.create(STRING80)
                    ;
                    adaptor.addChild(root_0, STRING80_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:176:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL81=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary884); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL81_tree = 
                    (AttoTree)adaptor.create(BOOL81)
                    ;
                    adaptor.addChild(root_0, BOOL81_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:177:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL82=(Token)match(input,NULL,FOLLOW_NULL_in_primary889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL82_tree = 
                    (AttoTree)adaptor.create(NULL82)
                    ;
                    adaptor.addChild(root_0, NULL82_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:178:4: LPAREN expr RPAREN
                    {
                    LPAREN83=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN83);


                    pushFollow(FOLLOW_expr_in_primary896);
                    expr84=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr84.getTree());

                    RPAREN85=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN85);


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
                    // 178:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:179:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary907);
                    obj86=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj86.getTree());

                    }
                    break;
                case 8 :
                    // Atto.g:180:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary912);
                    array87=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array87.getTree());

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
    // Atto.g:183:1: obj : LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY88=null;
        Token COMMA90=null;
        Token COMMA92=null;
        Token RCURLY93=null;
        AttoParser.pair_return pair89 =null;

        AttoParser.pair_return pair91 =null;


        AttoTree LCURLY88_tree=null;
        AttoTree COMMA90_tree=null;
        AttoTree COMMA92_tree=null;
        AttoTree RCURLY93_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:184:2: ( LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:184:4: LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY
            {
            LCURLY88=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj925); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY88);


            // Atto.g:184:11: ( pair ( COMMA pair )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NAME) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Atto.g:184:12: pair ( COMMA pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj928);
                    pair89=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair89.getTree());

                    // Atto.g:184:17: ( COMMA pair )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==COMMA) ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==NAME) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Atto.g:184:18: COMMA pair
                    	    {
                    	    COMMA90=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj931); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA90);


                    	    pushFollow(FOLLOW_pair_in_obj933);
                    	    pair91=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair91.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:184:33: ( COMMA )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==COMMA) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Atto.g:184:33: COMMA
                    {
                    COMMA92=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA92);


                    }
                    break;

            }


            RCURLY93=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY93);


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
            // 184:47: -> ^( OBJ ( pair )* )
            {
                // Atto.g:184:50: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:184:56: ( pair )*
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
    // Atto.g:187:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME94=null;
        Token COLON95=null;
        AttoParser.expr_return expr96 =null;


        AttoTree NAME94_tree=null;
        AttoTree COLON95_tree=null;

        try {
            // Atto.g:188:2: ( NAME COLON ^ expr )
            // Atto.g:188:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME94=(Token)match(input,NAME,FOLLOW_NAME_in_pair962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME94_tree = 
            (AttoTree)adaptor.create(NAME94)
            ;
            adaptor.addChild(root_0, NAME94_tree);
            }

            COLON95=(Token)match(input,COLON,FOLLOW_COLON_in_pair964); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON95_tree = 
            (AttoTree)adaptor.create(COLON95)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON95_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair967);
            expr96=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr96.getTree());

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
    // Atto.g:191:1: array : LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK97=null;
        Token COMMA99=null;
        Token COMMA101=null;
        Token RBRACK102=null;
        AttoParser.expr_return expr98 =null;

        AttoParser.expr_return expr100 =null;


        AttoTree LBRACK97_tree=null;
        AttoTree COMMA99_tree=null;
        AttoTree COMMA101_tree=null;
        AttoTree RBRACK102_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:192:2: ( LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:192:4: LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK
            {
            LBRACK97=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array979); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK97);


            // Atto.g:192:11: ( expr ( COMMA expr )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==BOOL||LA31_0==FUN||LA31_0==IF||LA31_0==INT||(LA31_0 >= LBRACK && LA31_0 <= LCURLY)||LA31_0==LPAREN||LA31_0==MINUS||LA31_0==NAME||(LA31_0 >= NOT && LA31_0 <= NULL)||LA31_0==STRING||LA31_0==WHILE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Atto.g:192:12: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array982);
                    expr98=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr98.getTree());

                    // Atto.g:192:17: ( COMMA expr )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==COMMA) ) {
                            int LA30_1 = input.LA(2);

                            if ( (LA30_1==BOOL||LA30_1==FUN||LA30_1==IF||LA30_1==INT||(LA30_1 >= LBRACK && LA30_1 <= LCURLY)||LA30_1==LPAREN||LA30_1==MINUS||LA30_1==NAME||(LA30_1 >= NOT && LA30_1 <= NULL)||LA30_1==STRING||LA30_1==WHILE) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Atto.g:192:18: COMMA expr
                    	    {
                    	    COMMA99=(Token)match(input,COMMA,FOLLOW_COMMA_in_array985); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA99);


                    	    pushFollow(FOLLOW_expr_in_array987);
                    	    expr100=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr100.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:192:34: ( COMMA )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COMMA) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Atto.g:192:34: COMMA
                    {
                    COMMA101=(Token)match(input,COMMA,FOLLOW_COMMA_in_array994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA101);


                    }
                    break;

            }


            RBRACK102=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array997); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK102);


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
            // 192:48: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:192:51: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:192:59: ( expr )*
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
    // Atto.g:195:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME103=null;

        AttoTree NAME103_tree=null;

        try {
            // Atto.g:196:2: ( NAME )
            // Atto.g:196:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME103=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1017); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME103_tree = 
            (AttoTree)adaptor.create(NAME103)
            ;
            adaptor.addChild(root_0, NAME103_tree);
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
        pushFollow(FOLLOW_assign_in_synpred1_Atto211);
        assign();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Atto

    // Delegated rules

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


 

    public static final BitSet FOLLOW_stmt_in_root135 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_EOF_in_root138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt159 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block183 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INDENT_in_block185 = new BitSet(new long[]{0x20064A1A44020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_block187 = new BitSet(new long[]{0x20064A1A44020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEDENT_in_block190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign246 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign248 = new BitSet(new long[]{0x20074A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_assign251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun262 = new BitSet(new long[]{0x0000420000000040L});
    public static final BitSet FOLLOW_paramsdef_in_fun264 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fun266 = new BitSet(new long[]{0x20074A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_fun268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef290 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef293 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef295 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LPAREN_in_paramsdef313 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef316 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef319 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef321 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_paramsdef327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_body348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_366 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_370 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_if_378 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elif_in_if_380 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_else__in_if_383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_if_413 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_417 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_420 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif468 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_elif470 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_block_in_elif472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_493 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_block_in_else_495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_515 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_519 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_while_527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_while_545 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or577 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_or580 = new BitSet(new long[]{0x20064A1A00000400L});
    public static final BitSet FOLLOW_and_in_or583 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rel_in_and596 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and599 = new BitSet(new long[]{0x20064A1A00000400L});
    public static final BitSet FOLLOW_rel_in_and602 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel615 = new BitSet(new long[]{0x0000842018800002L});
    public static final BitSet FOLLOW_set_in_rel618 = new BitSet(new long[]{0x20064A1A00000400L});
    public static final BitSet FOLLOW_add_in_rel633 = new BitSet(new long[]{0x0000842018800002L});
    public static final BitSet FOLLOW_mul_in_add646 = new BitSet(new long[]{0x0040080000000002L});
    public static final BitSet FOLLOW_set_in_add649 = new BitSet(new long[]{0x20064A1A00000400L});
    public static final BitSet FOLLOW_mul_in_add656 = new BitSet(new long[]{0x0040080000000002L});
    public static final BitSet FOLLOW_composite_in_mul669 = new BitSet(new long[]{0x0000300000080002L});
    public static final BitSet FOLLOW_set_in_mul672 = new BitSet(new long[]{0x20064A1A00000400L});
    public static final BitSet FOLLOW_composite_in_mul681 = new BitSet(new long[]{0x0000300000080002L});
    public static final BitSet FOLLOW_unary_in_composite694 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMPOSITE_in_composite697 = new BitSet(new long[]{0x20064A1A00000400L});
    public static final BitSet FOLLOW_unary_in_composite700 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_postfix_in_unary714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary719 = new BitSet(new long[]{0x2004421A00000400L});
    public static final BitSet FOLLOW_postfix_in_unary722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary727 = new BitSet(new long[]{0x2004421A00000400L});
    public static final BitSet FOLLOW_postfix_in_unary729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix751 = new BitSet(new long[]{0x0000020800100002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix764 = new BitSet(new long[]{0x22064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix767 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_postfix770 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix772 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix778 = new BitSet(new long[]{0x0000020800100002L});
    public static final BitSet FOLLOW_LBRACK_in_postfix802 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix804 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix806 = new BitSet(new long[]{0x0000020800100002L});
    public static final BitSet FOLLOW_DOT_in_postfix829 = new BitSet(new long[]{0x2004421A00000400L});
    public static final BitSet FOLLOW_primary_in_postfix833 = new BitSet(new long[]{0x0000020800100002L});
    public static final BitSet FOLLOW_NAME_in_primary868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary894 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_primary896 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj925 = new BitSet(new long[]{0x0100400000002000L});
    public static final BitSet FOLLOW_pair_in_obj928 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj931 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_pair_in_obj933 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj939 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair962 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_pair964 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_pair967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array979 = new BitSet(new long[]{0x20864A1A44002400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array982 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_COMMA_in_array985 = new BitSet(new long[]{0x20064A1A44000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array987 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_COMMA_in_array994 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_vardef1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto211 = new BitSet(new long[]{0x0000000000000002L});

}