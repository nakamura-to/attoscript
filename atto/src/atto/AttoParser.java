// $ANTLR 3.4 Atto.g 2012-08-21 10:46:44

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGSDEF", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "CLOSE_BRACKET", "CLOSE_PARENT", "CLOSE_S_BRACKET", "COLON", "COMMA", "COMMENT", "CONSTANT", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "FLOAT", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INT", "INTEGER", "LE", "LEADING_WS", "LETTER", "LOWER", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OPEN_BRACKET", "OPEN_PARENT", "OPEN_S_BRACKET", "OR", "PARAMS", "PARAMSDEF", "PLUS", "PRINT", "SEMICOLON", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__66=66;
    public static final int AND=4;
    public static final int ARGSDEF=5;
    public static final int ARRAY=6;
    public static final int ARROW=7;
    public static final int ASSIGN=8;
    public static final int AT=9;
    public static final int BLOCK=10;
    public static final int BOOL=11;
    public static final int CALL=12;
    public static final int CLOSE_BRACKET=13;
    public static final int CLOSE_PARENT=14;
    public static final int CLOSE_S_BRACKET=15;
    public static final int COLON=16;
    public static final int COMMA=17;
    public static final int COMMENT=18;
    public static final int CONSTANT=19;
    public static final int DEDENT=20;
    public static final int DIGIT=21;
    public static final int DIV=22;
    public static final int DOT=23;
    public static final int ELIF=24;
    public static final int ELSE=25;
    public static final int EQ=26;
    public static final int FLOAT=27;
    public static final int FUN=28;
    public static final int GE=29;
    public static final int GT=30;
    public static final int ID_CHAR=31;
    public static final int IF=32;
    public static final int INDENT=33;
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
    public static final int PARAMSDEF=55;
    public static final int PLUS=56;
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
            	    pushFollow(FOLLOW_stmt_in_root140);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root143); if (state.failed) return retval; 
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
            pushFollow(FOLLOW_expr_in_stmt164);
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
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt166); if (state.failed) return retval; 
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
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block188); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            INDENT6=(Token)match(input,INDENT,FOLLOW_INDENT_in_block190); if (state.failed) return retval; 
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
            	    pushFollow(FOLLOW_stmt_in_block192);
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


            DEDENT8=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block195); if (state.failed) return retval; 
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
    // Atto.g:81:1: expr : ( fun | assign | or | if_ | while_ | obj | array | print );
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
            // Atto.g:82:2: ( fun | assign | or | if_ | while_ | obj | array | print )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Atto.g:82:4: fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_expr215);
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


                    pushFollow(FOLLOW_assign_in_expr220);
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
                case 6 :
                    // Atto.g:87:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_expr240);
                    obj14=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj14.getTree());

                    }
                    break;
                case 7 :
                    // Atto.g:88:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_expr245);
                    array15=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array15.getTree());

                    }
                    break;
                case 8 :
                    // Atto.g:89:4: print
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_print_in_expr250);
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
    // Atto.g:92:1: print : 'print' expr -> ^( PRINT expr ) ;
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
            // Atto.g:93:2: ( 'print' expr -> ^( PRINT expr ) )
            // Atto.g:93:4: 'print' expr
            {
            string_literal17=(Token)match(input,PRINT,FOLLOW_PRINT_in_print261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PRINT.add(string_literal17);


            pushFollow(FOLLOW_expr_in_print263);
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
            // 93:17: -> ^( PRINT expr )
            {
                // Atto.g:93:20: ^( PRINT expr )
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
    // Atto.g:96:1: obj : OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET -> ^( OBJ ( pair )* ) ;
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
            // Atto.g:97:2: ( OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET -> ^( OBJ ( pair )* ) )
            // Atto.g:97:4: OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET
            {
            OPEN_BRACKET19=(Token)match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_obj283); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACKET.add(OPEN_BRACKET19);


            // Atto.g:97:17: ( pair ( COMMA pair )* ( COMMA )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NAME) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Atto.g:97:18: pair ( COMMA pair )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_pair_in_obj286);
                    pair20=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair20.getTree());

                    // Atto.g:97:23: ( COMMA pair )*
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
                    	    // Atto.g:97:24: COMMA pair
                    	    {
                    	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj289); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA21);


                    	    pushFollow(FOLLOW_pair_in_obj291);
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


                    // Atto.g:97:37: ( COMMA )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COMMA) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Atto.g:97:37: COMMA
                            {
                            COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj295); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA23);


                            }
                            break;

                    }


                    }
                    break;

            }


            CLOSE_BRACKET24=(Token)match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_obj300); if (state.failed) return retval; 
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
            // 97:60: -> ^( OBJ ( pair )* )
            {
                // Atto.g:97:63: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:97:69: ( pair )*
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
    // Atto.g:100:1: pair : NAME COLON ^ expr ;
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
            // Atto.g:101:2: ( NAME COLON ^ expr )
            // Atto.g:101:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME25=(Token)match(input,NAME,FOLLOW_NAME_in_pair320); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME25_tree = 
            (AttoTree)adaptor.create(NAME25)
            ;
            adaptor.addChild(root_0, NAME25_tree);
            }

            COLON26=(Token)match(input,COLON,FOLLOW_COLON_in_pair322); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON26_tree = 
            (AttoTree)adaptor.create(COLON26)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON26_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair325);
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
    // Atto.g:104:1: array : OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET -> ^( ARRAY ( expr )* ) ;
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
            // Atto.g:105:2: ( OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET -> ^( ARRAY ( expr )* ) )
            // Atto.g:105:4: OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET
            {
            OPEN_S_BRACKET28=(Token)match(input,OPEN_S_BRACKET,FOLLOW_OPEN_S_BRACKET_in_array337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_S_BRACKET.add(OPEN_S_BRACKET28);


            // Atto.g:105:19: ( expr ( COMMA expr )* ( COMMA )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BOOL||LA10_0==FUN||LA10_0==IF||LA10_0==INT||LA10_0==MINUS||LA10_0==NAME||(LA10_0 >= NOT && LA10_0 <= NULL)||(LA10_0 >= OPEN_BRACKET && LA10_0 <= OPEN_S_BRACKET)||LA10_0==PRINT||LA10_0==STRING||LA10_0==WHILE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Atto.g:105:20: expr ( COMMA expr )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_array340);
                    expr29=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());

                    // Atto.g:105:25: ( COMMA expr )*
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
                    	    // Atto.g:105:26: COMMA expr
                    	    {
                    	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_array343); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);


                    	    pushFollow(FOLLOW_expr_in_array345);
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


                    // Atto.g:105:39: ( COMMA )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==COMMA) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Atto.g:105:39: COMMA
                            {
                            COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_array349); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA32);


                            }
                            break;

                    }


                    }
                    break;

            }


            CLOSE_S_BRACKET33=(Token)match(input,CLOSE_S_BRACKET,FOLLOW_CLOSE_S_BRACKET_in_array354); if (state.failed) return retval; 
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
            // 105:64: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:105:67: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:105:75: ( expr )*
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
    // Atto.g:108:1: if_ : 'if' cond= expr ( block ( elif )* ( else_ )? -> ^( IF $cond block ( elif )* ( else_ )? ) | 'then' then= expr ( online_elif )* ( online_else )? -> ^( IF $cond $then ( online_elif )* ( online_else )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal34=null;
        Token string_literal38=null;
        AttoParser.expr_return cond =null;

        AttoParser.expr_return then =null;

        AttoParser.block_return block35 =null;

        AttoParser.elif_return elif36 =null;

        AttoParser.else__return else_37 =null;

        AttoParser.online_elif_return online_elif39 =null;

        AttoParser.online_else_return online_else40 =null;


        AttoTree string_literal34_tree=null;
        AttoTree string_literal38_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_online_else=new RewriteRuleSubtreeStream(adaptor,"rule online_else");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        RewriteRuleSubtreeStream stream_online_elif=new RewriteRuleSubtreeStream(adaptor,"rule online_elif");
        try {
            // Atto.g:109:2: ( 'if' cond= expr ( block ( elif )* ( else_ )? -> ^( IF $cond block ( elif )* ( else_ )? ) | 'then' then= expr ( online_elif )* ( online_else )? -> ^( IF $cond $then ( online_elif )* ( online_else )? ) ) )
            // Atto.g:109:4: 'if' cond= expr ( block ( elif )* ( else_ )? -> ^( IF $cond block ( elif )* ( else_ )? ) | 'then' then= expr ( online_elif )* ( online_else )? -> ^( IF $cond $then ( online_elif )* ( online_else )? ) )
            {
            string_literal34=(Token)match(input,IF,FOLLOW_IF_in_if_375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal34);


            pushFollow(FOLLOW_expr_in_if_379);
            cond=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond.getTree());

            // Atto.g:110:4: ( block ( elif )* ( else_ )? -> ^( IF $cond block ( elif )* ( else_ )? ) | 'then' then= expr ( online_elif )* ( online_else )? -> ^( IF $cond $then ( online_elif )* ( online_else )? ) )
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
                    // Atto.g:111:5: block ( elif )* ( else_ )?
                    {
                    pushFollow(FOLLOW_block_in_if_391);
                    block35=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block35.getTree());

                    // Atto.g:111:11: ( elif )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ELIF) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Atto.g:111:11: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_393);
                    	    elif36=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // Atto.g:111:17: ( else_ )?
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
                            // Atto.g:111:17: else_
                            {
                            pushFollow(FOLLOW_else__in_if_396);
                            else_37=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_37.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: block, elif, else_, cond
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
                    // 111:24: -> ^( IF $cond block ( elif )* ( else_ )? )
                    {
                        // Atto.g:111:27: ^( IF $cond block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:111:44: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:111:50: ( else_ )?
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
                    // Atto.g:112:5: 'then' then= expr ( online_elif )* ( online_else )?
                    {
                    string_literal38=(Token)match(input,66,FOLLOW_66_in_if_420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal38);


                    pushFollow(FOLLOW_expr_in_if_424);
                    then=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then.getTree());

                    // Atto.g:112:22: ( online_elif )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ELIF) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Atto.g:112:22: online_elif
                    	    {
                    	    pushFollow(FOLLOW_online_elif_in_if_426);
                    	    online_elif39=online_elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_online_elif.add(online_elif39.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // Atto.g:112:35: ( online_else )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ELSE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Atto.g:112:35: online_else
                            {
                            pushFollow(FOLLOW_online_else_in_if_429);
                            online_else40=online_else();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_online_else.add(online_else40.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: then, online_else, online_elif, cond
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
                    // 112:48: -> ^( IF $cond $then ( online_elif )* ( online_else )? )
                    {
                        // Atto.g:112:51: ^( IF $cond $then ( online_elif )* ( online_else )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond.nextTree());

                        adaptor.addChild(root_1, stream_then.nextTree());

                        // Atto.g:112:68: ( online_elif )*
                        while ( stream_online_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_online_elif.nextTree());

                        }
                        stream_online_elif.reset();

                        // Atto.g:112:81: ( online_else )?
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
    // Atto.g:116:1: elif : 'elif' expr block -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal41=null;
        AttoParser.expr_return expr42 =null;

        AttoParser.block_return block43 =null;


        AttoTree string_literal41_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:117:2: ( 'elif' expr block -> ^( ELIF expr block ) )
            // Atto.g:117:4: 'elif' expr block
            {
            string_literal41=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif465); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal41);


            pushFollow(FOLLOW_expr_in_elif467);
            expr42=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr42.getTree());

            pushFollow(FOLLOW_block_in_elif469);
            block43=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block43.getTree());

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

        Token string_literal44=null;
        AttoParser.block_return block45 =null;


        AttoTree string_literal44_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:121:2: ( 'else' block -> ^( ELSE block ) )
            // Atto.g:121:4: 'else' block
            {
            string_literal44=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_490); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal44);


            pushFollow(FOLLOW_block_in_else_492);
            block45=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block45.getTree());

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


    public static class online_elif_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "online_elif"
    // Atto.g:124:1: online_elif : 'elif' expr 'then' expr -> ^( ELIF expr expr ) ;
    public final AttoParser.online_elif_return online_elif() throws RecognitionException {
        AttoParser.online_elif_return retval = new AttoParser.online_elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal46=null;
        Token string_literal48=null;
        AttoParser.expr_return expr47 =null;

        AttoParser.expr_return expr49 =null;


        AttoTree string_literal46_tree=null;
        AttoTree string_literal48_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:125:2: ( 'elif' expr 'then' expr -> ^( ELIF expr expr ) )
            // Atto.g:125:4: 'elif' expr 'then' expr
            {
            string_literal46=(Token)match(input,ELIF,FOLLOW_ELIF_in_online_elif512); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal46);


            pushFollow(FOLLOW_expr_in_online_elif514);
            expr47=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr47.getTree());

            string_literal48=(Token)match(input,66,FOLLOW_66_in_online_elif516); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal48);


            pushFollow(FOLLOW_expr_in_online_elif518);
            expr49=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr49.getTree());

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
            // 125:28: -> ^( ELIF expr expr )
            {
                // Atto.g:125:31: ^( ELIF expr expr )
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
    // Atto.g:128:1: online_else : 'else' expr -> ^( ELSE expr ) ;
    public final AttoParser.online_else_return online_else() throws RecognitionException {
        AttoParser.online_else_return retval = new AttoParser.online_else_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal50=null;
        AttoParser.expr_return expr51 =null;


        AttoTree string_literal50_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:129:2: ( 'else' expr -> ^( ELSE expr ) )
            // Atto.g:129:4: 'else' expr
            {
            string_literal50=(Token)match(input,ELSE,FOLLOW_ELSE_in_online_else540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal50);


            pushFollow(FOLLOW_expr_in_online_else542);
            expr51=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr51.getTree());

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
            // 129:16: -> ^( ELSE expr )
            {
                // Atto.g:129:19: ^( ELSE expr )
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
    // Atto.g:132:1: while_ : 'while' cond= expr ( block -> ^( WHILE $cond block ) | 'then' then= expr -> ^( WHILE $cond $then) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal52=null;
        Token string_literal54=null;
        AttoParser.expr_return cond =null;

        AttoParser.expr_return then =null;

        AttoParser.block_return block53 =null;


        AttoTree string_literal52_tree=null;
        AttoTree string_literal54_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:133:2: ( 'while' cond= expr ( block -> ^( WHILE $cond block ) | 'then' then= expr -> ^( WHILE $cond $then) ) )
            // Atto.g:133:4: 'while' cond= expr ( block -> ^( WHILE $cond block ) | 'then' then= expr -> ^( WHILE $cond $then) )
            {
            string_literal52=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_563); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal52);


            pushFollow(FOLLOW_expr_in_while_567);
            cond=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond.getTree());

            // Atto.g:134:4: ( block -> ^( WHILE $cond block ) | 'then' then= expr -> ^( WHILE $cond $then) )
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
                    // Atto.g:135:5: block
                    {
                    pushFollow(FOLLOW_block_in_while_579);
                    block53=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block53.getTree());

                    // AST REWRITE
                    // elements: cond, block
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
                    // 135:11: -> ^( WHILE $cond block )
                    {
                        // Atto.g:135:14: ^( WHILE $cond block )
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
                    // Atto.g:136:7: 'then' then= expr
                    {
                    string_literal54=(Token)match(input,66,FOLLOW_66_in_while_598); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal54);


                    pushFollow(FOLLOW_expr_in_while_602);
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
                    // 136:24: -> ^( WHILE $cond $then)
                    {
                        // Atto.g:136:27: ^( WHILE $cond $then)
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
    // Atto.g:140:1: assign : qname ASSIGN ^ expr ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN56=null;
        AttoParser.qname_return qname55 =null;

        AttoParser.expr_return expr57 =null;


        AttoTree ASSIGN56_tree=null;

        try {
            // Atto.g:141:2: ( qname ASSIGN ^ expr )
            // Atto.g:141:4: qname ASSIGN ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_qname_in_assign631);
            qname55=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qname55.getTree());

            ASSIGN56=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign633); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN56_tree = 
            (AttoTree)adaptor.create(ASSIGN56)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ASSIGN56_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_assign636);
            expr57=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr57.getTree());

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
    // Atto.g:144:1: fun : 'fun' paramsdef ARROW body -> ^( FUN paramsdef body ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal58=null;
        Token ARROW60=null;
        AttoParser.paramsdef_return paramsdef59 =null;

        AttoParser.body_return body61 =null;


        AttoTree string_literal58_tree=null;
        AttoTree ARROW60_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        try {
            // Atto.g:145:2: ( 'fun' paramsdef ARROW body -> ^( FUN paramsdef body ) )
            // Atto.g:145:4: 'fun' paramsdef ARROW body
            {
            string_literal58=(Token)match(input,FUN,FOLLOW_FUN_in_fun647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUN.add(string_literal58);


            pushFollow(FOLLOW_paramsdef_in_fun649);
            paramsdef59=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef59.getTree());

            ARROW60=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW60);


            pushFollow(FOLLOW_body_in_fun653);
            body61=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body61.getTree());

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
            // 145:31: -> ^( FUN paramsdef body )
            {
                // Atto.g:145:34: ^( FUN paramsdef body )
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
    // Atto.g:148:1: paramsdef : ( vardef ( COMMA vardef )* )? -> ^( PARAMSDEF ( vardef )* ) ;
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA63=null;
        AttoParser.vardef_return vardef62 =null;

        AttoParser.vardef_return vardef64 =null;


        AttoTree COMMA63_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:149:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMSDEF ( vardef )* ) )
            // Atto.g:149:4: ( vardef ( COMMA vardef )* )?
            {
            // Atto.g:149:4: ( vardef ( COMMA vardef )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NAME) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Atto.g:149:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_paramsdef675);
                    vardef62=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef62.getTree());

                    // Atto.g:149:12: ( COMMA vardef )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Atto.g:149:13: COMMA vardef
                    	    {
                    	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef678); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA63);


                    	    pushFollow(FOLLOW_vardef_in_paramsdef680);
                    	    vardef64=vardef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_vardef.add(vardef64.getTree());

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
            // 149:30: -> ^( PARAMSDEF ( vardef )* )
            {
                // Atto.g:149:33: ^( PARAMSDEF ( vardef )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PARAMSDEF, "PARAMSDEF")
                , root_1);

                // Atto.g:149:45: ( vardef )*
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
    // Atto.g:152:1: body : ( expr | block );
    public final AttoParser.body_return body() throws RecognitionException {
        AttoParser.body_return retval = new AttoParser.body_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.expr_return expr65 =null;

        AttoParser.block_return block66 =null;



        try {
            // Atto.g:152:6: ( expr | block )
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
                    // Atto.g:152:8: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_body703);
                    expr65=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr65.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:153:4: block
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_body708);
                    block66=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block66.getTree());

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
    // Atto.g:156:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR68=null;
        AttoParser.and_return and67 =null;

        AttoParser.and_return and69 =null;


        AttoTree OR68_tree=null;

        try {
            // Atto.g:157:2: ( and ( OR ^ and )* )
            // Atto.g:157:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or719);
            and67=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and67.getTree());

            // Atto.g:157:8: ( OR ^ and )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==OR) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Atto.g:157:9: OR ^ and
            	    {
            	    OR68=(Token)match(input,OR,FOLLOW_OR_in_or722); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR68_tree = 
            	    (AttoTree)adaptor.create(OR68)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR68_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or725);
            	    and69=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and69.getTree());

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
    // Atto.g:160:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND71=null;
        AttoParser.rel_return rel70 =null;

        AttoParser.rel_return rel72 =null;


        AttoTree AND71_tree=null;

        try {
            // Atto.g:161:2: ( rel ( AND ^ rel )* )
            // Atto.g:161:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and738);
            rel70=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel70.getTree());

            // Atto.g:161:8: ( AND ^ rel )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Atto.g:161:9: AND ^ rel
            	    {
            	    AND71=(Token)match(input,AND,FOLLOW_AND_in_and741); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND71_tree = 
            	    (AttoTree)adaptor.create(AND71)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND71_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and744);
            	    rel72=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel72.getTree());

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
    // Atto.g:164:1: rel : add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set74=null;
        AttoParser.add_return add73 =null;

        AttoParser.add_return add75 =null;


        AttoTree set74_tree=null;

        try {
            // Atto.g:165:2: ( add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* )
            // Atto.g:165:4: add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel757);
            add73=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add73.getTree());

            // Atto.g:165:8: ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==EQ||(LA22_0 >= GE && LA22_0 <= GT)||LA22_0==LE||LA22_0==LT||LA22_0==NE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Atto.g:165:9: ( EQ | NE | LE | GE | LT | GT ) ^ add
            	    {
            	    set74=(Token)input.LT(1);

            	    set74=(Token)input.LT(1);

            	    if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set74)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_rel775);
            	    add75=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add75.getTree());

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
    // Atto.g:168:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set77=null;
        AttoParser.mul_return mul76 =null;

        AttoParser.mul_return mul78 =null;


        AttoTree set77_tree=null;

        try {
            // Atto.g:169:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:169:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add788);
            mul76=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul76.getTree());

            // Atto.g:169:8: ( ( PLUS | MINUS ) ^ mul )*
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
            	    // Atto.g:169:9: ( PLUS | MINUS ) ^ mul
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


            	    pushFollow(FOLLOW_mul_in_add798);
            	    mul78=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul78.getTree());

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
    // Atto.g:172:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set80=null;
        AttoParser.unary_return unary79 =null;

        AttoParser.unary_return unary81 =null;


        AttoTree set80_tree=null;

        try {
            // Atto.g:173:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:173:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul811);
            unary79=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary79.getTree());

            // Atto.g:173:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DIV||(LA24_0 >= MOD && LA24_0 <= MUL)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Atto.g:173:11: ( MUL | DIV | MOD ) ^ unary
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


            	    pushFollow(FOLLOW_unary_in_mul823);
            	    unary81=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary81.getTree());

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
    // Atto.g:176:1: unary : ( primary | NOT ^ primary | MINUS primary -> ^( UNARY_MINUS primary ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT83=null;
        Token MINUS85=null;
        AttoParser.primary_return primary82 =null;

        AttoParser.primary_return primary84 =null;

        AttoParser.primary_return primary86 =null;


        AttoTree NOT83_tree=null;
        AttoTree MINUS85_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        try {
            // Atto.g:177:2: ( primary | NOT ^ primary | MINUS primary -> ^( UNARY_MINUS primary ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
            case NAME:
            case NULL:
            case OPEN_PARENT:
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
                    // Atto.g:177:4: primary
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_unary837);
                    primary82=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary82.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:178:4: NOT ^ primary
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_unary842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT83_tree = 
                    (AttoTree)adaptor.create(NOT83)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT83_tree, root_0);
                    }

                    pushFollow(FOLLOW_primary_in_unary845);
                    primary84=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary84.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:179:4: MINUS primary
                    {
                    MINUS85=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS85);


                    pushFollow(FOLLOW_primary_in_unary852);
                    primary86=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary86.getTree());

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
                    // 179:18: -> ^( UNARY_MINUS primary )
                    {
                        // Atto.g:179:21: ^( UNARY_MINUS primary )
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
    // Atto.g:182:1: primary : ( ( call )=> call | atom );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.call_return call87 =null;

        AttoParser.atom_return atom88 =null;



        try {
            // Atto.g:183:2: ( ( call )=> call | atom )
            int alt26=2;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA26_1 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA26_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA26_3 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;

                }
                }
                break;
            case BOOL:
                {
                int LA26_4 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 4, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA26_5 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 5, input);

                    throw nvae;

                }
                }
                break;
            case OPEN_PARENT:
                {
                int LA26_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 6, input);

                    throw nvae;

                }
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
                    // Atto.g:183:4: ( call )=> call
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_call_in_primary877);
                    call87=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call87.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:184:4: atom
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_primary882);
                    atom88=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom88.getTree());

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


    public static class atom_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // Atto.g:187:1: atom : ( qname | INT | STRING | BOOL | NULL | OPEN_PARENT expr CLOSE_PARENT -> expr );
    public final AttoParser.atom_return atom() throws RecognitionException {
        AttoParser.atom_return retval = new AttoParser.atom_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token INT90=null;
        Token STRING91=null;
        Token BOOL92=null;
        Token NULL93=null;
        Token OPEN_PARENT94=null;
        Token CLOSE_PARENT96=null;
        AttoParser.qname_return qname89 =null;

        AttoParser.expr_return expr95 =null;


        AttoTree INT90_tree=null;
        AttoTree STRING91_tree=null;
        AttoTree BOOL92_tree=null;
        AttoTree NULL93_tree=null;
        AttoTree OPEN_PARENT94_tree=null;
        AttoTree CLOSE_PARENT96_tree=null;
        RewriteRuleTokenStream stream_OPEN_PARENT=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENT");
        RewriteRuleTokenStream stream_CLOSE_PARENT=new RewriteRuleTokenStream(adaptor,"token CLOSE_PARENT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:188:2: ( qname | INT | STRING | BOOL | NULL | OPEN_PARENT expr CLOSE_PARENT -> expr )
            int alt27=6;
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // Atto.g:188:4: qname
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_qname_in_atom894);
                    qname89=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qname89.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:189:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT90=(Token)match(input,INT,FOLLOW_INT_in_atom900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT90_tree = 
                    (AttoTree)adaptor.create(INT90)
                    ;
                    adaptor.addChild(root_0, INT90_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:190:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING91=(Token)match(input,STRING,FOLLOW_STRING_in_atom905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING91_tree = 
                    (AttoTree)adaptor.create(STRING91)
                    ;
                    adaptor.addChild(root_0, STRING91_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:191:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL92=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL92_tree = 
                    (AttoTree)adaptor.create(BOOL92)
                    ;
                    adaptor.addChild(root_0, BOOL92_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:192:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL93=(Token)match(input,NULL,FOLLOW_NULL_in_atom915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL93_tree = 
                    (AttoTree)adaptor.create(NULL93)
                    ;
                    adaptor.addChild(root_0, NULL93_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:193:4: OPEN_PARENT expr CLOSE_PARENT
                    {
                    OPEN_PARENT94=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_atom920); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PARENT.add(OPEN_PARENT94);


                    pushFollow(FOLLOW_expr_in_atom922);
                    expr95=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr95.getTree());

                    CLOSE_PARENT96=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_atom924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PARENT.add(CLOSE_PARENT96);


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
                    // 193:34: -> expr
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
    // Atto.g:196:1: qname : NAME ( DOT ^ NAME )* ;
    public final AttoParser.qname_return qname() throws RecognitionException {
        AttoParser.qname_return retval = new AttoParser.qname_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME97=null;
        Token DOT98=null;
        Token NAME99=null;

        AttoTree NAME97_tree=null;
        AttoTree DOT98_tree=null;
        AttoTree NAME99_tree=null;

        try {
            // Atto.g:197:2: ( NAME ( DOT ^ NAME )* )
            // Atto.g:197:4: NAME ( DOT ^ NAME )*
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME97=(Token)match(input,NAME,FOLLOW_NAME_in_qname940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME97_tree = 
            (AttoTree)adaptor.create(NAME97)
            ;
            adaptor.addChild(root_0, NAME97_tree);
            }

            // Atto.g:197:9: ( DOT ^ NAME )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==DOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Atto.g:197:10: DOT ^ NAME
            	    {
            	    DOT98=(Token)match(input,DOT,FOLLOW_DOT_in_qname943); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT98_tree = 
            	    (AttoTree)adaptor.create(DOT98)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(DOT98_tree, root_0);
            	    }

            	    NAME99=(Token)match(input,NAME,FOLLOW_NAME_in_qname946); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME99_tree = 
            	    (AttoTree)adaptor.create(NAME99)
            	    ;
            	    adaptor.addChild(root_0, NAME99_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // Atto.g:200:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME100=null;

        AttoTree NAME100_tree=null;

        try {
            // Atto.g:201:2: ( NAME )
            // Atto.g:201:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME100=(Token)match(input,NAME,FOLLOW_NAME_in_vardef959); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME100_tree = 
            (AttoTree)adaptor.create(NAME100)
            ;
            adaptor.addChild(root_0, NAME100_tree);
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
    // Atto.g:204:1: call : atom ( argsdef )+ -> ^( CALL atom ( argsdef )+ ) ;
    public final AttoParser.call_return call() throws RecognitionException {
        AttoParser.call_return retval = new AttoParser.call_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.atom_return atom101 =null;

        AttoParser.argsdef_return argsdef102 =null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_argsdef=new RewriteRuleSubtreeStream(adaptor,"rule argsdef");
        try {
            // Atto.g:205:2: ( atom ( argsdef )+ -> ^( CALL atom ( argsdef )+ ) )
            // Atto.g:205:4: atom ( argsdef )+
            {
            pushFollow(FOLLOW_atom_in_call972);
            atom101=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom.add(atom101.getTree());

            // Atto.g:205:9: ( argsdef )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==OPEN_PARENT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Atto.g:205:9: argsdef
            	    {
            	    pushFollow(FOLLOW_argsdef_in_call974);
            	    argsdef102=argsdef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_argsdef.add(argsdef102.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            // AST REWRITE
            // elements: atom, argsdef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 205:19: -> ^( CALL atom ( argsdef )+ )
            {
                // Atto.g:205:22: ^( CALL atom ( argsdef )+ )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, stream_atom.nextTree());

                if ( !(stream_argsdef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_argsdef.hasNext() ) {
                    adaptor.addChild(root_1, stream_argsdef.nextTree());

                }
                stream_argsdef.reset();

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


    public static class argsdef_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argsdef"
    // Atto.g:208:1: argsdef : OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT -> ^( ARGSDEF ( expr )* ) ;
    public final AttoParser.argsdef_return argsdef() throws RecognitionException {
        AttoParser.argsdef_return retval = new AttoParser.argsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OPEN_PARENT103=null;
        Token COMMA105=null;
        Token CLOSE_PARENT107=null;
        AttoParser.expr_return expr104 =null;

        AttoParser.expr_return expr106 =null;


        AttoTree OPEN_PARENT103_tree=null;
        AttoTree COMMA105_tree=null;
        AttoTree CLOSE_PARENT107_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_PARENT=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENT");
        RewriteRuleTokenStream stream_CLOSE_PARENT=new RewriteRuleTokenStream(adaptor,"token CLOSE_PARENT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:209:2: ( OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT -> ^( ARGSDEF ( expr )* ) )
            // Atto.g:209:4: OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT
            {
            OPEN_PARENT103=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_argsdef998); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_PARENT.add(OPEN_PARENT103);


            // Atto.g:209:16: ( expr ( COMMA expr )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==BOOL||LA31_0==FUN||LA31_0==IF||LA31_0==INT||LA31_0==MINUS||LA31_0==NAME||(LA31_0 >= NOT && LA31_0 <= NULL)||(LA31_0 >= OPEN_BRACKET && LA31_0 <= OPEN_S_BRACKET)||LA31_0==PRINT||LA31_0==STRING||LA31_0==WHILE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Atto.g:209:17: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_argsdef1001);
                    expr104=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr104.getTree());

                    // Atto.g:209:22: ( COMMA expr )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==COMMA) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Atto.g:209:23: COMMA expr
                    	    {
                    	    COMMA105=(Token)match(input,COMMA,FOLLOW_COMMA_in_argsdef1004); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA105);


                    	    pushFollow(FOLLOW_expr_in_argsdef1006);
                    	    expr106=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr106.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            CLOSE_PARENT107=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_argsdef1012); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_PARENT.add(CLOSE_PARENT107);


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
            // 209:51: -> ^( ARGSDEF ( expr )* )
            {
                // Atto.g:209:54: ^( ARGSDEF ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARGSDEF, "ARGSDEF")
                , root_1);

                // Atto.g:209:64: ( expr )*
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

    // $ANTLR start synpred1_Atto
    public final void synpred1_Atto_fragment() throws RecognitionException {
        // Atto.g:183:4: ( call )
        // Atto.g:183:5: call
        {
        pushFollow(FOLLOW_call_in_synpred1_Atto873);
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
        "\1\13\1\uffff\1\4\6\uffff\1\54\1\uffff\1\4";
    static final String DFA4_maxS =
        "\1\100\1\uffff\1\102\6\uffff\1\54\1\uffff\1\102";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2\1\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\20\uffff\1\1\3\uffff\1\4\1\uffff\1\3\6\uffff\1\3\2\uffff"+
            "\1\2\2\uffff\2\3\1\uffff\1\6\1\3\1\7\4\uffff\1\10\3\uffff\1"+
            "\3\2\uffff\1\5",
            "",
            "\1\3\3\uffff\1\12\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\1\11\3\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1"+
            "\3\1\uffff\1\3\3\uffff\11\3\1\uffff\4\3\2\uffff\2\3\3\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\3\3\uffff\1\12\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\1\11\3\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1"+
            "\3\1\uffff\1\3\3\uffff\11\3\1\uffff\4\3\2\uffff\2\3\3\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3"
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
            return "81:1: expr : ( fun | assign | or | if_ | while_ | obj | array | print );";
        }
    }
 

    public static final BitSet FOLLOW_stmt_in_root140 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_EOF_in_root143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt164 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block188 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INDENT_in_block190 = new BitSet(new long[]{0x221D920510100800L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_block192 = new BitSet(new long[]{0x221D920510100800L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEDENT_in_block195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_expr240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_expr245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_expr250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print261 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_print263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_obj283 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_pair_in_obj286 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_COMMA_in_obj289 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pair_in_obj291 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_COMMA_in_obj295 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_obj300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair320 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_pair322 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_pair325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_S_BRACKET_in_array337 = new BitSet(new long[]{0x221D920510008800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array340 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_COMMA_in_array343 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array345 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_COMMA_in_array349 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSE_S_BRACKET_in_array354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_375 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_379 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_if_391 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_elif_in_if_393 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_else__in_if_396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_if_420 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_424 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_online_elif_in_if_426 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_online_else_in_if_429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif465 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_elif467 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_block_in_elif469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_490 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_block_in_else_492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_online_elif512 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_online_elif514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_online_elif516 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_online_elif518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_online_else540 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_online_else542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_563 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_567 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_while_579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_while_598 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_assign631 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign633 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_assign636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun647 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_paramsdef_in_fun649 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_fun651 = new BitSet(new long[]{0x221DD20510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_fun653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef675 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef678 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef680 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_expr_in_body703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or719 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_OR_in_or722 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_and_in_or725 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rel_in_and738 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and741 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_rel_in_and744 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel757 = new BitSet(new long[]{0x0000211064000002L});
    public static final BitSet FOLLOW_set_in_rel760 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_add_in_rel775 = new BitSet(new long[]{0x0000211064000002L});
    public static final BitSet FOLLOW_mul_in_add788 = new BitSet(new long[]{0x0100020000000002L});
    public static final BitSet FOLLOW_set_in_add791 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_mul_in_add798 = new BitSet(new long[]{0x0100020000000002L});
    public static final BitSet FOLLOW_unary_in_mul811 = new BitSet(new long[]{0x00000C0000400002L});
    public static final BitSet FOLLOW_set_in_mul814 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_unary_in_mul823 = new BitSet(new long[]{0x00000C0000400002L});
    public static final BitSet FOLLOW_primary_in_unary837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary842 = new BitSet(new long[]{0x2009100400000800L});
    public static final BitSet FOLLOW_primary_in_unary845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary850 = new BitSet(new long[]{0x2009100400000800L});
    public static final BitSet FOLLOW_primary_in_unary852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_primary877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_primary882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_atom894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_atom910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_atom920 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom922 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_atom924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_qname940 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_qname943 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_qname946 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NAME_in_vardef959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_call972 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_argsdef_in_call974 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_argsdef998 = new BitSet(new long[]{0x221D920510004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_argsdef1001 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_COMMA_in_argsdef1004 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_argsdef1006 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_argsdef1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_synpred1_Atto873 = new BitSet(new long[]{0x0000000000000002L});

}