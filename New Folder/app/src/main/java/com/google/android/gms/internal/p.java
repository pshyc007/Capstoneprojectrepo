// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            ai, aw

public class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(ai ai1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, ai1.a);
        c.a(parcel, 2, ai1.b);
        c.a(parcel, 3, ai1.c, false);
        c.a(parcel, 4, ai1.d);
        c.a(parcel, 5, ai1.e, false);
        c.a(parcel, 6, ai1.f);
        c.a(parcel, 7, ai1.g);
        c.a(parcel, 8, ai1.h);
        c.a(parcel, 9, ai1.i, false);
        c.a(parcel, 10, ai1.j, i, false);
        c.a(parcel, 11, ai1.k, i, false);
        c.a(parcel, 12, ai1.l, false);
        c.a(parcel, 13, ai1.m, false);
        c.a(parcel, j);
    }

    public ai a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        long l = 0L;
        android.os.Bundle bundle = null;
        int k = 0;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int i1 = 0;
        boolean flag1 = false;
        String s = null;
        aw aw1 = null;
        Location location = null;
        String s1 = null;
        android.os.Bundle bundle1 = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.B(parcel, j1);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 7: // '\007'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 8: // '\b'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 10: // '\n'
                    aw1 = (aw)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, aw.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Location.CREATOR);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 13: // '\r'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new ai(j, l, bundle, k, arraylist, flag, i1, flag1, s, aw1, location, s1, bundle1);
            }
        } while (true);
    }

    public ai[] a(int i)
    {
        return new ai[i];
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
