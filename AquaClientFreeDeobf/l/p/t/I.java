/*
 * Decompiled with CFR 0.150.
 */
package l.p.t;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class I {
    private long ALLATORIxDEMO = 0L;
    private boolean i = true;

    public I() {
        I a2;
    }

    private /* synthetic */ long b() {
        return System.nanoTime() / 1000000L;
    }

    public void b() {
        I a2;
        a2.i = true;
        a2.ALLATORIxDEMO();
    }

    public boolean ALLATORIxDEMO() {
        I a2;
        return a2.i;
    }

    public boolean ALLATORIxDEMO(long a2) {
        I a3;
        if (a3.i) {
            return false;
        }
        if (System.nanoTime() / 1000000L - a3.ALLATORIxDEMO >= a2) {
            return true;
        }
        return a2 <= 0L;
    }

    public void B() {
        I a2;
        a2.i = false;
        a2.ALLATORIxDEMO();
    }

    public long ALLATORIxDEMO() {
        I a2;
        return a2.b() - a2.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO() {
        I a2;
        a2.ALLATORIxDEMO = a2.b();
    }
}

