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

public class e
extends H {
    @SubscribeEvent
    public void ALLATORIxDEMO(LivingEvent.LivingUpdateEvent a22) {
        e a3;
        float a22 = (float)l.p.H.g.c.ALLATORIxDEMO(a3, "X").B();
        if (e.ALLATORIxDEMO.field_71439_g.field_70737_aN == e.ALLATORIxDEMO.field_71439_g.field_70738_aO && e.ALLATORIxDEMO.field_71439_g.field_70738_aO > 0) {
            e.ALLATORIxDEMO.field_71439_g.field_70159_w *= (double)(a22 / 50.0f);
            e.ALLATORIxDEMO.field_71439_g.field_70181_x *= 1.0;
            e.ALLATORIxDEMO.field_71439_g.field_70179_y *= (double)(a22 / 50.0f);
        }
    }

    public e() {
        super("DamageBoost", "", I.J);
        e a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("X", a2, 0.0, 4.0, 100.0, true));
    }
}

