/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.t;

import l.p.l.I;
import l.p.p.i;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class H
extends l.p.l.H {
    @SubscribeEvent
    public void ALLATORIxDEMO(LivingEvent.LivingUpdateEvent a22) {
        H a3;
        float a22 = (float)l.p.H.g.c.ALLATORIxDEMO(a3, "X").B();
        float f2 = (float)l.p.H.g.c.ALLATORIxDEMO(a3, "Y").B();
        if (H.ALLATORIxDEMO.field_71439_g.field_70737_aN == H.ALLATORIxDEMO.field_71439_g.field_70738_aO && H.ALLATORIxDEMO.field_71439_g.field_70738_aO > 0) {
            H.ALLATORIxDEMO.field_71439_g.field_70159_w *= (double)(a22 / 100.0f);
            H.ALLATORIxDEMO.field_71439_g.field_70181_x *= (double)(f2 / 100.0f);
            H.ALLATORIxDEMO.field_71439_g.field_70179_y *= (double)(a22 / 100.0f);
        }
    }

    public H() {
        super("Velocity", "Reduces knockback", I.B);
        H a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("X", a2, 20.0, 0.0, 100.0, true));
        l.p.H.g.c.ALLATORIxDEMO(new i("Y", a2, 60.0, 0.0, 100.0, true));
    }
}

