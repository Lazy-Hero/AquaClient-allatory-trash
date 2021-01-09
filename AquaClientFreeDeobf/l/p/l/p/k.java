/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.p;

import l.p.l.H;
import l.p.l.I;
import l.p.t.B;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class k
extends H {
    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(RenderWorldLastEvent a2) {
        k a3;
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_71476_x == null) {
            return;
        }
        if (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_71476_x.field_72313_a == RayTraceResult.Type.BLOCK) {
            Block block = k.ALLATORIxDEMO.field_71441_e.func_180495_p(k.ALLATORIxDEMO.field_71476_x.func_178782_a()).func_177230_c();
            BlockPos blockPos = l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_71476_x.func_178782_a();
            if (Block.func_149682_b((Block)block) == 0) {
                return;
            }
            B.ALLATORIxDEMO(blockPos, 1.0f, 0.0f, 1.0f);
        }
        GlStateManager.func_179117_G();
        super.ALLATORIxDEMO(a2);
    }

    public k() {
        super("BlockOverlay", "", I.c);
        k a2;
    }

    @Override
    public String b() {
        return "Show of selected block.";
    }
}

