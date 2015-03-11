// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(LatLngBounds latlngbounds, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, latlngbounds.a());
        c.a(parcel, 2, latlngbounds.a, i, false);
        c.a(parcel, 3, latlngbounds.b, i, false);
        c.a(parcel, j);
    }

    public LatLngBounds a(Parcel parcel)
    {
        LatLng latlng;
        int i;
        int j;
        LatLng latlng1;
        latlng = null;
        i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        j = 0;
        latlng1 = null;
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
        LatLng latlng2;
        LatLng latlng3;
        int l;
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        latlng2 = latlng;
        latlng3 = latlng1;
        l = j;
_L7:
        j = l;
        latlng1 = latlng3;
        latlng = latlng2;
        if (true) goto _L6; else goto _L5
_L5:
        int i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        LatLng latlng5 = latlng;
        latlng3 = latlng1;
        l = i1;
        latlng2 = latlng5;
          goto _L7
_L3:
        LatLng latlng4 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
        l = j;
        latlng2 = latlng;
        latlng3 = latlng4;
          goto _L7
        latlng2 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
        latlng3 = latlng1;
        l = j;
          goto _L7
        if (parcel.dataPosition() != i)
        {
            throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            return new LatLngBounds(j, latlng1, latlng);
        }
    }

    public LatLngBounds[] a(int i)
    {
        return new LatLngBounds[i];
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
