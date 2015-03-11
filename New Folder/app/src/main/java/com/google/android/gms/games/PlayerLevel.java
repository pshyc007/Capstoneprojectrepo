// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.games:
//            e

public final class PlayerLevel
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    private final int a;
    private final int b;
    private final long c;
    private final long d;

    PlayerLevel(int i, int j, long l, long l1)
    {
        boolean flag = true;
        super();
        boolean flag1;
        if (l >= 0L)
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        lr.a(flag1, "Min XP must be positive!");
        if (l1 <= l)
        {
            flag = false;
        }
        lr.a(flag, "Max XP must be more than min XP!");
        a = i;
        b = j;
        c = l;
        d = l1;
    }

    public PlayerLevel(int i, long l, long l1)
    {
        this(1, i, l, l1);
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public long d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof PlayerLevel))
        {
            flag = false;
        } else
        if (this != obj)
        {
            PlayerLevel playerlevel = (PlayerLevel)obj;
            if (!ln.a(Integer.valueOf(playerlevel.b()), Integer.valueOf(b())) || !ln.a(Long.valueOf(playerlevel.c()), Long.valueOf(c())) || !ln.a(Long.valueOf(playerlevel.d()), Long.valueOf(d())))
            {
                return false;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[3];
        aobj[0] = Integer.valueOf(b);
        aobj[1] = Long.valueOf(c);
        aobj[2] = Long.valueOf(d);
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("LevelNumber", Integer.valueOf(b())).a("MinXp", Long.valueOf(c())).a("MaxXp", Long.valueOf(d())).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
