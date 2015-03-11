// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;
import com.google.android.gms.a.f;

// Referenced classes of package com.google.android.gms.internal:
//            fh, ig, ec, et, 
//            er, eu, eq

public final class ff extends e
{

    private static final ff a = new ff();

    private ff()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static eq a(Activity activity)
    {
        eq eq;
        try
        {
            if (b(activity))
            {
                ig.a("Using AdOverlay from the client jar.");
                return new ec(activity);
            }
            eq = a.c(activity);
        }
        catch (fh fh1)
        {
            com.google.android.gms.internal.ig.e(fh1.getMessage());
            return null;
        }
        return eq;
    }

    private static boolean b(Activity activity)
    {
        Intent intent = activity.getIntent();
        if (!intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
        {
            throw new fh("InAppPurchaseManager requires the useClientJar flag in intent extras.");
        } else
        {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
        }
    }

    private eq c(Activity activity)
    {
        eq eq;
        try
        {
            com.google.android.gms.a.a a1 = d.a(activity);
            eq = er.a(((et)a(activity)).a(a1));
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not create remote InAppPurchaseManager.", remoteexception);
            return null;
        }
        catch (f f1)
        {
            ig.c("Could not create remote InAppPurchaseManager.", f1);
            return null;
        }
        return eq;
    }

    protected Object a(IBinder ibinder)
    {
        return b(ibinder);
    }

    protected et b(IBinder ibinder)
    {
        return eu.a(ibinder);
    }

}
