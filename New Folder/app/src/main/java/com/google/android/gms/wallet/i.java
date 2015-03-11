// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet:
//            LineItem

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(LineItem lineitem, Parcel parcel, int j)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, lineitem.a());
        c.a(parcel, 2, lineitem.a, false);
        c.a(parcel, 3, lineitem.b, false);
        c.a(parcel, 4, lineitem.c, false);
        c.a(parcel, 5, lineitem.d, false);
        c.a(parcel, 6, lineitem.e);
        c.a(parcel, 7, lineitem.f, false);
        c.a(parcel, k);
    }

    public LineItem a(Parcel parcel)
    {
        int j = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new LineItem(l, s4, s3, s2, s1, j, s);
            }
        } while (true);
    }

    public LineItem[] a(int j)
    {
        return new LineItem[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
