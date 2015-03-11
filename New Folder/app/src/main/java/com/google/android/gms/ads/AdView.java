// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.ak;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdSize, AdListener

public final class AdView extends ViewGroup
{

    private final ak a;

    public AdView(Context context)
    {
        super(context);
        a = new ak(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ak(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ak(this, attributeset, false);
    }

    public void destroy()
    {
        a.a();
    }

    public AdListener getAdListener()
    {
        return a.b();
    }

    public AdSize getAdSize()
    {
        return a.c();
    }

    public String getAdUnitId()
    {
        return a.e();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return a.g();
    }

    public void loadAd(AdRequest adrequest)
    {
        a.a(adrequest.a());
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            int i1 = view.getMeasuredWidth();
            int j1 = view.getMeasuredHeight();
            int k1 = (k - i - i1) / 2;
            int l1 = (l - j - j1) / 2;
            view.layout(k1, l1, i1 + k1, j1 + l1);
        }
    }

    protected void onMeasure(int i, int j)
    {
        View view = getChildAt(0);
        AdSize adsize = getAdSize();
        int k;
        int l;
        int i1;
        int j1;
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, i, j);
            l = view.getMeasuredWidth();
            k = view.getMeasuredHeight();
        } else
        if (adsize != null)
        {
            Context context = getContext();
            l = adsize.getWidthInPixels(context);
            k = adsize.getHeightInPixels(context);
        } else
        {
            k = 0;
            l = 0;
        }
        i1 = Math.max(l, getSuggestedMinimumWidth());
        j1 = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(i1, i), View.resolveSize(j1, j));
    }

    public void pause()
    {
        a.h();
    }

    public void resume()
    {
        a.j();
    }

    public void setAdListener(AdListener adlistener)
    {
        a.a(adlistener);
    }

    public void setAdSize(AdSize adsize)
    {
        a.a(new AdSize[] {
            adsize
        });
    }

    public void setAdUnitId(String s)
    {
        a.a(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        a.a(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        a.a(playstorepurchaselistener, s);
    }
}
