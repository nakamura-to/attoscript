// $ANTLR 3.4 Atto.g 2012-08-21 14:30:14

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGS", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CLOSE_BRACKET", "CLOSE_PARENT", "CLOSE_S_BRACKET", "COLON", "COMMA", "COMMENT", "CONSTANT", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "FLOAT", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "INT", "INTEGER", "LE", "LEADING_WS", "LETTER", "LOWER", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OPEN_BRACKET", "OPEN_PARENT", "OPEN_S_BRACKET", "OR", "PARAMS", "PLUS", "PRIMARY", "PRINT", "SEMICOLON", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__66=66;
    public static final int AND=4;
    public static final int ARGS=5;
    public static final int ARRAY=6;
    public static final int ARROW=7;
    public static final int ASSIGN=8;
    public static final int AT=9;
    public static final int BLOCK=10;
    public static final int BOOL=11;
    public static final int CLOSE_BRACKET=12;
    public static final int CLOSE_PARENT=13;
    public static final int CLOSE_S_BRACKET=14;
    public static final int COLON=15;
    public static final int COMMA=16;
    public static final int COMMENT=17;
    public static final int CONSTANT=18;
    public static final int DEDENT=19;
    public static final int DIGIT=20;
    public static final int DIV=21;
    public static final int DOT=22;
    public static final int ELIF=23;
    public static final int ELSE=24;
    public static final int EQ=25;
    public static final int FLOAT=26;
    public static final int FUN=27;
    public static final int GE=28;
    public static final int GT=29;
    public static final int ID_CHAR=30;
    public static final int IF=31;
    public static final int INDENT=32;
    public static final int INDEX=33;
    public static final int INT=34;
    public static final int INTEGER=35;
    public static final int LE=36;
    public static final int LEADING_WS=37;
    public static final int LETTER=38;
    public static final int LOWER=39;
    public static final int LT=40;
    public static final int MINUS=41;
    public static final int MOD=42;
    public static final int MUL=43;
    public static final int NAME=44;
    public static final int NE=45;
    public static final int NEWLINE=46;
    public static final int NOT=47;
    public static final int NULL=48;
    public static final int OBJ=49;
    public static final int OPEN_BRACKET=50;
    public static final int OPEN_PARENT=51;
    public static final int OPEN_S_BRACKET=52;
    public static final int OR=53;
    public static final int PARAMS=54;
    public static final int PLUS=55;
    public static final int PRIMARY=56;
    public static final int PRINT=57;
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

                if ( (LA1_0==BOOL||LA1_0==FUN||LA1_0==IF||LA1_0==INT||LA1_0==MINUS||LA1_0==NAME||(LA1_0 >= NOT && LA1_0 <= NULL)||(LA1_0 >= OPEN_BRACKET && LA1_0 <= OPEN_S_BRACKET)||LA1_0==PRINT||LA1_0==STRING||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Atto.g:70:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_root143);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root146); if (state.failed) return retval; 
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
            pushFollow(FOLLOW_expr_in_stmt167);
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
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt169); if (state.failed) return retval; 
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
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            INDENT6=(Token)match(input,INDENT,FOLLOW_INDENT_in_block193); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT6);


            // Atto.g:78:19: ( stmt )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BOOL||LA3_0==FUN||LA3_0==IF||LA3_0==INT||LA3_0==MINUS||LA3_0==NAME||(LA3_0 >= NOT && LA3_0 <= NULL)||(LA3_0 >= OPEN_BRACKET && LA3_0 <= OPEN_S_BRACKET)||LA3_0==PRINT||LA3_0==STRING||LA3_0==WHILE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Atto.g:78:19: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block195);
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


            DEDENT8=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block198); if (state.failed) return retval; 
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
    // Atto.g:81:1: expr : ( fun | assign | or | if_ | while_ | print );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.fun_return fun9 =null;

        AttoParser.assign_return assign10 =null;

        AttoParser.or_return or11 =null;

        AttoParser.if__return if_12 =null;

        AttoParser.while__return while_13 =null;

        AttoParser.print_return print14 =null;



        try {
            // Atto.g:82:2: ( fun | assign | or | if_ | while_ | print )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Atto.g:82:4: fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_expr218);
                    fun9=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun9.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:83:4: assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr223);
                    assign10=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign10.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:84:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr228);
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


                    pushFollow(FOLLOW_if__in_expr233);
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


                    pushFollow(FOLLOW_while__in_expr238);
                    while_13=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_13.getTree());

                    }
                    break;
                case 6 :
                    // Atto.g:87:4: print
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_print_in_expr243);
                    print14=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print14.getTree());

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


    public static class print_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // Atto.g:90:1: print : 'print' expr -> ^( PRINT expr ) ;
    public final AttoParser.print_return print() throws RecognitionException {
        AttoParser.print_return retval = new AttoParser.print_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal15=null;
        AttoParser.expr_return expr16 =null;


        AttoTree string_literal15_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:91:2: ( 'print' expr -> ^( PRINT expr ) )
            // Atto.g:91:4: 'print' expr
            {
            string_literal15=(Token)match(input,PRINT,FOLLOW_PRINT_in_print254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PRINT.add(string_literal15);


            pushFollow(FOLLOW_expr_in_print256);
            expr16=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr16.getTree());

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
            // 91:17: -> ^( PRINT expr )
            {
                // Atto.g:91:20: ^( PRINT expr )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PRINT, "PRINT")
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
    // $ANTLR end "print"


    public static class obj_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "obj"
    // Atto.g:94:1: obj : OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OPEN_BRACKET17=null;
        Token COMMA19=null;
        Token COMMA21=null;
        Token CLOSE_BRACKET22=null;
        AttoParser.pair_return pair18 =null;

        AttoParser.pair_return pair20 =null;


        AttoTree OPEN_BRACKET17_tree=null;
        AttoTree COMMA19_tree=null;
        AttoTree COMMA21_tree=null;
        AttoTree CLOSE_BRACKET22_tree=null;
        RewriteRuleTokenStream stream_OPEN_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CLOSE_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACKET");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:95:2: ( OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET -> ^( OBJ ( pair )* ) )
            // Atto.g:95:4: OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET
            {
            OPEN_BRACKET17=(Token)match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_obj276); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACKET.add(OPEN_BRACKET17);


            // Atto.g:95:17: ( pair ( COMMA pair )* ( COMMA )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NAME) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Atto.g:95:18: pair ( COMMA pair )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_pair_in_obj279);
                    pair18=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair18.getTree());

                    // Atto.g:95:23: ( COMMA pair )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==NAME) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Atto.g:95:24: COMMA pair
                    	    {
                    	    COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj282); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA19);


                    	    pushFollow(FOLLOW_pair_in_obj284);
                    	    pair20=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair20.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // Atto.g:95:37: ( COMMA )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COMMA) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Atto.g:95:37: COMMA
                            {
                            COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj288); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA21);


                            }
                            break;

                    }


                    }
                    break;

            }


            CLOSE_BRACKET22=(Token)match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_obj293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACKET.add(CLOSE_BRACKET22);


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
            // 95:60: -> ^( OBJ ( pair )* )
            {
                // Atto.g:95:63: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:95:69: ( pair )*
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
    // Atto.g:98:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME23=null;
        Token COLON24=null;
        AttoParser.expr_return expr25 =null;


        AttoTree NAME23_tree=null;
        AttoTree COLON24_tree=null;

        try {
            // Atto.g:99:2: ( NAME COLON ^ expr )
            // Atto.g:99:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME23=(Token)match(input,NAME,FOLLOW_NAME_in_pair313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME23_tree = 
            (AttoTree)adaptor.create(NAME23)
            ;
            adaptor.addChild(root_0, NAME23_tree);
            }

            COLON24=(Token)match(input,COLON,FOLLOW_COLON_in_pair315); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON24_tree = 
            (AttoTree)adaptor.create(COLON24)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON24_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair318);
            expr25=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr25.getTree());

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
    // Atto.g:102:1: array : OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OPEN_S_BRACKET26=null;
        Token COMMA28=null;
        Token COMMA30=null;
        Token CLOSE_S_BRACKET31=null;
        AttoParser.expr_return expr27 =null;

        AttoParser.expr_return expr29 =null;


        AttoTree OPEN_S_BRACKET26_tree=null;
        AttoTree COMMA28_tree=null;
        AttoTree COMMA30_tree=null;
        AttoTree CLOSE_S_BRACKET31_tree=null;
        RewriteRuleTokenStream stream_CLOSE_S_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_S_BRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_S_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_S_BRACKET");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:103:2: ( OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET -> ^( ARRAY ( expr )* ) )
            // Atto.g:103:4: OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET
            {
            OPEN_S_BRACKET26=(Token)match(input,OPEN_S_BRACKET,FOLLOW_OPEN_S_BRACKET_in_array330); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_S_BRACKET.add(OPEN_S_BRACKET26);


            // Atto.g:103:19: ( expr ( COMMA expr )* ( COMMA )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BOOL||LA10_0==FUN||LA10_0==IF||LA10_0==INT||LA10_0==MINUS||LA10_0==NAME||(LA10_0 >= NOT && LA10_0 <= NULL)||(LA10_0 >= OPEN_BRACKET && LA10_0 <= OPEN_S_BRACKET)||LA10_0==PRINT||LA10_0==STRING||LA10_0==WHILE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Atto.g:103:20: expr ( COMMA expr )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_array333);
                    expr27=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr27.getTree());

                    // Atto.g:103:25: ( COMMA expr )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==BOOL||LA8_1==FUN||LA8_1==IF||LA8_1==INT||LA8_1==MINUS||LA8_1==NAME||(LA8_1 >= NOT && LA8_1 <= NULL)||(LA8_1 >= OPEN_BRACKET && LA8_1 <= OPEN_S_BRACKET)||LA8_1==PRINT||LA8_1==STRING||LA8_1==WHILE) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Atto.g:103:26: COMMA expr
                    	    {
                    	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_array336); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA28);


                    	    pushFollow(FOLLOW_expr_in_array338);
                    	    expr29=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // Atto.g:103:39: ( COMMA )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==COMMA) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Atto.g:103:39: COMMA
                            {
                            COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_array342); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);


                            }
                            break;

                    }


                    }
                    break;

            }


            CLOSE_S_BRACKET31=(Token)match(input,CLOSE_S_BRACKET,FOLLOW_CLOSE_S_BRACKET_in_array347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_S_BRACKET.add(CLOSE_S_BRACKET31);


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
            // 103:64: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:103:67: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:103:75: ( expr )*
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


    public static class if__return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_"
    // Atto.g:106:1: if_ : 'if' cond= expr ( block ( elif )* ( else_ )? -> ^( IF $cond block ( elif )* ( else_ )? ) | 'then' then= expr ( online_elif )* ( online_else )? -> ^( IF $cond $then ( online_elif )* ( online_else )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal32=null;
        Token string_literal36=null;
        AttoParser.expr_return cond =null;

        AttoParser.expr_return then =null;

        AttoParser.block_return block33 =null;

        AttoParser.elif_return elif34 =null;

        AttoParser.else__return else_35 =null;

        AttoParser.online_elif_return online_elif37 =null;

        AttoParser.online_else_return online_else38 =null;


        AttoTree string_literal32_tree=null;
        AttoTree string_literal36_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_online_else=new RewriteRuleSubtreeStream(adaptor,"rule online_else");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        RewriteRuleSubtreeStream stream_online_elif=new RewriteRuleSubtreeStream(adaptor,"rule online_elif");
        try {
            // Atto.g:107:2: ( 'if' cond= expr ( block ( elif )* ( else_ )? -> ^( IF $cond block ( elif )* ( else_ )? ) | 'then' then= expr ( online_elif )* ( online_else )? -> ^( IF $cond $then ( online_elif )* ( online_else )? ) ) )
            // Atto.g:107:4: 'if' cond= expr ( block ( elif )* ( else_ )? -> ^( IF $cond block ( elif )* ( else_ )? ) | 'then' then= expr ( online_elif )* ( online_else )? -> ^( IF $cond $then ( online_elif )* ( online_else )? ) )
            {
            string_literal32=(Token)match(input,IF,FOLLOW_IF_in_if_368); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal32);


            pushFollow(FOLLOW_expr_in_if_372);
            cond=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond.getTree());

            // Atto.g:108:4: ( block ( elif )* ( else_ )? -> ^( IF $cond block ( elif )* ( else_ )? ) | 'then' then= expr ( online_elif )* ( online_else )? -> ^( IF $cond $then ( online_elif )* ( online_else )? ) )
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
                    // Atto.g:109:5: block ( elif )* ( else_ )?
                    {
                    pushFollow(FOLLOW_block_in_if_384);
                    block33=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block33.getTree());

                    // Atto.g:109:11: ( elif )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ELIF) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Atto.g:109:11: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_386);
                    	    elif34=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // Atto.g:109:17: ( else_ )?
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
                            // Atto.g:109:17: else_
                            {
                            pushFollow(FOLLOW_else__in_if_389);
                            else_35=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_35.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: else_, block, cond, elif
                    // token labels: 
                    // rule labels: retval, cond
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 109:24: -> ^( IF $cond block ( elif )* ( else_ )? )
                    {
                        // Atto.g:109:27: ^( IF $cond block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:109:44: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:109:50: ( else_ )?
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
                    // Atto.g:110:5: 'then' then= expr ( online_elif )* ( online_else )?
                    {
                    string_literal36=(Token)match(input,66,FOLLOW_66_in_if_413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal36);


                    pushFollow(FOLLOW_expr_in_if_417);
                    then=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then.getTree());

                    // Atto.g:110:22: ( online_elif )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ELIF) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Atto.g:110:22: online_elif
                    	    {
                    	    pushFollow(FOLLOW_online_elif_in_if_419);
                    	    online_elif37=online_elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_online_elif.add(online_elif37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // Atto.g:110:35: ( online_else )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ELSE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Atto.g:110:35: online_else
                            {
                            pushFollow(FOLLOW_online_else_in_if_422);
                            online_else38=online_else();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_online_else.add(online_else38.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: online_else, online_elif, cond, then
                    // token labels: 
                    // rule labels: retval, then, cond
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_then=new RewriteRuleSubtreeStream(adaptor,"rule then",then!=null?then.tree:null);
                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 110:48: -> ^( IF $cond $then ( online_elif )* ( online_else )? )
                    {
                        // Atto.g:110:51: ^( IF $cond $then ( online_elif )* ( online_else )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond.nextTree());

                        adaptor.addChild(root_1, stream_then.nextTree());

                        // Atto.g:110:68: ( online_elif )*
                        while ( stream_online_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_online_elif.nextTree());

                        }
                        stream_online_elif.reset();

                        // Atto.g:110:81: ( online_else )?
                        if ( stream_online_else.hasNext() ) {
                            adaptor.addChild(root_1, stream_online_else.nextTree());

                        }
                        stream_online_else.reset();

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
    // Atto.g:114:1: elif : 'elif' expr block -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal39=null;
        AttoParser.expr_return expr40 =null;

        AttoParser.block_return block41 =null;


        AttoTree string_literal39_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:115:2: ( 'elif' expr block -> ^( ELIF expr block ) )
            // Atto.g:115:4: 'elif' expr block
            {
            string_literal39=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal39);


            pushFollow(FOLLOW_expr_in_elif460);
            expr40=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr40.getTree());

            pushFollow(FOLLOW_block_in_elif462);
            block41=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block41.getTree());

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
            // 115:22: -> ^( ELIF expr block )
            {
                // Atto.g:115:25: ^( ELIF expr block )
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
    // Atto.g:118:1: else_ : 'else' block -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal42=null;
        AttoParser.block_return block43 =null;


        AttoTree string_literal42_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:119:2: ( 'else' block -> ^( ELSE block ) )
            // Atto.g:119:4: 'else' block
            {
            string_literal42=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal42);


            pushFollow(FOLLOW_block_in_else_485);
            block43=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block43.getTree());

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
            // 119:17: -> ^( ELSE block )
            {
                // Atto.g:119:20: ^( ELSE block )
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


    public static class online_elif_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "online_elif"
    // Atto.g:122:1: online_elif : 'elif' expr 'then' expr -> ^( ELIF expr expr ) ;
    public final AttoParser.online_elif_return online_elif() throws RecognitionException {
        AttoParser.online_elif_return retval = new AttoParser.online_elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal44=null;
        Token string_literal46=null;
        AttoParser.expr_return expr45 =null;

        AttoParser.expr_return expr47 =null;


        AttoTree string_literal44_tree=null;
        AttoTree string_literal46_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:123:2: ( 'elif' expr 'then' expr -> ^( ELIF expr expr ) )
            // Atto.g:123:4: 'elif' expr 'then' expr
            {
            string_literal44=(Token)match(input,ELIF,FOLLOW_ELIF_in_online_elif505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal44);


            pushFollow(FOLLOW_expr_in_online_elif507);
            expr45=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr45.getTree());

            string_literal46=(Token)match(input,66,FOLLOW_66_in_online_elif509); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal46);


            pushFollow(FOLLOW_expr_in_online_elif511);
            expr47=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr47.getTree());

            // AST REWRITE
            // elements: expr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 123:28: -> ^( ELIF expr expr )
            {
                // Atto.g:123:31: ^( ELIF expr expr )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ELIF, "ELIF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

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
    // $ANTLR end "online_elif"


    public static class online_else_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "online_else"
    // Atto.g:126:1: online_else : 'else' expr -> ^( ELSE expr ) ;
    public final AttoParser.online_else_return online_else() throws RecognitionException {
        AttoParser.online_else_return retval = new AttoParser.online_else_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal48=null;
        AttoParser.expr_return expr49 =null;


        AttoTree string_literal48_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:127:2: ( 'else' expr -> ^( ELSE expr ) )
            // Atto.g:127:4: 'else' expr
            {
            string_literal48=(Token)match(input,ELSE,FOLLOW_ELSE_in_online_else533); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal48);


            pushFollow(FOLLOW_expr_in_online_else535);
            expr49=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr49.getTree());

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
            // 127:16: -> ^( ELSE expr )
            {
                // Atto.g:127:19: ^( ELSE expr )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ELSE, "ELSE")
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
    // $ANTLR end "online_else"


    public static class while__return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_"
    // Atto.g:130:1: while_ : 'while' cond= expr ( block -> ^( WHILE $cond block ) | 'then' then= expr -> ^( WHILE $cond $then) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal50=null;
        Token string_literal52=null;
        AttoParser.expr_return cond =null;

        AttoParser.expr_return then =null;

        AttoParser.block_return block51 =null;


        AttoTree string_literal50_tree=null;
        AttoTree string_literal52_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:131:2: ( 'while' cond= expr ( block -> ^( WHILE $cond block ) | 'then' then= expr -> ^( WHILE $cond $then) ) )
            // Atto.g:131:4: 'while' cond= expr ( block -> ^( WHILE $cond block ) | 'then' then= expr -> ^( WHILE $cond $then) )
            {
            string_literal50=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal50);


            pushFollow(FOLLOW_expr_in_while_560);
            cond=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond.getTree());

            // Atto.g:132:4: ( block -> ^( WHILE $cond block ) | 'then' then= expr -> ^( WHILE $cond $then) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NEWLINE) ) {
                alt16=1;
            }
            else if ( (LA16_0==66) ) {
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
                    // Atto.g:133:5: block
                    {
                    pushFollow(FOLLOW_block_in_while_572);
                    block51=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block51.getTree());

                    // AST REWRITE
                    // elements: block, cond
                    // token labels: 
                    // rule labels: retval, cond
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 133:11: -> ^( WHILE $cond block )
                    {
                        // Atto.g:133:14: ^( WHILE $cond block )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(WHILE, "WHILE")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:134:7: 'then' then= expr
                    {
                    string_literal52=(Token)match(input,66,FOLLOW_66_in_while_591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal52);


                    pushFollow(FOLLOW_expr_in_while_595);
                    then=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then.getTree());

                    // AST REWRITE
                    // elements: then, cond
                    // token labels: 
                    // rule labels: retval, then, cond
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_then=new RewriteRuleSubtreeStream(adaptor,"rule then",then!=null?then.tree:null);
                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 134:24: -> ^( WHILE $cond $then)
                    {
                        // Atto.g:134:27: ^( WHILE $cond $then)
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(WHILE, "WHILE")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond.nextTree());

                        adaptor.addChild(root_1, stream_then.nextTree());

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


    public static class assign_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // Atto.g:138:1: assign : qname ASSIGN ^ expr ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN54=null;
        AttoParser.qname_return qname53 =null;

        AttoParser.expr_return expr55 =null;


        AttoTree ASSIGN54_tree=null;

        try {
            // Atto.g:139:2: ( qname ASSIGN ^ expr )
            // Atto.g:139:4: qname ASSIGN ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_qname_in_assign624);
            qname53=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qname53.getTree());

            ASSIGN54=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign626); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN54_tree = 
            (AttoTree)adaptor.create(ASSIGN54)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ASSIGN54_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_assign629);
            expr55=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr55.getTree());

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
    // Atto.g:142:1: fun : 'fun' paramsdef ARROW body -> ^( FUN paramsdef body ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal56=null;
        Token ARROW58=null;
        AttoParser.paramsdef_return paramsdef57 =null;

        AttoParser.body_return body59 =null;


        AttoTree string_literal56_tree=null;
        AttoTree ARROW58_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        try {
            // Atto.g:143:2: ( 'fun' paramsdef ARROW body -> ^( FUN paramsdef body ) )
            // Atto.g:143:4: 'fun' paramsdef ARROW body
            {
            string_literal56=(Token)match(input,FUN,FOLLOW_FUN_in_fun640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUN.add(string_literal56);


            pushFollow(FOLLOW_paramsdef_in_fun642);
            paramsdef57=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef57.getTree());

            ARROW58=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW58);


            pushFollow(FOLLOW_body_in_fun646);
            body59=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body59.getTree());

            // AST REWRITE
            // elements: body, paramsdef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 143:31: -> ^( FUN paramsdef body )
            {
                // Atto.g:143:34: ^( FUN paramsdef body )
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
    // Atto.g:146:1: paramsdef : ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) ;
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA61=null;
        AttoParser.vardef_return vardef60 =null;

        AttoParser.vardef_return vardef62 =null;


        AttoTree COMMA61_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:147:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMS ( vardef )* ) )
            // Atto.g:147:4: ( vardef ( COMMA vardef )* )?
            {
            // Atto.g:147:4: ( vardef ( COMMA vardef )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NAME) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Atto.g:147:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_paramsdef668);
                    vardef60=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef60.getTree());

                    // Atto.g:147:12: ( COMMA vardef )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Atto.g:147:13: COMMA vardef
                    	    {
                    	    COMMA61=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef671); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA61);


                    	    pushFollow(FOLLOW_vardef_in_paramsdef673);
                    	    vardef62=vardef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_vardef.add(vardef62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
            // 147:30: -> ^( PARAMS ( vardef )* )
            {
                // Atto.g:147:33: ^( PARAMS ( vardef )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // Atto.g:147:42: ( vardef )*
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


    public static class body_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // Atto.g:150:1: body : ( expr | block );
    public final AttoParser.body_return body() throws RecognitionException {
        AttoParser.body_return retval = new AttoParser.body_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.expr_return expr63 =null;

        AttoParser.block_return block64 =null;



        try {
            // Atto.g:150:6: ( expr | block )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==BOOL||LA19_0==FUN||LA19_0==IF||LA19_0==INT||LA19_0==MINUS||LA19_0==NAME||(LA19_0 >= NOT && LA19_0 <= NULL)||(LA19_0 >= OPEN_BRACKET && LA19_0 <= OPEN_S_BRACKET)||LA19_0==PRINT||LA19_0==STRING||LA19_0==WHILE) ) {
                alt19=1;
            }
            else if ( (LA19_0==NEWLINE) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Atto.g:150:8: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_body696);
                    expr63=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr63.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:151:4: block
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_body701);
                    block64=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block64.getTree());

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


    public static class or_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or"
    // Atto.g:154:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR66=null;
        AttoParser.and_return and65 =null;

        AttoParser.and_return and67 =null;


        AttoTree OR66_tree=null;

        try {
            // Atto.g:155:2: ( and ( OR ^ and )* )
            // Atto.g:155:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or712);
            and65=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and65.getTree());

            // Atto.g:155:8: ( OR ^ and )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==OR) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Atto.g:155:9: OR ^ and
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
    // $ANTLR end "or"


    public static class and_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and"
    // Atto.g:158:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND69=null;
        AttoParser.rel_return rel68 =null;

        AttoParser.rel_return rel70 =null;


        AttoTree AND69_tree=null;

        try {
            // Atto.g:159:2: ( rel ( AND ^ rel )* )
            // Atto.g:159:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and731);
            rel68=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel68.getTree());

            // Atto.g:159:8: ( AND ^ rel )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Atto.g:159:9: AND ^ rel
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
    // $ANTLR end "and"


    public static class rel_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel"
    // Atto.g:162:1: rel : add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set72=null;
        AttoParser.add_return add71 =null;

        AttoParser.add_return add73 =null;


        AttoTree set72_tree=null;

        try {
            // Atto.g:163:2: ( add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* )
            // Atto.g:163:4: add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel750);
            add71=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add71.getTree());

            // Atto.g:163:8: ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==EQ||(LA22_0 >= GE && LA22_0 <= GT)||LA22_0==LE||LA22_0==LT||LA22_0==NE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Atto.g:163:9: ( EQ | NE | LE | GE | LT | GT ) ^ add
            	    {
            	    set72=(Token)input.LT(1);

            	    set72=(Token)input.LT(1);

            	    if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
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


            	    pushFollow(FOLLOW_add_in_rel768);
            	    add73=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add73.getTree());

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
    // $ANTLR end "rel"


    public static class add_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // Atto.g:166:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set75=null;
        AttoParser.mul_return mul74 =null;

        AttoParser.mul_return mul76 =null;


        AttoTree set75_tree=null;

        try {
            // Atto.g:167:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:167:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add781);
            mul74=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul74.getTree());

            // Atto.g:167:8: ( ( PLUS | MINUS ) ^ mul )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS) ) {
                    alt23=1;
                }
                else if ( (LA23_0==PLUS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Atto.g:167:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set75=(Token)input.LT(1);

            	    set75=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set75)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add791);
            	    mul76=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul76.getTree());

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
    // $ANTLR end "add"


    public static class mul_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul"
    // Atto.g:170:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set78=null;
        AttoParser.unary_return unary77 =null;

        AttoParser.unary_return unary79 =null;


        AttoTree set78_tree=null;

        try {
            // Atto.g:171:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:171:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul804);
            unary77=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary77.getTree());

            // Atto.g:171:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DIV||(LA24_0 >= MOD && LA24_0 <= MUL)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Atto.g:171:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set78=(Token)input.LT(1);

            	    set78=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
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


            	    pushFollow(FOLLOW_unary_in_mul816);
            	    unary79=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary79.getTree());

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
    // $ANTLR end "mul"


    public static class unary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // Atto.g:174:1: unary : ( primary | NOT ^ primary | MINUS primary -> ^( UNARY_MINUS primary ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT81=null;
        Token MINUS83=null;
        AttoParser.primary_return primary80 =null;

        AttoParser.primary_return primary82 =null;

        AttoParser.primary_return primary84 =null;


        AttoTree NOT81_tree=null;
        AttoTree MINUS83_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        try {
            // Atto.g:175:2: ( primary | NOT ^ primary | MINUS primary -> ^( UNARY_MINUS primary ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
            case NAME:
            case NULL:
            case OPEN_BRACKET:
            case OPEN_PARENT:
            case OPEN_S_BRACKET:
            case STRING:
                {
                alt25=1;
                }
                break;
            case NOT:
                {
                alt25=2;
                }
                break;
            case MINUS:
                {
                alt25=3;
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
                    // Atto.g:175:4: primary
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_unary830);
                    primary80=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary80.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:176:4: NOT ^ primary
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT81=(Token)match(input,NOT,FOLLOW_NOT_in_unary835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT81_tree = 
                    (AttoTree)adaptor.create(NOT81)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT81_tree, root_0);
                    }

                    pushFollow(FOLLOW_primary_in_unary838);
                    primary82=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary82.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:177:4: MINUS primary
                    {
                    MINUS83=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS83);


                    pushFollow(FOLLOW_primary_in_unary845);
                    primary84=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary84.getTree());

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
                    // 177:18: -> ^( UNARY_MINUS primary )
                    {
                        // Atto.g:177:21: ^( UNARY_MINUS primary )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(UNARY_MINUS, "UNARY_MINUS")
                        , root_1);

                        adaptor.addChild(root_1, stream_primary.nextTree());

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


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:180:1: primary : ( atom )=> atom ( postfix )* -> ^( PRIMARY atom ( postfix )* ) ;
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.atom_return atom85 =null;

        AttoParser.postfix_return postfix86 =null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:181:2: ( ( atom )=> atom ( postfix )* -> ^( PRIMARY atom ( postfix )* ) )
            // Atto.g:181:4: ( atom )=> atom ( postfix )*
            {
            pushFollow(FOLLOW_atom_in_primary870);
            atom85=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom.add(atom85.getTree());

            // Atto.g:181:18: ( postfix )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case OPEN_PARENT:
                    {
                    alt26=1;
                    }
                    break;
                case OPEN_S_BRACKET:
                    {
                    alt26=1;
                    }
                    break;
                case DOT:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // Atto.g:181:18: postfix
            	    {
            	    pushFollow(FOLLOW_postfix_in_primary872);
            	    postfix86=postfix();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_postfix.add(postfix86.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // AST REWRITE
            // elements: atom, postfix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 181:27: -> ^( PRIMARY atom ( postfix )* )
            {
                // Atto.g:181:30: ^( PRIMARY atom ( postfix )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PRIMARY, "PRIMARY")
                , root_1);

                adaptor.addChild(root_1, stream_atom.nextTree());

                // Atto.g:181:45: ( postfix )*
                while ( stream_postfix.hasNext() ) {
                    adaptor.addChild(root_1, stream_postfix.nextTree());

                }
                stream_postfix.reset();

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
    // $ANTLR end "primary"


    public static class atom_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // Atto.g:184:1: atom : ( NAME | INT | STRING | BOOL | NULL | OPEN_PARENT expr CLOSE_PARENT -> expr | obj | array );
    public final AttoParser.atom_return atom() throws RecognitionException {
        AttoParser.atom_return retval = new AttoParser.atom_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME87=null;
        Token INT88=null;
        Token STRING89=null;
        Token BOOL90=null;
        Token NULL91=null;
        Token OPEN_PARENT92=null;
        Token CLOSE_PARENT94=null;
        AttoParser.expr_return expr93 =null;

        AttoParser.obj_return obj95 =null;

        AttoParser.array_return array96 =null;


        AttoTree NAME87_tree=null;
        AttoTree INT88_tree=null;
        AttoTree STRING89_tree=null;
        AttoTree BOOL90_tree=null;
        AttoTree NULL91_tree=null;
        AttoTree OPEN_PARENT92_tree=null;
        AttoTree CLOSE_PARENT94_tree=null;
        RewriteRuleTokenStream stream_OPEN_PARENT=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENT");
        RewriteRuleTokenStream stream_CLOSE_PARENT=new RewriteRuleTokenStream(adaptor,"token CLOSE_PARENT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:185:2: ( NAME | INT | STRING | BOOL | NULL | OPEN_PARENT expr CLOSE_PARENT -> expr | obj | array )
            int alt27=8;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt27=1;
                }
                break;
            case INT:
                {
                alt27=2;
                }
                break;
            case STRING:
                {
                alt27=3;
                }
                break;
            case BOOL:
                {
                alt27=4;
                }
                break;
            case NULL:
                {
                alt27=5;
                }
                break;
            case OPEN_PARENT:
                {
                alt27=6;
                }
                break;
            case OPEN_BRACKET:
                {
                alt27=7;
                }
                break;
            case OPEN_S_BRACKET:
                {
                alt27=8;
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
                    // Atto.g:185:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME87=(Token)match(input,NAME,FOLLOW_NAME_in_atom896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME87_tree = 
                    (AttoTree)adaptor.create(NAME87)
                    ;
                    adaptor.addChild(root_0, NAME87_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:186:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT88=(Token)match(input,INT,FOLLOW_INT_in_atom902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT88_tree = 
                    (AttoTree)adaptor.create(INT88)
                    ;
                    adaptor.addChild(root_0, INT88_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:187:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING89=(Token)match(input,STRING,FOLLOW_STRING_in_atom907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING89_tree = 
                    (AttoTree)adaptor.create(STRING89)
                    ;
                    adaptor.addChild(root_0, STRING89_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:188:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL90=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL90_tree = 
                    (AttoTree)adaptor.create(BOOL90)
                    ;
                    adaptor.addChild(root_0, BOOL90_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:189:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL91=(Token)match(input,NULL,FOLLOW_NULL_in_atom917); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL91_tree = 
                    (AttoTree)adaptor.create(NULL91)
                    ;
                    adaptor.addChild(root_0, NULL91_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:190:4: OPEN_PARENT expr CLOSE_PARENT
                    {
                    OPEN_PARENT92=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_atom922); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PARENT.add(OPEN_PARENT92);


                    pushFollow(FOLLOW_expr_in_atom924);
                    expr93=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr93.getTree());

                    CLOSE_PARENT94=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_atom926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PARENT.add(CLOSE_PARENT94);


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
                    // 190:34: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:191:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_atom935);
                    obj95=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj95.getTree());

                    }
                    break;
                case 8 :
                    // Atto.g:192:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_atom940);
                    array96=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array96.getTree());

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
    // $ANTLR end "atom"


    public static class postfix_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix"
    // Atto.g:195:1: postfix : ( OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT -> ^( ARGS ( expr )* ) | OPEN_S_BRACKET expr CLOSE_S_BRACKET -> ^( INDEX expr ) | DOT NAME -> ^( DOT NAME ) );
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OPEN_PARENT97=null;
        Token COMMA99=null;
        Token CLOSE_PARENT101=null;
        Token OPEN_S_BRACKET102=null;
        Token CLOSE_S_BRACKET104=null;
        Token DOT105=null;
        Token NAME106=null;
        AttoParser.expr_return expr98 =null;

        AttoParser.expr_return expr100 =null;

        AttoParser.expr_return expr103 =null;


        AttoTree OPEN_PARENT97_tree=null;
        AttoTree COMMA99_tree=null;
        AttoTree CLOSE_PARENT101_tree=null;
        AttoTree OPEN_S_BRACKET102_tree=null;
        AttoTree CLOSE_S_BRACKET104_tree=null;
        AttoTree DOT105_tree=null;
        AttoTree NAME106_tree=null;
        RewriteRuleTokenStream stream_CLOSE_S_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_S_BRACKET");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_S_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_S_BRACKET");
        RewriteRuleTokenStream stream_OPEN_PARENT=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENT");
        RewriteRuleTokenStream stream_CLOSE_PARENT=new RewriteRuleTokenStream(adaptor,"token CLOSE_PARENT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:196:2: ( OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT -> ^( ARGS ( expr )* ) | OPEN_S_BRACKET expr CLOSE_S_BRACKET -> ^( INDEX expr ) | DOT NAME -> ^( DOT NAME ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case OPEN_PARENT:
                {
                alt30=1;
                }
                break;
            case OPEN_S_BRACKET:
                {
                alt30=2;
                }
                break;
            case DOT:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // Atto.g:196:4: OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT
                    {
                    OPEN_PARENT97=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_postfix953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PARENT.add(OPEN_PARENT97);


                    // Atto.g:196:16: ( expr ( COMMA expr )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==BOOL||LA29_0==FUN||LA29_0==IF||LA29_0==INT||LA29_0==MINUS||LA29_0==NAME||(LA29_0 >= NOT && LA29_0 <= NULL)||(LA29_0 >= OPEN_BRACKET && LA29_0 <= OPEN_S_BRACKET)||LA29_0==PRINT||LA29_0==STRING||LA29_0==WHILE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Atto.g:196:17: expr ( COMMA expr )*
                            {
                            pushFollow(FOLLOW_expr_in_postfix956);
                            expr98=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr98.getTree());

                            // Atto.g:196:22: ( COMMA expr )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==COMMA) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // Atto.g:196:23: COMMA expr
                            	    {
                            	    COMMA99=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix959); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA99);


                            	    pushFollow(FOLLOW_expr_in_postfix961);
                            	    expr100=expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_expr.add(expr100.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }


                    CLOSE_PARENT101=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_postfix967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PARENT.add(CLOSE_PARENT101);


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
                    // 196:51: -> ^( ARGS ( expr )* )
                    {
                        // Atto.g:196:54: ^( ARGS ( expr )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(ARGS, "ARGS")
                        , root_1);

                        // Atto.g:196:61: ( expr )*
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
                    // Atto.g:197:4: OPEN_S_BRACKET expr CLOSE_S_BRACKET
                    {
                    OPEN_S_BRACKET102=(Token)match(input,OPEN_S_BRACKET,FOLLOW_OPEN_S_BRACKET_in_postfix981); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_S_BRACKET.add(OPEN_S_BRACKET102);


                    pushFollow(FOLLOW_expr_in_postfix983);
                    expr103=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr103.getTree());

                    CLOSE_S_BRACKET104=(Token)match(input,CLOSE_S_BRACKET,FOLLOW_CLOSE_S_BRACKET_in_postfix985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_S_BRACKET.add(CLOSE_S_BRACKET104);


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
                    // 197:40: -> ^( INDEX expr )
                    {
                        // Atto.g:197:43: ^( INDEX expr )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(INDEX, "INDEX")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:198:4: DOT NAME
                    {
                    DOT105=(Token)match(input,DOT,FOLLOW_DOT_in_postfix998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT105);


                    NAME106=(Token)match(input,NAME,FOLLOW_NAME_in_postfix1000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAME.add(NAME106);


                    // AST REWRITE
                    // elements: NAME, DOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 198:13: -> ^( DOT NAME )
                    {
                        // Atto.g:198:16: ^( DOT NAME )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        stream_DOT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NAME.nextNode()
                        );

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
    // $ANTLR end "postfix"


    public static class qname_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qname"
    // Atto.g:201:1: qname : NAME ( DOT ^ NAME )* ;
    public final AttoParser.qname_return qname() throws RecognitionException {
        AttoParser.qname_return retval = new AttoParser.qname_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME107=null;
        Token DOT108=null;
        Token NAME109=null;

        AttoTree NAME107_tree=null;
        AttoTree DOT108_tree=null;
        AttoTree NAME109_tree=null;

        try {
            // Atto.g:202:2: ( NAME ( DOT ^ NAME )* )
            // Atto.g:202:4: NAME ( DOT ^ NAME )*
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME107=(Token)match(input,NAME,FOLLOW_NAME_in_qname1020); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME107_tree = 
            (AttoTree)adaptor.create(NAME107)
            ;
            adaptor.addChild(root_0, NAME107_tree);
            }

            // Atto.g:202:9: ( DOT ^ NAME )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==DOT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Atto.g:202:10: DOT ^ NAME
            	    {
            	    DOT108=(Token)match(input,DOT,FOLLOW_DOT_in_qname1023); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT108_tree = 
            	    (AttoTree)adaptor.create(DOT108)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(DOT108_tree, root_0);
            	    }

            	    NAME109=(Token)match(input,NAME,FOLLOW_NAME_in_qname1026); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME109_tree = 
            	    (AttoTree)adaptor.create(NAME109)
            	    ;
            	    adaptor.addChild(root_0, NAME109_tree);
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
    // $ANTLR end "qname"


    public static class vardef_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vardef"
    // Atto.g:205:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME110=null;

        AttoTree NAME110_tree=null;

        try {
            // Atto.g:206:2: ( NAME )
            // Atto.g:206:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME110=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1039); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME110_tree = 
            (AttoTree)adaptor.create(NAME110)
            ;
            adaptor.addChild(root_0, NAME110_tree);
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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\2\uffff\1\3\6\uffff\1\3";
    static final String DFA4_minS =
        "\1\13\1\uffff\1\4\4\uffff\1\54\1\uffff\1\4";
    static final String DFA4_maxS =
        "\1\100\1\uffff\1\102\4\uffff\1\54\1\uffff\1\102";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\2\1\uffff";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\17\uffff\1\1\3\uffff\1\4\2\uffff\1\3\6\uffff\1\3\2\uffff"+
            "\1\2\2\uffff\2\3\1\uffff\3\3\4\uffff\1\6\3\uffff\1\3\2\uffff"+
            "\1\5",
            "",
            "\1\3\3\uffff\1\10\2\uffff\4\3\1\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\7\3\3\1\uffff\3\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3"+
            "\3\uffff\11\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\3\uffff\1"+
            "\3\2\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "\1\11",
            "",
            "\1\3\3\uffff\1\10\2\uffff\4\3\1\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\7\3\3\1\uffff\3\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3"+
            "\3\uffff\11\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\3\uffff\1"+
            "\3\2\uffff\1\3\1\uffff\1\3"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "81:1: expr : ( fun | assign | or | if_ | while_ | print );";
        }
    }
 

    public static final BitSet FOLLOW_stmt_in_root143 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_EOF_in_root146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt167 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block191 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INDENT_in_block193 = new BitSet(new long[]{0x221D920488080800L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_block195 = new BitSet(new long[]{0x221D920488080800L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEDENT_in_block198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_expr243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print254 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_print256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_obj276 = new BitSet(new long[]{0x0000100000001000L});
    public static final BitSet FOLLOW_pair_in_obj279 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_COMMA_in_obj282 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pair_in_obj284 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_COMMA_in_obj288 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_obj293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair313 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COLON_in_pair315 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_pair318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_S_BRACKET_in_array330 = new BitSet(new long[]{0x221D920488004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array333 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_COMMA_in_array336 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array338 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_COMMA_in_array342 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_S_BRACKET_in_array347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_368 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_372 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_if_384 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_elif_in_if_386 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_else__in_if_389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_if_413 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_417 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_online_elif_in_if_419 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_online_else_in_if_422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif458 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_elif460 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_block_in_elif462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_483 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_block_in_else_485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_online_elif505 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_online_elif507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_online_elif509 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_online_elif511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_online_else533 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_online_else535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_556 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_560 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_while_572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_while_591 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_assign624 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign626 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_assign629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun640 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_paramsdef_in_fun642 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_fun644 = new BitSet(new long[]{0x221DD20488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_fun646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef668 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef671 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef673 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_expr_in_body696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or712 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_OR_in_or715 = new BitSet(new long[]{0x201D920400000800L});
    public static final BitSet FOLLOW_and_in_or718 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rel_in_and731 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and734 = new BitSet(new long[]{0x201D920400000800L});
    public static final BitSet FOLLOW_rel_in_and737 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel750 = new BitSet(new long[]{0x0000211032000002L});
    public static final BitSet FOLLOW_set_in_rel753 = new BitSet(new long[]{0x201D920400000800L});
    public static final BitSet FOLLOW_add_in_rel768 = new BitSet(new long[]{0x0000211032000002L});
    public static final BitSet FOLLOW_mul_in_add781 = new BitSet(new long[]{0x0080020000000002L});
    public static final BitSet FOLLOW_set_in_add784 = new BitSet(new long[]{0x201D920400000800L});
    public static final BitSet FOLLOW_mul_in_add791 = new BitSet(new long[]{0x0080020000000002L});
    public static final BitSet FOLLOW_unary_in_mul804 = new BitSet(new long[]{0x00000C0000200002L});
    public static final BitSet FOLLOW_set_in_mul807 = new BitSet(new long[]{0x201D920400000800L});
    public static final BitSet FOLLOW_unary_in_mul816 = new BitSet(new long[]{0x00000C0000200002L});
    public static final BitSet FOLLOW_primary_in_unary830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary835 = new BitSet(new long[]{0x201D100400000800L});
    public static final BitSet FOLLOW_primary_in_unary838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary843 = new BitSet(new long[]{0x201D100400000800L});
    public static final BitSet FOLLOW_primary_in_unary845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_primary870 = new BitSet(new long[]{0x0018000000400002L});
    public static final BitSet FOLLOW_postfix_in_primary872 = new BitSet(new long[]{0x0018000000400002L});
    public static final BitSet FOLLOW_NAME_in_atom896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_atom912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_atom922 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom924 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_atom926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_atom935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_atom940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_postfix953 = new BitSet(new long[]{0x221D920488002800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix956 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_COMMA_in_postfix959 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix961 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_postfix967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_S_BRACKET_in_postfix981 = new BitSet(new long[]{0x221D920488000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfix983 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_S_BRACKET_in_postfix985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix998 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_postfix1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_qname1020 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_qname1023 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_qname1026 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_NAME_in_vardef1039 = new BitSet(new long[]{0x0000000000000002L});

}