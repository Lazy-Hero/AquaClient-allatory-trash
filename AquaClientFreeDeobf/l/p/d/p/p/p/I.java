/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package l.p.d.p.p.p;

import l.p.d.p.p.H;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class I
extends l.p.d.p.H {
    private boolean c;
    private H i;
    private int h;
    private int ALLATORIxDEMO;
    private int B;
    private boolean J;

    @Override
    public void ALLATORIxDEMO() {
        I a2;
        Gui.func_73734_a((int)(a2.i.h.b() + 2), (int)(a2.i.h.B() + a2.ALLATORIxDEMO), (int)(a2.i.h.b() + a2.i.h.ALLATORIxDEMO() * 1), (int)(a2.i.h.B() + a2.ALLATORIxDEMO + 12), (int)(a2.c ? -14540254 : -15658735));
        Gui.func_73734_a((int)a2.i.h.b(), (int)(a2.i.h.B() + a2.ALLATORIxDEMO), (int)(a2.i.h.b() + 2), (int)(a2.i.h.B() + a2.ALLATORIxDEMO + 12), (int)-15658735);
        GL11.glPushMatrix();
        Minecraft.func_71410_x().field_71466_p.func_175063_a(a2.J ? "Press a key..." : new StringBuilder().insert(0, "Key: ").append(Keyboard.getKeyName((int)a2.i.i.ALLATORIxDEMO())).toString(), (float)(a2.i.h.b() + 7), (float)(a2.i.h.B() + a2.ALLATORIxDEMO + 2), -1);
        GL11.glPopMatrix();
    }

    @Override
    public void b(int a2, int a3, int a4) {
        I a5;
        if (a5.ALLATORIxDEMO(a2, a3)) {
            if (a5.i.g) {
                a5.J = !a5.J;
            }
        }
    }

    @Override
    public void ALLATORIxDEMO(int a2) {
        a.ALLATORIxDEMO = a2;
    }

    public I(H a2, int a3) {
        I a4;
        a4.i = a2;
        a4.h = a2.h.b() + a2.h.ALLATORIxDEMO();
        a4.B = a2.h.B() + a2.J;
        a4.ALLATORIxDEMO = a3;
    }

    @Override
    public void ALLATORIxDEMO(int a2, int a3) {
        I a4;
        a4.c = a4.ALLATORIxDEMO(a2, a3);
        a4.B = a4.i.h.B() + a4.ALLATORIxDEMO;
        a4.h = a4.i.h.b();
    }

    public boolean ALLATORIxDEMO(int a2, int a3) {
        I a4;
        return a2 > a4.h && a2 < a4.h + 88 && a3 > a4.B && a3 < a4.B + 12;
    }

    @Override
    public void ALLATORIxDEMO(char a2, int a3) {
        I a4;
        if (a4.J) {
            a4.i.i.ALLATORIxDEMO(a3);
            a4.J = false;
        }
    }
}

