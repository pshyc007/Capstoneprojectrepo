// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, c, d

public final class RoomEntity extends GamesDowngradeableSafeParcel
    implements Room
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;
    private final String f;
    private final int g;
    private final Bundle h;
    private final ArrayList i;
    private final int j;

    RoomEntity(int i1, String s, String s1, long l1, int j1, String s2, 
            int k1, Bundle bundle, ArrayList arraylist, int i2)
    {
        a = i1;
        b = s;
        c = s1;
        d = l1;
        e = j1;
        f = s2;
        g = k1;
        h = bundle;
        i = arraylist;
        j = i2;
    }

    public RoomEntity(Room room)
    {
        a = 2;
        b = room.h_();
        c = room.c();
        d = room.d();
        e = room.e();
        f = room.f();
        g = room.g();
        h = room.h();
        ArrayList arraylist = room.l();
        int i1 = arraylist.size();
        i = new ArrayList(i1);
        for (int j1 = 0; j1 < i1; j1++)
        {
            i.add((ParticipantEntity)((Participant)arraylist.get(j1)).a());
        }

        j = room.i();
    }

    static int a(Room room)
    {
        Object aobj[] = new Object[9];
        aobj[0] = room.h_();
        aobj[1] = room.c();
        aobj[2] = Long.valueOf(room.d());
        aobj[3] = Integer.valueOf(room.e());
        aobj[4] = room.f();
        aobj[5] = Integer.valueOf(room.g());
        aobj[6] = room.h();
        aobj[7] = room.l();
        aobj[8] = Integer.valueOf(room.i());
        return ln.a(aobj);
    }

    static boolean a(Room room, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Room))
        {
            flag = false;
        } else
        if (room != obj)
        {
            Room room1 = (Room)obj;
            if (!ln.a(room1.h_(), room.h_()) || !ln.a(room1.c(), room.c()) || !ln.a(Long.valueOf(room1.d()), Long.valueOf(room.d())) || !ln.a(Integer.valueOf(room1.e()), Integer.valueOf(room.e())) || !ln.a(room1.f(), room.f()) || !ln.a(Integer.valueOf(room1.g()), Integer.valueOf(room.g())) || !ln.a(room1.h(), room.h()) || !ln.a(room1.l(), room.l()) || !ln.a(Integer.valueOf(room1.i()), Integer.valueOf(room.i())))
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

    static String b(Room room)
    {
        return ln.a(room).a("RoomId", room.h_()).a("CreatorId", room.c()).a("CreationTimestamp", Long.valueOf(room.d())).a("RoomStatus", Integer.valueOf(room.e())).a("Description", room.f()).a("Variant", Integer.valueOf(room.g())).a("AutoMatchCriteria", room.h()).a("Participants", room.l()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.i())).toString();
    }

    static Integer m()
    {
        return C();
    }

    public Object a()
    {
        return k();
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

    public int e()
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

    public int g()
    {
        return g;
    }

    public Bundle h()
    {
        return h;
    }

    public String h_()
    {
        return b;
    }

    public int hashCode()
    {
        return a(this);
    }

    public int i()
    {
        return j;
    }

    public int j()
    {
        return a;
    }

    public Room k()
    {
        return this;
    }

    public ArrayList l()
    {
        return new ArrayList(i);
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (!D())
        {
            com.google.android.gms.games.multiplayer.realtime.d.a(this, parcel, i1);
        } else
        {
            parcel.writeString(b);
            parcel.writeString(c);
            parcel.writeLong(d);
            parcel.writeInt(e);
            parcel.writeString(f);
            parcel.writeInt(g);
            parcel.writeBundle(h);
            int j1 = i.size();
            parcel.writeInt(j1);
            int k1 = 0;
            while (k1 < j1) 
            {
                ((ParticipantEntity)i.get(k1)).writeToParcel(parcel, i1);
                k1++;
            }
        }
    }

}
