// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            f, g, l

public class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    static void a(f f1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, f1.a());
        c.a(parcel, 2, f1.a, false);
        c.a(parcel, 3, f1.b, i, false);
        c.a(parcel, 4, f1.c, false);
        c.a(parcel, 5, f1.d, i, false);
        c.a(parcel, j);
    }

    public f a(Parcel parcel)
    {
        l l1 = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        String s = null;
        g g1 = null;
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
                    g1 = (g)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, g.CREATOR);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    l1 = (l)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, l.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new f(j, s1, g1, s, l1);
            }
        } while (true);
    }

    public f[] a(int i)
    {
        return new f[i];
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
