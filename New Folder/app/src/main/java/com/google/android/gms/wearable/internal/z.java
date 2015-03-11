// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, ai

public class z
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public final int a;
    public final int b;
    public final ai c;

    z(int i, int j, ai ai)
    {
        a = i;
        b = j;
        c = ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wearable.internal.a.a(this, parcel, i);
    }

}
