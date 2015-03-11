// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            j, d, c

public class ao
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final int a;
    public final c b;

    ao(int i, IBinder ibinder)
    {
        a = i;
        if (ibinder != null)
        {
            b = d.a(ibinder);
            return;
        } else
        {
            b = null;
            return;
        }
    }

    IBinder a()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.asBinder();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
