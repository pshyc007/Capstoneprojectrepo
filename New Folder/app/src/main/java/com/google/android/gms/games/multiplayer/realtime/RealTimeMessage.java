// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            a

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final String a;
    private final byte b[];
    private final int c;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    RealTimeMessage(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        a = (String)lr.a(s);
        b = (byte[])((byte[])lr.a(abyte0)).clone();
        c = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeByteArray(b);
        parcel.writeInt(c);
    }

}
