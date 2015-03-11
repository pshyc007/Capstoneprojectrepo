// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.ln;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.multiplayer:
//            a

public final class ZInvitationCluster
    implements SafeParcelable, Invitation
{

    public static final a CREATOR = new a();
    private final int a;
    private final ArrayList b;

    ZInvitationCluster(int i1, ArrayList arraylist)
    {
        a = i1;
        b = arraylist;
        m();
    }

    private void m()
    {
        boolean flag;
        Invitation invitation;
        int i1;
        if (!b.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kl.a(flag);
        invitation = (Invitation)b.get(0);
        i1 = b.size();
        for (int j1 = 1; j1 < i1; j1++)
        {
            Invitation invitation1 = (Invitation)b.get(j1);
            kl.a(invitation.f().equals(invitation1.f()), "All the invitations must be from the same inviter");
        }

    }

    public Object a()
    {
        return k();
    }

    public int b()
    {
        return a;
    }

    public ArrayList c()
    {
        return new ArrayList(b);
    }

    public Game d()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return ((InvitationEntity)b.get(0)).e();
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ZInvitationCluster))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        ZInvitationCluster zinvitationcluster = (ZInvitationCluster)obj;
        if (zinvitationcluster.b.size() != b.size())
        {
            return false;
        }
        int i1 = b.size();
        for (int j1 = 0; j1 < i1; j1++)
        {
            if (!((Invitation)b.get(j1)).equals((Invitation)zinvitationcluster.b.get(j1)))
            {
                return false;
            }
        }

        return true;
    }

    public Participant f()
    {
        return ((InvitationEntity)b.get(0)).f();
    }

    public long g()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int h()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode()
    {
        return ln.a(b.toArray());
    }

    public int i()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int j()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Invitation k()
    {
        return this;
    }

    public ArrayList l()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.games.internal.multiplayer.a.a(this, parcel, i1);
    }

}
