// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ig;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

final class a
    implements CustomEventBannerListener
{

    private final CustomEventAdapter a;
    private final MediationBannerListener b;

    public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        a = customeventadapter;
        b = mediationbannerlistener;
    }

    public void onAdClicked()
    {
        ig.a("Custom event adapter called onAdClicked.");
        b.onAdClicked(a);
    }

    public void onAdClosed()
    {
        ig.a("Custom event adapter called onAdClosed.");
        b.onAdClosed(a);
    }

    public void onAdFailedToLoad(int i)
    {
        ig.a("Custom event adapter called onAdFailedToLoad.");
        b.onAdFailedToLoad(a, i);
    }

    public void onAdLeftApplication()
    {
        ig.a("Custom event adapter called onAdLeftApplication.");
        b.onAdLeftApplication(a);
    }

    public void onAdLoaded(View view)
    {
        ig.a("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.a(a, view);
        b.onAdLoaded(a);
    }

    public void onAdOpened()
    {
        ig.a("Custom event adapter called onAdOpened.");
        b.onAdOpened(a);
    }
}
