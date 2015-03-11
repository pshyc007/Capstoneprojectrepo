// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            q, bu, al, o, 
//            n, y, s, fe, 
//            fn, ig, ah

public final class am
{

    private final bu a;
    private final Context b;
    private final q c;
    private AdListener d;
    private y e;
    private String f;
    private String g;
    private AppEventListener h;
    private PlayStorePurchaseListener i;
    private InAppPurchaseListener j;

    public am(Context context)
    {
        this(context, q.a());
    }

    public am(Context context, q q1)
    {
        a = new bu();
        b = context;
        c = q1;
    }

    private void b(String s1)
    {
        if (f == null)
        {
            c(s1);
        }
        e = o.a(b, new al(), f, a);
        if (d != null)
        {
            e.a(new n(d));
        }
        if (h != null)
        {
            e.a(new s(h));
        }
        if (j != null)
        {
            e.a(new fe(j));
        }
        if (i != null)
        {
            e.a(new fn(i), g);
        }
    }

    private void c(String s1)
    {
        if (e == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad unit ID must be set on InterstitialAd before ").append(s1).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public AdListener a()
    {
        return d;
    }

    public void a(AdListener adlistener)
    {
        d = adlistener;
        if (e == null) goto _L2; else goto _L1
_L1:
        y y1 = e;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        n n1 = new n(adlistener);
_L3:
        y1.a(n1);
_L2:
        return;
        n1 = null;
          goto _L3
        RemoteException remoteexception;
        remoteexception;
        ig.c("Failed to set the AdListener.", remoteexception);
        return;
    }

    public void a(AppEventListener appeventlistener)
    {
        h = appeventlistener;
        if (e == null) goto _L2; else goto _L1
_L1:
        y y1 = e;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s s1 = new s(appeventlistener);
_L3:
        y1.a(s1);
_L2:
        return;
        s1 = null;
          goto _L3
        RemoteException remoteexception;
        remoteexception;
        ig.c("Failed to set the AppEventListener.", remoteexception);
        return;
    }

    public void a(InAppPurchaseListener inapppurchaselistener)
    {
        if (i != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        j = inapppurchaselistener;
        if (e == null) goto _L2; else goto _L1
_L1:
        y y1 = e;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fe fe1 = new fe(inapppurchaselistener);
_L3:
        y1.a(fe1);
_L2:
        return;
        fe1 = null;
          goto _L3
        RemoteException remoteexception;
        remoteexception;
        ig.c("Failed to set the InAppPurchaseListener.", remoteexception);
        return;
    }

    public void a(PlayStorePurchaseListener playstorepurchaselistener, String s1)
    {
        i = playstorepurchaselistener;
        if (e == null) goto _L2; else goto _L1
_L1:
        y y1 = e;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        fn fn1 = new fn(playstorepurchaselistener);
_L3:
        y1.a(fn1, s1);
_L2:
        return;
        fn1 = null;
          goto _L3
        RemoteException remoteexception;
        remoteexception;
        ig.c("Failed to set the play store purchase parameter.", remoteexception);
        return;
    }

    public void a(ah ah1)
    {
        try
        {
            if (e == null)
            {
                b("loadAd");
            }
            if (e.a(c.a(b, ah1)))
            {
                a.a(ah1.i());
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to load ad.", remoteexception);
        }
    }

    public void a(String s1)
    {
        if (f != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            f = s1;
            return;
        }
    }

    public String b()
    {
        return f;
    }

    public AppEventListener c()
    {
        return h;
    }

    public InAppPurchaseListener d()
    {
        return j;
    }

    public boolean e()
    {
        if (e == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = e.c();
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public void f()
    {
        try
        {
            c("show");
            e.f();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to show interstitial.", remoteexception);
        }
    }
}
