/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ClickType
 *  net.minecraftforge.client.event.RenderGameOverlayEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import java.awt.Color;
import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class A
extends H {
    public A() {
        super("AutoTotem", "RENDER BY GAMEV", I.B);
        A a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Counter", a2, true));
    }

    public int B() {
        for (int i2 = 0; i2 < 45; ++i2) {
            if (A.ALLATORIxDEMO.field_71439_g.field_71069_bz.func_75139_a(i2).func_75211_c().func_77973_b() != Items.field_190929_cY) continue;
            return i2;
        }
        return -1;
    }

    @SubscribeEvent
    public void ALLATORIxDEMO(RenderGameOverlayEvent a22) {
        A a3;
        if (a22.getType() != RenderGameOverlayEvent.ElementType.TEXT || !l.p.H.g.c.ALLATORIxDEMO(a3, "Counter").E()) {
            return;
        }
        ScaledResolution scaledResolution = new ScaledResolution(ALLATORIxDEMO);
        int a22 = scaledResolution.func_78326_a() / 2 + 2;
        int n = scaledResolution.func_78328_b() / 2 + 2;
        A.ALLATORIxDEMO.field_71466_p.func_175063_a(String.valueOf(a3.b()), (float)a22, (float)n, new Color(255, 255, 255).getRGB());
    }

    public int b() {
        int n = 0;
        for (int i2 = 0; i2 < 45; ++i2) {
            if (A.ALLATORIxDEMO.field_71439_g.field_71069_bz.func_75139_a(i2).func_75211_c().func_77973_b() != Items.field_190929_cY) continue;
            ++n;
        }
        if (A.ALLATORIxDEMO.field_71439_g.func_184592_cb().func_77973_b() == Items.field_190929_cY) {
            ++n;
        }
        return n;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        A a3;
        if (a3.b()) {
            return;
        }
        if (A.ALLATORIxDEMO.field_71439_g.func_184592_cb().func_77973_b() != Items.field_190929_cY && a3.B() != -1) {
            A.ALLATORIxDEMO.field_71442_b.func_187098_a(0, a3.B(), 1, ClickType.PICKUP, (EntityPlayer)A.ALLATORIxDEMO.field_71439_g);
            A.ALLATORIxDEMO.field_71442_b.func_187098_a(0, 45, 1, ClickType.PICKUP, (EntityPlayer)A.ALLATORIxDEMO.field_71439_g);
        }
    }
}

