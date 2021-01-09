/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.l;

import l.p.l.H;
import l.p.l.I;
import l.p.t.j;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class A
extends H {
    public A() {
        super("FastLadder", "", I.i);
        A a2;
    }

    @Override
    public void b() {
        A a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
    }

    @Override
    public void B() {
        A a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        a2 = A.ALLATORIxDEMO.field_71439_g;
        if (!a2.func_70617_f_() || !j.b((Entity)a2)) {
            return;
        }
        if (a2.field_71158_b.field_192832_b == 0.0f && a2.field_71158_b.field_78902_a == 0.0f) {
            return;
        }
        if (a2.field_70181_x < 0.2) {
            a2.field_70181_x = 0.2;
        }
    }
}

