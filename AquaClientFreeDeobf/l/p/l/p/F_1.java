/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package l.p.l.p;

import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class F
extends H {
    public F() {
        super("NameTags", "", I.c);
        F a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Sneaking", a2, true));
        l.p.H.g.c.ALLATORIxDEMO(new i("Upscale", a2, true));
    }

    @SubscribeEvent
    public void ALLATORIxDEMO(RenderLivingEvent.Specials.Pre a2) {
        F a3;
        EntityLivingBase entityLivingBase = a2.getEntity();
        if (!(entityLivingBase instanceof EntityPlayer) || entityLivingBase == Minecraft.func_71410_x().field_71439_g) {
            return;
        }
        if (entityLivingBase.field_70128_L || entityLivingBase.func_110143_aJ() < 0.0f || entityLivingBase.func_82150_aj()) {
            return;
        }
        GL11.glPushMatrix();
        Vec3d vec3d = new Vec3d(a2.getX(), a2.getY() + (double)entityLivingBase.field_70131_O / 1.5, a2.getZ());
        RenderManager renderManager = Minecraft.func_71410_x().func_175598_ae();
        GL11.glTranslated((double)vec3d.field_72450_a, (double)(vec3d.field_72448_b + (double)1.3f), (double)vec3d.field_72449_c);
        if (l.p.H.g.c.ALLATORIxDEMO(a3, "Upscale").E()) {
            double d2 = Math.max(1.0, vec3d.func_72438_d(new Vec3d(0.0, 0.0, 0.0)) / 6.0);
            GL11.glScaled((double)d2, (double)d2, (double)d2);
        }
        int n = (int)Math.ceil(entityLivingBase.func_110143_aJ());
        EntityRenderer.func_189692_a((FontRenderer)Minecraft.func_71410_x().field_71466_p, (String)new StringBuilder().insert(0, "\u00a77").append(entityLivingBase.func_145748_c_().func_150254_d()).append(n > 12 ? " \u00a7a" : (n > 6 ? " \u00a7e" : " \u00a7c")).append(n).toString(), (float)0.0f, (float)0.0f, (float)0.0f, (int)0, (float)Minecraft.func_71410_x().func_175598_ae().field_78735_i, (float)Minecraft.func_71410_x().func_175598_ae().field_78732_j, (Minecraft.func_71410_x().field_71474_y.field_74320_O == 2 ? 1 : 0) != 0, (boolean)(l.p.H.g.c.ALLATORIxDEMO(a3, "Sneaking").E() ? false : entityLivingBase.func_70093_af()));
        GL11.glPopMatrix();
        a2.setCanceled(true);
    }
}

