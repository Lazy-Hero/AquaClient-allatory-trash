/*
 * Decompiled with CFR 0.150.
 */
package l.p.p;

import java.util.ArrayList;
import l.p.p.i;

public class H {
    private ArrayList<i> ALLATORIxDEMO = new ArrayList();

    public i ALLATORIxDEMO(l.p.l.H a2, String a3) {
        H a4;
        for (i i2 : a4.ALLATORIxDEMO()) {
            if (!i2.b().equalsIgnoreCase(a3) || i2.ALLATORIxDEMO() != a2) continue;
            return i2;
        }
        System.err.println(new StringBuilder().insert(0, "[Tutorial] Error Setting NOT found: '").append(a3).append("'!").toString());
        return null;
    }

    public ArrayList<i> ALLATORIxDEMO(l.p.l.H a2) {
        H a3;
        ArrayList<i> arrayList = new ArrayList<i>();
        for (i i2 : a3.ALLATORIxDEMO()) {
            if (!i2.ALLATORIxDEMO().equals(a2)) continue;
            arrayList.add(i2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public ArrayList<i> ALLATORIxDEMO() {
        H a2;
        return a2.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(i a2) {
        H a3;
        a3.ALLATORIxDEMO.add(a2);
    }

    public H() {
        H a2;
    }
}

