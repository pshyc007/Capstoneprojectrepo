// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            c

public class DetectedActivity
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    int a;
    int b;
    private final int c;

    public DetectedActivity(int i, int j, int k)
    {
        c = i;
        a = j;
        b = k;
    }

    private int a(int i)
    {
        if (i > 8)
        {
            i = 4;
        }
        return i;
    }

    public int a()
    {
        return a(a);
    }

    public int b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DetectedActivity [type=").append(a()).append(", confidence=").append(b).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.c.a(this, parcel, i);
    }

}
