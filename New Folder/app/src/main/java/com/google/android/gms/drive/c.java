// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive:
//            StorageStats

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(StorageStats storagestats, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, storagestats.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, storagestats.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, storagestats.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, storagestats.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, storagestats.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, storagestats.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }

    public StorageStats a(Parcel parcel)
    {
        int i = 0;
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long l1 = l;
        long l2 = l;
        long l3 = l;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 3: // '\003'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 4: // '\004'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 5: // '\005'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StorageStats(k, l3, l2, l1, l, i);
            }
        } while (true);
    }

    public StorageStats[] a(int i)
    {
        return new StorageStats[i];
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
