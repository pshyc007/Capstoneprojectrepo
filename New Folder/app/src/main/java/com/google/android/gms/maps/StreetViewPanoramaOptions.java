// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            b

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    private final int a;
    private StreetViewPanoramaCamera b;
    private String c;
    private LatLng d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions()
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = 1;
    }

    StreetViewPanoramaOptions(int k, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = k;
        b = streetviewpanoramacamera;
        d = latlng;
        e = integer;
        c = s;
        f = com.google.android.gms.maps.a.a.a(byte0);
        g = com.google.android.gms.maps.a.a.a(byte1);
        h = com.google.android.gms.maps.a.a.a(byte2);
        i = com.google.android.gms.maps.a.a.a(byte3);
        j = com.google.android.gms.maps.a.a.a(byte4);
    }

    int a()
    {
        return a;
    }

    byte b()
    {
        return com.google.android.gms.maps.a.a.a(f);
    }

    byte c()
    {
        return com.google.android.gms.maps.a.a.a(g);
    }

    byte d()
    {
        return com.google.android.gms.maps.a.a.a(h);
    }

    public int describeContents()
    {
        return 0;
    }

    byte e()
    {
        return com.google.android.gms.maps.a.a.a(i);
    }

    byte f()
    {
        return com.google.android.gms.maps.a.a.a(j);
    }

    public StreetViewPanoramaCamera g()
    {
        return b;
    }

    public LatLng h()
    {
        return d;
    }

    public Integer i()
    {
        return e;
    }

    public String j()
    {
        return c;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.maps.b.a(this, parcel, k);
    }

}
