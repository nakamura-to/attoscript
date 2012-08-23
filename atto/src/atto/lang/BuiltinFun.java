package atto.lang;

import atto.Env;
import atto.Interpreter;

public abstract class BuiltinFun extends Fun {

    private BuiltinFun(Env env, String[] params) {
        super(env, params);
    }

    public static class PrintFun extends BuiltinFun {

        public PrintFun(Env env) {
            this(env, new String[] { "obj" });
        }

        private PrintFun(Env env, String[] params) {
            super(env, params);
        }

        @Override
        protected Object invoke(Interpreter interpreter) {
            Object o = interpreter.currentEnv.get("obj");
            String s = o == null ? "null" : o.toString();
            interpreter.out.println(s);
            interpreter.out.flush();
            return s;
        }

        @Override
        protected Object applyPartial(Env env, String[] params) {
            return new PrintFun(env, params);
        }
    }

}
