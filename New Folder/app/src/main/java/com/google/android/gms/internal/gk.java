// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            du

public class gk
    implements android.os.Parcelable.Creator
{

    public gk()
    {
    }

    static void a(du du1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, du1.a);
        c.a(parcel, 2, du1.b, false);
        c.a(parcel, 3, du1.c, false);
        c.a(parcel, 4, du1.d, false);
        c.a(parcel, 5, du1.e);
        c.a(parcel, 6, du1.f, false);
        c.a(parcel, 7, du1.g);
        c.a(parcel, 8, du1.h);
        c.a(parcel, 9, du1.i);
        c.a(parcel, 10, du1.j, false);
        c.a(parcel, 11, du1.k);
        c.a(parcel, 12, du1.l);
        c.a(parcel, 13, du1.m, false);
        c.a(parcel, 14, du1.n);
        c.a(parcel, 15, du1.o, false);
        c.a(parcel, 19, du1.q, false);
        c.a(parcel, 18, du1.p);
        c.a(parcel, 21, du1.r, false);
        c.a(parcel, j);
    }

    public du a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        String s = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        long l = 0L;
        boolean flag = false;
        long l1 = 0L;
        java.util.ArrayList arraylist2 = null;
        long l2 = 0L;
        int i1 = 0;
        String s2 = null;
        long l3 = 0L;
        String s3 = null;
        boolean flag1 = false;
        String s4 = null;
        String s5 = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j1))
                {
                case 16: // '\020'
                case 17: // '\021'
                case 20: // '\024'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.B(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, j1);
                    break;

                case 7: // '\007'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, j1);
                    break;

                case 11: // '\013'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 12: // '\f'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 13: // '\r'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 14: // '\016'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 15: // '\017'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 19: // '\023'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 18: // '\022'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 21: // '\025'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new du(j, s, s1, arraylist, k, arraylist1, l, flag, l1, arraylist2, l2, i1, s2, l3, s3, flag1, s4, s5);
            }
        } while (true);
    }

    public du[] a(int i)
    {
        return new du[i];
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
