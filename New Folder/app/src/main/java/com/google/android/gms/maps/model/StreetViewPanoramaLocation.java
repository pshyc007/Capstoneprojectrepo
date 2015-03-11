// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.maps.model:
//            l, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation
    implements SafeParcelable
{

    public static final l CREATOR = new l();
    public final StreetViewPanoramaLink a[];
    public final LatLng b;
    public final String c;
    private final int d;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s)
    {
        d = i;
        a = astreetviewpanoramalink;
        b = latlng;
        c = s;
    }

    int a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaLocation))
            {
                return false;
            }
            StreetViewPanoramaLocation streetviewpanoramalocation = (StreetViewPanoramaLocation)obj;
            if (!c.equals(streetviewpanoramalocation.c) || !b.equals(streetviewpanoramalocation.b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[2];
        aobj[0] = b;
        aobj[1] = c;
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("panoId", c).a("position", b.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
