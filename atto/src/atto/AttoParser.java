// $ANTLR 3.4 Atto.g 2012-08-28 17:17:10

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "COLON", "COMMA", "COMMENT", "COMPOSITE", "CONSTANT", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "FIELD_ACCESS", "FLOAT", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "INT", "INTEGER", "LBRACK", "LCURLY", "LE", "LEADING_WS", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OR", "PARAMS", "PIPELINE", "PLUS", "PROP", "RBRACK", "RCURLY", "RPAREN", "SEMICOLON", "SEND", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__68=68;
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
    public static final int PROP=55;
    public static final int RBRACK=56;
    public static final int RCURLY=57;
    public static final int RPAREN=58;
    public static final int SEMICOLON=59;
    public static final int SEND=60;
    public static final int SPACE=61;
    public static final int STMT=62;
    public static final int STRING=63;
    public static final int UNARY_MINUS=64;
    public static final int UPPER=65;
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
            pushFollow(FOLLOW_expr_in_stmt154);
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
    // Atto.g:73:1: block : INDENT ( ( stmt )* -> ^( BLOCK ( stmt )* ) | pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* -> ^( OBJ ( pair )+ ) ) DEDENT ;
    public final AttoParser.block_return block() throws RecognitionException {
        AttoParser.block_return retval = new AttoParser.block_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token INDENT5=null;
        Token NEWLINE8=null;
        Token COMMA9=null;
        Token NEWLINE11=null;
        Token DEDENT12=null;
        AttoParser.stmt_return stmt6 =null;

        AttoParser.pair_return pair7 =null;

        AttoParser.pair_return pair10 =null;


        AttoTree INDENT5_tree=null;
        AttoTree NEWLINE8_tree=null;
        AttoTree COMMA9_tree=null;
        AttoTree NEWLINE11_tree=null;
        AttoTree DEDENT12_tree=null;
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // Atto.g:74:2: ( INDENT ( ( stmt )* -> ^( BLOCK ( stmt )* ) | pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* -> ^( OBJ ( pair )+ ) ) DEDENT )
            // Atto.g:74:4: INDENT ( ( stmt )* -> ^( BLOCK ( stmt )* ) | pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* -> ^( OBJ ( pair )+ ) ) DEDENT
            {
            INDENT5=(Token)match(input,INDENT,FOLLOW_INDENT_in_block180); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT5);


            // Atto.g:75:4: ( ( stmt )* -> ^( BLOCK ( stmt )* ) | pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* -> ^( OBJ ( pair )+ ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NAME) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==COLON) ) {
                    alt8=2;
                }
                else if ( (LA8_1==AND||(LA8_1 >= ARROW && LA8_1 <= AT)||LA8_1==BOOL||LA8_1==COMMA||LA8_1==COMPOSITE||LA8_1==DEDENT||(LA8_1 >= DIV && LA8_1 <= DOT)||LA8_1==EQ||(LA8_1 >= GE && LA8_1 <= GT)||LA8_1==IF||LA8_1==INT||(LA8_1 >= LBRACK && LA8_1 <= LE)||(LA8_1 >= LPAREN && LA8_1 <= NULL)||LA8_1==OR||(LA8_1 >= PIPELINE && LA8_1 <= PLUS)||LA8_1==STRING||LA8_1==WHILE) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA8_0==ARROW||LA8_0==AT||LA8_0==BOOL||LA8_0==DEDENT||LA8_0==IF||LA8_0==INT||(LA8_0 >= LBRACK && LA8_0 <= LCURLY)||LA8_0==LPAREN||LA8_0==MINUS||(LA8_0 >= NOT && LA8_0 <= NULL)||LA8_0==STRING||LA8_0==WHILE) ) {
                alt8=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Atto.g:75:6: ( stmt )*
                    {
                    // Atto.g:75:6: ( stmt )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ARROW||LA3_0==AT||LA3_0==BOOL||LA3_0==IF||LA3_0==INT||(LA3_0 >= LBRACK && LA3_0 <= LCURLY)||LA3_0==LPAREN||LA3_0==MINUS||LA3_0==NAME||(LA3_0 >= NOT && LA3_0 <= NULL)||LA3_0==STRING||LA3_0==WHILE) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Atto.g:75:6: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_block188);
                    	    stmt6=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stmt.add(stmt6.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


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
                    // 75:12: -> ^( BLOCK ( stmt )* )
                    {
                        // Atto.g:75:15: ^( BLOCK ( stmt )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(BLOCK, "BLOCK")
                        , root_1);

                        // Atto.g:75:23: ( stmt )*
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
                    break;
                case 2 :
                    // Atto.g:76:6: pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )*
                    {
                    pushFollow(FOLLOW_pair_in_block205);
                    pair7=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair7.getTree());

                    // Atto.g:76:11: ( NEWLINE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NEWLINE) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Atto.g:76:11: NEWLINE
                            {
                            NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block207); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE8);


                            }
                            break;

                    }


                    // Atto.g:76:20: ( ( COMMA )? pair ( NEWLINE )? )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA||LA7_0==NAME) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Atto.g:76:21: ( COMMA )? pair ( NEWLINE )?
                    	    {
                    	    // Atto.g:76:21: ( COMMA )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==COMMA) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // Atto.g:76:21: COMMA
                    	            {
                    	            COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_block211); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA9);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_block214);
                    	    pair10=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair10.getTree());

                    	    // Atto.g:76:33: ( NEWLINE )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==NEWLINE) ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // Atto.g:76:33: NEWLINE
                    	            {
                    	            NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block216); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE11);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


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
                    // 76:44: -> ^( OBJ ( pair )+ )
                    {
                        // Atto.g:76:47: ^( OBJ ( pair )+ )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(OBJ, "OBJ")
                        , root_1);

                        if ( !(stream_pair.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
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
                    break;

            }


            DEDENT12=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEDENT.add(DEDENT12);


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

        AttoParser.assign_return assign13 =null;

        AttoParser.fun_return fun14 =null;

        AttoParser.if__return if_15 =null;

        AttoParser.while__return while_16 =null;

        AttoParser.or_return or17 =null;



        try {
            // Atto.g:82:2: ( ( assign )=> assign | ( fun )=> fun | if_ | while_ | or )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NAME) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (synpred2_Atto()) ) {
                    alt9=2;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==AT) ) {
                int LA9_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==INT) ) {
                int LA9_3 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==STRING) ) {
                int LA9_4 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==BOOL) ) {
                int LA9_5 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==NULL) ) {
                int LA9_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==LPAREN) ) {
                int LA9_7 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (synpred2_Atto()) ) {
                    alt9=2;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==LCURLY) ) {
                int LA9_8 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==LBRACK) ) {
                int LA9_9 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==ARROW) && (synpred2_Atto())) {
                alt9=2;
            }
            else if ( (LA9_0==IF) ) {
                alt9=3;
            }
            else if ( (LA9_0==WHILE) ) {
                alt9=4;
            }
            else if ( (LA9_0==MINUS||LA9_0==NOT) ) {
                alt9=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Atto.g:82:4: ( assign )=> assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr255);
                    assign13=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign13.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:83:4: ( fun )=> fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_expr265);
                    fun14=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun14.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:84:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr270);
                    if_15=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_15.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:85:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr275);
                    while_16=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_16.getTree());

                    }
                    break;
                case 5 :
                    // Atto.g:86:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr280);
                    or17=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or17.getTree());

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
    // Atto.g:89:1: assign : postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) ) ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN19=null;
        Token PLUS21=null;
        Token ASSIGN22=null;
        Token MINUS24=null;
        Token ASSIGN25=null;
        Token MUL27=null;
        Token ASSIGN28=null;
        Token DIV30=null;
        Token ASSIGN31=null;
        Token MOD33=null;
        Token ASSIGN34=null;
        AttoParser.postfix_return postfix18 =null;

        AttoParser.body_return body20 =null;

        AttoParser.body_return body23 =null;

        AttoParser.body_return body26 =null;

        AttoParser.body_return body29 =null;

        AttoParser.body_return body32 =null;

        AttoParser.body_return body35 =null;


        AttoTree ASSIGN19_tree=null;
        AttoTree PLUS21_tree=null;
        AttoTree ASSIGN22_tree=null;
        AttoTree MINUS24_tree=null;
        AttoTree ASSIGN25_tree=null;
        AttoTree MUL27_tree=null;
        AttoTree ASSIGN28_tree=null;
        AttoTree DIV30_tree=null;
        AttoTree ASSIGN31_tree=null;
        AttoTree MOD33_tree=null;
        AttoTree ASSIGN34_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_MOD=new RewriteRuleTokenStream(adaptor,"token MOD");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:90:2: ( postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) ) )
            // Atto.g:90:4: postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) )
            {
            pushFollow(FOLLOW_postfix_in_assign291);
            postfix18=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfix.add(postfix18.getTree());

            // Atto.g:91:4: ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ASSIGN) ) {
                alt11=1;
            }
            else if ( (LA11_0==DIV||(LA11_0 >= MINUS && LA11_0 <= MUL)||LA11_0==PLUS) ) {
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
                    // Atto.g:91:6: ASSIGN body
                    {
                    ASSIGN19=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN19);


                    pushFollow(FOLLOW_body_in_assign301);
                    body20=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body20.getTree());

                    // AST REWRITE
                    // elements: body, postfix, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 91:18: -> ^( ASSIGN postfix body )
                    {
                        // Atto.g:91:21: ^( ASSIGN postfix body )
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
                    // Atto.g:92:6: ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) )
                    {
                    // Atto.g:92:6: ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) )
                    int alt10=5;
                    switch ( input.LA(1) ) {
                    case PLUS:
                        {
                        alt10=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt10=2;
                        }
                        break;
                    case MUL:
                        {
                        alt10=3;
                        }
                        break;
                    case DIV:
                        {
                        alt10=4;
                        }
                        break;
                    case MOD:
                        {
                        alt10=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }

                    switch (alt10) {
                        case 1 :
                            // Atto.g:92:8: PLUS ASSIGN body
                            {
                            PLUS21=(Token)match(input,PLUS,FOLLOW_PLUS_in_assign320); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PLUS.add(PLUS21);


                            ASSIGN22=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign322); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN22);


                            pushFollow(FOLLOW_body_in_assign324);
                            body23=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body23.getTree());

                            // AST REWRITE
                            // elements: ASSIGN, postfix, postfix, PLUS, body
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 92:25: -> ^( ASSIGN postfix ^( PLUS postfix body ) )
                            {
                                // Atto.g:92:28: ^( ASSIGN postfix ^( PLUS postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:92:45: ^( PLUS postfix body )
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
                            // Atto.g:93:8: MINUS ASSIGN body
                            {
                            MINUS24=(Token)match(input,MINUS,FOLLOW_MINUS_in_assign349); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MINUS.add(MINUS24);


                            ASSIGN25=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign351); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN25);


                            pushFollow(FOLLOW_body_in_assign353);
                            body26=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body26.getTree());

                            // AST REWRITE
                            // elements: postfix, postfix, MINUS, ASSIGN, body
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 93:26: -> ^( ASSIGN postfix ^( MINUS postfix body ) )
                            {
                                // Atto.g:93:29: ^( ASSIGN postfix ^( MINUS postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:93:46: ^( MINUS postfix body )
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
                            // Atto.g:94:8: MUL ASSIGN body
                            {
                            MUL27=(Token)match(input,MUL,FOLLOW_MUL_in_assign378); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MUL.add(MUL27);


                            ASSIGN28=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign380); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN28);


                            pushFollow(FOLLOW_body_in_assign382);
                            body29=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body29.getTree());

                            // AST REWRITE
                            // elements: MUL, ASSIGN, postfix, postfix, body
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 94:24: -> ^( ASSIGN postfix ^( MUL postfix body ) )
                            {
                                // Atto.g:94:27: ^( ASSIGN postfix ^( MUL postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:94:44: ^( MUL postfix body )
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
                            // Atto.g:95:8: DIV ASSIGN body
                            {
                            DIV30=(Token)match(input,DIV,FOLLOW_DIV_in_assign407); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIV.add(DIV30);


                            ASSIGN31=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign409); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN31);


                            pushFollow(FOLLOW_body_in_assign411);
                            body32=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body32.getTree());

                            // AST REWRITE
                            // elements: postfix, ASSIGN, postfix, DIV, body
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 95:24: -> ^( ASSIGN postfix ^( DIV postfix body ) )
                            {
                                // Atto.g:95:27: ^( ASSIGN postfix ^( DIV postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:95:44: ^( DIV postfix body )
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
                            // Atto.g:96:8: MOD ASSIGN body
                            {
                            MOD33=(Token)match(input,MOD,FOLLOW_MOD_in_assign436); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MOD.add(MOD33);


                            ASSIGN34=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign438); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN34);


                            pushFollow(FOLLOW_body_in_assign440);
                            body35=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body35.getTree());

                            // AST REWRITE
                            // elements: MOD, body, postfix, postfix, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 96:24: -> ^( ASSIGN postfix ^( MOD postfix body ) )
                            {
                                // Atto.g:96:27: ^( ASSIGN postfix ^( MOD postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:96:44: ^( MOD postfix body )
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
    // Atto.g:101:1: fun : paramsdef ARROW ^ body ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ARROW37=null;
        AttoParser.paramsdef_return paramsdef36 =null;

        AttoParser.body_return body38 =null;


        AttoTree ARROW37_tree=null;

        try {
            // Atto.g:102:2: ( paramsdef ARROW ^ body )
            // Atto.g:102:4: paramsdef ARROW ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_paramsdef_in_fun480);
            paramsdef36=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramsdef36.getTree());

            ARROW37=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARROW37_tree = 
            (AttoTree)adaptor.create(ARROW37)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ARROW37_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_fun485);
            body38=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body38.getTree());

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
    // Atto.g:105:1: paramsdef : ( ( vardef ( ( COMMA )? vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( ( COMMA )? vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) );
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA40=null;
        Token LPAREN42=null;
        Token COMMA44=null;
        Token RPAREN46=null;
        AttoParser.vardef_return vardef39 =null;

        AttoParser.vardef_return vardef41 =null;

        AttoParser.vardef_return vardef43 =null;

        AttoParser.vardef_return vardef45 =null;


        AttoTree COMMA40_tree=null;
        AttoTree LPAREN42_tree=null;
        AttoTree COMMA44_tree=null;
        AttoTree RPAREN46_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:106:2: ( ( vardef ( ( COMMA )? vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( ( COMMA )? vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ARROW||LA18_0==NAME) ) {
                alt18=1;
            }
            else if ( (LA18_0==LPAREN) ) {
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
                    // Atto.g:106:4: ( vardef ( ( COMMA )? vardef )* )?
                    {
                    // Atto.g:106:4: ( vardef ( ( COMMA )? vardef )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NAME) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Atto.g:106:5: vardef ( ( COMMA )? vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef497);
                            vardef39=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef39.getTree());

                            // Atto.g:106:12: ( ( COMMA )? vardef )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==COMMA||LA13_0==NAME) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // Atto.g:106:13: ( COMMA )? vardef
                            	    {
                            	    // Atto.g:106:13: ( COMMA )?
                            	    int alt12=2;
                            	    int LA12_0 = input.LA(1);

                            	    if ( (LA12_0==COMMA) ) {
                            	        alt12=1;
                            	    }
                            	    switch (alt12) {
                            	        case 1 :
                            	            // Atto.g:106:13: COMMA
                            	            {
                            	            COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef500); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA40);


                            	            }
                            	            break;

                            	    }


                            	    pushFollow(FOLLOW_vardef_in_paramsdef503);
                            	    vardef41=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef41.getTree());

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
                    // 106:31: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:106:34: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:106:43: ( vardef )*
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
                    // Atto.g:107:4: LPAREN ( vardef ( ( COMMA )? vardef )* )? RPAREN
                    {
                    LPAREN42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paramsdef521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN42);


                    // Atto.g:107:11: ( vardef ( ( COMMA )? vardef )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NAME) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Atto.g:107:12: vardef ( ( COMMA )? vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef524);
                            vardef43=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef43.getTree());

                            // Atto.g:107:19: ( ( COMMA )? vardef )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==COMMA||LA16_0==NAME) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // Atto.g:107:20: ( COMMA )? vardef
                            	    {
                            	    // Atto.g:107:20: ( COMMA )?
                            	    int alt15=2;
                            	    int LA15_0 = input.LA(1);

                            	    if ( (LA15_0==COMMA) ) {
                            	        alt15=1;
                            	    }
                            	    switch (alt15) {
                            	        case 1 :
                            	            // Atto.g:107:20: COMMA
                            	            {
                            	            COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef527); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA44);


                            	            }
                            	            break;

                            	    }


                            	    pushFollow(FOLLOW_vardef_in_paramsdef530);
                            	    vardef45=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef45.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN46=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paramsdef536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN46);


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
                    // 107:45: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:107:48: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:107:57: ( vardef )*
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
    // Atto.g:110:1: body : ( expr | NEWLINE block -> block );
    public final AttoParser.body_return body() throws RecognitionException {
        AttoParser.body_return retval = new AttoParser.body_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NEWLINE48=null;
        AttoParser.expr_return expr47 =null;

        AttoParser.block_return block49 =null;


        AttoTree NEWLINE48_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:111:2: ( expr | NEWLINE block -> block )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ARROW||LA19_0==AT||LA19_0==BOOL||LA19_0==IF||LA19_0==INT||(LA19_0 >= LBRACK && LA19_0 <= LCURLY)||LA19_0==LPAREN||LA19_0==MINUS||LA19_0==NAME||(LA19_0 >= NOT && LA19_0 <= NULL)||LA19_0==STRING||LA19_0==WHILE) ) {
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
                    // Atto.g:111:5: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_body558);
                    expr47=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr47.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:112:5: NEWLINE block
                    {
                    NEWLINE48=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_body564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE48);


                    pushFollow(FOLLOW_block_in_body566);
                    block49=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block49.getTree());

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
                    // 112:19: -> block
                    {
                        adaptor.addChild(root_0, stream_block.nextTree());

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
    // $ANTLR end "body"


    public static class if__return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_"
    // Atto.g:115:1: if_ : 'if' cond_expr= expr ( NEWLINE block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal50=null;
        Token NEWLINE51=null;
        Token string_literal55=null;
        Token string_literal56=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block52 =null;

        AttoParser.elif_return elif53 =null;

        AttoParser.else__return else_54 =null;


        AttoTree string_literal50_tree=null;
        AttoTree NEWLINE51_tree=null;
        AttoTree string_literal55_tree=null;
        AttoTree string_literal56_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:116:2: ( 'if' cond_expr= expr ( NEWLINE block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:116:4: 'if' cond_expr= expr ( NEWLINE block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal50=(Token)match(input,IF,FOLLOW_IF_in_if_583); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal50);


            pushFollow(FOLLOW_expr_in_if_587);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:117:4: ( NEWLINE block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==NEWLINE) ) {
                alt23=1;
            }
            else if ( (LA23_0==68) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Atto.g:117:6: NEWLINE block ( elif )* ( else_ )?
                    {
                    NEWLINE51=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE51);


                    pushFollow(FOLLOW_block_in_if_597);
                    block52=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block52.getTree());

                    // Atto.g:117:20: ( elif )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==ELIF) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Atto.g:117:20: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_599);
                    	    elif53=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif53.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    // Atto.g:117:26: ( else_ )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ELSE) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==NEWLINE) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // Atto.g:117:26: else_
                            {
                            pushFollow(FOLLOW_else__in_if_602);
                            else_54=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_54.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: else_, cond_expr, elif, block
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
                    // 118:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:118:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:118:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:118:36: ( else_ )?
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
                    // Atto.g:119:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal55=(Token)match(input,68,FOLLOW_68_in_if_632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal55);


                    pushFollow(FOLLOW_expr_in_if_636);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:119:28: ( 'else' else_expr= expr )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==ELSE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Atto.g:119:29: 'else' else_expr= expr
                            {
                            string_literal56=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_639); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal56);


                            pushFollow(FOLLOW_expr_in_if_643);
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
                    // 120:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:120:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:120:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:120:35: ^( ELSE $else_expr)
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
    // Atto.g:124:1: elif : 'elif' expr NEWLINE block -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal57=null;
        Token NEWLINE59=null;
        AttoParser.expr_return expr58 =null;

        AttoParser.block_return block60 =null;


        AttoTree string_literal57_tree=null;
        AttoTree NEWLINE59_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:125:2: ( 'elif' expr NEWLINE block -> ^( ELIF expr block ) )
            // Atto.g:125:4: 'elif' expr NEWLINE block
            {
            string_literal57=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif687); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal57);


            pushFollow(FOLLOW_expr_in_elif689);
            expr58=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr58.getTree());

            NEWLINE59=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE59);


            pushFollow(FOLLOW_block_in_elif693);
            block60=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block60.getTree());

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
            // 125:30: -> ^( ELIF expr block )
            {
                // Atto.g:125:33: ^( ELIF expr block )
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
    // Atto.g:128:1: else_ : 'else' NEWLINE block -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal61=null;
        Token NEWLINE62=null;
        AttoParser.block_return block63 =null;


        AttoTree string_literal61_tree=null;
        AttoTree NEWLINE62_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:129:2: ( 'else' NEWLINE block -> ^( ELSE block ) )
            // Atto.g:129:4: 'else' NEWLINE block
            {
            string_literal61=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_714); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal61);


            NEWLINE62=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_716); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE62);


            pushFollow(FOLLOW_block_in_else_718);
            block63=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block63.getTree());

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
            // 129:25: -> ^( ELSE block )
            {
                // Atto.g:129:28: ^( ELSE block )
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
    // Atto.g:132:1: while_ : 'while' cond_expr= expr ( NEWLINE block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal64=null;
        Token NEWLINE65=null;
        Token string_literal67=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block66 =null;


        AttoTree string_literal64_tree=null;
        AttoTree NEWLINE65_tree=null;
        AttoTree string_literal67_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:133:2: ( 'while' cond_expr= expr ( NEWLINE block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:133:4: 'while' cond_expr= expr ( NEWLINE block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal64=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_738); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal64);


            pushFollow(FOLLOW_expr_in_while_742);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:134:4: ( NEWLINE block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NEWLINE) ) {
                alt24=1;
            }
            else if ( (LA24_0==68) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // Atto.g:134:6: NEWLINE block
                    {
                    NEWLINE65=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE65);


                    pushFollow(FOLLOW_block_in_while_752);
                    block66=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block66.getTree());

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
                    // 134:20: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:134:23: ^( WHILE $cond_expr block )
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
                    // Atto.g:135:6: 'then' then_expr= expr
                    {
                    string_literal67=(Token)match(input,68,FOLLOW_68_in_while_770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal67);


                    pushFollow(FOLLOW_expr_in_while_774);
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
                    // 135:28: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:135:31: ^( WHILE $cond_expr $then_expr)
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
    // Atto.g:139:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR69=null;
        AttoParser.and_return and68 =null;

        AttoParser.and_return and70 =null;


        AttoTree OR69_tree=null;

        try {
            // Atto.g:140:2: ( and ( OR ^ and )* )
            // Atto.g:140:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or802);
            and68=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and68.getTree());

            // Atto.g:140:8: ( OR ^ and )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Atto.g:140:9: OR ^ and
            	    {
            	    OR69=(Token)match(input,OR,FOLLOW_OR_in_or805); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR69_tree = 
            	    (AttoTree)adaptor.create(OR69)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR69_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or808);
            	    and70=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and70.getTree());

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
    // $ANTLR end "or"


    public static class and_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and"
    // Atto.g:143:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND72=null;
        AttoParser.rel_return rel71 =null;

        AttoParser.rel_return rel73 =null;


        AttoTree AND72_tree=null;

        try {
            // Atto.g:144:2: ( rel ( AND ^ rel )* )
            // Atto.g:144:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and821);
            rel71=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel71.getTree());

            // Atto.g:144:8: ( AND ^ rel )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Atto.g:144:9: AND ^ rel
            	    {
            	    AND72=(Token)match(input,AND,FOLLOW_AND_in_and824); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND72_tree = 
            	    (AttoTree)adaptor.create(AND72)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND72_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and827);
            	    rel73=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel73.getTree());

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
    // $ANTLR end "and"


    public static class rel_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel"
    // Atto.g:147:1: rel : add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set75=null;
        AttoParser.add_return add74 =null;

        AttoParser.add_return add76 =null;


        AttoTree set75_tree=null;

        try {
            // Atto.g:148:2: ( add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* )
            // Atto.g:148:4: add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel840);
            add74=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add74.getTree());

            // Atto.g:148:8: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMPOSITE||LA27_0==EQ||(LA27_0 >= GE && LA27_0 <= GT)||LA27_0==LE||LA27_0==LT||LA27_0==NE||LA27_0==PIPELINE) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Atto.g:148:9: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add
            	    {
            	    set75=(Token)input.LT(1);

            	    set75=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE ) {
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


            	    pushFollow(FOLLOW_add_in_rel862);
            	    add76=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add76.getTree());

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
    // $ANTLR end "rel"


    public static class add_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // Atto.g:151:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set78=null;
        AttoParser.mul_return mul77 =null;

        AttoParser.mul_return mul79 =null;


        AttoTree set78_tree=null;

        try {
            // Atto.g:152:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:152:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add875);
            mul77=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul77.getTree());

            // Atto.g:152:8: ( ( PLUS | MINUS ) ^ mul )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS) ) {
                    alt28=1;
                }
                else if ( (LA28_0==PLUS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Atto.g:152:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set78=(Token)input.LT(1);

            	    set78=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
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


            	    pushFollow(FOLLOW_mul_in_add885);
            	    mul79=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul79.getTree());

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
    // $ANTLR end "add"


    public static class mul_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul"
    // Atto.g:155:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set81=null;
        AttoParser.unary_return unary80 =null;

        AttoParser.unary_return unary82 =null;


        AttoTree set81_tree=null;

        try {
            // Atto.g:156:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:156:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul898);
            unary80=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary80.getTree());

            // Atto.g:156:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==DIV||(LA29_0 >= MOD && LA29_0 <= MUL)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Atto.g:156:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set81=(Token)input.LT(1);

            	    set81=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set81)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mul910);
            	    unary82=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary82.getTree());

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
    // $ANTLR end "mul"


    public static class unary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // Atto.g:159:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT84=null;
        Token MINUS86=null;
        AttoParser.postfix_return postfix83 =null;

        AttoParser.postfix_return postfix85 =null;

        AttoParser.postfix_return postfix87 =null;


        AttoTree NOT84_tree=null;
        AttoTree MINUS86_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:160:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt30=3;
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
                alt30=1;
                }
                break;
            case NOT:
                {
                alt30=2;
                }
                break;
            case MINUS:
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
                    // Atto.g:160:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary924);
                    postfix83=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix83.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:161:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT84=(Token)match(input,NOT,FOLLOW_NOT_in_unary929); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT84_tree = 
                    (AttoTree)adaptor.create(NOT84)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT84_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary932);
                    postfix85=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix85.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:162:4: MINUS postfix
                    {
                    MINUS86=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS86);


                    pushFollow(FOLLOW_postfix_in_unary939);
                    postfix87=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix87.getTree());

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
                    // 162:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:162:21: ^( UNARY_MINUS postfix )
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
    // Atto.g:165:1: postfix : ( primary -> primary ) ( LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN89=null;
        Token COMMA91=null;
        Token RPAREN93=null;
        Token LBRACK94=null;
        Token RBRACK96=null;
        Token DOT97=null;
        AttoParser.primary_return p =null;

        AttoParser.primary_return primary88 =null;

        AttoParser.expr_return expr90 =null;

        AttoParser.expr_return expr92 =null;

        AttoParser.expr_return expr95 =null;


        AttoTree LPAREN89_tree=null;
        AttoTree COMMA91_tree=null;
        AttoTree RPAREN93_tree=null;
        AttoTree LBRACK94_tree=null;
        AttoTree RBRACK96_tree=null;
        AttoTree DOT97_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:166:2: ( ( primary -> primary ) ( LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* )
            // Atto.g:166:4: ( primary -> primary ) ( LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            {
            // Atto.g:166:4: ( primary -> primary )
            // Atto.g:166:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix961);
            primary88=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary88.getTree());

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
            // 166:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:167:4: ( LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            loop34:
            do {
                int alt34=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt34=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt34=2;
                    }
                    break;
                case DOT:
                    {
                    alt34=3;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // Atto.g:167:6: LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN
            	    {
            	    LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix974); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN89);


            	    // Atto.g:167:13: ( expr ( ( COMMA )? expr )* )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==ARROW||LA33_0==AT||LA33_0==BOOL||LA33_0==IF||LA33_0==INT||(LA33_0 >= LBRACK && LA33_0 <= LCURLY)||LA33_0==LPAREN||LA33_0==MINUS||LA33_0==NAME||(LA33_0 >= NOT && LA33_0 <= NULL)||LA33_0==STRING||LA33_0==WHILE) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // Atto.g:167:14: expr ( ( COMMA )? expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix977);
            	            expr90=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr90.getTree());

            	            // Atto.g:167:19: ( ( COMMA )? expr )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==ARROW||LA32_0==AT||LA32_0==BOOL||LA32_0==COMMA||LA32_0==IF||LA32_0==INT||(LA32_0 >= LBRACK && LA32_0 <= LCURLY)||LA32_0==LPAREN||LA32_0==MINUS||LA32_0==NAME||(LA32_0 >= NOT && LA32_0 <= NULL)||LA32_0==STRING||LA32_0==WHILE) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // Atto.g:167:20: ( COMMA )? expr
            	            	    {
            	            	    // Atto.g:167:20: ( COMMA )?
            	            	    int alt31=2;
            	            	    int LA31_0 = input.LA(1);

            	            	    if ( (LA31_0==COMMA) ) {
            	            	        alt31=1;
            	            	    }
            	            	    switch (alt31) {
            	            	        case 1 :
            	            	            // Atto.g:167:20: COMMA
            	            	            {
            	            	            COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix980); if (state.failed) return retval; 
            	            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA91);


            	            	            }
            	            	            break;

            	            	    }


            	            	    pushFollow(FOLLOW_expr_in_postfix983);
            	            	    expr92=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr92.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop32;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix989); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN93);


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
            	    // 168:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:168:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:168:24: ( expr )*
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
            	    // Atto.g:169:6: LBRACK expr RBRACK
            	    {
            	    LBRACK94=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix1013); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK94);


            	    pushFollow(FOLLOW_expr_in_postfix1015);
            	    expr95=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr95.getTree());

            	    RBRACK96=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix1017); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK96);


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
            	    // 170:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:170:8: ^( INDEX $postfix expr )
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
            	    // Atto.g:171:6: DOT p= primary
            	    {
            	    DOT97=(Token)match(input,DOT,FOLLOW_DOT_in_postfix1040); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT97);


            	    pushFollow(FOLLOW_primary_in_postfix1044);
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
            	    // 172:5: -> ^( FIELD_ACCESS $postfix $p)
            	    {
            	        // Atto.g:172:8: ^( FIELD_ACCESS $postfix $p)
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
    // $ANTLR end "postfix"


    public static class primary_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Atto.g:176:1: primary : ( NAME | AT ^ NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array | prop );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME98=null;
        Token AT99=null;
        Token NAME100=null;
        Token INT101=null;
        Token STRING102=null;
        Token BOOL103=null;
        Token NULL104=null;
        Token LPAREN105=null;
        Token RPAREN107=null;
        AttoParser.expr_return expr106 =null;

        AttoParser.obj_return obj108 =null;

        AttoParser.array_return array109 =null;

        AttoParser.prop_return prop110 =null;


        AttoTree NAME98_tree=null;
        AttoTree AT99_tree=null;
        AttoTree NAME100_tree=null;
        AttoTree INT101_tree=null;
        AttoTree STRING102_tree=null;
        AttoTree BOOL103_tree=null;
        AttoTree NULL104_tree=null;
        AttoTree LPAREN105_tree=null;
        AttoTree RPAREN107_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:177:2: ( NAME | AT ^ NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array | prop )
            int alt35=10;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt35=1;
                }
                break;
            case AT:
                {
                alt35=2;
                }
                break;
            case INT:
                {
                alt35=3;
                }
                break;
            case STRING:
                {
                alt35=4;
                }
                break;
            case BOOL:
                {
                alt35=5;
                }
                break;
            case NULL:
                {
                alt35=6;
                }
                break;
            case LPAREN:
                {
                alt35=7;
                }
                break;
            case LCURLY:
                {
                int LA35_8 = input.LA(2);

                if ( (LA35_8==COMMA||LA35_8==NAME||LA35_8==RCURLY) ) {
                    alt35=8;
                }
                else if ( (LA35_8==LCURLY) ) {
                    alt35=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 8, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                alt35=9;
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
                    // Atto.g:177:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME98=(Token)match(input,NAME,FOLLOW_NAME_in_primary1079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME98_tree = 
                    (AttoTree)adaptor.create(NAME98)
                    ;
                    adaptor.addChild(root_0, NAME98_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:178:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT99=(Token)match(input,AT,FOLLOW_AT_in_primary1084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT99_tree = 
                    (AttoTree)adaptor.create(AT99)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT99_tree, root_0);
                    }

                    NAME100=(Token)match(input,NAME,FOLLOW_NAME_in_primary1087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME100_tree = 
                    (AttoTree)adaptor.create(NAME100)
                    ;
                    adaptor.addChild(root_0, NAME100_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:179:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT101=(Token)match(input,INT,FOLLOW_INT_in_primary1093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT101_tree = 
                    (AttoTree)adaptor.create(INT101)
                    ;
                    adaptor.addChild(root_0, INT101_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:180:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING102=(Token)match(input,STRING,FOLLOW_STRING_in_primary1098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING102_tree = 
                    (AttoTree)adaptor.create(STRING102)
                    ;
                    adaptor.addChild(root_0, STRING102_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:181:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL103=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary1103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL103_tree = 
                    (AttoTree)adaptor.create(BOOL103)
                    ;
                    adaptor.addChild(root_0, BOOL103_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:182:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL104=(Token)match(input,NULL,FOLLOW_NULL_in_primary1108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL104_tree = 
                    (AttoTree)adaptor.create(NULL104)
                    ;
                    adaptor.addChild(root_0, NULL104_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:183:4: LPAREN expr RPAREN
                    {
                    LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN105);


                    pushFollow(FOLLOW_expr_in_primary1115);
                    expr106=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr106.getTree());

                    RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN107);


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
                    // 183:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:184:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary1126);
                    obj108=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj108.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:185:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary1131);
                    array109=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array109.getTree());

                    }
                    break;
                case 10 :
                    // Atto.g:186:4: prop
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_prop_in_primary1136);
                    prop110=prop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prop110.getTree());

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
    // Atto.g:189:1: obj : LCURLY ( pair ( ( COMMA )? pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY111=null;
        Token COMMA113=null;
        Token COMMA115=null;
        Token RCURLY116=null;
        AttoParser.pair_return pair112 =null;

        AttoParser.pair_return pair114 =null;


        AttoTree LCURLY111_tree=null;
        AttoTree COMMA113_tree=null;
        AttoTree COMMA115_tree=null;
        AttoTree RCURLY116_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:190:2: ( LCURLY ( pair ( ( COMMA )? pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:190:4: LCURLY ( pair ( ( COMMA )? pair )* )? ( COMMA )? RCURLY
            {
            LCURLY111=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj1148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY111);


            // Atto.g:190:11: ( pair ( ( COMMA )? pair )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==NAME) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Atto.g:190:12: pair ( ( COMMA )? pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj1151);
                    pair112=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair112.getTree());

                    // Atto.g:190:17: ( ( COMMA )? pair )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==COMMA) ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1==NAME) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0==NAME) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Atto.g:190:18: ( COMMA )? pair
                    	    {
                    	    // Atto.g:190:18: ( COMMA )?
                    	    int alt36=2;
                    	    int LA36_0 = input.LA(1);

                    	    if ( (LA36_0==COMMA) ) {
                    	        alt36=1;
                    	    }
                    	    switch (alt36) {
                    	        case 1 :
                    	            // Atto.g:190:18: COMMA
                    	            {
                    	            COMMA113=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1154); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA113);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_obj1157);
                    	    pair114=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair114.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:190:34: ( COMMA )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COMMA) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Atto.g:190:34: COMMA
                    {
                    COMMA115=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA115);


                    }
                    break;

            }


            RCURLY116=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj1166); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY116);


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
            // 190:48: -> ^( OBJ ( pair )* )
            {
                // Atto.g:190:51: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:190:57: ( pair )*
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
    // Atto.g:193:1: pair : NAME COLON ^ body ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME117=null;
        Token COLON118=null;
        AttoParser.body_return body119 =null;


        AttoTree NAME117_tree=null;
        AttoTree COLON118_tree=null;

        try {
            // Atto.g:194:2: ( NAME COLON ^ body )
            // Atto.g:194:4: NAME COLON ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME117=(Token)match(input,NAME,FOLLOW_NAME_in_pair1186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME117_tree = 
            (AttoTree)adaptor.create(NAME117)
            ;
            adaptor.addChild(root_0, NAME117_tree);
            }

            COLON118=(Token)match(input,COLON,FOLLOW_COLON_in_pair1188); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON118_tree = 
            (AttoTree)adaptor.create(COLON118)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON118_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_pair1191);
            body119=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body119.getTree());

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


    public static class prop_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prop"
    // Atto.g:197:1: prop : LCURLY obj RCURLY -> ^( PROP obj ) ;
    public final AttoParser.prop_return prop() throws RecognitionException {
        AttoParser.prop_return retval = new AttoParser.prop_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY120=null;
        Token RCURLY122=null;
        AttoParser.obj_return obj121 =null;


        AttoTree LCURLY120_tree=null;
        AttoTree RCURLY122_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_obj=new RewriteRuleSubtreeStream(adaptor,"rule obj");
        try {
            // Atto.g:198:2: ( LCURLY obj RCURLY -> ^( PROP obj ) )
            // Atto.g:198:4: LCURLY obj RCURLY
            {
            LCURLY120=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_prop1202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY120);


            pushFollow(FOLLOW_obj_in_prop1204);
            obj121=obj();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_obj.add(obj121.getTree());

            RCURLY122=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_prop1206); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY122);


            // AST REWRITE
            // elements: obj
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AttoTree)adaptor.nil();
            // 198:22: -> ^( PROP obj )
            {
                // Atto.g:198:25: ^( PROP obj )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(PROP, "PROP")
                , root_1);

                adaptor.addChild(root_1, stream_obj.nextTree());

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
    // $ANTLR end "prop"


    public static class array_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // Atto.g:201:1: array : LBRACK ( expr ( ( COMMA )? expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK123=null;
        Token COMMA125=null;
        Token COMMA127=null;
        Token RBRACK128=null;
        AttoParser.expr_return expr124 =null;

        AttoParser.expr_return expr126 =null;


        AttoTree LBRACK123_tree=null;
        AttoTree COMMA125_tree=null;
        AttoTree COMMA127_tree=null;
        AttoTree RBRACK128_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:202:2: ( LBRACK ( expr ( ( COMMA )? expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:202:4: LBRACK ( expr ( ( COMMA )? expr )* )? ( COMMA )? RBRACK
            {
            LBRACK123=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK123);


            // Atto.g:202:11: ( expr ( ( COMMA )? expr )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ARROW||LA42_0==AT||LA42_0==BOOL||LA42_0==IF||LA42_0==INT||(LA42_0 >= LBRACK && LA42_0 <= LCURLY)||LA42_0==LPAREN||LA42_0==MINUS||LA42_0==NAME||(LA42_0 >= NOT && LA42_0 <= NULL)||LA42_0==STRING||LA42_0==WHILE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Atto.g:202:12: expr ( ( COMMA )? expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1229);
                    expr124=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr124.getTree());

                    // Atto.g:202:17: ( ( COMMA )? expr )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==COMMA) ) {
                            int LA41_1 = input.LA(2);

                            if ( (LA41_1==ARROW||LA41_1==AT||LA41_1==BOOL||LA41_1==IF||LA41_1==INT||(LA41_1 >= LBRACK && LA41_1 <= LCURLY)||LA41_1==LPAREN||LA41_1==MINUS||LA41_1==NAME||(LA41_1 >= NOT && LA41_1 <= NULL)||LA41_1==STRING||LA41_1==WHILE) ) {
                                alt41=1;
                            }


                        }
                        else if ( (LA41_0==ARROW||LA41_0==AT||LA41_0==BOOL||LA41_0==IF||LA41_0==INT||(LA41_0 >= LBRACK && LA41_0 <= LCURLY)||LA41_0==LPAREN||LA41_0==MINUS||LA41_0==NAME||(LA41_0 >= NOT && LA41_0 <= NULL)||LA41_0==STRING||LA41_0==WHILE) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // Atto.g:202:18: ( COMMA )? expr
                    	    {
                    	    // Atto.g:202:18: ( COMMA )?
                    	    int alt40=2;
                    	    int LA40_0 = input.LA(1);

                    	    if ( (LA40_0==COMMA) ) {
                    	        alt40=1;
                    	    }
                    	    switch (alt40) {
                    	        case 1 :
                    	            // Atto.g:202:18: COMMA
                    	            {
                    	            COMMA125=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1232); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA125);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_expr_in_array1235);
                    	    expr126=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr126.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:202:35: ( COMMA )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==COMMA) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Atto.g:202:35: COMMA
                    {
                    COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA127);


                    }
                    break;

            }


            RBRACK128=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1245); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK128);


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
            // 202:49: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:202:52: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:202:60: ( expr )*
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
    // Atto.g:205:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME129=null;

        AttoTree NAME129_tree=null;

        try {
            // Atto.g:206:2: ( NAME )
            // Atto.g:206:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME129=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME129_tree = 
            (AttoTree)adaptor.create(NAME129)
            ;
            adaptor.addChild(root_0, NAME129_tree);
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
        pushFollow(FOLLOW_assign_in_synpred1_Atto251);
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
        pushFollow(FOLLOW_fun_in_synpred2_Atto261);
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


 

    public static final BitSet FOLLOW_stmt_in_root130 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_EOF_in_root133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt154 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_block180 = new BitSet(new long[]{0x8003250D20020540L,0x0000000000000004L});
    public static final BitSet FOLLOW_stmt_in_block188 = new BitSet(new long[]{0x8003250D20020540L,0x0000000000000004L});
    public static final BitSet FOLLOW_pair_in_block205 = new BitSet(new long[]{0x0000A00000022000L});
    public static final BitSet FOLLOW_NEWLINE_in_block207 = new BitSet(new long[]{0x0000200000022000L});
    public static final BitSet FOLLOW_COMMA_in_block211 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_pair_in_block214 = new BitSet(new long[]{0x0000A00000022000L});
    public static final BitSet FOLLOW_NEWLINE_in_block216 = new BitSet(new long[]{0x0000200000022000L});
    public static final BitSet FOLLOW_DEDENT_in_block239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign291 = new BitSet(new long[]{0x00401C0000080080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign299 = new BitSet(new long[]{0x8003A50D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_assign301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_assign320 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign322 = new BitSet(new long[]{0x8003A50D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_assign324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_assign349 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign351 = new BitSet(new long[]{0x8003A50D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_assign353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_assign378 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign380 = new BitSet(new long[]{0x8003A50D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_assign382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_assign407 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign409 = new BitSet(new long[]{0x8003A50D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_assign411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_assign436 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign438 = new BitSet(new long[]{0x8003A50D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_assign440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramsdef_in_fun480 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fun482 = new BitSet(new long[]{0x8003A50D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_fun485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef497 = new BitSet(new long[]{0x0000200000002002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef500 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef503 = new BitSet(new long[]{0x0000200000002002L});
    public static final BitSet FOLLOW_LPAREN_in_paramsdef521 = new BitSet(new long[]{0x0400200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef524 = new BitSet(new long[]{0x0400200000002000L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef527 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef530 = new BitSet(new long[]{0x0400200000002000L});
    public static final BitSet FOLLOW_RPAREN_in_paramsdef536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_body558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_body564 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_block_in_body566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_583 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_587 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_if_595 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_block_in_if_597 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elif_in_if_599 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_else__in_if_602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_if_632 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_636 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_639 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif687 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_elif689 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif691 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_block_in_elif693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_714 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_716 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_block_in_else_718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_738 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_742 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_while_750 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_block_in_while_752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_while_770 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or802 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_or805 = new BitSet(new long[]{0x8003250D00000500L});
    public static final BitSet FOLLOW_and_in_or808 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rel_in_and821 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and824 = new BitSet(new long[]{0x8003250D00000500L});
    public static final BitSet FOLLOW_rel_in_and827 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel840 = new BitSet(new long[]{0x002042100C808002L});
    public static final BitSet FOLLOW_set_in_rel843 = new BitSet(new long[]{0x8003250D00000500L});
    public static final BitSet FOLLOW_add_in_rel862 = new BitSet(new long[]{0x002042100C808002L});
    public static final BitSet FOLLOW_mul_in_add875 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_set_in_add878 = new BitSet(new long[]{0x8003250D00000500L});
    public static final BitSet FOLLOW_mul_in_add885 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_unary_in_mul898 = new BitSet(new long[]{0x0000180000080002L});
    public static final BitSet FOLLOW_set_in_mul901 = new BitSet(new long[]{0x8003250D00000500L});
    public static final BitSet FOLLOW_unary_in_mul910 = new BitSet(new long[]{0x0000180000080002L});
    public static final BitSet FOLLOW_postfix_in_unary924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary929 = new BitSet(new long[]{0x8002210D00000500L});
    public static final BitSet FOLLOW_postfix_in_unary932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary937 = new BitSet(new long[]{0x8002210D00000500L});
    public static final BitSet FOLLOW_postfix_in_unary939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix961 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix974 = new BitSet(new long[]{0x8403250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_postfix977 = new BitSet(new long[]{0x8403250D20002540L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_postfix980 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_postfix983 = new BitSet(new long[]{0x8403250D20002540L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_postfix989 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_LBRACK_in_postfix1013 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_postfix1015 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix1017 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_DOT_in_postfix1040 = new BitSet(new long[]{0x8002210D00000500L});
    public static final BitSet FOLLOW_primary_in_postfix1044 = new BitSet(new long[]{0x0000010400100002L});
    public static final BitSet FOLLOW_NAME_in_primary1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary1084 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_NAME_in_primary1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary1113 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_primary1115 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prop_in_primary1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj1148 = new BitSet(new long[]{0x0200200000002000L});
    public static final BitSet FOLLOW_pair_in_obj1151 = new BitSet(new long[]{0x0200200000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj1154 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_pair_in_obj1157 = new BitSet(new long[]{0x0200200000002000L});
    public static final BitSet FOLLOW_COMMA_in_obj1163 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair1186 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_pair1188 = new BitSet(new long[]{0x8003A50D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_pair1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_prop1202 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_obj_in_prop1204 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_prop1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1226 = new BitSet(new long[]{0x8103250D20002540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_array1229 = new BitSet(new long[]{0x8103250D20002540L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_array1232 = new BitSet(new long[]{0x8003250D20000540L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_array1235 = new BitSet(new long[]{0x8103250D20002540L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_array1242 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_vardef1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_synpred2_Atto261 = new BitSet(new long[]{0x0000000000000002L});

}