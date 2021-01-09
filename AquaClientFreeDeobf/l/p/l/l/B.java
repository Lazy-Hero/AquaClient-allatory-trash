/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.l;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class B
extends H {
    @Override
    public String b() {
        return "Gives you zero damage on fall.";
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        B a3;
        if (a3.b()) {
            return;
        }
        if (!B.ALLATORIxDEMO.field_71439_g.field_70122_E && B.ALLATORIxDEMO.field_71439_g.field_70143_R > 3.0f) {
            ALLATORIxDEMO.func_147114_u().func_147297_a((Packet)new CPacketPlayer(true));
        }
    }

    public B() {
        super("NoFall", "", I.J);
        B a2;
    }
}

