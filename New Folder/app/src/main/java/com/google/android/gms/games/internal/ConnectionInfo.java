// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.internal:
//            a

public class ConnectionInfo
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    private final int a;
    private final String b;
    private final int c;

    public ConnectionInfo(int i, String s, int j)
    {
        a = i;
        b = s;
        c = j;
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.internal.a.a(this, parcel, i);
    }

}
