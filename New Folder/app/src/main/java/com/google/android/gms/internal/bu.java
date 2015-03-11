// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.NetworkExtras;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bw, cj, cg, ig, 
//            by

public final class bu extends bw
{

    private Map a;

    public bu()
    {
    }

    private by b(String s)
    {
        try
        {
            Class class1 = Class.forName(s, false, com/google/android/gms/internal/bu.getClassLoader());
            if (com/google/ads/mediation/MediationAdapter.isAssignableFrom(class1))
            {
                MediationAdapter mediationadapter = (MediationAdapter)class1.newInstance();
                return new cj(mediationadapter, (NetworkExtras)a.get(mediationadapter.getAdditionalParametersType()));
            }
            if (com/google/android/gms/ads/mediation/MediationAdapter.isAssignableFrom(class1))
            {
                return new cg((com.google.android.gms.ads.mediation.MediationAdapter)class1.newInstance());
            } else
            {
                ig.e((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(s).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        }
        catch (Throwable throwable)
        {
            ig.e((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
        }
        throw new RemoteException();
    }

    public by a(String s)
    {
        return b(s);
    }

    public void a(Map map)
    {
        a = map;
    }
}
