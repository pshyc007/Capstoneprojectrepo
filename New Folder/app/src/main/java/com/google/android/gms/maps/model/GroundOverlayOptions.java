// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            d, a, v, LatLng, 
//            LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private final int a;
    private com.google.android.gms.maps.model.a b;
    private LatLng c;
    private float d;
    private float e;
    private LatLngBounds f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;

    public GroundOverlayOptions()
    {
        i = true;
        j = 0.0F;
        k = 0.5F;
        l = 0.5F;
        a = 1;
    }

    GroundOverlayOptions(int i1, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        i = true;
        j = 0.0F;
        k = 0.5F;
        l = 0.5F;
        a = i1;
        b = new com.google.android.gms.maps.model.a(com.google.android.gms.a.b.a(ibinder));
        c = latlng;
        d = f1;
        e = f2;
        f = latlngbounds;
        g = f3;
        h = f4;
        i = flag;
        j = f5;
        k = f6;
        l = f7;
    }

    IBinder a()
    {
        return b.a().asBinder();
    }

    int b()
    {
        return a;
    }

    public LatLng c()
    {
        return c;
    }

    public float d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public float e()
    {
        return e;
    }

    public LatLngBounds f()
    {
        return f;
    }

    public float g()
    {
        return g;
    }

    public float h()
    {
        return h;
    }

    public float i()
    {
        return j;
    }

    public float j()
    {
        return k;
    }

    public float k()
    {
        return l;
    }

    public boolean l()
    {
        return i;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            com.google.android.gms.maps.model.v.a(this, parcel, i1);
            return;
        } else
        {
            com.google.android.gms.maps.model.d.a(this, parcel, i1);
            return;
        }
    }

}
