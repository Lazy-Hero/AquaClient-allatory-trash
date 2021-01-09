/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.p;

import java.awt.Color;
import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class E
extends H {
    @Override
    public String b() {
        return "Show all players around you.";
    }

    public E() {
        super("PlayerRadar", "", I.i);
        E a2;
    }

    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(RenderGameOverlayEvent.Text a2) {
        E a3;
        int n = 25;
        ScaledResolution scaledResolution = new ScaledResolution(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO());
        for (Object object : E.ALLATORIxDEMO.field_71441_e.func_72910_y()) {
            if (!(object instanceof EntityPlayer)) continue;
            object = (EntityPlayer)object;
            int n2 = (int)l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_70032_d(object);
            float f2 = object.func_110143_aJ();
            String string = new StringBuilder().insert(0, " \u00a72[").append(f2).append("] ").toString();
            string = (double)f2 >= 12.0 ? new StringBuilder().insert(0, " \u00a72[").append(f2).append("] ").toString() : ((double)f2 >= 4.0 ? new StringBuilder().insert(0, " \u00a76[").append(f2).append("] ").toString() : new StringBuilder().insert(0, " \u00a74[").append(f2).append("] ").toString());
            object = object.func_146103_bH().getName();
            object = new StringBuilder().insert(0, (String)object).append(string).append("\u00a77[").append(n2).append("]").toString();
            n2 = new Color(200, 30, 100).getRGB();
            l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_78276_b(object, 1, n, n2);
            n += 12;
        }
        super.ALLATORIxDEMO(a2);
    }
}

