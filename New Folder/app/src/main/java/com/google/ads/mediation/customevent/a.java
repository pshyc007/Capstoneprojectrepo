// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ig;

// Referenced classes of package com.google.ads.mediation.customevent:
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

    public void onClick()
    {
        ig.a("Custom event adapter called onFailedToReceiveAd.");
        b.onClick(a);
    }

    public void onDismissScreen()
    {
        ig.a("Custom event adapter called onFailedToReceiveAd.");
        b.onDismissScreen(a);
    }

    public void onFailedToReceiveAd()
    {
        ig.a("Custom event adapter called onFailedToReceiveAd.");
        b.onFailedToReceiveAd(a, com.google.ads.AdRequest.ErrorCode.NO_FILL);
    }

    public void onLeaveApplication()
    {
        ig.a("Custom event adapter called onFailedToReceiveAd.");
        b.onLeaveApplication(a);
    }

    public void onPresentScreen()
    {
        ig.a("Custom event adapter called onFailedToReceiveAd.");
        b.onPresentScreen(a);
    }

    public void onReceivedAd(View view)
    {
        ig.a("Custom event adapter called onReceivedAd.");
        CustomEventAdapter.a(a, view);
        b.onReceivedAd(a);
    }
}
