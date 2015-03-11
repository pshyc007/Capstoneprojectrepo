// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            eo, fl, ek

public final class fe extends eo
{

    private final InAppPurchaseListener a;

    public fe(InAppPurchaseListener inapppurchaselistener)
    {
        a = inapppurchaselistener;
    }

    public void a(ek ek)
    {
        a.onInAppPurchaseRequested(new fl(ek));
    }
}
