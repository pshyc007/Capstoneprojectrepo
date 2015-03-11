// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, a

public final class GameRequestEntity
    implements SafeParcelable, GameRequest
{

    public static final a CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final PlayerEntity c;
    private final byte d[];
    private final String e;
    private final ArrayList f;
    private final int g;
    private final long h;
    private final long i;
    private final Bundle j;
    private final int k;

    GameRequestEntity(int i1, GameEntity gameentity, PlayerEntity playerentity, byte abyte0[], String s, ArrayList arraylist, int j1, 
            long l1, long l2, Bundle bundle, int k1)
    {
        a = i1;
        b = gameentity;
        c = playerentity;
        d = abyte0;
        e = s;
        f = arraylist;
        g = j1;
        h = l1;
        i = l2;
        j = bundle;
        k = k1;
    }

    public GameRequestEntity(GameRequest gamerequest)
    {
        a = 2;
        b = new GameEntity(gamerequest.e());
        c = new PlayerEntity(gamerequest.f());
        e = gamerequest.d();
        g = gamerequest.i();
        h = gamerequest.j();
        i = gamerequest.k();
        k = gamerequest.l();
        byte abyte0[] = gamerequest.h();
        List list;
        int i1;
        if (abyte0 == null)
        {
            d = null;
        } else
        {
            d = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, d, 0, abyte0.length);
        }
        list = gamerequest.n();
        i1 = list.size();
        f = new ArrayList(i1);
        j = new Bundle();
        for (int j1 = 0; j1 < i1; j1++)
        {
            Player player = (Player)((Player)list.get(j1)).a();
            String s = player.b_();
            f.add((PlayerEntity)player);
            j.putInt(s, gamerequest.a_(s));
        }

    }

    static int a(GameRequest gamerequest)
    {
        Object aobj[] = new Object[8];
        aobj[0] = gamerequest.e();
        aobj[1] = gamerequest.n();
        aobj[2] = gamerequest.d();
        aobj[3] = gamerequest.f();
        aobj[4] = c(gamerequest);
        aobj[5] = Integer.valueOf(gamerequest.i());
        aobj[6] = Long.valueOf(gamerequest.j());
        aobj[7] = Long.valueOf(gamerequest.k());
        return ln.a(aobj);
    }

    static boolean a(GameRequest gamerequest, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof GameRequest))
        {
            flag = false;
        } else
        if (gamerequest != obj)
        {
            GameRequest gamerequest1 = (GameRequest)obj;
            if (!ln.a(gamerequest1.e(), gamerequest.e()) || !ln.a(gamerequest1.n(), gamerequest.n()) || !ln.a(gamerequest1.d(), gamerequest.d()) || !ln.a(gamerequest1.f(), gamerequest.f()) || !Arrays.equals(c(gamerequest1), c(gamerequest)) || !ln.a(Integer.valueOf(gamerequest1.i()), Integer.valueOf(gamerequest.i())) || !ln.a(Long.valueOf(gamerequest1.j()), Long.valueOf(gamerequest.j())) || !ln.a(Long.valueOf(gamerequest1.k()), Long.valueOf(gamerequest.k())))
            {
                return false;
            }
        }
        return flag;
    }

    static String b(GameRequest gamerequest)
    {
        return ln.a(gamerequest).a("Game", gamerequest.e()).a("Sender", gamerequest.f()).a("Recipients", gamerequest.n()).a("Data", gamerequest.h()).a("RequestId", gamerequest.d()).a("Type", Integer.valueOf(gamerequest.i())).a("CreationTimestamp", Long.valueOf(gamerequest.j())).a("ExpirationTimestamp", Long.valueOf(gamerequest.k())).toString();
    }

    private static int[] c(GameRequest gamerequest)
    {
        List list = gamerequest.n();
        int i1 = list.size();
        int ai[] = new int[i1];
        for (int j1 = 0; j1 < i1; j1++)
        {
            ai[j1] = gamerequest.a_(((Player)list.get(j1)).b_());
        }

        return ai;
    }

    public Object a()
    {
        return g();
    }

    public int a_(String s)
    {
        return j.getInt(s, 0);
    }

    public int b()
    {
        return a;
    }

    public Bundle c()
    {
        return j;
    }

    public String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public Game e()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Player f()
    {
        return c;
    }

    public GameRequest g()
    {
        return this;
    }

    public byte[] h()
    {
        return d;
    }

    public int hashCode()
    {
        return a(this);
    }

    public int i()
    {
        return g;
    }

    public long j()
    {
        return h;
    }

    public long k()
    {
        return i;
    }

    public int l()
    {
        return k;
    }

    public List n()
    {
        return new ArrayList(f);
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.games.request.a.a(this, parcel, i1);
    }

}
