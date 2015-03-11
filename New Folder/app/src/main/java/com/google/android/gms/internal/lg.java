// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            od

public final class lg
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new od();
    int a[];
    private final int b;

    lg()
    {
        this(1, null);
    }

    lg(int i, int ai[])
    {
        b = i;
        a = ai;
    }

    public int a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        od.a(this, parcel, i);
    }

}
