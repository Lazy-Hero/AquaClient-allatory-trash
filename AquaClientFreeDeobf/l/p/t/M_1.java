/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityAgeable
 *  net.minecraft.entity.monster.EntityGolem
 *  net.minecraft.entity.passive.EntityAmbientCreature
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.util.math.Vec3d
 */
package l.p.t;

import l.p.t.c;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.util.math.Vec3d;

public class M {
    public static Vec3d ALLATORIxDEMO(Entity a2, float a3) {
        return c.ALLATORIxDEMO(a2.func_174791_d(), new Vec3d(a2.field_70142_S, a2.field_70137_T, a2.field_70136_U), a3);
    }

    public M() {
        M a2;
    }

    public static boolean ALLATORIxDEMO(Entity a2) {
        return a2 instanceof EntityAgeable || a2 instanceof EntityAmbientCreature || a2 instanceof EntityWaterMob || a2 instanceof EntityGolem;
    }
}

