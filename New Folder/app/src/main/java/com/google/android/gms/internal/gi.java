// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            ds, ai, al, ev

public class gi
    implements android.os.Parcelable.Creator
{

    public gi()
    {
    }

    static void a(ds ds1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, ds1.a);
        c.a(parcel, 2, ds1.b, false);
        c.a(parcel, 3, ds1.c, i, false);
        c.a(parcel, 4, ds1.d, i, false);
        c.a(parcel, 5, ds1.e, false);
        c.a(parcel, 6, ds1.f, i, false);
        c.a(parcel, 7, ds1.g, i, false);
        c.a(parcel, 8, ds1.h, false);
        c.a(parcel, 9, ds1.i, false);
        c.a(parcel, 10, ds1.j, false);
        c.a(parcel, 11, ds1.k, i, false);
        c.a(parcel, 12, ds1.l, false);
        c.a(parcel, 13, ds1.m, false);
        c.a(parcel, j);
    }

    public ds a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        android.os.Bundle bundle = null;
        ai ai1 = null;
        al al1 = null;
        String s = null;
        ApplicationInfo applicationinfo = null;
        PackageInfo packageinfo = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        ev ev1 = null;
        android.os.Bundle bundle1 = null;
        String s4 = null;
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
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;

                case 3: // '\003'
                    ai1 = (ai)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ai.CREATOR);
                    break;

                case 4: // '\004'
                    al1 = (al)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, al.CREATOR);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 11: // '\013'
                    ev1 = (ev)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ev.CREATOR);
                    break;

                case 12: // '\f'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;

                case 13: // '\r'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new ds(j, bundle, ai1, al1, s, applicationinfo, packageinfo, s1, s2, s3, ev1, bundle1, s4);
            }
        } while (true);
    }

    public ds[] a(int i)
    {
        return new ds[i];
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
