// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            dx, fa, ei, ek

public final class cq
    implements SafeParcelable
{

    public static final dx CREATOR = new dx();
    public final int a;
    public final fa b;
    public final ei c;
    public final ek d;
    public final Context e;

    cq(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        a = i;
        b = (fa)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder));
        c = (ei)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder1));
        d = (ek)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder2));
        e = (Context)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder3));
    }

    public cq(ek ek1, fa fa1, ei ei1, Context context)
    {
        a = 1;
        d = ek1;
        b = fa1;
        c = ei1;
        e = context;
    }

    public static cq a(Intent intent)
    {
        cq cq1;
        try
        {
            Bundle bundle = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundle.setClassLoader(com/google/android/gms/internal/cq.getClassLoader());
            cq1 = (cq)bundle.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        }
        catch (Exception exception)
        {
            return null;
        }
        return cq1;
    }

    public static void a(Intent intent, cq cq1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", cq1);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    IBinder a()
    {
        return com.google.android.gms.a.d.a(b).asBinder();
    }

    IBinder b()
    {
        return com.google.android.gms.a.d.a(c).asBinder();
    }

    IBinder c()
    {
        return com.google.android.gms.a.d.a(d).asBinder();
    }

    IBinder d()
    {
        return com.google.android.gms.a.d.a(e).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.dx.a(this, parcel, i);
    }

}
