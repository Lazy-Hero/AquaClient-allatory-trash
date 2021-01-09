/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.l;

import java.lang.reflect.Field;
import l.p.l.H;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class I
extends H {
    public I() {
        super("NoWeb", "", l.p.l.I.J);
        I a2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        String string;
        Class<Entity> class_;
        a2 = I.ALLATORIxDEMO.field_71439_g;
        try {
            class_ = Entity.class;
            string = l.p.H.ALLATORIxDEMO() ? "isInWeb" : "field_70134_J";
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return;
        }
        {
            Field field = class_.getDeclaredField(string);
            field.setAccessible(true);
            field.setBoolean((Object)a2, false);
            return;
        }
    }

    @Override
    public void B() {
        I a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
    }

    @Override
    public void b() {
        I a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
    }
}

