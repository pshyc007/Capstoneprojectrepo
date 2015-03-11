// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            s, l, n

public final class p
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new s();
    String a;
    String b;
    l c;
    n d;
    n e;
    private final int f;

    p()
    {
        f = 1;
    }

    p(int i, String s1, String s2, l l, n n, n n1)
    {
        f = i;
        a = s1;
        b = s2;
        c = l;
        d = n;
        e = n1;
    }

    public int a()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel, i);
    }

}
