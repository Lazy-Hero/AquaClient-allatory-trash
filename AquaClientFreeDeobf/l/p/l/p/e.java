/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package l.p.l.p;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.Minecraft;

public class e
extends H {
    private transient float ALLATORIxDEMO;

    public e() {
        super("Full Bright", "", I.c);
        e a2;
    }

    @Override
    public void B() {
        e a2;
        if ((double)a2.ALLATORIxDEMO < 1.0) {
            Minecraft.func_71410_x().field_71474_y.field_74333_Y = a2.ALLATORIxDEMO;
            return;
        }
        Minecraft.func_71410_x().field_71474_y.field_74333_Y = 0.5f;
    }

    @Override
    public void b() {
        a.ALLATORIxDEMO = Minecraft.func_71410_x().field_71474_y.field_74333_Y;
        Minecraft.func_71410_x().field_71474_y.field_74333_Y = 8.0f;
    }
}

