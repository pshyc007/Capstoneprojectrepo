// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntity

public final class MilestoneRef extends f
    implements Milestone
{

    MilestoneRef(DataHolder dataholder, int j)
    {
        super(dataholder, j);
    }

    private long i()
    {
        return b("initial_value");
    }

    public Object a()
    {
        return h();
    }

    public long c()
    {
        switch (e())
        {
        case 1: // '\001'
        default:
            return 0L;

        case 3: // '\003'
        case 4: // '\004'
            return f();

        case 2: // '\002'
            return b("current_value") - i();
        }
    }

    public String d()
    {
        return e("external_event_id");
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return c("milestone_state");
    }

    public boolean equals(Object obj)
    {
        return MilestoneEntity.a(this, obj);
    }

    public long f()
    {
        return b("target_value");
    }

    public byte[] g()
    {
        return g("completion_reward_data");
    }

    public Milestone h()
    {
        return new MilestoneEntity(this);
    }

    public int hashCode()
    {
        return MilestoneEntity.a(this);
    }

    public String j_()
    {
        return e("external_milestone_id");
    }

    public String toString()
    {
        return MilestoneEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        ((MilestoneEntity)h()).writeToParcel(parcel, j);
    }
}
