/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  org.lwjgl.input.Keyboard
 */
package l.p.l.l;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class F
extends H {
    void l(double a2) {
        float f2 = F.ALLATORIxDEMO();
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70179_y += (double)MathHelper.func_76126_a((float)f2) * a2;
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70159_w += (double)MathHelper.func_76134_b((float)f2) * a2;
    }

    public F() {
        super("InventoryWalk", "", I.J);
        F a2;
    }

    void b(double a2) {
        float f2 = F.ALLATORIxDEMO();
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70179_y -= (double)MathHelper.func_76126_a((float)f2) * a2;
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70159_w -= (double)MathHelper.func_76134_b((float)f2) * a2;
    }

    void E(double a2) {
        float f2 = F.ALLATORIxDEMO();
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70159_w -= (double)MathHelper.func_76126_a((float)f2) * a2;
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70179_y += (double)MathHelper.func_76134_b((float)f2) * a2;
    }

    void D(double a2) {
        F a3;
        if (!Keyboard.isKeyDown((int)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74370_x.func_151463_i())) {
            return;
        }
        a3.l(a2);
    }

    void ALLATORIxDEMO(double a2) {
        F a3;
        if (!Keyboard.isKeyDown((int)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74368_y.func_151463_i())) {
            return;
        }
        a3.C(a2);
    }

    void l() {
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70122_E && Keyboard.isKeyDown((int)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74314_A.func_151463_i())) {
            l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_70664_aZ();
        }
    }

    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(TickEvent.ClientTickEvent a2) {
        F a3;
        if (a3.b()) {
            return;
        }
        if (!(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_71462_r instanceof GuiContainer) && !(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_71462_r instanceof l.p.d.H)) {
            return;
        }
        double d2 = 0.05;
        if (!l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70122_E) {
            d2 /= 4.0;
        }
        a3.l();
        a3.a(d2);
        if (!l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70122_E) {
            d2 /= 2.0;
        }
        double d3 = d2;
        a3.ALLATORIxDEMO(d3);
        a3.D(d3);
        a3.B(d2);
        super.ALLATORIxDEMO(a2);
    }

    void a(double a2) {
        F a3;
        if (!Keyboard.isKeyDown((int)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74351_w.func_151463_i())) {
            return;
        }
        a3.E(a2);
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

    void C(double a2) {
        float f2 = F.ALLATORIxDEMO();
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70159_w += (double)MathHelper.func_76126_a((float)f2) * a2;
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70179_y -= (double)MathHelper.func_76134_b((float)f2) * a2;
    }

    void B(double a2) {
        F a3;
        if (!Keyboard.isKeyDown((int)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74366_z.func_151463_i())) {
            return;
        }
        a3.b(a2);
    }
}

