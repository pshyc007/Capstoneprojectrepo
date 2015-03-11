// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, c, d

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel
    implements GameBadge
{

    public static final d CREATOR = new c();
    private final int a;
    private int b;
    private String c;
    private String d;
    private Uri e;

    GameBadgeEntity(int i, int j, String s, String s1, Uri uri)
    {
        a = i;
        b = j;
        c = s;
        d = s1;
        e = uri;
    }

    public GameBadgeEntity(GameBadge gamebadge)
    {
        a = 1;
        b = gamebadge.e_();
        c = gamebadge.c();
        d = gamebadge.d();
        e = gamebadge.e();
    }

    static int a(GameBadge gamebadge)
    {
        Object aobj[] = new Object[4];
        aobj[0] = Integer.valueOf(gamebadge.e_());
        aobj[1] = gamebadge.c();
        aobj[2] = gamebadge.d();
        aobj[3] = gamebadge.e();
        return ln.a(aobj);
    }

    static boolean a(GameBadge gamebadge, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof GameBadge))
        {
            flag = false;
        } else
        if (gamebadge != obj)
        {
            GameBadge gamebadge1 = (GameBadge)obj;
            if (!ln.a(Integer.valueOf(gamebadge1.e_()), gamebadge.c()) || !ln.a(gamebadge1.d(), gamebadge.e()))
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

    static String b(GameBadge gamebadge)
    {
        return ln.a(gamebadge).a("Type", Integer.valueOf(gamebadge.e_())).a("Title", gamebadge.c()).a("Description", gamebadge.d()).a("IconImageUri", gamebadge.e()).toString();
    }

    static Integer h()
    {
        return C();
    }

    public Object a()
    {
        return g();
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

    public Uri e()
    {
        return e;
    }

    public int e_()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public int f()
    {
        return a;
    }

    public GameBadge g()
    {
        return this;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!D())
        {
            com.google.android.gms.games.internal.game.d.a(this, parcel, i);
            return;
        }
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeString(d);
        String s;
        if (e == null)
        {
            s = null;
        } else
        {
            s = e.toString();
        }
        parcel.writeString(s);
    }

}
