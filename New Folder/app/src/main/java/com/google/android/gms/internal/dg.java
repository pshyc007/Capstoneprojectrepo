// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            ch, ce, ev, v

public class dg
    implements android.os.Parcelable.Creator
{

    public dg()
    {
    }

    static void a(ch ch1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, ch1.a);
        c.a(parcel, 2, ch1.b, i, false);
        c.a(parcel, 3, ch1.a(), false);
        c.a(parcel, 4, ch1.b(), false);
        c.a(parcel, 5, ch1.c(), false);
        c.a(parcel, 6, ch1.d(), false);
        c.a(parcel, 7, ch1.g, false);
        c.a(parcel, 8, ch1.h);
        c.a(parcel, 9, ch1.i, false);
        c.a(parcel, 10, ch1.f(), false);
        c.a(parcel, 11, ch1.k);
        c.a(parcel, 12, ch1.l);
        c.a(parcel, 13, ch1.m, false);
        c.a(parcel, 14, ch1.n, i, false);
        c.a(parcel, 15, ch1.e(), false);
        c.a(parcel, 17, ch1.q, i, false);
        c.a(parcel, 16, ch1.p, false);
        c.a(parcel, j);
    }

    public ch a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        ce ce1 = null;
        android.os.IBinder ibinder = null;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
        android.os.IBinder ibinder3 = null;
        String s = null;
        boolean flag = false;
        String s1 = null;
        android.os.IBinder ibinder4 = null;
        int k = 0;
        int l = 0;
        String s2 = null;
        ev ev1 = null;
        android.os.IBinder ibinder5 = null;
        String s3 = null;
        v v1 = null;
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

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    ce1 = (ce)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ce.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 12: // '\f'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 13: // '\r'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 14: // '\016'
                    ev1 = (ev)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ev.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder5 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 17: // '\021'
                    v1 = (v)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, v.CREATOR);
                    break;

                case 16: // '\020'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new ch(j, ce1, ibinder, ibinder1, ibinder2, ibinder3, s, flag, s1, ibinder4, k, l, s2, ev1, ibinder5, s3, v1);
            }
        } while (true);
    }

    public ch[] a(int i)
    {
        return new ch[i];
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
