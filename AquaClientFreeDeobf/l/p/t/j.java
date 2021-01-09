/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.AbstractHorse
 */
package l.p.t;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AbstractHorse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class j {
    public static double ALLATORIxDEMO(Entity a2, Entity a3) {
        return a2.func_70068_e(a3);
    }

    public static boolean ALLATORIxDEMO(Entity a2) {
        return a2 instanceof AbstractHorse && ((AbstractHorse)a2).func_110248_bS();
    }

    public static float ALLATORIxDEMO(Entity a2, Entity a3) {
        return a2.func_70032_d(a3);
    }

    public j() {
        j a2;
    }

    public static boolean b(Entity a2) {
        return a2.field_70123_F;
    }
}

