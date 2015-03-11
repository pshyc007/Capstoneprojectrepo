// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, InvitationEntity, ParticipantRef, Participant

public final class InvitationRef extends f
    implements Invitation
{

    private final Game c;
    private final ParticipantRef d;
    private final ArrayList e;

    public Object a()
    {
        return c();
    }

    public Invitation c()
    {
        return new InvitationEntity(this);
    }

    public Game d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e("external_invitation_id");
    }

    public boolean equals(Object obj)
    {
        return InvitationEntity.a(this, obj);
    }

    public Participant f()
    {
        return d;
    }

    public long g()
    {
        return Math.max(b("creation_timestamp"), b("last_modified_timestamp"));
    }

    public int h()
    {
        return c("type");
    }

    public int hashCode()
    {
        return InvitationEntity.a(this);
    }

    public int i()
    {
        return c("variant");
    }

    public int j()
    {
        if (!d("has_automatch_criteria"))
        {
            return 0;
        } else
        {
            return c("automatch_max_players");
        }
    }

    public ArrayList l()
    {
        return e;
    }

    public String toString()
    {
        return InvitationEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        ((InvitationEntity)c()).writeToParcel(parcel, k);
    }
}
