/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityChest
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package l.p.l.p;

import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import l.p.t.E;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class M
extends H {
    public M() {
        super("ChestESP", "\u0420\u045b\u0420\u045c\u0420\u045b \u0420\u0459\u0420\u0452\u0420\u00a0\u0420\u045b\u0420\u00a7 \u0420\u00ad\u0420\u045e\u0420\u0452 \u0420\u201d\u0420\u0452", I.c);
        M a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Red", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Green", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Blue", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Alpha", a2, 1.0, 0.0, 1.0, false));
    }

    @SubscribeEvent
    public void b(RenderWorldLastEvent a2) {
        M a3;
        if (a3.b()) {
            return;
        }
        for (TileEntity tileEntity : M.ALLATORIxDEMO.field_71441_e.field_147482_g) {
            if (!(tileEntity instanceof TileEntityChest)) continue;
            GL11.glPushAttrib((int)24580);
            l.p.H.g.c.ALLATORIxDEMO(a3, "Red").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Green").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Blue").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Alpha").B();
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2929);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)2848);
            GL11.glPushMatrix();
            GL11.glTranslated((double)((double)tileEntity.func_174877_v().func_177958_n() - M.ALLATORIxDEMO.func_175598_ae().field_78730_l), (double)((double)tileEntity.func_174877_v().func_177956_o() - M.ALLATORIxDEMO.func_175598_ae().field_78731_m), (double)((double)tileEntity.func_174877_v().func_177952_p() - M.ALLATORIxDEMO.func_175598_ae().field_78728_n));
            GlStateManager.func_187441_d((float)3.0f);
            GL11.glColor4f((float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Red").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Green").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Blue").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Alpha").B()));
            E.b(Block.field_185505_j);
            GL11.glPopMatrix();
            GL11.glPopAttrib();
            GlStateManager.func_179117_G();
        }
    }
}

