/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityArmorStand
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package l.p.l.p;

import java.util.ArrayList;
import java.util.List;
import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import l.p.t.B;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class f
extends H {
    public List<EntityPlayer> ALLATORIxDEMO() {
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>();
        for (Object object : f.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            f a2;
            if (!(object instanceof EntityPlayer) || !a2.ALLATORIxDEMO((EntityLivingBase)(object = (EntityPlayer)object))) continue;
            arrayList.add((EntityPlayer)object);
        }
        return arrayList;
    }

    public boolean ALLATORIxDEMO(EntityLivingBase a2) {
        if (a2 instanceof EntityArmorStand || a2 instanceof EntityPlayerSP) {
            return false;
        }
        return a2 != l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO();
    }

    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(RenderWorldLastEvent a2) {
        f a3;
        if (a3.b()) {
            return;
        }
        for (Entity entity : f.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            if (!(entity instanceof EntityPlayer) || entity == f.ALLATORIxDEMO.field_71439_g) continue;
            l.p.H.g.c.ALLATORIxDEMO(a3, "Red").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Green").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Blue").B();
            l.p.H.g.c.ALLATORIxDEMO(a3, "Alpha").B();
            GL11.glPushMatrix();
            GL11.glLineWidth((float)2.0f);
            GlStateManager.func_179090_x();
            GlStateManager.func_179097_i();
            GL11.glTranslated((double)(entity.field_70165_t - Minecraft.func_71410_x().func_175598_ae().field_78730_l), (double)(entity.field_70163_u - Minecraft.func_71410_x().func_175598_ae().field_78731_m), (double)(entity.field_70161_v - Minecraft.func_71410_x().func_175598_ae().field_78728_n));
            GL11.glColor4f((float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Red").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Green").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Blue").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a3, "Alpha").B()));
            B.b(new AxisAlignedBB(0.3, 1.8, 0.3, -0.3, 0.0, -0.3));
            GlStateManager.func_179098_w();
            GlStateManager.func_179126_j();
            GlStateManager.func_179121_F();
            GlStateManager.func_179117_G();
        }
    }

    public f() {
        super("BoxESP", "", I.c);
        f a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Red", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Green", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Blue", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Alpha", a2, 1.0, 0.0, 1.0, false));
    }
}

