/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class B
extends H {
    Entity ALLATORIxDEMO = null;
    float i = 0.0f;
    float B = 0.0f;

    public float[] ALLATORIxDEMO(Entity a22) {
        double d2;
        double d3;
        double d4;
        double d5 = a22.field_70165_t - l.p.l.t.B.ALLATORIxDEMO.field_71439_g.field_70165_t;
        double d6 = a22.field_70161_v - l.p.l.t.B.ALLATORIxDEMO.field_71439_g.field_70161_v;
        if (a22 instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)a22;
            d4 = entityLivingBase.field_70163_u + (double)entityLivingBase.func_70047_e() - (l.p.l.t.B.ALLATORIxDEMO.field_71439_g.field_70163_u + (double)l.p.l.t.B.ALLATORIxDEMO.field_71439_g.func_70047_e());
            d3 = d5;
            d2 = d5;
        } else {
            d4 = (a22.func_174813_aQ().field_72338_b + a22.func_174813_aQ().field_72337_e) / 2.0 - (l.p.l.t.B.ALLATORIxDEMO.field_71439_g.field_70163_u + (double)l.p.l.t.B.ALLATORIxDEMO.field_71439_g.func_70047_e());
            d3 = d5;
            d2 = d5;
        }
        double d7 = MathHelper.func_76133_a((double)(d3 * d2 + d6 * d6));
        float a22 = (float)(MathHelper.func_181159_b((double)d6, (double)d5) * 57.29577951308232) - 90.0f;
        float f2 = (float)(-(MathHelper.func_181159_b((double)d4, (double)d7) * 57.29577951308232));
        return new float[]{a22, f2};
    }

    @Override
    public void B() {
        B a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        a2.ALLATORIxDEMO = null;
    }

    public B() {
        super("MobAura", "", I.B);
        B a2;
    }

    @Override
    public void b() {
        B a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
        a2.ALLATORIxDEMO = null;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        B a3;
        if (a2.phase == TickEvent.Phase.START) {
            for (Entity entity : l.p.l.t.B.ALLATORIxDEMO.field_71441_e.field_72996_f) {
                if (!(entity instanceof EntityLiving) || entity == l.p.l.t.B.ALLATORIxDEMO.field_71439_g || !(l.p.l.t.B.ALLATORIxDEMO.field_71439_g.func_70032_d(entity) <= 3.0f)) continue;
                a3.ALLATORIxDEMO = entity;
            }
        }
        if (a3.ALLATORIxDEMO != null && l.p.l.t.B.ALLATORIxDEMO.field_71439_g.func_184825_o(0.0f) == 1.0f && a2.phase == TickEvent.Phase.END && !a3.ALLATORIxDEMO.field_70128_L) {
            Object object = a3.ALLATORIxDEMO(a3.ALLATORIxDEMO);
            l.p.l.t.B.ALLATORIxDEMO.field_71439_g.field_70177_z = (float)object[0];
            ALLATORIxDEMO.func_147114_u().func_147297_a((Packet)new CPacketUseEntity(a3.ALLATORIxDEMO));
            l.p.l.t.B.ALLATORIxDEMO.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
            a3.ALLATORIxDEMO = null;
            l.p.l.t.B.ALLATORIxDEMO.field_71439_g.func_184821_cY();
        }
    }
}

