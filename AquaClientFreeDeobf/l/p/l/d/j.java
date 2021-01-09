/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.d;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class j
extends H {
    @Override
    public void b() {
        j a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
    }

    public j() {
        super("Spider", "", I.J);
        j a2;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        if (!l.p.t.j.b((Entity)j.ALLATORIxDEMO.field_71439_g)) {
            return;
        }
        if (j.ALLATORIxDEMO.field_71439_g.field_70181_x < 0.2) {
            j.ALLATORIxDEMO.field_71439_g.field_70181_x = 0.2;
        }
    }

    @Override
    public void B() {
        j a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
    }
}

