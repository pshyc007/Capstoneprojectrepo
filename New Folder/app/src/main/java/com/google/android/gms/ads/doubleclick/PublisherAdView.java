// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ak;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener

public final class PublisherAdView extends ViewGroup
{

    private final ak a;

    public PublisherAdView(Context context)
    {
        super(context);
        a = new ak(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ak(this, attributeset, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ak(this, attributeset, true);
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

    public AdSize[] getAdSizes()
    {
        return a.d();
    }

    public String getAdUnitId()
    {
        return a.e();
    }

    public AppEventListener getAppEventListener()
    {
        return a.f();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        a.a(publisheradrequest.a());
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

    public void recordManualImpression()
    {
        a.i();
    }

    public void resume()
    {
        a.j();
    }

    public void setAdListener(AdListener adlistener)
    {
        a.a(adlistener);
    }

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (aadsize == null || aadsize.length < 1)
        {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        } else
        {
            a.b(aadsize);
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        a.a(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        a.a(appeventlistener);
    }
}
