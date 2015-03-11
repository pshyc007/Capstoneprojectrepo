// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class c
{

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, googlemapoptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, googlemapoptions.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, googlemapoptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, googlemapoptions.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, googlemapoptions.k(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, googlemapoptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, googlemapoptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, googlemapoptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, googlemapoptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, googlemapoptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, googlemapoptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }
}
