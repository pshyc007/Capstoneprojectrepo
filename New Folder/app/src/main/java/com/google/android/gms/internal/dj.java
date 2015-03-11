// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            dk, if, di

final class dj
{

    private final Runnable a;
    private volatile boolean b;

    public dj(di di)
    {
        b = false;
        a = new dk(this, di);
    }

    static boolean a(dj dj1)
    {
        return dj1.b;
    }

    public void a()
    {
        b = true;
        if.a.removeCallbacks(a);
    }

    public void b()
    {
        if.a.postDelayed(a, 250L);
    }
}
