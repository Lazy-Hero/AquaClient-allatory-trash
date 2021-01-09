/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityArmorStand
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import l.p.l.H;
import l.p.l.I;
import l.p.l.t.E;
import l.p.p.i;
import l.p.t.e;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class F
extends H {
    public F() {
        super("HitBoxes", "", I.B);
        F a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Expand", a2, 0.1, 0.0, 2.0, false));
    }

    public boolean ALLATORIxDEMO(EntityLivingBase a2) {
        if (a2 instanceof EntityArmorStand || a2 instanceof EntityPlayerSP) {
            return false;
        }
        return a2 != l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO();
    }

    void ALLATORIxDEMO(EntityPlayer a2, double a3) {
        a3 = (float)a3 / 2.0f;
        a2.func_174826_a(new AxisAlignedBB(a2.field_70165_t - a3, a2.field_70163_u, a2.field_70161_v - a3, a2.field_70165_t + a3, a2.field_70163_u + (double)a2.field_70131_O, a2.field_70161_v + a3));
    }

    public void ALLATORIxDEMO(Entity a2, int a3) {
        try {
            Field field = Entity.class.getDeclaredField(e.ALLATORIxDEMO);
            field.setAccessible(true);
            field.setInt((Object)a2, a3);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void ALLATORIxDEMO(Entity a2, float a3, float a4) {
        a2.field_70130_N = a3;
        a2.field_70131_O = a4;
    }

    public E ALLATORIxDEMO(Entity a2) {
        F a3;
        return new E(a3, 0.6f, 1.8f);
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        F a3;
        for (EntityPlayer entityPlayer : a3.ALLATORIxDEMO()) {
            float f2 = 0.6f + (float)l.p.H.g.c.ALLATORIxDEMO(a3, "Expand").B();
            a3.ALLATORIxDEMO(entityPlayer, f2);
        }
        super.ALLATORIxDEMO(a2);
    }

    public List<EntityPlayer> ALLATORIxDEMO() {
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>();
        for (Object object : F.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            F a2;
            if (!(object instanceof EntityPlayer) || !a2.ALLATORIxDEMO((EntityLivingBase)(object = (EntityPlayer)object))) continue;
            arrayList.add((EntityPlayer)object);
        }
        return arrayList;
    }

    @Override
    public void B() {
        F a2;
        for (EntityPlayer entityPlayer : a2.ALLATORIxDEMO()) {
            a2.ALLATORIxDEMO(entityPlayer, (double)0.6f + l.p.H.g.c.ALLATORIxDEMO(a2, "Expand").B());
        }
        super.B();
    }
}

