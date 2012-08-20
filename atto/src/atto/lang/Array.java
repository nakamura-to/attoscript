package atto.lang;

public class Array {

    public Object[] values = null;

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("[");
        if (values != null) {
            for (Object v : values) {
                buf.append(v);
                buf.append(", ");
            }
            if (values.length > 0) {
                buf.delete(buf.length() - 2, buf.length());
            }
        }
        buf.append("]");
        return buf.toString();
    }
}
