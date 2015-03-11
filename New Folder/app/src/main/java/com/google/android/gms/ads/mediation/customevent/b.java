// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ig;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

class b
    implements CustomEventInterstitialListener
{

    final CustomEventAdapter a;
    private final CustomEventAdapter b;
    private final MediationInterstitialListener c;

    public b(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        a = customeventadapter;
        super();
        b = customeventadapter1;
        c = mediationinterstitiallistener;
    }

    public void onAdClicked()
    {
        ig.a("Custom event adapter called onAdClicked.");
        c.onAdClicked(b);
    }

    public void onAdClosed()
    {
        ig.a("Custom event adapter called onAdClosed.");
        c.onAdClosed(b);
    }

    public void onAdFailedToLoad(int i)
    {
        ig.a("Custom event adapter called onFailedToReceiveAd.");
        c.onAdFailedToLoad(b, i);
    }

    public void onAdLeftApplication()
    {
        ig.a("Custom event adapter called onAdLeftApplication.");
        c.onAdLeftApplication(b);
    }

    public void onAdLoaded()
    {
        ig.a("Custom event adapter called onReceivedAd.");
        c.onAdLoaded(a);
    }

    public void onAdOpened()
    {
        ig.a("Custom event adapter called onAdOpened.");
        c.onAdOpened(b);
    }
}
