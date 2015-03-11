// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntity, b

public final class RoomRef extends f
    implements Room
{

    private final int c;

    public Object a()
    {
        return j();
    }

    public String c()
    {
        return e("creator_external");
    }

    public long d()
    {
        return b("creation_timestamp");
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return c("status");
    }

    public boolean equals(Object obj)
    {
        return RoomEntity.a(this, obj);
    }

    public String f()
    {
        return e("description");
    }

    public int g()
    {
        return c("variant");
    }

    public Bundle h()
    {
        if (!d("has_automatch_criteria"))
        {
            return null;
        } else
        {
            return b.a(c("automatch_min_players"), c("automatch_max_players"), b("automatch_bit_mask"));
        }
    }

    public String h_()
    {
        return e("external_match_id");
    }

    public int hashCode()
    {
        return RoomEntity.a(this);
    }

    public int i()
    {
        return c("automatch_wait_estimate_sec");
    }

    public Room j()
    {
        return new RoomEntity(this);
    }

    public ArrayList l()
    {
        ArrayList arraylist = new ArrayList(c);
        for (int k = 0; k < c; k++)
        {
            arraylist.add(new ParticipantRef(a, k + b));
        }

        return arraylist;
    }

    public String toString()
    {
        return RoomEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        ((RoomEntity)j()).writeToParcel(parcel, k);
    }
}
