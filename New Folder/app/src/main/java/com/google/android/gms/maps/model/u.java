// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptions

public class u
{

    static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, circleoptions.a());
        c.a(parcel, 2, circleoptions.b(), i, false);
        c.a(parcel, 3, circleoptions.c());
        c.a(parcel, 4, circleoptions.d());
        c.a(parcel, 5, circleoptions.e());
        c.a(parcel, 6, circleoptions.f());
        c.a(parcel, 7, circleoptions.g());
        c.a(parcel, 8, circleoptions.h());
        c.a(parcel, j);
    }
}
