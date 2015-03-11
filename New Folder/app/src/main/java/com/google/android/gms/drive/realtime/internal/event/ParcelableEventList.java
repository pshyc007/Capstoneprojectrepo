// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            b, ParcelableEvent, ParcelableObjectChangedEvent

public class ParcelableEventList
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;
    final ParcelableEvent b[];
    final DataHolder c;
    final boolean d;
    final ParcelableObjectChangedEvent e[];

    ParcelableEventList(int i, ParcelableEvent aparcelableevent[], DataHolder dataholder, boolean flag, ParcelableObjectChangedEvent aparcelableobjectchangedevent[])
    {
        a = i;
        b = aparcelableevent;
        c = dataholder;
        d = flag;
        e = aparcelableobjectchangedevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.realtime.internal.event.b.a(this, parcel, i);
    }

}
