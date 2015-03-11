// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.aj;
import com.google.android.gms.internal.lr;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public final class 
{

    private final aj a = new aj();

    static aj a( )
    {
        return .a;
    }

    public a addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        a.b(class1, bundle);
        return this;
    }

    public a addKeyword(String s)
    {
        a.a(s);
        return this;
    }

    public a addNetworkExtras(NetworkExtras networkextras)
    {
        a.a(networkextras);
        return this;
    }

    public a addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        a.a(class1, bundle);
        return this;
    }

    public a addTestDevice(String s)
    {
        a.b(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public a setBirthday(Date date)
    {
        a.a(date);
        return this;
    }

    public a setContentUrl(String s)
    {
        lr.a(s, "Content URL must be non-null.");
        lr.a(s, "Content URL must be non-empty.");
        boolean flag;
        Object aobj[];
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aobj = new Object[2];
        aobj[0] = Integer.valueOf(512);
        aobj[1] = Integer.valueOf(s.length());
        lr.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", aobj);
        a.c(s);
        return this;
    }

    public a setGender(int i)
    {
        a.a(i);
        return this;
    }

    public a setLocation(Location location)
    {
        a.a(location);
        return this;
    }

    public a setManualImpressionsEnabled(boolean flag)
    {
        a.a(flag);
        return this;
    }

    public a setPublisherProvidedId(String s)
    {
        a.d(s);
        return this;
    }

    public a tagForChildDirectedTreatment(boolean flag)
    {
        a.b(flag);
        return this;
    }

    public ()
    {
    }
}
