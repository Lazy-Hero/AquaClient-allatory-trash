/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityShulkerBox
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
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class j
extends H {
    public j() {
        super("ShulkerESP", "pupupipup", I.c);
        j a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Red", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Green", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Blue", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Alpha", a2, 1.0, 0.0, 1.0, false));
    }

    @SubscribeEvent
    public void b(RenderWorldLastEvent a2) {
        j a3;
        if (a3.b()) {
            return;
        }
        for (TileEntity tileEntity : j.ALLATORIxDEMO.field_71441_e.field_147482_g) {
            if (!(tileEntity instanceof TileEntityShulkerBox)) continue;
            l.p.H.g.c.ALLATORIxDEMO(a3, "Red").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Green").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Blue").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Alpha").B();
            GL11.glPushAttrib((int)24580);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2929);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)2848);
            GL11.glPushMatrix();
            GL11.glTranslated((double)((double)tileEntity.func_174877_v().func_177958_n() - j.ALLATORIxDEMO.func_175598_ae().field_78730_l), (double)((double)tileEntity.func_174877_v().func_177956_o() - j.ALLATORIxDEMO.func_175598_ae().field_78731_m), (double)((double)tileEntity.func_174877_v().func_177952_p() - j.ALLATORIxDEMO.func_175598_ae().field_78728_n));
            GlStateManager.func_187441_d((float)3.0f);
            GL11.glColor4f((float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Red").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Green").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Blue").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Alpha").B()));
            E.b(Block.field_185505_j);
            GL11.glPopMatrix();
            GL11.glPopAttrib();
            GlStateManager.func_179117_G();
        }
    }
}

