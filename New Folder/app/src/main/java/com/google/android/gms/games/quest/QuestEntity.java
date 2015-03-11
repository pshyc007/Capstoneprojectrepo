// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, b, Milestone, MilestoneEntity

public final class QuestEntity
    implements SafeParcelable, Quest
{

    public static final b CREATOR = new b();
    private final int c;
    private final GameEntity d;
    private final String e;
    private final long f;
    private final Uri g;
    private final String h;
    private final String i;
    private final long j;
    private final long k;
    private final Uri l;
    private final String m;
    private final String n;
    private final long o;
    private final long p;
    private final int q;
    private final int r;
    private final ArrayList s;

    QuestEntity(int i1, GameEntity gameentity, String s1, long l1, Uri uri, String s2, 
            String s3, long l2, long l3, Uri uri1, String s4, 
            String s5, long l4, long l5, int j1, int k1, 
            ArrayList arraylist)
    {
        c = i1;
        d = gameentity;
        e = s1;
        f = l1;
        g = uri;
        h = s2;
        i = s3;
        j = l2;
        k = l3;
        l = uri1;
        m = s4;
        n = s5;
        o = l4;
        p = l5;
        q = j1;
        r = k1;
        s = arraylist;
    }

    public QuestEntity(Quest quest)
    {
        c = 2;
        d = new GameEntity(quest.j());
        e = quest.k_();
        f = quest.m();
        i = quest.d();
        g = quest.e();
        h = quest.f();
        j = quest.n();
        l = quest.g();
        m = quest.h();
        k = quest.o();
        n = quest.c();
        o = quest.p();
        p = quest.q();
        q = quest.k();
        r = quest.l();
        List list = quest.i();
        int i1 = list.size();
        s = new ArrayList(i1);
        for (int j1 = 0; j1 < i1; j1++)
        {
            s.add((MilestoneEntity)(MilestoneEntity)((Milestone)list.get(j1)).a());
        }

    }

    static int a(Quest quest)
    {
        Object aobj[] = new Object[13];
        aobj[0] = quest.j();
        aobj[1] = quest.k_();
        aobj[2] = Long.valueOf(quest.m());
        aobj[3] = quest.e();
        aobj[4] = quest.d();
        aobj[5] = Long.valueOf(quest.n());
        aobj[6] = quest.g();
        aobj[7] = Long.valueOf(quest.o());
        aobj[8] = quest.i();
        aobj[9] = quest.c();
        aobj[10] = Long.valueOf(quest.p());
        aobj[11] = Long.valueOf(quest.q());
        aobj[12] = Integer.valueOf(quest.k());
        return ln.a(aobj);
    }

    static boolean a(Quest quest, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Quest))
        {
            flag = false;
        } else
        if (quest != obj)
        {
            Quest quest1 = (Quest)obj;
            if (!ln.a(quest1.j(), quest.j()) || !ln.a(quest1.k_(), quest.k_()) || !ln.a(Long.valueOf(quest1.m()), Long.valueOf(quest.m())) || !ln.a(quest1.e(), quest.e()) || !ln.a(quest1.d(), quest.d()) || !ln.a(Long.valueOf(quest1.n()), Long.valueOf(quest.n())) || !ln.a(quest1.g(), quest.g()) || !ln.a(Long.valueOf(quest1.o()), Long.valueOf(quest.o())) || !ln.a(quest1.i(), quest.i()) || !ln.a(quest1.c(), quest.c()) || !ln.a(Long.valueOf(quest1.p()), Long.valueOf(quest.p())) || !ln.a(Long.valueOf(quest1.q()), Long.valueOf(quest.q())) || !ln.a(Integer.valueOf(quest1.k()), Integer.valueOf(quest.k())))
            {
                return false;
            }
        }
        return flag;
    }

    static String b(Quest quest)
    {
        return ln.a(quest).a("Game", quest.j()).a("QuestId", quest.k_()).a("AcceptedTimestamp", Long.valueOf(quest.m())).a("BannerImageUri", quest.e()).a("BannerImageUrl", quest.f()).a("Description", quest.d()).a("EndTimestamp", Long.valueOf(quest.n())).a("IconImageUri", quest.g()).a("IconImageUrl", quest.h()).a("LastUpdatedTimestamp", Long.valueOf(quest.o())).a("Milestones", quest.i()).a("Name", quest.c()).a("NotifyTimestamp", Long.valueOf(quest.p())).a("StartTimestamp", Long.valueOf(quest.q())).a("State", Integer.valueOf(quest.k())).toString();
    }

    public Object a()
    {
        return s();
    }

    public String c()
    {
        return n;
    }

    public String d()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public String f()
    {
        return h;
    }

    public Uri g()
    {
        return l;
    }

    public String h()
    {
        return m;
    }

    public int hashCode()
    {
        return a(this);
    }

    public List i()
    {
        return new ArrayList(s);
    }

    public Game j()
    {
        return d;
    }

    public int k()
    {
        return q;
    }

    public String k_()
    {
        return e;
    }

    public int l()
    {
        return r;
    }

    public long m()
    {
        return f;
    }

    public long n()
    {
        return j;
    }

    public long o()
    {
        return k;
    }

    public long p()
    {
        return o;
    }

    public long q()
    {
        return p;
    }

    public int r()
    {
        return c;
    }

    public Quest s()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.games.quest.b.a(this, parcel, i1);
    }

}
