// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ck, cb, ig

class ct
    implements Runnable
{

    final ck a;

    ct(ck ck1)
    {
        a = ck1;
        super();
    }

    public void run()
    {
        try
        {
            ck.a(a).c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdLeftApplication.", remoteexception);
        }
    }
}
