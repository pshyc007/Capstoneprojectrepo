// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.ln;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            a

public final class GameRequestCluster
    implements SafeParcelable, GameRequest
{

    public static final a CREATOR = new a();
    private final int a;
    private final ArrayList b;

    GameRequestCluster(int i1, ArrayList arraylist)
    {
        a = i1;
        b = arraylist;
        o();
    }

    private void o()
    {
        boolean flag;
        GameRequest gamerequest;
        int i1;
        int j1;
        if (!b.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kl.a(flag);
        gamerequest = (GameRequest)b.get(0);
        i1 = b.size();
        j1 = 1;
        while (j1 < i1) 
        {
            GameRequest gamerequest1 = (GameRequest)b.get(j1);
            boolean flag1;
            if (gamerequest.i() == gamerequest1.i())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            kl.a(flag1, "All the requests must be of the same type");
            kl.a(gamerequest.f().equals(gamerequest1.f()), "All the requests must be from the same sender");
            j1++;
        }
    }

    public Object a()
    {
        return m();
    }

    public int a_(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int b()
    {
        return a;
    }

    public ArrayList c()
    {
        return new ArrayList(b);
    }

    public String d()
    {
        return ((GameRequestEntity)b.get(0)).d();
    }

    public int describeContents()
    {
        return 0;
    }

    public Game e()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof GameRequestCluster))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        GameRequestCluster gamerequestcluster = (GameRequestCluster)obj;
        if (gamerequestcluster.b.size() != b.size())
        {
            return false;
        }
        int i1 = b.size();
        for (int j1 = 0; j1 < i1; j1++)
        {
            if (!((GameRequest)b.get(j1)).equals((GameRequest)gamerequestcluster.b.get(j1)))
            {
                return false;
            }
        }

        return true;
    }

    public Player f()
    {
        return ((GameRequestEntity)b.get(0)).f();
    }

    public ArrayList g()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public byte[] h()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode()
    {
        return ln.a(b.toArray());
    }

    public int i()
    {
        return ((GameRequestEntity)b.get(0)).i();
    }

    public long j()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long k()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int l()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public GameRequest m()
    {
        return this;
    }

    public List n()
    {
        return g();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.games.internal.request.a.a(this, parcel, i1);
    }

}
