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

public class nu
    implements android.os.Parcelable.Creator
{

    public nu()
    {
    }

    static void a(ks.b b1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = b1.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, b1.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, b1.g(), i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, b1.h(), i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, b1.i());
        }
        c.a(parcel, j);
    }

    public ks.b a(Parcel parcel)
    {
        ks.b.b b1 = null;
        int i = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        ks.b.a a1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    ks.b.a a2 = (ks.b.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ks.b.a.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    a1 = a2;
                    break;

                case 3: // '\003'
                    ks.b.b b2 = (ks.b.b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ks.b.b.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    b1 = b2;
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new ks.b(hashset, k, a1, b1, i);
            }
        } while (true);
    }

    public ks.b[] a(int i)
    {
        return new ks.b[i];
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
