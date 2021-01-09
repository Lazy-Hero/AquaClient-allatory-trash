/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 */
package l.p.l;

import l.p.l.I;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class H {
    protected static Minecraft ALLATORIxDEMO = Minecraft.func_71410_x();
    private String h;
    private String B;
    public boolean g = true;
    private I c;
    private int J;
    private boolean i;

    public String b() {
        H a2;
        return a2.B;
    }

    public void ALLATORIxDEMO(TickEvent.PlayerTickEvent a2) {
    }

    public void ALLATORIxDEMO(boolean a2) {
        H a3;
        a3.i = a2;
        if (a3.i) {
            a3.b();
            return;
        }
        a3.B();
    }

    public void ALLATORIxDEMO(int a2) {
        a.J = a2;
    }

    public String ALLATORIxDEMO() {
        H a2;
        return a2.h;
    }

    public boolean ALLATORIxDEMO() {
        H a2;
        return a2.i;
    }

    public boolean ALLATORIxDEMO(String a2) {
        return false;
    }

    public void ALLATORIxDEMO() {
        H a2;
        boolean bl = a2.i = !a2.i;
        if (a2.i) {
            a2.b();
            return;
        }
        a2.B();
    }

    public void ALLATORIxDEMO(TickEvent.ClientTickEvent a2) {
    }

    public void ALLATORIxDEMO(RenderWorldLastEvent a2) {
    }

    public void E() {
    }

    public void ALLATORIxDEMO(RenderGameOverlayEvent.Text a2) {
    }

    public boolean b() {
        return H.ALLATORIxDEMO.field_71439_g == null || H.ALLATORIxDEMO.field_71441_e == null;
    }

    public I ALLATORIxDEMO() {
        H a2;
        return a2.c;
    }

    public H(String a2, String a3, I a4) {
        H a5;
        a5.h = a2;
        a5.B = a3;
        a5.J = 0;
        a5.c = a4;
        a5.i = false;
    }

    public void ALLATORIxDEMO(String a2) {
        a.B = a2;
    }

    public void b(boolean a2) {
        a.i = a2;
    }

    public void b() {
        H a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
    }

    public int ALLATORIxDEMO() {
        H a2;
        return a2.J;
    }

    public void B() {
        H a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
    }
}

