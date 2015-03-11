// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            q, p, ac, r

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    private final int a;
    private a b;
    private r c;
    private boolean d;
    private float e;
    private boolean f;

    public TileOverlayOptions()
    {
        d = true;
        f = true;
        a = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f1, boolean flag1)
    {
        d = true;
        f = true;
        a = i;
        b = com.google.android.gms.maps.model.a.b.a(ibinder);
        Object obj;
        if (b == null)
        {
            obj = null;
        } else
        {
            obj = new p(this);
        }
        c = ((r) (obj));
        d = flag;
        e = f1;
        f = flag1;
    }

    static a a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    int a()
    {
        return a;
    }

    IBinder b()
    {
        return b.asBinder();
    }

    public float c()
    {
        return e;
    }

    public boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            com.google.android.gms.maps.model.ac.a(this, parcel, i);
            return;
        } else
        {
            com.google.android.gms.maps.model.q.a(this, parcel, i);
            return;
        }
    }

}
