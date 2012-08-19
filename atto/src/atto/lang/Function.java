package atto.lang;

import java.util.ArrayList;
import java.util.List;

import atto.AttoTree;
import atto.Scope;


public class Function {

    public Scope scope;

    public List<AttoTree> parameters = new ArrayList<AttoTree>();

    public AttoTree body;

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("fun ");
        for (AttoTree p : parameters) {
            buf.append(p.toStringTree());
            buf.append(", ");
        }
        if (parameters.size() > 0) {
            buf.delete(buf.length() - 2, buf.length());
        }
        buf.append(" -> ");
        buf.append(body.toStringTree());
        return buf.toString();
    }
}
