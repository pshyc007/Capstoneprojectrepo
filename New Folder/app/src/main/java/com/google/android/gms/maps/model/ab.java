// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            Tile

public class ab
{

    static void a(Tile tile, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, tile.a());
        c.a(parcel, 2, tile.a);
        c.a(parcel, 3, tile.b);
        c.a(parcel, 4, tile.c, false);
        c.a(parcel, j);
    }
}
