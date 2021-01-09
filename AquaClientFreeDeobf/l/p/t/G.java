/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package l.p.t;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class G {
    public G() {
        G a2;
    }

    public static void ALLATORIxDEMO(int a2, int a3, int a4, int a5, ResourceLocation a6) {
        GL11.glPushMatrix();
        GlStateManager.func_179147_l();
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
        GL11.glDisable((int)3008);
        Minecraft.func_71410_x().field_71446_o.func_110577_a(a6);
        Gui.func_146110_a((int)a2, (int)a3, (float)0.0f, (float)0.0f, (int)a4, (int)a5, (float)a4, (float)a5);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glColor4f((float)2.0f, (float)2.0f, (float)2.0f, (float)2.0f);
        GlStateManager.func_179084_k();
        GL11.glPopMatrix();
    }
}

