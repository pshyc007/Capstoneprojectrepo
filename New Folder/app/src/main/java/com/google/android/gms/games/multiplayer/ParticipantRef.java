// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntity, ParticipantResult

public final class ParticipantRef extends f
    implements Participant
{

    private final PlayerRef c;

    public ParticipantRef(DataHolder dataholder, int i1)
    {
        super(dataholder, i1);
        c = new PlayerRef(dataholder, i1);
    }

    public Object a()
    {
        return n();
    }

    public String c()
    {
        return e("client_address");
    }

    public int d()
    {
        return c("capabilities");
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return c("connected") > 0;
    }

    public boolean equals(Object obj)
    {
        return ParticipantEntity.a(this, obj);
    }

    public String f()
    {
        if (i("external_player_id"))
        {
            return e("default_display_name");
        } else
        {
            return c.c();
        }
    }

    public Uri g()
    {
        if (i("external_player_id"))
        {
            return h("default_display_image_uri");
        } else
        {
            return c.d();
        }
    }

    public int g_()
    {
        return c("player_status");
    }

    public String h()
    {
        if (i("external_player_id"))
        {
            return e("default_display_image_url");
        } else
        {
            return c.e();
        }
    }

    public int hashCode()
    {
        return ParticipantEntity.a(this);
    }

    public Uri i()
    {
        if (i("external_player_id"))
        {
            return h("default_display_hi_res_image_uri");
        } else
        {
            return c.f();
        }
    }

    public String j()
    {
        if (i("external_player_id"))
        {
            return e("default_display_hi_res_image_url");
        } else
        {
            return c.g();
        }
    }

    public String k()
    {
        return e("external_participant_id");
    }

    public Player l()
    {
        if (i("external_player_id"))
        {
            return null;
        } else
        {
            return c;
        }
    }

    public ParticipantResult m()
    {
        if (i("result_type"))
        {
            return null;
        } else
        {
            int i1 = c("result_type");
            int j1 = c("placing");
            return new ParticipantResult(k(), i1, j1);
        }
    }

    public Participant n()
    {
        return new ParticipantEntity(this);
    }

    public String toString()
    {
        return ParticipantEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ((ParticipantEntity)n()).writeToParcel(parcel, i1);
    }
}
