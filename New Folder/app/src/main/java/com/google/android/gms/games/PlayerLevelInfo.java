// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.games:
//            f, PlayerLevel

public final class PlayerLevelInfo
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int a;
    private final long b;
    private final long c;
    private final PlayerLevel d;
    private final PlayerLevel e;

    PlayerLevelInfo(int i, long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        boolean flag;
        if (l != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lr.a(flag);
        lr.a(playerlevel);
        lr.a(playerlevel1);
        a = i;
        b = l;
        c = l1;
        d = playerlevel;
        e = playerlevel1;
    }

    public PlayerLevelInfo(long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        this(1, l, l1, playerlevel, playerlevel1);
    }

    public int a()
    {
        return a;
    }

    public long b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public PlayerLevel d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public PlayerLevel e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof PlayerLevelInfo))
        {
            flag = false;
        } else
        if (obj != this)
        {
            PlayerLevelInfo playerlevelinfo = (PlayerLevelInfo)obj;
            if (!ln.a(Long.valueOf(b), Long.valueOf(playerlevelinfo.b)) || !ln.a(Long.valueOf(c), Long.valueOf(playerlevelinfo.c)) || !ln.a(d, playerlevelinfo.d) || !ln.a(e, playerlevelinfo.e))
            {
                return false;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[4];
        aobj[0] = Long.valueOf(b);
        aobj[1] = Long.valueOf(c);
        aobj[2] = d;
        aobj[3] = e;
        return ln.a(aobj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
