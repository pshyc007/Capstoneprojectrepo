// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptions, LatLng

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, circleoptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, circleoptions.b(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, circleoptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, circleoptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, circleoptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, circleoptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, circleoptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, circleoptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }

    public CircleOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        LatLng latlng = null;
        double d = 0.0D;
        int j = 0;
        int k = 0;
        float f1 = 0.0F;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new CircleOptions(l, latlng, d, f1, k, j, f, flag);
            }
        } while (true);
    }

    public CircleOptions[] a(int i)
    {
        return new CircleOptions[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
