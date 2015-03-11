// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            ie, ib

public class me
    implements android.os.Parcelable.Creator
{

    public me()
    {
    }

    static void a(ie ie1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, ie1.a());
        c.a(parcel, 2, ie1.e(), false);
        c.a(parcel, 3, ie1.f(), i, false);
        c.a(parcel, j);
    }

    public ie a(Parcel parcel)
    {
        ib ib1 = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        Parcel parcel1 = null;
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
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;

                case 3: // '\003'
                    ib1 = (ib)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ib.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new ie(j, parcel1, ib1);
            }
        } while (true);
    }

    public ie[] a(int i)
    {
        return new ie[i];
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
