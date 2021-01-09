/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package l.p.l.l;

import l.p.l.H;
import l.p.l.I;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class i
extends H {
    public i() {
        super("SelfDestruct", "", I.i);
        i a2;
    }

    @SubscribeEvent
    public void b(TickEvent.ClientTickEvent a2) {
        i a3;
        i.ALLATORIxDEMO.field_71462_r = null;
        for (H h : l.p.H.g.ALLATORIxDEMO.ALLATORIxDEMO()) {
            h.B();
            h.ALLATORIxDEMO(0);
        }
        a3.B();
    }
}

