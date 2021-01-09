/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.p;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class D
extends H {
    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(RenderWorldLastEvent a2) {
        D a3;
        GlStateManager.func_179086_m((int)256);
        RenderHelper.func_74519_b();
        for (Entity entity : D.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            a3.ALLATORIxDEMO(entity, a2.getPartialTicks());
        }
        super.ALLATORIxDEMO(a2);
    }

    void ALLATORIxDEMO(Entity a2, float a3) {
        if (a2 instanceof EntityPlayer) {
            if (a2 == l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO()) {
                return;
            }
            if (a2 == l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_175606_aa() && l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_74320_O == 0) {
                return;
            }
            l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_71460_t.func_175072_h();
            l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_175598_ae().func_188388_a(a2, a3, false);
            l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_71460_t.func_180436_i();
        }
    }

    public D() {
        super("Chams", "", I.c);
        D a2;
    }
}

