// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            j

public class ValuesSetDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final int a;
    final int b;
    final int c;
    final int d;

    ValuesSetDetails(int i, int k, int l, int i1)
    {
        a = i;
        b = k;
        c = l;
        d = i1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
