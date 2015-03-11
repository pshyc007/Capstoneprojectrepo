// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntity

public final class EventRef extends f
    implements Event
{

    public Object a()
    {
        return k();
    }

    public String c()
    {
        return e("name");
    }

    public String c_()
    {
        return e("external_event_id");
    }

    public String d()
    {
        return e("description");
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return h("icon_image_uri");
    }

    public boolean equals(Object obj)
    {
        return EventEntity.a(this, obj);
    }

    public String f()
    {
        return e("icon_image_url");
    }

    public Player g()
    {
        return new PlayerRef(a, b);
    }

    public long h()
    {
        return b("value");
    }

    public int hashCode()
    {
        return EventEntity.a(this);
    }

    public String i()
    {
        return e("formatted_value");
    }

    public boolean j()
    {
        return d("visibility");
    }

    public Event k()
    {
        return new EventEntity(this);
    }

    public String toString()
    {
        return EventEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        ((EventEntity)k()).writeToParcel(parcel, l);
    }
}
