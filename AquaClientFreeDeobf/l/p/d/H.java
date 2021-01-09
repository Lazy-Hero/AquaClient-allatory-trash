/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 */
package l.p.d;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import l.p.d.p.i;
import l.p.l.I;
import l.p.t.B;
import net.minecraft.client.gui.GuiScreen;

public class H
extends GuiScreen {
    public static ArrayList<i> ALLATORIxDEMO;
    public static int i;

    public void func_73866_w_() {
    }

    protected void func_73864_a(int a2, int a3, int a4) throws IOException {
        for (i i2 : ALLATORIxDEMO) {
            if (i2.ALLATORIxDEMO(a2, a3)) {
                i2.b(true);
                i2.A = a2 - i2.b();
                i2.B = a3 - i2.B();
            }
            if (i2.ALLATORIxDEMO(a2, a3) && a4 == 1) {
                i2.ALLATORIxDEMO(!i2.ALLATORIxDEMO());
            }
            if (!i2.ALLATORIxDEMO() || i2.ALLATORIxDEMO().isEmpty()) continue;
            Iterator<l.p.d.p.H> iterator = i2.ALLATORIxDEMO().iterator();
            while (iterator.hasNext()) {
                iterator.next().b(a2, a3, a4);
            }
        }
    }

    protected void func_146286_b(int a2, int a3, int a4) {
        for (i i2 : ALLATORIxDEMO) {
            i2.b(false);
        }
        for (i i2 : ALLATORIxDEMO) {
            if (!i2.ALLATORIxDEMO() || i2.ALLATORIxDEMO().isEmpty()) continue;
            Iterator<l.p.d.p.H> iterator = i2.ALLATORIxDEMO().iterator();
            while (iterator.hasNext()) {
                iterator.next().ALLATORIxDEMO(a2, a3, a4);
            }
        }
    }

    public boolean func_73868_f() {
        return true;
    }

    protected void func_73869_a(char a2, int a3) {
        for (i i2 : ALLATORIxDEMO) {
            if (!i2.ALLATORIxDEMO() || a3 == 1 || i2.ALLATORIxDEMO().isEmpty()) continue;
            Iterator<l.p.d.p.H> iterator = i2.ALLATORIxDEMO().iterator();
            while (iterator.hasNext()) {
                iterator.next().ALLATORIxDEMO(a2, a3);
            }
        }
        if (a3 == 1) {
            H a4;
            a4.field_146297_k.func_147108_a(null);
        }
    }

    public H() {
        H a2;
        ALLATORIxDEMO = new ArrayList();
        int n = 5;
        for (I i2 : I.values()) {
            i object = new i(i2);
            object.ALLATORIxDEMO(n);
            ALLATORIxDEMO.add(object);
            n += object.ALLATORIxDEMO() + 1;
        }
    }

    public void func_73863_a(int a2, int a3, float a4) {
        l.p.H.B = B.ALLATORIxDEMO(30000, 0);
        for (i i2 : ALLATORIxDEMO) {
            H a5;
            i2.ALLATORIxDEMO(a5.field_146289_q);
            i2.ALLATORIxDEMO(a2, a3);
            Iterator<l.p.d.p.H> object = i2.ALLATORIxDEMO().iterator();
            while (object.hasNext()) {
                object.next().ALLATORIxDEMO(a2, a3);
            }
        }
    }

    static {
        i = -1;
    }
}

