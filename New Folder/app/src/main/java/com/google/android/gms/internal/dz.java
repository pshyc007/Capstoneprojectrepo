// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hl, dy, ef, ig, 
//            if, ea, ed, eh, 
//            fa, ei

public class dz extends hl
    implements ServiceConnection
{

    private final Object a = new Object();
    private boolean b;
    private Context c;
    private fa d;
    private dy e;
    private ef f;
    private List g;
    private ei h;

    public dz(Context context, fa fa, ei ei)
    {
        b = false;
        g = null;
        c = context;
        d = fa;
        h = ei;
        e = new dy(context);
        f = ef.a(c);
        g = f.a(10L);
    }

    static ei a(dz dz1)
    {
        return dz1.h;
    }

    private void a(long l)
    {
        do
        {
            if (!b(l))
            {
                ig.e("Timeout waiting for pending transaction to be processed.");
            }
        } while (!b);
    }

    private void a(ed ed1, String s, String s1)
    {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 0);
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        if.a.post(new ea(this, ed1, intent));
    }

    static Context b(dz dz1)
    {
        return dz1.c;
    }

    private boolean b(long l)
    {
        long l1 = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l1 <= 0L)
        {
            return false;
        }
        try
        {
            a.wait(l1);
        }
        catch (InterruptedException interruptedexception)
        {
            ig.e("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    static fa c(dz dz1)
    {
        return dz1.d;
    }

    private void c()
    {
        if (!g.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        HashMap hashmap;
        String s;
        hashmap = new HashMap();
        ed ed2;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); hashmap.put(ed2.c, ed2))
        {
            ed2 = (ed)iterator.next();
        }

        s = null;
_L7:
        Bundle bundle = e.b(c.getPackageName(), s);
          goto _L3
_L5:
        Iterator iterator1 = hashmap.keySet().iterator();
        while (iterator1.hasNext()) 
        {
            String s2 = (String)iterator1.next();
            f.a((ed)hashmap.get(s2));
        }
          goto _L1
_L3:
        if (bundle == null || eh.a(bundle) != 0) goto _L5; else goto _L4
_L4:
        String s1;
        ArrayList arraylist = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList arraylist1 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList arraylist2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        s1 = bundle.getString("INAPP_CONTINUATION_TOKEN");
        for (int i = 0; i < arraylist.size(); i++)
        {
            if (!hashmap.containsKey(arraylist.get(i)))
            {
                continue;
            }
            String s3 = (String)arraylist.get(i);
            String s4 = (String)arraylist1.get(i);
            String s5 = (String)arraylist2.get(i);
            ed ed1 = (ed)hashmap.get(s3);
            String s6 = eh.a(s4);
            if (ed1.b.equals(s6))
            {
                a(ed1, s4, s5);
                hashmap.remove(s3);
            }
        }

        if (s1 == null || hashmap.isEmpty()) goto _L5; else goto _L6
_L6:
        s = s1;
          goto _L7
    }

    public void a()
    {
        synchronized (a)
        {
            Context context = c;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            c;
            context.bindService(intent, this, 1);
            a(SystemClock.elapsedRealtime());
            c.unbindService(this);
            e.a();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        synchronized (a)
        {
            c.unbindService(this);
            e.a();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (a)
        {
            e.a(ibinder);
            c();
            b = true;
            a.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ig.c("In-app billing service disconnected.");
        e.a();
    }
}
