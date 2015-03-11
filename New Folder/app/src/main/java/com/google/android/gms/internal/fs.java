// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            hl, gb, im, du, 
//            fx, ds, al, bj, 
//            br, if, fv, bm, 
//            ig, no, ke, ga, 
//            ft, hd, fu, ii, 
//            fy, fw, hq, bv, 
//            fq, gh

public class fs extends hl
    implements gb, im
{

    private final bv a;
    private final fq b;
    private final ii c;
    private final Object d = new Object();
    private final Context e;
    private final Object f = new Object();
    private final gh g;
    private final no h;
    private hl i;
    private du j;
    private boolean k;
    private bj l;
    private bm m;
    private br n;

    public fs(Context context, gh gh, no no1, ii ii1, bv bv, fq fq)
    {
        k = false;
        a = bv;
        b = fq;
        c = ii1;
        e = context;
        g = gh;
        h = no1;
    }

    private al a(ds ds1)
    {
        if (j.m == null)
        {
            throw new fx("The ad response must specify one of the supported ad sizes.", 0);
        }
        String as[] = j.m.split("x");
        if (as.length != 2)
        {
            throw new fx((new StringBuilder()).append("Could not parse the ad size from the ad response: ").append(j.m).toString(), 0);
        }
        int i1;
        int j1;
        al aal[];
        int k1;
        try
        {
            i1 = Integer.parseInt(as[0]);
            j1 = Integer.parseInt(as[1]);
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new fx((new StringBuilder()).append("Could not parse the ad size from the ad response: ").append(j.m).toString(), 0);
        }
        aal = ds1.d.h;
        k1 = aal.length;
        al al1;
        int i2;
        int j2;
        for (int l1 = 0; l1 < k1; l1++)
        {
            al1 = aal[l1];
            float f1 = e.getResources().getDisplayMetrics().density;
            if (al1.f == -1)
            {
                i2 = (int)((float)al1.g / f1);
            } else
            {
                i2 = al1.f;
            }
            if (al1.c == -2)
            {
                j2 = (int)((float)al1.d / f1);
            } else
            {
                j2 = al1.c;
            }
            if (i1 == i2 && j1 == j2)
            {
                return new al(al1, ds1.d.h);
            }
        }

        throw new fx((new StringBuilder()).append("The ad size from the ad response was not one of the requested sizes: ").append(j.m).toString(), 0);
    }

    static Object a(fs fs1)
    {
        return fs1.f;
    }

    private void a(ds ds1, long l1)
    {
        synchronized (d)
        {
            l = new bj(e, ds1, a, m);
        }
        n = l.a(l1, 60000L);
        switch (n.a)
        {
        default:
            throw new fx((new StringBuilder()).append("Unexpected mediation result: ").append(n.a).toString(), 0);

        case 1: // '\001'
            throw new fx("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static fq b(fs fs1)
    {
        return fs1.b;
    }

    private void b(long l1)
    {
        if.a.post(new fv(this));
        d(l1);
    }

    static du c(fs fs1)
    {
        return fs1.j;
    }

    private void c()
    {
        if (j.e != -3)
        {
            if (TextUtils.isEmpty(j.c))
            {
                throw new fx("No fill from ad server.", 3);
            }
            if (j.h)
            {
                try
                {
                    m = new bm(j.c);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new fx((new StringBuilder()).append("Could not parse mediation config: ").append(j.c).toString(), 0);
                }
            }
        }
    }

    private void c(long l1)
    {
        do
        {
            if (!e(l1))
            {
                throw new fx("Timed out waiting for ad response.", 2);
            }
        } while (j == null);
        synchronized (d)
        {
            i = null;
        }
        if (j.e != -2 && j.e != -3)
        {
            throw new fx((new StringBuilder()).append("There was a problem getting an ad response. ErrorCode: ").append(j.e).toString(), j.e);
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static ii d(fs fs1)
    {
        return fs1.c;
    }

    private void d(long l1)
    {
        do
        {
            if (!e(l1))
            {
                throw new fx("Timed out waiting for WebView to finish loading.", 2);
            }
        } while (!k);
    }

    private boolean e(long l1)
    {
        long l2 = 60000L - (SystemClock.elapsedRealtime() - l1);
        if (l2 <= 0L)
        {
            return false;
        }
        try
        {
            f.wait(l2);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new fx("Ad request cancelled.", -1);
        }
        return true;
    }

    public void a()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        ds ds1;
        ig.a("AdLoaderBackgroundTask started.");
        ke ke1 = h.a();
        String s = ke1.b(e);
        String s1 = ke1.a(e);
        ds1 = new ds(g, s, s1);
        al al1;
        int i1;
        long l1;
        al1 = null;
        i1 = -2;
        l1 = -1L;
        long l4;
        hl hl1;
        l4 = SystemClock.elapsedRealtime();
        hl1 = ga.a(e, ds1, this);
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        i = hl1;
        if (i == null)
        {
            throw new fx("Could not start the ad request service.", 0);
        }
          goto _L1
        Exception exception2;
        exception2;
        obj1;
        JVM INSTR monitorexit ;
        throw exception2;
        fx fx1;
        fx1;
        i1 = fx1.a();
        if (i1 != 3 && i1 != -1) goto _L3; else goto _L2
_L2:
        ig.c(fx1.getMessage());
_L16:
        if (j != null) goto _L5; else goto _L4
_L4:
        j = new du(i1);
_L17:
        if.a.post(new ft(this));
        long l2;
        al al2;
        l2 = l1;
        al2 = al1;
_L23:
        boolean flag = TextUtils.isEmpty(j.r);
        if (flag) goto _L7; else goto _L6
_L6:
        JSONObject jsonobject;
        String s4 = j.r;
        jsonobject = new JSONObject(s4);
_L18:
        ai ai;
        ii ii1;
        java.util.List list;
        java.util.List list1;
        java.util.List list2;
        int j1;
        long l3;
        String s2;
        boolean flag1;
        ai = ds1.c;
        ii1 = c;
        list = j.d;
        list1 = j.f;
        list2 = j.j;
        j1 = j.l;
        l3 = j.k;
        s2 = ds1.i;
        flag1 = j.h;
        if (n == null) goto _L9; else goto _L8
_L8:
        bl bl = n.b;
_L19:
        if (n == null) goto _L11; else goto _L10
_L10:
        by by = n.c;
_L20:
        if (n == null) goto _L13; else goto _L12
_L12:
        String s3 = n.d;
_L21:
        bm bm1 = m;
        if (n == null) goto _L15; else goto _L14
_L14:
        bo bo = n.e;
_L22:
        hd hd1 = new hd(ai, ii1, list, i1, list1, list2, j1, l3, s2, flag1, bl, by, s3, bm1, bo, j.i, al2, j.g, l2, j.n, j.o, jsonobject);
        if.a.post(new fu(this, hd1));
        obj;
        JVM INSTR monitorexit ;
        return;
_L1:
        obj1;
        JVM INSTR monitorexit ;
        al aal[];
        c(l4);
        l1 = SystemClock.elapsedRealtime();
        c();
        aal = ds1.d.h;
        al1 = null;
        if (aal == null)
        {
            break MISSING_BLOCK_LABEL_522;
        }
        al1 = a(ds1);
        if (j.h)
        {
            a(ds1, l4);
            break MISSING_BLOCK_LABEL_650;
        }
        if (j.p)
        {
            a(l4);
            break MISSING_BLOCK_LABEL_650;
        }
        break MISSING_BLOCK_LABEL_567;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b(l4);
        break MISSING_BLOCK_LABEL_650;
_L3:
        ig.e(fx1.getMessage());
          goto _L16
_L5:
        j = new du(i1, j.k);
          goto _L17
        Exception exception1;
        exception1;
        ig.b("Error parsing the JSON for Active View.", exception1);
_L7:
        jsonobject = null;
          goto _L18
_L9:
        bl = null;
          goto _L19
_L11:
        by = null;
          goto _L20
_L13:
        s3 = null;
          goto _L21
_L15:
        bo = null;
          goto _L22
        l2 = l1;
        al2 = al1;
          goto _L23
    }

    protected void a(long l1)
    {
        al al1 = c.e();
        int i1;
        int j1;
        fy fy1;
        if (al1.e)
        {
            i1 = e.getResources().getDisplayMetrics().widthPixels;
            j1 = e.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            i1 = al1.g;
            j1 = al1.d;
        }
        fy1 = new fy(this, c, i1, j1);
        if.a.post(new fw(this, fy1));
        d(l1);
        if (fy1.c())
        {
            ig.a("Ad-Network indicated no fill with passback URL.");
            throw new fx("AdNetwork sent passback url", 3);
        }
        if (!fy1.d())
        {
            throw new fx("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }

    public void a(du du1)
    {
        synchronized (f)
        {
            ig.a("Received ad response.");
            j = du1;
            f.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ii ii1)
    {
        synchronized (f)
        {
            ig.a("WebView finished loading.");
            k = true;
            f.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        synchronized (d)
        {
            if (i != null)
            {
                i.f();
            }
            c.stopLoading();
            hq.a(c);
            if (l != null)
            {
                l.a();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
