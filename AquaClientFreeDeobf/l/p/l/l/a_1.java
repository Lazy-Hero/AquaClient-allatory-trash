/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.l;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class a
extends H {
    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(TickEvent.PlayerTickEvent a2) {
        a a3;
        if (a3.b()) {
            return;
        }
        KeyBinding.func_74510_a((int)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74351_w.func_151463_i(), (boolean)true);
        super.ALLATORIxDEMO(a2);
    }

    @Override
    public void B() {
        a a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        KeyBinding.func_74510_a((int)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74351_w.func_151463_i(), (boolean)false);
        super.B();
    }

    public a() {
        super("AutoWalk", "BBBBBBBBBBBBB", I.J);
        a a2;
    }
}

