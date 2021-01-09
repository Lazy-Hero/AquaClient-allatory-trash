/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l.t;

import java.awt.Color;
import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class L
extends H {
    EntityPlayer ALLATORIxDEMO;

    @SubscribeEvent
    public void b(RenderGameOverlayEvent.Text a22) {
        L a3;
        int a22 = l.p.H.B;
        float f2 = 4.5f;
        if (a3.ALLATORIxDEMO == null) {
            return;
        }
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.func_71410_x());
        int n = scaledResolution.func_78326_a();
        int n2 = scaledResolution.func_78328_b();
        Gui.func_73734_a((int)(n / 2 - 50), (int)(n2 - 70), (int)(n / 2 + 50), (int)(n2 - 110), (int)new Color(34, 34, 34, 150).getRGB());
        L.ALLATORIxDEMO.field_71466_p.func_175063_a(a3.ALLATORIxDEMO.func_146103_bH().getName(), (float)(n / 2 - 45), (float)(n2 / 2 + 140), -1);
        L.ALLATORIxDEMO.field_71466_p.func_175063_a((int)a3.ALLATORIxDEMO.func_110143_aJ() + "", (float)(n / 2 - 45), (float)(n2 / 2 + 155), 558252);
        if (a3.ALLATORIxDEMO.func_110143_aJ() == 20.0f) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 24) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 23) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 22) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 21) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 25) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 26) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 27) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 28) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 29) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 30) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 31) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 32) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 33) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 34) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 35) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 36) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)(n / 2 + 45), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 19) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 18) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 17) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 16) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 15) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 14) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 13) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 12) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 11) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 10) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 9) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 8) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 7) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 6) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 5) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 4) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 3) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 2) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
        if ((int)a3.ALLATORIxDEMO.func_110143_aJ() == 1) {
            Gui.func_73734_a((int)(n / 2 - 45), (int)(n2 / 2 + 175), (int)((int)((float)(n / 2) + (45.0f - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2 - f2))), (int)(n2 / 2 + 167), (int)a22);
        }
    }

    public L() {
        super("TargetHud", "", I.B);
        L a2;
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        L a3;
        if (a3.b()) {
            return;
        }
        a3.ALLATORIxDEMO = (EntityPlayer)L.ALLATORIxDEMO.field_71439_g.func_110144_aD();
    }
}

