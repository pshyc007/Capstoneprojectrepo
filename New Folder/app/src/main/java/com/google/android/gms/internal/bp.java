// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.a.d;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;

// Referenced classes of package com.google.android.gms.internal:
//            bs, bm, bl, ig, 
//            ev, al, by, bv, 
//            bo, if, bq, br, 
//            ai

public final class bp
    implements bs
{

    private final String a;
    private final bv b;
    private final long c;
    private final bl d;
    private final ai e;
    private final al f;
    private final Context g;
    private final Object h = new Object();
    private final ev i;
    private by j;
    private int k;

    public bp(Context context, String s, bv bv1, bm bm1, bl bl1, ai ai, al al1, 
            ev ev1)
    {
        k = -2;
        g = context;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            a = a(bl1);
        } else
        {
            a = s;
        }
        b = bv1;
        if (bm1.b != -1L)
        {
            l = bm1.b;
        } else
        {
            l = 10000L;
        }
        c = l;
        d = bl1;
        e = ai;
        f = al1;
        i = ev1;
    }

    static by a(bp bp1, by by1)
    {
        bp1.j = by1;
        return by1;
    }

    static Object a(bp bp1)
    {
        return bp1.h;
    }

    private String a(bl bl1)
    {
        if (!TextUtils.isEmpty(bl1.e) && com/google/android/gms/ads/mediation/customevent/CustomEvent.isAssignableFrom(Class.forName(bl1.e, false, com/google/android/gms/internal/bp.getClassLoader())))
        {
            return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        }
        break MISSING_BLOCK_LABEL_40;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        ig.e("Could not create custom event adapter.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private void a(long l, long l1, long l2, long l3)
    {
        do
        {
            if (k != -2)
            {
                return;
            }
            b(l, l1, l2, l3);
        } while (true);
    }

    private void a(bo bo1)
    {
        if (i.d >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (f.e)
        {
            j.a(com.google.android.gms.a.d.a(g), e, d.g, bo1);
            return;
        }
        try
        {
            j.a(com.google.android.gms.a.d.a(g), f, e, d.g, bo1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not request ad from mediation adapter.", remoteexception);
        }
        a(5);
        return;
        if (f.e)
        {
            j.a(com.google.android.gms.a.d.a(g), e, d.g, d.a, bo1);
            return;
        }
        j.a(com.google.android.gms.a.d.a(g), f, e, d.g, d.a, bo1);
        return;
    }

    static void a(bp bp1, bo bo1)
    {
        bp1.a(bo1);
    }

    static int b(bp bp1)
    {
        return bp1.k;
    }

    private by b()
    {
        ig.c((new StringBuilder()).append("Instantiating mediation adapter: ").append(a).toString());
        by by1;
        try
        {
            by1 = b.a(a);
        }
        catch (RemoteException remoteexception)
        {
            ig.a((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(a).toString(), remoteexception);
            return null;
        }
        return by1;
    }

    private void b(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        long l5 = l1 - (l4 - l);
        long l6 = l3 - (l4 - l2);
        if (l5 <= 0L || l6 <= 0L)
        {
            ig.c("Timed out waiting for adapter.");
            k = 3;
            return;
        }
        try
        {
            h.wait(Math.min(l5, l6));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            k = -1;
        }
    }

    static by c(bp bp1)
    {
        return bp1.b();
    }

    static by d(bp bp1)
    {
        return bp1.j;
    }

    public br a(long l, long l1)
    {
        br br1;
        synchronized (h)
        {
            long l2 = SystemClock.elapsedRealtime();
            bo bo1 = new bo();
            if.a.post(new bq(this, bo1));
            a(l2, c, l, l1);
            br1 = new br(d, j, a, bo1, k);
        }
        return br1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (j != null)
        {
            j.c();
        }
_L1:
        k = -1;
        h.notify();
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Could not destroy mediation adapter.", remoteexception);
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int l)
    {
        synchronized (h)
        {
            k = l;
            h.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
