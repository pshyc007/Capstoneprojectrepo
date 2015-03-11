// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaCamera

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, streetviewpanoramacamera.a());
        c.a(parcel, 2, streetviewpanoramacamera.a);
        c.a(parcel, 3, streetviewpanoramacamera.b);
        c.a(parcel, 4, streetviewpanoramacamera.c);
        c.a(parcel, k);
    }

    public StreetViewPanoramaCamera a(Parcel parcel)
    {
        float f = 0.0F;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        float f1 = 0.0F;
        int k = 0;
        float f2 = 0.0F;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    f2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 4: // '\004'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaCamera(k, f1, f2, f);
            }
        } while (true);
    }

    public StreetViewPanoramaCamera[] a(int i)
    {
        return new StreetViewPanoramaCamera[i];
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
