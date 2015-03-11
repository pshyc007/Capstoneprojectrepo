// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class aj
{

    private final HashSet a = new HashSet();
    private final Bundle b = new Bundle();
    private final HashMap c = new HashMap();
    private final HashSet d = new HashSet();
    private Date e;
    private String f;
    private int g;
    private Location h;
    private boolean i;
    private String j;
    private int k;

    public aj()
    {
        g = -1;
        i = false;
        k = -1;
    }

    static Date a(aj aj1)
    {
        return aj1.e;
    }

    static String b(aj aj1)
    {
        return aj1.f;
    }

    static int c(aj aj1)
    {
        return aj1.g;
    }

    static HashSet d(aj aj1)
    {
        return aj1.a;
    }

    static Location e(aj aj1)
    {
        return aj1.h;
    }

    static boolean f(aj aj1)
    {
        return aj1.i;
    }

    static Bundle g(aj aj1)
    {
        return aj1.b;
    }

    static HashMap h(aj aj1)
    {
        return aj1.c;
    }

    static String i(aj aj1)
    {
        return aj1.j;
    }

    static int j(aj aj1)
    {
        return aj1.k;
    }

    static HashSet k(aj aj1)
    {
        return aj1.d;
    }

    public void a(int l)
    {
        g = l;
    }

    public void a(Location location)
    {
        h = location;
    }

    public void a(NetworkExtras networkextras)
    {
        if (networkextras instanceof AdMobExtras)
        {
            a(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
            return;
        } else
        {
            c.put(networkextras.getClass(), networkextras);
            return;
        }
    }

    public void a(Class class1, Bundle bundle)
    {
        b.putBundle(class1.getName(), bundle);
    }

    public void a(String s)
    {
        a.add(s);
    }

    public void a(Date date)
    {
        e = date;
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public void b(Class class1, Bundle bundle)
    {
        if (b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
        {
            b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
    }

    public void b(String s)
    {
        d.add(s);
    }

    public void b(boolean flag)
    {
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k = l;
    }

    public void c(String s)
    {
        f = s;
    }

    public void d(String s)
    {
        j = s;
    }
}
