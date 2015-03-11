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

public class oc
    implements android.os.Parcelable.Creator
{

    public oc()
    {
    }

    static void a(ks.h h, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = h.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, h.f());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, h.h());
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, h.j(), true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, h.g(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, h.i());
        }
        c.a(parcel, j);
    }

    public ks.h a(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        int k = 0;
        String s1 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                case 2: // '\002'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new ks.h(hashset, l, s1, k, s, i);
            }
        } while (true);
    }

    public ks.h[] a(int i)
    {
        return new ks.h[i];
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
