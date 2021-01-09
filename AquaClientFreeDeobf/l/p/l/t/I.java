/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import l.p.l.H;
import l.p.t.i;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class I
extends H {
    Entity ALLATORIxDEMO = null;
    public boolean i = false;

    public I() {
        super("Target", "", l.p.l.I.B);
        I a2;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        I a3;
        if (a3.b()) {
            return;
        }
        if (a2.phase == TickEvent.Phase.START) {
            for (Entity entity : I.ALLATORIxDEMO.field_71441_e.field_72996_f) {
                if (!(entity instanceof EntityPlayer) || entity == I.ALLATORIxDEMO.field_71439_g || !(I.ALLATORIxDEMO.field_71439_g.func_70032_d(entity) <= 3.4f)) continue;
                a3.ALLATORIxDEMO = entity;
            }
        }
        if (a3.ALLATORIxDEMO == null && !a3.i) {
            KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74366_z.func_151463_i(), (boolean)false);
            KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74351_w.func_151463_i(), (boolean)false);
            KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74314_A.func_151463_i(), (boolean)false);
            a3.i = true;
        }
        if (a3.ALLATORIxDEMO != null && I.ALLATORIxDEMO.field_71439_g.func_184825_o(0.0f) == 1.0f && a2.phase == TickEvent.Phase.END && !a3.ALLATORIxDEMO.field_70128_L) {
            KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74366_z.func_151463_i(), (boolean)true);
            KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74351_w.func_151463_i(), (boolean)true);
            KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74314_A.func_151463_i(), (boolean)true);
            Object object = l.p.t.i.ALLATORIxDEMO(a3.ALLATORIxDEMO);
            I.ALLATORIxDEMO.field_71439_g.field_70177_z = (float)object[0];
            I.ALLATORIxDEMO.field_71439_g.field_70125_A = (float)object[1];
            a3.ALLATORIxDEMO = null;
        }
    }

    @Override
    public void B() {
        I a2;
        KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74366_z.func_151463_i(), (boolean)false);
        KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74351_w.func_151463_i(), (boolean)false);
        KeyBinding.func_74510_a((int)I.ALLATORIxDEMO.field_71474_y.field_74314_A.func_151463_i(), (boolean)false);
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        a2.ALLATORIxDEMO = null;
    }

    @Override
    public void b() {
        I a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
        a2.ALLATORIxDEMO = null;
    }
}

