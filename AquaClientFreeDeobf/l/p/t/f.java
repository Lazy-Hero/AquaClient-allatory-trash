/*
 * Decompiled with CFR 0.150.
 */
package l.p.t;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f {
    private long ALLATORIxDEMO;

    public long ALLATORIxDEMO() {
        return System.nanoTime() / 1000000L;
    }

    public void ALLATORIxDEMO() {
        f a2;
        a2.ALLATORIxDEMO = a2.ALLATORIxDEMO();
    }

    public boolean ALLATORIxDEMO(float a2) {
        f a3;
        return (float)(a3.ALLATORIxDEMO() - a3.ALLATORIxDEMO) >= a2;
    }

    public void ALLATORIxDEMO(long a2) {
        a.ALLATORIxDEMO = a2;
    }

    public boolean ALLATORIxDEMO(long a2) {
        f a3;
        return a3.ALLATORIxDEMO() - a3.ALLATORIxDEMO >= a2;
    }

    public boolean ALLATORIxDEMO(Float a2) {
        f a3;
        return (float)(a3.ALLATORIxDEMO() - a3.ALLATORIxDEMO) >= a2.floatValue();
    }

    public boolean ALLATORIxDEMO(int a2) {
        f a3;
        return a3.ALLATORIxDEMO() - a3.ALLATORIxDEMO >= (long)a2;
    }

    public f() {
        f a2;
    }

    public long b() {
        f a2;
        return a2.ALLATORIxDEMO;
    }

    public boolean ALLATORIxDEMO(double a2) {
        f a3;
        return (double)(a3.ALLATORIxDEMO() - a3.ALLATORIxDEMO) >= a2;
    }

    public long B() {
        f a2;
        return a2.ALLATORIxDEMO() - a2.ALLATORIxDEMO;
    }
}

