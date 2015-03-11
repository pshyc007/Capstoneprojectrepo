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

// Referenced classes of package com.google.android.gms.internal:
//            kp, kn

public class nr
    implements android.os.Parcelable.Creator
{

    public nr()
    {
    }

    static void a(kp kp1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = kp1.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, kp1.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, kp1.g(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, kp1.h(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, kp1.i(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, kp1.j(), i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, kp1.k(), true);
        }
        c.a(parcel, j);
    }

    public kp a(Parcel parcel)
    {
        String s = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        kn kn1 = null;
        String s1 = null;
        kn kn2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                case 3: // '\003'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    kn kn4 = (kn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, kn.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    kn2 = kn4;
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    kn kn3 = (kn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, kn.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    kn1 = kn3;
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
                return new kp(hashset, j, s2, kn2, s1, kn1, s);
            }
        } while (true);
    }

    public kp[] a(int i)
    {
        return new kp[i];
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
