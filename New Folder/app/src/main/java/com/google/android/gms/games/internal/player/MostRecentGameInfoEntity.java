// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, a

public final class MostRecentGameInfoEntity
    implements SafeParcelable, MostRecentGameInfo
{

    public static final a CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final Uri e;
    private final Uri f;
    private final Uri g;

    MostRecentGameInfoEntity(int j, String s, String s1, long l, Uri uri, Uri uri1, 
            Uri uri2)
    {
        a = j;
        b = s;
        c = s1;
        d = l;
        e = uri;
        f = uri1;
        g = uri2;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostrecentgameinfo)
    {
        a = 2;
        b = mostrecentgameinfo.f_();
        c = mostrecentgameinfo.c();
        d = mostrecentgameinfo.d();
        e = mostrecentgameinfo.e();
        f = mostrecentgameinfo.f();
        g = mostrecentgameinfo.g();
    }

    static int a(MostRecentGameInfo mostrecentgameinfo)
    {
        Object aobj[] = new Object[6];
        aobj[0] = mostrecentgameinfo.f_();
        aobj[1] = mostrecentgameinfo.c();
        aobj[2] = Long.valueOf(mostrecentgameinfo.d());
        aobj[3] = mostrecentgameinfo.e();
        aobj[4] = mostrecentgameinfo.f();
        aobj[5] = mostrecentgameinfo.g();
        return ln.a(aobj);
    }

    static boolean a(MostRecentGameInfo mostrecentgameinfo, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof MostRecentGameInfo))
        {
            flag = false;
        } else
        if (mostrecentgameinfo != obj)
        {
            MostRecentGameInfo mostrecentgameinfo1 = (MostRecentGameInfo)obj;
            if (!ln.a(mostrecentgameinfo1.f_(), mostrecentgameinfo.f_()) || !ln.a(mostrecentgameinfo1.c(), mostrecentgameinfo.c()) || !ln.a(Long.valueOf(mostrecentgameinfo1.d()), Long.valueOf(mostrecentgameinfo.d())) || !ln.a(mostrecentgameinfo1.e(), mostrecentgameinfo.e()) || !ln.a(mostrecentgameinfo1.f(), mostrecentgameinfo.f()) || !ln.a(mostrecentgameinfo1.g(), mostrecentgameinfo.g()))
            {
                return false;
            }
        }
        return flag;
    }

    static String b(MostRecentGameInfo mostrecentgameinfo)
    {
        return ln.a(mostrecentgameinfo).a("GameId", mostrecentgameinfo.f_()).a("GameName", mostrecentgameinfo.c()).a("ActivityTimestampMillis", Long.valueOf(mostrecentgameinfo.d())).a("GameIconUri", mostrecentgameinfo.e()).a("GameHiResUri", mostrecentgameinfo.f()).a("GameFeaturedUri", mostrecentgameinfo.g()).toString();
    }

    public Object a()
    {
        return i();
    }

    public String c()
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

    public Uri e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Uri f()
    {
        return f;
    }

    public String f_()
    {
        return b;
    }

    public Uri g()
    {
        return g;
    }

    public int h()
    {
        return a;
    }

    public int hashCode()
    {
        return a(this);
    }

    public MostRecentGameInfo i()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.games.internal.player.a.a(this, parcel, j);
    }

}
