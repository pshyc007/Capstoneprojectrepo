// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesRemovedDetails

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(ValuesRemovedDetails valuesremoveddetails, Parcel parcel, int j)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, valuesremoveddetails.a);
        c.a(parcel, 2, valuesremoveddetails.b);
        c.a(parcel, 3, valuesremoveddetails.c);
        c.a(parcel, 4, valuesremoveddetails.d);
        c.a(parcel, 5, valuesremoveddetails.e, false);
        c.a(parcel, 6, valuesremoveddetails.f);
        c.a(parcel, k);
    }

    public ValuesRemovedDetails a(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s = null;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
                    break;

                case 1: // '\001'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 2: // '\002'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 3: // '\003'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ValuesRemovedDetails(k1, j1, i1, l, s, j);
            }
        } while (true);
    }

    public ValuesRemovedDetails[] a(int j)
    {
        return new ValuesRemovedDetails[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
