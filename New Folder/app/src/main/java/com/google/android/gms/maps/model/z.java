// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions

public class z
{

    static void a(PolygonOptions polygonoptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, polygonoptions.a());
        c.b(parcel, 2, polygonoptions.c(), false);
        c.c(parcel, 3, polygonoptions.b(), false);
        c.a(parcel, 4, polygonoptions.d());
        c.a(parcel, 5, polygonoptions.e());
        c.a(parcel, 6, polygonoptions.f());
        c.a(parcel, 7, polygonoptions.g());
        c.a(parcel, 8, polygonoptions.h());
        c.a(parcel, 9, polygonoptions.i());
        c.a(parcel, j);
    }
}
