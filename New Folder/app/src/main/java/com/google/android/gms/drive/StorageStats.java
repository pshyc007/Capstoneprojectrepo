// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            c

public class StorageStats
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    final long b;
    final long c;
    final long d;
    final long e;
    final int f;

    StorageStats(int i, long l, long l1, long l2, 
            long l3, int j)
    {
        a = i;
        b = l;
        c = l1;
        d = l2;
        e = l3;
        f = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.c.a(this, parcel, i);
    }

}
