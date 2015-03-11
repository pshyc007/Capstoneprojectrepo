// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            dz, ed, ei, ee, 
//            fa, ig

class ea
    implements Runnable
{

    final ed a;
    final Intent b;
    final dz c;

    ea(dz dz1, ed ed1, Intent intent)
    {
        c = dz1;
        a = ed1;
        b = intent;
        super();
    }

    public void run()
    {
        if (dz.a(c).a(a.b, -1, b))
        {
            dz.c(c).a(new ee(dz.b(c), a.c, true, -1, b, a));
            return;
        }
        try
        {
            dz.c(c).a(new ee(dz.b(c), a.c, false, -1, b, a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.e("Fail to verify and dispatch pending transaction");
        }
        return;
    }
}
