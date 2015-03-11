// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.a.d;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            q, bu, t, al, 
//            if, y, ig, o, 
//            n, s, fe, fn, 
//            ah

public final class ak
{

    private final bu a;
    private final q b;
    private AdListener c;
    private y d;
    private AdSize e[];
    private String f;
    private String g;
    private ViewGroup h;
    private AppEventListener i;
    private InAppPurchaseListener j;
    private PlayStorePurchaseListener k;

    public ak(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, q.a());
    }

    public ak(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, q.a());
    }

    ak(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, q q1)
    {
        a = new bu();
        h = viewgroup;
        b = q1;
        if (attributeset != null)
        {
            android.content.Context context = viewgroup.getContext();
            try
            {
                t t1 = new t(context, attributeset);
                e = t1.a(flag);
                f = t1.a();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                com.google.android.gms.internal.if.a(viewgroup, new al(context, AdSize.BANNER), illegalargumentexception.getMessage(), illegalargumentexception.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                com.google.android.gms.internal.if.a(viewgroup, new al(context, e[0]), "Ads by Google");
            }
        }
    }

    private void k()
    {
        com.google.android.gms.a.a a1 = d.a();
        if (a1 == null)
        {
            return;
        }
        try
        {
            h.addView((View)com.google.android.gms.a.d.a(a1));
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void l()
    {
        if ((e == null || f == null) && d == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = h.getContext();
        d = o.a(context, new al(context, e), f, a);
        if (c != null)
        {
            d.a(new n(c));
        }
        if (i != null)
        {
            d.a(new s(i));
        }
        if (j != null)
        {
            d.a(new fe(j));
        }
        if (k != null)
        {
            d.a(new fn(k), g);
        }
        k();
    }

    public void a()
    {
        try
        {
            if (d != null)
            {
                d.b();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to destroy AdView.", remoteexception);
        }
    }

    public void a(AdListener adlistener)
    {
        c = adlistener;
        if (d == null) goto _L2; else goto _L1
_L1:
        y y1 = d;
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
        i = appeventlistener;
        if (d == null) goto _L2; else goto _L1
_L1:
        y y1 = d;
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
        if (k != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        j = inapppurchaselistener;
        if (d == null) goto _L2; else goto _L1
_L1:
        y y1 = d;
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
        if (j != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        k = playstorepurchaselistener;
        g = s1;
        if (d == null) goto _L2; else goto _L1
_L1:
        y y1 = d;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_65;
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
            if (d == null)
            {
                l();
            }
            if (d.a(b.a(h.getContext(), ah1)))
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
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            f = s1;
            return;
        }
    }

    public transient void a(AdSize aadsize[])
    {
        if (e != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        } else
        {
            b(aadsize);
            return;
        }
    }

    public AdListener b()
    {
        return c;
    }

    public transient void b(AdSize aadsize[])
    {
        e = aadsize;
        try
        {
            if (d != null)
            {
                d.a(new al(h.getContext(), e));
            }
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to set the ad size.", remoteexception);
        }
        h.requestLayout();
    }

    public AdSize c()
    {
        AdSize adsize;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        adsize = d.i().a();
        return adsize;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Failed to get the current AdSize.", remoteexception);
        if (e != null)
        {
            return e[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] d()
    {
        return e;
    }

    public String e()
    {
        return f;
    }

    public AppEventListener f()
    {
        return i;
    }

    public InAppPurchaseListener g()
    {
        return j;
    }

    public void h()
    {
        try
        {
            if (d != null)
            {
                d.d();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to call pause.", remoteexception);
        }
    }

    public void i()
    {
        try
        {
            d.h();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to record impression.", remoteexception);
        }
    }

    public void j()
    {
        try
        {
            if (d != null)
            {
                d.e();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Failed to call resume.", remoteexception);
        }
    }
}
