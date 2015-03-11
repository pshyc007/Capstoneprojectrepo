// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal:
//            ke, if, hn, ig, 
//            pb, ev, ne

final class pa
    implements ke, Runnable
{

    private final List a = new Vector();
    private final CountDownLatch b = new CountDownLatch(1);
    private final AtomicReference c = new AtomicReference();
    private pb d;

    public pa(pb pb1)
    {
        d = pb1;
        if (com.google.android.gms.internal.if.b())
        {
            hn.a(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private void a()
    {
        try
        {
            b.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            ig.c("Interrupted during GADSignals creation.", interruptedexception);
        }
    }

    private void b()
    {
        if (!a.isEmpty())
        {
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                Object aobj[] = (Object[])iterator.next();
                if (aobj.length == 1)
                {
                    ((ke)c.get()).a((MotionEvent)aobj[0]);
                } else
                if (aobj.length == 3)
                {
                    ((ke)c.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
                }
            }
        }
    }

    public String a(Context context)
    {
        a();
        if (c.get() != null)
        {
            b();
            return ((ke)c.get()).a(context);
        } else
        {
            return "";
        }
    }

    public String a(Context context, String s)
    {
        a();
        if (c.get() != null)
        {
            b();
            return ((ke)c.get()).a(context, s);
        } else
        {
            return "";
        }
    }

    public void a(int i, int j, int k)
    {
        ke ke1 = (ke)c.get();
        if (ke1 != null)
        {
            b();
            ke1.a(i, j, k);
            return;
        } else
        {
            List list = a;
            Object aobj[] = new Object[3];
            aobj[0] = Integer.valueOf(i);
            aobj[1] = Integer.valueOf(j);
            aobj[2] = Integer.valueOf(k);
            list.add(((Object) (aobj)));
            return;
        }
    }

    public void a(MotionEvent motionevent)
    {
        ke ke1 = (ke)c.get();
        if (ke1 != null)
        {
            b();
            ke1.a(motionevent);
            return;
        } else
        {
            a.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    public String b(Context context)
    {
        a();
        if (c.get() != null)
        {
            b();
            return ((ke)c.get()).b(context);
        } else
        {
            return "";
        }
    }

    public void run()
    {
        c.set(ne.a(d.e.b, d.c));
        b.countDown();
        d = null;
        return;
        Exception exception;
        exception;
        b.countDown();
        d = null;
        throw exception;
    }
}
