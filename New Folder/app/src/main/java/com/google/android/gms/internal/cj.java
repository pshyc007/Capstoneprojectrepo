// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bz, ig, ck, ai, 
//            cx, cb, al

public final class cj extends bz
{

    private final MediationAdapter a;
    private final NetworkExtras b;

    public cj(MediationAdapter mediationadapter, NetworkExtras networkextras)
    {
        a = mediationadapter;
        b = networkextras;
    }

    private MediationServerParameters a(String s, int i, String s1)
    {
        HashMap hashmap;
        if (s != null)
        {
            try
            {
                JSONObject jsonobject = new JSONObject(s);
                hashmap = new HashMap(jsonobject.length());
                String s2;
                for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashmap.put(s2, jsonobject.getString(s2)))
                {
                    s2 = (String)iterator.next();
                }

            }
            catch (Throwable throwable)
            {
                ig.c("Could not get MediationServerParameters.", throwable);
                throw new RemoteException();
            }
            break MISSING_BLOCK_LABEL_104;
        }
        hashmap = new HashMap(0);
        Class class1 = a.getServerParametersType();
        MediationServerParameters mediationserverparameters;
        mediationserverparameters = null;
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        mediationserverparameters = (MediationServerParameters)class1.newInstance();
        mediationserverparameters.load(hashmap);
        return mediationserverparameters;
    }

    public a a()
    {
        if (!(a instanceof MediationBannerAdapter))
        {
            ig.e((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        a a1;
        try
        {
            a1 = com.google.android.gms.a.d.a(((MediationBannerAdapter)a).getBannerView());
        }
        catch (Throwable throwable)
        {
            ig.c("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return a1;
    }

    public void a(a a1, ai ai1, String s, cb cb)
    {
        a(a1, ai1, s, null, cb);
    }

    public void a(a a1, ai ai1, String s, String s1, cb cb)
    {
        if (!(a instanceof MediationInterstitialAdapter))
        {
            ig.e((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.ig.a("Requesting interstitial ad from adapter.");
        try
        {
            ((MediationInterstitialAdapter)a).requestInterstitialAd(new ck(cb), (Activity)com.google.android.gms.a.d.a(a1), a(s, ai1.g, s1), com.google.android.gms.internal.cx.a(ai1), b);
            return;
        }
        catch (Throwable throwable)
        {
            ig.c("Could not request interstitial ad from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void a(a a1, al al, ai ai1, String s, cb cb)
    {
        a(a1, al, ai1, s, null, cb);
    }

    public void a(a a1, al al, ai ai1, String s, String s1, cb cb)
    {
        if (!(a instanceof MediationBannerAdapter))
        {
            ig.e((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.ig.a("Requesting banner ad from adapter.");
        try
        {
            ((MediationBannerAdapter)a).requestBannerAd(new ck(cb), (Activity)com.google.android.gms.a.d.a(a1), a(s, ai1.g, s1), com.google.android.gms.internal.cx.a(al), com.google.android.gms.internal.cx.a(ai1), b);
            return;
        }
        catch (Throwable throwable)
        {
            ig.c("Could not request banner ad from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void b()
    {
        if (!(a instanceof MediationInterstitialAdapter))
        {
            ig.e((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.ig.a("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)a).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            ig.c("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void c()
    {
        try
        {
            a.destroy();
            return;
        }
        catch (Throwable throwable)
        {
            ig.c("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void d()
    {
        throw new RemoteException();
    }

    public void e()
    {
        throw new RemoteException();
    }
}
