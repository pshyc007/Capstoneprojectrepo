// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal:
//            lc, kv

public final class lb
    implements android.os.Handler.Callback
{

    private static final Object a = new Object();
    private static lb b;
    private final Context c;
    private final HashMap d = new HashMap();
    private final Handler e;

    private lb(Context context)
    {
        e = new Handler(context.getMainLooper(), this);
        c = context.getApplicationContext();
    }

    public static lb a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new lb(context.getApplicationContext());
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static HashMap a(lb lb1)
    {
        return lb1.d;
    }

    public boolean a(String s, kv kv1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        lc lc1 = (lc)d.get(s);
        if (lc1 != null) goto _L2; else goto _L1
_L1:
        lc1 = new lc(this, s);
        lc1.a(kv1);
        Intent intent = (new Intent(s)).setPackage("com.google.android.gms");
        lc1.a(c.bindService(intent, lc1.a(), 129));
        d.put(s, lc1);
_L7:
        boolean flag = lc1.c();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e.removeMessages(0, lc1);
        if (lc1.c(kv1))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=").append(s).toString());
        }
        break MISSING_BLOCK_LABEL_155;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        lc1.a(kv1);
        lc1.d();
        JVM INSTR tableswitch 1 2: default 245
    //                   1 188
    //                   2 205;
           goto _L3 _L4 _L5
_L3:
        if (true) goto _L7; else goto _L6
_L6:
_L4:
        kv1.onServiceConnected(lc1.g(), lc1.f());
          goto _L7
_L5:
        Intent intent1 = (new Intent(s)).setPackage("com.google.android.gms");
        lc1.a(c.bindService(intent1, lc1.a(), 129));
          goto _L7
    }

    public void b(String s, kv kv1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        lc lc1 = (lc)d.get(s);
        if (lc1 != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service action: ").append(s).toString());
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        if (!lc1.c(kv1))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=").append(s).toString());
        }
        lc1.b(kv1);
        if (lc1.e())
        {
            Message message = e.obtainMessage(0, lc1);
            e.sendMessageDelayed(message, 5000L);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    public boolean handleMessage(Message message)
    {
        lc lc1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            lc1 = (lc)message.obj;
            break;
        }
        synchronized (d)
        {
            if (lc1.e())
            {
                c.unbindService(lc1.a());
                d.remove(lc1.b());
            }
        }
        return true;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
