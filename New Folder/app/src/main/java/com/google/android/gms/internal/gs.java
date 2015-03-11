// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            gt, gu, ig, bb, 
//            ii, gx

public final class gs
{

    public final bb a = new gt(this);
    public final bb b = new gu(this);
    private final Object c = new Object();
    private ii d;
    private String e;
    private int f;
    private gx g;

    public gs(String s)
    {
        f = -2;
        e = s;
    }

    static int a(gs gs1, int i)
    {
        gs1.f = i;
        return i;
    }

    static gx a(gs gs1, gx gx)
    {
        gs1.g = gx;
        return gx;
    }

    static Object a(gs gs1)
    {
        return gs1.c;
    }

    static String b(gs gs1)
    {
        return gs1.e;
    }

    public int a()
    {
        int i;
        synchronized (c)
        {
            i = f;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ii ii)
    {
        synchronized (c)
        {
            d = ii;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gx b()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
_L1:
        int i;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        i = f;
        if (i != -2)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        c.wait();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        ig.e("Ad request service was interrupted.");
        obj;
        JVM INSTR monitorexit ;
        return null;
        gx gx = g;
        obj;
        JVM INSTR monitorexit ;
        return gx;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
