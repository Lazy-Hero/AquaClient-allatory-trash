/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.d;

import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class d
extends H {
    public d() {
        super("Flight", "", I.J);
        d a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("speed", a2, 1.0, 1.0, 10.0, true));
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a22) {
        d a3;
        if (a3.b()) {
            return;
        }
        float a22 = Minecraft.func_71410_x().field_71439_g.field_70177_z;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (Minecraft.func_71410_x().field_71474_y.field_74351_w.func_151470_d()) {
            --n3;
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74368_y.func_151470_d()) {
            ++n3;
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74370_x.func_151470_d()) {
            --n;
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74366_z.func_151470_d()) {
            ++n;
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151470_d()) {
            ++n2;
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151470_d()) {
            --n2;
        }
        double d2 = l.p.H.g.c.ALLATORIxDEMO(a3, "Speed").B();
        Minecraft.func_71410_x().field_71439_g.field_70159_w = d2 * (double)n3 * Math.sin(Math.toRadians(a22));
        Minecraft.func_71410_x().field_71439_g.field_70179_y = d2 * (double)n3 * -Math.cos(Math.toRadians(a22));
        Minecraft.func_71410_x().field_71439_g.field_70159_w += d2 * (double)n * -Math.cos(Math.toRadians(a22));
        Minecraft.func_71410_x().field_71439_g.field_70179_y += d2 * (double)n * -Math.sin(Math.toRadians(a22));
        Minecraft.func_71410_x().field_71439_g.field_70181_x = d2 * (double)n2;
    }
}

