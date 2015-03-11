// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.mf;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            CommonWalletObject, p, l, d, 
//            j, n

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(CommonWalletObject commonwalletobject, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, commonwalletobject.b());
        c.a(parcel, 2, commonwalletobject.a, false);
        c.a(parcel, 3, commonwalletobject.b, false);
        c.a(parcel, 4, commonwalletobject.c, false);
        c.a(parcel, 5, commonwalletobject.d, false);
        c.a(parcel, 6, commonwalletobject.e, false);
        c.a(parcel, 7, commonwalletobject.f, false);
        c.a(parcel, 8, commonwalletobject.g, false);
        c.a(parcel, 9, commonwalletobject.h, false);
        c.a(parcel, 10, commonwalletobject.i);
        c.b(parcel, 11, commonwalletobject.j, false);
        c.a(parcel, 12, commonwalletobject.k, i, false);
        c.b(parcel, 13, commonwalletobject.l, false);
        c.a(parcel, 14, commonwalletobject.m, false);
        c.a(parcel, 15, commonwalletobject.n, false);
        c.a(parcel, 17, commonwalletobject.p);
        c.b(parcel, 16, commonwalletobject.o, false);
        c.b(parcel, 19, commonwalletobject.r, false);
        c.b(parcel, 18, commonwalletobject.q, false);
        c.b(parcel, 20, commonwalletobject.s, false);
        c.a(parcel, k);
    }

    public CommonWalletObject a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        int i1 = 0;
        java.util.ArrayList arraylist = mf.a();
        l l1 = null;
        java.util.ArrayList arraylist1 = mf.a();
        String s8 = null;
        String s9 = null;
        java.util.ArrayList arraylist2 = mf.a();
        boolean flag = false;
        java.util.ArrayList arraylist3 = mf.a();
        java.util.ArrayList arraylist4 = mf.a();
        java.util.ArrayList arraylist5 = mf.a();
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
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 6: // '\006'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 7: // '\007'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 8: // '\b'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 9: // '\t'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 10: // '\n'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 11: // '\013'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, p.CREATOR);
                    break;

                case 12: // '\f'
                    l1 = (l)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, l.CREATOR);
                    break;

                case 13: // '\r'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, LatLng.CREATOR);
                    break;

                case 14: // '\016'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 15: // '\017'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 16: // '\020'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, d.CREATOR);
                    break;

                case 19: // '\023'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, j.CREATOR);
                    break;

                case 18: // '\022'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, n.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, n.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new CommonWalletObject(k, s, s1, s2, s3, s4, s5, s6, s7, i1, arraylist, l1, arraylist1, s8, s9, arraylist2, flag, arraylist3, arraylist4, arraylist5);
            }
        } while (true);
    }

    public CommonWalletObject[] a(int i)
    {
        return new CommonWalletObject[i];
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
