// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            hl

class hm
    implements Runnable
{

    final hl a;

    hm(hl hl1)
    {
        a = hl1;
        super();
    }

    public final void run()
    {
        hl.a(a, Thread.currentThread());
        a.a();
    }
}
