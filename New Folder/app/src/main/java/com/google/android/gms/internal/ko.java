// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.g;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            la, lr, ky, kq, 
//            kt, kw, kx, ll, 
//            ku, lb, kv, kr, 
//            lk

public abstract class ko
    implements la
{

    public static final String d[] = {
        "service_esmobile", "service_googleme"
    };
    private final Context a;
    final Handler b;
    boolean c;
    private final Looper e;
    private IInterface f;
    private final ArrayList g;
    private kv h;
    private volatile int i;
    private final String j[];
    private final ky k;

    protected transient ko(Context context, Looper looper, c c1, d d1, String as[])
    {
        g = new ArrayList();
        i = 1;
        c = false;
        a = (Context)lr.a(context);
        e = (Looper)lr.a(looper, "Looper must not be null");
        k = new ky(context, looper, this);
        b = new kq(this, looper);
        a(as);
        j = as;
        a((c)lr.a(c1));
        a((d)lr.a(d1));
    }

    protected transient ko(Context context, com.google.android.gms.common.c c1, com.google.android.gms.common.d d1, String as[])
    {
        this(context, context.getMainLooper(), ((c) (new kt(c1))), ((d) (new kw(d1))), as);
    }

    static IInterface a(ko ko1, IInterface iinterface)
    {
        ko1.f = iinterface;
        return iinterface;
    }

    static kv a(ko ko1, kv kv1)
    {
        ko1.h = kv1;
        return kv1;
    }

    static ky a(ko ko1)
    {
        return ko1.k;
    }

    private void a(int i1)
    {
        int j1 = i;
        i = i1;
        if (j1 != i1)
        {
            if (i1 == 3)
            {
                d();
            } else
            if (j1 == 3 && i1 == 1)
            {
                e();
                return;
            }
        }
    }

    static void a(ko ko1, int i1)
    {
        ko1.a(i1);
    }

    static ArrayList b(ko ko1)
    {
        return ko1.g;
    }

    static IInterface c(ko ko1)
    {
        return ko1.f;
    }

    static kv d(ko ko1)
    {
        return ko1.h;
    }

    static Context e(ko ko1)
    {
        return ko1.a;
    }

    protected abstract String a();

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        b.sendMessage(b.obtainMessage(1, new kx(this, i1, ibinder, bundle)));
    }

    public void a(c c1)
    {
        k.a(c1);
    }

    public void a(d d1)
    {
        k.a(d1);
    }

    protected abstract void a(lk lk, ku ku1);

    protected transient void a(String as[])
    {
    }

    protected abstract IInterface b(IBinder ibinder);

    protected abstract String b();

    protected final void c(IBinder ibinder)
    {
        try
        {
            a(ll.a(ibinder), new ku(this));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service died");
        }
    }

    protected void d()
    {
    }

    protected void e()
    {
    }

    public void f()
    {
        c = true;
        a(2);
        int i1 = com.google.android.gms.common.g.a(a);
        if (i1 != 0)
        {
            a(1);
            b.sendMessage(b.obtainMessage(3, Integer.valueOf(i1)));
        } else
        {
            if (h != null)
            {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                f = null;
                lb.a(a).b(a(), h);
            }
            h = new kv(this);
            if (!lb.a(a).a(a(), h))
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(a()).toString());
                b.sendMessage(b.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    public boolean g()
    {
        return i == 3;
    }

    public boolean h()
    {
        return i == 2;
    }

    public void i()
    {
        c = false;
        ArrayList arraylist = g;
        arraylist;
        JVM INSTR monitorenter ;
        int i1 = g.size();
        int j1 = 0;
_L2:
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((kr)g.get(j1)).d();
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        g.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a(1);
        f = null;
        if (h != null)
        {
            lb.a(a).b(a(), h);
            h = null;
        }
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Context j()
    {
        return a;
    }

    protected final void k()
    {
        if (!g())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public Bundle l()
    {
        return null;
    }

    public final IInterface m()
    {
        k();
        return f;
    }

    public boolean n()
    {
        return c;
    }

}
