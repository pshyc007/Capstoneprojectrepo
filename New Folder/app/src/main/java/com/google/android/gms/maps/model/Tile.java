// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            o, ab

public final class Tile
    implements SafeParcelable
{

    public static final o CREATOR = new o();
    public final int a;
    public final int b;
    public final byte c[];
    private final int d;

    Tile(int i, int j, int k, byte abyte0[])
    {
        d = i;
        a = j;
        b = k;
        c = abyte0;
    }

    public Tile(int i, int j, byte abyte0[])
    {
        this(1, i, j, abyte0);
    }

    int a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            ab.a(this, parcel, i);
            return;
        } else
        {
            o.a(this, parcel, i);
            return;
        }
    }

}
