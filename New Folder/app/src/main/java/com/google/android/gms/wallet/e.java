// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet:
//            d, LoyaltyWalletObject, OfferWalletObject

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(d d1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, d1.a());
        c.a(parcel, 2, d1.a, i, false);
        c.a(parcel, 3, d1.b, i, false);
        c.a(parcel, j);
    }

    public d a(Parcel parcel)
    {
        OfferWalletObject offerwalletobject;
        int i;
        int j;
        LoyaltyWalletObject loyaltywalletobject;
        offerwalletobject = null;
        i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        j = 0;
        loyaltywalletobject = null;
_L6:
        int k;
        if (parcel.dataPosition() >= i)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        com.google.android.gms.common.internal.safeparcel.a.a(k);
        JVM INSTR tableswitch 1 3: default 60
    //                   1 91
    //                   2 117
    //                   3 145;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_145;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        OfferWalletObject offerwalletobject1;
        LoyaltyWalletObject loyaltywalletobject1;
        int l;
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        offerwalletobject1 = offerwalletobject;
        loyaltywalletobject1 = loyaltywalletobject;
        l = j;
_L7:
        j = l;
        loyaltywalletobject = loyaltywalletobject1;
        offerwalletobject = offerwalletobject1;
        if (true) goto _L6; else goto _L5
_L5:
        int i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        OfferWalletObject offerwalletobject2 = offerwalletobject;
        loyaltywalletobject1 = loyaltywalletobject;
        l = i1;
        offerwalletobject1 = offerwalletobject2;
          goto _L7
_L3:
        LoyaltyWalletObject loyaltywalletobject2 = (LoyaltyWalletObject)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LoyaltyWalletObject.CREATOR);
        l = j;
        offerwalletobject1 = offerwalletobject;
        loyaltywalletobject1 = loyaltywalletobject2;
          goto _L7
        offerwalletobject1 = (OfferWalletObject)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, OfferWalletObject.CREATOR);
        loyaltywalletobject1 = loyaltywalletobject;
        l = j;
          goto _L7
        if (parcel.dataPosition() != i)
        {
            throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            return new d(j, loyaltywalletobject, offerwalletobject);
        }
    }

    public d[] a(int i)
    {
        return new d[i];
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
