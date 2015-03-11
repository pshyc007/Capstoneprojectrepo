// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            i

public class MatchAllFilter
    implements SafeParcelable, a
{

    public static final i CREATOR = new i();
    final int a;

    public MatchAllFilter()
    {
        this(1);
    }

    MatchAllFilter(int j)
    {
        a = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.drive.query.internal.i.a(this, parcel, j);
    }

}
