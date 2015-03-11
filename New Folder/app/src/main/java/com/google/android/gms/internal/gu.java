// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, gs, gx, ig, 
//            ii, hk

class gu
    implements bb
{

    final gs a;

    gu(gs gs1)
    {
        a = gs1;
        super();
    }

    public void a(ii ii1, Map map)
    {
        Object obj = gs.a(a);
        obj;
        JVM INSTR monitorenter ;
        gx gx1;
        String s;
        gx1 = new gx(map);
        s = gx1.c();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        ig.e("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            String s1 = s.replaceAll("%40mediation_adapters%40", hk.a(ii1.getContext(), (String)map.get("check_adapters"), gs.b(a)));
            ig.d((new StringBuilder()).append("Ad request URL modified to ").append(s1).toString());
        }
        gs.a(a, gx1);
        gs.a(a).notify();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
