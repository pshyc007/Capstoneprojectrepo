// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RealTimeMessage

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public RealTimeMessage a(Parcel parcel)
    {
        return new RealTimeMessage(parcel, null);
    }

    public RealTimeMessage[] a(int i)
    {
        return new RealTimeMessage[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
