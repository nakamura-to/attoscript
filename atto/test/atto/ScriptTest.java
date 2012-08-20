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

    public void testLoop() throws Exception {
        InputStream stream = read("atto/loop.atto");
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

    // ignore
    public void _testCounter() throws Exception {
        InputStream stream = read("atto/counter.atto");
        Interpreter i = new Interpreter();
        assertEquals("foo", i.run(stream));
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
