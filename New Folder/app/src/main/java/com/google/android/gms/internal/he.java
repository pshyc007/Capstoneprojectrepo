// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            hg, hh, hf, ai

public class he
{

    private final hg a;
    private final LinkedList b;
    private final Object c;
    private final String d;
    private final String e;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private long l;

    public he(hg hg1, String s, String s1)
    {
        c = new Object();
        f = -1L;
        g = -1L;
        h = false;
        i = -1L;
        j = 0L;
        k = -1L;
        l = -1L;
        a = hg1;
        d = s;
        e = s1;
        b = new LinkedList();
    }

    public he(String s, String s1)
    {
        this(hg.a(), s, s1);
    }

    public void a()
    {
        synchronized (c)
        {
            if (l != -1L && g == -1L)
            {
                g = SystemClock.elapsedRealtime();
                a.a(this);
            }
            a;
            hg.d().c();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(long l1)
    {
        synchronized (c)
        {
            l = l1;
            if (l != -1L)
            {
                a.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ai ai)
    {
        synchronized (c)
        {
            k = SystemClock.elapsedRealtime();
            a;
            hg.d().a(ai, k);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        g = i;
        a.a(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        synchronized (c)
        {
            if (l != -1L)
            {
                hf hf1 = new hf();
                hf1.c();
                b.add(hf1);
                j = 1L + j;
                a;
                hg.d().b();
                a.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(long l1)
    {
        synchronized (c)
        {
            if (l != -1L)
            {
                f = l1;
                a.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(boolean flag)
    {
        synchronized (c)
        {
            if (l != -1L)
            {
                h = flag;
                a.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        synchronized (c)
        {
            if (l != -1L && !b.isEmpty())
            {
                hf hf1 = (hf)b.getLast();
                if (hf1.a() == -1L)
                {
                    hf1.b();
                    a.a(this);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle d()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        ArrayList arraylist;
        bundle = new Bundle();
        bundle.putString("seqnum", d);
        bundle.putString("slotid", e);
        bundle.putBoolean("ismediation", h);
        bundle.putLong("treq", k);
        bundle.putLong("tresponse", l);
        bundle.putLong("timp", g);
        bundle.putLong("tload", i);
        bundle.putLong("pcc", j);
        bundle.putLong("tfetch", f);
        arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.add(((hf)iterator.next()).d())) { }
        break MISSING_BLOCK_LABEL_160;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        bundle.putParcelableArrayList("tclick", arraylist);
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }
}
