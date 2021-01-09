/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package l.p.t;

import net.minecraft.client.Minecraft;

public class e {
    public static String E = e.ALLATORIxDEMO() ? "session" : "field_71449_j";
    public static String D;
    public static String G;
    public static String i;
    public static String j;
    public static String g;
    public static String c;
    public static String F;
    public static String J;
    public static String C;
    public static String B;
    public static String h;
    public static String ALLATORIxDEMO;
    public static String A;

    static {
        G = e.ALLATORIxDEMO() ? "yaw" : "field_149476_e";
        j = e.ALLATORIxDEMO() ? "pitch" : "field_149473_f";
        J = e.ALLATORIxDEMO() ? "rightClickDelayTimer" : "field_71467_ac";
        c = e.ALLATORIxDEMO() ? "getPlayerInfo" : "func_175155_b";
        i = e.ALLATORIxDEMO() ? "playerTextures" : "field_187107_a";
        g = e.ALLATORIxDEMO() ? "currentGameType" : "field_78779_k";
        D = e.ALLATORIxDEMO() ? "connection" : "field_78774_b";
        A = e.ALLATORIxDEMO() ? "blockHitDelay" : "field_78781_i";
        h = e.ALLATORIxDEMO() ? "isInWeb" : "field_70134_J";
        C = e.ALLATORIxDEMO() ? "curBlockDamageMP" : "field_78770_f";
        F = e.ALLATORIxDEMO() ? "isHittingBlock" : "field_78778_j";
        B = e.ALLATORIxDEMO() ? "onUpdateWalkingPlayer" : "func_175161_p";
        ALLATORIxDEMO = e.ALLATORIxDEMO() ? "fire" : "field_190534_ay";
    }

    public e() {
        e a2;
    }

    public static boolean ALLATORIxDEMO() {
        block3: {
            try {
                if (Minecraft.class.getDeclaredField("instance") == null) break block3;
                return true;
            }
            catch (Exception exception) {
                return false;
            }
        }
        return false;
    }
}

