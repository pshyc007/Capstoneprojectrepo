// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, b

public final class FileConflictEvent
    implements SafeParcelable, DriveEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;
    final DriveId b;
    final String c;
    final ParcelFileDescriptor d;
    final ParcelFileDescriptor e;
    final MetadataBundle f;
    final ArrayList g;
    private boolean h;
    private boolean i;
    private boolean j;

    FileConflictEvent(int k, DriveId driveid, String s, ParcelFileDescriptor parcelfiledescriptor, ParcelFileDescriptor parcelfiledescriptor1, MetadataBundle metadatabundle, ArrayList arraylist)
    {
        h = false;
        i = false;
        j = false;
        a = k;
        b = driveid;
        c = s;
        d = parcelfiledescriptor;
        e = parcelfiledescriptor1;
        f = metadatabundle;
        g = arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        Object aobj[] = new Object[1];
        aobj[0] = b;
        return String.format("FileConflictEvent [id=%s]", aobj);
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.drive.events.b.a(this, parcel, k);
    }

}
