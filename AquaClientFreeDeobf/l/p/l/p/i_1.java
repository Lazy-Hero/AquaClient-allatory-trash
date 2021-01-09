/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemEgg
 *  net.minecraft.item.ItemEnderPearl
 *  net.minecraft.item.ItemFishingRod
 *  net.minecraft.item.ItemLingeringPotion
 *  net.minecraft.item.ItemSnowball
 *  net.minecraft.item.ItemSplashPotion
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package l.p.l.p;

import l.p.l.H;
import l.p.l.I;
import l.p.t.E;
import l.p.t.m;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemLingeringPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class i
extends H {
    private transient int ALLATORIxDEMO = 0;

    @SubscribeEvent
    public void b(RenderWorldLastEvent a222) {
        i a3;
        if (a3.b()) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        ItemStack itemStack = entityPlayerSP.field_71071_by.func_70448_g();
        if (itemStack == null) {
            return;
        }
        Item item = itemStack.func_77973_b();
        if (!(item instanceof ItemBow || item instanceof ItemSnowball || item instanceof ItemEgg || item instanceof ItemEnderPearl || item instanceof ItemSplashPotion || item instanceof ItemLingeringPotion || item instanceof ItemFishingRod)) {
            return;
        }
        boolean bl = itemStack.func_77973_b() instanceof ItemBow;
        double d2 = entityPlayerSP.field_70142_S + (entityPlayerSP.field_70165_t - entityPlayerSP.field_70142_S) * (double)a222.getPartialTicks() - Math.cos((float)Math.toRadians(entityPlayerSP.field_70177_z)) * (double)0.08f;
        double d3 = entityPlayerSP.field_70137_T + (entityPlayerSP.field_70163_u - entityPlayerSP.field_70137_T) * (double)a222.getPartialTicks() + (double)entityPlayerSP.func_70047_e() - 0.04;
        double d4 = entityPlayerSP.field_70136_U + (entityPlayerSP.field_70161_v - entityPlayerSP.field_70136_U) * (double)a222.getPartialTicks() - Math.sin((float)Math.toRadians(entityPlayerSP.field_70177_z)) * (double)0.08f;
        float a222 = 1.0f;
        float f2 = (float)Math.toRadians(entityPlayerSP.field_70177_z);
        float f3 = (float)Math.toRadians(entityPlayerSP.field_70125_A);
        double d5 = -Math.sin(f2) * Math.cos(f3) * (double)a222;
        double d6 = -Math.sin(f3) * (double)a222;
        double d7 = Math.cos(f2) * Math.cos(f3) * (double)a222;
        double d8 = Math.sqrt(d5 * d5 + d6 * d6 + d7 * d7);
        d5 /= d8;
        d6 /= d8;
        d7 /= d8;
        a222 = (float)(72000 - entityPlayerSP.func_184605_cv()) / 20.0f;
        if ((a222 = (a222 * a222 + a222 * 2.0f) / 3.0f) > 1.0f || a222 <= 0.1f) {
            a222 = 1.0f;
        }
        GL11.glPushAttrib((int)24837);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        RenderManager a222 = Minecraft.func_71410_x().func_175598_ae();
        d8 = 0.005;
        entityPlayerSP = new Vec3d(entityPlayerSP.field_70165_t, entityPlayerSP.field_70163_u + (double)entityPlayerSP.func_70047_e(), entityPlayerSP.field_70161_v);
        bl = false;
        boolean bl2 = a3.ALLATORIxDEMO((Vec3d)entityPlayerSP, new Vec3d(d2, d3, d4), new Vec3d(d5 *= (double)(a222 *= 3.0f), d6 *= (double)a222, d7 *= (double)a222), d8);
        if (bl2) {
            GL11.glColor4f((float)0.9f, (float)0.2f, (float)0.1f, (float)0.5f);
        } else {
            GL11.glColor4f((float)0.0f, (float)0.9f, (float)0.8f, (float)0.5f);
        }
        GL11.glBegin((int)3);
        for (int i2 = 0; i2 < 1000; ++i2) {
            double d9;
            if (Minecraft.func_71410_x().field_71441_e.func_72933_a((Vec3d)entityPlayerSP, new Vec3d(d2, d3, d4)) != null) {
                GL11.glColor4f((float)0.3f, (float)0.1f, (float)0.1f, (float)0.5f);
                d9 = d2;
            } else {
                GL11.glColor4f((float)0.9f, (float)0.2f, (float)0.1f, (float)0.5f);
                d9 = d2;
            }
            GL11.glVertex3d((double)(d9 - a222.field_78730_l), (double)(d3 - a222.field_78731_m), (double)(d4 - a222.field_78728_n));
            d2 += d5 * 0.1;
            d3 += d6 * 0.1;
            d4 += d7 * 0.1;
            d5 *= 0.999;
            d6 *= 0.999;
            d7 *= 0.999;
            d6 -= d8;
            for (Entity entity : Minecraft.func_71410_x().field_71441_e.field_72996_f) {
                if (!(entity instanceof EntityLiving) || !entity.func_174813_aQ().func_72314_b(0.35, 0.35, 0.35).func_72318_a(new Vec3d(d2, d3, d4))) continue;
                bl = true;
                break;
            }
            if (bl) break;
            Block block = Minecraft.func_71410_x().field_71441_e.field_73010_i.iterator();
            while (block.hasNext()) {
                Entity entity;
                entity = (EntityPlayer)block.next();
                if (entity == Minecraft.func_71410_x().field_71439_g || !entity.func_174813_aQ().func_72314_b(0.35, 0.35, 0.35).func_72318_a(new Vec3d(d2, d3, d4))) continue;
                bl = true;
                break;
            }
            if (bl || m.ALLATORIxDEMO(block = Minecraft.func_71410_x().field_71441_e.func_180495_p(new BlockPos(new Vec3d(d2, d3, d4))).func_177230_c())) break;
        }
        GL11.glEnd();
        GL11.glPushMatrix();
        GL11.glTranslated((double)(d2 - a222.field_78730_l), (double)(d3 - a222.field_78731_m), (double)(d4 - a222.field_78728_n));
        GL11.glCallList((int)a3.ALLATORIxDEMO);
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    public i() {
        super("Trajectories", "", I.c);
        i a2;
    }

    boolean ALLATORIxDEMO(Vec3d a22, Vec3d a3, Vec3d a4, double a5) {
        boolean a22 = false;
        for (int i2 = 0; i2 < 250; ++i2) {
            a3 = a3.func_178787_e(a4.func_186678_a(0.4));
            a4 = new Vec3d(a4.field_72450_a * 0.996, a4.field_72448_b * 0.996 - a5 * 4.0, a4.field_72449_c * 0.996);
            for (Entity entity : Minecraft.func_71410_x().field_71441_e.field_72996_f) {
                if (!(entity instanceof EntityLiving) || !entity.func_174813_aQ().func_72314_b(0.35, 0.35, 0.35).func_72318_a(a3)) continue;
                a22 = true;
                break;
            }
            if (a22) {
                return a22;
            }
            for (Entity entity : Minecraft.func_71410_x().field_71441_e.field_73010_i) {
                if (entity == Minecraft.func_71410_x().field_71439_g || !entity.func_174813_aQ().func_72314_b(0.35, 0.35, 0.35).func_72318_a(a3)) continue;
                a22 = true;
                break;
            }
            if (a22) {
                return a22;
            }
            Block block = Minecraft.func_71410_x().field_71441_e.func_180495_p(new BlockPos(a3)).func_177230_c();
            if (!m.ALLATORIxDEMO(block)) continue;
            return a22;
        }
        return a22;
    }

    @Override
    public void b() {
        i a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
        a2.ALLATORIxDEMO = GL11.glGenLists((int)1);
        GL11.glNewList((int)a2.ALLATORIxDEMO, (int)4864);
        E.ALLATORIxDEMO(new AxisAlignedBB(-0.5, -0.5, -0.5, 0.5, 0.5, 0.5));
        GL11.glEndList();
    }

    @Override
    public void B() {
        i a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        GL11.glDeleteLists((int)a2.ALLATORIxDEMO, (int)1);
    }
}

