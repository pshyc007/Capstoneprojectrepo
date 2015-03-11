// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.plus.internal:
//            a

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    public static String a = "PlusCommonExtras";
    private final int b;
    private String c;
    private String d;

    public PlusCommonExtras()
    {
        b = 1;
        c = "";
        d = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        b = i;
        c = s;
        d = s1;
    }

    public int a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        PlusCommonExtras pluscommonextras;
        if (obj instanceof PlusCommonExtras)
        {
            if (b == (pluscommonextras = (PlusCommonExtras)obj).b && ln.a(c, pluscommonextras.c) && ln.a(d, pluscommonextras.d))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[3];
        aobj[0] = Integer.valueOf(b);
        aobj[1] = c;
        aobj[2] = d;
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("versionCode", Integer.valueOf(b)).a("Gpsrc", c).a("ClientCallingPackage", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.plus.internal.a.a(this, parcel, i);
    }

}
