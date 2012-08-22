package atto;

import java.io.InputStream;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class ScriptTest extends TestCase {

    private InputStream stream;

    @Override
    protected void tearDown() throws Exception {
        if (stream != null) {
            stream.close();
        }
    }

    public void testWhile() throws Exception {
        InputStream stream = read("atto/while.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(1000), i.run(stream));
    }

    public void testWhile_then() throws Exception {
        InputStream stream = read("atto/while_then.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(1000), i.run(stream));
    }

    public void testFactorial() throws Exception {
        InputStream stream = read("atto/factorial.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3628800), i.run(stream));
    }

    public void testIf() throws Exception {
        InputStream stream = read("atto/if.atto");
        Interpreter i = new Interpreter();
        assertEquals("foo", i.run(stream));
    }

    public void testIf_then() throws Exception {
        InputStream stream = read("atto/if_then.atto");
        Interpreter i = new Interpreter();
        assertEquals("foo", i.run(stream));
    }

    public void testCounter() throws Exception {
        InputStream stream = read("atto/counter.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3), i.run(stream));
    }

    public void testObj() throws Exception {
        InputStream stream = read("atto/obj.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(20), i.run(stream));
    }

    public void testLineJoining() throws Exception {
        InputStream stream = read("atto/line_joining.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(2), i.run(stream));
    }

    public void testAssign() throws Exception {
        InputStream stream = read("atto/assign.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(1), i.run(stream));
    }

    public void testComposite() throws Exception {
        InputStream stream = read("atto/composite.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(10), i.run(stream));
    }

    public void testPartialApplication() throws Exception {
        InputStream stream = read("atto/partial_application.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(7), i.run(stream));
    }

    public void testDotChain() throws Exception {
        InputStream stream = read("atto/dot_chain.atto");
        Interpreter i = new Interpreter();
        assertEquals("hoge", i.run(stream));
    }

    private InputStream read(String path) throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream(path);
        if (stream == null) {
            throw new AssertionFailedError("not found: " + path);
        }
        return stream;
    }

}
