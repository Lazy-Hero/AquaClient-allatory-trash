/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.d;

import l.p.l.H;
import l.p.l.I;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class L
extends H {
    float ALLATORIxDEMO;

    @Override
    public void B() {
        L a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        L.ALLATORIxDEMO.field_71439_g.field_70138_W = 0.5f;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        L a3;
        if (a3.b()) {
            return;
        }
        a3.ALLATORIxDEMO = L.ALLATORIxDEMO.field_71439_g.field_70138_W;
        L.ALLATORIxDEMO.field_71439_g.field_70138_W = 2.0f;
    }

    public L() {
        super("Step", "PUPUPIPUP", I.B);
        L a2;
    }
}

