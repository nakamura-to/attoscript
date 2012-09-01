package atto.lang;

import java.io.PrintWriter;

public abstract class BuiltinFun extends Fun {

    protected BuiltinFun(Runtime runtime, Env env, String[] params) {
        super(runtime, env, params);
    }

    public static class PrintFun extends BuiltinFun {

        protected PrintWriter out;

        public PrintFun(Runtime runtime, PrintWriter out) {
            this(runtime, runtime.currentEnv, new String[] { "obj" });
            this.out = out;
        }

        protected PrintFun(Runtime runtime, Env env, String[] params) {
            super(runtime, env, params);
        }

        @Override
        protected Obj invoke(Obj receiver, Obj[] args) {
            Obj o = args[0];
            Obj s;
            if (o == runtime.nullObj) {
                s = runtime.newString("null");
                out.println("null");
            } else {
                s = o.callMethod("toString");
                out.println(s.asObject());
            }
            out.flush();
            return s;
        }

        @Override
        protected Obj applyPartial(Env env, String[] params) {
            return new PrintFun(runtime, env, params);
        }
    }

    public static class AssertFun extends BuiltinFun {

        protected PrintWriter out;

        public AssertFun(Runtime runtime, PrintWriter out) {
            this(runtime, runtime.currentEnv,
                    new String[] { "bool", "message" });
            this.out = out;
        }

        protected AssertFun(Runtime runtime, Env env, String[] params) {
            super(runtime, env, params);
        }

        @Override
        protected Obj invoke(Obj receiver, Obj[] args) {
            if (args.length > 0) {
                if (args[0] != runtime.trueObj) {
                    String message = "ASSERT FAILED: ";
                    if (args.length > 1) {
                        message += args[1].callMethod("toString").get(
                                "__value__");
                    }
                    out.println("ASSERT FAILED: " + message);
                    out.flush();
                    throw new AssertionError(message);
                }
            }
            return runtime.nullObj;
        }

        @Override
        protected Obj applyPartial(Env env, String[] params) {
            return new AssertFun(runtime, env, params);
        }
    }

    public static class TimeFun extends BuiltinFun {

        public TimeFun(Runtime runtime) {
            this(runtime, runtime.currentEnv, new String[] {});
        }

        protected TimeFun(Runtime runtime, Env env, String[] params) {
            super(runtime, env, params);
        }

        @Override
        protected Obj invoke(Obj receiver, Obj[] args) {
            return runtime.newNumber(System.currentTimeMillis());
        }

        @Override
        protected Obj applyPartial(Env env, String[] params) {
            return new TimeFun(runtime, env, params);
        }
    }

}
