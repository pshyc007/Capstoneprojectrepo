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

public class oa
    implements android.os.Parcelable.Creator
{

    public oa()
    {
    }

    static void a(ks.f f, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = f.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, f.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, f.g(), true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, f.h(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, f.i(), true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, f.j(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, f.k(), true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, f.l());
        }
        if (set.contains(Integer.valueOf(8)))
        {
            c.a(parcel, 8, f.m(), true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            c.a(parcel, 9, f.n(), true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            c.a(parcel, 10, f.o());
        }
        c.a(parcel, j);
    }

    public ks.f a(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        boolean flag = false;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
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
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(10));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new ks.f(hashset, k, s6, s5, s4, s3, s2, flag, s1, s, i);
            }
        } while (true);
    }

    public ks.f[] a(int i)
    {
        return new ks.f[i];
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
