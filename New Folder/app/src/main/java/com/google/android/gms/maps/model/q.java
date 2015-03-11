// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, tileoverlayoptions.a());
        c.a(parcel, 2, tileoverlayoptions.b(), false);
        c.a(parcel, 3, tileoverlayoptions.d());
        c.a(parcel, 4, tileoverlayoptions.c());
        c.a(parcel, 5, tileoverlayoptions.e());
        c.a(parcel, j);
    }

    public TileOverlayOptions a(Parcel parcel)
    {
        boolean flag = false;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag1 = true;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 5: // '\005'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(j, ibinder, flag, f, flag1);
            }
        } while (true);
    }

    public TileOverlayOptions[] a(int i)
    {
        return new TileOverlayOptions[i];
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
