// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, TurnBasedMatchEntity, a

public final class TurnBasedMatchRef extends f
    implements TurnBasedMatch
{

    private final Game c;
    private final int d;

    public Object a()
    {
        return w();
    }

    public String c()
    {
        return e("external_match_id");
    }

    public String d()
    {
        return e("creator_external");
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return b("creation_timestamp");
    }

    public boolean equals(Object obj)
    {
        return TurnBasedMatchEntity.a(this, obj);
    }

    public int f()
    {
        return c("status");
    }

    public int g()
    {
        return c("user_match_status");
    }

    public String h()
    {
        return e("description");
    }

    public int hashCode()
    {
        return TurnBasedMatchEntity.a(this);
    }

    public int i()
    {
        return c("variant");
    }

    public Game i_()
    {
        return c;
    }

    public String j()
    {
        return e("last_updater_external");
    }

    public long k()
    {
        return b("last_updated_timestamp");
    }

    public ArrayList l()
    {
        ArrayList arraylist = new ArrayList(d);
        for (int i1 = 0; i1 < d; i1++)
        {
            arraylist.add(new ParticipantRef(a, i1 + b));
        }

        return arraylist;
    }

    public String m()
    {
        return e("pending_participant_external");
    }

    public byte[] n()
    {
        return g("data");
    }

    public int o()
    {
        return c("version");
    }

    public String p()
    {
        return e("rematch_id");
    }

    public byte[] q()
    {
        return g("previous_match_data");
    }

    public int r()
    {
        return c("match_number");
    }

    public Bundle s()
    {
        if (!d("has_automatch_criteria"))
        {
            return null;
        } else
        {
            return com.google.android.gms.games.multiplayer.turnbased.a.a(c("automatch_min_players"), c("automatch_max_players"), b("automatch_bit_mask"));
        }
    }

    public int t()
    {
        if (!d("has_automatch_criteria"))
        {
            return 0;
        } else
        {
            return c("automatch_max_players");
        }
    }

    public String toString()
    {
        return TurnBasedMatchEntity.b(this);
    }

    public boolean u()
    {
        return d("upsync_required");
    }

    public String v()
    {
        return e("description_participant_id");
    }

    public TurnBasedMatch w()
    {
        return new TurnBasedMatchEntity(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ((TurnBasedMatchEntity)w()).writeToParcel(parcel, i1);
    }
}
