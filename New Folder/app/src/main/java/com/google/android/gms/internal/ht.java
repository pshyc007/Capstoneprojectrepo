// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            lu, hv, lx

public class ht
    implements SafeParcelable
{

    public static final lu CREATOR = new lu();
    private final int a;
    private final hv b;

    ht(int i, hv hv1)
    {
        a = i;
        b = hv1;
    }

    private ht(hv hv1)
    {
        a = 1;
        b = hv1;
    }

    public static ht a(lx lx)
    {
        if (lx instanceof hv)
        {
            return new ht((hv)lx);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    int a()
    {
        return a;
    }

    hv b()
    {
        return b;
    }

    public lx c()
    {
        if (b != null)
        {
            return b;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    public int describeContents()
    {
        lu _tmp = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lu _tmp = CREATOR;
        lu.a(this, parcel, i);
    }

}
