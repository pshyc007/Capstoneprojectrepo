// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aa

public class x
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aa();
    public final int a;
    public final int b;
    public final ParcelFileDescriptor c;

    x(int i, int j, ParcelFileDescriptor parcelfiledescriptor)
    {
        a = i;
        b = j;
        c = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aa.a(this, parcel, i | 1);
    }

}
