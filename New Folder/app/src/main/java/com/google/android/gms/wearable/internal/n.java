// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            b

public class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(com.google.android.gms.wearable.internal.b b1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, b1.a);
        c.a(parcel, 2, b1.a(), false);
        c.a(parcel, 3, b1.c, i, false);
        c.a(parcel, j);
    }

    public com.google.android.gms.wearable.internal.b a(Parcel parcel)
    {
        IntentFilter aintentfilter[] = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    aintentfilter = (IntentFilter[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, IntentFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new com.google.android.gms.wearable.internal.b(j, ibinder, aintentfilter);
            }
        } while (true);
    }

    public com.google.android.gms.wearable.internal.b[] a(int i)
    {
        return new com.google.android.gms.wearable.internal.b[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
