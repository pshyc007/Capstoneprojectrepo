// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.g;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            g, e

public class InFilter
    implements SafeParcelable, a
{

    public static final com.google.android.gms.drive.query.internal.g CREATOR = new com.google.android.gms.drive.query.internal.g();
    final MetadataBundle a;
    final int b;
    private final g c;

    InFilter(int i, MetadataBundle metadatabundle)
    {
        b = i;
        a = metadatabundle;
        c = (g)com.google.android.gms.drive.query.internal.e.a(metadatabundle);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.g.a(this, parcel, i);
    }

}
