/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 */
package l.p.l.l;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.network.play.client.CPacketPlayer;

public class L
extends H {
    @Override
    public void b() {
        L a2;
        if (a2.b()) {
            return;
        }
        l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO((CPacketPlayer)new CPacketPlayer.Rotation(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, false));
        a2.B();
    }

    public L() {
        super("kick", "", I.i);
        L a2;
    }
}

