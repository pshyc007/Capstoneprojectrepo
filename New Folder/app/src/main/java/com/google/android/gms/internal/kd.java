// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            fr, fi, fg

public class kd
    implements android.os.Parcelable.Creator
{

    public kd()
    {
    }

    static void a(fr fr1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, fr1.b, i, false);
        c.a(parcel, 1000, fr1.a);
        c.a(parcel, 2, fr1.c);
        c.a(parcel, 3, fr1.d);
        c.a(parcel, 4, fr1.e, false);
        c.a(parcel, 5, fr1.f, i, false);
        c.a(parcel, j);
    }

    public fr a(Parcel parcel)
    {
        int i = 0;
        fg fg1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long l = 0L;
        String s = null;
        fi fi1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    fi1 = (fi)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, fi.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    fg1 = (fg)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, fg.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new fr(k, fi1, l, i, s, fg1);
            }
        } while (true);
    }

    public fr[] a(int i)
    {
        return new fr[i];
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
