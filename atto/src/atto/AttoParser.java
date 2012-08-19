// $ANTLR 3.4 Atto.g 2012-08-20 01:05:34

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "CLOSE_BRACKET", "CLOSE_PARENT", "CLOSE_S_BRACKET", "COLON", "COMMA", "COMMENT", "CONSTANT", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "FLOAT", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INT", "INTEGER", "LE", "LEADING_WS", "LETTER", "LOWER", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OPEN_BRACKET", "OPEN_PARENT", "OPEN_S_BRACKET", "OR", "PARAMS", "PLUS", "PRINT", "SEMICOLON", "SPACE", "STMT", "STRING", "UPPER", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ARRAY=5;
    public static final int ARROW=6;
    public static final int ASSIGN=7;
    public static final int AT=8;
    public static final int BLOCK=9;
    public static final int BOOL=10;
    public static final int CALL=11;
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
    public static final int INT=33;
    public static final int INTEGER=34;
    public static final int LE=35;
    public static final int LEADING_WS=36;
    public static final int LETTER=37;
    public static final int LOWER=38;
    public static final int LT=39;
    public static final int MINUS=40;
    public static final int MOD=41;
    public static final int MUL=42;
    public static final int NAME=43;
    public static final int NE=44;
    public static final int NEWLINE=45;
    public static final int NOT=46;
    public static final int NULL=47;
    public static final int OBJ=48;
    public static final int OPEN_BRACKET=49;
    public static final int OPEN_PARENT=50;
    public static final int OPEN_S_BRACKET=51;
    public static final int OR=52;
    public static final int PARAMS=53;
    public static final int PLUS=54;
    public static final int PRINT=55;
    public static final int SEMICOLON=56;
    public static final int SPACE=57;
    public static final int STMT=58;
    public static final int STRING=59;
    public static final int UPPER=60;
    public static final int WHILE=61;
    public static final int WS=62;

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


    	Scope scope;
    	
    	public AttoParser(TokenStream input, Scope scope) {
    		this(input);
    		this.scope = scope;
    	}


    public static class root_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "root"
    // Atto.g:74:1: root : ( stmt )* EOF -> ^( BLOCK ( stmt )* ) ;
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
            // Atto.g:75:2: ( ( stmt )* EOF -> ^( BLOCK ( stmt )* ) )
            // Atto.g:75:4: ( stmt )* EOF
            {
            // Atto.g:75:4: ( stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL||LA1_0==FUN||LA1_0==IF||LA1_0==INT||LA1_0==NAME||(LA1_0 >= NOT && LA1_0 <= NULL)||(LA1_0 >= OPEN_BRACKET && LA1_0 <= OPEN_S_BRACKET)||LA1_0==PRINT||LA1_0==STRING||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Atto.g:75:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_root131);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root134); if (state.failed) return retval; 
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
            // 75:14: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:75:17: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:75:25: ( stmt )*
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
    // Atto.g:78:1: stmt : expr ( NEWLINE )? -> ^( STMT expr ) ;
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
            // Atto.g:79:2: ( expr ( NEWLINE )? -> ^( STMT expr ) )
            // Atto.g:79:4: expr ( NEWLINE )?
            {
            pushFollow(FOLLOW_expr_in_stmt155);
            expr3=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr3.getTree());

            // Atto.g:79:9: ( NEWLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Atto.g:79:9: NEWLINE
                    {
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt157); if (state.failed) return retval; 
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
            // 79:18: -> ^( STMT expr )
            {
                // Atto.g:79:21: ^( STMT expr )
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
    // Atto.g:82:1: block : NEWLINE INDENT ( stmt )* DEDENT -> ^( BLOCK ( stmt )* ) ;
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
            // Atto.g:83:2: ( NEWLINE INDENT ( stmt )* DEDENT -> ^( BLOCK ( stmt )* ) )
            // Atto.g:83:4: NEWLINE INDENT ( stmt )* DEDENT
            {
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            INDENT6=(Token)match(input,INDENT,FOLLOW_INDENT_in_block181); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT6);


            // Atto.g:83:19: ( stmt )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BOOL||LA3_0==FUN||LA3_0==IF||LA3_0==INT||LA3_0==NAME||(LA3_0 >= NOT && LA3_0 <= NULL)||(LA3_0 >= OPEN_BRACKET && LA3_0 <= OPEN_S_BRACKET)||LA3_0==PRINT||LA3_0==STRING||LA3_0==WHILE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Atto.g:83:19: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block183);
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


            DEDENT8=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block186); if (state.failed) return retval; 
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
            // 83:32: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:83:35: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:83:43: ( stmt )*
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
    // Atto.g:86:1: expr : ( fun | assign | or | if_ | while_ | obj | array | print );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.fun_return fun9 =null;

        AttoParser.assign_return assign10 =null;

        AttoParser.or_return or11 =null;

        AttoParser.if__return if_12 =null;

        AttoParser.while__return while_13 =null;

        AttoParser.obj_return obj14 =null;

        AttoParser.array_return array15 =null;

        AttoParser.print_return print16 =null;



        try {
            // Atto.g:87:2: ( fun | assign | or | if_ | while_ | obj | array | print )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Atto.g:87:4: fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_expr206);
                    fun9=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun9.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:88:4: assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr211);
                    assign10=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign10.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:89:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr216);
                    or11=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or11.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:90:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr221);
                    if_12=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_12.getTree());

                    }
                    break;
                case 5 :
                    // Atto.g:91:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr226);
                    while_13=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_13.getTree());

                    }
                    break;
                case 6 :
                    // Atto.g:92:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_expr231);
                    obj14=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj14.getTree());

                    }
                    break;
                case 7 :
                    // Atto.g:93:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_expr236);
                    array15=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array15.getTree());

                    }
                    break;
                case 8 :
                    // Atto.g:94:4: print
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_print_in_expr241);
                    print16=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print16.getTree());

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
    // Atto.g:97:1: print : 'print' expr -> ^( PRINT expr ) ;
    public final AttoParser.print_return print() throws RecognitionException {
        AttoParser.print_return retval = new AttoParser.print_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal17=null;
        AttoParser.expr_return expr18 =null;


        AttoTree string_literal17_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:98:2: ( 'print' expr -> ^( PRINT expr ) )
            // Atto.g:98:4: 'print' expr
            {
            string_literal17=(Token)match(input,PRINT,FOLLOW_PRINT_in_print252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PRINT.add(string_literal17);


            pushFollow(FOLLOW_expr_in_print254);
            expr18=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr18.getTree());

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
            // 98:17: -> ^( PRINT expr )
            {
                // Atto.g:98:20: ^( PRINT expr )
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
    // Atto.g:101:1: obj : OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OPEN_BRACKET19=null;
        Token COMMA21=null;
        Token COMMA23=null;
        Token CLOSE_BRACKET24=null;
        AttoParser.pair_return pair20 =null;

        AttoParser.pair_return pair22 =null;


        AttoTree OPEN_BRACKET19_tree=null;
        AttoTree COMMA21_tree=null;
        AttoTree COMMA23_tree=null;
        AttoTree CLOSE_BRACKET24_tree=null;
        RewriteRuleTokenStream stream_OPEN_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CLOSE_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACKET");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:102:2: ( OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET -> ^( OBJ ( pair )* ) )
            // Atto.g:102:4: OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET
            {
            OPEN_BRACKET19=(Token)match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_obj274); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACKET.add(OPEN_BRACKET19);


            // Atto.g:102:17: ( pair ( COMMA pair )* ( COMMA )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NAME) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Atto.g:102:18: pair ( COMMA pair )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_pair_in_obj277);
                    pair20=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair20.getTree());

                    // Atto.g:102:23: ( COMMA pair )*
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
                    	    // Atto.g:102:24: COMMA pair
                    	    {
                    	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj280); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA21);


                    	    pushFollow(FOLLOW_pair_in_obj282);
                    	    pair22=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair22.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // Atto.g:102:37: ( COMMA )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COMMA) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Atto.g:102:37: COMMA
                            {
                            COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj286); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA23);


                            }
                            break;

                    }


                    }
                    break;

            }


            CLOSE_BRACKET24=(Token)match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_obj291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACKET.add(CLOSE_BRACKET24);


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
            // 102:60: -> ^( OBJ ( pair )* )
            {
                // Atto.g:102:63: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:102:69: ( pair )*
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
    // Atto.g:105:1: pair : NAME COLON ^ expr ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME25=null;
        Token COLON26=null;
        AttoParser.expr_return expr27 =null;


        AttoTree NAME25_tree=null;
        AttoTree COLON26_tree=null;

        try {
            // Atto.g:106:2: ( NAME COLON ^ expr )
            // Atto.g:106:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME25=(Token)match(input,NAME,FOLLOW_NAME_in_pair311); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME25_tree = 
            (AttoTree)adaptor.create(NAME25)
            ;
            adaptor.addChild(root_0, NAME25_tree);
            }

            COLON26=(Token)match(input,COLON,FOLLOW_COLON_in_pair313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON26_tree = 
            (AttoTree)adaptor.create(COLON26)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON26_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair316);
            expr27=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr27.getTree());

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
    // Atto.g:109:1: array : OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OPEN_S_BRACKET28=null;
        Token COMMA30=null;
        Token COMMA32=null;
        Token CLOSE_S_BRACKET33=null;
        AttoParser.expr_return expr29 =null;

        AttoParser.expr_return expr31 =null;


        AttoTree OPEN_S_BRACKET28_tree=null;
        AttoTree COMMA30_tree=null;
        AttoTree COMMA32_tree=null;
        AttoTree CLOSE_S_BRACKET33_tree=null;
        RewriteRuleTokenStream stream_CLOSE_S_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_S_BRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_S_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_S_BRACKET");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:110:2: ( OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET -> ^( ARRAY ( expr )* ) )
            // Atto.g:110:4: OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET
            {
            OPEN_S_BRACKET28=(Token)match(input,OPEN_S_BRACKET,FOLLOW_OPEN_S_BRACKET_in_array328); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_S_BRACKET.add(OPEN_S_BRACKET28);


            // Atto.g:110:19: ( expr ( COMMA expr )* ( COMMA )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BOOL||LA10_0==FUN||LA10_0==IF||LA10_0==INT||LA10_0==NAME||(LA10_0 >= NOT && LA10_0 <= NULL)||(LA10_0 >= OPEN_BRACKET && LA10_0 <= OPEN_S_BRACKET)||LA10_0==PRINT||LA10_0==STRING||LA10_0==WHILE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Atto.g:110:20: expr ( COMMA expr )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_array331);
                    expr29=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());

                    // Atto.g:110:25: ( COMMA expr )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==BOOL||LA8_1==FUN||LA8_1==IF||LA8_1==INT||LA8_1==NAME||(LA8_1 >= NOT && LA8_1 <= NULL)||(LA8_1 >= OPEN_BRACKET && LA8_1 <= OPEN_S_BRACKET)||LA8_1==PRINT||LA8_1==STRING||LA8_1==WHILE) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Atto.g:110:26: COMMA expr
                    	    {
                    	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_array334); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);


                    	    pushFollow(FOLLOW_expr_in_array336);
                    	    expr31=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // Atto.g:110:39: ( COMMA )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==COMMA) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Atto.g:110:39: COMMA
                            {
                            COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_array340); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA32);


                            }
                            break;

                    }


                    }
                    break;

            }


            CLOSE_S_BRACKET33=(Token)match(input,CLOSE_S_BRACKET,FOLLOW_CLOSE_S_BRACKET_in_array345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_S_BRACKET.add(CLOSE_S_BRACKET33);


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
            // 110:64: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:110:67: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:110:75: ( expr )*
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
    // Atto.g:113:1: if_ : 'if' expr block ( elif )* ( else_ )? -> ^( IF expr block ( elif )* ( else_ )? ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal34=null;
        AttoParser.expr_return expr35 =null;

        AttoParser.block_return block36 =null;

        AttoParser.elif_return elif37 =null;

        AttoParser.else__return else_38 =null;


        AttoTree string_literal34_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:114:2: ( 'if' expr block ( elif )* ( else_ )? -> ^( IF expr block ( elif )* ( else_ )? ) )
            // Atto.g:114:4: 'if' expr block ( elif )* ( else_ )?
            {
            string_literal34=(Token)match(input,IF,FOLLOW_IF_in_if_366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal34);


            pushFollow(FOLLOW_expr_in_if_368);
            expr35=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr35.getTree());

            pushFollow(FOLLOW_block_in_if_370);
            block36=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block36.getTree());

            // Atto.g:114:20: ( elif )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ELIF) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Atto.g:114:20: elif
            	    {
            	    pushFollow(FOLLOW_elif_in_if_372);
            	    elif37=elif();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elif.add(elif37.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // Atto.g:114:26: ( else_ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ELSE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Atto.g:114:26: else_
                    {
                    pushFollow(FOLLOW_else__in_if_375);
                    else_38=else_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_else_.add(else_38.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: else_, block, expr, elif
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 114:33: -> ^( IF expr block ( elif )* ( else_ )? )
            {
                // Atto.g:114:36: ^( IF expr block ( elif )* ( else_ )? )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(IF, "IF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                // Atto.g:114:52: ( elif )*
                while ( stream_elif.hasNext() ) {
                    adaptor.addChild(root_1, stream_elif.nextTree());

                }
                stream_elif.reset();

                // Atto.g:114:58: ( else_ )?
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
    // Atto.g:117:1: elif : 'elif' expr block -> ^( ELIF expr block ) ;
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
            // Atto.g:118:2: ( 'elif' expr block -> ^( ELIF expr block ) )
            // Atto.g:118:4: 'elif' expr block
            {
            string_literal39=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal39);


            pushFollow(FOLLOW_expr_in_elif406);
            expr40=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr40.getTree());

            pushFollow(FOLLOW_block_in_elif408);
            block41=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block41.getTree());

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
            // 118:22: -> ^( ELIF expr block )
            {
                // Atto.g:118:25: ^( ELIF expr block )
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
    // Atto.g:121:1: else_ : 'else' block -> ^( ELSE block ) ;
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
            // Atto.g:122:2: ( 'else' block -> ^( ELSE block ) )
            // Atto.g:122:4: 'else' block
            {
            string_literal42=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_430); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal42);


            pushFollow(FOLLOW_block_in_else_432);
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
            // 122:17: -> ^( ELSE block )
            {
                // Atto.g:122:20: ^( ELSE block )
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
    // Atto.g:125:1: while_ : 'while' expr block -> ^( WHILE expr block ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal44=null;
        AttoParser.expr_return expr45 =null;

        AttoParser.block_return block46 =null;


        AttoTree string_literal44_tree=null;
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:126:2: ( 'while' expr block -> ^( WHILE expr block ) )
            // Atto.g:126:4: 'while' expr block
            {
            string_literal44=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal44);


            pushFollow(FOLLOW_expr_in_while_454);
            expr45=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr45.getTree());

            pushFollow(FOLLOW_block_in_while_456);
            block46=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block46.getTree());

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
            // 126:23: -> ^( WHILE expr block )
            {
                // Atto.g:126:26: ^( WHILE expr block )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(WHILE, "WHILE")
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
    // $ANTLR end "while_"


    public static class assign_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // Atto.g:129:1: assign : qname ASSIGN ^ expr ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN48=null;
        AttoParser.qname_return qname47 =null;

        AttoParser.expr_return expr49 =null;


        AttoTree ASSIGN48_tree=null;

        try {
            // Atto.g:130:2: ( qname ASSIGN ^ expr )
            // Atto.g:130:4: qname ASSIGN ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_qname_in_assign478);
            qname47=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qname47.getTree());

            ASSIGN48=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign480); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN48_tree = 
            (AttoTree)adaptor.create(ASSIGN48)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ASSIGN48_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_assign483);
            expr49=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr49.getTree());

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
    // Atto.g:133:1: fun : 'fun' ( vardef ( COMMA vardef )* )? ARROW ( expr -> ^( FUN ( vardef )* expr ) | block -> ^( FUN ( vardef )* block ) ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal50=null;
        Token COMMA52=null;
        Token ARROW54=null;
        AttoParser.vardef_return vardef51 =null;

        AttoParser.vardef_return vardef53 =null;

        AttoParser.expr_return expr55 =null;

        AttoParser.block_return block56 =null;


        AttoTree string_literal50_tree=null;
        AttoTree COMMA52_tree=null;
        AttoTree ARROW54_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:135:2: ( 'fun' ( vardef ( COMMA vardef )* )? ARROW ( expr -> ^( FUN ( vardef )* expr ) | block -> ^( FUN ( vardef )* block ) ) )
            // Atto.g:135:4: 'fun' ( vardef ( COMMA vardef )* )? ARROW ( expr -> ^( FUN ( vardef )* expr ) | block -> ^( FUN ( vardef )* block ) )
            {
            string_literal50=(Token)match(input,FUN,FOLLOW_FUN_in_fun499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUN.add(string_literal50);


            if ( state.backtracking==0 ) {
            	  	scope = new Scope(scope); // push function args scope
            	  }

            // Atto.g:139:4: ( vardef ( COMMA vardef )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAME) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Atto.g:139:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_fun511);
                    vardef51=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef51.getTree());

                    // Atto.g:139:12: ( COMMA vardef )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Atto.g:139:13: COMMA vardef
                    	    {
                    	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_fun514); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA52);


                    	    pushFollow(FOLLOW_vardef_in_fun516);
                    	    vardef53=vardef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_vardef.add(vardef53.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            ARROW54=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW54);


            if ( state.backtracking==0 ) {
            	  	scope = new Scope(scope); // push function body scope
            	  }

            // Atto.g:143:4: ( expr -> ^( FUN ( vardef )* expr ) | block -> ^( FUN ( vardef )* block ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==BOOL||LA15_0==FUN||LA15_0==IF||LA15_0==INT||LA15_0==NAME||(LA15_0 >= NOT && LA15_0 <= NULL)||(LA15_0 >= OPEN_BRACKET && LA15_0 <= OPEN_S_BRACKET)||LA15_0==PRINT||LA15_0==STRING||LA15_0==WHILE) ) {
                alt15=1;
            }
            else if ( (LA15_0==NEWLINE) ) {
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
                    // Atto.g:143:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_fun534);
                    expr55=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr55.getTree());

                    // AST REWRITE
                    // elements: vardef, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 143:10: -> ^( FUN ( vardef )* expr )
                    {
                        // Atto.g:143:13: ^( FUN ( vardef )* expr )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(FUN, "FUN")
                        , root_1);

                        // Atto.g:143:19: ( vardef )*
                        while ( stream_vardef.hasNext() ) {
                            adaptor.addChild(root_1, stream_vardef.nextTree());

                        }
                        stream_vardef.reset();

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:143:35: block
                    {
                    pushFollow(FOLLOW_block_in_fun549);
                    block56=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block56.getTree());

                    // AST REWRITE
                    // elements: vardef, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 143:41: -> ^( FUN ( vardef )* block )
                    {
                        // Atto.g:143:44: ^( FUN ( vardef )* block )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(FUN, "FUN")
                        , root_1);

                        // Atto.g:143:50: ( vardef )*
                        while ( stream_vardef.hasNext() ) {
                            adaptor.addChild(root_1, stream_vardef.nextTree());

                        }
                        stream_vardef.reset();

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            	  	scope = scope.getEnclosingScope(); // pop function body scope
            	  	scope = scope.getEnclosingScope(); // pop function args scope
            	  }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (AttoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { ((AttoTree)retval.tree).scope = scope; }
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


    public static class or_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or"
    // Atto.g:150:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR58=null;
        AttoParser.and_return and57 =null;

        AttoParser.and_return and59 =null;


        AttoTree OR58_tree=null;

        try {
            // Atto.g:151:2: ( and ( OR ^ and )* )
            // Atto.g:151:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or578);
            and57=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and57.getTree());

            // Atto.g:151:8: ( OR ^ and )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Atto.g:151:9: OR ^ and
            	    {
            	    OR58=(Token)match(input,OR,FOLLOW_OR_in_or581); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR58_tree = 
            	    (AttoTree)adaptor.create(OR58)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR58_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or584);
            	    and59=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and59.getTree());

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
    // Atto.g:154:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND61=null;
        AttoParser.rel_return rel60 =null;

        AttoParser.rel_return rel62 =null;


        AttoTree AND61_tree=null;

        try {
            // Atto.g:155:2: ( rel ( AND ^ rel )* )
            // Atto.g:155:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and597);
            rel60=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel60.getTree());

            // Atto.g:155:8: ( AND ^ rel )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Atto.g:155:9: AND ^ rel
            	    {
            	    AND61=(Token)match(input,AND,FOLLOW_AND_in_and600); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND61_tree = 
            	    (AttoTree)adaptor.create(AND61)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND61_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and603);
            	    rel62=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel62.getTree());

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
    // Atto.g:158:1: rel : add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set64=null;
        AttoParser.add_return add63 =null;

        AttoParser.add_return add65 =null;


        AttoTree set64_tree=null;

        try {
            // Atto.g:159:2: ( add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* )
            // Atto.g:159:4: add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel616);
            add63=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add63.getTree());

            // Atto.g:159:8: ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==EQ||(LA18_0 >= GE && LA18_0 <= GT)||LA18_0==LE||LA18_0==LT||LA18_0==NE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Atto.g:159:9: ( EQ | NE | LE | GE | LT | GT ) ^ add
            	    {
            	    set64=(Token)input.LT(1);

            	    set64=(Token)input.LT(1);

            	    if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set64)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_rel634);
            	    add65=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add65.getTree());

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
    // Atto.g:162:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set67=null;
        AttoParser.mul_return mul66 =null;

        AttoParser.mul_return mul68 =null;


        AttoTree set67_tree=null;

        try {
            // Atto.g:163:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:163:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add647);
            mul66=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul66.getTree());

            // Atto.g:163:8: ( ( PLUS | MINUS ) ^ mul )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==MINUS||LA19_0==PLUS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Atto.g:163:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set67=(Token)input.LT(1);

            	    set67=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set67)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add657);
            	    mul68=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul68.getTree());

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
    // Atto.g:166:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set70=null;
        AttoParser.unary_return unary69 =null;

        AttoParser.unary_return unary71 =null;


        AttoTree set70_tree=null;

        try {
            // Atto.g:167:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:167:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul670);
            unary69=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary69.getTree());

            // Atto.g:167:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||(LA20_0 >= MOD && LA20_0 <= MUL)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Atto.g:167:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set70=(Token)input.LT(1);

            	    set70=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set70)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mul682);
            	    unary71=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary71.getTree());

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
    // Atto.g:170:1: unary : ( atom | NOT ^ atom );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT73=null;
        AttoParser.atom_return atom72 =null;

        AttoParser.atom_return atom74 =null;


        AttoTree NOT73_tree=null;

        try {
            // Atto.g:171:2: ( atom | NOT ^ atom )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==BOOL||LA21_0==INT||LA21_0==NAME||LA21_0==NULL||LA21_0==OPEN_PARENT||LA21_0==STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==NOT) ) {
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
                    // Atto.g:171:4: atom
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_unary696);
                    atom72=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom72.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:172:4: NOT ^ atom
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT73=(Token)match(input,NOT,FOLLOW_NOT_in_unary701); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT73_tree = 
                    (AttoTree)adaptor.create(NOT73)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT73_tree, root_0);
                    }

                    pushFollow(FOLLOW_atom_in_unary704);
                    atom74=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom74.getTree());

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


    public static class atom_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // Atto.g:175:1: atom : ( ( call )=> call | qname | INT | STRING | BOOL | NULL | OPEN_PARENT expr CLOSE_PARENT -> expr );
    public final AttoParser.atom_return atom() throws RecognitionException {
        AttoParser.atom_return retval = new AttoParser.atom_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token INT77=null;
        Token STRING78=null;
        Token BOOL79=null;
        Token NULL80=null;
        Token OPEN_PARENT81=null;
        Token CLOSE_PARENT83=null;
        AttoParser.call_return call75 =null;

        AttoParser.qname_return qname76 =null;

        AttoParser.expr_return expr82 =null;


        AttoTree INT77_tree=null;
        AttoTree STRING78_tree=null;
        AttoTree BOOL79_tree=null;
        AttoTree NULL80_tree=null;
        AttoTree OPEN_PARENT81_tree=null;
        AttoTree CLOSE_PARENT83_tree=null;
        RewriteRuleTokenStream stream_OPEN_PARENT=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENT");
        RewriteRuleTokenStream stream_CLOSE_PARENT=new RewriteRuleTokenStream(adaptor,"token CLOSE_PARENT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:176:2: ( ( call )=> call | qname | INT | STRING | BOOL | NULL | OPEN_PARENT expr CLOSE_PARENT -> expr )
            int alt22=7;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA22_1 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt22=3;
                }
                break;
            case STRING:
                {
                alt22=4;
                }
                break;
            case BOOL:
                {
                alt22=5;
                }
                break;
            case NULL:
                {
                alt22=6;
                }
                break;
            case OPEN_PARENT:
                {
                alt22=7;
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
                    // Atto.g:176:4: ( call )=> call
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_call_in_atom721);
                    call75=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call75.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:177:4: qname
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_qname_in_atom726);
                    qname76=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qname76.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:178:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT77=(Token)match(input,INT,FOLLOW_INT_in_atom732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT77_tree = 
                    (AttoTree)adaptor.create(INT77)
                    ;
                    adaptor.addChild(root_0, INT77_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:179:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING78=(Token)match(input,STRING,FOLLOW_STRING_in_atom737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING78_tree = 
                    (AttoTree)adaptor.create(STRING78)
                    ;
                    adaptor.addChild(root_0, STRING78_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:180:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL79=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom742); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL79_tree = 
                    (AttoTree)adaptor.create(BOOL79)
                    ;
                    adaptor.addChild(root_0, BOOL79_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:181:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL80=(Token)match(input,NULL,FOLLOW_NULL_in_atom747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL80_tree = 
                    (AttoTree)adaptor.create(NULL80)
                    ;
                    adaptor.addChild(root_0, NULL80_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:182:4: OPEN_PARENT expr CLOSE_PARENT
                    {
                    OPEN_PARENT81=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_atom752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PARENT.add(OPEN_PARENT81);


                    pushFollow(FOLLOW_expr_in_atom754);
                    expr82=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr82.getTree());

                    CLOSE_PARENT83=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_atom756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PARENT.add(CLOSE_PARENT83);


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
                    // 182:34: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

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
    // $ANTLR end "atom"


    public static class qname_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qname"
    // Atto.g:185:1: qname : NAME ( DOT ^ NAME )* ;
    public final AttoParser.qname_return qname() throws RecognitionException {
        AttoParser.qname_return retval = new AttoParser.qname_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME84=null;
        Token DOT85=null;
        Token NAME86=null;

        AttoTree NAME84_tree=null;
        AttoTree DOT85_tree=null;
        AttoTree NAME86_tree=null;

        try {
            // Atto.g:186:2: ( NAME ( DOT ^ NAME )* )
            // Atto.g:186:4: NAME ( DOT ^ NAME )*
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME84=(Token)match(input,NAME,FOLLOW_NAME_in_qname772); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME84_tree = 
            (AttoTree)adaptor.create(NAME84)
            ;
            adaptor.addChild(root_0, NAME84_tree);
            }

            // Atto.g:186:9: ( DOT ^ NAME )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==DOT) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Atto.g:186:10: DOT ^ NAME
            	    {
            	    DOT85=(Token)match(input,DOT,FOLLOW_DOT_in_qname775); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT85_tree = 
            	    (AttoTree)adaptor.create(DOT85)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(DOT85_tree, root_0);
            	    }

            	    NAME86=(Token)match(input,NAME,FOLLOW_NAME_in_qname778); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME86_tree = 
            	    (AttoTree)adaptor.create(NAME86)
            	    ;
            	    adaptor.addChild(root_0, NAME86_tree);
            	    }

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
    // $ANTLR end "qname"


    public static class vardef_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vardef"
    // Atto.g:189:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME87=null;

        AttoTree NAME87_tree=null;

        try {
            // Atto.g:190:2: ( NAME )
            // Atto.g:190:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME87=(Token)match(input,NAME,FOLLOW_NAME_in_vardef791); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME87_tree = 
            (AttoTree)adaptor.create(NAME87)
            ;
            adaptor.addChild(root_0, NAME87_tree);
            }

            if ( state.backtracking==0 ) {
            	  	NAME87_tree.scope = scope;
            	  	Symbol symbol = new Symbol((NAME87!=null?NAME87.getText():null));
            	  	scope.define(symbol);
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


    public static class call_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call"
    // Atto.g:198:1: call : qname OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT -> ^( CALL qname ( expr )* ) ;
    public final AttoParser.call_return call() throws RecognitionException {
        AttoParser.call_return retval = new AttoParser.call_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OPEN_PARENT89=null;
        Token COMMA91=null;
        Token CLOSE_PARENT93=null;
        AttoParser.qname_return qname88 =null;

        AttoParser.expr_return expr90 =null;

        AttoParser.expr_return expr92 =null;


        AttoTree OPEN_PARENT89_tree=null;
        AttoTree COMMA91_tree=null;
        AttoTree CLOSE_PARENT93_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_PARENT=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENT");
        RewriteRuleTokenStream stream_CLOSE_PARENT=new RewriteRuleTokenStream(adaptor,"token CLOSE_PARENT");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:199:2: ( qname OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT -> ^( CALL qname ( expr )* ) )
            // Atto.g:199:4: qname OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT
            {
            pushFollow(FOLLOW_qname_in_call809);
            qname88=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname88.getTree());

            OPEN_PARENT89=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_call811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_PARENT.add(OPEN_PARENT89);


            // Atto.g:199:22: ( expr ( COMMA expr )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BOOL||LA25_0==FUN||LA25_0==IF||LA25_0==INT||LA25_0==NAME||(LA25_0 >= NOT && LA25_0 <= NULL)||(LA25_0 >= OPEN_BRACKET && LA25_0 <= OPEN_S_BRACKET)||LA25_0==PRINT||LA25_0==STRING||LA25_0==WHILE) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Atto.g:199:23: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_call814);
                    expr90=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr90.getTree());

                    // Atto.g:199:28: ( COMMA expr )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==COMMA) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Atto.g:199:29: COMMA expr
                    	    {
                    	    COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_call817); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA91);


                    	    pushFollow(FOLLOW_expr_in_call819);
                    	    expr92=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr92.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            CLOSE_PARENT93=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_call825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_PARENT.add(CLOSE_PARENT93);


            // AST REWRITE
            // elements: expr, qname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 199:58: -> ^( CALL qname ( expr )* )
            {
                // Atto.g:199:61: ^( CALL qname ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                // Atto.g:199:74: ( expr )*
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
    // $ANTLR end "call"

    // $ANTLR start synpred1_Atto
    public final void synpred1_Atto_fragment() throws RecognitionException {
        // Atto.g:176:4: ( call )
        // Atto.g:176:5: call
        {
        pushFollow(FOLLOW_call_in_synpred1_Atto717);
        call();

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\2\uffff\1\3\10\uffff\1\3";
    static final String DFA4_minS =
        "\1\12\1\uffff\1\4\6\uffff\1\53\1\uffff\1\4";
    static final String DFA4_maxS =
        "\1\75\1\uffff\1\75\6\uffff\1\53\1\uffff\1\75";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2\1\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\20\uffff\1\1\3\uffff\1\4\1\uffff\1\3\11\uffff\1\2\2\uffff"+
            "\2\3\1\uffff\1\6\1\3\1\7\3\uffff\1\10\3\uffff\1\3\1\uffff\1"+
            "\5",
            "",
            "\1\3\2\uffff\1\12\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\1\11\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\1"+
            "\uffff\1\3\1\uffff\1\3\3\uffff\11\3\1\uffff\4\3\1\uffff\2\3"+
            "\3\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\3\2\uffff\1\12\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\1\11\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\1"+
            "\uffff\1\3\1\uffff\1\3\3\uffff\11\3\1\uffff\4\3\1\uffff\2\3"+
            "\3\uffff\1\3\1\uffff\1\3"
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
            return "86:1: expr : ( fun | assign | or | if_ | while_ | obj | array | print );";
        }
    }
 

    public static final BitSet FOLLOW_stmt_in_root131 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_EOF_in_root134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt155 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block179 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INDENT_in_block181 = new BitSet(new long[]{0x288EC80288080400L});
    public static final BitSet FOLLOW_stmt_in_block183 = new BitSet(new long[]{0x288EC80288080400L});
    public static final BitSet FOLLOW_DEDENT_in_block186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_expr231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_expr236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_expr241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print252 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_print254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_obj274 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_pair_in_obj277 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_COMMA_in_obj280 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_pair_in_obj282 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_COMMA_in_obj286 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_obj291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair311 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COLON_in_pair313 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_pair316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_S_BRACKET_in_array328 = new BitSet(new long[]{0x288EC80288004400L});
    public static final BitSet FOLLOW_expr_in_array331 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_COMMA_in_array334 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_array336 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_COMMA_in_array340 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_S_BRACKET_in_array345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_366 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_if_368 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_block_in_if_370 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_elif_in_if_372 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_else__in_if_375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif404 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_elif406 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_block_in_elif408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_430 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_block_in_else_432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_452 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_while_454 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_block_in_while_456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_assign478 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign480 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_assign483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun499 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_vardef_in_fun511 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_COMMA_in_fun514 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_vardef_in_fun516 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ARROW_in_fun522 = new BitSet(new long[]{0x288EE80288000400L});
    public static final BitSet FOLLOW_expr_in_fun534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_fun549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or578 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_or581 = new BitSet(new long[]{0x0804C80200000400L});
    public static final BitSet FOLLOW_and_in_or584 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rel_in_and597 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and600 = new BitSet(new long[]{0x0804C80200000400L});
    public static final BitSet FOLLOW_rel_in_and603 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel616 = new BitSet(new long[]{0x0000108832000002L});
    public static final BitSet FOLLOW_set_in_rel619 = new BitSet(new long[]{0x0804C80200000400L});
    public static final BitSet FOLLOW_add_in_rel634 = new BitSet(new long[]{0x0000108832000002L});
    public static final BitSet FOLLOW_mul_in_add647 = new BitSet(new long[]{0x0040010000000002L});
    public static final BitSet FOLLOW_set_in_add650 = new BitSet(new long[]{0x0804C80200000400L});
    public static final BitSet FOLLOW_mul_in_add657 = new BitSet(new long[]{0x0040010000000002L});
    public static final BitSet FOLLOW_unary_in_mul670 = new BitSet(new long[]{0x0000060000200002L});
    public static final BitSet FOLLOW_set_in_mul673 = new BitSet(new long[]{0x0804C80200000400L});
    public static final BitSet FOLLOW_unary_in_mul682 = new BitSet(new long[]{0x0000060000200002L});
    public static final BitSet FOLLOW_atom_in_unary696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary701 = new BitSet(new long[]{0x0804880200000400L});
    public static final BitSet FOLLOW_atom_in_unary704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_atom721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_atom726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_atom742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_atom752 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_atom754 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_atom756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_qname772 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_qname775 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NAME_in_qname778 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_NAME_in_vardef791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_call809 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_call811 = new BitSet(new long[]{0x288EC80288002400L});
    public static final BitSet FOLLOW_expr_in_call814 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_COMMA_in_call817 = new BitSet(new long[]{0x288EC80288000400L});
    public static final BitSet FOLLOW_expr_in_call819 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_call825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_synpred1_Atto717 = new BitSet(new long[]{0x0000000000000002L});

}