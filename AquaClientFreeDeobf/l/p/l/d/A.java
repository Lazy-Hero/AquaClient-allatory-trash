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
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class A
extends H {
    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a22) {
        if (!Minecraft.func_71410_x().field_71439_g.func_184613_cA()) {
            return;
        }
        float a22 = Minecraft.func_71410_x().field_71439_g.field_70177_z;
        float f2 = Minecraft.func_71410_x().field_71439_g.field_70125_A;
        if (Minecraft.func_71410_x().field_71474_y.field_74351_w.func_151470_d()) {
            Minecraft.func_71410_x().field_71439_g.field_70159_w -= Math.sin(Math.toRadians(a22)) * Math.cos(Math.toRadians(f2)) * 0.05;
            Minecraft.func_71410_x().field_71439_g.field_70179_y += Math.cos(Math.toRadians(a22)) * Math.cos(Math.toRadians(f2)) * 0.05;
            Minecraft.func_71410_x().field_71439_g.field_70181_x += Math.sin(Math.toRadians(f2)) * 0.05;
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151470_d()) {
            Minecraft.func_71410_x().field_71439_g.field_70181_x += 0.05;
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151470_d()) {
            Minecraft.func_71410_x().field_71439_g.field_70181_x -= 0.05;
        }
    }

    public A() {
        super("Elytra Boost", "", I.J);
        A a2;
    }
}

