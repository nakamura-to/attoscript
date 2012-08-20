package atto;

import java.io.InputStream;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class ScriptTest extends TestCase {

    public void testLoop() throws Exception {
        InputStream stream = read("atto/loop.atto");
        try {
            Interpreter i = new Interpreter();
            assertEquals(new Integer(1000), i.run(stream));
        } finally {
            stream.close();
        }
    }

    public void testFactorial() throws Exception {
        InputStream stream = read("atto/factorial.atto");
        try {
            Interpreter i = new Interpreter();
            assertEquals(new Integer(3628800), i.run(stream));
        } finally {
            stream.close();
        }
    }

    public void testIf() throws Exception {
        InputStream stream = read("atto/if.atto");
        try {
            Interpreter i = new Interpreter();
            assertEquals("foo", i.run(stream));
        } finally {
            stream.close();
        }
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
