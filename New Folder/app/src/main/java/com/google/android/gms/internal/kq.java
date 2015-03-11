// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;

// Referenced classes of package com.google.android.gms.internal:
//            ko, kr, ky

final class kq extends Handler
{

    final ko a;

    public kq(ko ko1, Looper looper)
    {
        a = ko1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        if (message.what == 1 && !a.h())
        {
            kr kr2 = (kr)message.obj;
            kr2.a();
            kr2.c();
            return;
        }
        if (message.what == 3)
        {
            com.google.android.gms.internal.ko.a(a).a(new a(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            com.google.android.gms.internal.ko.a(a, 1);
            com.google.android.gms.internal.ko.a(a, null);
            com.google.android.gms.internal.ko.a(a).a(((Integer)message.obj).intValue());
            return;
        }
        if (message.what == 2 && !a.g())
        {
            kr kr1 = (kr)message.obj;
            kr1.a();
            kr1.c();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((kr)message.obj).b();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }
}
