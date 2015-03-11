// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds

public class w
{

    static void a(LatLngBounds latlngbounds, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, latlngbounds.a());
        c.a(parcel, 2, latlngbounds.a, i, false);
        c.a(parcel, 3, latlngbounds.b, i, false);
        c.a(parcel, j);
    }
}
