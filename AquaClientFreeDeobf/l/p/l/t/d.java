/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.item.ItemBow
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.t;

import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBow;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class d
extends H {
    public d() {
        super("FastBow", "", I.B);
        d a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("speed", a2, 3.0, 0.1, 15.0, true));
    }

    @SubscribeEvent
    public void ALLATORIxDEMO(LivingEvent.LivingUpdateEvent a2) {
        d a3;
        if (d.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        a2 = Minecraft.func_71410_x();
        double d2 = l.p.H.g.c.ALLATORIxDEMO(a3, "Speed").B();
        if (a2.field_71439_g.field_71071_by.func_70448_g().func_77973_b() instanceof ItemBow && a2.field_71439_g.func_184587_cr() && (float)a2.field_71439_g.func_184612_cw() >= (float)d2) {
            a2.field_71439_g.field_71174_a.func_147297_a((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.field_177992_a, a2.field_71439_g.func_174811_aO()));
            a2.field_71439_g.field_71174_a.func_147297_a((Packet)new CPacketPlayerTryUseItem(a2.field_71439_g.func_184600_cs()));
            a2.field_71439_g.func_184597_cx();
        }
    }
}

