// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            jq, jm

public class nk
    implements android.os.Parcelable.Creator
{

    public nk()
    {
    }

    static void a(jq jq1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1000, jq1.b);
        c.a(parcel, 2, jq1.a(), i, false);
        c.a(parcel, 3, jq1.b());
        c.a(parcel, 4, jq1.c());
        c.a(parcel, j);
    }

    public jq a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        jm jm1 = null;
        long l = com.google.android.gms.internal.jq.a;
        int k = 102;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    jm1 = (jm)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, jm.CREATOR);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new jq(j, jm1, l, k);
            }
        } while (true);
    }

    public jq[] a(int i)
    {
        return new jq[i];
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
