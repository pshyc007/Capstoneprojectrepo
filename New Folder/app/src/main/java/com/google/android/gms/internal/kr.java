// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            ko

public abstract class kr
{

    final ko a;
    private Object b;
    private boolean c;

    public kr(ko ko1, Object obj)
    {
        a = ko1;
        super();
        b = obj;
        c = false;
    }

    protected abstract void a();

    protected abstract void a(Object obj);

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = b;
        if (c)
        {
            Log.w("GmsClient", (new StringBuilder()).append("Callback proxy ").append(this).append(" being reused. This is not safe.").toString());
        }
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (obj != null)
        {
            try
            {
                a(obj);
            }
            catch (RuntimeException runtimeexception)
            {
                a();
                throw runtimeexception;
            }
        } else
        {
            a();
        }
        this;
        JVM INSTR monitorenter ;
        c = true;
        this;
        JVM INSTR monitorexit ;
        c();
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        this;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void c()
    {
        d();
        synchronized (ko.b(a))
        {
            ko.b(a).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
