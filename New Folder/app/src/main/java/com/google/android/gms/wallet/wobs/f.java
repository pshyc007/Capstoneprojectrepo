// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            m, g, l

public final class f
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    String a;
    g b;
    String c;
    l d;
    private final int e;

    f()
    {
        e = 1;
    }

    f(int i, String s, g g, String s1, l l)
    {
        e = i;
        a = s;
        b = g;
        c = s1;
        d = l;
    }

    public int a()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
