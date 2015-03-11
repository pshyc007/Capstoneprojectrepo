// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.d;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            kz, la, lr

public final class ky
{

    final ArrayList a = new ArrayList();
    private final la b;
    private final ArrayList c = new ArrayList();
    private boolean d;
    private final ArrayList e = new ArrayList();
    private final Handler f;

    public ky(Context context, Looper looper, la la1)
    {
        d = false;
        b = la1;
        f = new kz(this, looper);
    }

    static ArrayList a(ky ky1)
    {
        return ky1.c;
    }

    static la b(ky ky1)
    {
        return ky1.b;
    }

    protected void a()
    {
        synchronized (c)
        {
            a(b.l());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i)
    {
        f.removeMessages(1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        d = true;
        iterator = (new ArrayList(c)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        c c1 = (c)iterator.next();
        if (b.n()) goto _L3; else goto _L2
_L2:
        d = false;
        return;
_L3:
        if (c.contains(c1))
        {
            c1.a(i);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Bundle bundle)
    {
        boolean flag = true;
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag1;
        Iterator iterator;
        c c1;
        if (!d)
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        com.google.android.gms.internal.lr.a(flag1);
        f.removeMessages(1);
        d = true;
        if (a.size() != 0)
        {
            flag = false;
        }
        com.google.android.gms.internal.lr.a(flag);
        iterator = (new ArrayList(c)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        c1 = (c)iterator.next();
        if (b.n() && b.g()) goto _L3; else goto _L2
_L2:
        a.clear();
        d = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!a.contains(c1))
        {
            c1.a(bundle);
        }
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(a a1)
    {
        f.removeMessages(1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(e)).iterator();
_L2:
        d d1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        d1 = (d)iterator.next();
        if (!b.n())
        {
            return;
        }
        if (e.contains(d1))
        {
            d1.a(a1);
        }
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        arraylist;
        JVM INSTR monitorexit ;
    }

    public void a(c c1)
    {
        com.google.android.gms.internal.lr.a(c1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        if (!c.contains(c1))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(c1).append(" is already registered").toString());
_L2:
        if (b.g())
        {
            f.sendMessage(f.obtainMessage(1, c1));
        }
        return;
        c.add(c1);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(d d1)
    {
        com.google.android.gms.internal.lr.a(d1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        if (!e.contains(d1))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(d1).append(" is already registered").toString());
_L2:
        return;
        e.add(d1);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
