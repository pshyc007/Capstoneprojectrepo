// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;

// Referenced classes of package com.google.android.gms.location:
//            d

public final class LocationRequest
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    int a;
    long b;
    long c;
    boolean d;
    long e;
    int f;
    float g;
    private final int h;

    public LocationRequest()
    {
        h = 1;
        a = 102;
        b = 0x36ee80L;
        c = 0x927c0L;
        d = false;
        e = 0x7fffffffffffffffL;
        f = 0x7fffffff;
        g = 0.0F;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f1)
    {
        h = i;
        a = j;
        b = l;
        c = l1;
        d = flag;
        e = l2;
        f = k;
        g = f1;
    }

    public static String a(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            return "???";

        case 100: // 'd'
            return "PRIORITY_HIGH_ACCURACY";

        case 102: // 'f'
            return "PRIORITY_BALANCED_POWER_ACCURACY";

        case 104: // 'h'
            return "PRIORITY_LOW_POWER";

        case 105: // 'i'
            return "PRIORITY_NO_POWER";
        }
    }

    int a()
    {
        return h;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LocationRequest))
            {
                return false;
            }
            LocationRequest locationrequest = (LocationRequest)obj;
            if (a != locationrequest.a || b != locationrequest.b || c != locationrequest.c || d != locationrequest.d || e != locationrequest.e || f != locationrequest.f || g != locationrequest.g)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[7];
        aobj[0] = Integer.valueOf(a);
        aobj[1] = Long.valueOf(b);
        aobj[2] = Long.valueOf(c);
        aobj[3] = Boolean.valueOf(d);
        aobj[4] = Long.valueOf(e);
        aobj[5] = Integer.valueOf(f);
        aobj[6] = Float.valueOf(g);
        return ln.a(aobj);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(a(a));
        if (a != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(b).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(c).append("ms").toString());
        if (e != 0x7fffffffffffffffL)
        {
            long l = e - SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l).append("ms").toString());
        }
        if (f != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(f);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.d.a(this, parcel, i);
    }

}
