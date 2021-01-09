/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.l;

import java.util.Random;
import l.p.l.I;
import l.p.p.i;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class H
extends l.p.l.H {
    private int ALLATORIxDEMO = 0;
    private String[] i = new String[]{"!I'm playing with Stress Client!", "!Buy Stress Client", "!You poor bitch, if you don't buy Stress!"};

    public static int ALLATORIxDEMO(int a2, int a3) {
        return new Random().nextInt(a3 - a2 + 1) + a2;
    }

    public H() {
        super("Spammer", "", I.i);
        H a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Speed", a2, 150.0, 70.0, 300.0, false));
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        H a3;
        l.p.H.g.c.ALLATORIxDEMO(a3, "Speed").B();
        ++a3.ALLATORIxDEMO;
        if ((float)a3.ALLATORIxDEMO > (float)l.p.H.g.c.ALLATORIxDEMO(a3, "Speed").B()) {
            H.ALLATORIxDEMO.field_71439_g.func_71165_d(a3.i[new Random().nextInt(a3.i.length)] + " (Stress" + H.ALLATORIxDEMO(0, 100) + "Client)");
            a3.ALLATORIxDEMO = 0;
        }
    }
}

