/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.MoverType
 *  net.minecraft.util.MovementInput
 *  net.minecraft.world.World
 */
package l.p.t;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.MoverType;
import net.minecraft.util.MovementInput;
import net.minecraft.world.World;

public class D
extends EntityOtherPlayerMP {
    private static MovementInput ALLATORIxDEMO = null;

    public void func_70636_d() {
        D a2;
        super.func_70636_d();
        a2.field_70145_X = true;
        a2.field_70159_w = 0.0;
        a2.field_70181_x = 0.0;
        a2.field_70179_y = 0.0;
        a2.field_70145_X = false;
    }

    public void func_70091_d(MoverType a2, double a3, double a4, double a5) {
        D a6;
        a6.field_70122_E = true;
        super.func_70091_d(a2, a3, a4, a5);
        a6.field_70122_E = true;
    }

    public boolean func_70093_af() {
        return false;
    }

    public D(World a2, GameProfile a3) {
        super(a2, a3);
        D a4;
    }

    public void setMovementInput(MovementInput a2) {
        D a3;
        ALLATORIxDEMO = a2;
        if (a2.field_78901_c && a3.field_70122_E) {
            super.func_70664_aZ();
        }
        super.func_191958_b(a2.field_78902_a, a3.field_70701_bs, a2.field_192832_b, a3.field_70764_aw);
    }
}

