/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.opengl.GL11
 */
package l.p.d.p;

import java.awt.Color;
import java.util.ArrayList;
import l.p.d.p.p.H;
import l.p.l.I;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i {
    public I h;
    public ArrayList<l.p.d.p.H> g = new ArrayList();
    public int B;
    private int i;
    private boolean J;
    private int F;
    private boolean ALLATORIxDEMO;
    private int j;
    public int A;
    private int c;

    public int b() {
        i a2;
        return a2.F;
    }

    public boolean ALLATORIxDEMO() {
        i a2;
        return a2.J;
    }

    public void b(int a2) {
        a.i = a2;
    }

    public void ALLATORIxDEMO(int a2) {
        a.F = a2;
    }

    public void ALLATORIxDEMO(FontRenderer a222) {
        i a3;
        int n = l.p.H.B;
        Gui.func_73734_a((int)(a3.F + 2), (int)(a3.i - 1), (int)(a3.F + a3.j - 2), (int)a3.i, (int)new Color(40, 30, 30).getRGB());
        Gui.func_73734_a((int)a3.F, (int)a3.i, (int)(a3.F + a3.j), (int)(a3.i + a3.c), (int)new Color(40, 30, 30).getRGB());
        if (!a3.J) {
            Gui.func_73734_a((int)a3.F, (int)(a3.i + a3.c), (int)(a3.F + a3.j), (int)(a3.i + a3.c + 1), (int)new Color(40, 30, 30).getRGB());
            Gui.func_73734_a((int)(a3.F + 2), (int)(a3.i + a3.c + 1), (int)(a3.F + a3.j - 2), (int)(a3.i + a3.c + 2), (int)new Color(40, 30, 30).getRGB());
        }
        GL11.glPushMatrix();
        a222.func_175063_a(a3.h.name(), (float)(a3.F + 2), (float)a3.i + 2.5f, n);
        a222.func_175063_a(a3.J ? "-" : "+", (float)(a3.F + a3.j - 10), (float)a3.i + 2.5f, n);
        GL11.glPopMatrix();
        if (a3.J && !a3.g.isEmpty()) {
            for (l.p.d.p.H object : a3.g) {
                object.ALLATORIxDEMO();
            }
            int a222 = 0;
            for (l.p.d.p.H h : a3.ALLATORIxDEMO()) {
                a222 += h.ALLATORIxDEMO();
            }
            Gui.func_73734_a((int)a3.F, (int)(a3.i + a3.c + a222), (int)(a3.F + a3.j), (int)(a3.i + a3.c + 1 + a222), (int)n);
            Gui.func_73734_a((int)(a3.F + 2), (int)(a3.i + a3.c + a222 + 1), (int)(a3.F + a3.j - 2), (int)(a3.i + a3.c + 2 + a222), (int)n);
            Gui.func_73734_a((int)a3.F, (int)(a3.i + a3.c), (int)(a3.F + 1), (int)(a3.i + a3.c + a222), (int)n);
            Gui.func_73734_a((int)(a3.F + a3.j - 1), (int)(a3.i + a3.c), (int)(a3.F + a3.j), (int)(a3.i + a3.c + a222), (int)n);
        }
    }

    public boolean ALLATORIxDEMO(int a2, int a3) {
        i a4;
        return a2 >= a4.F && a2 <= a4.F + a4.j && a3 >= a4.i && a3 <= a4.i + a4.c;
    }

    public void ALLATORIxDEMO(int a2, int a3) {
        i a4;
        if (a4.ALLATORIxDEMO) {
            a4.ALLATORIxDEMO(a2 - a4.A);
            a4.b(a3 - a4.B);
        }
    }

    public void ALLATORIxDEMO() {
        i a2;
        int n = a2.c;
        for (l.p.d.p.H h : a2.g) {
            h.ALLATORIxDEMO(n);
            n += h.ALLATORIxDEMO();
        }
    }

    public void ALLATORIxDEMO(boolean a2) {
        a.J = a2;
    }

    public void b(boolean a2) {
        a.ALLATORIxDEMO = a2;
    }

    public ArrayList<l.p.d.p.H> ALLATORIxDEMO() {
        i a2;
        return a2.g;
    }

    public int B() {
        i a2;
        return a2.i;
    }

    public i(I a222) {
        i a3;
        a3.h = a222;
        a3.j = 90;
        a3.F = 5;
        a3.i = 5;
        a3.c = 13;
        a3.A = 0;
        a3.J = false;
        a3.ALLATORIxDEMO = false;
        int a222 = a3.c;
        for (l.p.l.H h : l.p.H.g.ALLATORIxDEMO.ALLATORIxDEMO(a3.h)) {
            H h2 = new H(h, a3, a222);
            a222 += 12;
            H object = h2;
            a3.g.add(object);
        }
    }

    public int ALLATORIxDEMO() {
        i a2;
        return a2.j;
    }
}

