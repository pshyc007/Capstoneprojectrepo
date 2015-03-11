// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntity

public final class GameRequestRef extends f
    implements GameRequest
{

    private final int c;

    public Object a()
    {
        return c();
    }

    public int a_(String s)
    {
        for (int i1 = b; i1 < b + c; i1++)
        {
            int j1 = a.a(i1);
            if (a.c("recipient_external_player_id", i1, j1).equals(s))
            {
                return a.b("recipient_status", i1, j1);
            }
        }

        return -1;
    }

    public GameRequest c()
    {
        return new GameRequestEntity(this);
    }

    public String d()
    {
        return e("external_request_id");
    }

    public int describeContents()
    {
        return 0;
    }

    public Game e()
    {
        return new GameRef(a, b);
    }

    public boolean equals(Object obj)
    {
        return GameRequestEntity.a(this, obj);
    }

    public Player f()
    {
        return new PlayerRef(a, b(), "sender_");
    }

    public byte[] h()
    {
        return g("data");
    }

    public int hashCode()
    {
        return GameRequestEntity.a(this);
    }

    public int i()
    {
        return c("type");
    }

    public long j()
    {
        return b("creation_timestamp");
    }

    public long k()
    {
        return b("expiration_timestamp");
    }

    public int l()
    {
        return c("status");
    }

    public List n()
    {
        ArrayList arraylist = new ArrayList(c);
        for (int i1 = 0; i1 < c; i1++)
        {
            arraylist.add(new PlayerRef(a, i1 + b, "recipient_"));
        }

        return arraylist;
    }

    public String toString()
    {
        return GameRequestEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ((GameRequestEntity)c()).writeToParcel(parcel, i1);
    }
}
