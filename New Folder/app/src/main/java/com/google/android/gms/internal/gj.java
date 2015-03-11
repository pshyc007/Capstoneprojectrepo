// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kh, ln

public class gj
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kh();
    private final int a;
    private double b;
    private boolean c;
    private int d;

    public gj()
    {
        this(1, (0.0D / 0.0D), false, -1);
    }

    gj(int i, double d1, boolean flag, int j)
    {
        a = i;
        b = d1;
        c = flag;
        d = j;
    }

    public int a()
    {
        return a;
    }

    public double b()
    {
        return b;
    }

    public boolean c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof gj))
            {
                return false;
            }
            gj gj1 = (gj)obj;
            if (b != gj1.b || c != gj1.c || d != gj1.d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[3];
        aobj[0] = Double.valueOf(b);
        aobj[1] = Boolean.valueOf(c);
        aobj[2] = Integer.valueOf(d);
        return ln.a(aobj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kh.a(this, parcel, i);
    }

}
