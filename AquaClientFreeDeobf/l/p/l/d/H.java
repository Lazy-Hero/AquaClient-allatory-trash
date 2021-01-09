/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.Timer
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.d;

import java.lang.reflect.Field;
import l.p.l.I;
import l.p.p.i;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class H
extends l.p.l.H {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a22) {
        String string;
        Class<Minecraft> class_;
        H a3;
        double d2 = l.p.H.g.c.ALLATORIxDEMO(a3, "speed").B();
        try {
            class_ = Minecraft.class;
            string = l.p.H.ALLATORIxDEMO() ? "timer" : "field_71428_T";
        }
        catch (Exception a22) {
            return;
        }
        {
            Object a22 = class_.getDeclaredField(string);
            ((Field)a22).setAccessible(true);
            ((Field)a22).set((Object)ALLATORIxDEMO, (Object)new Timer((float)(20.0 * d2)));
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void B() {
        String string;
        Class<Minecraft> class_;
        H a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        try {
            class_ = Minecraft.class;
            string = l.p.H.ALLATORIxDEMO() ? "timer" : "field_71428_T";
        }
        catch (Exception exception) {
            return;
        }
        {
            Field field = class_.getDeclaredField(string);
            field.setAccessible(true);
            field.set((Object)ALLATORIxDEMO, (Object)new Timer(20.0f));
            return;
        }
    }

    public H() {
        super("Timer", "", I.J);
        H a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("speed", a2, 1.0, 0.1, 5.0, false));
    }
}

