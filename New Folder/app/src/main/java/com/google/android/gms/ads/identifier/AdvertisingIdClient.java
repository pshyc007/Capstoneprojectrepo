// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import com.google.android.gms.internal.lr;
import com.google.android.gms.internal.ot;
import com.google.android.gms.internal.ou;
import java.io.IOException;

public final class AdvertisingIdClient
{

    public AdvertisingIdClient()
    {
    }

    static Info a(Context context, i j)
    {
        Info info;
        ot ot1 = ou.a(j.a());
        info = new Info(ot1.a(), ot1.a(true));
        try
        {
            context.unbindService(j);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", illegalargumentexception1);
            return info;
        }
        return info;
        RemoteException remoteexception;
        remoteexception;
        Log.i("AdvertisingIdClient", "GMS remote exception ", remoteexception);
        throw new IOException("Remote exception");
        Exception exception;
        exception;
        InterruptedException interruptedexception;
        try
        {
            context.unbindService(j);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", illegalargumentexception);
        }
        throw exception;
        interruptedexception;
        throw new IOException("Interrupted exception");
    }

    static i a(Context context)
    {
        i j;
        Intent intent;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new e(9);
        }
        try
        {
            g.b(context);
        }
        catch (e e1)
        {
            throw new IOException(e1);
        }
        j = new i();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, j, 1))
        {
            return j;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    public static Info getAdvertisingIdInfo(Context context)
    {
        lr.c("Calling this from your main thread can lead to deadlock");
        return a(context, a(context));
    }

    private class Info
    {

        private final String a;
        private final boolean b;

        public String getId()
        {
            return a;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return b;
        }

        public Info(String s, boolean flag)
        {
            a = s;
            b = flag;
        }
    }

}
