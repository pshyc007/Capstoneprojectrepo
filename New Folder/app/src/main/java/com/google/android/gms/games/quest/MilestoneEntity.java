// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, a

public final class MilestoneEntity
    implements SafeParcelable, Milestone
{

    public static final a CREATOR = new a();
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final byte e[];
    private final int f;
    private final String g;

    MilestoneEntity(int j, String s, long l, long l1, byte abyte0[], 
            int k, String s1)
    {
        a = j;
        b = s;
        c = l;
        d = l1;
        e = abyte0;
        f = k;
        g = s1;
    }

    public MilestoneEntity(Milestone milestone)
    {
        a = 4;
        b = milestone.j_();
        c = milestone.c();
        d = milestone.f();
        f = milestone.e();
        g = milestone.d();
        byte abyte0[] = milestone.g();
        if (abyte0 == null)
        {
            e = null;
            return;
        } else
        {
            e = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, e, 0, abyte0.length);
            return;
        }
    }

    static int a(Milestone milestone)
    {
        Object aobj[] = new Object[5];
        aobj[0] = milestone.j_();
        aobj[1] = Long.valueOf(milestone.c());
        aobj[2] = Long.valueOf(milestone.f());
        aobj[3] = Integer.valueOf(milestone.e());
        aobj[4] = milestone.d();
        return ln.a(aobj);
    }

    static boolean a(Milestone milestone, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Milestone))
        {
            flag = false;
        } else
        if (milestone != obj)
        {
            Milestone milestone1 = (Milestone)obj;
            if (!ln.a(milestone1.j_(), milestone.j_()) || !ln.a(Long.valueOf(milestone1.c()), Long.valueOf(milestone.c())) || !ln.a(Long.valueOf(milestone1.f()), Long.valueOf(milestone.f())) || !ln.a(Integer.valueOf(milestone1.e()), Integer.valueOf(milestone.e())) || !ln.a(milestone1.d(), milestone.d()))
            {
                return false;
            }
        }
        return flag;
    }

    static String b(Milestone milestone)
    {
        return ln.a(milestone).a("MilestoneId", milestone.j_()).a("CurrentProgress", Long.valueOf(milestone.c())).a("TargetProgress", Long.valueOf(milestone.f())).a("State", Integer.valueOf(milestone.e())).a("CompletionRewardData", milestone.g()).a("EventId", milestone.d()).toString();
    }

    public Object a()
    {
        return i();
    }

    public long c()
    {
        return c;
    }

    public String d()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public long f()
    {
        return d;
    }

    public byte[] g()
    {
        return e;
    }

    public int h()
    {
        return a;
    }

    public int hashCode()
    {
        return a(this);
    }

    public Milestone i()
    {
        return this;
    }

    public String j_()
    {
        return b;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.games.quest.a.a(this, parcel, j);
    }

}
