// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hl, gl, ig, du, 
//            gb, ds

public abstract class gc extends hl
{

    private final ds a;
    private final gb b;

    public gc(ds ds, gb gb1)
    {
        a = ds;
        b = gb1;
    }

    private static du a(gl gl1, ds ds)
    {
        du du1;
        try
        {
            du1 = gl1.a(ds);
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not fetch ad response from ad request service.", remoteexception);
            return null;
        }
        catch (NullPointerException nullpointerexception)
        {
            ig.c("Could not fetch ad response from ad request service due to an Exception.", nullpointerexception);
            return null;
        }
        catch (SecurityException securityexception)
        {
            ig.c("Could not fetch ad response from ad request service due to an Exception.", securityexception);
            return null;
        }
        return du1;
    }

    public final void a()
    {
        gl gl1 = d();
        if (gl1 != null) goto _L2; else goto _L1
_L1:
        du du1 = new du(0);
_L4:
        c();
        b.a(du1);
        return;
_L2:
        du1 = a(gl1, a);
        if (du1 != null) goto _L4; else goto _L3
_L3:
        du1 = new du(0);
          goto _L4
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public final void b()
    {
        c();
    }

    public abstract void c();

    public abstract gl d();
}
