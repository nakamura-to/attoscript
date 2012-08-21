// $ANTLR 3.4 Atto.g 2012-08-21 08:58:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGSDEF", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "CLOSE_BRACKET", "CLOSE_PARENT", "CLOSE_S_BRACKET", "COLON", "COMMA", "COMMENT", "CONSTANT", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "FLOAT", "FUN", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INT", "INTEGER", "LE", "LEADING_WS", "LETTER", "LOWER", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OPEN_BRACKET", "OPEN_PARENT", "OPEN_S_BRACKET", "OR", "PARAMS", "PARAMSDEF", "PLUS", "PRINT", "SEMICOLON", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS"
    };

    public static final int EOF=-1;
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

                if ( (LA1_0==BOOL||LA1_0==FUN||LA1_0==IF||LA1_0==INT||LA1_0==MINUS||LA1_0==NAME||(LA1_0 >= NOT && LA1_0 <= NULL)||(LA1_0 >= OPEN_BRACKET && LA1_0 <= OPEN_S_BRACKET)||LA1_0==PRINT||LA1_0==STRING||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Atto.g:66:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_root134);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root137); if (state.failed) return retval; 
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
            pushFollow(FOLLOW_expr_in_stmt158);
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
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt160); if (state.failed) return retval; 
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
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block182); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            INDENT6=(Token)match(input,INDENT,FOLLOW_INDENT_in_block184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT6);


            // Atto.g:74:19: ( stmt )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BOOL||LA3_0==FUN||LA3_0==IF||LA3_0==INT||LA3_0==MINUS||LA3_0==NAME||(LA3_0 >= NOT && LA3_0 <= NULL)||(LA3_0 >= OPEN_BRACKET && LA3_0 <= OPEN_S_BRACKET)||LA3_0==PRINT||LA3_0==STRING||LA3_0==WHILE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Atto.g:74:19: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block186);
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


            DEDENT8=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block189); if (state.failed) return retval; 
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
    // Atto.g:77:1: expr : ( fun | assign | or | if_ | while_ | obj | array | print );
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
            // Atto.g:78:2: ( fun | assign | or | if_ | while_ | obj | array | print )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Atto.g:78:4: fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_expr209);
                    fun9=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun9.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:79:4: assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr214);
                    assign10=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign10.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:80:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr219);
                    or11=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or11.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:81:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr224);
                    if_12=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_12.getTree());

                    }
                    break;
                case 5 :
                    // Atto.g:82:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr229);
                    while_13=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_13.getTree());

                    }
                    break;
                case 6 :
                    // Atto.g:83:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_expr234);
                    obj14=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj14.getTree());

                    }
                    break;
                case 7 :
                    // Atto.g:84:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_expr239);
                    array15=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array15.getTree());

                    }
                    break;
                case 8 :
                    // Atto.g:85:4: print
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_print_in_expr244);
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
    // Atto.g:88:1: print : 'print' expr -> ^( PRINT expr ) ;
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
            // Atto.g:89:2: ( 'print' expr -> ^( PRINT expr ) )
            // Atto.g:89:4: 'print' expr
            {
            string_literal17=(Token)match(input,PRINT,FOLLOW_PRINT_in_print255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PRINT.add(string_literal17);


            pushFollow(FOLLOW_expr_in_print257);
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
            // 89:17: -> ^( PRINT expr )
            {
                // Atto.g:89:20: ^( PRINT expr )
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
    // Atto.g:92:1: obj : OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET -> ^( OBJ ( pair )* ) ;
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
            // Atto.g:93:2: ( OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET -> ^( OBJ ( pair )* ) )
            // Atto.g:93:4: OPEN_BRACKET ( pair ( COMMA pair )* ( COMMA )? )? CLOSE_BRACKET
            {
            OPEN_BRACKET19=(Token)match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_obj277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACKET.add(OPEN_BRACKET19);


            // Atto.g:93:17: ( pair ( COMMA pair )* ( COMMA )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NAME) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Atto.g:93:18: pair ( COMMA pair )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_pair_in_obj280);
                    pair20=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair20.getTree());

                    // Atto.g:93:23: ( COMMA pair )*
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
                    	    // Atto.g:93:24: COMMA pair
                    	    {
                    	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj283); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA21);


                    	    pushFollow(FOLLOW_pair_in_obj285);
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


                    // Atto.g:93:37: ( COMMA )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COMMA) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Atto.g:93:37: COMMA
                            {
                            COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj289); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA23);


                            }
                            break;

                    }


                    }
                    break;

            }


            CLOSE_BRACKET24=(Token)match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_obj294); if (state.failed) return retval; 
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
            // 93:60: -> ^( OBJ ( pair )* )
            {
                // Atto.g:93:63: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:93:69: ( pair )*
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
    // Atto.g:96:1: pair : NAME COLON ^ expr ;
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
            // Atto.g:97:2: ( NAME COLON ^ expr )
            // Atto.g:97:4: NAME COLON ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME25=(Token)match(input,NAME,FOLLOW_NAME_in_pair314); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME25_tree = 
            (AttoTree)adaptor.create(NAME25)
            ;
            adaptor.addChild(root_0, NAME25_tree);
            }

            COLON26=(Token)match(input,COLON,FOLLOW_COLON_in_pair316); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON26_tree = 
            (AttoTree)adaptor.create(COLON26)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON26_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_pair319);
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
    // Atto.g:100:1: array : OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET -> ^( ARRAY ( expr )* ) ;
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
            // Atto.g:101:2: ( OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET -> ^( ARRAY ( expr )* ) )
            // Atto.g:101:4: OPEN_S_BRACKET ( expr ( COMMA expr )* ( COMMA )? )? CLOSE_S_BRACKET
            {
            OPEN_S_BRACKET28=(Token)match(input,OPEN_S_BRACKET,FOLLOW_OPEN_S_BRACKET_in_array331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_S_BRACKET.add(OPEN_S_BRACKET28);


            // Atto.g:101:19: ( expr ( COMMA expr )* ( COMMA )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BOOL||LA10_0==FUN||LA10_0==IF||LA10_0==INT||LA10_0==MINUS||LA10_0==NAME||(LA10_0 >= NOT && LA10_0 <= NULL)||(LA10_0 >= OPEN_BRACKET && LA10_0 <= OPEN_S_BRACKET)||LA10_0==PRINT||LA10_0==STRING||LA10_0==WHILE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Atto.g:101:20: expr ( COMMA expr )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_array334);
                    expr29=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());

                    // Atto.g:101:25: ( COMMA expr )*
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
                    	    // Atto.g:101:26: COMMA expr
                    	    {
                    	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_array337); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);


                    	    pushFollow(FOLLOW_expr_in_array339);
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


                    // Atto.g:101:39: ( COMMA )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==COMMA) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Atto.g:101:39: COMMA
                            {
                            COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_array343); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA32);


                            }
                            break;

                    }


                    }
                    break;

            }


            CLOSE_S_BRACKET33=(Token)match(input,CLOSE_S_BRACKET,FOLLOW_CLOSE_S_BRACKET_in_array348); if (state.failed) return retval; 
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
            // 101:64: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:101:67: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:101:75: ( expr )*
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
    // Atto.g:104:1: if_ : 'if' expr block ( elif )* ( else_ )? -> ^( IF expr block ( elif )* ( else_ )? ) ;
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
            // Atto.g:105:2: ( 'if' expr block ( elif )* ( else_ )? -> ^( IF expr block ( elif )* ( else_ )? ) )
            // Atto.g:105:4: 'if' expr block ( elif )* ( else_ )?
            {
            string_literal34=(Token)match(input,IF,FOLLOW_IF_in_if_369); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal34);


            pushFollow(FOLLOW_expr_in_if_371);
            expr35=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr35.getTree());

            pushFollow(FOLLOW_block_in_if_373);
            block36=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block36.getTree());

            // Atto.g:105:20: ( elif )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ELIF) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Atto.g:105:20: elif
            	    {
            	    pushFollow(FOLLOW_elif_in_if_375);
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


            // Atto.g:105:26: ( else_ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ELSE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Atto.g:105:26: else_
                    {
                    pushFollow(FOLLOW_else__in_if_378);
                    else_38=else_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_else_.add(else_38.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: block, expr, else_, elif
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 105:33: -> ^( IF expr block ( elif )* ( else_ )? )
            {
                // Atto.g:105:36: ^( IF expr block ( elif )* ( else_ )? )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(IF, "IF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                // Atto.g:105:52: ( elif )*
                while ( stream_elif.hasNext() ) {
                    adaptor.addChild(root_1, stream_elif.nextTree());

                }
                stream_elif.reset();

                // Atto.g:105:58: ( else_ )?
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
    // Atto.g:108:1: elif : 'elif' expr block -> ^( ELIF expr block ) ;
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
            // Atto.g:109:2: ( 'elif' expr block -> ^( ELIF expr block ) )
            // Atto.g:109:4: 'elif' expr block
            {
            string_literal39=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal39);


            pushFollow(FOLLOW_expr_in_elif409);
            expr40=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr40.getTree());

            pushFollow(FOLLOW_block_in_elif411);
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
            // 109:22: -> ^( ELIF expr block )
            {
                // Atto.g:109:25: ^( ELIF expr block )
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
    // Atto.g:112:1: else_ : 'else' block -> ^( ELSE block ) ;
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
            // Atto.g:113:2: ( 'else' block -> ^( ELSE block ) )
            // Atto.g:113:4: 'else' block
            {
            string_literal42=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_433); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal42);


            pushFollow(FOLLOW_block_in_else_435);
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
            // 113:17: -> ^( ELSE block )
            {
                // Atto.g:113:20: ^( ELSE block )
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
    // Atto.g:116:1: while_ : 'while' expr block -> ^( WHILE expr block ) ;
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
            // Atto.g:117:2: ( 'while' expr block -> ^( WHILE expr block ) )
            // Atto.g:117:4: 'while' expr block
            {
            string_literal44=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal44);


            pushFollow(FOLLOW_expr_in_while_457);
            expr45=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr45.getTree());

            pushFollow(FOLLOW_block_in_while_459);
            block46=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block46.getTree());

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
            // 117:23: -> ^( WHILE expr block )
            {
                // Atto.g:117:26: ^( WHILE expr block )
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
    // Atto.g:120:1: assign : qname ASSIGN ^ expr ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN48=null;
        AttoParser.qname_return qname47 =null;

        AttoParser.expr_return expr49 =null;


        AttoTree ASSIGN48_tree=null;

        try {
            // Atto.g:121:2: ( qname ASSIGN ^ expr )
            // Atto.g:121:4: qname ASSIGN ^ expr
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_qname_in_assign481);
            qname47=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qname47.getTree());

            ASSIGN48=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN48_tree = 
            (AttoTree)adaptor.create(ASSIGN48)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ASSIGN48_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_assign486);
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
    // Atto.g:124:1: fun : 'fun' paramsdef ARROW body -> ^( FUN paramsdef body ) ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal50=null;
        Token ARROW52=null;
        AttoParser.paramsdef_return paramsdef51 =null;

        AttoParser.body_return body53 =null;


        AttoTree string_literal50_tree=null;
        AttoTree ARROW52_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_paramsdef=new RewriteRuleSubtreeStream(adaptor,"rule paramsdef");
        try {
            // Atto.g:125:2: ( 'fun' paramsdef ARROW body -> ^( FUN paramsdef body ) )
            // Atto.g:125:4: 'fun' paramsdef ARROW body
            {
            string_literal50=(Token)match(input,FUN,FOLLOW_FUN_in_fun497); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUN.add(string_literal50);


            pushFollow(FOLLOW_paramsdef_in_fun499);
            paramsdef51=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramsdef.add(paramsdef51.getTree());

            ARROW52=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW52);


            pushFollow(FOLLOW_body_in_fun503);
            body53=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body53.getTree());

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
            // 125:31: -> ^( FUN paramsdef body )
            {
                // Atto.g:125:34: ^( FUN paramsdef body )
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
    // Atto.g:128:1: paramsdef : ( vardef ( COMMA vardef )* )? -> ^( PARAMSDEF ( vardef )* ) ;
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA55=null;
        AttoParser.vardef_return vardef54 =null;

        AttoParser.vardef_return vardef56 =null;


        AttoTree COMMA55_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:129:2: ( ( vardef ( COMMA vardef )* )? -> ^( PARAMSDEF ( vardef )* ) )
            // Atto.g:129:4: ( vardef ( COMMA vardef )* )?
            {
            // Atto.g:129:4: ( vardef ( COMMA vardef )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAME) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Atto.g:129:5: vardef ( COMMA vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_paramsdef525);
                    vardef54=vardef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardef.add(vardef54.getTree());

                    // Atto.g:129:12: ( COMMA vardef )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Atto.g:129:13: COMMA vardef
                    	    {
                    	    COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef528); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);


                    	    pushFollow(FOLLOW_vardef_in_paramsdef530);
                    	    vardef56=vardef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_vardef.add(vardef56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
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
            // 129:30: -> ^( PARAMSDEF ( vardef )* )
            {
                // Atto.g:129:33: ^( PARAMSDEF ( vardef )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PARAMSDEF, "PARAMSDEF")
                , root_1);

                // Atto.g:129:45: ( vardef )*
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
    // Atto.g:132:1: body : ( expr | block );
    public final AttoParser.body_return body() throws RecognitionException {
        AttoParser.body_return retval = new AttoParser.body_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.expr_return expr57 =null;

        AttoParser.block_return block58 =null;



        try {
            // Atto.g:132:6: ( expr | block )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==BOOL||LA15_0==FUN||LA15_0==IF||LA15_0==INT||LA15_0==MINUS||LA15_0==NAME||(LA15_0 >= NOT && LA15_0 <= NULL)||(LA15_0 >= OPEN_BRACKET && LA15_0 <= OPEN_S_BRACKET)||LA15_0==PRINT||LA15_0==STRING||LA15_0==WHILE) ) {
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
                    // Atto.g:132:8: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_body553);
                    expr57=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr57.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:133:4: block
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_body558);
                    block58=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block58.getTree());

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
    // Atto.g:136:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR60=null;
        AttoParser.and_return and59 =null;

        AttoParser.and_return and61 =null;


        AttoTree OR60_tree=null;

        try {
            // Atto.g:137:2: ( and ( OR ^ and )* )
            // Atto.g:137:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or569);
            and59=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and59.getTree());

            // Atto.g:137:8: ( OR ^ and )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Atto.g:137:9: OR ^ and
            	    {
            	    OR60=(Token)match(input,OR,FOLLOW_OR_in_or572); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR60_tree = 
            	    (AttoTree)adaptor.create(OR60)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR60_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or575);
            	    and61=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and61.getTree());

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
    // Atto.g:140:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND63=null;
        AttoParser.rel_return rel62 =null;

        AttoParser.rel_return rel64 =null;


        AttoTree AND63_tree=null;

        try {
            // Atto.g:141:2: ( rel ( AND ^ rel )* )
            // Atto.g:141:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and588);
            rel62=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel62.getTree());

            // Atto.g:141:8: ( AND ^ rel )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Atto.g:141:9: AND ^ rel
            	    {
            	    AND63=(Token)match(input,AND,FOLLOW_AND_in_and591); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND63_tree = 
            	    (AttoTree)adaptor.create(AND63)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND63_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and594);
            	    rel64=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel64.getTree());

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
    // Atto.g:144:1: rel : add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set66=null;
        AttoParser.add_return add65 =null;

        AttoParser.add_return add67 =null;


        AttoTree set66_tree=null;

        try {
            // Atto.g:145:2: ( add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )* )
            // Atto.g:145:4: add ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel607);
            add65=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add65.getTree());

            // Atto.g:145:8: ( ( EQ | NE | LE | GE | LT | GT ) ^ add )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==EQ||(LA18_0 >= GE && LA18_0 <= GT)||LA18_0==LE||LA18_0==LT||LA18_0==NE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Atto.g:145:9: ( EQ | NE | LE | GE | LT | GT ) ^ add
            	    {
            	    set66=(Token)input.LT(1);

            	    set66=(Token)input.LT(1);

            	    if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
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


            	    pushFollow(FOLLOW_add_in_rel625);
            	    add67=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add67.getTree());

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
    // Atto.g:148:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set69=null;
        AttoParser.mul_return mul68 =null;

        AttoParser.mul_return mul70 =null;


        AttoTree set69_tree=null;

        try {
            // Atto.g:149:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:149:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add638);
            mul68=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul68.getTree());

            // Atto.g:149:8: ( ( PLUS | MINUS ) ^ mul )*
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
            	    // Atto.g:149:9: ( PLUS | MINUS ) ^ mul
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


            	    pushFollow(FOLLOW_mul_in_add648);
            	    mul70=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul70.getTree());

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
    // Atto.g:152:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set72=null;
        AttoParser.unary_return unary71 =null;

        AttoParser.unary_return unary73 =null;


        AttoTree set72_tree=null;

        try {
            // Atto.g:153:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:153:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul661);
            unary71=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary71.getTree());

            // Atto.g:153:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||(LA20_0 >= MOD && LA20_0 <= MUL)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Atto.g:153:11: ( MUL | DIV | MOD ) ^ unary
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


            	    pushFollow(FOLLOW_unary_in_mul673);
            	    unary73=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary73.getTree());

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
    // Atto.g:156:1: unary : ( primary | NOT ^ primary | MINUS primary -> ^( UNARY_MINUS primary ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT75=null;
        Token MINUS77=null;
        AttoParser.primary_return primary74 =null;

        AttoParser.primary_return primary76 =null;

        AttoParser.primary_return primary78 =null;


        AttoTree NOT75_tree=null;
        AttoTree MINUS77_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        try {
            // Atto.g:157:2: ( primary | NOT ^ primary | MINUS primary -> ^( UNARY_MINUS primary ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
            case NAME:
            case NULL:
            case OPEN_PARENT:
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
                    // Atto.g:157:4: primary
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_unary687);
                    primary74=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary74.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:158:4: NOT ^ primary
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT75=(Token)match(input,NOT,FOLLOW_NOT_in_unary692); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT75_tree = 
                    (AttoTree)adaptor.create(NOT75)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT75_tree, root_0);
                    }

                    pushFollow(FOLLOW_primary_in_unary695);
                    primary76=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary76.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:159:4: MINUS primary
                    {
                    MINUS77=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS77);


                    pushFollow(FOLLOW_primary_in_unary702);
                    primary78=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary78.getTree());

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
                    // 159:18: -> ^( UNARY_MINUS primary )
                    {
                        // Atto.g:159:21: ^( UNARY_MINUS primary )
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
    // Atto.g:162:1: primary : ( ( call )=> call | atom );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.call_return call79 =null;

        AttoParser.atom_return atom80 =null;



        try {
            // Atto.g:163:2: ( ( call )=> call | atom )
            int alt22=2;
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
                int LA22_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA22_3 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;

                }
                }
                break;
            case BOOL:
                {
                int LA22_4 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA22_5 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 5, input);

                    throw nvae;

                }
                }
                break;
            case OPEN_PARENT:
                {
                int LA22_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 6, input);

                    throw nvae;

                }
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
                    // Atto.g:163:4: ( call )=> call
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_call_in_primary727);
                    call79=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call79.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:164:4: atom
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_primary732);
                    atom80=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom80.getTree());

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
    // Atto.g:167:1: atom : ( qname | INT | STRING | BOOL | NULL | OPEN_PARENT expr CLOSE_PARENT -> expr );
    public final AttoParser.atom_return atom() throws RecognitionException {
        AttoParser.atom_return retval = new AttoParser.atom_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token INT82=null;
        Token STRING83=null;
        Token BOOL84=null;
        Token NULL85=null;
        Token OPEN_PARENT86=null;
        Token CLOSE_PARENT88=null;
        AttoParser.qname_return qname81 =null;

        AttoParser.expr_return expr87 =null;


        AttoTree INT82_tree=null;
        AttoTree STRING83_tree=null;
        AttoTree BOOL84_tree=null;
        AttoTree NULL85_tree=null;
        AttoTree OPEN_PARENT86_tree=null;
        AttoTree CLOSE_PARENT88_tree=null;
        RewriteRuleTokenStream stream_OPEN_PARENT=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENT");
        RewriteRuleTokenStream stream_CLOSE_PARENT=new RewriteRuleTokenStream(adaptor,"token CLOSE_PARENT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:168:2: ( qname | INT | STRING | BOOL | NULL | OPEN_PARENT expr CLOSE_PARENT -> expr )
            int alt23=6;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt23=1;
                }
                break;
            case INT:
                {
                alt23=2;
                }
                break;
            case STRING:
                {
                alt23=3;
                }
                break;
            case BOOL:
                {
                alt23=4;
                }
                break;
            case NULL:
                {
                alt23=5;
                }
                break;
            case OPEN_PARENT:
                {
                alt23=6;
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
                    // Atto.g:168:4: qname
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_qname_in_atom744);
                    qname81=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qname81.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:169:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT82=(Token)match(input,INT,FOLLOW_INT_in_atom750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT82_tree = 
                    (AttoTree)adaptor.create(INT82)
                    ;
                    adaptor.addChild(root_0, INT82_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:170:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING83=(Token)match(input,STRING,FOLLOW_STRING_in_atom755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING83_tree = 
                    (AttoTree)adaptor.create(STRING83)
                    ;
                    adaptor.addChild(root_0, STRING83_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:171:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL84=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom760); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL84_tree = 
                    (AttoTree)adaptor.create(BOOL84)
                    ;
                    adaptor.addChild(root_0, BOOL84_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:172:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL85=(Token)match(input,NULL,FOLLOW_NULL_in_atom765); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL85_tree = 
                    (AttoTree)adaptor.create(NULL85)
                    ;
                    adaptor.addChild(root_0, NULL85_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:173:4: OPEN_PARENT expr CLOSE_PARENT
                    {
                    OPEN_PARENT86=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_atom770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PARENT.add(OPEN_PARENT86);


                    pushFollow(FOLLOW_expr_in_atom772);
                    expr87=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr87.getTree());

                    CLOSE_PARENT88=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_atom774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PARENT.add(CLOSE_PARENT88);


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
                    // 173:34: -> expr
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
    // Atto.g:176:1: qname : NAME ( DOT ^ NAME )* ;
    public final AttoParser.qname_return qname() throws RecognitionException {
        AttoParser.qname_return retval = new AttoParser.qname_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME89=null;
        Token DOT90=null;
        Token NAME91=null;

        AttoTree NAME89_tree=null;
        AttoTree DOT90_tree=null;
        AttoTree NAME91_tree=null;

        try {
            // Atto.g:177:2: ( NAME ( DOT ^ NAME )* )
            // Atto.g:177:4: NAME ( DOT ^ NAME )*
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME89=(Token)match(input,NAME,FOLLOW_NAME_in_qname790); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME89_tree = 
            (AttoTree)adaptor.create(NAME89)
            ;
            adaptor.addChild(root_0, NAME89_tree);
            }

            // Atto.g:177:9: ( DOT ^ NAME )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DOT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Atto.g:177:10: DOT ^ NAME
            	    {
            	    DOT90=(Token)match(input,DOT,FOLLOW_DOT_in_qname793); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT90_tree = 
            	    (AttoTree)adaptor.create(DOT90)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(DOT90_tree, root_0);
            	    }

            	    NAME91=(Token)match(input,NAME,FOLLOW_NAME_in_qname796); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME91_tree = 
            	    (AttoTree)adaptor.create(NAME91)
            	    ;
            	    adaptor.addChild(root_0, NAME91_tree);
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
    // $ANTLR end "qname"


    public static class vardef_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vardef"
    // Atto.g:180:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME92=null;

        AttoTree NAME92_tree=null;

        try {
            // Atto.g:181:2: ( NAME )
            // Atto.g:181:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME92=(Token)match(input,NAME,FOLLOW_NAME_in_vardef809); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME92_tree = 
            (AttoTree)adaptor.create(NAME92)
            ;
            adaptor.addChild(root_0, NAME92_tree);
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
    // Atto.g:184:1: call : atom ( argsdef )+ -> ^( CALL atom ( argsdef )+ ) ;
    public final AttoParser.call_return call() throws RecognitionException {
        AttoParser.call_return retval = new AttoParser.call_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.atom_return atom93 =null;

        AttoParser.argsdef_return argsdef94 =null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_argsdef=new RewriteRuleSubtreeStream(adaptor,"rule argsdef");
        try {
            // Atto.g:185:2: ( atom ( argsdef )+ -> ^( CALL atom ( argsdef )+ ) )
            // Atto.g:185:4: atom ( argsdef )+
            {
            pushFollow(FOLLOW_atom_in_call822);
            atom93=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom.add(atom93.getTree());

            // Atto.g:185:9: ( argsdef )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OPEN_PARENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Atto.g:185:9: argsdef
            	    {
            	    pushFollow(FOLLOW_argsdef_in_call824);
            	    argsdef94=argsdef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_argsdef.add(argsdef94.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            // AST REWRITE
            // elements: argsdef, atom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 185:19: -> ^( CALL atom ( argsdef )+ )
            {
                // Atto.g:185:22: ^( CALL atom ( argsdef )+ )
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
    // Atto.g:188:1: argsdef : OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT -> ^( ARGSDEF ( expr )* ) ;
    public final AttoParser.argsdef_return argsdef() throws RecognitionException {
        AttoParser.argsdef_return retval = new AttoParser.argsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OPEN_PARENT95=null;
        Token COMMA97=null;
        Token CLOSE_PARENT99=null;
        AttoParser.expr_return expr96 =null;

        AttoParser.expr_return expr98 =null;


        AttoTree OPEN_PARENT95_tree=null;
        AttoTree COMMA97_tree=null;
        AttoTree CLOSE_PARENT99_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_PARENT=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENT");
        RewriteRuleTokenStream stream_CLOSE_PARENT=new RewriteRuleTokenStream(adaptor,"token CLOSE_PARENT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:189:2: ( OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT -> ^( ARGSDEF ( expr )* ) )
            // Atto.g:189:4: OPEN_PARENT ( expr ( COMMA expr )* )? CLOSE_PARENT
            {
            OPEN_PARENT95=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_argsdef848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_PARENT.add(OPEN_PARENT95);


            // Atto.g:189:16: ( expr ( COMMA expr )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==BOOL||LA27_0==FUN||LA27_0==IF||LA27_0==INT||LA27_0==MINUS||LA27_0==NAME||(LA27_0 >= NOT && LA27_0 <= NULL)||(LA27_0 >= OPEN_BRACKET && LA27_0 <= OPEN_S_BRACKET)||LA27_0==PRINT||LA27_0==STRING||LA27_0==WHILE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Atto.g:189:17: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_argsdef851);
                    expr96=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr96.getTree());

                    // Atto.g:189:22: ( COMMA expr )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==COMMA) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Atto.g:189:23: COMMA expr
                    	    {
                    	    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_argsdef854); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA97);


                    	    pushFollow(FOLLOW_expr_in_argsdef856);
                    	    expr98=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr98.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            CLOSE_PARENT99=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_argsdef862); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_PARENT.add(CLOSE_PARENT99);


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
            // 189:51: -> ^( ARGSDEF ( expr )* )
            {
                // Atto.g:189:54: ^( ARGSDEF ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARGSDEF, "ARGSDEF")
                , root_1);

                // Atto.g:189:64: ( expr )*
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
        // Atto.g:163:4: ( call )
        // Atto.g:163:5: call
        {
        pushFollow(FOLLOW_call_in_synpred1_Atto723);
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
        "\1\100\1\uffff\1\100\6\uffff\1\54\1\uffff\1\100";
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
            "\1\3\1\uffff\1\3\1\11\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\1"+
            "\uffff\1\3\1\uffff\1\3\3\uffff\11\3\1\uffff\4\3\2\uffff\2\3"+
            "\3\uffff\1\3\2\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\3\3\uffff\1\12\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\1\11\2\uffff\1\3\1\uffff\3\3\1\uffff\1\3\1"+
            "\uffff\1\3\1\uffff\1\3\3\uffff\11\3\1\uffff\4\3\2\uffff\2\3"+
            "\3\uffff\1\3\2\uffff\1\3"
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
            return "77:1: expr : ( fun | assign | or | if_ | while_ | obj | array | print );";
        }
    }
 

    public static final BitSet FOLLOW_stmt_in_root134 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_EOF_in_root137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt158 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block182 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INDENT_in_block184 = new BitSet(new long[]{0x221D920510100800L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_block186 = new BitSet(new long[]{0x221D920510100800L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEDENT_in_block189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_expr234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_expr239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_expr244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print255 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_print257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_obj277 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_pair_in_obj280 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_COMMA_in_obj283 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pair_in_obj285 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_COMMA_in_obj289 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_obj294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair314 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_pair316 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_pair319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_S_BRACKET_in_array331 = new BitSet(new long[]{0x221D920510008800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array334 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_COMMA_in_array337 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_array339 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_COMMA_in_array343 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSE_S_BRACKET_in_array348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_369 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_371 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_block_in_if_373 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_elif_in_if_375 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_else__in_if_378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif407 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_elif409 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_block_in_elif411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_433 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_block_in_else_435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_455 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_457 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_block_in_while_459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_assign481 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assign483 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_assign486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun497 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_paramsdef_in_fun499 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_fun501 = new BitSet(new long[]{0x221DD20510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_fun503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef525 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef528 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef530 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_expr_in_body553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or569 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_OR_in_or572 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_and_in_or575 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rel_in_and588 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and591 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_rel_in_and594 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel607 = new BitSet(new long[]{0x0000211064000002L});
    public static final BitSet FOLLOW_set_in_rel610 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_add_in_rel625 = new BitSet(new long[]{0x0000211064000002L});
    public static final BitSet FOLLOW_mul_in_add638 = new BitSet(new long[]{0x0100020000000002L});
    public static final BitSet FOLLOW_set_in_add641 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_mul_in_add648 = new BitSet(new long[]{0x0100020000000002L});
    public static final BitSet FOLLOW_unary_in_mul661 = new BitSet(new long[]{0x00000C0000400002L});
    public static final BitSet FOLLOW_set_in_mul664 = new BitSet(new long[]{0x2009920400000800L});
    public static final BitSet FOLLOW_unary_in_mul673 = new BitSet(new long[]{0x00000C0000400002L});
    public static final BitSet FOLLOW_primary_in_unary687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary692 = new BitSet(new long[]{0x2009100400000800L});
    public static final BitSet FOLLOW_primary_in_unary695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary700 = new BitSet(new long[]{0x2009100400000800L});
    public static final BitSet FOLLOW_primary_in_unary702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_primary727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_primary732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_atom744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_atom760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_atom770 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom772 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_atom774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_qname790 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_qname793 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_qname796 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NAME_in_vardef809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_call822 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_argsdef_in_call824 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_argsdef848 = new BitSet(new long[]{0x221D920510004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_argsdef851 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_COMMA_in_argsdef854 = new BitSet(new long[]{0x221D920510000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_argsdef856 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_argsdef862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_synpred1_Atto723 = new BitSet(new long[]{0x0000000000000002L});

}