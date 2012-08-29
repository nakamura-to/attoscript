// $ANTLR 3.4 Atto.g 2012-08-29 21:33:42

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ARROW", "ASSIGN", "AT", "BLOCK", "BOOL", "CALL", "CLASS", "COLON", "COMMA", "COMMENT", "COMPOSITE", "DEDENT", "DIGIT", "DIV", "DOT", "ELIF", "ELSE", "EQ", "EXTENDS", "FIELD_ACCESS", "FLOAT", "GE", "GT", "ID_CHAR", "IF", "INDENT", "INDEX", "INT", "INTEGER", "LBRACK", "LCURLY", "LE", "LEADING_WS", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NAME", "NE", "NEWLINE", "NOT", "NULL", "OBJ", "OR", "PARAMS", "PIPELINE", "PLUS", "PROP", "RBRACK", "RCURLY", "RPAREN", "SEMICOLON", "SEND", "SPACE", "STMT", "STRING", "UNARY_MINUS", "UPPER", "WHILE", "WS", "'then'"
    };

    public static final int EOF=-1;
    public static final int T__69=69;
    public static final int AND=4;
    public static final int ARRAY=5;
    public static final int ARROW=6;
    public static final int ASSIGN=7;
    public static final int AT=8;
    public static final int BLOCK=9;
    public static final int BOOL=10;
    public static final int CALL=11;
    public static final int CLASS=12;
    public static final int COLON=13;
    public static final int COMMA=14;
    public static final int COMMENT=15;
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
    public static final int FLOAT=26;
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
    public static final int PIPELINE=54;
    public static final int PLUS=55;
    public static final int PROP=56;
    public static final int RBRACK=57;
    public static final int RCURLY=58;
    public static final int RPAREN=59;
    public static final int SEMICOLON=60;
    public static final int SEND=61;
    public static final int SPACE=62;
    public static final int STMT=63;
    public static final int STRING=64;
    public static final int UNARY_MINUS=65;
    public static final int UPPER=66;
    public static final int WHILE=67;
    public static final int WS=68;

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
    // Atto.g:66:1: root : ( stmt )* -> ^( BLOCK ( stmt )* ) ;
    public final AttoParser.root_return root() throws RecognitionException {
        AttoParser.root_return retval = new AttoParser.root_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.stmt_return stmt1 =null;


        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // Atto.g:67:2: ( ( stmt )* -> ^( BLOCK ( stmt )* ) )
            // Atto.g:67:4: ( stmt )*
            {
            // Atto.g:67:4: ( stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ARROW||LA1_0==AT||LA1_0==BOOL||LA1_0==CLASS||LA1_0==IF||LA1_0==INT||(LA1_0 >= LBRACK && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NAME||(LA1_0 >= NOT && LA1_0 <= NULL)||LA1_0==STRING||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Atto.g:67:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_root141);
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
            // 67:10: -> ^( BLOCK ( stmt )* )
            {
                // Atto.g:67:13: ^( BLOCK ( stmt )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // Atto.g:67:21: ( stmt )*
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
    // Atto.g:70:1: stmt : ( expr ( SEMICOLON )? ( NEWLINE )? -> ^( STMT expr ) | 'class' c= NAME ( 'extends' e= NAME )? NEWLINE INDENT pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* DEDENT -> ^( CLASS $c ^( EXTENDS ( $e)? ) ^( OBJ ( pair )+ ) ) );
    public final AttoParser.stmt_return stmt() throws RecognitionException {
        AttoParser.stmt_return retval = new AttoParser.stmt_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token c=null;
        Token e=null;
        Token SEMICOLON3=null;
        Token NEWLINE4=null;
        Token string_literal5=null;
        Token string_literal6=null;
        Token NEWLINE7=null;
        Token INDENT8=null;
        Token NEWLINE10=null;
        Token COMMA11=null;
        Token NEWLINE13=null;
        Token DEDENT14=null;
        AttoParser.expr_return expr2 =null;

        AttoParser.pair_return pair9 =null;

        AttoParser.pair_return pair12 =null;


        AttoTree c_tree=null;
        AttoTree e_tree=null;
        AttoTree SEMICOLON3_tree=null;
        AttoTree NEWLINE4_tree=null;
        AttoTree string_literal5_tree=null;
        AttoTree string_literal6_tree=null;
        AttoTree NEWLINE7_tree=null;
        AttoTree INDENT8_tree=null;
        AttoTree NEWLINE10_tree=null;
        AttoTree COMMA11_tree=null;
        AttoTree NEWLINE13_tree=null;
        AttoTree DEDENT14_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:71:2: ( expr ( SEMICOLON )? ( NEWLINE )? -> ^( STMT expr ) | 'class' c= NAME ( 'extends' e= NAME )? NEWLINE INDENT pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* DEDENT -> ^( CLASS $c ^( EXTENDS ( $e)? ) ^( OBJ ( pair )+ ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ARROW||LA9_0==AT||LA9_0==BOOL||LA9_0==IF||LA9_0==INT||(LA9_0 >= LBRACK && LA9_0 <= LCURLY)||LA9_0==LPAREN||LA9_0==MINUS||LA9_0==NAME||(LA9_0 >= NOT && LA9_0 <= NULL)||LA9_0==STRING||LA9_0==WHILE) ) {
                alt9=1;
            }
            else if ( (LA9_0==CLASS) ) {
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
                    // Atto.g:71:4: expr ( SEMICOLON )? ( NEWLINE )?
                    {
                    pushFollow(FOLLOW_expr_in_stmt163);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr2.getTree());

                    // Atto.g:71:9: ( SEMICOLON )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==SEMICOLON) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Atto.g:71:10: SEMICOLON
                            {
                            SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt166); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON3);


                            }
                            break;

                    }


                    // Atto.g:71:22: ( NEWLINE )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==NEWLINE) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Atto.g:71:23: NEWLINE
                            {
                            NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt171); if (state.failed) return retval; 
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
                    // 72:3: -> ^( STMT expr )
                    {
                        // Atto.g:72:6: ^( STMT expr )
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
                    break;
                case 2 :
                    // Atto.g:73:4: 'class' c= NAME ( 'extends' e= NAME )? NEWLINE INDENT pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* DEDENT
                    {
                    string_literal5=(Token)match(input,CLASS,FOLLOW_CLASS_in_stmt189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(string_literal5);


                    c=(Token)match(input,NAME,FOLLOW_NAME_in_stmt193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAME.add(c);


                    // Atto.g:73:19: ( 'extends' e= NAME )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==EXTENDS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Atto.g:73:20: 'extends' e= NAME
                            {
                            string_literal6=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_stmt196); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EXTENDS.add(string_literal6);


                            e=(Token)match(input,NAME,FOLLOW_NAME_in_stmt200); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NAME.add(e);


                            }
                            break;

                    }


                    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE7);


                    INDENT8=(Token)match(input,INDENT,FOLLOW_INDENT_in_stmt210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INDENT.add(INDENT8);


                    pushFollow(FOLLOW_pair_in_stmt212);
                    pair9=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair9.getTree());

                    // Atto.g:74:16: ( NEWLINE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==NEWLINE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Atto.g:74:16: NEWLINE
                            {
                            NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt214); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE10);


                            }
                            break;

                    }


                    // Atto.g:74:25: ( ( COMMA )? pair ( NEWLINE )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA||LA8_0==NAME) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Atto.g:74:26: ( COMMA )? pair ( NEWLINE )?
                    	    {
                    	    // Atto.g:74:26: ( COMMA )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==COMMA) ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // Atto.g:74:26: COMMA
                    	            {
                    	            COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt218); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_stmt221);
                    	    pair12=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair12.getTree());

                    	    // Atto.g:74:38: ( NEWLINE )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==NEWLINE) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // Atto.g:74:38: NEWLINE
                    	            {
                    	            NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt223); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE13);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    DEDENT14=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_stmt228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEDENT.add(DEDENT14);


                    // AST REWRITE
                    // elements: c, pair, e
                    // token labels: e, c
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_e=new RewriteRuleTokenStream(adaptor,"token e",e);
                    RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 75:3: -> ^( CLASS $c ^( EXTENDS ( $e)? ) ^( OBJ ( pair )+ ) )
                    {
                        // Atto.g:75:6: ^( CLASS $c ^( EXTENDS ( $e)? ) ^( OBJ ( pair )+ ) )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(CLASS, "CLASS")
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextNode());

                        // Atto.g:75:17: ^( EXTENDS ( $e)? )
                        {
                        AttoTree root_2 = (AttoTree)adaptor.nil();
                        root_2 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(EXTENDS, "EXTENDS")
                        , root_2);

                        // Atto.g:75:28: ( $e)?
                        if ( stream_e.hasNext() ) {
                            adaptor.addChild(root_2, stream_e.nextNode());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Atto.g:75:32: ^( OBJ ( pair )+ )
                        {
                        AttoTree root_2 = (AttoTree)adaptor.nil();
                        root_2 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(OBJ, "OBJ")
                        , root_2);

                        if ( !(stream_pair.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_pair.hasNext() ) {
                            adaptor.addChild(root_2, stream_pair.nextTree());

                        }
                        stream_pair.reset();

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
    // Atto.g:78:1: block : INDENT ( ( stmt )* -> ^( BLOCK ( stmt )* ) | pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* -> ^( OBJ ( pair )+ ) ) DEDENT ;
    public final AttoParser.block_return block() throws RecognitionException {
        AttoParser.block_return retval = new AttoParser.block_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token INDENT15=null;
        Token NEWLINE18=null;
        Token COMMA19=null;
        Token NEWLINE21=null;
        Token DEDENT22=null;
        AttoParser.stmt_return stmt16 =null;

        AttoParser.pair_return pair17 =null;

        AttoParser.pair_return pair20 =null;


        AttoTree INDENT15_tree=null;
        AttoTree NEWLINE18_tree=null;
        AttoTree COMMA19_tree=null;
        AttoTree NEWLINE21_tree=null;
        AttoTree DEDENT22_tree=null;
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // Atto.g:79:2: ( INDENT ( ( stmt )* -> ^( BLOCK ( stmt )* ) | pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* -> ^( OBJ ( pair )+ ) ) DEDENT )
            // Atto.g:79:4: INDENT ( ( stmt )* -> ^( BLOCK ( stmt )* ) | pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* -> ^( OBJ ( pair )+ ) ) DEDENT
            {
            INDENT15=(Token)match(input,INDENT,FOLLOW_INDENT_in_block269); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT15);


            // Atto.g:80:4: ( ( stmt )* -> ^( BLOCK ( stmt )* ) | pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )* -> ^( OBJ ( pair )+ ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAME) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==COLON) ) {
                    alt15=2;
                }
                else if ( (LA15_1==AND||(LA15_1 >= ARROW && LA15_1 <= AT)||LA15_1==BOOL||LA15_1==CLASS||LA15_1==COMMA||(LA15_1 >= COMPOSITE && LA15_1 <= DEDENT)||(LA15_1 >= DIV && LA15_1 <= DOT)||LA15_1==EQ||(LA15_1 >= GE && LA15_1 <= GT)||LA15_1==IF||LA15_1==INT||(LA15_1 >= LBRACK && LA15_1 <= LE)||(LA15_1 >= LPAREN && LA15_1 <= NULL)||LA15_1==OR||(LA15_1 >= PIPELINE && LA15_1 <= PLUS)||LA15_1==SEMICOLON||LA15_1==STRING||LA15_1==WHILE) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA15_0==ARROW||LA15_0==AT||LA15_0==BOOL||LA15_0==CLASS||LA15_0==DEDENT||LA15_0==IF||LA15_0==INT||(LA15_0 >= LBRACK && LA15_0 <= LCURLY)||LA15_0==LPAREN||LA15_0==MINUS||(LA15_0 >= NOT && LA15_0 <= NULL)||LA15_0==STRING||LA15_0==WHILE) ) {
                alt15=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Atto.g:80:6: ( stmt )*
                    {
                    // Atto.g:80:6: ( stmt )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==ARROW||LA10_0==AT||LA10_0==BOOL||LA10_0==CLASS||LA10_0==IF||LA10_0==INT||(LA10_0 >= LBRACK && LA10_0 <= LCURLY)||LA10_0==LPAREN||LA10_0==MINUS||LA10_0==NAME||(LA10_0 >= NOT && LA10_0 <= NULL)||LA10_0==STRING||LA10_0==WHILE) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Atto.g:80:6: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_block277);
                    	    stmt16=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stmt.add(stmt16.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
                    // 80:12: -> ^( BLOCK ( stmt )* )
                    {
                        // Atto.g:80:15: ^( BLOCK ( stmt )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(BLOCK, "BLOCK")
                        , root_1);

                        // Atto.g:80:23: ( stmt )*
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
                    // Atto.g:81:6: pair ( NEWLINE )? ( ( COMMA )? pair ( NEWLINE )? )*
                    {
                    pushFollow(FOLLOW_pair_in_block294);
                    pair17=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair17.getTree());

                    // Atto.g:81:11: ( NEWLINE )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NEWLINE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Atto.g:81:11: NEWLINE
                            {
                            NEWLINE18=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block296); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE18);


                            }
                            break;

                    }


                    // Atto.g:81:20: ( ( COMMA )? pair ( NEWLINE )? )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA||LA14_0==NAME) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Atto.g:81:21: ( COMMA )? pair ( NEWLINE )?
                    	    {
                    	    // Atto.g:81:21: ( COMMA )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0==COMMA) ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // Atto.g:81:21: COMMA
                    	            {
                    	            COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_block300); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA19);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_block303);
                    	    pair20=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair20.getTree());

                    	    // Atto.g:81:33: ( NEWLINE )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==NEWLINE) ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // Atto.g:81:33: NEWLINE
                    	            {
                    	            NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block305); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE21);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
                    // 81:44: -> ^( OBJ ( pair )+ )
                    {
                        // Atto.g:81:47: ^( OBJ ( pair )+ )
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


            DEDENT22=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block328); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEDENT.add(DEDENT22);


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
    // Atto.g:86:1: expr : ( ( assign )=> assign | ( fun )=> fun | if_ | while_ | or );
    public final AttoParser.expr_return expr() throws RecognitionException {
        AttoParser.expr_return retval = new AttoParser.expr_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        AttoParser.assign_return assign23 =null;

        AttoParser.fun_return fun24 =null;

        AttoParser.if__return if_25 =null;

        AttoParser.while__return while_26 =null;

        AttoParser.or_return or27 =null;



        try {
            // Atto.g:87:2: ( ( assign )=> assign | ( fun )=> fun | if_ | while_ | or )
            int alt16=5;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NAME) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (synpred2_Atto()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==AT) ) {
                int LA16_2 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==INT) ) {
                int LA16_3 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==STRING) ) {
                int LA16_4 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==BOOL) ) {
                int LA16_5 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==NULL) ) {
                int LA16_6 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==LPAREN) ) {
                int LA16_7 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (synpred2_Atto()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==LCURLY) ) {
                int LA16_8 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==LBRACK) ) {
                int LA16_9 = input.LA(2);

                if ( (synpred1_Atto()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==ARROW) && (synpred2_Atto())) {
                alt16=2;
            }
            else if ( (LA16_0==IF) ) {
                alt16=3;
            }
            else if ( (LA16_0==WHILE) ) {
                alt16=4;
            }
            else if ( (LA16_0==MINUS||LA16_0==NOT) ) {
                alt16=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Atto.g:87:4: ( assign )=> assign
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_expr344);
                    assign23=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign23.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:88:4: ( fun )=> fun
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_expr354);
                    fun24=fun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fun24.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:89:4: if_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_if__in_expr359);
                    if_25=if_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_25.getTree());

                    }
                    break;
                case 4 :
                    // Atto.g:90:4: while_
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_while__in_expr364);
                    while_26=while_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_26.getTree());

                    }
                    break;
                case 5 :
                    // Atto.g:91:4: or
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_or_in_expr369);
                    or27=or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, or27.getTree());

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
    // Atto.g:94:1: assign : postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) ) ;
    public final AttoParser.assign_return assign() throws RecognitionException {
        AttoParser.assign_return retval = new AttoParser.assign_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ASSIGN29=null;
        Token PLUS31=null;
        Token ASSIGN32=null;
        Token MINUS34=null;
        Token ASSIGN35=null;
        Token MUL37=null;
        Token ASSIGN38=null;
        Token DIV40=null;
        Token ASSIGN41=null;
        Token MOD43=null;
        Token ASSIGN44=null;
        AttoParser.postfix_return postfix28 =null;

        AttoParser.body_return body30 =null;

        AttoParser.body_return body33 =null;

        AttoParser.body_return body36 =null;

        AttoParser.body_return body39 =null;

        AttoParser.body_return body42 =null;

        AttoParser.body_return body45 =null;


        AttoTree ASSIGN29_tree=null;
        AttoTree PLUS31_tree=null;
        AttoTree ASSIGN32_tree=null;
        AttoTree MINUS34_tree=null;
        AttoTree ASSIGN35_tree=null;
        AttoTree MUL37_tree=null;
        AttoTree ASSIGN38_tree=null;
        AttoTree DIV40_tree=null;
        AttoTree ASSIGN41_tree=null;
        AttoTree MOD43_tree=null;
        AttoTree ASSIGN44_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_MOD=new RewriteRuleTokenStream(adaptor,"token MOD");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:95:2: ( postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) ) )
            // Atto.g:95:4: postfix ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) )
            {
            pushFollow(FOLLOW_postfix_in_assign380);
            postfix28=postfix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfix.add(postfix28.getTree());

            // Atto.g:96:4: ( ASSIGN body -> ^( ASSIGN postfix body ) | ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ASSIGN) ) {
                alt18=1;
            }
            else if ( (LA18_0==DIV||(LA18_0 >= MINUS && LA18_0 <= MUL)||LA18_0==PLUS) ) {
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
                    // Atto.g:96:6: ASSIGN body
                    {
                    ASSIGN29=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN29);


                    pushFollow(FOLLOW_body_in_assign390);
                    body30=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body30.getTree());

                    // AST REWRITE
                    // elements: postfix, ASSIGN, body
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AttoTree)adaptor.nil();
                    // 96:18: -> ^( ASSIGN postfix body )
                    {
                        // Atto.g:96:21: ^( ASSIGN postfix body )
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
                    // Atto.g:97:6: ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) )
                    {
                    // Atto.g:97:6: ( PLUS ASSIGN body -> ^( ASSIGN postfix ^( PLUS postfix body ) ) | MINUS ASSIGN body -> ^( ASSIGN postfix ^( MINUS postfix body ) ) | MUL ASSIGN body -> ^( ASSIGN postfix ^( MUL postfix body ) ) | DIV ASSIGN body -> ^( ASSIGN postfix ^( DIV postfix body ) ) | MOD ASSIGN body -> ^( ASSIGN postfix ^( MOD postfix body ) ) )
                    int alt17=5;
                    switch ( input.LA(1) ) {
                    case PLUS:
                        {
                        alt17=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt17=2;
                        }
                        break;
                    case MUL:
                        {
                        alt17=3;
                        }
                        break;
                    case DIV:
                        {
                        alt17=4;
                        }
                        break;
                    case MOD:
                        {
                        alt17=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }

                    switch (alt17) {
                        case 1 :
                            // Atto.g:97:8: PLUS ASSIGN body
                            {
                            PLUS31=(Token)match(input,PLUS,FOLLOW_PLUS_in_assign409); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PLUS.add(PLUS31);


                            ASSIGN32=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign411); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN32);


                            pushFollow(FOLLOW_body_in_assign413);
                            body33=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body33.getTree());

                            // AST REWRITE
                            // elements: body, PLUS, ASSIGN, postfix, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 97:25: -> ^( ASSIGN postfix ^( PLUS postfix body ) )
                            {
                                // Atto.g:97:28: ^( ASSIGN postfix ^( PLUS postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:97:45: ^( PLUS postfix body )
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
                            // Atto.g:98:8: MINUS ASSIGN body
                            {
                            MINUS34=(Token)match(input,MINUS,FOLLOW_MINUS_in_assign438); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MINUS.add(MINUS34);


                            ASSIGN35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign440); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN35);


                            pushFollow(FOLLOW_body_in_assign442);
                            body36=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body36.getTree());

                            // AST REWRITE
                            // elements: body, postfix, MINUS, ASSIGN, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 98:26: -> ^( ASSIGN postfix ^( MINUS postfix body ) )
                            {
                                // Atto.g:98:29: ^( ASSIGN postfix ^( MINUS postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:98:46: ^( MINUS postfix body )
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
                            // Atto.g:99:8: MUL ASSIGN body
                            {
                            MUL37=(Token)match(input,MUL,FOLLOW_MUL_in_assign467); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MUL.add(MUL37);


                            ASSIGN38=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign469); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN38);


                            pushFollow(FOLLOW_body_in_assign471);
                            body39=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body39.getTree());

                            // AST REWRITE
                            // elements: MUL, postfix, body, postfix, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 99:24: -> ^( ASSIGN postfix ^( MUL postfix body ) )
                            {
                                // Atto.g:99:27: ^( ASSIGN postfix ^( MUL postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:99:44: ^( MUL postfix body )
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
                            // Atto.g:100:8: DIV ASSIGN body
                            {
                            DIV40=(Token)match(input,DIV,FOLLOW_DIV_in_assign496); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIV.add(DIV40);


                            ASSIGN41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign498); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN41);


                            pushFollow(FOLLOW_body_in_assign500);
                            body42=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body42.getTree());

                            // AST REWRITE
                            // elements: DIV, ASSIGN, postfix, body, postfix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 100:24: -> ^( ASSIGN postfix ^( DIV postfix body ) )
                            {
                                // Atto.g:100:27: ^( ASSIGN postfix ^( DIV postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:100:44: ^( DIV postfix body )
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
                            // Atto.g:101:8: MOD ASSIGN body
                            {
                            MOD43=(Token)match(input,MOD,FOLLOW_MOD_in_assign525); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_MOD.add(MOD43);


                            ASSIGN44=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign527); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN44);


                            pushFollow(FOLLOW_body_in_assign529);
                            body45=body();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_body.add(body45.getTree());

                            // AST REWRITE
                            // elements: postfix, MOD, postfix, body, ASSIGN
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AttoTree)adaptor.nil();
                            // 101:24: -> ^( ASSIGN postfix ^( MOD postfix body ) )
                            {
                                // Atto.g:101:27: ^( ASSIGN postfix ^( MOD postfix body ) )
                                {
                                AttoTree root_1 = (AttoTree)adaptor.nil();
                                root_1 = (AttoTree)adaptor.becomeRoot(
                                stream_ASSIGN.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_postfix.nextTree());

                                // Atto.g:101:44: ^( MOD postfix body )
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
    // Atto.g:106:1: fun : paramsdef ARROW ^ body ;
    public final AttoParser.fun_return fun() throws RecognitionException {
        AttoParser.fun_return retval = new AttoParser.fun_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token ARROW47=null;
        AttoParser.paramsdef_return paramsdef46 =null;

        AttoParser.body_return body48 =null;


        AttoTree ARROW47_tree=null;

        try {
            // Atto.g:107:2: ( paramsdef ARROW ^ body )
            // Atto.g:107:4: paramsdef ARROW ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_paramsdef_in_fun569);
            paramsdef46=paramsdef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramsdef46.getTree());

            ARROW47=(Token)match(input,ARROW,FOLLOW_ARROW_in_fun571); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARROW47_tree = 
            (AttoTree)adaptor.create(ARROW47)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(ARROW47_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_fun574);
            body48=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body48.getTree());

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
    // Atto.g:110:1: paramsdef : ( ( vardef ( ( COMMA )? vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( ( COMMA )? vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) );
    public final AttoParser.paramsdef_return paramsdef() throws RecognitionException {
        AttoParser.paramsdef_return retval = new AttoParser.paramsdef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token COMMA50=null;
        Token LPAREN52=null;
        Token COMMA54=null;
        Token RPAREN56=null;
        AttoParser.vardef_return vardef49 =null;

        AttoParser.vardef_return vardef51 =null;

        AttoParser.vardef_return vardef53 =null;

        AttoParser.vardef_return vardef55 =null;


        AttoTree COMMA50_tree=null;
        AttoTree LPAREN52_tree=null;
        AttoTree COMMA54_tree=null;
        AttoTree RPAREN56_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // Atto.g:111:2: ( ( vardef ( ( COMMA )? vardef )* )? -> ^( PARAMS ( vardef )* ) | LPAREN ( vardef ( ( COMMA )? vardef )* )? RPAREN -> ^( PARAMS ( vardef )* ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ARROW||LA25_0==NAME) ) {
                alt25=1;
            }
            else if ( (LA25_0==LPAREN) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // Atto.g:111:4: ( vardef ( ( COMMA )? vardef )* )?
                    {
                    // Atto.g:111:4: ( vardef ( ( COMMA )? vardef )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NAME) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Atto.g:111:5: vardef ( ( COMMA )? vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef586);
                            vardef49=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef49.getTree());

                            // Atto.g:111:12: ( ( COMMA )? vardef )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==COMMA||LA20_0==NAME) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // Atto.g:111:13: ( COMMA )? vardef
                            	    {
                            	    // Atto.g:111:13: ( COMMA )?
                            	    int alt19=2;
                            	    int LA19_0 = input.LA(1);

                            	    if ( (LA19_0==COMMA) ) {
                            	        alt19=1;
                            	    }
                            	    switch (alt19) {
                            	        case 1 :
                            	            // Atto.g:111:13: COMMA
                            	            {
                            	            COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef589); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA50);


                            	            }
                            	            break;

                            	    }


                            	    pushFollow(FOLLOW_vardef_in_paramsdef592);
                            	    vardef51=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef51.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop20;
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
                    // 111:31: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:111:34: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:111:43: ( vardef )*
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
                    // Atto.g:112:4: LPAREN ( vardef ( ( COMMA )? vardef )* )? RPAREN
                    {
                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paramsdef610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN52);


                    // Atto.g:112:11: ( vardef ( ( COMMA )? vardef )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NAME) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // Atto.g:112:12: vardef ( ( COMMA )? vardef )*
                            {
                            pushFollow(FOLLOW_vardef_in_paramsdef613);
                            vardef53=vardef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_vardef.add(vardef53.getTree());

                            // Atto.g:112:19: ( ( COMMA )? vardef )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==COMMA||LA23_0==NAME) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // Atto.g:112:20: ( COMMA )? vardef
                            	    {
                            	    // Atto.g:112:20: ( COMMA )?
                            	    int alt22=2;
                            	    int LA22_0 = input.LA(1);

                            	    if ( (LA22_0==COMMA) ) {
                            	        alt22=1;
                            	    }
                            	    switch (alt22) {
                            	        case 1 :
                            	            // Atto.g:112:20: COMMA
                            	            {
                            	            COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsdef616); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA54);


                            	            }
                            	            break;

                            	    }


                            	    pushFollow(FOLLOW_vardef_in_paramsdef619);
                            	    vardef55=vardef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_vardef.add(vardef55.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paramsdef625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN56);


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
                    // 112:45: -> ^( PARAMS ( vardef )* )
                    {
                        // Atto.g:112:48: ^( PARAMS ( vardef )* )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        // Atto.g:112:57: ( vardef )*
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
    // Atto.g:115:1: body : ( expr | NEWLINE block -> block );
    public final AttoParser.body_return body() throws RecognitionException {
        AttoParser.body_return retval = new AttoParser.body_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NEWLINE58=null;
        AttoParser.expr_return expr57 =null;

        AttoParser.block_return block59 =null;


        AttoTree NEWLINE58_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:116:2: ( expr | NEWLINE block -> block )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ARROW||LA26_0==AT||LA26_0==BOOL||LA26_0==IF||LA26_0==INT||(LA26_0 >= LBRACK && LA26_0 <= LCURLY)||LA26_0==LPAREN||LA26_0==MINUS||LA26_0==NAME||(LA26_0 >= NOT && LA26_0 <= NULL)||LA26_0==STRING||LA26_0==WHILE) ) {
                alt26=1;
            }
            else if ( (LA26_0==NEWLINE) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // Atto.g:116:5: expr
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_body647);
                    expr57=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr57.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:117:5: NEWLINE block
                    {
                    NEWLINE58=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_body653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE58);


                    pushFollow(FOLLOW_block_in_body655);
                    block59=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block59.getTree());

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
                    // 117:19: -> block
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
    // Atto.g:120:1: if_ : 'if' cond_expr= expr ( NEWLINE block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) ;
    public final AttoParser.if__return if_() throws RecognitionException {
        AttoParser.if__return retval = new AttoParser.if__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal60=null;
        Token NEWLINE61=null;
        Token string_literal65=null;
        Token string_literal66=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.expr_return else_expr =null;

        AttoParser.block_return block62 =null;

        AttoParser.elif_return elif63 =null;

        AttoParser.else__return else_64 =null;


        AttoTree string_literal60_tree=null;
        AttoTree NEWLINE61_tree=null;
        AttoTree string_literal65_tree=null;
        AttoTree string_literal66_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_elif=new RewriteRuleSubtreeStream(adaptor,"rule elif");
        try {
            // Atto.g:121:2: ( 'if' cond_expr= expr ( NEWLINE block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) ) )
            // Atto.g:121:4: 'if' cond_expr= expr ( NEWLINE block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            {
            string_literal60=(Token)match(input,IF,FOLLOW_IF_in_if_672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal60);


            pushFollow(FOLLOW_expr_in_if_676);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:122:4: ( NEWLINE block ( elif )* ( else_ )? -> ^( IF $cond_expr block ( elif )* ( else_ )? ) | 'then' then_expr= expr ( 'else' else_expr= expr )? -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==NEWLINE) ) {
                alt30=1;
            }
            else if ( (LA30_0==69) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // Atto.g:122:6: NEWLINE block ( elif )* ( else_ )?
                    {
                    NEWLINE61=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE61);


                    pushFollow(FOLLOW_block_in_if_686);
                    block62=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block62.getTree());

                    // Atto.g:122:20: ( elif )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==ELIF) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Atto.g:122:20: elif
                    	    {
                    	    pushFollow(FOLLOW_elif_in_if_688);
                    	    elif63=elif();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elif.add(elif63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    // Atto.g:122:26: ( else_ )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==ELSE) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==NEWLINE) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // Atto.g:122:26: else_
                            {
                            pushFollow(FOLLOW_else__in_if_691);
                            else_64=else_();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_.add(else_64.getTree());

                            }
                            break;

                    }


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
                    // 123:5: -> ^( IF $cond_expr block ( elif )* ( else_ )? )
                    {
                        // Atto.g:123:8: ^( IF $cond_expr block ( elif )* ( else_ )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // Atto.g:123:30: ( elif )*
                        while ( stream_elif.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif.nextTree());

                        }
                        stream_elif.reset();

                        // Atto.g:123:36: ( else_ )?
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
                    // Atto.g:124:6: 'then' then_expr= expr ( 'else' else_expr= expr )?
                    {
                    string_literal65=(Token)match(input,69,FOLLOW_69_in_if_721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal65);


                    pushFollow(FOLLOW_expr_in_if_725);
                    then_expr=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(then_expr.getTree());

                    // Atto.g:124:28: ( 'else' else_expr= expr )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==ELSE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Atto.g:124:29: 'else' else_expr= expr
                            {
                            string_literal66=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_728); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal66);


                            pushFollow(FOLLOW_expr_in_if_732);
                            else_expr=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: then_expr, cond_expr, else_expr
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
                    // 125:5: -> ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                    {
                        // Atto.g:125:8: ^( IF $cond_expr $then_expr ( ^( ELSE $else_expr) )? )
                        {
                        AttoTree root_1 = (AttoTree)adaptor.nil();
                        root_1 = (AttoTree)adaptor.becomeRoot(
                        (AttoTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cond_expr.nextTree());

                        adaptor.addChild(root_1, stream_then_expr.nextTree());

                        // Atto.g:125:35: ( ^( ELSE $else_expr) )?
                        if ( stream_else_expr.hasNext() ) {
                            // Atto.g:125:35: ^( ELSE $else_expr)
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
    // Atto.g:129:1: elif : 'elif' expr NEWLINE block -> ^( ELIF expr block ) ;
    public final AttoParser.elif_return elif() throws RecognitionException {
        AttoParser.elif_return retval = new AttoParser.elif_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal67=null;
        Token NEWLINE69=null;
        AttoParser.expr_return expr68 =null;

        AttoParser.block_return block70 =null;


        AttoTree string_literal67_tree=null;
        AttoTree NEWLINE69_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:130:2: ( 'elif' expr NEWLINE block -> ^( ELIF expr block ) )
            // Atto.g:130:4: 'elif' expr NEWLINE block
            {
            string_literal67=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif776); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELIF.add(string_literal67);


            pushFollow(FOLLOW_expr_in_elif778);
            expr68=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr68.getTree());

            NEWLINE69=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elif780); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE69);


            pushFollow(FOLLOW_block_in_elif782);
            block70=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block70.getTree());

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
            // 130:30: -> ^( ELIF expr block )
            {
                // Atto.g:130:33: ^( ELIF expr block )
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
    // Atto.g:133:1: else_ : 'else' NEWLINE block -> ^( ELSE block ) ;
    public final AttoParser.else__return else_() throws RecognitionException {
        AttoParser.else__return retval = new AttoParser.else__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal71=null;
        Token NEWLINE72=null;
        AttoParser.block_return block73 =null;


        AttoTree string_literal71_tree=null;
        AttoTree NEWLINE72_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Atto.g:134:2: ( 'else' NEWLINE block -> ^( ELSE block ) )
            // Atto.g:134:4: 'else' NEWLINE block
            {
            string_literal71=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal71);


            NEWLINE72=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_else_805); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE72);


            pushFollow(FOLLOW_block_in_else_807);
            block73=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block73.getTree());

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
            // 134:25: -> ^( ELSE block )
            {
                // Atto.g:134:28: ^( ELSE block )
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
    // Atto.g:137:1: while_ : 'while' cond_expr= expr ( NEWLINE block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) ;
    public final AttoParser.while__return while_() throws RecognitionException {
        AttoParser.while__return retval = new AttoParser.while__return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token string_literal74=null;
        Token NEWLINE75=null;
        Token string_literal77=null;
        AttoParser.expr_return cond_expr =null;

        AttoParser.expr_return then_expr =null;

        AttoParser.block_return block76 =null;


        AttoTree string_literal74_tree=null;
        AttoTree NEWLINE75_tree=null;
        AttoTree string_literal77_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:138:2: ( 'while' cond_expr= expr ( NEWLINE block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) ) )
            // Atto.g:138:4: 'while' cond_expr= expr ( NEWLINE block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            {
            string_literal74=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal74);


            pushFollow(FOLLOW_expr_in_while_831);
            cond_expr=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(cond_expr.getTree());

            // Atto.g:139:4: ( NEWLINE block -> ^( WHILE $cond_expr block ) | 'then' then_expr= expr -> ^( WHILE $cond_expr $then_expr) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==NEWLINE) ) {
                alt31=1;
            }
            else if ( (LA31_0==69) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // Atto.g:139:6: NEWLINE block
                    {
                    NEWLINE75=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE75);


                    pushFollow(FOLLOW_block_in_while_841);
                    block76=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block76.getTree());

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
                    // 139:20: -> ^( WHILE $cond_expr block )
                    {
                        // Atto.g:139:23: ^( WHILE $cond_expr block )
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
                    // Atto.g:140:6: 'then' then_expr= expr
                    {
                    string_literal77=(Token)match(input,69,FOLLOW_69_in_while_859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal77);


                    pushFollow(FOLLOW_expr_in_while_863);
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
                    // 140:28: -> ^( WHILE $cond_expr $then_expr)
                    {
                        // Atto.g:140:31: ^( WHILE $cond_expr $then_expr)
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
    // Atto.g:144:1: or : and ( OR ^ and )* ;
    public final AttoParser.or_return or() throws RecognitionException {
        AttoParser.or_return retval = new AttoParser.or_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token OR79=null;
        AttoParser.and_return and78 =null;

        AttoParser.and_return and80 =null;


        AttoTree OR79_tree=null;

        try {
            // Atto.g:145:2: ( and ( OR ^ and )* )
            // Atto.g:145:4: and ( OR ^ and )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_and_in_or891);
            and78=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and78.getTree());

            // Atto.g:145:8: ( OR ^ and )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==OR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Atto.g:145:9: OR ^ and
            	    {
            	    OR79=(Token)match(input,OR,FOLLOW_OR_in_or894); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR79_tree = 
            	    (AttoTree)adaptor.create(OR79)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(OR79_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_in_or897);
            	    and80=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and80.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // Atto.g:148:1: and : rel ( AND ^ rel )* ;
    public final AttoParser.and_return and() throws RecognitionException {
        AttoParser.and_return retval = new AttoParser.and_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token AND82=null;
        AttoParser.rel_return rel81 =null;

        AttoParser.rel_return rel83 =null;


        AttoTree AND82_tree=null;

        try {
            // Atto.g:149:2: ( rel ( AND ^ rel )* )
            // Atto.g:149:4: rel ( AND ^ rel )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_rel_in_and910);
            rel81=rel();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel81.getTree());

            // Atto.g:149:8: ( AND ^ rel )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==AND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Atto.g:149:9: AND ^ rel
            	    {
            	    AND82=(Token)match(input,AND,FOLLOW_AND_in_and913); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND82_tree = 
            	    (AttoTree)adaptor.create(AND82)
            	    ;
            	    root_0 = (AttoTree)adaptor.becomeRoot(AND82_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_rel_in_and916);
            	    rel83=rel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel83.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // Atto.g:152:1: rel : add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* ;
    public final AttoParser.rel_return rel() throws RecognitionException {
        AttoParser.rel_return retval = new AttoParser.rel_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set85=null;
        AttoParser.add_return add84 =null;

        AttoParser.add_return add86 =null;


        AttoTree set85_tree=null;

        try {
            // Atto.g:153:2: ( add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )* )
            // Atto.g:153:4: add ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_rel929);
            add84=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add84.getTree());

            // Atto.g:153:8: ( ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMPOSITE||LA34_0==EQ||(LA34_0 >= GE && LA34_0 <= GT)||LA34_0==LE||LA34_0==LT||LA34_0==NE||LA34_0==PIPELINE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Atto.g:153:9: ( EQ | NE | LE | GE | LT | GT | COMPOSITE | PIPELINE ) ^ add
            	    {
            	    set85=(Token)input.LT(1);

            	    set85=(Token)input.LT(1);

            	    if ( input.LA(1)==COMPOSITE||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==PIPELINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set85)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_rel951);
            	    add86=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add86.getTree());

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
    // $ANTLR end "rel"


    public static class add_return extends ParserRuleReturnScope {
        AttoTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // Atto.g:156:1: add : mul ( ( PLUS | MINUS ) ^ mul )* ;
    public final AttoParser.add_return add() throws RecognitionException {
        AttoParser.add_return retval = new AttoParser.add_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set88=null;
        AttoParser.mul_return mul87 =null;

        AttoParser.mul_return mul89 =null;


        AttoTree set88_tree=null;

        try {
            // Atto.g:157:2: ( mul ( ( PLUS | MINUS ) ^ mul )* )
            // Atto.g:157:4: mul ( ( PLUS | MINUS ) ^ mul )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_mul_in_add964);
            mul87=mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mul87.getTree());

            // Atto.g:157:8: ( ( PLUS | MINUS ) ^ mul )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==MINUS) ) {
                    alt35=1;
                }
                else if ( (LA35_0==PLUS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Atto.g:157:9: ( PLUS | MINUS ) ^ mul
            	    {
            	    set88=(Token)input.LT(1);

            	    set88=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set88)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_in_add974);
            	    mul89=mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mul89.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // Atto.g:160:1: mul : unary ( ( MUL | DIV | MOD ) ^ unary )* ;
    public final AttoParser.mul_return mul() throws RecognitionException {
        AttoParser.mul_return retval = new AttoParser.mul_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token set91=null;
        AttoParser.unary_return unary90 =null;

        AttoParser.unary_return unary92 =null;


        AttoTree set91_tree=null;

        try {
            // Atto.g:161:2: ( unary ( ( MUL | DIV | MOD ) ^ unary )* )
            // Atto.g:161:4: unary ( ( MUL | DIV | MOD ) ^ unary )*
            {
            root_0 = (AttoTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mul987);
            unary90=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary90.getTree());

            // Atto.g:161:10: ( ( MUL | DIV | MOD ) ^ unary )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==DIV||(LA36_0 >= MOD && LA36_0 <= MUL)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Atto.g:161:11: ( MUL | DIV | MOD ) ^ unary
            	    {
            	    set91=(Token)input.LT(1);

            	    set91=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(set91)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mul999);
            	    unary92=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary92.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // Atto.g:164:1: unary : ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) );
    public final AttoParser.unary_return unary() throws RecognitionException {
        AttoParser.unary_return retval = new AttoParser.unary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NOT94=null;
        Token MINUS96=null;
        AttoParser.postfix_return postfix93 =null;

        AttoParser.postfix_return postfix95 =null;

        AttoParser.postfix_return postfix97 =null;


        AttoTree NOT94_tree=null;
        AttoTree MINUS96_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
        try {
            // Atto.g:165:2: ( postfix | NOT ^ postfix | MINUS postfix -> ^( UNARY_MINUS postfix ) )
            int alt37=3;
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
                alt37=1;
                }
                break;
            case NOT:
                {
                alt37=2;
                }
                break;
            case MINUS:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // Atto.g:165:4: postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_in_unary1013);
                    postfix93=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix93.getTree());

                    }
                    break;
                case 2 :
                    // Atto.g:166:4: NOT ^ postfix
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NOT94=(Token)match(input,NOT,FOLLOW_NOT_in_unary1018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT94_tree = 
                    (AttoTree)adaptor.create(NOT94)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(NOT94_tree, root_0);
                    }

                    pushFollow(FOLLOW_postfix_in_unary1021);
                    postfix95=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix95.getTree());

                    }
                    break;
                case 3 :
                    // Atto.g:167:4: MINUS postfix
                    {
                    MINUS96=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary1026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS96);


                    pushFollow(FOLLOW_postfix_in_unary1028);
                    postfix97=postfix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix.add(postfix97.getTree());

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
                    // 167:18: -> ^( UNARY_MINUS postfix )
                    {
                        // Atto.g:167:21: ^( UNARY_MINUS postfix )
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
    // Atto.g:170:1: postfix : ( primary -> primary ) ( LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* ;
    public final AttoParser.postfix_return postfix() throws RecognitionException {
        AttoParser.postfix_return retval = new AttoParser.postfix_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LPAREN99=null;
        Token COMMA101=null;
        Token RPAREN103=null;
        Token LBRACK104=null;
        Token RBRACK106=null;
        Token DOT107=null;
        AttoParser.primary_return p =null;

        AttoParser.primary_return primary98 =null;

        AttoParser.expr_return expr100 =null;

        AttoParser.expr_return expr102 =null;

        AttoParser.expr_return expr105 =null;


        AttoTree LPAREN99_tree=null;
        AttoTree COMMA101_tree=null;
        AttoTree RPAREN103_tree=null;
        AttoTree LBRACK104_tree=null;
        AttoTree RBRACK106_tree=null;
        AttoTree DOT107_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:171:2: ( ( primary -> primary ) ( LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )* )
            // Atto.g:171:4: ( primary -> primary ) ( LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            {
            // Atto.g:171:4: ( primary -> primary )
            // Atto.g:171:6: primary
            {
            pushFollow(FOLLOW_primary_in_postfix1050);
            primary98=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary98.getTree());

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
            // 171:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Atto.g:172:4: ( LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN -> ^( CALL $postfix ( expr )* ) | LBRACK expr RBRACK -> ^( INDEX $postfix expr ) | DOT p= primary -> ^( FIELD_ACCESS $postfix $p) )*
            loop41:
            do {
                int alt41=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt41=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt41=2;
                    }
                    break;
                case DOT:
                    {
                    alt41=3;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // Atto.g:172:6: LPAREN ( expr ( ( COMMA )? expr )* )? RPAREN
            	    {
            	    LPAREN99=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix1063); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN99);


            	    // Atto.g:172:13: ( expr ( ( COMMA )? expr )* )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==ARROW||LA40_0==AT||LA40_0==BOOL||LA40_0==IF||LA40_0==INT||(LA40_0 >= LBRACK && LA40_0 <= LCURLY)||LA40_0==LPAREN||LA40_0==MINUS||LA40_0==NAME||(LA40_0 >= NOT && LA40_0 <= NULL)||LA40_0==STRING||LA40_0==WHILE) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // Atto.g:172:14: expr ( ( COMMA )? expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfix1066);
            	            expr100=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr100.getTree());

            	            // Atto.g:172:19: ( ( COMMA )? expr )*
            	            loop39:
            	            do {
            	                int alt39=2;
            	                int LA39_0 = input.LA(1);

            	                if ( (LA39_0==ARROW||LA39_0==AT||LA39_0==BOOL||LA39_0==COMMA||LA39_0==IF||LA39_0==INT||(LA39_0 >= LBRACK && LA39_0 <= LCURLY)||LA39_0==LPAREN||LA39_0==MINUS||LA39_0==NAME||(LA39_0 >= NOT && LA39_0 <= NULL)||LA39_0==STRING||LA39_0==WHILE) ) {
            	                    alt39=1;
            	                }


            	                switch (alt39) {
            	            	case 1 :
            	            	    // Atto.g:172:20: ( COMMA )? expr
            	            	    {
            	            	    // Atto.g:172:20: ( COMMA )?
            	            	    int alt38=2;
            	            	    int LA38_0 = input.LA(1);

            	            	    if ( (LA38_0==COMMA) ) {
            	            	        alt38=1;
            	            	    }
            	            	    switch (alt38) {
            	            	        case 1 :
            	            	            // Atto.g:172:20: COMMA
            	            	            {
            	            	            COMMA101=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix1069); if (state.failed) return retval; 
            	            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA101);


            	            	            }
            	            	            break;

            	            	    }


            	            	    pushFollow(FOLLOW_expr_in_postfix1072);
            	            	    expr102=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) stream_expr.add(expr102.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop39;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix1078); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);


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
            	    // 173:5: -> ^( CALL $postfix ( expr )* )
            	    {
            	        // Atto.g:173:8: ^( CALL $postfix ( expr )* )
            	        {
            	        AttoTree root_1 = (AttoTree)adaptor.nil();
            	        root_1 = (AttoTree)adaptor.becomeRoot(
            	        (AttoTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        // Atto.g:173:24: ( expr )*
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
            	    // Atto.g:174:6: LBRACK expr RBRACK
            	    {
            	    LBRACK104=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix1102); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK104);


            	    pushFollow(FOLLOW_expr_in_postfix1104);
            	    expr105=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr105.getTree());

            	    RBRACK106=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix1106); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK106);


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
            	    // 175:5: -> ^( INDEX $postfix expr )
            	    {
            	        // Atto.g:175:8: ^( INDEX $postfix expr )
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
            	    // Atto.g:176:6: DOT p= primary
            	    {
            	    DOT107=(Token)match(input,DOT,FOLLOW_DOT_in_postfix1129); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT107);


            	    pushFollow(FOLLOW_primary_in_postfix1133);
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
            	    // 177:5: -> ^( FIELD_ACCESS $postfix $p)
            	    {
            	        // Atto.g:177:8: ^( FIELD_ACCESS $postfix $p)
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
            	    break loop41;
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
    // Atto.g:181:1: primary : ( NAME | AT ^ NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array | prop );
    public final AttoParser.primary_return primary() throws RecognitionException {
        AttoParser.primary_return retval = new AttoParser.primary_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME108=null;
        Token AT109=null;
        Token NAME110=null;
        Token INT111=null;
        Token STRING112=null;
        Token BOOL113=null;
        Token NULL114=null;
        Token LPAREN115=null;
        Token RPAREN117=null;
        AttoParser.expr_return expr116 =null;

        AttoParser.obj_return obj118 =null;

        AttoParser.array_return array119 =null;

        AttoParser.prop_return prop120 =null;


        AttoTree NAME108_tree=null;
        AttoTree AT109_tree=null;
        AttoTree NAME110_tree=null;
        AttoTree INT111_tree=null;
        AttoTree STRING112_tree=null;
        AttoTree BOOL113_tree=null;
        AttoTree NULL114_tree=null;
        AttoTree LPAREN115_tree=null;
        AttoTree RPAREN117_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:182:2: ( NAME | AT ^ NAME | INT | STRING | BOOL | NULL | LPAREN expr RPAREN -> expr | obj | array | prop )
            int alt42=10;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt42=1;
                }
                break;
            case AT:
                {
                alt42=2;
                }
                break;
            case INT:
                {
                alt42=3;
                }
                break;
            case STRING:
                {
                alt42=4;
                }
                break;
            case BOOL:
                {
                alt42=5;
                }
                break;
            case NULL:
                {
                alt42=6;
                }
                break;
            case LPAREN:
                {
                alt42=7;
                }
                break;
            case LCURLY:
                {
                int LA42_8 = input.LA(2);

                if ( (LA42_8==COMMA||LA42_8==NAME||LA42_8==RCURLY) ) {
                    alt42=8;
                }
                else if ( (LA42_8==LCURLY) ) {
                    alt42=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 8, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                alt42=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // Atto.g:182:4: NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NAME108=(Token)match(input,NAME,FOLLOW_NAME_in_primary1168); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME108_tree = 
                    (AttoTree)adaptor.create(NAME108)
                    ;
                    adaptor.addChild(root_0, NAME108_tree);
                    }

                    }
                    break;
                case 2 :
                    // Atto.g:183:4: AT ^ NAME
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    AT109=(Token)match(input,AT,FOLLOW_AT_in_primary1173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT109_tree = 
                    (AttoTree)adaptor.create(AT109)
                    ;
                    root_0 = (AttoTree)adaptor.becomeRoot(AT109_tree, root_0);
                    }

                    NAME110=(Token)match(input,NAME,FOLLOW_NAME_in_primary1176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME110_tree = 
                    (AttoTree)adaptor.create(NAME110)
                    ;
                    adaptor.addChild(root_0, NAME110_tree);
                    }

                    }
                    break;
                case 3 :
                    // Atto.g:184:4: INT
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    INT111=(Token)match(input,INT,FOLLOW_INT_in_primary1182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT111_tree = 
                    (AttoTree)adaptor.create(INT111)
                    ;
                    adaptor.addChild(root_0, INT111_tree);
                    }

                    }
                    break;
                case 4 :
                    // Atto.g:185:4: STRING
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    STRING112=(Token)match(input,STRING,FOLLOW_STRING_in_primary1187); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING112_tree = 
                    (AttoTree)adaptor.create(STRING112)
                    ;
                    adaptor.addChild(root_0, STRING112_tree);
                    }

                    }
                    break;
                case 5 :
                    // Atto.g:186:4: BOOL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    BOOL113=(Token)match(input,BOOL,FOLLOW_BOOL_in_primary1192); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL113_tree = 
                    (AttoTree)adaptor.create(BOOL113)
                    ;
                    adaptor.addChild(root_0, BOOL113_tree);
                    }

                    }
                    break;
                case 6 :
                    // Atto.g:187:4: NULL
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    NULL114=(Token)match(input,NULL,FOLLOW_NULL_in_primary1197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL114_tree = 
                    (AttoTree)adaptor.create(NULL114)
                    ;
                    adaptor.addChild(root_0, NULL114_tree);
                    }

                    }
                    break;
                case 7 :
                    // Atto.g:188:4: LPAREN expr RPAREN
                    {
                    LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN115);


                    pushFollow(FOLLOW_expr_in_primary1204);
                    expr116=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr116.getTree());

                    RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN117);


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
                    // 188:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Atto.g:189:4: obj
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_in_primary1215);
                    obj118=obj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj118.getTree());

                    }
                    break;
                case 9 :
                    // Atto.g:190:4: array
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_primary1220);
                    array119=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array119.getTree());

                    }
                    break;
                case 10 :
                    // Atto.g:191:4: prop
                    {
                    root_0 = (AttoTree)adaptor.nil();


                    pushFollow(FOLLOW_prop_in_primary1225);
                    prop120=prop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prop120.getTree());

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
    // Atto.g:194:1: obj : LCURLY ( pair ( ( COMMA )? pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) ;
    public final AttoParser.obj_return obj() throws RecognitionException {
        AttoParser.obj_return retval = new AttoParser.obj_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY121=null;
        Token COMMA123=null;
        Token COMMA125=null;
        Token RCURLY126=null;
        AttoParser.pair_return pair122 =null;

        AttoParser.pair_return pair124 =null;


        AttoTree LCURLY121_tree=null;
        AttoTree COMMA123_tree=null;
        AttoTree COMMA125_tree=null;
        AttoTree RCURLY126_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        try {
            // Atto.g:195:2: ( LCURLY ( pair ( ( COMMA )? pair )* )? ( COMMA )? RCURLY -> ^( OBJ ( pair )* ) )
            // Atto.g:195:4: LCURLY ( pair ( ( COMMA )? pair )* )? ( COMMA )? RCURLY
            {
            LCURLY121=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_obj1237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY121);


            // Atto.g:195:11: ( pair ( ( COMMA )? pair )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==NAME) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Atto.g:195:12: pair ( ( COMMA )? pair )*
                    {
                    pushFollow(FOLLOW_pair_in_obj1240);
                    pair122=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair122.getTree());

                    // Atto.g:195:17: ( ( COMMA )? pair )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==COMMA) ) {
                            int LA44_1 = input.LA(2);

                            if ( (LA44_1==NAME) ) {
                                alt44=1;
                            }


                        }
                        else if ( (LA44_0==NAME) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // Atto.g:195:18: ( COMMA )? pair
                    	    {
                    	    // Atto.g:195:18: ( COMMA )?
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==COMMA) ) {
                    	        alt43=1;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // Atto.g:195:18: COMMA
                    	            {
                    	            COMMA123=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1243); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA123);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_pair_in_obj1246);
                    	    pair124=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair124.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:195:34: ( COMMA )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COMMA) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Atto.g:195:34: COMMA
                    {
                    COMMA125=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj1252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA125);


                    }
                    break;

            }


            RCURLY126=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_obj1255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY126);


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
            // 195:48: -> ^( OBJ ( pair )* )
            {
                // Atto.g:195:51: ^( OBJ ( pair )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(OBJ, "OBJ")
                , root_1);

                // Atto.g:195:57: ( pair )*
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
    // Atto.g:198:1: pair : NAME COLON ^ body ;
    public final AttoParser.pair_return pair() throws RecognitionException {
        AttoParser.pair_return retval = new AttoParser.pair_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME127=null;
        Token COLON128=null;
        AttoParser.body_return body129 =null;


        AttoTree NAME127_tree=null;
        AttoTree COLON128_tree=null;

        try {
            // Atto.g:199:2: ( NAME COLON ^ body )
            // Atto.g:199:4: NAME COLON ^ body
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME127=(Token)match(input,NAME,FOLLOW_NAME_in_pair1275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME127_tree = 
            (AttoTree)adaptor.create(NAME127)
            ;
            adaptor.addChild(root_0, NAME127_tree);
            }

            COLON128=(Token)match(input,COLON,FOLLOW_COLON_in_pair1277); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON128_tree = 
            (AttoTree)adaptor.create(COLON128)
            ;
            root_0 = (AttoTree)adaptor.becomeRoot(COLON128_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_pair1280);
            body129=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body129.getTree());

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
    // Atto.g:202:1: prop : LCURLY obj RCURLY -> ^( PROP obj ) ;
    public final AttoParser.prop_return prop() throws RecognitionException {
        AttoParser.prop_return retval = new AttoParser.prop_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LCURLY130=null;
        Token RCURLY132=null;
        AttoParser.obj_return obj131 =null;


        AttoTree LCURLY130_tree=null;
        AttoTree RCURLY132_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_obj=new RewriteRuleSubtreeStream(adaptor,"rule obj");
        try {
            // Atto.g:203:2: ( LCURLY obj RCURLY -> ^( PROP obj ) )
            // Atto.g:203:4: LCURLY obj RCURLY
            {
            LCURLY130=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_prop1291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY130);


            pushFollow(FOLLOW_obj_in_prop1293);
            obj131=obj();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_obj.add(obj131.getTree());

            RCURLY132=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_prop1295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY132);


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
            // 203:22: -> ^( PROP obj )
            {
                // Atto.g:203:25: ^( PROP obj )
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
    // Atto.g:206:1: array : LBRACK ( expr ( ( COMMA )? expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) ;
    public final AttoParser.array_return array() throws RecognitionException {
        AttoParser.array_return retval = new AttoParser.array_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token LBRACK133=null;
        Token COMMA135=null;
        Token COMMA137=null;
        Token RBRACK138=null;
        AttoParser.expr_return expr134 =null;

        AttoParser.expr_return expr136 =null;


        AttoTree LBRACK133_tree=null;
        AttoTree COMMA135_tree=null;
        AttoTree COMMA137_tree=null;
        AttoTree RBRACK138_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Atto.g:207:2: ( LBRACK ( expr ( ( COMMA )? expr )* )? ( COMMA )? RBRACK -> ^( ARRAY ( expr )* ) )
            // Atto.g:207:4: LBRACK ( expr ( ( COMMA )? expr )* )? ( COMMA )? RBRACK
            {
            LBRACK133=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array1315); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK133);


            // Atto.g:207:11: ( expr ( ( COMMA )? expr )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ARROW||LA49_0==AT||LA49_0==BOOL||LA49_0==IF||LA49_0==INT||(LA49_0 >= LBRACK && LA49_0 <= LCURLY)||LA49_0==LPAREN||LA49_0==MINUS||LA49_0==NAME||(LA49_0 >= NOT && LA49_0 <= NULL)||LA49_0==STRING||LA49_0==WHILE) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Atto.g:207:12: expr ( ( COMMA )? expr )*
                    {
                    pushFollow(FOLLOW_expr_in_array1318);
                    expr134=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr134.getTree());

                    // Atto.g:207:17: ( ( COMMA )? expr )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==COMMA) ) {
                            int LA48_1 = input.LA(2);

                            if ( (LA48_1==ARROW||LA48_1==AT||LA48_1==BOOL||LA48_1==IF||LA48_1==INT||(LA48_1 >= LBRACK && LA48_1 <= LCURLY)||LA48_1==LPAREN||LA48_1==MINUS||LA48_1==NAME||(LA48_1 >= NOT && LA48_1 <= NULL)||LA48_1==STRING||LA48_1==WHILE) ) {
                                alt48=1;
                            }


                        }
                        else if ( (LA48_0==ARROW||LA48_0==AT||LA48_0==BOOL||LA48_0==IF||LA48_0==INT||(LA48_0 >= LBRACK && LA48_0 <= LCURLY)||LA48_0==LPAREN||LA48_0==MINUS||LA48_0==NAME||(LA48_0 >= NOT && LA48_0 <= NULL)||LA48_0==STRING||LA48_0==WHILE) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // Atto.g:207:18: ( COMMA )? expr
                    	    {
                    	    // Atto.g:207:18: ( COMMA )?
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( (LA47_0==COMMA) ) {
                    	        alt47=1;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // Atto.g:207:18: COMMA
                    	            {
                    	            COMMA135=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1321); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA135);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_expr_in_array1324);
                    	    expr136=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr136.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }


            // Atto.g:207:35: ( COMMA )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==COMMA) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Atto.g:207:35: COMMA
                    {
                    COMMA137=(Token)match(input,COMMA,FOLLOW_COMMA_in_array1331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA137);


                    }
                    break;

            }


            RBRACK138=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array1334); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK138);


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
            // 207:49: -> ^( ARRAY ( expr )* )
            {
                // Atto.g:207:52: ^( ARRAY ( expr )* )
                {
                AttoTree root_1 = (AttoTree)adaptor.nil();
                root_1 = (AttoTree)adaptor.becomeRoot(
                (AttoTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // Atto.g:207:60: ( expr )*
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
    // Atto.g:210:1: vardef : NAME ;
    public final AttoParser.vardef_return vardef() throws RecognitionException {
        AttoParser.vardef_return retval = new AttoParser.vardef_return();
        retval.start = input.LT(1);


        AttoTree root_0 = null;

        Token NAME139=null;

        AttoTree NAME139_tree=null;

        try {
            // Atto.g:211:2: ( NAME )
            // Atto.g:211:4: NAME
            {
            root_0 = (AttoTree)adaptor.nil();


            NAME139=(Token)match(input,NAME,FOLLOW_NAME_in_vardef1354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME139_tree = 
            (AttoTree)adaptor.create(NAME139)
            ;
            adaptor.addChild(root_0, NAME139_tree);
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
        // Atto.g:87:4: ( assign )
        // Atto.g:87:5: assign
        {
        pushFollow(FOLLOW_assign_in_synpred1_Atto340);
        assign();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Atto

    // $ANTLR start synpred2_Atto
    public final void synpred2_Atto_fragment() throws RecognitionException {
        // Atto.g:88:4: ( fun )
        // Atto.g:88:5: fun
        {
        pushFollow(FOLLOW_fun_in_synpred2_Atto350);
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


 

    public static final BitSet FOLLOW_stmt_in_root141 = new BitSet(new long[]{0x00064A1A40001542L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_stmt163 = new BitSet(new long[]{0x1001000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_stmt166 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stmt189 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NAME_in_stmt193 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_EXTENDS_in_stmt196 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NAME_in_stmt200 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt204 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INDENT_in_stmt210 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_pair_in_stmt212 = new BitSet(new long[]{0x0001400000024000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt214 = new BitSet(new long[]{0x0000400000024000L});
    public static final BitSet FOLLOW_COMMA_in_stmt218 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_pair_in_stmt221 = new BitSet(new long[]{0x0001400000024000L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt223 = new BitSet(new long[]{0x0000400000024000L});
    public static final BitSet FOLLOW_DEDENT_in_stmt228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_block269 = new BitSet(new long[]{0x00064A1A40021540L,0x0000000000000009L});
    public static final BitSet FOLLOW_stmt_in_block277 = new BitSet(new long[]{0x00064A1A40021540L,0x0000000000000009L});
    public static final BitSet FOLLOW_pair_in_block294 = new BitSet(new long[]{0x0001400000024000L});
    public static final BitSet FOLLOW_NEWLINE_in_block296 = new BitSet(new long[]{0x0000400000024000L});
    public static final BitSet FOLLOW_COMMA_in_block300 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_pair_in_block303 = new BitSet(new long[]{0x0001400000024000L});
    public static final BitSet FOLLOW_NEWLINE_in_block305 = new BitSet(new long[]{0x0000400000024000L});
    public static final BitSet FOLLOW_DEDENT_in_block328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_expr354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_expr359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_expr364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_expr369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_in_assign380 = new BitSet(new long[]{0x0080380000080080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign388 = new BitSet(new long[]{0x00074A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_body_in_assign390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_assign409 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign411 = new BitSet(new long[]{0x00074A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_body_in_assign413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_assign438 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign440 = new BitSet(new long[]{0x00074A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_body_in_assign442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_assign467 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign469 = new BitSet(new long[]{0x00074A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_body_in_assign471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_assign496 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign498 = new BitSet(new long[]{0x00074A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_body_in_assign500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_assign525 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assign527 = new BitSet(new long[]{0x00074A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_body_in_assign529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramsdef_in_fun569 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fun571 = new BitSet(new long[]{0x00074A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_body_in_fun574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardef_in_paramsdef586 = new BitSet(new long[]{0x0000400000004002L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef589 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef592 = new BitSet(new long[]{0x0000400000004002L});
    public static final BitSet FOLLOW_LPAREN_in_paramsdef610 = new BitSet(new long[]{0x0800400000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef613 = new BitSet(new long[]{0x0800400000004000L});
    public static final BitSet FOLLOW_COMMA_in_paramsdef616 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_vardef_in_paramsdef619 = new BitSet(new long[]{0x0800400000004000L});
    public static final BitSet FOLLOW_RPAREN_in_paramsdef625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_body647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_body653 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_body655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_672 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_if_676 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_if_684 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_if_686 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elif_in_if_688 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_else__in_if_691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_if_721 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_if_725 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_if_728 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_if_732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif776 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_elif778 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elif780 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_elif782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_803 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_else_805 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_else_807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_827 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_while_831 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_while_839 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_while_841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_while_859 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_while_863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or891 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_or894 = new BitSet(new long[]{0x00064A1A00000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_and_in_or897 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rel_in_and910 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and913 = new BitSet(new long[]{0x00064A1A00000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_rel_in_and916 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_add_in_rel929 = new BitSet(new long[]{0x0040842018810002L});
    public static final BitSet FOLLOW_set_in_rel932 = new BitSet(new long[]{0x00064A1A00000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_add_in_rel951 = new BitSet(new long[]{0x0040842018810002L});
    public static final BitSet FOLLOW_mul_in_add964 = new BitSet(new long[]{0x0080080000000002L});
    public static final BitSet FOLLOW_set_in_add967 = new BitSet(new long[]{0x00064A1A00000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_mul_in_add974 = new BitSet(new long[]{0x0080080000000002L});
    public static final BitSet FOLLOW_unary_in_mul987 = new BitSet(new long[]{0x0000300000080002L});
    public static final BitSet FOLLOW_set_in_mul990 = new BitSet(new long[]{0x00064A1A00000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_unary_in_mul999 = new BitSet(new long[]{0x0000300000080002L});
    public static final BitSet FOLLOW_postfix_in_unary1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary1018 = new BitSet(new long[]{0x0004421A00000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_postfix_in_unary1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary1026 = new BitSet(new long[]{0x0004421A00000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_postfix_in_unary1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix1050 = new BitSet(new long[]{0x0000020800100002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix1063 = new BitSet(new long[]{0x08064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_postfix1066 = new BitSet(new long[]{0x08064A1A40004540L,0x0000000000000009L});
    public static final BitSet FOLLOW_COMMA_in_postfix1069 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_postfix1072 = new BitSet(new long[]{0x08064A1A40004540L,0x0000000000000009L});
    public static final BitSet FOLLOW_RPAREN_in_postfix1078 = new BitSet(new long[]{0x0000020800100002L});
    public static final BitSet FOLLOW_LBRACK_in_postfix1102 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_postfix1104 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix1106 = new BitSet(new long[]{0x0000020800100002L});
    public static final BitSet FOLLOW_DOT_in_postfix1129 = new BitSet(new long[]{0x0004421A00000500L,0x0000000000000001L});
    public static final BitSet FOLLOW_primary_in_postfix1133 = new BitSet(new long[]{0x0000020800100002L});
    public static final BitSet FOLLOW_NAME_in_primary1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_primary1173 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NAME_in_primary1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primary1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_primary1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary1202 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_primary1204 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primary1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_in_primary1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_primary1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prop_in_primary1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_obj1237 = new BitSet(new long[]{0x0400400000004000L});
    public static final BitSet FOLLOW_pair_in_obj1240 = new BitSet(new long[]{0x0400400000004000L});
    public static final BitSet FOLLOW_COMMA_in_obj1243 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_pair_in_obj1246 = new BitSet(new long[]{0x0400400000004000L});
    public static final BitSet FOLLOW_COMMA_in_obj1252 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_obj1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_pair1275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_pair1277 = new BitSet(new long[]{0x00074A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_body_in_pair1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_prop1291 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_obj_in_prop1293 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_prop1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array1315 = new BitSet(new long[]{0x02064A1A40004540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_array1318 = new BitSet(new long[]{0x02064A1A40004540L,0x0000000000000009L});
    public static final BitSet FOLLOW_COMMA_in_array1321 = new BitSet(new long[]{0x00064A1A40000540L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_array1324 = new BitSet(new long[]{0x02064A1A40004540L,0x0000000000000009L});
    public static final BitSet FOLLOW_COMMA_in_array1331 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_vardef1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_synpred1_Atto340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_synpred2_Atto350 = new BitSet(new long[]{0x0000000000000002L});

}