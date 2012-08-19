package atto;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

public class AttoErrorNode extends AttoTree {

    public AttoErrorNode(TokenStream input, Token start, Token stop,
            RecognitionException e) {
        super(start);
    }
}
