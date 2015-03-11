// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            i

public class OnListEntriesResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    final int a;
    final DataHolder b;
    final boolean c;

    OnListEntriesResponse(int j, DataHolder dataholder, boolean flag)
    {
        a = j;
        b = dataholder;
        c = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
