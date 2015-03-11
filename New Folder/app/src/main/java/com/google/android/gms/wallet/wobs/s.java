// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            p, l, n

public class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(p p1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, p1.a());
        c.a(parcel, 2, p1.a, false);
        c.a(parcel, 3, p1.b, false);
        c.a(parcel, 4, p1.c, i, false);
        c.a(parcel, 5, p1.d, i, false);
        c.a(parcel, 6, p1.e, i, false);
        c.a(parcel, j);
    }

    public p a(Parcel parcel)
    {
        n n1 = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        n n2 = null;
        l l1 = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    l1 = (l)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, l.CREATOR);
                    break;

                case 5: // '\005'
                    n2 = (n)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, n.CREATOR);
                    break;

                case 6: // '\006'
                    n1 = (n)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, n.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new p(j, s2, s1, l1, n2, n1);
            }
        } while (true);
    }

    public p[] a(int i)
    {
        return new p[i];
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
