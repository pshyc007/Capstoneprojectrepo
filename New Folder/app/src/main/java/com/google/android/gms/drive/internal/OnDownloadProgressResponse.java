// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            f

public class OnDownloadProgressResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    final int a;
    final long b;
    final long c;

    OnDownloadProgressResponse(int i, long l, long l1)
    {
        a = i;
        b = l;
        c = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
