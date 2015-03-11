// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

// Referenced classes of package com.google.android.gms.internal:
//            ek, ig

public class fl
    implements InAppPurchase
{

    private final ek a;

    public fl(ek ek1)
    {
        a = ek1;
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = a.a();
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward getProductId to InAppPurchase", remoteexception);
            return null;
        }
        return s;
    }

    public void recordPlayBillingResolution(int i)
    {
        try
        {
            a.c(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward recordPlayBillingResolution to InAppPurchase", remoteexception);
        }
    }

    public void recordResolution(int i)
    {
        try
        {
            a.b(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward recordResolution to InAppPurchase", remoteexception);
        }
    }
}
