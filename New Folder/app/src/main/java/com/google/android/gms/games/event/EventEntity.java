// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, a

public final class EventEntity
    implements SafeParcelable, Event
{

    public static final a CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final Uri e;
    private final String f;
    private final PlayerEntity g;
    private final long h;
    private final String i;
    private final boolean j;

    EventEntity(int i1, String s, String s1, String s2, Uri uri, String s3, Player player, 
            long l1, String s4, boolean flag)
    {
        a = i1;
        b = s;
        c = s1;
        d = s2;
        e = uri;
        f = s3;
        g = new PlayerEntity(player);
        h = l1;
        i = s4;
        j = flag;
    }

    public EventEntity(Event event)
    {
        a = 1;
        b = event.c_();
        c = event.c();
        d = event.d();
        e = event.e();
        f = event.f();
        g = (PlayerEntity)event.g().a();
        h = event.h();
        i = event.i();
        j = event.j();
    }

    static int a(Event event)
    {
        Object aobj[] = new Object[9];
        aobj[0] = event.c_();
        aobj[1] = event.c();
        aobj[2] = event.d();
        aobj[3] = event.e();
        aobj[4] = event.f();
        aobj[5] = event.g();
        aobj[6] = Long.valueOf(event.h());
        aobj[7] = event.i();
        aobj[8] = Boolean.valueOf(event.j());
        return ln.a(aobj);
    }

    static boolean a(Event event, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Event))
        {
            flag = false;
        } else
        if (event != obj)
        {
            Event event1 = (Event)obj;
            if (!ln.a(event1.c_(), event.c_()) || !ln.a(event1.c(), event.c()) || !ln.a(event1.d(), event.d()) || !ln.a(event1.e(), event.e()) || !ln.a(event1.f(), event.f()) || !ln.a(event1.g(), event.g()) || !ln.a(Long.valueOf(event1.h()), Long.valueOf(event.h())) || !ln.a(event1.i(), event.i()) || !ln.a(Boolean.valueOf(event1.j()), Boolean.valueOf(event.j())))
            {
                return false;
            }
        }
        return flag;
    }

    static String b(Event event)
    {
        return ln.a(event).a("Id", event.c_()).a("Name", event.c()).a("Description", event.d()).a("IconImageUri", event.e()).a("IconImageUrl", event.f()).a("Player", event.g()).a("Value", Long.valueOf(event.h())).a("FormattedValue", event.i()).a("isVisible", Boolean.valueOf(event.j())).toString();
    }

    public Object a()
    {
        return l();
    }

    public String c()
    {
        return c;
    }

    public String c_()
    {
        return b;
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

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public String f()
    {
        return f;
    }

    public Player g()
    {
        return g;
    }

    public long h()
    {
        return h;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String i()
    {
        return i;
    }

    public boolean j()
    {
        return j;
    }

    public int k()
    {
        return a;
    }

    public Event l()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.games.event.a.a(this, parcel, i1);
    }

}
