// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ig;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, a, b

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{

    private View a;
    private CustomEventBanner b;
    private CustomEventInterstitial c;

    public CustomEventAdapter()
    {
    }

    private static Object a(String s)
    {
        Object obj;
        try
        {
            obj = Class.forName(s).newInstance();
        }
        catch (Throwable throwable)
        {
            ig.e((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    private void a(View view)
    {
        a = view;
    }

    static void a(CustomEventAdapter customeventadapter, View view)
    {
        customeventadapter.a(view);
    }

    public View getBannerView()
    {
        return a;
    }

    public void onDestroy()
    {
        if (b != null)
        {
            b.onDestroy();
        }
        if (c != null)
        {
            c.onDestroy();
        }
    }

    public void onPause()
    {
        if (b != null)
        {
            b.onPause();
        }
        if (c != null)
        {
            c.onPause();
        }
    }

    public void onResume()
    {
        if (b != null)
        {
            b.onResume();
        }
        if (c != null)
        {
            c.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        b = (CustomEventBanner)a(bundle.getString("class_name"));
        if (b == null)
        {
            mediationbannerlistener.onAdFailedToLoad(this, 0);
            return;
        }
        Bundle bundle2;
        if (bundle1 == null)
        {
            bundle2 = null;
        } else
        {
            bundle2 = bundle1.getBundle(bundle.getString("class_name"));
        }
        b.requestBannerAd(context, new a(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle2);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        c = (CustomEventInterstitial)a(bundle.getString("class_name"));
        if (c == null)
        {
            mediationinterstitiallistener.onAdFailedToLoad(this, 0);
            return;
        }
        Bundle bundle2;
        if (bundle1 == null)
        {
            bundle2 = null;
        } else
        {
            bundle2 = bundle1.getBundle(bundle.getString("class_name"));
        }
        c.requestInterstitialAd(context, new b(this, this, mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle2);
    }

    public void showInterstitial()
    {
        c.showInterstitial();
    }
}
