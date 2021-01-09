/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityMinecartChest
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityChest
 *  net.minecraft.tileentity.TileEntityEnderChest
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package l.p.l.p;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class G
extends H {
    public static void ALLATORIxDEMO(BufferBuilder a2, double a3, double a4, double a5, double a6, double a7, double a8, float a9, float a10, float a11, float a12) {
        double d2 = a6;
        double d3 = a3;
        double d4 = a6;
        double d5 = a3;
        a2.func_181662_b(a3, a4, a5).func_181666_a(a9, a10, a11, 0.0f).func_181675_d();
        a2.func_181662_b(a3, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d5, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d5, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d4, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d4, a7, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a7, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d3, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d3, a7, a8).func_181666_a(a9, a10, a11, 0.0f).func_181675_d();
        a2.func_181662_b(a3, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a7, a8).func_181666_a(a9, a10, a11, 0.0f).func_181675_d();
        a2.func_181662_b(a6, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d2, a7, a5).func_181666_a(a9, a10, a11, 0.0f).func_181675_d();
        a2.func_181662_b(d2, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a4, a5).func_181666_a(a9, a10, a11, 0.0f).func_181675_d();
    }

    public static void b(BufferBuilder a2, double a3, double a4, double a5, double a6, double a7, double a8, float a9, float a10, float a11, float a12) {
        double d2 = a3;
        double d3 = a6;
        double d4 = a6;
        double d5 = a6;
        double d6 = a3;
        a2.func_181662_b(a3, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d6, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d6, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a7, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a7, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d5, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d5, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d4, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d4, a7, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a7, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a6, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d3, a7, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d3, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a4, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d2, a4, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(d2, a7, a8).func_181666_a(a9, a10, a11, a12).func_181675_d();
        a2.func_181662_b(a3, a7, a5).func_181666_a(a9, a10, a11, a12).func_181675_d();
    }

    @SubscribeEvent
    public void b(RenderWorldLastEvent a2) {
        double d2;
        double d3;
        float f2;
        float f3;
        Object object;
        a2 = G.ALLATORIxDEMO.field_71441_e.field_72996_f.iterator();
        while (a2.hasNext()) {
            object = (Entity)a2.next();
            if (!(object instanceof EntityMinecartChest)) continue;
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2929);
            GL11.glDisable((int)2896);
            GlStateManager.func_187441_d((float)3.0f);
            GlStateManager.func_179090_x();
            GlStateManager.func_179132_a((boolean)true);
            float f4 = (float)((double)object.func_180425_c().func_177958_n() - G.ALLATORIxDEMO.func_175598_ae().field_78730_l);
            f3 = (float)((double)object.func_180425_c().func_177956_o() - G.ALLATORIxDEMO.func_175598_ae().field_78731_m);
            f2 = (float)((double)object.func_180425_c().func_177952_p() - G.ALLATORIxDEMO.func_175598_ae().field_78728_n);
            double d4 = f4;
            double d5 = f3;
            double d6 = f2;
            double d7 = (double)f4 + Block.field_185505_j.field_72336_d;
            double d8 = (double)f3 + Block.field_185505_j.field_72337_e;
            double d9 = (double)f2 + Block.field_185505_j.field_72334_f;
            float f5 = (float)(G.ALLATORIxDEMO.field_71439_g.func_174818_b(object.func_180425_c()) / 100.0);
            d3 = MathHelper.func_151237_a((double)f5, (double)0.1, (double)0.4);
            d2 = MathHelper.func_151237_a((double)f5, (double)0.1, (double)0.4);
            G.b(new AxisAlignedBB(d4, d5, d6, d7, d8, d9), (float)d2, (float)(0.0 - d2), 0.0f, (float)d3);
            G.ALLATORIxDEMO(new AxisAlignedBB(d4, d5, d6, d7, d8, d9), (float)d2, (float)(0.0 - d2), 0.0f, (float)d3);
            GL11.glEnable((int)2929);
            GlStateManager.func_179132_a((boolean)false);
            GlStateManager.func_179098_w();
            GlStateManager.func_179084_k();
        }
        a2 = G.ALLATORIxDEMO.field_71441_e.field_147482_g.iterator();
        while (a2.hasNext()) {
            TileEntity tileEntity;
            object = a2.next();
            TileEntity tileEntity2 = tileEntity = (TileEntity)object;
            TileEntity tileEntity3 = tileEntity;
            f3 = (float)((double)tileEntity3.func_174877_v().func_177958_n() - G.ALLATORIxDEMO.func_175598_ae().field_78730_l);
            f2 = (float)((double)tileEntity2.func_174877_v().func_177956_o() - G.ALLATORIxDEMO.func_175598_ae().field_78731_m);
            float f6 = (float)((double)tileEntity3.func_174877_v().func_177952_p() - G.ALLATORIxDEMO.func_175598_ae().field_78728_n);
            double d10 = f3;
            double d11 = f2;
            double d12 = f6;
            double d13 = f3;
            tileEntity2.func_145838_q();
            double d14 = d13 + Block.field_185505_j.field_72336_d;
            double d15 = f2;
            tileEntity.func_145838_q();
            double d16 = d15 + Block.field_185505_j.field_72337_e;
            double d17 = f6;
            tileEntity.func_145838_q();
            double d18 = d17 + Block.field_185505_j.field_72334_f;
            d3 = 0.0;
            d2 = 0.0;
            double d19 = 0.0;
            double d20 = 0.0;
            if (!(tileEntity instanceof TileEntityChest) && !(tileEntity instanceof TileEntityEnderChest)) continue;
            if (tileEntity instanceof TileEntityChest) {
                d3 = ((TileEntityChest)tileEntity).field_145991_k != null ? 1.0 : 0.0;
                d2 = ((TileEntityChest)tileEntity).field_145990_j != null ? 0.875 : 0.0;
                d19 = ((TileEntityChest)tileEntity).field_145992_i != null ? 1.0 : 0.0;
                d20 = ((TileEntityChest)tileEntity).field_145988_l != null ? 0.875 : 0.0;
            }
            d10 = (double)f3 + 0.0625 - d3;
            d11 = f2;
            d12 = (double)f6 + 0.0625 - d19;
            d14 = (double)f3 + 0.9375 - d2;
            d16 = (double)f2 + 0.875;
            d18 = (double)f6 + 0.9375 - d20;
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2929);
            GL11.glDisable((int)2896);
            GlStateManager.func_187441_d((float)3.0f);
            GlStateManager.func_179090_x();
            GlStateManager.func_179132_a((boolean)false);
            if (tileEntity instanceof TileEntityChest) {
                float f7 = (float)(G.ALLATORIxDEMO.field_71439_g.func_174818_b(tileEntity.func_174877_v()) / 100.0);
                d19 = MathHelper.func_151237_a((double)f7, (double)0.1, (double)0.4);
                d20 = MathHelper.func_151237_a((double)f7, (double)0.1, (double)0.4);
                G.b(new AxisAlignedBB(d10, d11, d12, d14, d16, d18), (float)d20, (float)(10.0 - d20), 1.0f, (float)d19);
                G.ALLATORIxDEMO(new AxisAlignedBB(d10, d11, d12, d14, d16, d18), (float)d20, (float)(10.0 - d20), 1.0f, (float)d19);
            } else if (tileEntity instanceof TileEntityEnderChest) {
                float f8 = (float)(G.ALLATORIxDEMO.field_71439_g.func_174818_b(tileEntity.func_174877_v()) / 100.0);
                d19 = MathHelper.func_151237_a((double)f8, (double)0.1, (double)0.4);
                d20 = MathHelper.func_151237_a((double)f8, (double)0.1, (double)0.4);
                G.b(new AxisAlignedBB(d10, d11, d12, d14, d16, d18), (float)(1.0 - d20), (float)d20, 1.0f, (float)d19);
                G.ALLATORIxDEMO(new AxisAlignedBB(d10, d11, d12, d14, d16, d18), (float)(1.0 - d20), (float)d20, 1.0f, (float)d19);
            }
            GL11.glEnable((int)2929);
            GlStateManager.func_179132_a((boolean)true);
            GlStateManager.func_179098_w();
            GlStateManager.func_179084_k();
        }
    }

    public static void b(double a2, double a3, double a4, double a5, double a6, double a7, float a8, float a9, float a10, float a11) {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        G.b(bufferBuilder, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11);
        tessellator.func_78381_a();
    }

    public G() {
        super("ChestESP", "rthygfhjfgh", I.c);
        G a2;
    }

    public static void b(AxisAlignedBB a2, float a3, float a4, float a5, float a6) {
        G.b(a2.field_72340_a, a2.field_72338_b, a2.field_72339_c, a2.field_72336_d, a2.field_72337_e, a2.field_72334_f, a3, a4, a5, a6);
    }

    public static void ALLATORIxDEMO(AxisAlignedBB a2, float a3, float a4, float a5, float a6) {
        G.ALLATORIxDEMO(a2.field_72340_a, a2.field_72338_b, a2.field_72339_c, a2.field_72336_d, a2.field_72337_e, a2.field_72334_f, a3, a4, a5, a6);
    }

    public static void ALLATORIxDEMO(double a2, double a3, double a4, double a5, double a6, double a7, float a8, float a9, float a10, float a11) {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        bufferBuilder.func_181668_a(3, DefaultVertexFormats.field_181706_f);
        G.ALLATORIxDEMO(bufferBuilder, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11);
        tessellator.func_78381_a();
    }
}

