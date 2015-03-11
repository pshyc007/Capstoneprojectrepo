// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            ko

final class kv
    implements ServiceConnection
{

    final ko a;

    kv(ko ko1)
    {
        a = ko1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        a.c(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a.b.sendMessage(a.b.obtainMessage(4, Integer.valueOf(1)));
    }
}
