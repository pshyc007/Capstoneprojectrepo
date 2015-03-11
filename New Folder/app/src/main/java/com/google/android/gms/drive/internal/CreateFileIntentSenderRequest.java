// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ab

public class CreateFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    final int a;
    final MetadataBundle b;
    final int c;
    final String d;
    final DriveId e;
    final Integer f;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadatabundle, int j, String s, DriveId driveid, Integer integer)
    {
        a = i;
        b = metadatabundle;
        c = j;
        d = s;
        e = driveid;
        f = integer;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ab.a(this, parcel, i);
    }

}
