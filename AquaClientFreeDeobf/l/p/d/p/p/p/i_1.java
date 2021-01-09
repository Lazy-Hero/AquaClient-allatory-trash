/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.opengl.GL11
 */
package l.p.d.p.p.p;

import l.p.d.p.p.H;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i
extends l.p.d.p.H {
    private double c;
    private boolean ALLATORIxDEMO;
    private int i;
    private boolean B = false;
    private H j;
    private int h;
    private l.p.p.i g;
    private int J;

    public boolean b(int a2, int a3) {
        i a4;
        return a2 > a4.h && a2 < a4.h + (a4.j.h.ALLATORIxDEMO() / 2 + 1) && a3 > a4.i && a3 < a4.i + 12;
    }

    public boolean ALLATORIxDEMO(int a2, int a3) {
        i a4;
        return a2 > a4.h + a4.j.h.ALLATORIxDEMO() / 2 && a2 < a4.h + a4.j.h.ALLATORIxDEMO() && a3 > a4.i && a3 < a4.i + 12;
    }

    @Override
    public void ALLATORIxDEMO() {
        i a2;
        Gui.func_73734_a((int)(a2.j.h.b() + 2), (int)(a2.j.h.B() + a2.J), (int)(a2.j.h.b() + a2.j.h.ALLATORIxDEMO()), (int)(a2.j.h.B() + a2.J + 12), (int)(a2.ALLATORIxDEMO ? -14540254 : -15658735));
        int n = (int)(a2.g.B() / a2.g.b() * (double)a2.j.h.ALLATORIxDEMO());
        Gui.func_73734_a((int)(a2.j.h.b() + 2), (int)(a2.j.h.B() + a2.J), (int)(a2.j.h.b() + (int)a2.c), (int)(a2.j.h.B() + a2.J + 12), (int)l.p.H.B);
        Gui.func_73734_a((int)a2.j.h.b(), (int)(a2.j.h.B() + a2.J), (int)(a2.j.h.b() + 2), (int)(a2.j.h.B() + a2.J + 12), (int)-15658735);
        GL11.glPushMatrix();
        Minecraft.func_71410_x().field_71466_p.func_175063_a(new StringBuilder().insert(0, a2.g.b()).append(": ").append(a2.g.B()).toString(), (float)(a2.j.h.b() + 10), (float)(a2.j.h.B() + a2.J + 2), -1);
        GL11.glPopMatrix();
    }

    @Override
    public void ALLATORIxDEMO(int a2) {
        a.J = a2;
    }

    @Override
    public void ALLATORIxDEMO(int a2, int a3, int a4) {
        a.B = false;
    }

    private static /* synthetic */ double ALLATORIxDEMO(double a2, int a3) {
        throw new IllegalArgumentException();
    }

    public i(l.p.p.i a2, H a3, int a4) {
        i a5;
        a5.g = a2;
        a5.j = a3;
        a5.h = a3.h.b() + a3.h.ALLATORIxDEMO();
        a5.i = a3.h.B() + a3.J;
        a5.J = a4;
    }

    @Override
    public void b(int a2, int a3, int a4) {
        i a5;
        if (a5.b(a2, a3)) {
            if (a5.j.g) {
                a5.B = true;
            }
        }
        if (a5.ALLATORIxDEMO(a2, a3)) {
            if (a5.j.g) {
                a5.B = true;
            }
        }
    }

    @Override
    public void ALLATORIxDEMO(int a2, int a3) {
        i a4;
        a4.ALLATORIxDEMO = a4.b(a2, a3) || a4.ALLATORIxDEMO(a2, a3);
        a4.i = a4.j.h.B() + a4.J;
        a4.h = a4.j.h.b();
        double d2 = Math.min(88, Math.max(0, a2 - a4.h));
        double d3 = a4.g.ALLATORIxDEMO();
        double d4 = a4.g.b();
        a4.c = 88.0 * (a4.g.B() - d3) / (d4 - d3);
        if (a4.B) {
            if (d2 == 0.0) {
                a4.g.ALLATORIxDEMO(a4.g.ALLATORIxDEMO());
                return;
            }
            d2 = l.p.d.p.p.p.i.ALLATORIxDEMO(d2 / 88.0 * (d4 - d3) + d3, 2);
            a4.g.ALLATORIxDEMO(d2);
        }
    }
}

