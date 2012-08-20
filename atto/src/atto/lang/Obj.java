package atto.lang;

import java.util.Map;

public class Obj {

    public Map<String, Object> values;

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("{");
        if (values != null) {
            for (Map.Entry<String, Object> e : values.entrySet()) {
                buf.append(e.getKey());
                buf.append(": ");
                buf.append(e.getValue());
                buf.append(", ");
            }
            if (values.size() > 0) {
                buf.delete(buf.length() - 2, buf.length());
            }
        }
        buf.append("}");
        return buf.toString();
    }
}
