// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntity

public final class GameRef extends f
    implements Game
{

    public GameRef(DataHolder dataholder, int i1)
    {
        super(dataholder, i1);
    }

    public Object a()
    {
        return y();
    }

    public String a_()
    {
        return e("external_game_id");
    }

    public String c()
    {
        return e("display_name");
    }

    public String d()
    {
        return e("primary_category");
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e("secondary_category");
    }

    public boolean equals(Object obj)
    {
        return GameEntity.a(this, obj);
    }

    public String f()
    {
        return e("game_description");
    }

    public String g()
    {
        return e("developer_name");
    }

    public Uri h()
    {
        return h("game_icon_image_uri");
    }

    public int hashCode()
    {
        return GameEntity.a(this);
    }

    public String i()
    {
        return e("game_icon_image_url");
    }

    public Uri j()
    {
        return h("game_hi_res_image_uri");
    }

    public String k()
    {
        return e("game_hi_res_image_url");
    }

    public Uri l()
    {
        return h("featured_image_uri");
    }

    public String m()
    {
        return e("featured_image_url");
    }

    public boolean n()
    {
        return d("play_enabled_game");
    }

    public boolean o()
    {
        return d("muted");
    }

    public boolean p()
    {
        return d("identity_sharing_confirmed");
    }

    public boolean q()
    {
        return c("installed") > 0;
    }

    public String r()
    {
        return e("package_name");
    }

    public int s()
    {
        return c("gameplay_acl_status");
    }

    public int t()
    {
        return c("achievement_total_count");
    }

    public String toString()
    {
        return GameEntity.b(this);
    }

    public int u()
    {
        return c("leaderboard_count");
    }

    public boolean v()
    {
        return c("real_time_support") > 0;
    }

    public boolean w()
    {
        return c("turn_based_support") > 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ((GameEntity)y()).writeToParcel(parcel, i1);
    }

    public boolean x()
    {
        return c("snapshots_enabled") > 0;
    }

    public Game y()
    {
        return new GameEntity(this);
    }
}
