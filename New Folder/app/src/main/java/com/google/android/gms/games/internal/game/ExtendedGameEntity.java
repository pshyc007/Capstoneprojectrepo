// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, a, GameBadge, GameBadgeEntity, 
//            b

public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel
    implements ExtendedGame
{

    public static final b CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final int c;
    private final boolean d;
    private final int e;
    private final long f;
    private final long g;
    private final String h;
    private final long i;
    private final String j;
    private final ArrayList k;
    private final SnapshotMetadataEntity l;

    ExtendedGameEntity(int i1, GameEntity gameentity, int j1, boolean flag, int k1, long l1, 
            long l2, String s, long l3, String s1, ArrayList arraylist, 
            SnapshotMetadataEntity snapshotmetadataentity)
    {
        a = i1;
        b = gameentity;
        c = j1;
        d = flag;
        e = k1;
        f = l1;
        g = l2;
        h = s;
        i = l3;
        j = s1;
        k = arraylist;
        l = snapshotmetadataentity;
    }

    public ExtendedGameEntity(ExtendedGame extendedgame)
    {
        a = 2;
        Game game = extendedgame.d_();
        GameEntity gameentity;
        SnapshotMetadata snapshotmetadata;
        SnapshotMetadataEntity snapshotmetadataentity;
        ArrayList arraylist;
        int i1;
        if (game == null)
        {
            gameentity = null;
        } else
        {
            gameentity = new GameEntity(game);
        }
        b = gameentity;
        c = extendedgame.d();
        d = extendedgame.e();
        e = extendedgame.f();
        f = extendedgame.g();
        g = extendedgame.h();
        h = extendedgame.i();
        i = extendedgame.j();
        j = extendedgame.k();
        snapshotmetadata = extendedgame.l();
        snapshotmetadataentity = null;
        if (snapshotmetadata != null)
        {
            snapshotmetadataentity = new SnapshotMetadataEntity(snapshotmetadata);
        }
        l = snapshotmetadataentity;
        arraylist = extendedgame.c();
        i1 = arraylist.size();
        k = new ArrayList(i1);
        for (int j1 = 0; j1 < i1; j1++)
        {
            k.add((GameBadgeEntity)((GameBadge)arraylist.get(j1)).a());
        }

    }

    static int a(ExtendedGame extendedgame)
    {
        Object aobj[] = new Object[9];
        aobj[0] = extendedgame.d_();
        aobj[1] = Integer.valueOf(extendedgame.d());
        aobj[2] = Boolean.valueOf(extendedgame.e());
        aobj[3] = Integer.valueOf(extendedgame.f());
        aobj[4] = Long.valueOf(extendedgame.g());
        aobj[5] = Long.valueOf(extendedgame.h());
        aobj[6] = extendedgame.i();
        aobj[7] = Long.valueOf(extendedgame.j());
        aobj[8] = extendedgame.k();
        return ln.a(aobj);
    }

    static boolean a(ExtendedGame extendedgame, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof ExtendedGame))
        {
            flag = false;
        } else
        if (extendedgame != obj)
        {
            ExtendedGame extendedgame1 = (ExtendedGame)obj;
            if (!ln.a(extendedgame1.d_(), extendedgame.d_()) || !ln.a(Integer.valueOf(extendedgame1.d()), Integer.valueOf(extendedgame.d())) || !ln.a(Boolean.valueOf(extendedgame1.e()), Boolean.valueOf(extendedgame.e())) || !ln.a(Integer.valueOf(extendedgame1.f()), Integer.valueOf(extendedgame.f())) || !ln.a(Long.valueOf(extendedgame1.g()), Long.valueOf(extendedgame.g())) || !ln.a(Long.valueOf(extendedgame1.h()), Long.valueOf(extendedgame.h())) || !ln.a(extendedgame1.i(), extendedgame.i()) || !ln.a(Long.valueOf(extendedgame1.j()), Long.valueOf(extendedgame.j())) || !ln.a(extendedgame1.k(), extendedgame.k()))
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

    static String b(ExtendedGame extendedgame)
    {
        return ln.a(extendedgame).a("Game", extendedgame.d_()).a("Availability", Integer.valueOf(extendedgame.d())).a("Owned", Boolean.valueOf(extendedgame.e())).a("AchievementUnlockedCount", Integer.valueOf(extendedgame.f())).a("LastPlayedServerTimestamp", Long.valueOf(extendedgame.g())).a("PriceMicros", Long.valueOf(extendedgame.h())).a("FormattedPrice", extendedgame.i()).a("FullPriceMicros", Long.valueOf(extendedgame.j())).a("FormattedFullPrice", extendedgame.k()).a("Snapshot", extendedgame.l()).toString();
    }

    static Integer p()
    {
        return C();
    }

    public Object a()
    {
        return o();
    }

    public ArrayList c()
    {
        return new ArrayList(k);
    }

    public int d()
    {
        return c;
    }

    public Game d_()
    {
        return n();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public int f()
    {
        return e;
    }

    public long g()
    {
        return f;
    }

    public long h()
    {
        return g;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String i()
    {
        return h;
    }

    public long j()
    {
        return i;
    }

    public String k()
    {
        return j;
    }

    public SnapshotMetadata l()
    {
        return l;
    }

    public int m()
    {
        return a;
    }

    public GameEntity n()
    {
        return b;
    }

    public ExtendedGame o()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = 0;
        if (!D())
        {
            com.google.android.gms.games.internal.game.b.a(this, parcel, i1);
        } else
        {
            b.writeToParcel(parcel, i1);
            parcel.writeInt(c);
            int k1;
            int l1;
            if (d)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            parcel.writeInt(k1);
            parcel.writeInt(e);
            parcel.writeLong(f);
            parcel.writeLong(g);
            parcel.writeString(h);
            parcel.writeLong(i);
            parcel.writeString(j);
            l1 = k.size();
            parcel.writeInt(l1);
            while (j1 < l1) 
            {
                ((GameBadgeEntity)k.get(j1)).writeToParcel(parcel, i1);
                j1++;
            }
        }
    }

}
