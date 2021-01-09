/*
 * Decompiled with CFR 0.150.
 */
package l.p.l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.p.l.H;
import l.p.l.I;
import l.p.l.L;
import l.p.l.d.A;
import l.p.l.l.j;
import l.p.l.p.C;
import l.p.l.p.D;
import l.p.l.p.F;
import l.p.l.p.G;
import l.p.l.p.e;
import l.p.l.p.f;
import l.p.l.p.g;
import l.p.l.p.k;
import l.p.l.p.l;
import l.p.l.p.m;
import l.p.l.t.a;
import l.p.l.t.c;
import l.p.l.t.d;

public class i {
    public ArrayList<H> ALLATORIxDEMO = new ArrayList();

    public void ALLATORIxDEMO(List<H> a2) {
        i a3;
        Collections.sort(a2, new L(a3));
    }

    public ArrayList<H> ALLATORIxDEMO() {
        i a2;
        return a2.ALLATORIxDEMO;
    }

    public i() {
        i a2;
        a2.ALLATORIxDEMO.clear();
        a2.ALLATORIxDEMO.add(new a());
        a2.ALLATORIxDEMO.add(new l.p.l.l.i());
        a2.ALLATORIxDEMO.add(new l.p.l.p.i());
        a2.ALLATORIxDEMO.add(new k());
        a2.ALLATORIxDEMO.add(new c());
        a2.ALLATORIxDEMO.add(new A());
        a2.ALLATORIxDEMO.add(new e());
        a2.ALLATORIxDEMO.add(new l.p.l.d.g());
        a2.ALLATORIxDEMO.add(new g());
        a2.ALLATORIxDEMO.add(new l.p.l.t.g());
        a2.ALLATORIxDEMO.add(new l.p.l.d.i());
        a2.ALLATORIxDEMO.add(new C());
        a2.ALLATORIxDEMO.add(new l.p.l.l.c());
        a2.ALLATORIxDEMO.add(new l.p.l.t.H());
        a2.ALLATORIxDEMO.add(new l.p.l.t.F());
        a2.ALLATORIxDEMO.add(new l());
        a2.ALLATORIxDEMO.add(new l.p.l.p.I());
        a2.ALLATORIxDEMO.add(new F());
        a2.ALLATORIxDEMO.add(new m());
        a2.ALLATORIxDEMO.add(new l.p.l.p.L());
        a2.ALLATORIxDEMO.add(new l.p.l.t.e());
        a2.ALLATORIxDEMO.add(new j());
        a2.ALLATORIxDEMO.add(new l.p.l.d.c());
        a2.ALLATORIxDEMO.add(new l.p.l.p.a());
        a2.ALLATORIxDEMO.add(new G());
        a2.ALLATORIxDEMO.add(new f());
        a2.ALLATORIxDEMO.add(new l.p.l.d.I());
        a2.ALLATORIxDEMO.add(new l.p.l.t.A());
        a2.ALLATORIxDEMO.add(new l.p.l.p.d());
        a2.ALLATORIxDEMO.add(new l.p.l.d.H());
        a2.ALLATORIxDEMO.add(new l.p.l.p.j());
        a2.ALLATORIxDEMO.add(new D());
        a2.ALLATORIxDEMO.add(new l.p.l.d.a());
        a2.ALLATORIxDEMO.add(new l.p.l.l.I());
        a2.ALLATORIxDEMO.add(new l.p.l.p.c());
        a2.ALLATORIxDEMO.add(new d());
        a2.ALLATORIxDEMO.add(new l.p.l.p.A());
        a2.ALLATORIxDEMO.add(new l.p.l.l.F());
        a2.ALLATORIxDEMO.add(new l.p.l.l.a());
        a2.ALLATORIxDEMO.add(new l.p.l.l.d());
        a2.ALLATORIxDEMO(a2.ALLATORIxDEMO);
    }

    public ArrayList<H> ALLATORIxDEMO(I a2) {
        i a3;
        ArrayList<H> arrayList = new ArrayList<H>();
        for (H h : a3.ALLATORIxDEMO) {
            if (h.ALLATORIxDEMO() != a2) continue;
            arrayList.add(h);
        }
        return arrayList;
    }

    public H ALLATORIxDEMO(String a2) {
        i a3;
        for (H h : a3.ALLATORIxDEMO) {
            if (!h.ALLATORIxDEMO().equalsIgnoreCase(a2)) continue;
            return h;
        }
        return null;
    }
}

