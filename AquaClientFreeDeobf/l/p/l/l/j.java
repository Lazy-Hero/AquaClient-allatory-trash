/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.l;

import l.p.l.H;
import l.p.l.I;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class j
extends H {
    @Override
    public void B() {
        if (j.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        j.ALLATORIxDEMO.field_71439_g.field_70144_Y = 0.0f;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        if (j.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        j.ALLATORIxDEMO.field_71439_g.field_70144_Y = 1.0f;
    }

    public j() {
        super("NoPush", "", I.i);
        j a2;
    }
}

