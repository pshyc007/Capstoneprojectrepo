// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            i, c, al, hd

public final class b
    implements i
{

    private final Object a = new Object();
    private WeakHashMap b;
    private ArrayList c;

    public b()
    {
        b = new WeakHashMap();
        c = new ArrayList();
    }

    public c a(al al, hd hd)
    {
label0:
        {
            c c2;
            synchronized (a)
            {
                if (!a(hd))
                {
                    break label0;
                }
                c2 = (c)b.get(hd);
            }
            return c2;
        }
        c c1;
        c1 = new c(al, hd);
        c1.a(this);
        b.put(hd, c1);
        c.add(c1);
        obj;
        JVM INSTR monitorexit ;
        return c1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((c)iterator.next()).j()) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(c c1)
    {
        synchronized (a)
        {
            if (!c1.e())
            {
                c.remove(c1);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a(hd hd)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        c c1 = (c)b.get(hd);
        if (c1 == null) goto _L2; else goto _L1
_L1:
        if (!c1.e()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((c)iterator.next()).k()) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void b(hd hd)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        c c1 = (c)b.get(hd);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        c1.c();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((c)iterator.next()).l()) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }
}
