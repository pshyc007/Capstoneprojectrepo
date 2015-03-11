// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.c;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            ky, la

final class kz extends Handler
{

    final ky a;

    public kz(ky ky1, Looper looper)
    {
        a = ky1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            synchronized (ky.a(a))
            {
                if (ky.b(a).n() && ky.b(a).g() && ky.a(a).contains(message.obj))
                {
                    android.os.Bundle bundle = ky.b(a).l();
                    ((c)message.obj).a(bundle);
                }
            }
            return;
        } else
        {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return;
        }
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
