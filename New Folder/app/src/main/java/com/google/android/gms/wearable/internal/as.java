// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            l

public class as
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    public final int a;
    public final int b;
    public final long c;
    public final List d;

    as(int i, int j, long l1, List list)
    {
        a = i;
        b = j;
        c = l1;
        d = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
