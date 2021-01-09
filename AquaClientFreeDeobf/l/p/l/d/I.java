/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.d;

import l.p.l.H;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class I
extends H {
    public I() {
        super("Sprint", "Always holds down the sprint key", l.p.l.I.J);
        I a2;
    }

    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(TickEvent.PlayerTickEvent a2) {
        KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_151444_V.func_151463_i(), (boolean)true);
    }

    @Override
    public void B() {
        I a2;
        super.B();
        KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_151444_V.func_151463_i(), (boolean)false);
    }
}

