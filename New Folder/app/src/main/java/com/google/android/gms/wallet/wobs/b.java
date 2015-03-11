// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            h

public final class b
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    String a;
    String b;
    private final int c;

    b()
    {
        c = 1;
    }

    b(int i, String s, String s1)
    {
        c = i;
        a = s;
        b = s1;
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
        h.a(this, parcel, i);
    }

}
