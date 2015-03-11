// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.maps.model:
//            j, m, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    public final float a;
    public final float b;
    public final float c;
    private final int d;
    private StreetViewPanoramaOrientation e;

    StreetViewPanoramaCamera(int i, float f, float f1, float f2)
    {
        boolean flag;
        float f3;
        if (-90F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lr.b(flag, "Tilt needs to be between -90 and 90 inclusive");
        d = i;
        a = f;
        b = 0.0F + f1;
        if ((double)f2 <= 0.0D)
        {
            f3 = 360F + f2 % 360F;
        } else
        {
            f3 = f2;
        }
        c = f3 % 360F;
        e = (new m()).a(f1).b(f2).a();
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
            if (!(obj instanceof StreetViewPanoramaCamera))
            {
                return false;
            }
            StreetViewPanoramaCamera streetviewpanoramacamera = (StreetViewPanoramaCamera)obj;
            if (Float.floatToIntBits(a) != Float.floatToIntBits(streetviewpanoramacamera.a) || Float.floatToIntBits(b) != Float.floatToIntBits(streetviewpanoramacamera.b) || Float.floatToIntBits(c) != Float.floatToIntBits(streetviewpanoramacamera.c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[3];
        aobj[0] = Float.valueOf(a);
        aobj[1] = Float.valueOf(b);
        aobj[2] = Float.valueOf(c);
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("zoom", Float.valueOf(a)).a("tilt", Float.valueOf(b)).a("bearing", Float.valueOf(c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
