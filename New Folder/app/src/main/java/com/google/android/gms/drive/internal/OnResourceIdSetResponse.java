// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            m

public class OnResourceIdSetResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    private final int a;
    private final List b;

    OnResourceIdSetResponse(int i, List list)
    {
        a = i;
        b = list;
    }

    public int a()
    {
        return a;
    }

    public List b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
