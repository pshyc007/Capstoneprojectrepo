// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jv, fk

public class fg
    implements SafeParcelable
{

    public static final jv CREATOR = new jv();
    final int a;
    final fk b[];
    public final String c;
    public final boolean d;

    fg(int i, fk afk[], String s, boolean flag)
    {
        a = i;
        b = afk;
        c = s;
        d = flag;
    }

    public int describeContents()
    {
        jv _tmp = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jv _tmp = CREATOR;
        jv.a(this, parcel, i);
    }

}
