// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.internal:
//            lr, ig, cb

public final class ci
    implements MediationBannerListener, MediationInterstitialListener
{

    private final cb a;

    public ci(cb cb1)
    {
        a = cb1;
    }

    public void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        lr.b("onAdClicked must be called on the main UI thread.");
        ig.a("Adapter called onAdClicked.");
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdClicked.", remoteexception);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        lr.b("onAdClicked must be called on the main UI thread.");
        ig.a("Adapter called onAdClicked.");
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdClicked.", remoteexception);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        lr.b("onAdClosed must be called on the main UI thread.");
        ig.a("Adapter called onAdClosed.");
        try
        {
            a.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdClosed.", remoteexception);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        lr.b("onAdClosed must be called on the main UI thread.");
        ig.a("Adapter called onAdClosed.");
        try
        {
            a.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdClosed.", remoteexception);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        lr.b("onAdFailedToLoad must be called on the main UI thread.");
        ig.a((new StringBuilder()).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try
        {
            a.a(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        lr.b("onAdFailedToLoad must be called on the main UI thread.");
        ig.a((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            a.a(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        lr.b("onAdLeftApplication must be called on the main UI thread.");
        ig.a("Adapter called onAdLeftApplication.");
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        lr.b("onAdLeftApplication must be called on the main UI thread.");
        ig.a("Adapter called onAdLeftApplication.");
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        lr.b("onAdLoaded must be called on the main UI thread.");
        ig.a("Adapter called onAdLoaded.");
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdLoaded.", remoteexception);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        lr.b("onAdLoaded must be called on the main UI thread.");
        ig.a("Adapter called onAdLoaded.");
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdLoaded.", remoteexception);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        lr.b("onAdOpened must be called on the main UI thread.");
        ig.a("Adapter called onAdOpened.");
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdOpened.", remoteexception);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        lr.b("onAdOpened must be called on the main UI thread.");
        ig.a("Adapter called onAdOpened.");
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdOpened.", remoteexception);
        }
    }
}
