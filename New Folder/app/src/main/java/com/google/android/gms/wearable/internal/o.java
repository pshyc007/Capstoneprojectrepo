// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DataItemAssetParcelable

public class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(DataItemAssetParcelable dataitemassetparcelable, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, dataitemassetparcelable.a);
        c.a(parcel, 2, dataitemassetparcelable.b(), false);
        c.a(parcel, 3, dataitemassetparcelable.c(), false);
        c.a(parcel, j);
    }

    public DataItemAssetParcelable a(Parcel parcel)
    {
        String s = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new DataItemAssetParcelable(j, s1, s);
            }
        } while (true);
    }

    public DataItemAssetParcelable[] a(int i)
    {
        return new DataItemAssetParcelable[i];
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
