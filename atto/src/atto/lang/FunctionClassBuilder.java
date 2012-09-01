package atto.lang;

public class FunctionClassBuilder {

    protected Runtime runtime;

    public FunctionClassBuilder(Runtime runtime) {
        this.runtime = runtime;
    }

    public ClassFun build() {
        Obj proto = runtime.functionProto;

        proto.addMethod("|>", new Method("arg") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) receiver;
                return fun.apply(runtime.nullObj, args);
            }
        });

        proto.addMethod("<|", new Method("arg") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) receiver;
                return fun.apply(runtime.nullObj, args);
            }
        });

        proto.addMethod(">>", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun lhs = (Fun) receiver;
                Obj rhs = args[0];
                if (!(rhs instanceof Fun)) {
                    throw new RuntimeException("not function: ");
                }
                return runtime.newCompositeFun(lhs, (Fun) rhs);
            }
        });

        proto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                // TODO
                Fun fun = (Fun) receiver;
                StringBuilder buf = new StringBuilder();
                buf.append("(");
                String[] params = fun.params;
                int len = fun.params.length;
                for (int i = 0; i < len; i++) {
                    buf.append(params[i]);
                    buf.append(", ");
                }
                if (len > 0) {
                    buf.delete(buf.length() - 2, buf.length());
                }
                buf.append(")->...");
                return runtime.newString(buf.toString());
            }
        });

        return (ClassFun) runtime.objectClass.callMethod("clone", proto);
    }

}
