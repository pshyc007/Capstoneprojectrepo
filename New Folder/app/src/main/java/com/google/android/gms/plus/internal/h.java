// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            b, PlusCommonExtras

public class h
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    private final int a;
    private final String b;
    private final String c[];
    private final String d[];
    private final String e[];
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final PlusCommonExtras j;

    h(int k, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        a = k;
        b = s;
        c = as;
        d = as1;
        e = as2;
        f = s1;
        g = s2;
        h = s3;
        i = s4;
        j = pluscommonextras;
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String[] c()
    {
        return c;
    }

    public String[] d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String[] e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        h h1;
        if (obj instanceof h)
        {
            if (a == (h1 = (h)obj).a && ln.a(b, h1.b) && Arrays.equals(c, h1.c) && Arrays.equals(d, h1.d) && Arrays.equals(e, h1.e) && ln.a(f, h1.f) && ln.a(g, h1.g) && ln.a(h, h1.h) && ln.a(i, h1.i) && ln.a(j, h1.j))
            {
                return true;
            }
        }
        return false;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[10];
        aobj[0] = Integer.valueOf(a);
        aobj[1] = b;
        aobj[2] = c;
        aobj[3] = d;
        aobj[4] = e;
        aobj[5] = f;
        aobj[6] = g;
        aobj[7] = h;
        aobj[8] = i;
        aobj[9] = j;
        return ln.a(aobj);
    }

    public String i()
    {
        return i;
    }

    public PlusCommonExtras j()
    {
        return j;
    }

    public String toString()
    {
        return ln.a(this).a("versionCode", Integer.valueOf(a)).a("accountName", b).a("requestedScopes", c).a("visibleActivities", d).a("requiredFeatures", e).a("packageNameForAuth", f).a("callingPackageName", g).a("applicationName", h).a("extra", j.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.plus.internal.b.a(this, parcel, k);
    }

}
