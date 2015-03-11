// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            hq

final class hs
    implements Runnable
{

    final Context a;

    hs(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        synchronized (hq.e())
        {
            hq.b(hq.d(a));
            hq.e().notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
