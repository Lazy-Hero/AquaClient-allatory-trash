/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.opengl.GL11
 */
package l.p.d.p.p;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import l.p.d.p.i;
import l.p.d.p.p.p.I;
import l.p.d.p.p.p.L;
import l.p.d.p.p.p.j;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class H
extends l.p.d.p.H {
    public int J;
    private ArrayList<l.p.d.p.H> ALLATORIxDEMO;
    private boolean B;
    public l.p.l.H i;
    public i h;
    public boolean g;
    private int c;

    @Override
    public int ALLATORIxDEMO() {
        H a2;
        if (a2.g) {
            return 12 * (a2.ALLATORIxDEMO.size() + 1);
        }
        return 12;
    }

    @Override
    public void ALLATORIxDEMO() {
        H a2;
        Gui.func_73734_a((int)a2.h.b(), (int)(a2.h.B() + a2.J), (int)(a2.h.b() + a2.h.ALLATORIxDEMO()), (int)(a2.h.B() + 12 + a2.J), (int)(a2.B ? (a2.i.ALLATORIxDEMO() ? new Color(34, 34, 34, 200).getRGB() : new Color(34, 34, 34, 200).getRGB()) : (a2.i.ALLATORIxDEMO() ? new Color(14, 14, 14, 200).getRGB() : new Color(17, 17, 17, 200).getRGB())));
        GL11.glPushMatrix();
        Minecraft.func_71410_x().field_71466_p.func_78276_b(a2.i.ALLATORIxDEMO(), a2.h.b() + 3, a2.h.B() + a2.J + 2, a2.i.ALLATORIxDEMO() ? l.p.H.B : -1);
        if (a2.ALLATORIxDEMO.size() > 2) {
            Minecraft.func_71410_x().field_71466_p.func_78276_b(a2.g ? "-" : "+", a2.h.b() + a2.h.ALLATORIxDEMO() - 10 + 2, a2.h.B() + a2.J + 2, -1);
        }
        GL11.glPopMatrix();
        if (a2.g && !a2.ALLATORIxDEMO.isEmpty()) {
            Iterator<l.p.d.p.H> iterator = a2.ALLATORIxDEMO.iterator();
            while (iterator.hasNext()) {
                iterator.next().ALLATORIxDEMO();
            }
            Gui.func_73734_a((int)(a2.h.b() + 2), (int)(a2.h.B() + a2.J + 12), (int)(a2.h.b() + 3), (int)(a2.h.B() + a2.J + (a2.ALLATORIxDEMO.size() + 1) * 12), (int)l.p.H.B);
        }
    }

    @Override
    public void ALLATORIxDEMO(int a2, int a3) {
        H a4;
        a4.B = a4.ALLATORIxDEMO(a2, a3);
        if (!a4.ALLATORIxDEMO.isEmpty()) {
            Iterator<l.p.d.p.H> iterator = a4.ALLATORIxDEMO.iterator();
            while (iterator.hasNext()) {
                iterator.next().ALLATORIxDEMO(a2, a3);
            }
        }
    }

    @Override
    public void ALLATORIxDEMO(int a2, int a3, int a4) {
        H a5;
        Iterator<l.p.d.p.H> iterator = a5.ALLATORIxDEMO.iterator();
        while (iterator.hasNext()) {
            iterator.next().ALLATORIxDEMO(a2, a3, a4);
        }
    }

    public boolean ALLATORIxDEMO(int a2, int a3) {
        H a4;
        return a2 > a4.h.b() && a2 < a4.h.b() + a4.h.ALLATORIxDEMO() && a3 > a4.h.B() + a4.J && a3 < a4.h.B() + 12 + a4.J;
    }

    public H(l.p.l.H a2, i a32, int a4) {
        H a5;
        a5.i = a2;
        a5.h = a32;
        a5.J = a4;
        a5.ALLATORIxDEMO = new ArrayList();
        a5.g = false;
        a5.c = 12;
        int a32 = a4 + 12;
        if (l.p.H.g.c.ALLATORIxDEMO(a2) != null) {
            for (l.p.p.i i2 : l.p.H.g.c.ALLATORIxDEMO(a2)) {
                if (i2.ALLATORIxDEMO()) {
                    a5.ALLATORIxDEMO.add(new L(i2, a5, a2, a32));
                    a32 += 12;
                }
                if (i2.b()) {
                    a5.ALLATORIxDEMO.add(new l.p.d.p.p.p.i(i2, a5, a32));
                    a32 += 12;
                }
                if (!i2.l()) continue;
                a5.ALLATORIxDEMO.add(new j(i2, a5, a32));
                a32 += 12;
            }
        }
        a5.ALLATORIxDEMO.add(new I(a5, a32));
        a5.ALLATORIxDEMO.add(new l.p.d.p.p.p.H(a5, a2, a32));
    }

    @Override
    public void ALLATORIxDEMO(int a2) {
        H a3;
        a3.J = a2;
        a2 = a3.J + 12;
        Iterator<l.p.d.p.H> iterator = a3.ALLATORIxDEMO.iterator();
        while (iterator.hasNext()) {
            iterator.next().ALLATORIxDEMO(a2);
            a2 += 12;
        }
    }

    @Override
    public void b(int a2, int a3, int a4) {
        H a5;
        if (a5.ALLATORIxDEMO(a2, a3)) {
            a5.i.ALLATORIxDEMO();
        }
        if (a5.ALLATORIxDEMO(a2, a3) && a4 == 1) {
            a5.g = !a5.g;
            a5.h.ALLATORIxDEMO();
        }
        Iterator<l.p.d.p.H> iterator = a5.ALLATORIxDEMO.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(a2, a3, a4);
        }
    }

    @Override
    public void ALLATORIxDEMO(char a2, int a3) {
        H a4;
        Iterator<l.p.d.p.H> iterator = a4.ALLATORIxDEMO.iterator();
        while (iterator.hasNext()) {
            iterator.next().ALLATORIxDEMO(a2, a3);
        }
    }
}

