// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;

// Referenced classes of package com.google.android.gms.drive.query:
//            b, SortOrder

public class Query
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final LogicalFilter a;
    final String b;
    final SortOrder c;
    final int d;

    Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder)
    {
        d = i;
        a = logicalfilter;
        b = s;
        c = sortorder;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.b.a(this, parcel, i);
    }

}
