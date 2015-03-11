// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            jm, js, jw

public class ni
    implements android.os.Parcelable.Creator
{

    public ni()
    {
    }

    static void a(jm jm1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.b(parcel, 1, jm1.b, false);
        c.a(parcel, 1000, jm1.a);
        c.a(parcel, 2, jm1.a(), false);
        c.a(parcel, 3, jm1.b());
        c.b(parcel, 4, jm1.c, false);
        c.a(parcel, 5, jm1.c(), false);
        c.a(parcel, 6, jm1.d, false);
        c.a(parcel, j);
    }

    public jm a(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s = null;
        java.util.ArrayList arraylist1 = null;
        String s1 = null;
        java.util.ArrayList arraylist2 = null;
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
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, js.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, jw.CREATOR);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.B(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new jm(j, arraylist2, s1, flag, arraylist1, s, arraylist);
            }
        } while (true);
    }

    public jm[] a(int i)
    {
        return new jm[i];
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
