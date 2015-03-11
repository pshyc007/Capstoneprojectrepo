// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, c, d, ParticipantResult

public final class ParticipantEntity extends GamesDowngradeableSafeParcel
    implements Participant
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final int f;
    private final String g;
    private final boolean h;
    private final PlayerEntity i;
    private final int j;
    private final ParticipantResult k;
    private final String l;
    private final String m;

    ParticipantEntity(int i1, String s, String s1, Uri uri, Uri uri1, int j1, String s2, 
            boolean flag, PlayerEntity playerentity, int k1, ParticipantResult participantresult, String s3, String s4)
    {
        a = i1;
        b = s;
        c = s1;
        d = uri;
        e = uri1;
        f = j1;
        g = s2;
        h = flag;
        i = playerentity;
        j = k1;
        k = participantresult;
        l = s3;
        m = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        a = 3;
        b = participant.k();
        c = participant.f();
        d = participant.g();
        e = participant.i();
        f = participant.g_();
        g = participant.c();
        h = participant.e();
        Player player = participant.l();
        PlayerEntity playerentity;
        if (player == null)
        {
            playerentity = null;
        } else
        {
            playerentity = new PlayerEntity(player);
        }
        i = playerentity;
        j = participant.d();
        k = participant.m();
        l = participant.h();
        m = participant.j();
    }

    static int a(Participant participant)
    {
        Object aobj[] = new Object[10];
        aobj[0] = participant.l();
        aobj[1] = Integer.valueOf(participant.g_());
        aobj[2] = participant.c();
        aobj[3] = Boolean.valueOf(participant.e());
        aobj[4] = participant.f();
        aobj[5] = participant.g();
        aobj[6] = participant.i();
        aobj[7] = Integer.valueOf(participant.d());
        aobj[8] = participant.m();
        aobj[9] = participant.k();
        return ln.a(aobj);
    }

    static boolean a(Participant participant, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Participant))
        {
            flag = false;
        } else
        if (participant != obj)
        {
            Participant participant1 = (Participant)obj;
            if (!ln.a(participant1.l(), participant.l()) || !ln.a(Integer.valueOf(participant1.g_()), Integer.valueOf(participant.g_())) || !ln.a(participant1.c(), participant.c()) || !ln.a(Boolean.valueOf(participant1.e()), Boolean.valueOf(participant.e())) || !ln.a(participant1.f(), participant.f()) || !ln.a(participant1.g(), participant.g()) || !ln.a(participant1.i(), participant.i()) || !ln.a(Integer.valueOf(participant1.d()), Integer.valueOf(participant.d())) || !ln.a(participant1.m(), participant.m()) || !ln.a(participant1.k(), participant.k()))
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

    static String b(Participant participant)
    {
        return ln.a(participant).a("ParticipantId", participant.k()).a("Player", participant.l()).a("Status", Integer.valueOf(participant.g_())).a("ClientAddress", participant.c()).a("ConnectedToRoom", Boolean.valueOf(participant.e())).a("DisplayName", participant.f()).a("IconImage", participant.g()).a("IconImageUrl", participant.h()).a("HiResImage", participant.i()).a("HiResImageUrl", participant.j()).a("Capabilities", Integer.valueOf(participant.d())).a("Result", participant.m()).toString();
    }

    static Integer p()
    {
        return C();
    }

    public Object a()
    {
        return o();
    }

    public String c()
    {
        return g;
    }

    public int d()
    {
        return j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return h;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public String f()
    {
        if (i == null)
        {
            return c;
        } else
        {
            return i.c();
        }
    }

    public Uri g()
    {
        if (i == null)
        {
            return d;
        } else
        {
            return i.d();
        }
    }

    public int g_()
    {
        return f;
    }

    public String h()
    {
        if (i == null)
        {
            return l;
        } else
        {
            return i.e();
        }
    }

    public int hashCode()
    {
        return a(this);
    }

    public Uri i()
    {
        if (i == null)
        {
            return e;
        } else
        {
            return i.f();
        }
    }

    public String j()
    {
        if (i == null)
        {
            return m;
        } else
        {
            return i.g();
        }
    }

    public String k()
    {
        return b;
    }

    public Player l()
    {
        return i;
    }

    public ParticipantResult m()
    {
        return k;
    }

    public int n()
    {
        return a;
    }

    public Participant o()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (!D())
        {
            com.google.android.gms.games.multiplayer.d.a(this, parcel, i1);
        } else
        {
            parcel.writeString(b);
            parcel.writeString(c);
            String s;
            Uri uri;
            String s1;
            int j1;
            PlayerEntity playerentity;
            int k1;
            if (d == null)
            {
                s = null;
            } else
            {
                s = d.toString();
            }
            parcel.writeString(s);
            uri = e;
            s1 = null;
            if (uri != null)
            {
                s1 = e.toString();
            }
            parcel.writeString(s1);
            parcel.writeInt(f);
            parcel.writeString(g);
            if (h)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
            playerentity = i;
            k1 = 0;
            if (playerentity != null)
            {
                k1 = 1;
            }
            parcel.writeInt(k1);
            if (i != null)
            {
                i.writeToParcel(parcel, i1);
                return;
            }
        }
    }

}
