// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptions

public class y
{

    static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, markeroptions.a());
        c.a(parcel, 2, markeroptions.c(), i, false);
        c.a(parcel, 3, markeroptions.d(), false);
        c.a(parcel, 4, markeroptions.e(), false);
        c.a(parcel, 5, markeroptions.b(), false);
        c.a(parcel, 6, markeroptions.f());
        c.a(parcel, 7, markeroptions.g());
        c.a(parcel, 8, markeroptions.h());
        c.a(parcel, 9, markeroptions.i());
        c.a(parcel, j);
    }
}
