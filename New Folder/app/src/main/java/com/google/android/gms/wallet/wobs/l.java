// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            q

public final class l
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    long a;
    long b;
    private final int c;

    l()
    {
        c = 1;
    }

    l(int i, long l1, long l2)
    {
        c = i;
        a = l1;
        b = l2;
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
        q.a(this, parcel, i);
    }

}
