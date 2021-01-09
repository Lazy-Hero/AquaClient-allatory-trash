/*
 * Decompiled with CFR 0.150.
 */
package l.p.t;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L {
    private long ALLATORIxDEMO = 0L;
    private long i = 0L;

    public boolean ALLATORIxDEMO(long a2) {
        L a3;
        return System.currentTimeMillis() - a3.ALLATORIxDEMO >= a2;
    }

    public void ALLATORIxDEMO(long a2) {
        a.ALLATORIxDEMO = a2;
    }

    public boolean ALLATORIxDEMO(float a2) {
        L a3;
        return (float)(a3.ALLATORIxDEMO() - a3.i) >= a2;
    }

    public long ALLATORIxDEMO() {
        return System.nanoTime() / 1000000L;
    }

    public void ALLATORIxDEMO() {
        a.ALLATORIxDEMO = System.currentTimeMillis();
    }

    public long b() {
        return System.nanoTime() / 1000000L;
    }

    public boolean b(float a2) {
        L a3;
        return (float)(a3.b() - a3.ALLATORIxDEMO) >= a2;
    }

    public void b() {
        L a2;
        a2.ALLATORIxDEMO = a2.b();
    }

    public L() {
        L a2;
    }

    public int ALLATORIxDEMO(int a2) {
        return 1000 / a2;
    }
}

