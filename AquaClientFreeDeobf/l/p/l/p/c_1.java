/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package l.p.l.p;

import java.awt.Color;
import l.p.l.H;
import l.p.l.I;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class c
extends H {
    public static Color ALLATORIxDEMO(long a2, float a32, int a4) {
        long l2 = Long.parseLong(Integer.toHexString(Color.HSBtoRGB((float)(System.nanoTime() + a2 * (long)a4) / 1.0E10f % 1.0f, a32, 1.0f)), 16);
        Color a32 = new Color((int)l2);
        return new Color((float)a32.getRed() / 255.0f, (float)a32.getGreen() / 255.0f, (float)a32.getBlue() / 255.0f, (float)a32.getAlpha() / 255.0f);
    }

    @SubscribeEvent
    public void b(RenderGameOverlayEvent.Text a2) {
        a2 = new ScaledResolution(Minecraft.func_71410_x());
        GL11.glPushMatrix();
        GL11.glScalef((float)1.2f, (float)1.2f, (float)1.0f);
        c.ALLATORIxDEMO("AquaClient Free", 2, 2);
        GL11.glPopMatrix();
        c.ALLATORIxDEMO(new StringBuilder().insert(0, "Fps:").append(Minecraft.func_175610_ah()).toString(), 2, 15);
        Gui.func_73734_a((int)1, (int)(a2.func_78328_b() - c.ALLATORIxDEMO.field_71466_p.field_78288_b - 1), (int)(c.ALLATORIxDEMO.field_71466_p.func_78256_a(c.ALLATORIxDEMO.field_71439_g.func_180425_c().toString().replace("BlockPos", "")) + 1), (int)a2.func_78328_b(), (int)new Color(0, 0, 0, 100).getRGB());
        c.ALLATORIxDEMO(c.ALLATORIxDEMO.field_71439_g.func_180425_c().toString().replace("7x\u0015i\u001fH\rP\u0015d\u001bf\u001fk", ""), 1, a2.func_78328_b() - c.ALLATORIxDEMO.field_71466_p.field_78288_b);
        int n = 1;
        try {
            for (H h : l.p.H.g.ALLATORIxDEMO.ALLATORIxDEMO()) {
                if (h.ALLATORIxDEMO().equalsIgnoreCase("HUD") || !h.ALLATORIxDEMO() || !h.g) continue;
                FontRenderer fontRenderer = Minecraft.func_71410_x().field_71466_p;
                Gui.func_73734_a((int)(a2.func_78326_a() - fontRenderer.func_78256_a(h.ALLATORIxDEMO()) - 2), (int)n, (int)a2.func_78326_a(), (int)(n + 9), (int)new Color(0, 0, 0, 100).getRGB());
                c.ALLATORIxDEMO(h.ALLATORIxDEMO(), a2.func_78326_a() - fontRenderer.func_78256_a(h.ALLATORIxDEMO()) - 1, n);
                n += fontRenderer.field_78288_b;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public c() {
        super("HUD", "", I.c);
        c a2;
        a2.ALLATORIxDEMO(true);
    }

    public static void ALLATORIxDEMO(String a2, int a3, int a4) {
        for (int i2 = 0; i2 < a2.length(); ++i2) {
            String string = a2.charAt(i2) + "";
            Minecraft.func_71410_x().field_71466_p.func_175063_a(string, (float)a3, (float)a4, c.ALLATORIxDEMO((long)i2 * 3500000L, 1.0f, 100).getRGB());
            a3 += Minecraft.func_71410_x().field_71466_p.func_78263_a(a2.charAt(i2));
        }
    }
}

