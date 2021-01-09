/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package l.p.l.t;

import l.p.l.H;
import l.p.l.I;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class e
extends H {
    public e() {
        super("AntiBot", "", I.B);
        e a2;
    }

    @SubscribeEvent
    public void b(TickEvent.ClientTickEvent a2) {
        e a3;
        if (a3.b()) {
            return;
        }
        for (Entity entity : e.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            if (!(entity instanceof EntityPlayer) || !entity.func_82150_aj()) continue;
            e.ALLATORIxDEMO.field_71441_e.func_72900_e(entity);
            e.ALLATORIxDEMO.field_71439_g.func_146105_b((ITextComponent)new TextComponentString(new StringBuilder().insert(0, "\u0412\u00a76Bot\u0412\u00a74 ").append(entity.func_70005_c_()).append(" \u0412\u00a76successfuly deleted! \u0412\u00a7r").toString()), false);
        }
    }
}

