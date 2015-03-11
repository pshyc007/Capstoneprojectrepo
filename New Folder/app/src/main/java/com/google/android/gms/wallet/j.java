// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.mf;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.d;
import com.google.android.gms.wallet.wobs.f;
import com.google.android.gms.wallet.wobs.l;
import com.google.android.gms.wallet.wobs.n;
import com.google.android.gms.wallet.wobs.p;

// Referenced classes of package com.google.android.gms.wallet:
//            LoyaltyWalletObject

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(LoyaltyWalletObject loyaltywalletobject, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, loyaltywalletobject.a());
        c.a(parcel, 2, loyaltywalletobject.a, false);
        c.a(parcel, 3, loyaltywalletobject.b, false);
        c.a(parcel, 4, loyaltywalletobject.c, false);
        c.a(parcel, 5, loyaltywalletobject.d, false);
        c.a(parcel, 6, loyaltywalletobject.e, false);
        c.a(parcel, 7, loyaltywalletobject.f, false);
        c.a(parcel, 8, loyaltywalletobject.g, false);
        c.a(parcel, 9, loyaltywalletobject.h, false);
        c.a(parcel, 10, loyaltywalletobject.i, false);
        c.a(parcel, 11, loyaltywalletobject.j, false);
        c.a(parcel, 12, loyaltywalletobject.k);
        c.b(parcel, 13, loyaltywalletobject.l, false);
        c.a(parcel, 14, loyaltywalletobject.m, i, false);
        c.b(parcel, 15, loyaltywalletobject.n, false);
        c.a(parcel, 17, loyaltywalletobject.p, false);
        c.a(parcel, 16, loyaltywalletobject.o, false);
        c.a(parcel, 19, loyaltywalletobject.r);
        c.b(parcel, 18, loyaltywalletobject.q, false);
        c.b(parcel, 21, loyaltywalletobject.t, false);
        c.b(parcel, 20, loyaltywalletobject.s, false);
        c.a(parcel, 23, loyaltywalletobject.v, i, false);
        c.b(parcel, 22, loyaltywalletobject.u, false);
        c.a(parcel, k);
    }

    public LoyaltyWalletObject a(Parcel parcel)
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
        String s8 = null;
        String s9 = null;
        int i1 = 0;
        java.util.ArrayList arraylist = mf.a();
        l l1 = null;
        java.util.ArrayList arraylist1 = mf.a();
        String s10 = null;
        String s11 = null;
        java.util.ArrayList arraylist2 = mf.a();
        boolean flag = false;
        java.util.ArrayList arraylist3 = mf.a();
        java.util.ArrayList arraylist4 = mf.a();
        java.util.ArrayList arraylist5 = mf.a();
        f f1 = null;
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
                    s8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 11: // '\013'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 12: // '\f'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 13: // '\r'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, p.CREATOR);
                    break;

                case 14: // '\016'
                    l1 = (l)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, l.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, LatLng.CREATOR);
                    break;

                case 17: // '\021'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 16: // '\020'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 18: // '\022'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, d.CREATOR);
                    break;

                case 21: // '\025'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, com.google.android.gms.wallet.wobs.j.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, n.CREATOR);
                    break;

                case 23: // '\027'
                    f1 = (f)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, f.CREATOR);
                    break;

                case 22: // '\026'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, n.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(k, s, s1, s2, s3, s4, s5, s6, s7, s8, s9, i1, arraylist, l1, arraylist1, s10, s11, arraylist2, flag, arraylist3, arraylist4, arraylist5, f1);
            }
        } while (true);
    }

    public LoyaltyWalletObject[] a(int i)
    {
        return new LoyaltyWalletObject[i];
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
