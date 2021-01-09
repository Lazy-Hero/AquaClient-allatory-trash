/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  org.lwjgl.opengl.GL11
 */
package l.p.t;

import java.awt.Color;
import l.p.t.H;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

public class B {
    public static void ALLATORIxDEMO(BlockPos a2, float a3, float a4, float a5) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)2896);
        double d2 = H.ALLATORIxDEMO.ALLATORIxDEMO().func_175598_ae().field_78730_l;
        double d3 = H.ALLATORIxDEMO.ALLATORIxDEMO().func_175598_ae().field_78731_m;
        double d4 = H.ALLATORIxDEMO.ALLATORIxDEMO().func_175598_ae().field_78728_n;
        GL11.glTranslated((double)(-d2), (double)(-d3), (double)(-d4));
        GL11.glColor4f((float)a3, (float)a4, (float)a5, (float)0.3f);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(a2);
        B.ALLATORIxDEMO(axisAlignedBB);
        GL11.glColor4f((float)a3, (float)a4, (float)a5, (float)1.0f);
        B.b(axisAlignedBB);
        GL11.glColor4f((float)1.0f, (float)0.2f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
        GlStateManager.func_179117_G();
    }

    public static void ALLATORIxDEMO(AxisAlignedBB a2) {
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glEnd();
    }

    public static void b(AxisAlignedBB a2) {
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glEnd();
    }

    public static int ALLATORIxDEMO(int a2, int a3) {
        return Color.getHSBColor((float)((System.currentTimeMillis() + (long)a3) % (long)a2) / (float)a2, 1.0f, 1.0f).getRGB();
    }

    public B() {
        B a2;
    }
}

