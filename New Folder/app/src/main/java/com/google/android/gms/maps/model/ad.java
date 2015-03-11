// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            VisibleRegion

public class ad
{

    static void a(VisibleRegion visibleregion, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, visibleregion.a());
        c.a(parcel, 2, visibleregion.a, i, false);
        c.a(parcel, 3, visibleregion.b, i, false);
        c.a(parcel, 4, visibleregion.c, i, false);
        c.a(parcel, 5, visibleregion.d, i, false);
        c.a(parcel, 6, visibleregion.e, i, false);
        c.a(parcel, j);
    }
}
