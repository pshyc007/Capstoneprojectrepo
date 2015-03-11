// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            oe

public final class li
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new oe();
    String a[];
    byte b[][];
    private final int c;

    li()
    {
        this(1, new String[0], new byte[0][]);
    }

    li(int i, String as[], byte abyte0[][])
    {
        c = i;
        a = as;
        b = abyte0;
    }

    public int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        oe.a(this, parcel, i);
    }

}
