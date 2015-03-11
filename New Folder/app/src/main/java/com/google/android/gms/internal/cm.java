// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ck, cx, cb, ig

class cm
    implements Runnable
{

    final com.google.ads.AdRequest.ErrorCode a;
    final ck b;

    cm(ck ck1, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        b = ck1;
        a = errorcode;
        super();
    }

    public void run()
    {
        try
        {
            ck.a(b).a(cx.a(a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }
}
