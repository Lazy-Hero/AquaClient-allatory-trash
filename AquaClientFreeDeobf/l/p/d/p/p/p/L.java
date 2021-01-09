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
import l.p.p.i;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L
extends l.p.d.p.H {
    private i c;
    private int J;
    private int g;
    private int j;
    private int ALLATORIxDEMO;
    private H B;
    private boolean h;
    private l.p.l.H i;

    @Override
    public void ALLATORIxDEMO(int a2) {
        a.J = a2;
    }

    public L(i a2, H a3, l.p.l.H a4, int a5) {
        L a6;
        a6.c = a2;
        a6.B = a3;
        a6.i = a4;
        a6.ALLATORIxDEMO = a3.h.b() + a3.h.ALLATORIxDEMO();
        a6.j = a3.h.B() + a3.J;
        a6.J = a5;
        a6.g = 0;
    }

    @Override
    public void ALLATORIxDEMO(int a2, int a3) {
        L a4;
        a4.h = a4.ALLATORIxDEMO(a2, a3);
        a4.j = a4.B.h.B() + a4.J;
        a4.ALLATORIxDEMO = a4.B.h.b();
    }

    @Override
    public void ALLATORIxDEMO() {
        L a2;
        Gui.func_73734_a((int)(a2.B.h.b() + 2), (int)(a2.B.h.B() + a2.J), (int)(a2.B.h.b() + a2.B.h.ALLATORIxDEMO() * 1), (int)(a2.B.h.B() + a2.J + 12), (int)(a2.h ? -14540254 : -15658735));
        Gui.func_73734_a((int)a2.B.h.b(), (int)(a2.B.h.B() + a2.J), (int)(a2.B.h.b() + 2), (int)(a2.B.h.B() + a2.J + 12), (int)-15658735);
        GL11.glPushMatrix();
        Minecraft.func_71410_x().field_71466_p.func_175063_a(new StringBuilder().insert(0, "Mode: ").append(a2.c.ALLATORIxDEMO()).toString(), (float)(a2.B.h.b() + 7), (float)(a2.B.h.B() + a2.J + 2), -1);
        GL11.glPopMatrix();
    }

    @Override
    public void b(int a2, int a3, int a4) {
        L a5;
        if (a5.ALLATORIxDEMO(a2, a3)) {
            if (a5.B.g) {
                a2 = a5.c.ALLATORIxDEMO().size();
                a5.g = a5.g + 1 > a2 ? 0 : ++a5.g;
                a5.c.ALLATORIxDEMO(a5.c.ALLATORIxDEMO().get(a5.g));
            }
        }
    }

    public boolean ALLATORIxDEMO(int a2, int a3) {
        L a4;
        return a2 > a4.ALLATORIxDEMO && a2 < a4.ALLATORIxDEMO + 88 && a3 > a4.j && a3 < a4.j + 12;
    }
}

