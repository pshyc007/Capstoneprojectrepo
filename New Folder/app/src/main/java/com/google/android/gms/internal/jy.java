// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            fk, fp

public class jy
    implements android.os.Parcelable.Creator
{

    public jy()
    {
    }

    static void a(fk fk1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, fk1.c, false);
        c.a(parcel, 1000, fk1.b);
        c.a(parcel, 3, fk1.d, i, false);
        c.a(parcel, 4, fk1.e);
        c.a(parcel, 5, fk1.f, false);
        c.a(parcel, j);
    }

    public fk a(Parcel parcel)
    {
        byte abyte0[] = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        int k = -1;
        fp fp1 = null;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    fp1 = (fp)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, fp.CREATOR);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new fk(j, s, fp1, k, abyte0);
            }
        } while (true);
    }

    public fk[] a(int i)
    {
        return new fk[i];
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
