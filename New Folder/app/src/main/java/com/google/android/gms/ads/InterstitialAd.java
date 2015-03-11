// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.am;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final am a;

    public InterstitialAd(Context context)
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

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return a.d();
    }

    public boolean isLoaded()
    {
        return a.e();
    }

    public void loadAd(AdRequest adrequest)
    {
        a.a(adrequest.a());
    }

    public void setAdListener(AdListener adlistener)
    {
        a.a(adlistener);
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

    public void show()
    {
        a.f();
    }
}
