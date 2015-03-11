// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            b, WalletFragmentStyle

public final class WalletFragmentOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;
    private int b;
    private int c;
    private WalletFragmentStyle d;
    private int e;

    private WalletFragmentOptions()
    {
        a = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        a = i;
        b = j;
        c = k;
        d = walletfragmentstyle;
        e = l;
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public WalletFragmentStyle c()
    {
        return d;
    }

    public int d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.b.a(this, parcel, i);
    }

}
