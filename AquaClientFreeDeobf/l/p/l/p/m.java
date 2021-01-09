/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package l.p.l.p;

import java.util.Iterator;
import l.p.l.H;
import l.p.l.I;
import l.p.p.i;
import l.p.t.B;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class m
extends H {
    @Override
    @SubscribeEvent
    public void ALLATORIxDEMO(RenderGameOverlayEvent.Text a2) {
        a2 = new ScaledResolution(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO());
        RenderItem renderItem = l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_175599_af();
        GlStateManager.func_179094_E();
        GlStateManager.func_179098_w();
        int n = a2.func_78326_a() - a2.func_78326_a() + 50;
        int n2 = 2;
        int n3 = a2.func_78328_b() - 40 - (l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_70090_H() ? 10 : 0);
        int n4 = 0;
        Iterator iterator = l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_70460_b.iterator();
        while (iterator.hasNext()) {
            m a3;
            ++n2;
            ItemStack itemStack = (ItemStack)iterator.next();
            if (itemStack.func_190926_b()) continue;
            int n5 = n - 70 + (11 - n2);
            GlStateManager.func_179126_j();
            renderItem.func_180450_b(itemStack, n5 + (n4 += 20), n3);
            renderItem.func_180453_a(l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO(), itemStack, n5 + n4, n3, "");
            GlStateManager.func_179098_w();
            GlStateManager.func_179140_f();
            GlStateManager.func_179097_i();
            String string = itemStack.func_190916_E() > 5 ? itemStack.func_190916_E() + "" : "";
            l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_175063_a(string, (float)(n5 + 19 - 2 - l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_78256_a(string) + n4), (float)(n3 + 9), 0xFFFFFF);
            if (l.p.H.g.c.ALLATORIxDEMO(a3, "Damage").E()) {
                float f2 = ((float)itemStack.func_77958_k() - (float)itemStack.func_77952_i()) / (float)itemStack.func_77958_k();
                f2 = 1.0f - f2;
                int n6 = 100 - (int)(f2 * 100.0f);
                l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_175063_a(n6 + "", (float)(n5 + 8 - l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().func_78256_a(n6 + "") / 2 + n4), (float)(n3 - 11), l.p.H.B);
            }
            GlStateManager.func_179126_j();
            GlStateManager.func_179140_f();
        }
        GlStateManager.func_179126_j();
        GlStateManager.func_179140_f();
        GlStateManager.func_179121_F();
    }

    int ALLATORIxDEMO(Item a2) {
        return l.p.t.H.ALLATORIxDEMO.ALLATORIxDEMO().field_184439_c.stream().filter(a3 -> a3.func_77973_b() == a2).mapToInt(ItemStack::func_190916_E).sum();
    }

    public m() {
        super("ArmorHUD", "", I.c);
        m a2;
        l.p.H.g.c.ALLATORIxDEMO(new i("Damage", a2, true));
        l.p.H.B = B.ALLATORIxDEMO(30000, 0);
    }
}

