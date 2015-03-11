// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, b, MostRecentGameInfoEntity

public final class MostRecentGameInfoRef extends f
    implements MostRecentGameInfo
{

    private final b c;

    public MostRecentGameInfoRef(DataHolder dataholder, int i, b b1)
    {
        super(dataholder, i);
        c = b1;
    }

    public Object a()
    {
        return h();
    }

    public String c()
    {
        return e(c.t);
    }

    public long d()
    {
        return b(c.u);
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return h(c.v);
    }

    public boolean equals(Object obj)
    {
        return MostRecentGameInfoEntity.a(this, obj);
    }

    public Uri f()
    {
        return h(c.w);
    }

    public String f_()
    {
        return e(c.s);
    }

    public Uri g()
    {
        return h(c.x);
    }

    public MostRecentGameInfo h()
    {
        return new MostRecentGameInfoEntity(this);
    }

    public int hashCode()
    {
        return MostRecentGameInfoEntity.a(this);
    }

    public String toString()
    {
        return MostRecentGameInfoEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MostRecentGameInfoEntity)h()).writeToParcel(parcel, i);
    }
}
