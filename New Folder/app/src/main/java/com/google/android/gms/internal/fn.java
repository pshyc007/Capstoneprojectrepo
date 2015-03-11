// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            fb, fj, ex

public final class fn extends fb
{

    private final PlayStorePurchaseListener a;

    public fn(PlayStorePurchaseListener playstorepurchaselistener)
    {
        a = playstorepurchaselistener;
    }

    public void a(ex ex)
    {
        a.onInAppPurchaseFinished(new fj(ex));
    }

    public boolean a(String s)
    {
        return a.isValidPurchase(s);
    }
}
