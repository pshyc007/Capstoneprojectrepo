// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            gc, gg, ds, ev, 
//            du, gb, ig, gl

public final class gf extends gc
    implements c, d
{

    private final gb a;
    private final gg b;
    private final Object c = new Object();

    public gf(Context context, ds ds1, gb gb1)
    {
        super(ds1, gb1);
        a = gb1;
        b = new gg(context, this, this, ds1.k.d);
        b.f();
    }

    public void a(Bundle bundle)
    {
        e();
    }

    public void a(a a1)
    {
        a.a(new du(0));
    }

    public void c()
    {
        synchronized (c)
        {
            if (b.g() || b.h())
            {
                b.i();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gl d()
    {
        obj;
        JVM INSTR monitorenter ;
        gl gl;
        synchronized (c)
        {
            gl = b.c();
        }
        return gl;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        obj;
        JVM INSTR monitorexit ;
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void m_()
    {
        com.google.android.gms.internal.ig.a("Disconnected from remote ad request service.");
    }
}
