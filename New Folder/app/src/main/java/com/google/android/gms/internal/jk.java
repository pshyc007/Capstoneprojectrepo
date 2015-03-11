// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            nh, jm, ln, lp

public final class jk
    implements SafeParcelable
{

    public static final nh CREATOR = new nh();
    private final int a;
    private final int b;
    private final int c;
    private final jm d;

    jk(int i, int j, int k, jm jm1)
    {
        a = i;
        b = j;
        c = k;
        d = jm1;
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public jm d()
    {
        return d;
    }

    public int describeContents()
    {
        nh _tmp = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jk))
            {
                return false;
            }
            jk jk1 = (jk)obj;
            if (b != jk1.b || c != jk1.c || !d.equals(jk1.d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[2];
        aobj[0] = Integer.valueOf(b);
        aobj[1] = Integer.valueOf(c);
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("transitionTypes", Integer.valueOf(b)).a("loiteringTimeMillis", Integer.valueOf(c)).a("placeFilter", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nh _tmp = CREATOR;
        nh.a(this, parcel, i);
    }

}
