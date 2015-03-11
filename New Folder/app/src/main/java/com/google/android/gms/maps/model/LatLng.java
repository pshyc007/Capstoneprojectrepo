// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            f, x

public final class LatLng
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    public final double a;
    public final double b;
    private final int c;

    LatLng(int i, double d, double d1)
    {
        c = i;
        if (-180D <= d1 && d1 < 180D)
        {
            b = d1;
        } else
        {
            b = (360D + (d1 - 180D) % 360D) % 360D - 180D;
        }
        a = Math.max(-90D, Math.min(90D, d));
    }

    int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLng))
            {
                return false;
            }
            LatLng latlng = (LatLng)obj;
            if (Double.doubleToLongBits(a) != Double.doubleToLongBits(latlng.a) || Double.doubleToLongBits(b) != Double.doubleToLongBits(latlng.b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(a);
        int i = 31 + (int)(l ^ l >>> 32);
        long l1 = Double.doubleToLongBits(b);
        return i * 31 + (int)(l1 ^ l1 >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder()).append("lat/lng: (").append(a).append(",").append(b).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            x.a(this, parcel, i);
            return;
        } else
        {
            f.a(this, parcel, i);
            return;
        }
    }

}
