package atto.lang;

import atto.AttoTree;
import atto.Env;

public class Fun {

    public Env env;

    public String[] params;

    public AttoTree body;

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("fun ");
        if (params.length > 0) {
            for (String p : params) {
                buf.append(p);
                buf.append(", ");
            }
            if (params.length > 0) {
                buf.delete(buf.length() - 2, buf.length());
            }
        }
        buf.append(" -> ");
        buf.append("...");
        return buf.toString();
    }
}
