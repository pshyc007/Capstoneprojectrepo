// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import com.google.android.gms.internal.lr;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            b, LatLng, t

public final class CameraPosition
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.model.b CREATOR = new com.google.android.gms.maps.model.b();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        lr.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lr.b(flag, "Tilt needs to be between 0 and 90 inclusive");
        e = i;
        a = latlng;
        b = f;
        c = f1 + 0.0F;
        if ((double)f2 <= 0.0D)
        {
            f2 = 360F + f2 % 360F;
        }
        d = f2 % 360F;
    }

    int a()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof CameraPosition))
            {
                return false;
            }
            CameraPosition cameraposition = (CameraPosition)obj;
            if (!a.equals(cameraposition.a) || Float.floatToIntBits(b) != Float.floatToIntBits(cameraposition.b) || Float.floatToIntBits(c) != Float.floatToIntBits(cameraposition.c) || Float.floatToIntBits(d) != Float.floatToIntBits(cameraposition.d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[4];
        aobj[0] = a;
        aobj[1] = Float.valueOf(b);
        aobj[2] = Float.valueOf(c);
        aobj[3] = Float.valueOf(d);
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("target", a).a("zoom", Float.valueOf(b)).a("tilt", Float.valueOf(c)).a("bearing", Float.valueOf(d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            t.a(this, parcel, i);
            return;
        } else
        {
            com.google.android.gms.maps.model.b.a(this, parcel, i);
            return;
        }
    }

}
