/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class a
extends H {
    public a() {
        super("AutoShiftTap", "Auto press Shift when you press attack", I.B);
        a a2;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a22) {
        block4: {
            a a3;
            if (a3.b()) {
                return;
            }
            try {
                if (!a.ALLATORIxDEMO.field_71474_y.field_74312_F.func_151470_d()) break block4;
                KeyBinding.func_74510_a((int)a.ALLATORIxDEMO.field_71474_y.field_74311_E.func_151463_i(), (boolean)true);
                return;
            }
            catch (Exception a22) {
                return;
            }
        }
        KeyBinding.func_74510_a((int)a.ALLATORIxDEMO.field_71474_y.field_74311_E.func_151463_i(), (boolean)GameSettings.func_100015_a((KeyBinding)a.ALLATORIxDEMO.field_71474_y.field_74311_E));
    }
}

