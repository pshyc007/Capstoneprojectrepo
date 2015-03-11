// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            pe, ox

class pf
    implements Runnable
{

    final ox a;
    final pe b;
    private final WeakReference c;

    pf(pe pe1, ox ox1)
    {
        b = pe1;
        a = ox1;
        super();
        c = new WeakReference(a);
    }

    public void run()
    {
        pe.a(b, false);
        ox ox1 = (ox)c.get();
        if (ox1 != null)
        {
            ox1.b(pe.a(b));
        }
    }
}
