// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            a, DriveId

public class Contents
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    final ParcelFileDescriptor b;
    final int c;
    final int d;
    final DriveId e;
    String f;
    boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    Contents(int l, ParcelFileDescriptor parcelfiledescriptor, int i1, int j1, DriveId driveid, String s, boolean flag)
    {
        h = false;
        i = false;
        j = false;
        k = false;
        a = l;
        b = parcelfiledescriptor;
        c = i1;
        d = j1;
        e = driveid;
        f = s;
        g = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.drive.a.a(this, parcel, l);
    }

}
