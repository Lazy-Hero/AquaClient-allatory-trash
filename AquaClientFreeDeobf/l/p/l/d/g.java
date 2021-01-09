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

public class g
extends H {
    public g() {
        super("NoSlowDown", "Always holds down the sprint key", I.J);
        g a2;
    }

    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(TickEvent.PlayerTickEvent a2) {
        if (l.p.l.d.g.ALLATORIxDEMO.field_71439_g.func_184587_cr() && !l.p.l.d.g.ALLATORIxDEMO.field_71439_g.func_184218_aH() && (l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_71158_b.field_78902_a != 0.0f || l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_71158_b.field_192832_b != 0.0f)) {
            g a3;
            l.p.l.d.g.ALLATORIxDEMO.field_71439_g.func_70031_b(true);
            double d2 = a3.ALLATORIxDEMO();
            l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_70159_w = -Math.sin(d2) * 0.25;
            l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_70179_y = Math.cos(d2) * 0.25;
        }
    }

    public double ALLATORIxDEMO() {
        float f2 = l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_70177_z;
        float f3 = 1.0f;
        if (l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_191988_bg < 0.0f) {
            f2 += 180.0f;
        }
        if (l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_191988_bg < 0.0f) {
            f3 = -0.5f;
        } else if (l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_191988_bg > 0.0f) {
            f3 = 0.5f;
        }
        if (l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_70702_br > 0.0f) {
            f2 -= 90.0f * f3;
        }
        if (l.p.l.d.g.ALLATORIxDEMO.field_71439_g.field_70702_br < 0.0f) {
            f2 += 90.0f * f3;
        }
        return Math.toRadians(f2);
    }
}

