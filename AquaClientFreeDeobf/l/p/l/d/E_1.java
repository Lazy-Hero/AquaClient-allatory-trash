/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.d;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class E
extends H {
    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        if (E.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        if (Minecraft.func_71410_x().field_71439_g.field_70122_E && !Minecraft.func_71410_x().field_71439_g.func_70093_af() && !Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151468_f() && Minecraft.func_71410_x().field_71441_e.func_184144_a((Entity)Minecraft.func_71410_x().field_71439_g, Minecraft.func_71410_x().field_71439_g.func_174813_aQ().func_72317_d(0.0, -0.5, 0.0).func_72321_a(-0.001, 0.0, -0.001)).isEmpty()) {
            Minecraft.func_71410_x().field_71439_g.func_70664_aZ();
        }
    }

    public E() {
        super("Parkour", "", I.J);
        E a2;
    }
}

