// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            a, e, Operator

public class ComparisonFilter
    implements SafeParcelable, a
{

    public static final com.google.android.gms.drive.query.internal.a CREATOR = new com.google.android.gms.drive.query.internal.a();
    final Operator a;
    final MetadataBundle b;
    final int c;
    final com.google.android.gms.drive.metadata.a d;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadatabundle)
    {
        c = i;
        a = operator;
        b = metadatabundle;
        d = com.google.android.gms.drive.query.internal.e.a(metadatabundle);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.a.a(this, parcel, i);
    }

}
