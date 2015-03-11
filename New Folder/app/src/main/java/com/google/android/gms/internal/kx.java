// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.a;

// Referenced classes of package com.google.android.gms.internal:
//            kr, ko, lb, ky

public final class kx extends kr
{

    public final int b;
    public final Bundle c;
    public final IBinder d;
    final ko e;

    public kx(ko ko1, int i, IBinder ibinder, Bundle bundle)
    {
        e = ko1;
        super(ko1, Boolean.valueOf(true));
        b = i;
        d = ibinder;
        c = bundle;
    }

    protected void a()
    {
    }

    protected void a(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            com.google.android.gms.internal.ko.a(e, 1);
            return;
        }
        switch (b)
        {
        default:
            RemoteException remoteexception;
            String s;
            PendingIntent pendingintent;
            if (c != null)
            {
                pendingintent = (PendingIntent)c.getParcelable("pendingIntent");
            } else
            {
                pendingintent = null;
            }
            if (ko.d(e) != null)
            {
                com.google.android.gms.internal.lb.a(ko.e(e)).b(e.a(), ko.d(e));
                com.google.android.gms.internal.ko.a(e, null);
            }
            com.google.android.gms.internal.ko.a(e, 1);
            com.google.android.gms.internal.ko.a(e, null);
            com.google.android.gms.internal.ko.a(e).a(new a(b, pendingintent));
            return;

        case 0: // '\0'
            try
            {
                s = d.getInterfaceDescriptor();
                if (e.b().equals(s))
                {
                    com.google.android.gms.internal.ko.a(e, e.b(d));
                    if (ko.c(e) != null)
                    {
                        com.google.android.gms.internal.ko.a(e, 3);
                        com.google.android.gms.internal.ko.a(e).a();
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (RemoteException remoteexception) { }
            com.google.android.gms.internal.lb.a(ko.e(e)).b(e.a(), ko.d(e));
            com.google.android.gms.internal.ko.a(e, null);
            com.google.android.gms.internal.ko.a(e, 1);
            com.google.android.gms.internal.ko.a(e, null);
            com.google.android.gms.internal.ko.a(e).a(new a(8, null));
            return;

        case 10: // '\n'
            com.google.android.gms.internal.ko.a(e, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }

    protected void a(Object obj)
    {
        a((Boolean)obj);
    }
}
