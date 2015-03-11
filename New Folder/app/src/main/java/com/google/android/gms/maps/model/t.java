// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition

public class t
{

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, cameraposition.a());
        c.a(parcel, 2, cameraposition.a, i, false);
        c.a(parcel, 3, cameraposition.b);
        c.a(parcel, 4, cameraposition.c);
        c.a(parcel, 5, cameraposition.d);
        c.a(parcel, j);
    }
}
