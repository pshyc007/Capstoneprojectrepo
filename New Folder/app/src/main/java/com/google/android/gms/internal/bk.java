// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            br, by, ig, bj

class bk
    implements Runnable
{

    final br a;
    final bj b;

    bk(bj bj, br br1)
    {
        b = bj;
        a = br1;
        super();
    }

    public void run()
    {
        try
        {
            a.c.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not destroy mediation adapter.", remoteexception);
        }
    }
}
