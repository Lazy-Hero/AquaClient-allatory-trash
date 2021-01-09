/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityArmorStand
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.Vec3d
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
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class L
extends H {
    public boolean ALLATORIxDEMO(EntityLivingBase a2) {
        if (a2 instanceof EntityArmorStand || a2 instanceof EntityPlayerSP) {
            return false;
        }
        return a2 != l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO();
    }

    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(RenderWorldLastEvent a2) {
        L a3;
        if (a3.b()) {
            return;
        }
        for (EntityPlayer entityPlayer : a3.ALLATORIxDEMO()) {
            if (!(entityPlayer instanceof EntityPlayer) || entityPlayer != L.ALLATORIxDEMO.field_71439_g) {
                // empty if block
            }
            a3.ALLATORIxDEMO((Entity)entityPlayer, a2.getPartialTicks());
        }
        super.ALLATORIxDEMO(a2);
    }

    public void ALLATORIxDEMO(Entity a2, float a3, float a4, float a5, float a6, float a7) {
        L a8;
        l.p.H.g.c.ALLATORIxDEMO(a8, "Red").B();
        l.p.H.g.c.ALLATORIxDEMO(a8, "Green").B();
        l.p.H.g.c.ALLATORIxDEMO(a8, "Blue").B();
        l.p.H.g.c.ALLATORIxDEMO(a8, "Alpha").B();
        double d2 = l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_175598_ae().field_78730_l;
        double d3 = l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_175598_ae().field_78731_m;
        double d4 = l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_175598_ae().field_78728_n;
        d2 = a2.field_70142_S + (a2.field_70165_t - a2.field_70142_S) * (double)a7 - d2;
        d3 = a2.field_70137_T + (a2.field_70163_u - a2.field_70137_T) * (double)a7 + (double)(a2.field_70131_O / 2.0f) - d3;
        d4 = a2.field_70136_U + (a2.field_70161_v - a2.field_70136_U) * (double)a7 - d4;
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2896);
        GL11.glLineWidth((float)2.5f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)((float)l.p.H.g.c.ALLATORIxDEMO(a8, "Red").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a8, "Green").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a8, "Blue").B()), (float)((float)l.p.H.g.c.ALLATORIxDEMO(a8, "Alpha").B()));
        a2 = null;
        a2 = new Vec3d(0.0, 0.0, 1.0).func_178789_a(-((float)Math.toRadians(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70125_A))).func_178785_b(-((float)Math.toRadians(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70177_z)));
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)a2.field_72450_a, (double)((double)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_70047_e() + a2.field_72448_b), (double)a2.field_72449_c);
        GL11.glVertex3d((double)d2, (double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)2896);
        GL11.glDepthMask((boolean)true);
        GlStateManager.func_179117_G();
    }

    public List<EntityPlayer> ALLATORIxDEMO() {
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>();
        for (Object object : L.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            L a2;
            if (!(object instanceof EntityPlayer) || !a2.ALLATORIxDEMO((EntityLivingBase)(object = (EntityPlayer)object))) continue;
            arrayList.add((EntityPlayer)object);
        }
        return arrayList;
    }

    private /* synthetic */ void ALLATORIxDEMO(Entity a2, float a3) {
        L a4;
        a4.ALLATORIxDEMO(a2, 1.0f, 1.0f, 1.0f, 0.5f, a3);
    }

    public L() {
        super("Tracers", "", I.c);
        L a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Red", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Green", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Blue", a2, 0.1, 0.0, 1.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new i("Alpha", a2, 1.0, 0.0, 1.0, false));
    }
}

