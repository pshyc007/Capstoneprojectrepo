// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, gs, gx, ig, 
//            ii

class gt
    implements bb
{

    final gs a;

    gt(gs gs1)
    {
        a = gs1;
        super();
    }

    public void a(ii ii, Map map)
    {
        synchronized (gs.a(a))
        {
            gx gx1 = new gx(map);
            ig.e((new StringBuilder()).append("Invalid ").append(gx1.d()).append(" request error: ").append(gx1.a()).toString());
            gs.a(a, 1);
            gs.a(a).notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
