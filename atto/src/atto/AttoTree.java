package atto;

import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class AttoTree extends CommonTree {
    Scope scope;

    public AttoTree(Token token) {
        super(token);
    }

    @Override
    public AttoTree getChild(int i) {
        return (AttoTree) super.getChild(i);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<AttoTree> getChildren() {
        return (List<AttoTree>) super.getChildren();
    }
}
