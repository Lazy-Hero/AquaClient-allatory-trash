/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.opengl.GL11
 */
package l.p.d.p.p.p;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class H
extends l.p.d.p.H {
    private int ALLATORIxDEMO;
    private l.p.l.H c;
    private int h;
    private int i;
    private boolean J;
    private l.p.d.p.p.H B;

    @Override
    public void ALLATORIxDEMO(int a2, int a3) {
        H a4;
        a4.J = a4.ALLATORIxDEMO(a2, a3);
        a4.h = a4.B.h.B() + a4.ALLATORIxDEMO;
        a4.i = a4.B.h.b();
    }

    @Override
    public void ALLATORIxDEMO(int a2) {
        a.ALLATORIxDEMO = a2;
    }

    public boolean ALLATORIxDEMO(int a2, int a3) {
        H a4;
        return a2 > a4.i && a2 < a4.i + 88 && a3 > a4.h && a3 < a4.h + 12;
    }

    public H(l.p.d.p.p.H a2, l.p.l.H a3, int a4) {
        H a5;
        a5.B = a2;
        a5.c = a3;
        a5.i = a2.h.b() + a2.h.ALLATORIxDEMO();
        a5.h = a2.h.B() + a2.J;
        a5.ALLATORIxDEMO = a4;
    }

    @Override
    public void ALLATORIxDEMO() {
        H a2;
        Gui.func_73734_a((int)(a2.B.h.b() + 2), (int)(a2.B.h.B() + a2.ALLATORIxDEMO), (int)(a2.B.h.b() + a2.B.h.ALLATORIxDEMO() * 1), (int)(a2.B.h.B() + a2.ALLATORIxDEMO + 12), (int)(a2.J ? -14540254 : -15658735));
        Gui.func_73734_a((int)a2.B.h.b(), (int)(a2.B.h.B() + a2.ALLATORIxDEMO), (int)(a2.B.h.b() + 2), (int)(a2.B.h.B() + a2.ALLATORIxDEMO + 12), (int)-15658735);
        GL11.glPushMatrix();
        Minecraft.func_71410_x().field_71466_p.func_175063_a(new StringBuilder().insert(0, "Visible: ").append(a2.c.g).toString(), (float)(a2.B.h.b() + 7), (float)(a2.B.h.B() + a2.ALLATORIxDEMO + 2), -1);
        GL11.glPopMatrix();
    }

    @Override
    public void b(int a2, int a3, int a4) {
        H a5;
        if (a5.ALLATORIxDEMO(a2, a3)) {
            if (a5.B.g) {
                a5.c.g = !a5.c.g;
            }
        }
    }
}

