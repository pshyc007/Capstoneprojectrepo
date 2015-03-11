// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public class ac
{

    static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, tileoverlayoptions.a());
        c.a(parcel, 2, tileoverlayoptions.b(), false);
        c.a(parcel, 3, tileoverlayoptions.d());
        c.a(parcel, 4, tileoverlayoptions.c());
        c.a(parcel, j);
    }
}
