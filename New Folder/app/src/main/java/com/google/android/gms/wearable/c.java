// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;

// Referenced classes of package com.google.android.gms.wearable:
//            e

public class c
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final boolean f;

    c(int i, String s, String s1, int j, int k, boolean flag)
    {
        a = i;
        b = s;
        c = s1;
        d = j;
        e = k;
        f = flag;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public int d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        c c1;
        if (obj instanceof c)
        {
            if (ln.a(Integer.valueOf(a), Integer.valueOf((c1 = (c)obj).a)) && ln.a(b, c1.b) && ln.a(c, c1.c) && ln.a(Integer.valueOf(d), Integer.valueOf(c1.d)) && ln.a(Integer.valueOf(e), Integer.valueOf(c1.e)) && ln.a(Boolean.valueOf(f), Boolean.valueOf(c1.f)))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[6];
        aobj[0] = Integer.valueOf(a);
        aobj[1] = b;
        aobj[2] = c;
        aobj[3] = Integer.valueOf(d);
        aobj[4] = Integer.valueOf(e);
        aobj[5] = Boolean.valueOf(f);
        return ln.a(aobj);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder()).append("mName=").append(b).toString());
        stringbuilder.append((new StringBuilder()).append(", mAddress=").append(c).toString());
        stringbuilder.append((new StringBuilder()).append(", mType=").append(d).toString());
        stringbuilder.append((new StringBuilder()).append(", mRole=").append(e).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(f).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wearable.e.a(this, parcel, i);
    }

}
