// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            hg

public class hj
{

    private final Object a;
    private int b;
    private int c;
    private final hg d;
    private final String e;

    hj(hg hg1, String s)
    {
        a = new Object();
        d = hg1;
        e = s;
    }

    public hj(String s)
    {
        this(hg.a(), s);
    }

    public Bundle a()
    {
        Bundle bundle;
        synchronized (a)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", b);
            bundle.putInt("pmnll", c);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i, int j)
    {
        synchronized (a)
        {
            b = i;
            c = j;
            d.a(e, this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
