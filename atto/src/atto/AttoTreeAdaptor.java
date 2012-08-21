package atto;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class AttoTreeAdaptor extends CommonTreeAdaptor {

    @Override
    public Object create(Token token) {
        return new AttoTree(token);
    }

    @Override
    public Object dupNode(Object t) {
        if (t == null) {
            return null;
        }
        return create(((AttoTree) t).token);
    }

    public Object errorNode(org.antlr.runtime.TokenStream input, Token start,
            Token stop, RecognitionException e) {
        return new AttoErrorNode(input, start, stop, e);
    }
}
