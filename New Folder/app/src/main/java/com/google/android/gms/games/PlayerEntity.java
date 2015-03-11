// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games:
//            Player, c, d, PlayerLevelInfo

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final long f;
    private final int g;
    private final long h;
    private final String i;
    private final String j;
    private final String k;
    private final MostRecentGameInfoEntity l;
    private final PlayerLevelInfo m;
    private final boolean n;

    PlayerEntity(int i1, String s, String s1, Uri uri, Uri uri1, long l1, 
            int j1, long l2, String s2, String s3, String s4, MostRecentGameInfoEntity mostrecentgameinfoentity, 
            PlayerLevelInfo playerlevelinfo, boolean flag)
    {
        a = i1;
        b = s;
        c = s1;
        d = uri;
        i = s2;
        e = uri1;
        j = s3;
        f = l1;
        g = j1;
        h = l2;
        k = s4;
        n = flag;
        l = mostrecentgameinfoentity;
        m = playerlevelinfo;
    }

    public PlayerEntity(Player player)
    {
        a = 10;
        b = player.b_();
        c = player.c();
        d = player.d();
        i = player.e();
        e = player.f();
        j = player.g();
        f = player.h();
        g = player.j();
        h = player.i();
        k = player.l();
        n = player.k();
        MostRecentGameInfo mostrecentgameinfo = player.n();
        MostRecentGameInfoEntity mostrecentgameinfoentity;
        boolean flag;
        if (mostrecentgameinfo == null)
        {
            mostrecentgameinfoentity = null;
        } else
        {
            mostrecentgameinfoentity = new MostRecentGameInfoEntity(mostrecentgameinfo);
        }
        l = mostrecentgameinfoentity;
        m = player.m();
        kl.a(b);
        kl.a(c);
        if (f > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kl.a(flag);
    }

    static int a(Player player)
    {
        Object aobj[] = new Object[7];
        aobj[0] = player.b_();
        aobj[1] = player.c();
        aobj[2] = player.d();
        aobj[3] = player.f();
        aobj[4] = Long.valueOf(player.h());
        aobj[5] = player.l();
        aobj[6] = player.m();
        return ln.a(aobj);
    }

    static boolean a(Player player, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Player))
        {
            flag = false;
        } else
        if (player != obj)
        {
            Player player1 = (Player)obj;
            if (!ln.a(player1.b_(), player.b_()) || !ln.a(player1.c(), player.c()) || !ln.a(player1.d(), player.d()) || !ln.a(player1.f(), player.f()) || !ln.a(Long.valueOf(player1.h()), Long.valueOf(player.h())) || !ln.a(player1.l(), player.l()) || !ln.a(player1.m(), player.m()))
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

    static String b(Player player)
    {
        return ln.a(player).a("PlayerId", player.b_()).a("DisplayName", player.c()).a("IconImageUri", player.d()).a("IconImageUrl", player.e()).a("HiResImageUri", player.f()).a("HiResImageUrl", player.g()).a("RetrievedTimestamp", Long.valueOf(player.h())).a("Title", player.l()).a("LevelInfo", player.m()).toString();
    }

    static Integer q()
    {
        return C();
    }

    public Object a()
    {
        return p();
    }

    public String b_()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public Uri d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return i;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Uri f()
    {
        return e;
    }

    public String g()
    {
        return j;
    }

    public long h()
    {
        return f;
    }

    public int hashCode()
    {
        return a(this);
    }

    public long i()
    {
        return h;
    }

    public int j()
    {
        return g;
    }

    public boolean k()
    {
        return n;
    }

    public String l()
    {
        return k;
    }

    public PlayerLevelInfo m()
    {
        return m;
    }

    public MostRecentGameInfo n()
    {
        return l;
    }

    public int o()
    {
        return a;
    }

    public Player p()
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
            com.google.android.gms.games.d.a(this, parcel, i1);
            return;
        }
        parcel.writeString(b);
        parcel.writeString(c);
        String s;
        Uri uri;
        String s1;
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
        parcel.writeLong(f);
    }

}
