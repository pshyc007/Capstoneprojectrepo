// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fs, fq, hd

class fu
    implements Runnable
{

    final hd a;
    final fs b;

    fu(fs fs1, hd hd)
    {
        b = fs1;
        a = hd;
        super();
    }

    public void run()
    {
        synchronized (fs.a(b))
        {
            fs.b(b).a(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
