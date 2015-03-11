// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            hm, hn

public abstract class hl
{

    private final Runnable a = new hm(this);
    private volatile Thread b;

    public hl()
    {
    }

    static Thread a(hl hl1, Thread thread)
    {
        hl1.b = thread;
        return thread;
    }

    public abstract void a();

    public abstract void b();

    public final void e()
    {
        hn.a(a);
    }

    public final void f()
    {
        b();
        if (b != null)
        {
            b.interrupt();
        }
    }
}
