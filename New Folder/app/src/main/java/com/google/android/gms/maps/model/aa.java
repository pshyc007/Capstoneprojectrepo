// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolylineOptions

public class aa
{

    static void a(PolylineOptions polylineoptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, polylineoptions.a());
        c.b(parcel, 2, polylineoptions.b(), false);
        c.a(parcel, 3, polylineoptions.c());
        c.a(parcel, 4, polylineoptions.d());
        c.a(parcel, 5, polylineoptions.e());
        c.a(parcel, 6, polylineoptions.f());
        c.a(parcel, 7, polylineoptions.g());
        c.a(parcel, j);
    }
}
