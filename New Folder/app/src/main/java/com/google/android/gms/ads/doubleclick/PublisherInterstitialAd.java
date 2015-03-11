// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.am;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener

public final class PublisherInterstitialAd
{

    private final am a;

    public PublisherInterstitialAd(Context context)
    {
        a = new am(context);
    }

    public AdListener getAdListener()
    {
        return a.a();
    }

    public String getAdUnitId()
    {
        return a.b();
    }

    public AppEventListener getAppEventListener()
    {
        return a.c();
    }

    public boolean isLoaded()
    {
        return a.e();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        a.a(publisheradrequest.a());
    }

    public void setAdListener(AdListener adlistener)
    {
        a.a(adlistener);
    }

    public void setAdUnitId(String s)
    {
        a.a(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        a.a(appeventlistener);
    }

    public void show()
    {
        a.f();
    }
}
