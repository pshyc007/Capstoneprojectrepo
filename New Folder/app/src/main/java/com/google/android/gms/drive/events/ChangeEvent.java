// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, a

public final class ChangeEvent
    implements SafeParcelable, ResourceEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    final DriveId b;
    final int c;

    ChangeEvent(int i, DriveId driveid, int j)
    {
        a = i;
        b = driveid;
        c = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        Object aobj[] = new Object[2];
        aobj[0] = b;
        aobj[1] = Integer.valueOf(c);
        return String.format("ChangeEvent [id=%s,changeFlags=%x]", aobj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.events.a.a(this, parcel, i);
    }

}
