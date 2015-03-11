// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ac

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ac();
    final int a;
    final DriveId b;
    final MetadataBundle c;
    final Contents d;
    final Integer e;
    final boolean f;
    final String g;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, Integer integer, boolean flag, String s)
    {
        a = i;
        b = (DriveId)lr.a(driveid);
        c = (MetadataBundle)lr.a(metadatabundle);
        if (integer == null || integer.intValue() == 0)
        {
            d = (Contents)lr.a(contents);
        } else
        {
            d = null;
        }
        e = integer;
        f = flag;
        g = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ac.a(this, parcel, i);
    }

}
