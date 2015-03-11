// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            jr, du, ii, hq, 
//            im, fz

public class fy
    implements Runnable
{

    protected final ii a;
    protected boolean b;
    protected boolean c;
    private final Handler d;
    private final long e;
    private long f;
    private im g;
    private final int h;
    private final int i;

    public fy(im im1, ii ii1, int j, int k)
    {
        this(im1, ii1, j, k, 200L, 50L);
    }

    public fy(im im1, ii ii1, int j, int k, long l, long l1)
    {
        e = l;
        f = l1;
        d = new Handler(Looper.getMainLooper());
        a = ii1;
        g = im1;
        b = false;
        c = false;
        h = k;
        i = j;
    }

    static int a(fy fy1)
    {
        return fy1.i;
    }

    static int b(fy fy1)
    {
        return fy1.h;
    }

    static long c(fy fy1)
    {
        long l = fy1.f - 1L;
        fy1.f = l;
        return l;
    }

    static long d(fy fy1)
    {
        return fy1.f;
    }

    static im e(fy fy1)
    {
        return fy1.g;
    }

    static long f(fy fy1)
    {
        return fy1.e;
    }

    static Handler g(fy fy1)
    {
        return fy1.d;
    }

    public void a()
    {
        d.postDelayed(this, e);
    }

    public void a(du du1)
    {
        a(du1, new jr(this, a, du1.q));
    }

    public void a(du du1, jr jr1)
    {
        a.setWebViewClient(jr1);
        ii ii1 = a;
        String s;
        if (TextUtils.isEmpty(du1.b))
        {
            s = null;
        } else
        {
            s = hq.a(du1.b);
        }
        ii1.loadDataWithBaseURL(s, du1.c, "text/html", "UTF-8", null);
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean d()
    {
        return c;
    }

    public void run()
    {
        if (a == null || c())
        {
            g.a(a);
            return;
        } else
        {
            (new fz(this, a)).execute(new Void[0]);
            return;
        }
    }
}
