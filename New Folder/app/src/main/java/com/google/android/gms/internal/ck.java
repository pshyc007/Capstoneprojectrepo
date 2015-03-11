// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.internal:
//            ig, if, cl, cb, 
//            cr, cw, cs, cx, 
//            cm, ct, cn, cu, 
//            co, cv, cp

public final class ck
    implements MediationBannerListener, MediationInterstitialListener
{

    private final cb a;

    public ck(cb cb1)
    {
        a = cb1;
    }

    static cb a(ck ck1)
    {
        return ck1.a;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        ig.a("Adapter called onClick.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onClick must be called on the main UI thread.");
            if.a.post(new cl(this));
            return;
        }
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

    public void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
        ig.a("Adapter called onDismissScreen.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onDismissScreen must be called on the main UI thread.");
            if.a.post(new cr(this));
            return;
        }
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

    public void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        ig.a("Adapter called onDismissScreen.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onDismissScreen must be called on the main UI thread.");
            if.a.post(new cw(this));
            return;
        }
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

    public void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        ig.a((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onFailedToReceiveAd must be called on the main UI thread.");
            if.a.post(new cs(this, errorcode));
            return;
        }
        try
        {
            a.a(cx.a(errorcode));
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        ig.a((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onFailedToReceiveAd must be called on the main UI thread.");
            if.a.post(new cm(this, errorcode));
            return;
        }
        try
        {
            a.a(cx.a(errorcode));
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
        ig.a("Adapter called onLeaveApplication.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onLeaveApplication must be called on the main UI thread.");
            if.a.post(new ct(this));
            return;
        }
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

    public void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        ig.a("Adapter called onLeaveApplication.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onLeaveApplication must be called on the main UI thread.");
            if.a.post(new cn(this));
            return;
        }
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

    public void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
        ig.a("Adapter called onPresentScreen.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onPresentScreen must be called on the main UI thread.");
            if.a.post(new cu(this));
            return;
        }
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

    public void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        ig.a("Adapter called onPresentScreen.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onPresentScreen must be called on the main UI thread.");
            if.a.post(new co(this));
            return;
        }
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

    public void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
        ig.a("Adapter called onReceivedAd.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onReceivedAd must be called on the main UI thread.");
            if.a.post(new cv(this));
            return;
        }
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

    public void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        ig.a("Adapter called onReceivedAd.");
        if (!com.google.android.gms.internal.if.b())
        {
            ig.e("onReceivedAd must be called on the main UI thread.");
            if.a.post(new cp(this));
            return;
        }
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
}
