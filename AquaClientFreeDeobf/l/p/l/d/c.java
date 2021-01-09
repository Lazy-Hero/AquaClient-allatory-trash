/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.d;

import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class c
extends H {
    @SubscribeEvent
    public void ALLATORIxDEMO(LivingEvent.LivingUpdateEvent a22) {
        c a3;
        float a22 = (float)l.p.H.g.c.ALLATORIxDEMO(a3, "Y").B();
        if (c.ALLATORIxDEMO.field_71439_g.field_70737_aN == c.ALLATORIxDEMO.field_71439_g.field_70738_aO && c.ALLATORIxDEMO.field_71439_g.field_70738_aO > 0) {
            c.ALLATORIxDEMO.field_71439_g.field_70159_w *= 1.0;
            c.ALLATORIxDEMO.field_71439_g.field_70181_x *= (double)(a22 / 2.35f);
            c.ALLATORIxDEMO.field_71439_g.field_70179_y *= 1.0;
        }
    }

    public c() {
        super("DamageFly", "", I.B);
        c a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Y", a2, 4.0, 4.0, 15.0, true));
    }
}

