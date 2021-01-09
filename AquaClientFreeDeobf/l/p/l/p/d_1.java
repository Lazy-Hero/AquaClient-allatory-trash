/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.p;

import java.util.Iterator;
import l.p.l.H;
import l.p.l.I;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class d
extends H {
    @SubscribeEvent
    public void b(RenderWorldLastEvent a2) {
        for (Entity entity : d.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            if (entity instanceof EntityMob) {
                entity.func_184195_f(true);
            }
            if (!(entity instanceof EntityLiving)) continue;
            entity.func_184195_f(true);
        }
    }

    @Override
    public void b() {
        d a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
    }

    @Override
    public void B() {
        d a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        if (d.ALLATORIxDEMO.field_71441_e == null || d.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        Iterator iterator = d.ALLATORIxDEMO.field_71441_e.func_72910_y().iterator();
        while (iterator.hasNext()) {
            ((Entity)iterator.next()).func_184195_f(false);
        }
    }

    public d() {
        super("MobESP", "", I.c);
        d a2;
    }
}

