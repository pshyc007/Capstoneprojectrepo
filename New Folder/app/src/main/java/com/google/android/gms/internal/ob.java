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

public class ob
    implements android.os.Parcelable.Creator
{

    public ob()
    {
    }

    static void a(ks.g g, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = g.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, g.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, g.g());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, g.h(), true);
        }
        c.a(parcel, j);
    }

    public ks.g a(Parcel parcel)
    {
        boolean flag = false;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int j = 0;
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
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != i)
                {
                    throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
                }
                return new ks.g(hashset, j, flag, s);
            }
        } while (true);
    }

    public ks.g[] a(int i)
    {
        return new ks.g[i];
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
