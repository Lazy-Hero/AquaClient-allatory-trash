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
public class j
extends l.p.d.p.H {
    private H ALLATORIxDEMO;
    private boolean J;
    private int i;
    private i c;
    private int h;
    private int B;

    public j(i a2, H a3, int a4) {
        j a5;
        a5.c = a2;
        a5.ALLATORIxDEMO = a3;
        a5.i = a3.h.b() + a3.h.ALLATORIxDEMO();
        a5.B = a3.h.B() + a3.J;
        a5.h = a4;
    }

    @Override
    public void ALLATORIxDEMO(int a2, int a3) {
        j a4;
        a4.J = a4.ALLATORIxDEMO(a2, a3);
        a4.B = a4.ALLATORIxDEMO.h.B() + a4.h;
        a4.i = a4.ALLATORIxDEMO.h.b();
    }

    @Override
    public void ALLATORIxDEMO() {
        j a2;
        Gui.func_73734_a((int)(a2.ALLATORIxDEMO.h.b() + 2), (int)(a2.ALLATORIxDEMO.h.B() + a2.h), (int)(a2.ALLATORIxDEMO.h.b() + a2.ALLATORIxDEMO.h.ALLATORIxDEMO() * 1), (int)(a2.ALLATORIxDEMO.h.B() + a2.h + 12), (int)(a2.J ? -14540254 : -15658735));
        Gui.func_73734_a((int)a2.ALLATORIxDEMO.h.b(), (int)(a2.ALLATORIxDEMO.h.B() + a2.h), (int)(a2.ALLATORIxDEMO.h.b() + 2), (int)(a2.ALLATORIxDEMO.h.B() + a2.h + 12), (int)-15658735);
        GL11.glPushMatrix();
        Minecraft.func_71410_x().field_71466_p.func_175063_a(a2.c.b(), (float)(a2.ALLATORIxDEMO.h.b() + 10 + 4), (float)(a2.ALLATORIxDEMO.h.B() + a2.h + 2), -1);
        GL11.glPopMatrix();
        Gui.func_73734_a((int)(a2.ALLATORIxDEMO.h.b() + 3 + 4), (int)(a2.ALLATORIxDEMO.h.B() + a2.h + 3), (int)(a2.ALLATORIxDEMO.h.b() + 9 + 4), (int)(a2.ALLATORIxDEMO.h.B() + a2.h + 9), (int)-6710887);
        if (a2.c.E()) {
            Gui.func_73734_a((int)(a2.ALLATORIxDEMO.h.b() + 4 + 4), (int)(a2.ALLATORIxDEMO.h.B() + a2.h + 4), (int)(a2.ALLATORIxDEMO.h.b() + 8 + 4), (int)(a2.ALLATORIxDEMO.h.B() + a2.h + 8), (int)l.p.H.B);
        }
    }

    @Override
    public void b(int a2, int a3, int a4) {
        j a5;
        if (a5.ALLATORIxDEMO(a2, a3)) {
            if (a5.ALLATORIxDEMO.g) {
                a5.c.ALLATORIxDEMO(!a5.c.E());
            }
        }
    }

    @Override
    public void ALLATORIxDEMO(int a2) {
        a.h = a2;
    }

    public boolean ALLATORIxDEMO(int a2, int a3) {
        j a4;
        return a2 > a4.i && a2 < a4.i + 88 && a3 > a4.B && a3 < a4.B + 12;
    }
}

