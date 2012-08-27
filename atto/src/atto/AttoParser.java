// $ANTLR 3.4 Atto.g 2012-08-27 12:23:05

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
                    // Atto.g:70:10: NEWLINE
                    {
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt154); if (state.failed) return retval; 
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
            // 70:20: -> ^( STMT expr )
            {
                // Atto.g:70:23: ^( STMT expr )
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
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block177); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            INDENT6=(Token)match(input,INDENT,FOLLOW_INDENT_in_block179); if (state.failed) return retval; 
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
            	    pushFollow(FOLLOW_stmt_in_block181);
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


            DEDENT8=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block184); if (state.failed) return retval; 
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


                    pushFollow(FOLLOW_assign_in_expr209);
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


                    pushFollow(FOLLOW_fun_in_expr219);
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


                    pushFollow(FOLLOW_if__in_expr224);
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


                    pushFollow(FOLLOW_while__in_expr229);
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


                    pushFollow(FOLLOW_or_in_expr234);
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
    // Atto.g:85:1: assign : postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) ) ;
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

        AttoParser.body_return body16 =null;

        AttoParser.body_return body19 =null;

        AttoParser.body_return body22 =null;

        AttoParser.body_return body25 =null;

        AttoParser.body_return body28 =null;

        AttoParser.body_return body31 =null;


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
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:86:2: ( postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) ) )
            // Atto.g:86:4: postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) )
            {
            pushFollow(FOLLOW_postfix_in_assign245);
            postfix14=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfix.add(postfix14.getTree());

            // Atto.g:87:4: ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ASSIGN) ) {
                alt6=1;
            }
            else if ( (LA6_0==DIV||(LA6_0 >= MINUS && LA6_0 <= MUL)||LA6_0==PLUS) ) {
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
                    // Atto.g:87:6: ASSIGN body
                    {
                    ASSIGN15=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN15);


                    pushFollow(FOLLOW_body_in_assign255);
                    body16=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body16.getTree());

                    // AST REWRITE
                    // elements: ASSIGN, body, postfix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 87:18: -> ^( ASSIGN postfix body )
                    {
                        // Atto.g:87:21: ^( ASSIGN postfix body )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        stream_ASSIGN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_postfix.nextTree());

                        adaptor.addChild(root_1, stream_body.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:88:6: ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) )
                    {
                    // Atto.g:88:6: ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) )
                    int alt5=5;
                    switch ( input.LA(1) ) {
                    case PLUS:
                        {
                        alt5=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt5=2;
                        }
                        break;
                    case MUL:
                        {
                        alt5=3;
                        }
                        break;
                    case DIV:
                        {
                        alt5=4;
                        }
                        break;
                    case MOD:
                        {
                        alt5=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }

                    switch (alt5) {
                        case 1 :
                            // Atto.g:88:8: PLUS ASSIGN body
                            {
                            PLUS17=(Token)match(input,PLUS,FOLLOW_PLUS_in_assign274); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PLUS.add(PLUS17);


                            ASSIGN18=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign276); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN18);


                            pushFollow(FOLLOW_body_in_assign278);
                            body19=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body19.getTree());

                            // AST REWRITE
                            // elements: body, postfix, ASSIGN, PLUS, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 88:25: -> ^( ASSIGN postfix ^( PLUS postfix body ) )
                            {
                                // Atto.g:88:28: ^( ASSIGN postfix ^( PLUS postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:88:45: ^( PLUS postfix body )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_PLUS.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_body.nextTree());

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
                            // Atto.g:89:8: MINUS ASSIGN body
                            {
                            MINUS20=(Token)match(input,MINUS,FOLLOW_MINUS_in_assign303); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MINUS.add(MINUS20);


                            ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign305); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN21);


                            pushFollow(FOLLOW_body_in_assign307);
                            body22=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body22.getTree());

                            // AST REWRITE
                            // elements: postfix, body, ASSIGN, MINUS, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 89:26: -> ^( ASSIGN postfix ^( MINUS postfix body ) )
                            {
                                // Atto.g:89:29: ^( ASSIGN postfix ^( MINUS postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:89:46: ^( MINUS postfix body )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_MINUS.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_body.nextTree());

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
                            // Atto.g:90:8: MUL ASSIGN body
                            {
                            MUL23=(Token)match(input,MUL,FOLLOW_MUL_in_assign332); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MUL.add(MUL23);


                            ASSIGN24=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign334); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN24);


                            pushFollow(FOLLOW_body_in_assign336);
                            body25=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body25.getTree());

                            // AST REWRITE
                            // elements: body, ASSIGN, MUL, postfix, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 90:24: -> ^( ASSIGN postfix ^( MUL postfix body ) )
                            {
                                // Atto.g:90:27: ^( ASSIGN postfix ^( MUL postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:90:44: ^( MUL postfix body )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_MUL.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_body.nextTree());

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
                            // Atto.g:91:8: DIV ASSIGN body
                            {
                            DIV26=(Token)match(input,DIV,FOLLOW_DIV_in_assign361); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIV.add(DIV26);


                            ASSIGN27=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign363); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN27);


                            pushFollow(FOLLOW_body_in_assign365);
                            body28=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body28.getTree());

                            // AST REWRITE
                            // elements: postfix, body, DIV, ASSIGN, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 91:24: -> ^( ASSIGN postfix ^( DIV postfix body ) )
                            {
                                // Atto.g:91:27: ^( ASSIGN postfix ^( DIV postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:91:44: ^( DIV postfix body )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_DIV.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_body.nextTree());

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
                            // Atto.g:92:8: MOD ASSIGN body
                            {
                            MOD29=(Token)match(input,MOD,FOLLOW_MOD_in_assign390); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MOD.add(MOD29);


                            ASSIGN30=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign392); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN30);


                            pushFollow(FOLLOW_body_in_assign394);
                            body31=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body31.getTree());

                            // AST REWRITE
                            // elements: body, MOD, ASSIGN, postfix, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 92:24: -> ^( ASSIGN postfix ^( MOD postfix body ) )
                            {
                                // Atto.g:92:27: ^( ASSIGN postfix ^( MOD postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:92:44: ^( MOD postfix body )
                                {
                                AttoTree root_2 = (AttoTree)adaptor.nil();
                                root_2 = (AttoTree)adaptor.becomeRoot(
                                stream_MOD.nextNode()
                                , root_2);

                                adaptor.addChild(root_2, stream_postfix.nextTree());

                                adaptor.addChild(root_2, stream_body.nextTree());

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
    // Atto.g:97:1: fun : paramsdef ARROW ^ body ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ARROW33=null;
        AttoParser.paramsdef_return paramsdef32 =null;

        AttoParser.body_return body34 =null;


        AttoTree ARROW33_tree=null;

        try {
            // Atto.g:98:2: ( paramsdef ARROW ^ body )
            // Atto.g:98:4: paramsdef ARROW ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_paramsdef_in_fun434);
            paramsdef32=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramsdef32.getTree());

            ARROW33=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun436); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARROW33_tree = 
            (AttoTree)adaptor.create(ARROW33)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ARROW33_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_fun439);
            body34=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body34.getTree());

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
    // Atto.g:101:1: paramsdef : ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( COMMA vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) );
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA36=null;
        Token LPAREN38=null;
        Token COMMA40=null;
        Token RPAREN42=null;
        AttoParser.vardef_return vardef35 =null;

        AttoParser.vardef_return vardef37 =null;

        AttoParser.vardef_return vardef39 =null;

        AttoParser.vardef_return vardef41 =null;


        AttoTree COMMA36_tree=null;
        AttoTree LPAREN38_tree=null;
        AttoTree COMMA40_tree=null;
        AttoTree RPAREN42_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:102:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( COMMA vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARROW||LA11_0==NAME) ) {
                alt11=1;
            }
            else if ( (LA11_0==LPAREN) ) {
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
                    // Atto.g:102:4: ( vardef ( COMMA vardef )* )?
                    {
                    // Atto.g:102:4: ( vardef ( COMMA vardef )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NAME) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Atto.g:102:5: vardef ( COMMA vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef451);
                            vardef35=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef35.getTree());

                            // Atto.g:102:12: ( COMMA vardef )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==COMMA) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // Atto.g:102:13: COMMA vardef
                            	    {
                            	    COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef454); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA36);


                            	    pushFollow(FOLLOW_vardef_in_paramsdef456);
                            	    vardef37=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef37.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
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
                    // 102:30: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:102:33: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:102:42: ( vardef )*
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
                    // Atto.g:103:4: LPAREN ( vardef ( COMMA vardef )* )? RPAREN
                    {
                    LPAREN38=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paramsdef474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN38);


                    // Atto.g:103:11: ( vardef ( COMMA vardef )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NAME) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Atto.g:103:12: vardef ( COMMA vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef477);
                            vardef39=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef39.getTree());

                            // Atto.g:103:19: ( COMMA vardef )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==COMMA) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // Atto.g:103:20: COMMA vardef
                            	    {
                            	    COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef480); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA40);


                            	    pushFollow(FOLLOW_vardef_in_paramsdef482);
                            	    vardef41=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef41.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paramsdef488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN42);


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
                    // 103:44: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:103:47: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:103:56: ( vardef )*
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
    // Atto.g:106:1: body : ( expr | block );
    public final AttoParser.body_return body() throws RecognitionException {
        AttoParser.body_return retval = new AttoParser.body_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.expr_return expr43 =null;

        AttoParser.block_return block44 =null;



        try {
            // Atto.g:107:2: ( expr | block )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ARROW||LA12_0==AT||LA12_0==BOOL||LA12_0==IF||LA12_0==INT||(LA12_0 >= LBRACK && LA12_0 <= LCURLY)||LA12_0==LPAREN||LA12_0==MINUS||LA12_0==NAME||(LA12_0 >= NOT && LA12_0 <= NULL)||LA12_0==STRING||LA12_0==WHILE) ) {
                alt12=1;
            }
            else if ( (LA12_0==NEWLINE) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // Atto.g:107:4: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_body509);
                    expr43=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr43.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:108:4: block
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_body514);
                    block44=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block44.getTree());

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
    // Atto.g:111:1: if_ : 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal45=null;
        Token string_literal49=null;
        Token string_literal50=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block46 =null;

        AttoParser.elif_return elif47 =null;

        AttoParser.else__return else_48 =null;


        AttoTree string_literal45_tree=null;
        AttoTree string_literal49_tree=null;
        AttoTree string_literal50_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:112:2: ( 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:112:4: 'if' cond_expr= expr ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal45=(Token)match(input,IF,FOLLOW_IF_in_if_527); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal45);


            pushFollow(FOLLOW_expr_in_if_531);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:113:4: ( block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NEWLINE) ) {
                alt16=1;
            }
            else if ( (LA16_0==67) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Atto.g:113:6: block ( elif )* ( else_ )?
                    {
                    pushFollow(FOLLOW_block_in_if_539);
                    block46=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block46.getTree());

                    // Atto.g:113:12: ( elif )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ELIF) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Atto.g:113:12: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_541);
                    	    elif47=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif47.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // Atto.g:113:18: ( else_ )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ELSE) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==NEWLINE) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // Atto.g:113:18: else_
                            {
                            pushFollow(FOLLOW_else__in_if_544);
                            else_48=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_48.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: cond_expr, elif, else_, block
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
                    // 114:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:114:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:114:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:114:36: ( else_ )?
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
                    // Atto.g:115:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal49=(Token)match(input,67,FOLLOW_67_in_if_574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal49);


                    pushFollow(FOLLOW_expr_in_if_578);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:115:28: ( 'else' else_expr= expr )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ELSE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Atto.g:115:29: 'else' else_expr= expr
                            {
                            string_literal50=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_581); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal50);


                            pushFollow(FOLLOW_expr_in_if_585);
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
                    // 116:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:116:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:116:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:116:35: ^( ELSE $else_expr)
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
    // Atto.g:120:1: elif : 'elif' expr block -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal51=null;
        AttoParser.expr_return expr52 =null;

        AttoParser.block_return block53 =null;


        AttoTree string_literal51_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:121:2: ( 'elif' expr block -> ^( ELIF expr block ) )
            // Atto.g:121:4: 'elif' expr block
            {
            string_literal51=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif629); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal51);


            pushFollow(FOLLOW_expr_in_elif631);
            expr52=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr52.getTree());

            pushFollow(FOLLOW_block_in_elif633);
            block53=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block53.getTree());

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
            // 121:22: -> ^( ELIF expr block )
            {
                // Atto.g:121:25: ^( ELIF expr block )
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
    // Atto.g:124:1: else_ : 'else' block -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal54=null;
        AttoParser.block_return block55 =null;


        AttoTree string_literal54_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:125:2: ( 'else' block -> ^( ELSE block ) )
            // Atto.g:125:4: 'else' block
            {
            string_literal54=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_654); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal54);


            pushFollow(FOLLOW_block_in_else_656);
            block55=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block55.getTree());

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
            // 125:17: -> ^( ELSE block )
            {
                // Atto.g:125:20: ^( ELSE block )
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
    // Atto.g:128:1: while_ : 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal56=null;
        Token string_literal58=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block57 =null;


        AttoTree string_literal56_tree=null;
        AttoTree string_literal58_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:129:2: ( 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:129:4: 'while' cond_expr= expr ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal56=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_676); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal56);


            pushFollow(FOLLOW_expr_in_while_680);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:130:4: ( block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NEWLINE) ) {
                alt17=1;
            }
            else if ( (LA17_0==67) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // Atto.g:130:6: block
                    {
                    pushFollow(FOLLOW_block_in_while_688);
                    block57=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block57.getTree());

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
                    // 130:12: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:130:15: ^( WHILE $cond_expr block )
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
                    // Atto.g:131:6: 'then' then_expr= expr
                    {
                    string_literal58=(Token)match(input,67,FOLLOW_67_in_while_706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal58);


                    pushFollow(FOLLOW_expr_in_while_710);
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
                    // 131:28: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:131:31: ^( WHILE $cond_expr $then_expr)
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
    // Atto.g:135:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR60=null;
        AttoParser.and_return and59 =null;

        AttoParser.and_return and61 =null;


        AttoTree OR60_tree=null;

        try {
            // Atto.g:136:2: ( and ( OR ^ and )* )
            // Atto.g:136:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or738);
            and59=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and59.getTree());

            // Atto.g:136:8: ( OR ^ and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==OR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Atto.g:136:9: OR ^ and
            	    {
            	    OR60=(Token)match(input,OR,FOLLOW_OR_in_or741); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR60_tree = 
            	    (AttoTree)adaptor.create(OR60)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR60_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or744);
            	    and61=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and61.getTree());

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
    // $ANTLR end "or"


    public static class and_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and"
    // Atto.g:139:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND63=null;
        AttoParser.rel_return rel62 =null;

        AttoParser.rel_return rel64 =null;


        AttoTree AND63_tree=null;

        try {
            // Atto.g:140:2: ( rel ( AND ^ rel )* )
            // Atto.g:140:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and757);
            rel62=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel62.getTree());

            // Atto.g:140:8: ( AND ^ rel )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AND) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Atto.g:140:9: AND ^ rel
            	    {
            	    AND63=(Token)match(input,AND,FOLLOW_AND_in_and760); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND63_tree = 
            	    (AttoTree)adaptor.create(AND63)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND63_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and763);
            	    rel64=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel64.getTree());

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
    // $ANTLR end "and"


    public static class rel_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel"
    // Atto.g:143:1: rel : add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set66=null;
        AttoParser.add_return add65 =null;

        AttoParser.add_return add67 =null;


        AttoTree set66_tree=null;

        try {
            // Atto.g:144:2: ( add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* )
            // Atto.g:144:4: add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel776);
            add65=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add65.getTree());

            // Atto.g:144:8: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMPOSITE||LA20_0==EQ||(LA20_0 >= GE && LA20_0 <= GT)||LA20_0==LE||LA20_0==LT||LA20_0==NE||LA20_0==PIPELINE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Atto.g:144:9: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add
            	    {
            	    set66=(Token)input.LT(1);

            	    set66=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set66)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_rel798);
            	    add67=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add67.getTree());

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
    // $ANTLR end "rel"


    public static class add_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // Atto.g:147:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set69=null;
        AttoParser.mul_return mul68 =null;

        AttoParser.mul_return mul70 =null;


        AttoTree set69_tree=null;

        try {
            // Atto.g:148:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:148:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add811);
            mul68=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul68.getTree());

            // Atto.g:148:8: ( ( PLUS | MINUS ) ^ mul )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==MINUS) ) {
                    alt21=1;
                }
                else if ( (LA21_0==PLUS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Atto.g:148:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set69=(Token)input.LT(1);

            	    set69=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set69)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add821);
            	    mul70=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul70.getTree());

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
    // $ANTLR end "add"


    public static class mul_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul"
    // Atto.g:151:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set72=null;
        AttoParser.unary_return unary71 =null;

        AttoParser.unary_return unary73 =null;


        AttoTree set72_tree=null;

        try {
            // Atto.g:152:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:152:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul834);
            unary71=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary71.getTree());

            // Atto.g:152:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==DIV||(LA22_0 >= MOD && LA22_0 <= MUL)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Atto.g:152:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set72=(Token)input.LT(1);

            	    set72=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
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


            	    pushFollow(FOLLOW_unary_in_mul846);
            	    unary73=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary73.getTree());

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
    // $ANTLR end "mul"


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

        Token NOT75=null;
        Token MINUS77=null;
        AttoParser.postfix_return postfix74 =null;

        AttoParser.postfix_return postfix76 =null;

        AttoParser.postfix_return postfix78 =null;


        AttoTree NOT75_tree=null;
        AttoTree MINUS77_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:156:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt23=3;
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
                alt23=1;
                }
                break;
            case NOT:
                {
                alt23=2;
                }
                break;
            case MINUS:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // Atto.g:156:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary860);
                    postfix74=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix74.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:157:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT75=(Token)match(input,NOT,FOLLOW_NOT_in_unary865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT75_tree = 
                    (AttoTree)adaptor.create(NOT75)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT75_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary868);
                    postfix76=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix76.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:158:4: MINUS postfix
                    {
                    MINUS77=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS77);


                    pushFollow(FOLLOW_postfix_in_unary875);
                    postfix78=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix78.getTree());

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
    // Atto.g:161:1: postfix : ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? ( COMMA )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) |p= primary -> ^( CALL $postfix $p) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN80=null;
        Token COMMA82=null;
        Token COMMA84=null;
        Token RPAREN85=null;
        Token LBRACK86=null;
        Token RBRACK88=null;
        Token DOT89=null;
        AttoParser.primary_return p =null;

        AttoParser.primary_return primary79 =null;

        AttoParser.expr_return expr81 =null;

        AttoParser.expr_return expr83 =null;

        AttoParser.expr_return expr87 =null;


        AttoTree LPAREN80_tree=null;
        AttoTree COMMA82_tree=null;
        AttoTree COMMA84_tree=null;
        AttoTree RPAREN85_tree=null;
        AttoTree LBRACK86_tree=null;
        AttoTree RBRACK88_tree=null;
        AttoTree DOT89_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:162:2: ( ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? ( COMMA )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) |p= primary -> ^( CALL $postfix $p) )* )
            // Atto.g:162:4: ( primary -> primary ) ( LPAREN ( expr ( COMMA expr )* )? ( COMMA )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) |p= primary -> ^( CALL $postfix $p) )*
            {
            // Atto.g:162:4: ( primary -> primary )
            // Atto.g:162:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix897);
            primary79=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary79.getTree());

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


            // Atto.g:163:4: ( LPAREN ( expr ( COMMA expr )* )? ( COMMA )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) |p= primary -> ^( CALL $postfix $p) )*
            loop27:
            do {
                int alt27=5;
                switch ( input.LA(1) ) {
                case NAME:
                    {
                    alt27=4;
                    }
                    break;
                case AT:
                    {
                    alt27=4;
                    }
                    break;
                case INT:
                    {
                    alt27=4;
                    }
                    break;
                case STRING:
                    {
                    alt27=4;
                    }
                    break;
                case BOOL:
                    {
                    alt27=4;
                    }
                    break;
                case NULL:
                    {
                    alt27=4;
                    }
                    break;
                case LPAREN:
                    {
                    alt27=1;
                    }
                    break;
                case LCURLY:
                    {
                    alt27=4;
                    }
                    break;
                case LBRACK:
                    {
                    alt27=2;
                    }
                    break;
                case DOT:
                    {
                    alt27=3;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // Atto.g:163:6: LPAREN ( expr ( COMMA expr )* )? ( COMMA )? RPAREN
            	    {
            	    LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix910); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN80);


            	    // Atto.g:163:13: ( expr ( COMMA expr )* )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==ARROW||LA25_0==AT||LA25_0==BOOL||LA25_0==IF||LA25_0==INT||(LA25_0 >= LBRACK && LA25_0 <= LCURLY)||LA25_0==LPAREN||LA25_0==MINUS||LA25_0==NAME||(LA25_0 >= NOT && LA25_0 <= NULL)||LA25_0==STRING||LA25_0==WHILE) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // Atto.g:163:14: expr ( COMMA expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix913);
            	            expr81=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr81.getTree());

            	            // Atto.g:163:19: ( COMMA expr )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==COMMA) ) {
            	                    int LA24_1 = input.LA(2);

            	                    if ( (LA24_1==ARROW||LA24_1==AT||LA24_1==BOOL||LA24_1==IF||LA24_1==INT||(LA24_1 >= LBRACK && LA24_1 <= LCURLY)||LA24_1==LPAREN||LA24_1==MINUS||LA24_1==NAME||(LA24_1 >= NOT && LA24_1 <= NULL)||LA24_1==STRING||LA24_1==WHILE) ) {
            	                        alt24=1;
            	                    }


            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // Atto.g:163:20: COMMA expr
            	            	    {
            	            	    COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix916); if (state.failed) return retval; 
            	            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA82);


            	            	    pushFollow(FOLLOW_expr_in_postfix918);
            	            	    expr83=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr83.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    // Atto.g:163:35: ( COMMA )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==COMMA) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // Atto.g:163:35: COMMA
            	            {
            	            COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix924); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA84);


            	            }
            	            break;

            	    }


            	    RPAREN85=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix927); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN85);


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
            	    LBRACK86=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix955); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK86);


            	    pushFollow(FOLLOW_expr_in_postfix957);
            	    expr87=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr87.getTree());

            	    RBRACK88=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix959); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK88);


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
            	    DOT89=(Token)match(input,DOT,FOLLOW_DOT_in_postfix982); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT89);


            	    pushFollow(FOLLOW_primary_in_postfix986);
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
            	case 4 :
            	    // Atto.g:169:6: p= primary
            	    {
            	    pushFollow(FOLLOW_primary_in_postfix1012);
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
            	    // 170:5: -> ^( CALL $postfix $p)
            	    {
            	        // Atto.g:170:8: ^( CALL $postfix $p)
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
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
    // $ANTLR end "postfix"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:174:1: primary : ( NAME | AT ^ NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME90=null;
        Token AT91=null;
        Token NAME92=null;
        Token INT93=null;
        Token STRING94=null;
        Token BOOL95=null;
        Token NULL96=null;
        Token LPAREN97=null;
        Token RPAREN99=null;
        AttoParser.expr_return expr98 =null;

        AttoParser.obj_return obj100 =null;

        AttoParser.array_return array101 =null;


        AttoTree NAME90_tree=null;
        AttoTree AT91_tree=null;
        AttoTree NAME92_tree=null;
        AttoTree INT93_tree=null;
        AttoTree STRING94_tree=null;
        AttoTree BOOL95_tree=null;
        AttoTree NULL96_tree=null;
        AttoTree LPAREN97_tree=null;
        AttoTree RPAREN99_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:175:2: ( NAME | AT ^ NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array )
            int alt28=9;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt28=1;
                }
                break;
            case AT:
                {
                alt28=2;
                }
                break;
            case INT:
                {
                alt28=3;
                }
                break;
            case STRING:
                {
                alt28=4;
                }
                break;
            case BOOL:
                {
                alt28=5;
                }
                break;
            case NULL:
                {
                alt28=6;
                }
                break;
            case LPAREN:
                {
                alt28=7;
                }
                break;
            case LCURLY:
                {
                alt28=8;
                }
                break;
            case LBRACK:
                {
                alt28=9;
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
                    // Atto.g:175:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME90=(Token)match(input,NAME,FOLLOW_NAME_in_primary1046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME90_tree = 
                    (AttoTree)adaptor.create(NAME90)
                    ;
                    adaptor.addChild(root_0, NAME90_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:176:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT91=(Token)match(input,AT,FOLLOW_AT_in_primary1051); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT91_tree = 
                    (AttoTree)adaptor.create(AT91)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT91_tree, root_0);
                    }

                    NAME92=(Token)match(input,NAME,FOLLOW_NAME_in_primary1054); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME92_tree = 
                    (AttoTree)adaptor.create(NAME92)
                    ;
                    adaptor.addChild(root_0, NAME92_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:177:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT93=(Token)match(input,INT,FOLLOW_INT_in_primary1060); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT93_tree = 
                    (AttoTree)adaptor.create(INT93)
                    ;
                    adaptor.addChild(root_0, INT93_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:178:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING94=(Token)match(input,STRING,FOLLOW_STRING_in_primary1065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING94_tree = 
                    (AttoTree)adaptor.create(STRING94)
                    ;
                    adaptor.addChild(root_0, STRING94_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:179:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL95=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary1070); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL95_tree = 
                    (AttoTree)adaptor.create(BOOL95)
                    ;
                    adaptor.addChild(root_0, BOOL95_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:180:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL96=(Token)match(input,NULL,FOLLOW_NULL_in_primary1075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL96_tree = 
                    (AttoTree)adaptor.create(NULL96)
                    ;
                    adaptor.addChild(root_0, NULL96_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:181:4: LPAREN expr RPAREN
                    {
                    LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN97);


                    pushFollow(FOLLOW_expr_in_primary1082);
                    expr98=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr98.getTree());

                    RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN99);


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
                    // 181:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:182:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary1093);
                    obj100=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj100.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:183:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary1098);
                    array101=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array101.getTree());

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
    // Atto.g:186:1: obj : LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY102=null;
        Token COMMA104=null;
        Token COMMA106=null;
        Token RCURLY107=null;
        AttoParser.pair_return pair103 =null;

        AttoParser.pair_return pair105 =null;


        AttoTree LCURLY102_tree=null;
        AttoTree COMMA104_tree=null;
        AttoTree COMMA106_tree=null;
        AttoTree RCURLY107_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:187:2: ( LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:187:4: LCURLY ( pair ( COMMA pair )* )? ( COMMA )? RCURLY
            {
            LCURLY102=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj1111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY102);


            // Atto.g:187:11: ( pair ( COMMA pair )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==NAME) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Atto.g:187:12: pair ( COMMA pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj1114);
                    pair103=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair103.getTree());

                    // Atto.g:187:17: ( COMMA pair )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==COMMA) ) {
                            int LA29_1 = input.LA(2);

                            if ( (LA29_1==NAME) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Atto.g:187:18: COMMA pair
                    	    {
                    	    COMMA104=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1117); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA104);


                    	    pushFollow(FOLLOW_pair_in_obj1119);
                    	    pair105=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair105.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:187:33: ( COMMA )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COMMA) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Atto.g:187:33: COMMA
                    {
                    COMMA106=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA106);


                    }
                    break;

            }


            RCURLY107=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj1128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY107);


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
            // 187:47: -> ^( OBJ ( pair )* )
            {
                // Atto.g:187:50: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:187:56: ( pair )*
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
    // Atto.g:190:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME108=null;
        Token COLON109=null;
        AttoParser.expr_return expr110 =null;


        AttoTree NAME108_tree=null;
        AttoTree COLON109_tree=null;

        try {
            // Atto.g:191:2: ( NAME COLON ^ expr )
            // Atto.g:191:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME108=(Token)match(input,NAME,FOLLOW_NAME_in_pair1148); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME108_tree = 
            (AttoTree)adaptor.create(NAME108)
            ;
            adaptor.addChild(root_0, NAME108_tree);
            }

            COLON109=(Token)match(input,COLON,FOLLOW_COLON_in_pair1150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON109_tree = 
            (AttoTree)adaptor.create(COLON109)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON109_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair1153);
            expr110=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr110.getTree());

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
    // Atto.g:194:1: array : LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK111=null;
        Token COMMA113=null;
        Token COMMA115=null;
        Token RBRACK116=null;
        AttoParser.expr_return expr112 =null;

        AttoParser.expr_return expr114 =null;


        AttoTree LBRACK111_tree=null;
        AttoTree COMMA113_tree=null;
        AttoTree COMMA115_tree=null;
        AttoTree RBRACK116_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:195:2: ( LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:195:4: LBRACK ( expr ( COMMA expr )* )? ( COMMA )? RBRACK
            {
            LBRACK111=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK111);


            // Atto.g:195:11: ( expr ( COMMA expr )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ARROW||LA33_0==AT||LA33_0==BOOL||LA33_0==IF||LA33_0==INT||(LA33_0 >= LBRACK && LA33_0 <= LCURLY)||LA33_0==LPAREN||LA33_0==MINUS||LA33_0==NAME||(LA33_0 >= NOT && LA33_0 <= NULL)||LA33_0==STRING||LA33_0==WHILE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Atto.g:195:12: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1168);
                    expr112=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr112.getTree());

                    // Atto.g:195:17: ( COMMA expr )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==COMMA) ) {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1==ARROW||LA32_1==AT||LA32_1==BOOL||LA32_1==IF||LA32_1==INT||(LA32_1 >= LBRACK && LA32_1 <= LCURLY)||LA32_1==LPAREN||LA32_1==MINUS||LA32_1==NAME||(LA32_1 >= NOT && LA32_1 <= NULL)||LA32_1==STRING||LA32_1==WHILE) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // Atto.g:195:18: COMMA expr
                    	    {
                    	    COMMA113=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1171); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA113);


                    	    pushFollow(FOLLOW_expr_in_array1173);
                    	    expr114=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr114.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:195:34: ( COMMA )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==COMMA) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Atto.g:195:34: COMMA
                    {
                    COMMA115=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA115);


                    }
                    break;

            }


            RBRACK116=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK116);


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
            // 195:48: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:195:51: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:195:59: ( expr )*
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
    // Atto.g:198:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME117=null;

        AttoTree NAME117_tree=null;

        try {
            // Atto.g:199:2: ( NAME )
            // Atto.g:199:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME117=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1203); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME117_tree = 
            (AttoTree)adaptor.create(NAME117)
            ;
            adaptor.addChild(root_0, NAME117_tree);
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
        pushFollow(FOLLOW_assign_in_synpred1_Atto205);
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
        pushFollow(FOLLOW_fun_in_synpred2_Atto215);
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


 

    public static final BitSet FOLLOW_stmt_in_root127 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_root130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt151 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block177 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INDENT_in_block179 = new BitSet(new long[]{0x4003250D20020540L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block181 = new BitSet(new long[]{0x4003250D20020540L,0x0000000000000002L});
    public static final BitSet FOLLOW_DEDENT_in_block184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign245 = new BitSet(new long[]{0x00401C0000080080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign253 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_assign255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_assign274 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign276 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_assign278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_assign303 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign305 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_assign307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_assign332 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign334 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_assign336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_assign361 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign363 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_assign365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_assign390 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign392 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_assign394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramsdef_in_fun434 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fun436 = new BitSet(new long[]{0x4003A50D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_fun439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef451 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef454 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef456 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LPAREN_in_paramsdef474 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef477 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef480 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef482 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_paramsdef488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_body509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_527 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_531 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_if_539 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elif_in_if_541 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_else__in_if_544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_if_574 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_578 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_581 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_if_585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif629 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_elif631 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_block_in_elif633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_654 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_block_in_else_656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_676 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_680 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_while_688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_while_706 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or738 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_or741 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_and_in_or744 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rel_in_and757 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and760 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_rel_in_and763 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel776 = new BitSet(new long[]{0x002042100C808002L});
    public static final BitSet FOLLOW_set_in_rel779 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_add_in_rel798 = new BitSet(new long[]{0x002042100C808002L});
    public static final BitSet FOLLOW_mul_in_add811 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_set_in_add814 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_mul_in_add821 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_unary_in_mul834 = new BitSet(new long[]{0x0000180000080002L});
    public static final BitSet FOLLOW_set_in_mul837 = new BitSet(new long[]{0x4003250D00000500L});
    public static final BitSet FOLLOW_unary_in_mul846 = new BitSet(new long[]{0x0000180000080002L});
    public static final BitSet FOLLOW_postfix_in_unary860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary865 = new BitSet(new long[]{0x4002210D00000500L});
    public static final BitSet FOLLOW_postfix_in_unary868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary873 = new BitSet(new long[]{0x4002210D00000500L});
    public static final BitSet FOLLOW_postfix_in_unary875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix897 = new BitSet(new long[]{0x4002210D00100502L});
    public static final BitSet FOLLOW_LPAREN_in_postfix910 = new BitSet(new long[]{0x4203250D20002540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix913 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_postfix916 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix918 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_COMMA_in_postfix924 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix927 = new BitSet(new long[]{0x4002210D00100502L});
    public static final BitSet FOLLOW_LBRACK_in_postfix955 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfix957 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix959 = new BitSet(new long[]{0x4002210D00100502L});
    public static final BitSet FOLLOW_DOT_in_postfix982 = new BitSet(new long[]{0x4002210D00000500L});
    public static final BitSet FOLLOW_primary_in_postfix986 = new BitSet(new long[]{0x4002210D00100502L});
    public static final BitSet FOLLOW_primary_in_postfix1012 = new BitSet(new long[]{0x4002210D00100502L});
    public static final BitSet FOLLOW_NAME_in_primary1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary1051 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NAME_in_primary1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary1080 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primary1082 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj1111 = new BitSet(new long[]{0x0100200000002000L});
    public static final BitSet FOLLOW_pair_in_obj1114 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj1117 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_pair_in_obj1119 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj1125 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair1148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_pair1150 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_pair1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1165 = new BitSet(new long[]{0x4083250D20002540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_array1168 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_COMMA_in_array1171 = new BitSet(new long[]{0x4003250D20000540L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_array1173 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_COMMA_in_array1180 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_vardef1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_synpred2_Atto215 = new BitSet(new long[]{0x0000000000000002L});

}