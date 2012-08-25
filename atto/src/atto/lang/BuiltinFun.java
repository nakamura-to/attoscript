package atto.lang;

import java.io.PrintWriter;

public abstract class BuiltinFun extends Fun {

    protected BuiltinFun(Runtime runtime, Env env, String[] params) {
        super(runtime, env, params);
    }

    public static class PrintFun extends BuiltinFun {

        protected PrintWriter out;

        public PrintFun(Runtime runtime, PrintWriter out) {
            this(runtime, null, new String[] { "obj" });
            this.out = out;
        }

        protected PrintFun(Runtime runtime, Env env, String[] params) {
            super(runtime, env, params);
        }

        @Override
        protected Obj invoke(Obj receiver, Obj[] args) {
            Obj o = args[0];
            Obj s = o.send("toString");
            out.println(s.object);
            out.flush();
            return s;
        }

        @Override
        protected Obj applyPartial(Env env, String[] params) {
            return new PrintFun(runtime, env, params);
        }
    }

}
