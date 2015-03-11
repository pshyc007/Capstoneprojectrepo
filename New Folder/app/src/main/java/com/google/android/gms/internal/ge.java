// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kf, kg, ln

public class ge
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kf();
    private final int a;
    private String b;

    public ge()
    {
        this(1, null);
    }

    ge(int i, String s)
    {
        a = i;
        b = s;
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ge))
        {
            return false;
        } else
        {
            ge ge1 = (ge)obj;
            return kg.a(b, ge1.b);
        }
    }

    public int hashCode()
    {
        Object aobj[] = new Object[1];
        aobj[0] = b;
        return ln.a(aobj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kf.a(this, parcel, i);
    }

}
