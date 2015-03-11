// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            di, dj

class dk
    implements Runnable
{

    final di a;
    final dj b;
    private final WeakReference c;

    dk(dj dj1, di di1)
    {
        b = dj1;
        a = di1;
        super();
        c = new WeakReference(a);
    }

    public void run()
    {
        di di1 = (di)c.get();
        if (!dj.a(b) && di1 != null)
        {
            di1.e();
            b.b();
        }
    }
}
