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

public class i
extends H {
    public i() {
        super("Strafe", "", I.J);
        i a2;
    }

    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(TickEvent.PlayerTickEvent a2) {
        if (i.ALLATORIxDEMO.field_71439_g.func_175144_cb() && !i.ALLATORIxDEMO.field_71439_g.func_184218_aH() && (i.ALLATORIxDEMO.field_71439_g.field_71158_b.field_78902_a != 0.0f || i.ALLATORIxDEMO.field_71439_g.field_71158_b.field_192832_b != 0.0f)) {
            i a3;
            i.ALLATORIxDEMO.field_71439_g.func_70031_b(true);
            double d2 = a3.ALLATORIxDEMO();
            i.ALLATORIxDEMO.field_71439_g.field_70159_w = -Math.sin(d2) * 0.19;
            i.ALLATORIxDEMO.field_71439_g.field_70179_y = Math.cos(d2) * 0.19;
        }
    }

    public double ALLATORIxDEMO() {
        float f2 = i.ALLATORIxDEMO.field_71439_g.field_70177_z;
        float f3 = 1.0f;
        if (i.ALLATORIxDEMO.field_71439_g.field_191988_bg < 0.0f) {
            f2 += 180.0f;
        }
        if (i.ALLATORIxDEMO.field_71439_g.field_191988_bg < 0.0f) {
            f3 = -0.51f;
        } else if (i.ALLATORIxDEMO.field_71439_g.field_191988_bg > 0.0f) {
            f3 = 0.51f;
        }
        if (i.ALLATORIxDEMO.field_71439_g.field_70702_br > 0.0f) {
            f2 -= 90.0f * f3;
        }
        if (i.ALLATORIxDEMO.field_71439_g.field_70702_br < 0.0f) {
            f2 += 90.0f * f3;
        }
        return Math.toRadians(f2);
    }
}

