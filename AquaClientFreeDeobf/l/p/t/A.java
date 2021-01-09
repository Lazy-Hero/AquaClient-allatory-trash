/*
 * Decompiled with CFR 0.150.
 */
package l.p.t;

import l.p.t.F;
import l.p.t.a;

public class A
extends F<a> {
    private String i;
    private a[] ALLATORIxDEMO;

    public A(String a2, a ... a3) {
        super("+ " + a2, null);
        A a4;
        a4.i = a2;
        a4.ALLATORIxDEMO = a3;
    }

    @Override
    public a[] ALLATORIxDEMO() {
        A a2;
        return a2.ALLATORIxDEMO;
    }

    public a ALLATORIxDEMO(String a2) {
        A a3;
        a a4 = null;
        for (a a5 : a3.ALLATORIxDEMO) {
            if (!a5.ALLATORIxDEMO().equals(a2)) continue;
            a4 = a5;
        }
        return a4;
    }

    @Override
    public String b() {
        A a2;
        return a2.i;
    }
}

