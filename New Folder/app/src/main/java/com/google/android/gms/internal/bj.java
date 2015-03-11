// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ig, bm, bl, br, 
//            bp, ds, if, bk, 
//            bv

public final class bj
{

    private final ds a;
    private final bv b;
    private final Context c;
    private final Object d = new Object();
    private final bm e;
    private boolean f;
    private bp g;

    public bj(Context context, ds ds1, bv bv, bm bm1)
    {
        f = false;
        c = context;
        a = ds1;
        b = bv;
        e = bm1;
    }

    public br a(long l, long l1)
    {
        Iterator iterator;
        ig.a("Starting mediation.");
        iterator = e.a.iterator();
_L4:
        bl bl1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        bl1 = (bl)iterator.next();
        ig.c((new StringBuilder()).append("Trying mediation network: ").append(bl1.b).toString());
        iterator1 = bl1.c.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            br br1;
            synchronized (d)
            {
                if (!f)
                {
                    break label0;
                }
                br1 = new br(-1);
            }
            return br1;
        }
        g = new bp(c, s, b, e, bl1, a.c, a.d, a.k);
        obj;
        JVM INSTR monitorexit ;
        br br2;
        br2 = g.a(l, l1);
        if (br2.a == 0)
        {
            ig.a("Adapter succeeded.");
            return br2;
        }
        break MISSING_BLOCK_LABEL_219;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (br2.c != null)
        {
            if.a.post(new bk(this, br2));
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new br(1);
    }

    public void a()
    {
        synchronized (d)
        {
            f = true;
            if (g != null)
            {
                g.a();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
