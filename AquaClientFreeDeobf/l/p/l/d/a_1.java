/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 *  org.lwjgl.input.Keyboard
 */
package l.p.l.d;

import l.p.l.H;
import l.p.l.I;
import l.p.t.m;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class a
extends H {
    @Override
    public void b() {
        a a2;
        MinecraftForge.EVENT_BUS.register((Object)a2);
        KeyBinding.func_74510_a((int)Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151463_i(), (boolean)GameSettings.func_100015_a((KeyBinding)Minecraft.func_71410_x().field_71474_y.field_74311_E));
    }

    @SubscribeEvent
    public void b(TickEvent.PlayerTickEvent a2) {
        if (Minecraft.func_71410_x().field_71439_g.field_70122_E && !Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151468_f() && !m.ALLATORIxDEMO(Minecraft.func_71410_x().field_71441_e.func_180495_p(new BlockPos(Minecraft.func_71410_x().field_71439_g.func_174791_d().func_178787_e(new Vec3d(0.0, -0.5, 0.0)))).func_177230_c())) {
            KeyBinding.func_74510_a((int)Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151463_i(), (boolean)true);
            return;
        }
        if (!Keyboard.isKeyDown((int)Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151463_i())) {
            KeyBinding.func_74510_a((int)Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151463_i(), (boolean)false);
        }
    }

    @Override
    public void B() {
        a a2;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        KeyBinding.func_74510_a((int)Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151463_i(), (boolean)GameSettings.func_100015_a((KeyBinding)Minecraft.func_71410_x().field_71474_y.field_74311_E));
    }

    public a() {
        super("Eagle", "Eagle Makes you sneak on edges", I.J);
        a a2;
    }
}

