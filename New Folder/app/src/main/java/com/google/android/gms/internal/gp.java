// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            al, ds, ii, gs, 
//            ik, ar, ig, im

final class gp
    implements Runnable
{

    final Context a;
    final ds b;
    final gs c;
    final im d;
    final String e;

    gp(Context context, ds ds1, gs gs1, im im, String s)
    {
        a = context;
        b = ds1;
        c = gs1;
        d = im;
        e = s;
        super();
    }

    public void run()
    {
        ii ii1 = ii.a(a, new al(), false, false, null, b.k);
        ii1.setWillNotDraw(true);
        c.a(ii1);
        ik ik1 = ii1.f();
        ik1.a("/invalidRequest", c.a);
        ik1.a("/loadAdURL", c.b);
        ik1.a("/log", ar.g);
        ik1.a(d);
        ig.a("Loading the JS library.");
        ii1.loadUrl(e);
    }
}
