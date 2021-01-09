/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 *  org.lwjgl.input.Mouse
 */
package l.p.l.t;

import io.netty.util.internal.ThreadLocalRandom;
import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Mouse;

public class c
extends H {
    private double B;
    private long J;
    private double c;
    private double h;
    private long i;
    private double ALLATORIxDEMO;

    private /* synthetic */ void l() {
        c a2;
        a2.c = l.p.H.g.c.ALLATORIxDEMO(a2, "MinCPS").B();
        a2.h = l.p.H.g.c.ALLATORIxDEMO(a2, "MaxCPS").B();
        if (a2.c >= a2.h) {
            a2.h = a2.c + 1.0;
        }
        a2.ALLATORIxDEMO = 1.0 / ThreadLocalRandom.current().nextDouble(a2.c - 0.2, a2.h);
        a2.B = a2.ALLATORIxDEMO / ThreadLocalRandom.current().nextDouble(a2.c, a2.h);
    }

    public c() {
        super("AutoClicker", "Automatically clicks when you hold down left click", I.B);
        c a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("MinCPS", a2, 8.0, 1.0, 20.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("MaxCPS", a2, 12.0, 1.0, 20.0, false));
    }

    @SubscribeEvent
    public void ALLATORIxDEMO(TickEvent.RenderTickEvent a22) {
        if (Mouse.isButtonDown((int)0)) {
            c a3;
            if ((double)(System.currentTimeMillis() - a3.i) > a3.ALLATORIxDEMO * 1000.0) {
                a3.i = System.currentTimeMillis();
                if (a3.J < a3.i) {
                    a3.J = a3.i;
                }
                int a22 = l.p.l.t.c.ALLATORIxDEMO.field_71474_y.field_74312_F.func_151463_i();
                KeyBinding.func_74510_a((int)a22, (boolean)true);
                KeyBinding.func_74507_a((int)a22);
                a3.l();
                return;
            }
            if ((double)(System.currentTimeMillis() - a3.J) > a3.B * 1000.0) {
                KeyBinding.func_74510_a((int)l.p.l.t.c.ALLATORIxDEMO.field_71474_y.field_74312_F.func_151463_i(), (boolean)false);
                a3.l();
            }
        }
    }

    @Override
    public void b() {
        c a2;
        super.b();
        a2.l();
    }
}

