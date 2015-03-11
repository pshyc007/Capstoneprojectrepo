// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.aj;

// Referenced classes of package com.google.android.gms.ads.search:
//            SearchAdRequest

public final class h
{

    private final aj a = new aj();
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private String j;
    private int k;
    private String l;
    private int m;
    private int n;
    private String o;

    static int a(h h1)
    {
        return h1.b;
    }

    static int b(b b1)
    {
        return b1.c;
    }

    static int c(c c1)
    {
        return c1.d;
    }

    static int d(d d1)
    {
        return d1.e;
    }

    static int e(e e1)
    {
        return e1.f;
    }

    static int f(f f1)
    {
        return f1.g;
    }

    static int g(g g1)
    {
        return g1.h;
    }

    static int h(h h1)
    {
        return h1.i;
    }

    static String i(i i1)
    {
        return i1.j;
    }

    static int j(j j1)
    {
        return j1.k;
    }

    static String k(k k1)
    {
        return k1.l;
    }

    static int l(l l1)
    {
        return l1.m;
    }

    static int m(m m1)
    {
        return m1.n;
    }

    static String n(n n1)
    {
        return n1.o;
    }

    static aj o(o o1)
    {
        return o1.a;
    }

    public a addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        a.b(class1, bundle);
        return this;
    }

    public a addNetworkExtras(NetworkExtras networkextras)
    {
        a.a(networkextras);
        return this;
    }

    public a addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        a.a(class1, bundle);
        return this;
    }

    public a addTestDevice(String s)
    {
        a.b(s);
        return this;
    }

    public SearchAdRequest build()
    {
        return new SearchAdRequest(this, null);
    }

    public a setAnchorTextColor(int i1)
    {
        b = i1;
        return this;
    }

    public b setBackgroundColor(int i1)
    {
        c = i1;
        d = Color.argb(0, 0, 0, 0);
        e = Color.argb(0, 0, 0, 0);
        return this;
    }

    public e setBackgroundGradient(int i1, int j1)
    {
        c = Color.argb(0, 0, 0, 0);
        d = j1;
        e = i1;
        return this;
    }

    public e setBorderColor(int i1)
    {
        f = i1;
        return this;
    }

    public f setBorderThickness(int i1)
    {
        g = i1;
        return this;
    }

    public g setBorderType(int i1)
    {
        h = i1;
        return this;
    }

    public h setCallButtonColor(int i1)
    {
        i = i1;
        return this;
    }

    public i setCustomChannels(String s)
    {
        j = s;
        return this;
    }

    public j setDescriptionTextColor(int i1)
    {
        k = i1;
        return this;
    }

    public k setFontFace(String s)
    {
        l = s;
        return this;
    }

    public l setHeaderTextColor(int i1)
    {
        m = i1;
        return this;
    }

    public m setHeaderTextSize(int i1)
    {
        n = i1;
        return this;
    }

    public n setLocation(Location location)
    {
        a.a(location);
        return this;
    }

    public a setQuery(String s)
    {
        o = s;
        return this;
    }

    public o tagForChildDirectedTreatment(boolean flag)
    {
        a.b(flag);
        return this;
    }

    public ()
    {
        h = 0;
    }
}
