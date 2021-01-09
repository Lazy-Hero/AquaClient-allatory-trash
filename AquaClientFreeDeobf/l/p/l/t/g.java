/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class g
extends H {
    float i = 0.0f;
    float ALLATORIxDEMO = 0.0f;
    Entity B = null;

    public g() {
        super("KillAura", "", I.B);
        g a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Range", a2, 2.6, 1.9, 5.0, false));
    }

    @Override
    public void b() {
        g a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
        a2.B = null;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        g a3;
        if (a2.phase == TickEvent.Phase.START) {
            for (Entity entity : l.p.l.t.g.ALLATORIxDEMO.field_71441_e.field_72996_f) {
                l.p.H.g.c.ALLATORIxDEMO(a3, "Range").B();
                if (!(entity instanceof EntityPlayer) || entity == l.p.l.t.g.ALLATORIxDEMO.field_71439_g || !(l.p.l.t.g.ALLATORIxDEMO.field_71439_g.func_70032_d(entity) <= (float)l.p.H.g.c.ALLATORIxDEMO(a3, "Range").B())) continue;
                a3.B = entity;
            }
        }
        if (a3.B != null && l.p.l.t.g.ALLATORIxDEMO.field_71439_g.func_184825_o(0.0f) == 1.0f && a2.phase == TickEvent.Phase.END && !a3.B.field_70128_L) {
            Object object = l.p.t.i.ALLATORIxDEMO(a3.B);
            l.p.l.t.g.ALLATORIxDEMO.field_71439_g.field_70177_z = (float)object[0];
            ALLATORIxDEMO.func_147114_u().func_147297_a((Packet)new CPacketUseEntity(a3.B));
            l.p.l.t.g.ALLATORIxDEMO.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
            a3.B = null;
            l.p.l.t.g.ALLATORIxDEMO.field_71439_g.func_184821_cY();
        }
    }

    @Override
    public void B() {
        g a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        a2.B = null;
    }
}

