/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import l.p.l.H;
import l.p.l.I;
import l.p.t.i;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class l
extends H {
    Entity ALLATORIxDEMO = null;

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        l a3;
        if (a3.b()) {
            return;
        }
        if (a2.phase == TickEvent.Phase.START) {
            for (Entity entity : l.ALLATORIxDEMO.field_71441_e.field_72996_f) {
                if (!(entity instanceof EntityPlayer) || entity == l.ALLATORIxDEMO.field_71439_g || !(l.ALLATORIxDEMO.field_71439_g.func_70032_d(entity) <= 3.4f)) continue;
                a3.ALLATORIxDEMO = entity;
            }
        }
        if (a3.ALLATORIxDEMO != null && l.ALLATORIxDEMO.field_71439_g.func_184825_o(0.0f) == 1.0f && a2.phase == TickEvent.Phase.END && !a3.ALLATORIxDEMO.field_70128_L) {
            Object object = i.ALLATORIxDEMO(a3.ALLATORIxDEMO);
            l.ALLATORIxDEMO.field_71439_g.field_70177_z = (float)object[0];
            l.ALLATORIxDEMO.field_71439_g.field_70125_A = (float)object[1];
            a3.ALLATORIxDEMO = null;
        }
    }

    @Override
    public void B() {
        l a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        a2.ALLATORIxDEMO = null;
    }

    public l() {
        super("AimBot", "", I.B);
        l a2;
    }

    @Override
    public void b() {
        l a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
        a2.ALLATORIxDEMO = null;
    }
}

