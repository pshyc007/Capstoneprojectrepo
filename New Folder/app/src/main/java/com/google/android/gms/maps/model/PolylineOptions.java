// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            i, aa

public final class PolylineOptions
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    private final int a;
    private final List b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private boolean g;

    public PolylineOptions()
    {
        c = 10F;
        d = 0xff000000;
        e = 0.0F;
        f = true;
        g = false;
        a = 1;
        b = new ArrayList();
    }

    PolylineOptions(int j, List list, float f1, int k, float f2, boolean flag, boolean flag1)
    {
        c = 10F;
        d = 0xff000000;
        e = 0.0F;
        f = true;
        g = false;
        a = j;
        b = list;
        c = f1;
        d = k;
        e = f2;
        f = flag;
        g = flag1;
    }

    int a()
    {
        return a;
    }

    public List b()
    {
        return b;
    }

    public float c()
    {
        return c;
    }

    public int d()
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

    public boolean f()
    {
        return f;
    }

    public boolean g()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            aa.a(this, parcel, j);
            return;
        } else
        {
            i.a(this, parcel, j);
            return;
        }
    }

}
