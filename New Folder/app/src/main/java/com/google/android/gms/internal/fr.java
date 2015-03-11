// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kd, fi, fg

public class fr
    implements SafeParcelable
{

    public static final kd CREATOR = new kd();
    final int a;
    final fi b;
    final long c;
    final int d;
    public final String e;
    final fg f;

    fr(int i, fi fi, long l, int j, String s, fg fg)
    {
        a = i;
        b = fi;
        c = l;
        d = j;
        e = s;
        f = fg;
    }

    public int describeContents()
    {
        kd _tmp = CREATOR;
        return 0;
    }

    public String toString()
    {
        Object aobj[] = new Object[3];
        aobj[0] = b;
        aobj[1] = Long.valueOf(c);
        aobj[2] = Integer.valueOf(d);
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d]", aobj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kd _tmp = CREATOR;
        kd.a(this, parcel, i);
    }

}
