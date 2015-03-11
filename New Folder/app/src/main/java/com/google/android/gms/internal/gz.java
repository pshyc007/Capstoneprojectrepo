// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            if, hq

public final class gz
{

    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f = com.google.android.gms.internal.if.a();
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final float q;
    public final int r;
    public final int s;
    public final double t;
    public final boolean u;
    public final boolean v;
    public final int w;

    public gz(Context context)
    {
        boolean flag = true;
        super();
        AudioManager audiomanager = (AudioManager)context.getSystemService("audio");
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        Locale locale = Locale.getDefault();
        PackageManager packagemanager = context.getPackageManager();
        TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
        Intent intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        a = audiomanager.getMode();
        boolean flag1;
        boolean flag2;
        if (a(packagemanager, "geo:0,0?q=donuts") != null)
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        b = flag1;
        if (a(packagemanager, "http://www.google.com") != null)
        {
            flag2 = flag;
        } else
        {
            flag2 = false;
        }
        c = flag2;
        d = telephonymanager.getNetworkOperator();
        e = locale.getCountry();
        g = audiomanager.isMusicActive();
        h = audiomanager.isSpeakerphoneOn();
        i = locale.getLanguage();
        j = a(packagemanager);
        k = audiomanager.getStreamVolume(3);
        l = a(context, connectivitymanager, packagemanager);
        m = telephonymanager.getNetworkType();
        n = telephonymanager.getPhoneType();
        o = audiomanager.getRingerMode();
        p = audiomanager.getStreamVolume(2);
        q = displaymetrics.density;
        r = displaymetrics.widthPixels;
        s = displaymetrics.heightPixels;
        if (intent != null)
        {
            int i1 = intent.getIntExtra("status", -1);
            int j1 = intent.getIntExtra("level", -1);
            int k1 = intent.getIntExtra("scale", -1);
            t = (float)j1 / (float)k1;
            if (i1 != 2 && i1 != 5)
            {
                flag = false;
            }
            u = flag;
        } else
        {
            t = -1D;
            u = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            v = connectivitymanager.isActiveNetworkMetered();
            if (connectivitymanager.getActiveNetworkInfo() != null)
            {
                w = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            } else
            {
                w = -1;
                return;
            }
        } else
        {
            v = false;
            w = -1;
            return;
        }
    }

    private static int a(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
    {
label0:
        {
            int i1 = -2;
            if (hq.a(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
            {
                NetworkInfo networkinfo = connectivitymanager.getActiveNetworkInfo();
                if (networkinfo == null)
                {
                    break label0;
                }
                i1 = networkinfo.getType();
            }
            return i1;
        }
        return -1;
    }

    private static ResolveInfo a(PackageManager packagemanager, String s1)
    {
        return packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)), 0x10000);
    }

    private static String a(PackageManager packagemanager)
    {
        ResolveInfo resolveinfo = a(packagemanager, "market://details?id=com.google.android.gms.ads");
        if (resolveinfo != null) goto _L2; else goto _L1
_L1:
        ActivityInfo activityinfo;
        return null;
_L2:
        if ((activityinfo = resolveinfo.activityInfo) == null) goto _L1; else goto _L3
_L3:
        PackageInfo packageinfo;
        String s1;
        try
        {
            packageinfo = packagemanager.getPackageInfo(activityinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return null;
        }
        if (packageinfo == null) goto _L1; else goto _L4
_L4:
        s1 = (new StringBuilder()).append(packageinfo.versionCode).append(".").append(activityinfo.packageName).toString();
        return s1;
    }
}
