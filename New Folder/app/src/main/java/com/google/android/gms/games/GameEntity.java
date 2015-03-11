// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games:
//            Game, a, b

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Uri h;
    private final Uri i;
    private final Uri j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean q;
    private final boolean r;
    private final String s;
    private final String t;
    private final String u;
    private final boolean v;
    private final boolean w;
    private final boolean x;

    GameEntity(int i1, String s1, String s2, String s3, String s4, String s5, String s6, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s7, int j1, 
            int k1, int l1, boolean flag2, boolean flag3, String s8, String s9, String s10, 
            boolean flag4, boolean flag5, boolean flag6)
    {
        a = i1;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        h = uri;
        s = s8;
        i = uri1;
        t = s9;
        j = uri2;
        u = s10;
        k = flag;
        l = flag1;
        m = s7;
        n = j1;
        o = k1;
        p = l1;
        q = flag2;
        r = flag3;
        v = flag4;
        w = flag5;
        x = flag6;
    }

    public GameEntity(Game game)
    {
        a = 4;
        b = game.a_();
        d = game.d();
        e = game.e();
        f = game.f();
        g = game.g();
        c = game.c();
        h = game.h();
        s = game.i();
        i = game.j();
        t = game.k();
        j = game.l();
        u = game.m();
        k = game.n();
        l = game.q();
        m = game.r();
        n = game.s();
        o = game.t();
        p = game.u();
        q = game.v();
        r = game.w();
        v = game.o();
        w = game.p();
        x = game.x();
    }

    static Integer A()
    {
        return C();
    }

    static int a(Game game)
    {
        Object aobj[] = new Object[20];
        aobj[0] = game.a_();
        aobj[1] = game.c();
        aobj[2] = game.d();
        aobj[3] = game.e();
        aobj[4] = game.f();
        aobj[5] = game.g();
        aobj[6] = game.h();
        aobj[7] = game.j();
        aobj[8] = game.l();
        aobj[9] = Boolean.valueOf(game.n());
        aobj[10] = Boolean.valueOf(game.q());
        aobj[11] = game.r();
        aobj[12] = Integer.valueOf(game.s());
        aobj[13] = Integer.valueOf(game.t());
        aobj[14] = Integer.valueOf(game.u());
        aobj[15] = Boolean.valueOf(game.v());
        aobj[16] = Boolean.valueOf(game.w());
        aobj[17] = Boolean.valueOf(game.o());
        aobj[18] = Boolean.valueOf(game.p());
        aobj[19] = Boolean.valueOf(game.x());
        return ln.a(aobj);
    }

    static boolean a(Game game, Object obj)
    {
        boolean flag = true;
        if (obj instanceof Game) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (game == obj) goto _L4; else goto _L3
_L3:
        Game game1 = (Game)obj;
        if (!ln.a(game1.a_(), game.a_()) || !ln.a(game1.c(), game.c()) || !ln.a(game1.d(), game.d()) || !ln.a(game1.e(), game.e()) || !ln.a(game1.f(), game.f()) || !ln.a(game1.g(), game.g()) || !ln.a(game1.h(), game.h()) || !ln.a(game1.j(), game.j()) || !ln.a(game1.l(), game.l()) || !ln.a(Boolean.valueOf(game1.n()), Boolean.valueOf(game.n())) || !ln.a(Boolean.valueOf(game1.q()), Boolean.valueOf(game.q())) || !ln.a(game1.r(), game.r()) || !ln.a(Integer.valueOf(game1.s()), Integer.valueOf(game.s())) || !ln.a(Integer.valueOf(game1.t()), Integer.valueOf(game.t())) || !ln.a(Integer.valueOf(game1.u()), Integer.valueOf(game.u())) || !ln.a(Boolean.valueOf(game1.v()), Boolean.valueOf(game.v())))
        {
            break; /* Loop/switch isn't completed */
        }
        Boolean boolean1 = Boolean.valueOf(game1.w());
        boolean flag1;
        if (game.w() && ln.a(Boolean.valueOf(game1.o()), Boolean.valueOf(game.o())) && ln.a(Boolean.valueOf(game1.p()), Boolean.valueOf(game.p())))
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        if (ln.a(boolean1, Boolean.valueOf(flag1)) && ln.a(Boolean.valueOf(game1.x()), Boolean.valueOf(game.x()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean a(Integer integer)
    {
        return b(integer);
    }

    static boolean a(String s1)
    {
        return b(s1);
    }

    static String b(Game game)
    {
        return ln.a(game).a("ApplicationId", game.a_()).a("DisplayName", game.c()).a("PrimaryCategory", game.d()).a("SecondaryCategory", game.e()).a("Description", game.f()).a("DeveloperName", game.g()).a("IconImageUri", game.h()).a("IconImageUrl", game.i()).a("HiResImageUri", game.j()).a("HiResImageUrl", game.k()).a("FeaturedImageUri", game.l()).a("FeaturedImageUrl", game.m()).a("PlayEnabledGame", Boolean.valueOf(game.n())).a("InstanceInstalled", Boolean.valueOf(game.q())).a("InstancePackageName", game.r()).a("AchievementTotalCount", Integer.valueOf(game.t())).a("LeaderboardCount", Integer.valueOf(game.u())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.v())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.w())).a("AreSnapshotsEnabled", Boolean.valueOf(game.x())).toString();
    }

    public Object a()
    {
        return z();
    }

    public String a_()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public Uri h()
    {
        return h;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String i()
    {
        return s;
    }

    public Uri j()
    {
        return i;
    }

    public String k()
    {
        return t;
    }

    public Uri l()
    {
        return j;
    }

    public String m()
    {
        return u;
    }

    public boolean n()
    {
        return k;
    }

    public boolean o()
    {
        return v;
    }

    public boolean p()
    {
        return w;
    }

    public boolean q()
    {
        return l;
    }

    public String r()
    {
        return m;
    }

    public int s()
    {
        return n;
    }

    public int t()
    {
        return o;
    }

    public String toString()
    {
        return b(this);
    }

    public int u()
    {
        return p;
    }

    public boolean v()
    {
        return q;
    }

    public boolean w()
    {
        return r;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = 1;
        if (!D())
        {
            com.google.android.gms.games.b.a(this, parcel, i1);
            return;
        }
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        String s1;
        String s2;
        Uri uri;
        String s3;
        int k1;
        if (h == null)
        {
            s1 = null;
        } else
        {
            s1 = h.toString();
        }
        parcel.writeString(s1);
        if (i == null)
        {
            s2 = null;
        } else
        {
            s2 = i.toString();
        }
        parcel.writeString(s2);
        uri = j;
        s3 = null;
        if (uri != null)
        {
            s3 = j.toString();
        }
        parcel.writeString(s3);
        if (k)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!l)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeString(m);
        parcel.writeInt(n);
        parcel.writeInt(o);
        parcel.writeInt(p);
    }

    public boolean x()
    {
        return x;
    }

    public int y()
    {
        return a;
    }

    public Game z()
    {
        return this;
    }

}
