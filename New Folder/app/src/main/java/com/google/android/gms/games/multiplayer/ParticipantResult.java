// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.a.a;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            e

public final class ParticipantResult
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    private final int a;
    private final String b;
    private final int c;
    private final int d;

    public ParticipantResult(int i, String s, int j, int k)
    {
        a = i;
        b = (String)lr.a(s);
        lr.a(com.google.android.gms.games.internal.a.a.a(j));
        c = j;
        d = k;
    }

    public ParticipantResult(String s, int i, int j)
    {
        this(1, s, i, j);
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

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.multiplayer.e.a(this, parcel, i);
    }

}
