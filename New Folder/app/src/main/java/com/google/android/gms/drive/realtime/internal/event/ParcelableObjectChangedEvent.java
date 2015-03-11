// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            c

public class ParcelableObjectChangedEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    final String b;
    final String c;
    final boolean d;
    final String e;
    final String f;
    final int g;
    final int h;

    ParcelableObjectChangedEvent(int i, String s, String s1, boolean flag, String s2, String s3, int j, 
            int k)
    {
        b = s;
        c = s1;
        d = flag;
        e = s2;
        f = s3;
        a = i;
        g = j;
        h = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.realtime.internal.event.c.a(this, parcel, i);
    }

}
