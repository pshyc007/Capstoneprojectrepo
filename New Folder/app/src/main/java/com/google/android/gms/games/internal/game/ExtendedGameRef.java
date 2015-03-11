// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, GameBadgeRef, ExtendedGameEntity

public class ExtendedGameRef extends f
    implements ExtendedGame
{

    private final GameRef c;
    private final SnapshotMetadataRef d;
    private final int e;

    public Object a()
    {
        return m();
    }

    public ArrayList c()
    {
        int i1 = 0;
        if (a.c("badge_title", b, a.a(b)) == null)
        {
            return new ArrayList(0);
        }
        ArrayList arraylist = new ArrayList(e);
        for (; i1 < e; i1++)
        {
            arraylist.add(new GameBadgeRef(a, i1 + b));
        }

        return arraylist;
    }

    public int d()
    {
        return c("availability");
    }

    public Game d_()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return d("owned");
    }

    public boolean equals(Object obj)
    {
        return ExtendedGameEntity.a(this, obj);
    }

    public int f()
    {
        return c("achievement_unlocked_count");
    }

    public long g()
    {
        return b("last_played_server_time");
    }

    public long h()
    {
        return b("price_micros");
    }

    public int hashCode()
    {
        return ExtendedGameEntity.a(this);
    }

    public String i()
    {
        return e("formatted_price");
    }

    public long j()
    {
        return b("full_price_micros");
    }

    public String k()
    {
        return e("formatted_full_price");
    }

    public SnapshotMetadata l()
    {
        return d;
    }

    public ExtendedGame m()
    {
        return new ExtendedGameEntity(this);
    }

    public String toString()
    {
        return ExtendedGameEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ((ExtendedGameEntity)m()).writeToParcel(parcel, i1);
    }
}
