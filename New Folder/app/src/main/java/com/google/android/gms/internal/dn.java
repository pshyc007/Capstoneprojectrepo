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
//            do, ig, db, dt, 
//            dq, dv, dp

public final class dn extends e
{

    private static final dn a = new dn();

    private dn()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static dp a(Activity activity)
    {
        dp dp;
        try
        {
            if (b(activity))
            {
                ig.a("Using AdOverlay from the client jar.");
                return new db(activity);
            }
            dp = a.c(activity);
        }
        catch (do do1)
        {
            com.google.android.gms.internal.ig.e(do1.getMessage());
            return null;
        }
        return dp;
    }

    private static boolean b(Activity activity)
    {
        Intent intent = activity.getIntent();
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
        {
            throw new do("Ad overlay requires the useClientJar flag in intent extras.");
        } else
        {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
    }

    private dp c(Activity activity)
    {
        dp dp;
        try
        {
            com.google.android.gms.a.a a1 = d.a(activity);
            dp = dq.a(((dt)a(activity)).a(a1));
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not create remote AdOverlay.", remoteexception);
            return null;
        }
        catch (f f1)
        {
            ig.c("Could not create remote AdOverlay.", f1);
            return null;
        }
        return dp;
    }

    protected Object a(IBinder ibinder)
    {
        return b(ibinder);
    }

    protected dt b(IBinder ibinder)
    {
        return dv.a(ibinder);
    }

}
