/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.p;

import java.util.Iterator;
import l.p.l.H;
import l.p.l.I;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class g
extends H {
    @SubscribeEvent
    public void b(RenderWorldLastEvent a2) {
        for (Entity entity : l.p.l.p.g.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            g a3;
            if (!a3.ALLATORIxDEMO(entity)) continue;
            entity.func_184195_f(true);
        }
    }

    @Override
    public void B() {
        g a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        if (l.p.l.p.g.ALLATORIxDEMO.field_71441_e == null || l.p.l.p.g.ALLATORIxDEMO.field_71439_g == null) {
            return;
        }
        Iterator iterator = l.p.l.p.g.ALLATORIxDEMO.field_71441_e.func_72910_y().iterator();
        while (iterator.hasNext()) {
            ((Entity)iterator.next()).func_184195_f(false);
        }
    }

    public g() {
        super("PlayerESP", "", I.c);
        g a2;
    }

    public boolean ALLATORIxDEMO(Entity a2) {
        if (!(a2 instanceof EntityPlayer)) {
            return false;
        }
        return a2 != l.p.l.p.g.ALLATORIxDEMO.field_71439_g;
    }

    @Override
    public void b() {
        g a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
    }
}

