// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            lc, lb, kv

public class ld
    implements ServiceConnection
{

    final lc a;

    public ld(lc lc1)
    {
        a = lc1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = lb.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        lc.a(a, ibinder);
        lc.a(a, componentname);
        for (Iterator iterator = lc.a(a).iterator(); iterator.hasNext(); ((kv)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_78;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        lc.a(a, 1);
        hashmap;
        JVM INSTR monitorexit ;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = lb.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        lc.a(a, null);
        lc.a(a, componentname);
        for (Iterator iterator = lc.a(a).iterator(); iterator.hasNext(); ((kv)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_75;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        lc.a(a, 2);
        hashmap;
        JVM INSTR monitorexit ;
    }
}
