/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.client.event.sound.PlaySoundEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.l;

import java.util.Timer;
import java.util.TimerTask;
import l.p.l.H;
import l.p.l.I;
import l.p.l.l.g;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class c
extends H {
    private transient Timer ALLATORIxDEMO = new Timer();

    @SubscribeEvent
    public void ALLATORIxDEMO(PlaySoundEvent a2) {
        if (Minecraft.func_71410_x().field_71439_g != null && Minecraft.func_71410_x().field_71439_g.field_71104_cf != null && a2.getName().equals("entity.bobber.splash")) {
            c a3;
            a3.b(500);
            a3.b(1000);
        }
    }

    private /* synthetic */ void b(int a2) {
        c a3;
        a3.ALLATORIxDEMO.schedule((TimerTask)new g(a3), a2);
    }

    public c() {
        super("Auto Fish", "Catches fish automatically with fishing rod", I.i);
        c a2;
    }
}

