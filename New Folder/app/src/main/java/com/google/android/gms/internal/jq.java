// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            nk, ln, lp, jm

public final class jq
    implements SafeParcelable
{

    public static final nk CREATOR = new nk();
    static final long a;
    final int b;
    private final jm c;
    private final long d;
    private final int e;

    public jq(int i, jm jm, long l, int j)
    {
        b = i;
        c = jm;
        d = l;
        e = j;
    }

    public jm a()
    {
        return c;
    }

    public long b()
    {
        return d;
    }

    public int c()
    {
        return e;
    }

    public int describeContents()
    {
        nk _tmp = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jq))
            {
                return false;
            }
            jq jq1 = (jq)obj;
            if (!ln.a(c, jq1.c) || d != jq1.d || e != jq1.e)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[3];
        aobj[0] = c;
        aobj[1] = Long.valueOf(d);
        aobj[2] = Integer.valueOf(e);
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("filter", c).a("interval", Long.valueOf(d)).a("priority", Integer.valueOf(e)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nk _tmp = CREATOR;
        nk.a(this, parcel, i);
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(1L);
    }
}
