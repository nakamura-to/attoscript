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

    // public void testPipeline() throws Exception {
    // AttoParser p = createParser("10 |> double |> print");
    // AttoTree t = (AttoTree) p.rel().getTree();
    // assertEquals("(|> (|> 10 double) print)", t.toStringTree());
    // }

    private AttoParser createParser(String input) throws Exception {
        ANTLRStringStream stream = new ANTLRStringStream(input);
        AttoLexer lexer = new AttoLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AttoParser parser = new AttoParser(tokens);
        parser.setTreeAdaptor(new AttoTreeAdaptor());
        return parser;
    }
}
