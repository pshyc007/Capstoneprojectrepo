// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.common.api:
//            e, a

public final class Status
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    private final int f;
    private final int g;
    private final String h;
    private final PendingIntent i;

    public Status(int j)
    {
        this(1, j, null, null);
    }

    Status(int j, int k, String s, PendingIntent pendingintent)
    {
        f = j;
        g = k;
        h = s;
        i = pendingintent;
    }

    private String e()
    {
        if (h != null)
        {
            return h;
        } else
        {
            return com.google.android.gms.common.api.a.a(g);
        }
    }

    PendingIntent a()
    {
        return i;
    }

    public String b()
    {
        return h;
    }

    int c()
    {
        return f;
    }

    public int d()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        Status status;
        if (obj instanceof Status)
        {
            if (f == (status = (Status)obj).f && g == status.g && ln.a(h, status.h) && ln.a(i, status.i))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[4];
        aobj[0] = Integer.valueOf(f);
        aobj[1] = Integer.valueOf(g);
        aobj[2] = h;
        aobj[3] = i;
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("statusCode", e()).a("resolution", i).toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.common.api.e.a(this, parcel, j);
    }

}
