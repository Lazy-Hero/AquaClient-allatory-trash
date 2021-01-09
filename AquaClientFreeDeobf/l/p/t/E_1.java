/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  org.lwjgl.opengl.GL11
 */
package l.p.t;

import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public class E {
    public E() {
        E a2;
    }

    public static void b(AxisAlignedBB a2) {
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
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
        GL11.glEnd();
    }

    public static void ALLATORIxDEMO(AxisAlignedBB a2) {
        GL11.glBegin((int)7);
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
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72338_b, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glVertex3d((double)a2.field_72340_a, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72334_f);
        GL11.glVertex3d((double)a2.field_72336_d, (double)a2.field_72337_e, (double)a2.field_72339_c);
        GL11.glEnd();
    }
}

