// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            ld, lb, kv

final class lc
{

    final lb a;
    private final String b;
    private final ld c = new ld(this);
    private final HashSet d = new HashSet();
    private int e;
    private boolean f;
    private IBinder g;
    private ComponentName h;

    public lc(lb lb, String s)
    {
        a = lb;
        super();
        b = s;
        e = 0;
    }

    static int a(lc lc1, int i)
    {
        lc1.e = i;
        return i;
    }

    static ComponentName a(lc lc1, ComponentName componentname)
    {
        lc1.h = componentname;
        return componentname;
    }

    static IBinder a(lc lc1, IBinder ibinder)
    {
        lc1.g = ibinder;
        return ibinder;
    }

    static HashSet a(lc lc1)
    {
        return lc1.d;
    }

    public ld a()
    {
        return c;
    }

    public void a(kv kv)
    {
        d.add(kv);
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public String b()
    {
        return b;
    }

    public void b(kv kv)
    {
        d.remove(kv);
    }

    public boolean c()
    {
        return f;
    }

    public boolean c(kv kv)
    {
        return d.contains(kv);
    }

    public int d()
    {
        return e;
    }

    public boolean e()
    {
        return d.isEmpty();
    }

    public IBinder f()
    {
        return g;
    }

    public ComponentName g()
    {
        return h;
    }
}
