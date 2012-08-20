package atto;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

public class AttoParserTest extends TestCase {

    public void testAtom_INT() throws Exception {
        AttoParser p = createParser("1");
        AttoTree t = (AttoTree) p.atom().getTree();
        assertEquals("1", t.toStringTree());
    }

    public void testCall() throws Exception {
        AttoParser p = createParser("(fun x,y->x+y)(1,2)(3, 4)\n");
        AttoTree t = (AttoTree) p.stmt().getTree();
        assertEquals(
                "(STMT (CALL (FUN x y (+ x y)) (ARGSDEF 1 2) (ARGSDEF 3 4)))",
                t.toStringTree());
    }

    public void testCall2() throws Exception {
        AttoParser p = createParser("n * fuct(n-1)\n");
        AttoTree t = (AttoTree) p.stmt().getTree();
        System.out.println(t.toStringTree());
    }

    public void testFun_expr() throws Exception {
        AttoParser p = createParser("fun a, b -> a + b\n");
        AttoTree t = (AttoTree) p.fun().getTree();
        assertEquals("(FUN a b (+ a b))", t.toStringTree());
    }

    public void testFun_block() throws Exception {
        AttoParser p = createParser("fun a, b ->\n  a + b\n");
        AttoTree t = (AttoTree) p.fun().getTree();
        assertEquals("(FUN a b (BLOCK (STMT (+ a b))))", t.toStringTree());
    }

    public void testIf() throws Exception {
        AttoParser p = createParser("if true\n  100\n");
        AttoTree t = (AttoTree) p.if_().getTree();
        assertEquals("(IF true (BLOCK (STMT 100)))", t.toStringTree());
    }

    public void testElif() throws Exception {
        AttoParser p = createParser("if true\n  100\nelif true\n  200\nelif true\n  300\n");
        AttoTree t = (AttoTree) p.if_().getTree();
        assertEquals(
                "(IF true (BLOCK (STMT 100)) (ELIF true (BLOCK (STMT 200))) (ELIF true (BLOCK (STMT 300))))",
                t.toStringTree());
    }

    private AttoParser createParser(String input) throws Exception {
        ANTLRStringStream stream = new ANTLRStringStream(input);
        AttoLexer lexer = new AttoLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AttoTokenSource source = new AttoTokenSource(tokens);
        AttoParser parser = new AttoParser(new CommonTokenStream(source));
        parser.setTreeAdaptor(Interpreter.treeAdaptor);
        return parser;
    }
}
