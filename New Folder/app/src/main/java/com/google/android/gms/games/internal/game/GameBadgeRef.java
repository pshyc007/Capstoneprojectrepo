// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntity

public final class GameBadgeRef extends f
    implements GameBadge
{

    GameBadgeRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object a()
    {
        return f();
    }

    public String c()
    {
        return e("badge_title");
    }

    public String d()
    {
        return e("badge_description");
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return h("badge_icon_image_uri");
    }

    public int e_()
    {
        return c("badge_type");
    }

    public boolean equals(Object obj)
    {
        return GameBadgeEntity.a(this, obj);
    }

    public GameBadge f()
    {
        return new GameBadgeEntity(this);
    }

    public int hashCode()
    {
        return GameBadgeEntity.a(this);
    }

    public String toString()
    {
        return GameBadgeEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((GameBadgeEntity)f()).writeToParcel(parcel, i);
    }
}
