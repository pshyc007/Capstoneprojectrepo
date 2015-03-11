// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            a, c

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.a CREATOR = new com.google.android.gms.maps.a();
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;

    public GoogleMapOptions()
    {
        d = -1;
        a = 1;
    }

    GoogleMapOptions(int l, byte byte0, byte byte1, int i1, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7)
    {
        d = -1;
        a = l;
        b = com.google.android.gms.maps.a.a.a(byte0);
        c = com.google.android.gms.maps.a.a.a(byte1);
        d = i1;
        e = cameraposition;
        f = com.google.android.gms.maps.a.a.a(byte2);
        g = com.google.android.gms.maps.a.a.a(byte3);
        h = com.google.android.gms.maps.a.a.a(byte4);
        i = com.google.android.gms.maps.a.a.a(byte5);
        j = com.google.android.gms.maps.a.a.a(byte6);
        k = com.google.android.gms.maps.a.a.a(byte7);
    }

    int a()
    {
        return a;
    }

    byte b()
    {
        return com.google.android.gms.maps.a.a.a(b);
    }

    byte c()
    {
        return com.google.android.gms.maps.a.a.a(c);
    }

    byte d()
    {
        return com.google.android.gms.maps.a.a.a(f);
    }

    public int describeContents()
    {
        return 0;
    }

    byte e()
    {
        return com.google.android.gms.maps.a.a.a(g);
    }

    byte f()
    {
        return com.google.android.gms.maps.a.a.a(h);
    }

    byte g()
    {
        return com.google.android.gms.maps.a.a.a(i);
    }

    byte h()
    {
        return com.google.android.gms.maps.a.a.a(j);
    }

    byte i()
    {
        return com.google.android.gms.maps.a.a.a(k);
    }

    public int j()
    {
        return d;
    }

    public CameraPosition k()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            com.google.android.gms.maps.c.a(this, parcel, l);
            return;
        } else
        {
            a(this, parcel, l);
            return;
        }
    }

}
