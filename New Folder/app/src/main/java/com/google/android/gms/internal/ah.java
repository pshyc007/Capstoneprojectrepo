// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            if, aj

public final class ah
{

    public static final String a = com.google.android.gms.internal.if.a("emulator");
    private final Date b;
    private final String c;
    private final int d;
    private final Set e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map i;
    private final String j;
    private final SearchAdRequest k;
    private final int l;
    private final Set m;

    public ah(aj aj1)
    {
        this(aj1, null);
    }

    public ah(aj aj1, SearchAdRequest searchadrequest)
    {
        b = aj.a(aj1);
        c = aj.b(aj1);
        d = aj.c(aj1);
        e = Collections.unmodifiableSet(aj.d(aj1));
        f = aj.e(aj1);
        g = aj.f(aj1);
        h = aj.g(aj1);
        i = Collections.unmodifiableMap(aj.h(aj1));
        j = aj.i(aj1);
        k = searchadrequest;
        l = aj.j(aj1);
        m = Collections.unmodifiableSet(aj.k(aj1));
    }

    public NetworkExtras a(Class class1)
    {
        return (NetworkExtras)i.get(class1);
    }

    public Date a()
    {
        return b;
    }

    public boolean a(Context context)
    {
        return m.contains(com.google.android.gms.internal.if.a(context));
    }

    public Bundle b(Class class1)
    {
        return h.getBundle(class1.getName());
    }

    public String b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public Bundle c(Class class1)
    {
        Bundle bundle = h.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null)
        {
            return bundle.getBundle(class1.getClass().getName());
        } else
        {
            return null;
        }
    }

    public Set d()
    {
        return e;
    }

    public Location e()
    {
        return f;
    }

    public boolean f()
    {
        return g;
    }

    public String g()
    {
        return j;
    }

    public SearchAdRequest h()
    {
        return k;
    }

    public Map i()
    {
        return i;
    }

    public Bundle j()
    {
        return h;
    }

    public int k()
    {
        return l;
    }

}
