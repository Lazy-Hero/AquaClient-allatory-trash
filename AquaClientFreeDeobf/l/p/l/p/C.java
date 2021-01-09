/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.p;

import l.p.l.H;
import l.p.l.I;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class C
extends H {
    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(TickEvent.PlayerTickEvent a2) {
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_72894_k(0.0f);
    }

    public C() {
        super("AntiRain", "Kills Rain", I.c);
        C a2;
    }
}

