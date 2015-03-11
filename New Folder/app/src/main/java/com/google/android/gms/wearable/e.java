// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wearable:
//            c

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(com.google.android.gms.wearable.c c1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, c1.a);
        c.a(parcel, 2, c1.a(), false);
        c.a(parcel, 3, c1.b(), false);
        c.a(parcel, 4, c1.c());
        c.a(parcel, 5, c1.d());
        c.a(parcel, 6, c1.e());
        c.a(parcel, j);
    }

    public com.google.android.gms.wearable.c a(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        int k = 0;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new com.google.android.gms.wearable.c(l, s1, s, k, j, flag);
            }
        } while (true);
    }

    public com.google.android.gms.wearable.c[] a(int i)
    {
        return new com.google.android.gms.wearable.c[i];
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
