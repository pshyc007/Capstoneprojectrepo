// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ae

public class DeleteCustomPropertyRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    final int a;
    final DriveId b;
    final CustomPropertyKey c;

    DeleteCustomPropertyRequest(int i, DriveId driveid, CustomPropertyKey custompropertykey)
    {
        a = i;
        b = driveid;
        c = custompropertykey;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ae.a(this, parcel, i);
    }

}
