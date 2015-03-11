// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

public class ny
    implements android.os.Parcelable.Creator
{

    public ny()
    {
    }

    static void a(ks.d d, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = d.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, d.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, d.g(), true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, d.h(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, d.i(), true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, d.j(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, d.k(), true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, d.l(), true);
        }
        c.a(parcel, j);
    }

    public ks.d a(Parcel parcel)
    {
        String s = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
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
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != i)
                {
                    throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
                }
                return new ks.d(hashset, j, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public ks.d[] a(int i)
    {
        return new ks.d[i];
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
