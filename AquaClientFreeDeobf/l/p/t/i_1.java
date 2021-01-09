/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.math.MathHelper
 */
package l.p.t;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class i {
    public i() {
        i a2;
    }

    public static float[] ALLATORIxDEMO(Entity a2) {
        double d2;
        double d3;
        double d4;
        double d5 = a2.field_70165_t - Minecraft.func_71410_x().field_71439_g.field_70165_t;
        double d6 = a2.field_70161_v - Minecraft.func_71410_x().field_71439_g.field_70161_v;
        if (a2 instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)a2;
            d4 = entityLivingBase.field_70163_u + (double)entityLivingBase.func_70047_e() - (Minecraft.func_71410_x().field_71439_g.field_70163_u + (double)Minecraft.func_71410_x().field_71439_g.func_70047_e());
            d3 = d5;
            d2 = d5;
        } else {
            d4 = (a2.func_174813_aQ().field_72338_b + a2.func_174813_aQ().field_72337_e) / 2.0 - (Minecraft.func_71410_x().field_71439_g.field_70163_u + (double)Minecraft.func_71410_x().field_71439_g.func_70047_e());
            d3 = d5;
            d2 = d5;
        }
        double d7 = MathHelper.func_76133_a((double)(d3 * d2 + d6 * d6));
        float f2 = (float)(MathHelper.func_181159_b((double)d6, (double)d5) * 57.29577951308232) - 90.0f;
        float f3 = (float)(-(MathHelper.func_181159_b((double)d4, (double)d7) * 57.29577951308232));
        return new float[]{f2, f3};
    }
}

