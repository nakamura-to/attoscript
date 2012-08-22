package atto.lang;

import atto.Interpreter;

public interface BuiltinFun extends Fun {

    public static BuiltinFun assert_ = new BuiltinFun() {

        @Override
        public Object call(Interpreter interpreter, Object[] args) {
            if (args.length > 0) {
                if (!interpreter.toBoolean(args[0])) {
                    if (args.length > 1) {
                        throw new RuntimeException(args[1].toString());
                    }
                    throw new RuntimeException();
                }
            }
            return null;
        }
    };

    public static BuiltinFun print = new BuiltinFun() {

        @Override
        public Object call(Interpreter interpreter, Object[] args) {
            StringBuilder buf = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                buf.append(args[i]).append(" ");
            }
            if (args.length > 0) {
                buf.delete(buf.length() - 1, buf.length());
            }
            String s = buf.toString();
            interpreter.out.println(s);
            interpreter.out.flush();
            return s;
        }
    };

}
