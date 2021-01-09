/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import l.p.l.H;
import l.p.l.I;
import l.p.t.M;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class i
extends H {
    private transient long ALLATORIxDEMO;

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        Boolean bl;
        Boolean bl2;
        Boolean bl3;
        double d2;
        block21: {
            block20: {
                block19: {
                    i a3;
                    block18: {
                        d2 = l.p.H.g.c.ALLATORIxDEMO(a3, "range").B();
                        a2 = l.p.H.g.c.ALLATORIxDEMO(a3, "useCooldown").E();
                        bl3 = l.p.H.g.c.ALLATORIxDEMO(a3, "attackPlayers").E();
                        bl2 = l.p.H.g.c.ALLATORIxDEMO(a3, "attackMobs").E();
                        bl = l.p.H.g.c.ALLATORIxDEMO(a3, "attackAnimals").E();
                        if (!((Boolean)a2).booleanValue()) break block18;
                        if (Minecraft.func_71410_x().field_71439_g.func_184825_o(0.0f) < 1.0f) {
                            return;
                        }
                        break block19;
                    }
                    if ((double)(System.currentTimeMillis() - a3.ALLATORIxDEMO) < 142.85714285714286) break block20;
                }
                if (Minecraft.func_71410_x().field_71476_x != null) break block21;
            }
            return;
        }
        a2 = Minecraft.func_71410_x().field_71476_x.field_72308_g;
        if (a2 == null) {
            return;
        }
        if ((double)Minecraft.func_71410_x().field_71439_g.func_70032_d((Entity)a2) > d2) {
            return;
        }
        if (a2 instanceof EntityLivingBase && (((Entity)a2).field_70128_L || ((EntityLivingBase)a2).func_110143_aJ() < 0.0f)) {
            return;
        }
        if (a2 instanceof EntityPlayer) {
            if (!bl3.booleanValue()) {
                return;
            }
            d2 = (((Entity)a2).field_70177_z + 180.0f) % 360.0f;
            double d3 = Minecraft.func_71410_x().field_71439_g.field_70177_z % 360.0f;
            if (d2 < 0.0) {
                d2 += 360.0;
            }
            if (d3 < 0.0) {
                d3 += 360.0;
            }
            if (a2 instanceof EntityMob) {
                if (!bl2.booleanValue()) {
                    return;
                }
            } else if (M.ALLATORIxDEMO((Entity)a2)) {
                if (!bl.booleanValue()) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public i() {
        super("Trigger Bot", "Automatically attacks the entity you're looking at", I.B);
        i a2;
        l.p.H.g.c.ALLATORIxDEMO(new l.p.p.i("range", a2, 3.2, 3.0, 5.0, false));
        l.p.H.g.c.ALLATORIxDEMO(new l.p.p.i("useCooldown", a2, true));
        l.p.H.g.c.ALLATORIxDEMO(new l.p.p.i("attackPlayers", a2, true));
        l.p.H.g.c.ALLATORIxDEMO(new l.p.p.i("attackMobs", a2, true));
        l.p.H.g.c.ALLATORIxDEMO(new l.p.p.i("attackAnimals", a2, false));
        l.p.H.g.c.ALLATORIxDEMO(new l.p.p.i("attackInvisibleEntities", a2, true));
    }

    @Override
    public void B() {
        i a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
    }

    @Override
    public void b() {
        i a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
        a2.ALLATORIxDEMO = System.currentTimeMillis();
    }
}

