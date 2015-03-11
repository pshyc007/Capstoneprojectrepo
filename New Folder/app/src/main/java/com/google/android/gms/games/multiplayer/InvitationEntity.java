// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import com.google.android.gms.internal.lr;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, a, Participant, ParticipantEntity, 
//            b

public final class InvitationEntity extends GamesDowngradeableSafeParcel
    implements Invitation
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final String c;
    private final long d;
    private final int e;
    private final ParticipantEntity f;
    private final ArrayList g;
    private final int h;
    private final int i;

    InvitationEntity(int i1, GameEntity gameentity, String s, long l1, int j1, ParticipantEntity participantentity, 
            ArrayList arraylist, int k1, int i2)
    {
        a = i1;
        b = gameentity;
        c = s;
        d = l1;
        e = j1;
        f = participantentity;
        g = arraylist;
        h = k1;
        i = i2;
    }

    InvitationEntity(Invitation invitation)
    {
        a = 2;
        b = new GameEntity(invitation.d());
        c = invitation.e();
        d = invitation.g();
        e = invitation.h();
        h = invitation.i();
        i = invitation.j();
        String s = invitation.f().k();
        Participant participant = null;
        ArrayList arraylist = invitation.l();
        int i1 = arraylist.size();
        g = new ArrayList(i1);
        for (int j1 = 0; j1 < i1; j1++)
        {
            Participant participant1 = (Participant)arraylist.get(j1);
            if (participant1.k().equals(s))
            {
                participant = participant1;
            }
            g.add((ParticipantEntity)participant1.a());
        }

        lr.a(participant, "Must have a valid inviter!");
        f = (ParticipantEntity)participant.a();
    }

    static int a(Invitation invitation)
    {
        Object aobj[] = new Object[8];
        aobj[0] = invitation.d();
        aobj[1] = invitation.e();
        aobj[2] = Long.valueOf(invitation.g());
        aobj[3] = Integer.valueOf(invitation.h());
        aobj[4] = invitation.f();
        aobj[5] = invitation.l();
        aobj[6] = Integer.valueOf(invitation.i());
        aobj[7] = Integer.valueOf(invitation.j());
        return ln.a(aobj);
    }

    static boolean a(Invitation invitation, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Invitation))
        {
            flag = false;
        } else
        if (invitation != obj)
        {
            Invitation invitation1 = (Invitation)obj;
            if (!ln.a(invitation1.d(), invitation.d()) || !ln.a(invitation1.e(), invitation.e()) || !ln.a(Long.valueOf(invitation1.g()), Long.valueOf(invitation.g())) || !ln.a(Integer.valueOf(invitation1.h()), Integer.valueOf(invitation.h())) || !ln.a(invitation1.f(), invitation.f()) || !ln.a(invitation1.l(), invitation.l()) || !ln.a(Integer.valueOf(invitation1.i()), Integer.valueOf(invitation.i())) || !ln.a(Integer.valueOf(invitation1.j()), Integer.valueOf(invitation.j())))
            {
                return false;
            }
        }
        return flag;
    }

    static boolean a(Integer integer)
    {
        return b(integer);
    }

    static boolean a(String s)
    {
        return b(s);
    }

    static String b(Invitation invitation)
    {
        return ln.a(invitation).a("Game", invitation.d()).a("InvitationId", invitation.e()).a("CreationTimestamp", Long.valueOf(invitation.g())).a("InvitationType", Integer.valueOf(invitation.h())).a("Inviter", invitation.f()).a("Participants", invitation.l()).a("Variant", Integer.valueOf(invitation.i())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.j())).toString();
    }

    static Integer k()
    {
        return C();
    }

    public Object a()
    {
        return c();
    }

    public int b()
    {
        return a;
    }

    public Invitation c()
    {
        return this;
    }

    public Game d()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Participant f()
    {
        return f;
    }

    public long g()
    {
        return d;
    }

    public int h()
    {
        return e;
    }

    public int hashCode()
    {
        return a(this);
    }

    public int i()
    {
        return h;
    }

    public int j()
    {
        return i;
    }

    public ArrayList l()
    {
        return new ArrayList(g);
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (!D())
        {
            com.google.android.gms.games.multiplayer.b.a(this, parcel, i1);
        } else
        {
            b.writeToParcel(parcel, i1);
            parcel.writeString(c);
            parcel.writeLong(d);
            parcel.writeInt(e);
            f.writeToParcel(parcel, i1);
            int j1 = g.size();
            parcel.writeInt(j1);
            int k1 = 0;
            while (k1 < j1) 
            {
                ((ParticipantEntity)g.get(k1)).writeToParcel(parcel, i1);
                k1++;
            }
        }
    }

}
