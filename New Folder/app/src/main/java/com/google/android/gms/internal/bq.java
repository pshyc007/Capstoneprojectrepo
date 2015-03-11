// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bp, bo

class bq
    implements Runnable
{

    final bo a;
    final bp b;

    bq(bp bp1, bo bo1)
    {
        b = bp1;
        a = bo1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (bp.a(b))
            {
                if (bp.b(b) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        bp.a(b, bp.c(b));
        if (bp.d(b) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        b.a(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a.a(b);
        bp.a(b, a);
        obj;
        JVM INSTR monitorexit ;
    }
}
