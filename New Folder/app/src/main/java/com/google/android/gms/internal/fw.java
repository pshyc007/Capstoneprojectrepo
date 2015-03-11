// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fs, du, ii, ik, 
//            fy

class fw
    implements Runnable
{

    final fy a;
    final fs b;

    fw(fs fs1, fy fy1)
    {
        b = fs1;
        a = fy1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (fs.a(b))
            {
                if (fs.c(b).e == -2)
                {
                    break label0;
                }
            }
            return;
        }
        fs.d(b).f().a(b);
        a.a(fs.c(b));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
