// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntity, MilestoneRef

public final class QuestRef extends f
    implements Quest
{

    private final Game c;
    private final int d;

    public Object a()
    {
        return r();
    }

    public String c()
    {
        return e("quest_name");
    }

    public String d()
    {
        return e("quest_description");
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return h("quest_banner_image_uri");
    }

    public boolean equals(Object obj)
    {
        return QuestEntity.a(this, obj);
    }

    public String f()
    {
        return e("quest_banner_image_url");
    }

    public Uri g()
    {
        return h("quest_icon_image_uri");
    }

    public String h()
    {
        return e("quest_icon_image_url");
    }

    public int hashCode()
    {
        return QuestEntity.a(this);
    }

    public List i()
    {
        ArrayList arraylist = new ArrayList(d);
        for (int i1 = 0; i1 < d; i1++)
        {
            arraylist.add(new MilestoneRef(a, i1 + b));
        }

        return arraylist;
    }

    public Game j()
    {
        return c;
    }

    public int k()
    {
        return c("quest_state");
    }

    public String k_()
    {
        return e("external_quest_id");
    }

    public int l()
    {
        return c("quest_type");
    }

    public long m()
    {
        return b("accepted_ts");
    }

    public long n()
    {
        return b("quest_end_ts");
    }

    public long o()
    {
        return b("quest_last_updated_ts");
    }

    public long p()
    {
        return b("notification_ts");
    }

    public long q()
    {
        return b("quest_start_ts");
    }

    public Quest r()
    {
        return new QuestEntity(this);
    }

    public String toString()
    {
        return QuestEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ((QuestEntity)r()).writeToParcel(parcel, i1);
    }
}
