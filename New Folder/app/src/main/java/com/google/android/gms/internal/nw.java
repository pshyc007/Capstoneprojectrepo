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

public class nw
    implements android.os.Parcelable.Creator
{

    public nw()
    {
    }

    static void a(ks.b.b b1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = b1.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, b1.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, b1.g());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, b1.h(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, b1.i());
        }
        c.a(parcel, j);
    }

    public ks.b.b a(Parcel parcel)
    {
        int i = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int k = 0;
        int l = 0;
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
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new ks.b.b(hashset, l, k, s, i);
            }
        } while (true);
    }

    public ks.b.b[] a(int i)
    {
        return new ks.b.b[i];
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
