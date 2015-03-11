// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.maps.model:
//            k

public class StreetViewPanoramaLink
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    public final String a;
    public final float b;
    private final int c;

    StreetViewPanoramaLink(int i, String s, float f)
    {
        c = i;
        a = s;
        if ((double)f <= 0.0D)
        {
            f = 360F + f % 360F;
        }
        b = f % 360F;
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
            if (!(obj instanceof StreetViewPanoramaLink))
            {
                return false;
            }
            StreetViewPanoramaLink streetviewpanoramalink = (StreetViewPanoramaLink)obj;
            if (!a.equals(streetviewpanoramalink.a) || Float.floatToIntBits(b) != Float.floatToIntBits(streetviewpanoramalink.b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[2];
        aobj[0] = a;
        aobj[1] = Float.valueOf(b);
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("panoId", a).a("bearing", Float.valueOf(b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
