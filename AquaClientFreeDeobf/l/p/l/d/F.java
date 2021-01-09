/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.d;

import l.p.l.H;
import l.p.l.I;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class F
extends H {
    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        F a3;
        if (a3.b()) {
            return;
        }
        if (!l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_70090_H() && !l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_180799_ab()) {
            return;
        }
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_70093_af() || l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74314_A.func_151470_d()) {
            return;
        }
        F.ALLATORIxDEMO.field_71439_g.func_70664_aZ();
    }

    public F() {
        super("Jesus", "KYRDIKCHILIME", I.J);
        F a2;
    }
}

