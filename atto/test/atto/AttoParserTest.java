package atto;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

public class AttoParserTest extends TestCase {

    public void testPrimary_NUMBER() throws Exception {
        AttoParser p = createParser("1");
        AttoTree t = (AttoTree) p.primary().getTree();
        assertEquals("1", t.toStringTree());
    }

    public void testMINUS() throws Exception {
        AttoParser p = createParser("10 -2");
        AttoTree t = (AttoTree) p.root().getTree();
        assertEquals("(BLOCK (- 10 2))", t.toStringTree());
    }

    private AttoParser createParser(String input) throws Exception {
        ANTLRStringStream stream = new ANTLRStringStream(input);
        AttoLexer lexer = new AttoLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AttoParser parser = new AttoParser(tokens);
        parser.setTreeAdaptor(new AttoTreeAdaptor());
        return parser;
    }
}
