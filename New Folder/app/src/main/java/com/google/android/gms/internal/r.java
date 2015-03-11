// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            al

public class r
    implements android.os.Parcelable.Creator
{

    public r()
    {
    }

    static void a(al al1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, al1.a);
        c.a(parcel, 2, al1.b, false);
        c.a(parcel, 3, al1.c);
        c.a(parcel, 4, al1.d);
        c.a(parcel, 5, al1.e);
        c.a(parcel, 6, al1.f);
        c.a(parcel, 7, al1.g);
        c.a(parcel, 8, al1.h, i, false);
        c.a(parcel, j);
    }

    public al a(Parcel parcel)
    {
        al aal[] = null;
        int i = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        boolean flag = false;
        int l = 0;
        int i1 = 0;
        String s = null;
        int j1 = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k1);
                    break;

                case 3: // '\003'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 6: // '\006'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 8: // '\b'
                    aal = (al[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1, al.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new al(j1, s, i1, l, flag, k, i, aal);
            }
        } while (true);
    }

    public al[] a(int i)
    {
        return new al[i];
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
