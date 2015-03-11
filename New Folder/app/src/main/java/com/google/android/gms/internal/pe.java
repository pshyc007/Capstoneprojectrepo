// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            pg, if, pf, ig, 
//            ai, ox

public final class pe
{

    private final pg a;
    private final Runnable b;
    private ai c;
    private boolean d;
    private boolean e;
    private long f;

    public pe(ox ox)
    {
        this(ox, new pg(if.a));
    }

    pe(ox ox, pg pg1)
    {
        d = false;
        e = false;
        f = 0L;
        a = pg1;
        b = new pf(this, ox);
    }

    static ai a(pe pe1)
    {
        return pe1.c;
    }

    static boolean a(pe pe1, boolean flag)
    {
        pe1.d = flag;
        return flag;
    }

    public void a()
    {
        d = false;
        a.a(b);
    }

    public void a(ai ai)
    {
        a(ai, 60000L);
    }

    public void a(ai ai, long l)
    {
        if (d)
        {
            ig.e("An ad refresh is already scheduled.");
        } else
        {
            c = ai;
            d = true;
            f = l;
            if (!e)
            {
                ig.c((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                a.a(b, l);
                return;
            }
        }
    }

    public void b()
    {
        e = true;
        if (d)
        {
            a.a(b);
        }
    }

    public void c()
    {
        e = false;
        if (d)
        {
            d = false;
            a(c, f);
        }
    }
}
