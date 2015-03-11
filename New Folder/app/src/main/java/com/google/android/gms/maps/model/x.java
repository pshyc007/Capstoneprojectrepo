// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public class x
{

    static void a(LatLng latlng, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, latlng.a());
        c.a(parcel, 2, latlng.a);
        c.a(parcel, 3, latlng.b);
        c.a(parcel, j);
    }
}
