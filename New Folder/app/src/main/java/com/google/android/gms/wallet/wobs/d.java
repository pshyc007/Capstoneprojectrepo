// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.mf;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            i

public final class d
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    String a;
    String b;
    ArrayList c;
    private final int d;

    d()
    {
        d = 1;
        c = mf.a();
    }

    d(int j, String s, String s1, ArrayList arraylist)
    {
        d = j;
        a = s;
        b = s1;
        c = arraylist;
    }

    public int a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
