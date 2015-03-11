// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            d, RoomEntity

final class c extends d
{

    c()
    {
    }

    public RoomEntity a(Parcel parcel)
    {
        if (RoomEntity.a(RoomEntity.m()) || RoomEntity.a(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
        {
            return super.a(parcel);
        }
        String s = parcel.readString();
        String s1 = parcel.readString();
        long l = parcel.readLong();
        int i = parcel.readInt();
        String s2 = parcel.readString();
        int j = parcel.readInt();
        android.os.Bundle bundle = parcel.readBundle();
        int k = parcel.readInt();
        ArrayList arraylist = new ArrayList(k);
        for (int i1 = 0; i1 < k; i1++)
        {
            arraylist.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }

        return new RoomEntity(2, s, s1, l, i, s2, j, bundle, arraylist, -1);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }
}
