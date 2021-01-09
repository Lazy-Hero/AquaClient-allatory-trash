/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.l;

import java.lang.reflect.Field;
import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class d
extends H {
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
        try {
            class_ = Minecraft.class;
            string = l.p.H.ALLATORIxDEMO() ? "rightClickDelayTimer" : "field_71467_ac";
        }
        catch (ReflectiveOperationException a22) {
            return;
        }
        {
            Object a22 = class_.getDeclaredField(string);
            ((Field)a22).setAccessible(true);
            ((Field)a22).setInt((Object)ALLATORIxDEMO, 0);
            return;
        }
    }

    public d() {
        super("FastPlace", "", I.i);
        d a2;
    }
}

