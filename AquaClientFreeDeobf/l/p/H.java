/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  org.lwjgl.input.Keyboard
 */
package l.p;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import l.p.l.i;
import l.p.t.m;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class H {
    public l.p.d.H J;
    public static H g;
    public l.p.p.H c;
    public static final String j;
    public static int B;
    public static String h;
    public boolean i = false;
    public i ALLATORIxDEMO;

    public H() {
        H a2;
    }

    @SubscribeEvent
    public void ALLATORIxDEMO(InputEvent.KeyInputEvent a22) {
        if (Minecraft.func_71410_x().field_71441_e == null || Minecraft.func_71410_x().field_71439_g == null) {
            return;
        }
        try {
            if (Keyboard.isCreated() && Keyboard.getEventKeyState()) {
                H a3;
                int a22 = Keyboard.getEventKey();
                if (a22 <= 0) {
                    return;
                }
                for (l.p.l.H h : a3.ALLATORIxDEMO.ALLATORIxDEMO) {
                    if (h.ALLATORIxDEMO() != a22) continue;
                    h.ALLATORIxDEMO();
                }
            }
        }
        catch (Exception a22) {
            a22.printStackTrace();
        }
    }

    public static List<String> ALLATORIxDEMO(String a2) throws Exception {
        String string;
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = new URL(a2).openConnection();
        object = new BufferedReader(new InputStreamReader(((URLConnection)object).getInputStream()));
        while ((string = ((BufferedReader)object).readLine()) != null) {
            arrayList.add(string);
        }
        ((BufferedReader)object).close();
        return arrayList;
    }

    static {
        j = null;
        h = H.ALLATORIxDEMO(new StringBuilder().insert(0, String.valueOf(H.b("C"))).append(H.ALLATORIxDEMO()).toString());
        B = -1;
    }

    public void ALLATORIxDEMO() {
        H a2;
        if (Minecraft.func_71410_x().field_71462_r != null && Minecraft.func_71410_x().field_71439_g != null) {
            Minecraft.func_71410_x().field_71439_g.func_71053_j();
        }
        a2.i = true;
        MinecraftForge.EVENT_BUS.unregister((Object)a2);
        for (int i2 = 0; i2 < a2.ALLATORIxDEMO.ALLATORIxDEMO.size(); ++i2) {
            l.p.l.H h = a2.ALLATORIxDEMO.ALLATORIxDEMO.get(i2);
            h.B();
            MinecraftForge.EVENT_BUS.unregister((Object)h);
            a2.ALLATORIxDEMO.ALLATORIxDEMO().remove(h);
        }
        a2.ALLATORIxDEMO = null;
        a2.J = null;
    }

    public static boolean ALLATORIxDEMO() {
        block3: {
            try {
                if (Minecraft.class.getDeclaredField("instance") == null) break block3;
                return true;
            }
            catch (Exception exception) {
                return true;
            }
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public static String b(String a) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl57 : IFNULL - null : trying to set 0 previously set to 1
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:203)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1542)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:400)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public static String ALLATORIxDEMO() {
        NetworkInterface networkInterface = null;
        try {
            networkInterface = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
        }
        catch (SocketException socketException) {
        }
        catch (UnknownHostException unknownHostException) {
            // empty catch block
        }
        byte[] arrby = null;
        try {
            arrby = networkInterface.getHardwareAddress();
        }
        catch (SocketException socketException) {
            // empty catch block
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            stringBuilder.append(String.format(m.b((String)"\u001d\u0016\n~\u001dU"), arrby[i2], i2 < arrby.length - 1 ? l.p.l.i.b((String)">") : ""));
        }
        return stringBuilder.toString();
    }

    public void b() {
        H a2;
        if (!a2.b()) {
            Minecraft.func_71410_x().func_71400_g();
        }
        MinecraftForge.EVENT_BUS.register((Object)a2);
        a2.c = new l.p.p.H();
        a2.ALLATORIxDEMO = new i();
        a2.J = new l.p.d.H();
    }

    public boolean b() {
        try {
            String string = H.ALLATORIxDEMO(new StringBuilder().insert(0, "http://cd70465.tmweb.ru/StressHwid.php?hwid=").append(h).toString()).get(0);
            if (string.equals("1")) {
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return true;
    }

    public static String ALLATORIxDEMO(String a2) {
        Object object;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            object = messageDigest.digest(a2.getBytes());
            object = new BigInteger(1, (byte[])object).toString(16);
            while (((String)object).length() < 32) {
                object = new StringBuilder().insert(0, "0").append((String)object).toString();
            }
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
        return object;
    }
}

