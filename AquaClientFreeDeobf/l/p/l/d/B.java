/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.d;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class B
extends H {
    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        B a3;
        boolean bl;
        boolean bl2 = bl = Math.abs(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70759_as - l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70177_z) < 90.0f;
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_191988_bg > 0.0f && l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70737_aN < 5) {
            if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70122_E) {
                l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_70664_aZ();
                l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70181_x = 0.2;
                float f2 = B.ALLATORIxDEMO();
                l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70159_w -= (double)(MathHelper.func_76126_a((float)f2) * 0.2f);
                l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70179_y += (double)(MathHelper.func_76134_b((float)f2) * 0.2f);
            } else {
                double d2 = Math.sqrt(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70159_w * l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70159_w + l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70179_y * l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70179_y);
                double d3 = 1.0064;
                double d4 = B.ALLATORIxDEMO();
                l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70159_w = -Math.sin(d4) * d3 * d2;
                l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70179_y = Math.cos(d4) * d3 * d2;
            }
        }
        super.ALLATORIxDEMO(a2);
    }

    public static float ALLATORIxDEMO() {
        float f2 = l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70177_z;
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_191988_bg < 0.0f) {
            f2 += 180.0f;
        }
        float f3 = 1.0f;
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_191988_bg < 0.0f) {
            f3 = -0.5f;
        } else if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_191988_bg > 0.0f) {
            f3 = 0.5f;
        }
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70702_br > 0.0f) {
            f2 -= 90.0f * f3;
        }
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70702_br < 0.0f) {
            f2 += 90.0f * f3;
        }
        return f2 *= (float)Math.PI / 180;
    }

    @Override
    public String b() {
        return "You move faster.";
    }

    public B() {
        super("Speed", "", I.J);
        B a2;
    }
}

