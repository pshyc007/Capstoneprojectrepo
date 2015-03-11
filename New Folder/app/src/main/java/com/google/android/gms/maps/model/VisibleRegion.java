// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            s, LatLng, LatLngBounds, ad

public final class VisibleRegion
    implements SafeParcelable
{

    public static final s CREATOR = new s();
    public final LatLng a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLngBounds e;
    private final int f;

    VisibleRegion(int i, LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        f = i;
        a = latlng;
        b = latlng1;
        c = latlng2;
        d = latlng3;
        e = latlngbounds;
    }

    int a()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof VisibleRegion))
            {
                return false;
            }
            VisibleRegion visibleregion = (VisibleRegion)obj;
            if (!a.equals(visibleregion.a) || !b.equals(visibleregion.b) || !c.equals(visibleregion.c) || !d.equals(visibleregion.d) || !e.equals(visibleregion.e))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[5];
        aobj[0] = a;
        aobj[1] = b;
        aobj[2] = c;
        aobj[3] = d;
        aobj[4] = e;
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("nearLeft", a).a("nearRight", b).a("farLeft", c).a("farRight", d).a("latLngBounds", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            ad.a(this, parcel, i);
            return;
        } else
        {
            s.a(this, parcel, i);
            return;
        }
    }

}
