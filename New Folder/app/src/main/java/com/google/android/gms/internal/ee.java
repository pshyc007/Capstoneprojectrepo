// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            ey, eh, dy, ig, 
//            ef, ed

public final class ee extends ey
    implements ServiceConnection
{

    private boolean a;
    private Context b;
    private int c;
    private Intent d;
    private dy e;
    private ed f;
    private String g;

    public ee(Context context, String s, boolean flag, int i, Intent intent, ed ed)
    {
        a = false;
        g = s;
        c = i;
        d = intent;
        a = flag;
        b = context;
        f = ed;
    }

    public boolean a()
    {
        return a;
    }

    public String b()
    {
        return g;
    }

    public Intent c()
    {
        return d;
    }

    public int d()
    {
        return c;
    }

    public void e()
    {
        int i = eh.a(d);
        if (c != -1 || i != 0)
        {
            return;
        } else
        {
            e = new dy(b);
            Context context = b;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context _tmp = b;
            context.bindService(intent, this, 1);
            return;
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ig.c("In-app billing service connected.");
        e.a(ibinder);
        String s = eh.b(eh.b(d));
        if (s == null)
        {
            return;
        }
        if (e.a(b.getPackageName(), s) == 0)
        {
            ef.a(b).a(f);
        }
        b.unbindService(this);
        e.a();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ig.c("In-app billing service disconnected.");
        e.a();
    }
}
