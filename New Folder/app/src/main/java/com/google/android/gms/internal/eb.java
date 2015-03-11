// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            el, ig, hg, hh, 
//            id

public final class eb extends el
{

    private String a;
    private Context b;
    private String c;
    private ArrayList d;

    public eb(String s, ArrayList arraylist, Context context, String s1)
    {
        c = s;
        d = arraylist;
        a = s1;
        b = context;
    }

    private void b()
    {
        try
        {
            Class class1 = b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter");
            Class aclass[] = new Class[4];
            aclass[0] = android/content/Context;
            aclass[1] = java/lang/String;
            aclass[2] = java/lang/String;
            aclass[3] = Boolean.TYPE;
            Method method = class1.getDeclaredMethod("reportWithProductId", aclass);
            Object aobj[] = new Object[4];
            aobj[0] = b;
            aobj[1] = c;
            aobj[2] = "";
            aobj[3] = Boolean.valueOf(true);
            method.invoke(null, aobj);
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            ig.e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            ig.e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
            return;
        }
        catch (Exception exception)
        {
            ig.c("Fail to report a conversion.", exception);
        }
    }

    protected int a(int i)
    {
        if (i == 0)
        {
            return 1;
        }
        if (i == 1)
        {
            return 2;
        }
        return i != 4 ? 0 : 3;
    }

    public String a()
    {
        return c;
    }

    protected String a(String s, HashMap hashmap)
    {
        String s1 = b.getPackageName();
        String s12 = b.getPackageManager().getPackageInfo(s1, 0).versionName;
        String s2 = s12;
_L2:
        long l;
        l = SystemClock.elapsedRealtime() - hg.d().a();
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext();)
        {
            String s10 = (String)iterator.next();
            String s11 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
                s10
            });
            Object aobj4[] = new Object[1];
            aobj4[0] = hashmap.get(s10);
            s = s.replaceAll(s11, String.format("$1%s$2", aobj4));
        }

        break; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        ig.c("Error to retrieve app version", namenotfoundexception);
        s2 = "";
        if (true) goto _L2; else goto _L1
_L1:
        String s3 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "sessionid"
        });
        Object aobj[] = new Object[1];
        aobj[0] = hg.a;
        String s4 = s.replaceAll(s3, String.format("$1%s$2", aobj)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "appid"
        }), String.format("$1%s$2", new Object[] {
            s1
        }));
        String s5 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "osversion"
        });
        Object aobj1[] = new Object[1];
        aobj1[0] = String.valueOf(android.os.Build.VERSION.SDK_INT);
        String s6 = s4.replaceAll(s5, String.format("$1%s$2", aobj1));
        String s7 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "sdkversion"
        });
        Object aobj2[] = new Object[1];
        aobj2[0] = a;
        String s8 = s6.replaceAll(s7, String.format("$1%s$2", aobj2)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "appversion"
        }), String.format("$1%s$2", new Object[] {
            s2
        }));
        String s9 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "timestamp"
        });
        Object aobj3[] = new Object[1];
        aobj3[0] = String.valueOf(l);
        return s8.replaceAll(s9, String.format("$1%s$2", aobj3)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "[^@]+"
        }), String.format("$1%s$2", new Object[] {
            ""
        })).replaceAll("@@", "@");
    }

    public void b(int i)
    {
        if (i == 1)
        {
            b();
        }
        HashMap hashmap = new HashMap();
        hashmap.put("status", String.valueOf(i));
        hashmap.put("sku", c);
        String s;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); (new id(b, a, a(s, hashmap))).e())
        {
            s = (String)iterator.next();
        }

    }

    public void c(int i)
    {
        if (i == 0)
        {
            b();
        }
        HashMap hashmap = new HashMap();
        hashmap.put("google_play_status", String.valueOf(i));
        hashmap.put("sku", c);
        hashmap.put("status", String.valueOf(a(i)));
        String s;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); (new id(b, a, a(s, hashmap))).e())
        {
            s = (String)iterator.next();
        }

    }
}
