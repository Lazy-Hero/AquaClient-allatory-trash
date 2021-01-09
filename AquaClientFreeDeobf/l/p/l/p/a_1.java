/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.p;

import java.util.Iterator;
import l.p.l.H;
import l.p.l.I;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class a
extends H {
    public a() {
        super("ItemESP", "", I.c);
        a a2;
    }

    @Override
    public void b() {
        a a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
    }

    @SubscribeEvent
    public void b(RenderWorldLastEvent a2) {
        for (Entity entity : a.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            if (!(entity instanceof EntityItem)) continue;
            entity.func_184195_f(true);
        }
    }

    @Override
    public void B() {
        a a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        if (a.ALLATORIxDEMO.field_71441_e == null || a.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        Iterator iterator = a.ALLATORIxDEMO.field_71441_e.func_72910_y().iterator();
        while (iterator.hasNext()) {
            ((Entity)iterator.next()).func_184195_f(false);
        }
    }
}

