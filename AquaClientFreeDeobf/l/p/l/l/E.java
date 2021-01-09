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

public class E
extends H {
    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        if (E.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        E.ALLATORIxDEMO.field_71439_g.field_70144_Y = 10.0f;
    }

    public E() {
        super("Magnet", "", I.i);
        E a2;
    }

    @Override
    public void B() {
        if (E.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        E.ALLATORIxDEMO.field_71439_g.field_70144_Y = 0.0f;
    }
}

