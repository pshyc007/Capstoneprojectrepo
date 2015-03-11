// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            aw

public class an
    implements android.os.Parcelable.Creator
{

    public an()
    {
    }

    static void a(aw aw1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, aw1.a);
        c.a(parcel, 2, aw1.b);
        c.a(parcel, 3, aw1.c);
        c.a(parcel, 4, aw1.d);
        c.a(parcel, 5, aw1.e);
        c.a(parcel, 6, aw1.f);
        c.a(parcel, 7, aw1.g);
        c.a(parcel, 8, aw1.h);
        c.a(parcel, 9, aw1.i);
        c.a(parcel, 10, aw1.j, false);
        c.a(parcel, 11, aw1.k);
        c.a(parcel, 12, aw1.l, false);
        c.a(parcel, 13, aw1.m);
        c.a(parcel, 14, aw1.n);
        c.a(parcel, 15, aw1.o, false);
        c.a(parcel, j);
    }

    public aw a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        int j2 = 0;
        String s = null;
        int k2 = 0;
        String s1 = null;
        int l2 = 0;
        int i3 = 0;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int j3 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j3))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j3);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 4: // '\004'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 5: // '\005'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 7: // '\007'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 8: // '\b'
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 9: // '\t'
                    j2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j3);
                    break;

                case 11: // '\013'
                    k2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j3);
                    break;

                case 13: // '\r'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 14: // '\016'
                    i3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 15: // '\017'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new aw(j, k, l, i1, j1, k1, l1, i2, j2, s, k2, s1, l2, i3, s2);
            }
        } while (true);
    }

    public aw[] a(int i)
    {
        return new aw[i];
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
