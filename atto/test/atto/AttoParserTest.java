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
