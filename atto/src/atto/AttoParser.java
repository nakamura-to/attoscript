// $ANTLR 3.4 Atto.g 2012-08-26 02:09:24

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "COLON", "COMMA", "COMMENT", "COMPOSITE", "CONSTANT", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "FIELD_ACCESS", "FLOAT", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "INT", "INTEGER", "LBRACK", "LCURLY", "LE", "LEADING_WS", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OR", "PARAMS", "PIPELINE", "PLUS", "RBRACK", "RCURLY", "RPAREN", "SEMICOLON", "SEND", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'then'"
    };

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
    // Atto.g:65:1: root : ( stmt )* EOF -> ^( BLOCK ( stmt )* ) ;
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
            // Atto.g:66:2: ( ( stmt )* EOF -> ^( BLOCK ( stmt )* ) )
            // Atto.g:66:4: ( stmt )* EOF
            {
            // Atto.g:66:4: ( stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ARROW||LA1_0==AT||LA1_0==BOOL||LA1_0==IF||LA1_0==INT||(LA1_0 >= LBRACK && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NAME||(LA1_0 >= NOT && LA1_0 <= NULL)||LA1_0==STRING||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Atto.g:66:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_root127);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root130); if (state.failed) return retval; 
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
            // 66:14: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:66:17: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:66:25: ( stmt )*
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
    // Atto.g:69:1: stmt : expr ( NEWLINE )? -> ^( STMT expr ) ;
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
            // Atto.g:70:2: ( expr ( NEWLINE )? -> ^( STMT expr ) )
            // Atto.g:70:4: expr ( NEWLINE )?
            {
            pushFollow(FOLLOW_expr_in_stmt151);
            expr3=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr3.getTree());

            // Atto.g:70:9: ( NEWLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Atto.g:70:9: NEWLINE
                    {
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt153); if (state.failed) return retval; 
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
            // 70:18: -> ^( STMT expr )
            {
                // Atto.g:70:21: ^( STMT expr )
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
    // Atto.g:73:1: block : NEWLINE INDENT ( stmt )* DEDENT -> ^( BLOCK ( stmt )* ) ;
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
            // Atto.g:74:2: ( NEWLINE INDENT ( stmt )* DEDENT -> ^( BLOCK ( stmt )* ) )
            // Atto.g:74:4: NEWLINE INDENT ( stmt )* DEDENT
            {
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            INDENT6=(Token)match(input,INDENT,FOLLOW_INDENT_in_block177); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT6);


            // Atto.g:74:19: ( stmt )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==AT||LA3_0==BOOL||LA3_0==IF||LA3_0==INT||(LA3_0 >= LBRACK && LA3_0 <= LCURLY)||LA3_0==LPAREN||LA3_0==MINUS||LA3_0==NAME||(LA3_0 >= NOT && LA3_0 <= NULL)||LA3_0==STRING||LA3_0==WHILE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Atto.g:74:19: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block179);
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


            DEDENT8=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block182); if (state.failed) return retval; 
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
            // 74:32: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:74:35: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:74:43: ( stmt )*
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
    // Atto.g:77:1: expr : ( ( assign )=> assign | ( fun )=> fun | if_ | while_ | or );
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
            // Atto.g:78:2: ( ( assign )=> assign | ( fun )=> fun | if_ | while_ | or )
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
            else if ( (LA4_0==AT) ) {
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
            else if ( (LA4_0==INT) ) {
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
            else if ( (LA4_0==STRING) ) {
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
            else if ( (LA4_0==BOOL) ) {
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
            else if ( (LA4_0==NULL) ) {
                int LA4_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
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
            else if ( (LA4_0==LPAREN) ) {
                int LA4_7 = input.LA(2);

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
                        new NoViableAltException("", 4, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==LCURLY) ) {
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
            else if ( (LA4_0==LBRACK) ) {
                int LA4_9 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 9, input);

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
                    // Atto.g:78:4: ( assign )=> assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr207);
                    assign9=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign9.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:79:4: ( fun )=> fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_expr217);
                    fun10=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun10.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:80:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr222);
                    if_11=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_11.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:81:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr227);
                    while_12=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_12.getTree());

                    }
                    break;
                case 5 :
                    // Atto.g:82:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr232);
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
    // Atto.g:85:1: assign : postfix ASSIGN ^ body ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN15=null;
        AttoParser.postfix_return postfix14 =null;

        AttoParser.body_return body16 =null;


        AttoTree ASSIGN15_tree=null;

        try {
            // Atto.g:86:2: ( postfix ASSIGN ^ body )
            // Atto.g:86:4: postfix ASSIGN ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_postfix_in_assign243);
            postfix14=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix14.getTree());

            ASSIGN15=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign245); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN15_tree = 
            (AttoTree)adaptor.create(ASSIGN15)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ASSIGN15_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_assign248);
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
    // Atto.g:89:1: fun : paramsdef ARROW ^ body ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ARROW18=null;
        AttoParser.paramsdef_return paramsdef17 =null;

        AttoParser.body_return body19 =null;


        AttoTree ARROW18_tree=null;

        try {
            // Atto.g:90:2: ( paramsdef ARROW ^ body )
            // Atto.g:90:4: paramsdef ARROW ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_paramsdef_in_fun259);
            paramsdef17=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramsdef17.getTree());

            ARROW18=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun261); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARROW18_tree = 
            (AttoTree)adaptor.create(ARROW18)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ARROW18_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_fun264);
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
    // Atto.g:93:1: paramsdef : ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( COMMA vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) );
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
            // Atto.g:94:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( COMMA vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) )
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
                    // Atto.g:94:4: ( vardef ( COMMA vardef )* )?
                    {
                    // Atto.g:94:4: ( vardef ( COMMA vardef )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==NAME) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Atto.g:94:5: vardef ( COMMA vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef276);
                            vardef20=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef20.getTree());

                            // Atto.g:94:12: ( COMMA vardef )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==COMMA) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // Atto.g:94:13: COMMA vardef
                            	    {
                            	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef279); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA21);


                            	    pushFollow(FOLLOW_vardef_in_paramsdef281);
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
                    // 94:30: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:94:33: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:94:42: ( vardef )*
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
                    // Atto.g:95:4: LPAREN ( vardef ( COMMA vardef )* )? RPAREN
                    {
                    LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paramsdef299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN23);


                    // Atto.g:95:11: ( vardef ( COMMA vardef )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NAME) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Atto.g:95:12: vardef ( COMMA vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef302);
                            vardef24=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef24.getTree());

                            // Atto.g:95:19: ( COMMA vardef )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==COMMA) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // Atto.g:95:20: COMMA vardef
                            	    {
                            	    COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef305); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA25);


                            	    pushFollow(FOLLOW_vardef_in_paramsdef307);
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


                    RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paramsdef313); if (state.failed) return retval; 
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
                    // 95:44: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:95:47: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:95:56: ( vardef )*
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
    // Atto.g:98:1: body : ( expr | block );
    public final AttoParser.body_return body() throws RecognitionException {
        AttoParser.body_return retval = new AttoParser.body_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.expr_return expr28 =null;

        AttoParser.block_return block29 =null;



        try {
            // Atto.g:99:2: ( expr | block )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ARROW||LA10_0==AT||LA10_0==BOOL||LA10_0==IF||LA10_0==INT||(LA10_0 >= LBRACK && LA10_0 <= LCURLY)||LA10_0==LPAREN||LA10_0==MINUS||LA10_0==NAME||(LA10_0 >= NOT && LA10_0 <= NULL)||LA10_0==STRING||LA10_0==WHILE) ) {
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
                    // Atto.g:99:4: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_body334);
                    expr28=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr28.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:100:4: block
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_body339);
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
    // Atto.g:103:1: if_ : 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:104:2: ( 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:104:4: 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal30=(Token)match(input,IF,FOLLOW_IF_in_if_352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal30);


            pushFollow(FOLLOW_expr_in_if_356);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:105:4: ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NEWLINE) ) {
                alt14=1;
            }
            else if ( (LA14_0==67) ) {
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
                    // Atto.g:105:6: block ( elif )* ( else_ )?
                    {
                    pushFollow(FOLLOW_block_in_if_364);
                    block31=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block31.getTree());

                    // Atto.g:105:12: ( elif )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ELIF) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Atto.g:105:12: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_366);
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


                    // Atto.g:105:18: ( else_ )?
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
                            // Atto.g:105:18: else_
                            {
                            pushFollow(FOLLOW_else__in_if_369);
                            else_33=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_33.getTree());

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
                    // 106:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:106:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:106:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:106:36: ( else_ )?
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
                    // Atto.g:107:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal34=(Token)match(input,67,FOLLOW_67_in_if_399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal34);


                    pushFollow(FOLLOW_expr_in_if_403);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:107:28: ( 'else' else_expr= expr )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ELSE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Atto.g:107:29: 'else' else_expr= expr
                            {
                            string_literal35=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_406); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal35);


                            pushFollow(FOLLOW_expr_in_if_410);
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
                    // 108:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:108:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:108:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:108:35: ^( ELSE $else_expr)
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
    // Atto.g:112:1: elif : 'elif' expr block -> ^( ELIF expr block ) ;
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
            // Atto.g:113:2: ( 'elif' expr block -> ^( ELIF expr block ) )
            // Atto.g:113:4: 'elif' expr block
            {
            string_literal36=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal36);


            pushFollow(FOLLOW_expr_in_elif456);
            expr37=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr37.getTree());

            pushFollow(FOLLOW_block_in_elif458);
            block38=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block38.getTree());

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
            // 113:22: -> ^( ELIF expr block )
            {
                // Atto.g:113:25: ^( ELIF expr block )
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
    // Atto.g:116:1: else_ : 'else' block -> ^( ELSE block ) ;
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
            // Atto.g:117:2: ( 'else' block -> ^( ELSE block ) )
            // Atto.g:117:4: 'else' block
            {
            string_literal39=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal39);


            pushFollow(FOLLOW_block_in_else_481);
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
            // 117:17: -> ^( ELSE block )
            {
                // Atto.g:117:20: ^( ELSE block )
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
    // Atto.g:120:1: while_ : 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:121:2: ( 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:121:4: 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal41=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal41);


            pushFollow(FOLLOW_expr_in_while_505);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:122:4: ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NEWLINE) ) {
                alt15=1;
            }
            else if ( (LA15_0==67) ) {
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
                    // Atto.g:122:6: block
                    {
                    pushFollow(FOLLOW_block_in_while_513);
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
                    // 122:12: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:122:15: ^( WHILE $cond_expr block )
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
                    // Atto.g:123:6: 'then' then_expr= expr
                    {
                    string_literal43=(Token)match(input,67,FOLLOW_67_in_while_531); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal43);


                    pushFollow(FOLLOW_expr_in_while_535);
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
                    // 123:28: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:123:31: ^( WHILE $cond_expr $then_expr)
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
    // Atto.g:127:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR45=null;
        AttoParser.and_return and44 =null;

        AttoParser.and_return and46 =null;


        AttoTree OR45_tree=null;

        try {
            // Atto.g:128:2: ( and ( OR ^ and )* )
            // Atto.g:128:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or563);
            and44=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and44.getTree());

            // Atto.g:128:8: ( OR ^ and )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Atto.g:128:9: OR ^ and
            	    {
            	    OR45=(Token)match(input,OR,FOLLOW_OR_in_or566); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR45_tree = 
            	    (AttoTree)adaptor.create(OR45)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR45_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or569);
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
    // Atto.g:131:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND48=null;
        AttoParser.rel_return rel47 =null;

        AttoParser.rel_return rel49 =null;


        AttoTree AND48_tree=null;

        try {
            // Atto.g:132:2: ( rel ( AND ^ rel )* )
            // Atto.g:132:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and582);
            rel47=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel47.getTree());

            // Atto.g:132:8: ( AND ^ rel )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Atto.g:132:9: AND ^ rel
            	    {
            	    AND48=(Token)match(input,AND,FOLLOW_AND_in_and585); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND48_tree = 
            	    (AttoTree)adaptor.create(AND48)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND48_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and588);
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
    // Atto.g:135:1: rel : add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set51=null;
        AttoParser.add_return add50 =null;

        AttoParser.add_return add52 =null;


        AttoTree set51_tree=null;

        try {
            // Atto.g:136:2: ( add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* )
            // Atto.g:136:4: add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel601);
            add50=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add50.getTree());

            // Atto.g:136:8: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMPOSITE||LA18_0==EQ||(LA18_0 >= GE && LA18_0 <= GT)||LA18_0==LE||LA18_0==LT||LA18_0==NE||LA18_0==PIPELINE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Atto.g:136:9: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add
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


            	    pushFollow(FOLLOW_add_in_rel623);
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
    // Atto.g:139:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set54=null;
        AttoParser.mul_return mul53 =null;

        AttoParser.mul_return mul55 =null;


        AttoTree set54_tree=null;

        try {
            // Atto.g:140:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:140:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add636);
            mul53=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul53.getTree());

            // Atto.g:140:8: ( ( PLUS | MINUS ) ^ mul )*
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
            	    // Atto.g:140:9: ( PLUS | MINUS ) ^ mul
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


            	    pushFollow(FOLLOW_mul_in_add646);
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
    // Atto.g:143:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set57=null;
        AttoParser.unary_return unary56 =null;

        AttoParser.unary_return unary58 =null;


        AttoTree set57_tree=null;

        try {
            // Atto.g:144:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:144:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul659);
            unary56=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary56.getTree());

            // Atto.g:144:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||(LA20_0 >= MOD && LA20_0 <= MUL)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Atto.g:144:11: ( MUL | DIV | MOD ) ^ unary
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


            	    pushFollow(FOLLOW_unary_in_mul671);
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
    // Atto.g:147:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
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
            // Atto.g:148:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case AT:
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
                    // Atto.g:148:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary685);
                    postfix59=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix59.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:149:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT60=(Token)match(input,NOT,FOLLOW_NOT_in_unary690); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT60_tree = 
                    (AttoTree)adaptor.create(NOT60)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT60_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary693);
                    postfix61=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix61.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:150:4: MINUS postfix
                    {
                    MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS62);


                    pushFollow(FOLLOW_postfix_in_unary700);
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
                    // 150:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:150:21: ^( UNARY_MINUS postfix )
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
    // Atto.g:153:1: postfix : ( primary -> primary ) ( ( DOT primary LPAREN )=> DOT primary LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( SEND $postfix primary ( expr )* ) | LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token DOT65=null;
        Token LPAREN67=null;
        Token COMMA69=null;
        Token RPAREN71=null;
        Token LPAREN72=null;
        Token COMMA74=null;
        Token RPAREN76=null;
        Token LBRACK77=null;
        Token RBRACK79=null;
        Token DOT80=null;
        AttoParser.primary_return p =null;

        AttoParser.primary_return primary64 =null;

        AttoParser.primary_return primary66 =null;

        AttoParser.expr_return expr68 =null;

        AttoParser.expr_return expr70 =null;

        AttoParser.expr_return expr73 =null;

        AttoParser.expr_return expr75 =null;

        AttoParser.expr_return expr78 =null;


        AttoTree DOT65_tree=null;
        AttoTree LPAREN67_tree=null;
        AttoTree COMMA69_tree=null;
        AttoTree RPAREN71_tree=null;
        AttoTree LPAREN72_tree=null;
        AttoTree COMMA74_tree=null;
        AttoTree RPAREN76_tree=null;
        AttoTree LBRACK77_tree=null;
        AttoTree RBRACK79_tree=null;
        AttoTree DOT80_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:154:2: ( ( primary -> primary ) ( ( DOT primary LPAREN )=> DOT primary LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( SEND $postfix primary ( expr )* ) | LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* )
            // Atto.g:154:4: ( primary -> primary ) ( ( DOT primary LPAREN )=> DOT primary LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( SEND $postfix primary ( expr )* ) | LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            {
            // Atto.g:154:4: ( primary -> primary )
            // Atto.g:154:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix722);
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
            // 154:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:155:4: ( ( DOT primary LPAREN )=> DOT primary LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( SEND $postfix primary ( expr )* ) | LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            loop26:
            do {
                int alt26=5;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt26=2;
                    }
                    break;
                case LBRACK:
                    {
                    alt26=3;
                    }
                    break;
                case DOT:
                    {
                    int LA26_30 = input.LA(2);

                    if ( (synpred3_Atto()) ) {
                        alt26=1;
                    }
                    else if ( (true) ) {
                        alt26=4;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // Atto.g:155:6: ( DOT primary LPAREN )=> DOT primary LPAREN ( expr ( COMMA expr )* )? RPAREN
            	    {
            	    DOT65=(Token)match(input,DOT,FOLLOW_DOT_in_postfix744); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT65);


            	    pushFollow(FOLLOW_primary_in_postfix746);
            	    primary66=primary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_primary.add(primary66.getTree());

            	    LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix748); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN67);


            	    // Atto.g:155:48: ( expr ( COMMA expr )* )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==ARROW||LA23_0==AT||LA23_0==BOOL||LA23_0==IF||LA23_0==INT||(LA23_0 >= LBRACK && LA23_0 <= LCURLY)||LA23_0==LPAREN||LA23_0==MINUS||LA23_0==NAME||(LA23_0 >= NOT && LA23_0 <= NULL)||LA23_0==STRING||LA23_0==WHILE) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // Atto.g:155:49: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix751);
            	            expr68=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr68.getTree());

            	            // Atto.g:155:54: ( COMMA expr )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==COMMA) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // Atto.g:155:55: COMMA expr
            	            	    {
            	            	    COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix754); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA69);


            	            	    pushFollow(FOLLOW_expr_in_postfix756);
            	            	    expr70=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr70.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop22;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix762); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN71);


            	    // AST REWRITE
            	    // elements: expr, postfix, primary
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (AttoTree)adaptor.nil();
            	    // 156:5: -> ^( SEND $postfix primary ( expr )* )
            	    {
            	        // Atto.g:156:8: ^( SEND $postfix primary ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(SEND, "SEND")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_primary.nextTree());

            	        // Atto.g:156:32: ( expr )*
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
            	    // Atto.g:157:6: LPAREN ( expr ( COMMA expr )* )? RPAREN
            	    {
            	    LPAREN72=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix787); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN72);


            	    // Atto.g:157:13: ( expr ( COMMA expr )* )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==ARROW||LA25_0==AT||LA25_0==BOOL||LA25_0==IF||LA25_0==INT||(LA25_0 >= LBRACK && LA25_0 <= LCURLY)||LA25_0==LPAREN||LA25_0==MINUS||LA25_0==NAME||(LA25_0 >= NOT && LA25_0 <= NULL)||LA25_0==STRING||LA25_0==WHILE) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // Atto.g:157:14: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix790);
            	            expr73=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr73.getTree());

            	            // Atto.g:157:19: ( COMMA expr )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==COMMA) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // Atto.g:157:20: COMMA expr
            	            	    {
            	            	    COMMA74=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix793); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA74);


            	            	    pushFollow(FOLLOW_expr_in_postfix795);
            	            	    expr75=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr75.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix801); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN76);


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
            	    // 158:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:158:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:158:24: ( expr )*
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
            	case 3 :
            	    // Atto.g:159:6: LBRACK expr RBRACK
            	    {
            	    LBRACK77=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix825); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK77);


            	    pushFollow(FOLLOW_expr_in_postfix827);
            	    expr78=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr78.getTree());

            	    RBRACK79=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix829); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK79);


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
            	    // 160:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:160:8: ^( INDEX $postfix expr )
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
            	case 4 :
            	    // Atto.g:161:6: DOT p= primary
            	    {
            	    DOT80=(Token)match(input,DOT,FOLLOW_DOT_in_postfix852); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT80);


            	    pushFollow(FOLLOW_primary_in_postfix856);
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
            	    // 162:5: -> ^( FIELD_ACCESS $postfix $p)
            	    {
            	        // Atto.g:162:8: ^( FIELD_ACCESS $postfix $p)
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
    // $ANTLR end "postfix"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:166:1: primary : ( NAME | AT ^ NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME81=null;
        Token AT82=null;
        Token NAME83=null;
        Token INT84=null;
        Token STRING85=null;
        Token BOOL86=null;
        Token NULL87=null;
        Token LPAREN88=null;
        Token RPAREN90=null;
        AttoParser.expr_return expr89 =null;

        AttoParser.obj_return obj91 =null;

        AttoParser.array_return array92 =null;


        AttoTree NAME81_tree=null;
        AttoTree AT82_tree=null;
        AttoTree NAME83_tree=null;
        AttoTree INT84_tree=null;
        AttoTree STRING85_tree=null;
        AttoTree BOOL86_tree=null;
        AttoTree NULL87_tree=null;
        AttoTree LPAREN88_tree=null;
        AttoTree RPAREN90_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:167:2: ( NAME | AT ^ NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array )
            int alt27=9;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt27=1;
                }
                break;
            case AT:
                {
                alt27=2;
                }
                break;
            case INT:
                {
                alt27=3;
                }
                break;
            case STRING:
                {
                alt27=4;
                }
                break;
            case BOOL:
                {
                alt27=5;
                }
                break;
            case NULL:
                {
                alt27=6;
                }
                break;
            case LPAREN:
                {
                alt27=7;
                }
                break;
            case LCURLY:
                {
                alt27=8;
                }
                break;
            case LBRACK:
                {
                alt27=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // Atto.g:167:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME81=(Token)match(input,NAME,FOLLOW_NAME_in_primary891); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME81_tree = 
                    (AttoTree)adaptor.create(NAME81)
                    ;
                    adaptor.addChild(root_0, NAME81_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:168:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT82=(Token)match(input,AT,FOLLOW_AT_in_primary896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT82_tree = 
                    (AttoTree)adaptor.create(AT82)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT82_tree, root_0);
                    }

                    NAME83=(Token)match(input,NAME,FOLLOW_NAME_in_primary899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME83_tree = 
                    (AttoTree)adaptor.create(NAME83)
                    ;
                    adaptor.addChild(root_0, NAME83_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:169:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT84=(Token)match(input,INT,FOLLOW_INT_in_primary905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT84_tree = 
                    (AttoTree)adaptor.create(INT84)
                    ;
                    adaptor.addChild(root_0, INT84_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:170:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING85=(Token)match(input,STRING,FOLLOW_STRING_in_primary910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING85_tree = 
                    (AttoTree)adaptor.create(STRING85)
                    ;
                    adaptor.addChild(root_0, STRING85_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:171:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL86=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL86_tree = 
                    (AttoTree)adaptor.create(BOOL86)
                    ;
                    adaptor.addChild(root_0, BOOL86_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:172:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL87=(Token)match(input,NULL,FOLLOW_NULL_in_primary920); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL87_tree = 
                    (AttoTree)adaptor.create(NULL87)
                    ;
                    adaptor.addChild(root_0, NULL87_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:173:4: LPAREN expr RPAREN
                    {
                    LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary925); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN88);


                    pushFollow(FOLLOW_expr_in_primary927);
                    expr89=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr89.getTree());

                    RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN90);


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
                    // 173:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:174:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary938);
                    obj91=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj91.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:175:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary943);
                    array92=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array92.getTree());

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
    // Atto.g:178:1: obj : LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY93=null;
        Token COMMA95=null;
        Token COMMA97=null;
        Token RCURLY98=null;
        AttoParser.pair_return pair94 =null;

        AttoParser.pair_return pair96 =null;


        AttoTree LCURLY93_tree=null;
        AttoTree COMMA95_tree=null;
        AttoTree COMMA97_tree=null;
        AttoTree RCURLY98_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:179:2: ( LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:179:4: LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY
            {
            LCURLY93=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj956); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY93);


            // Atto.g:179:11: ( pair ( COMMA pair )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NAME) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Atto.g:179:12: pair ( COMMA pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj959);
                    pair94=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair94.getTree());

                    // Atto.g:179:17: ( COMMA pair )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==COMMA) ) {
                            int LA28_1 = input.LA(2);

                            if ( (LA28_1==NAME) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Atto.g:179:18: COMMA pair
                    	    {
                    	    COMMA95=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj962); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA95);


                    	    pushFollow(FOLLOW_pair_in_obj964);
                    	    pair96=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair96.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:179:33: ( COMMA )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==COMMA) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Atto.g:179:33: COMMA
                    {
                    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj970); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA97);


                    }
                    break;

            }


            RCURLY98=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj973); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY98);


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
            // 179:47: -> ^( OBJ ( pair )* )
            {
                // Atto.g:179:50: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:179:56: ( pair )*
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
    // Atto.g:182:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME99=null;
        Token COLON100=null;
        AttoParser.expr_return expr101 =null;


        AttoTree NAME99_tree=null;
        AttoTree COLON100_tree=null;

        try {
            // Atto.g:183:2: ( NAME COLON ^ expr )
            // Atto.g:183:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME99=(Token)match(input,NAME,FOLLOW_NAME_in_pair993); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME99_tree = 
            (AttoTree)adaptor.create(NAME99)
            ;
            adaptor.addChild(root_0, NAME99_tree);
            }

            COLON100=(Token)match(input,COLON,FOLLOW_COLON_in_pair995); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON100_tree = 
            (AttoTree)adaptor.create(COLON100)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON100_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair998);
            expr101=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr101.getTree());

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
    // Atto.g:186:1: array : LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK102=null;
        Token COMMA104=null;
        Token COMMA106=null;
        Token RBRACK107=null;
        AttoParser.expr_return expr103 =null;

        AttoParser.expr_return expr105 =null;


        AttoTree LBRACK102_tree=null;
        AttoTree COMMA104_tree=null;
        AttoTree COMMA106_tree=null;
        AttoTree RBRACK107_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:187:2: ( LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:187:4: LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK
            {
            LBRACK102=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK102);


            // Atto.g:187:11: ( expr ( COMMA expr )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ARROW||LA32_0==AT||LA32_0==BOOL||LA32_0==IF||LA32_0==INT||(LA32_0 >= LBRACK && LA32_0 <= LCURLY)||LA32_0==LPAREN||LA32_0==MINUS||LA32_0==NAME||(LA32_0 >= NOT && LA32_0 <= NULL)||LA32_0==STRING||LA32_0==WHILE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Atto.g:187:12: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1013);
                    expr103=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr103.getTree());

                    // Atto.g:187:17: ( COMMA expr )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==COMMA) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==ARROW||LA31_1==AT||LA31_1==BOOL||LA31_1==IF||LA31_1==INT||(LA31_1 >= LBRACK && LA31_1 <= LCURLY)||LA31_1==LPAREN||LA31_1==MINUS||LA31_1==NAME||(LA31_1 >= NOT && LA31_1 <= NULL)||LA31_1==STRING||LA31_1==WHILE) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Atto.g:187:18: COMMA expr
                    	    {
                    	    COMMA104=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1016); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA104);


                    	    pushFollow(FOLLOW_expr_in_array1018);
                    	    expr105=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr105.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:187:34: ( COMMA )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==COMMA) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Atto.g:187:34: COMMA
                    {
                    COMMA106=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA106);


                    }
                    break;

            }


            RBRACK107=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK107);


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
            // 187:48: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:187:51: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:187:59: ( expr )*
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
    // Atto.g:190:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME108=null;

        AttoTree NAME108_tree=null;

        try {
            // Atto.g:191:2: ( NAME )
            // Atto.g:191:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME108=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1048); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME108_tree = 
            (AttoTree)adaptor.create(NAME108)
            ;
            adaptor.addChild(root_0, NAME108_tree);
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
        // Atto.g:78:4: ( assign )
        // Atto.g:78:5: assign
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
        // Atto.g:79:4: ( fun )
        // Atto.g:79:5: fun
        {
        pushFollow(FOLLOW_fun_in_synpred2_Atto213);
        fun();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Atto

    // $ANTLR start synpred3_Atto
    public final void synpred3_Atto_fragment() throws RecognitionException {
        // Atto.g:155:6: ( DOT primary LPAREN )
        // Atto.g:155:7: DOT primary LPAREN
        {
        match(input,DOT,FOLLOW_DOT_in_synpred3_Atto736); if (state.failed) return ;

        pushFollow(FOLLOW_primary_in_synpred3_Atto738);
        primary();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred3_Atto740); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Atto

    // Delegated rules

    public final boolean synpred3_Atto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Atto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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


 

    public static final BitSet FOLLOW_stmt_in_root127 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_root130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt151 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block175 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INDENT_in_block177 = new BitSet(new long[]{0x4003250D20020540L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block179 = new BitSet(new long[]{0x4003250D20020540L,0x0000000000000002L});
    public static final BitSet FOLLOW_DEDENT_in_block182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign243 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign245 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_assign248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramsdef_in_fun259 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fun261 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_fun264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef276 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef279 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef281 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LPAREN_in_paramsdef299 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef302 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef305 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef307 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_paramsdef313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_body334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_352 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_356 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_if_364 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elif_in_if_366 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_else__in_if_369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_if_399 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_403 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_406 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif454 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_elif456 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_block_in_elif458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_479 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_block_in_else_481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_501 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_505 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_while_513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_while_531 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or563 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_or566 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_and_in_or569 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rel_in_and582 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and585 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_rel_in_and588 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel601 = new BitSet(new long[]{0x002042100C808002L});
    public static final BitSet FOLLOW_set_in_rel604 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_add_in_rel623 = new BitSet(new long[]{0x002042100C808002L});
    public static final BitSet FOLLOW_mul_in_add636 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_set_in_add639 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_mul_in_add646 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_unary_in_mul659 = new BitSet(new long[]{0x0000180000080002L});
    public static final BitSet FOLLOW_set_in_mul662 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_unary_in_mul671 = new BitSet(new long[]{0x0000180000080002L});
    public static final BitSet FOLLOW_postfix_in_unary685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary690 = new BitSet(new long[]{0x4002210D00000500L});
    public static final BitSet FOLLOW_postfix_in_unary693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary698 = new BitSet(new long[]{0x4002210D00000500L});
    public static final BitSet FOLLOW_postfix_in_unary700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix722 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_DOT_in_postfix744 = new BitSet(new long[]{0x4002210D00000500L});
    public static final BitSet FOLLOW_primary_in_postfix746 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix748 = new BitSet(new long[]{0x4203250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix751 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_postfix754 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix756 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix762 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix787 = new BitSet(new long[]{0x4203250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix790 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_postfix793 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix795 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix801 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_LBRACK_in_postfix825 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix827 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix829 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_DOT_in_postfix852 = new BitSet(new long[]{0x4002210D00000500L});
    public static final BitSet FOLLOW_primary_in_postfix856 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_NAME_in_primary891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary896 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NAME_in_primary899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary925 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primary927 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj956 = new BitSet(new long[]{0x0100200000002000L});
    public static final BitSet FOLLOW_pair_in_obj959 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj962 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_pair_in_obj964 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj970 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair993 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_pair995 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_pair998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1010 = new BitSet(new long[]{0x4083250D20002540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_array1013 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_COMMA_in_array1016 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_array1018 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_COMMA_in_array1025 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_vardef1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_synpred2_Atto213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred3_Atto736 = new BitSet(new long[]{0x4002210D00000500L});
    public static final BitSet FOLLOW_primary_in_synpred3_Atto738 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred3_Atto740 = new BitSet(new long[]{0x0000000000000002L});

}