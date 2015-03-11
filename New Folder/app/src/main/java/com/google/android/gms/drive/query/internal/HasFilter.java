// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            f, e

public class HasFilter
    implements SafeParcelable, a
{

    public static final f CREATOR = new f();
    final MetadataBundle a;
    final int b;
    final com.google.android.gms.drive.metadata.a c;

    HasFilter(int i, MetadataBundle metadatabundle)
    {
        b = i;
        a = metadatabundle;
        c = com.google.android.gms.drive.query.internal.e.a(metadatabundle);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.f.a(this, parcel, i);
    }

}
