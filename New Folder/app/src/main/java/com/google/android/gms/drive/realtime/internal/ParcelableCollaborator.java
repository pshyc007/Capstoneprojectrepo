// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            c

public class ParcelableCollaborator
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    final boolean b;
    final boolean c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;

    ParcelableCollaborator(int i, boolean flag, boolean flag1, String s, String s1, String s2, String s3, 
            String s4)
    {
        a = i;
        b = flag;
        c = flag1;
        d = s;
        e = s1;
        f = s2;
        g = s3;
        h = s4;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ParcelableCollaborator))
        {
            return false;
        } else
        {
            ParcelableCollaborator parcelablecollaborator = (ParcelableCollaborator)obj;
            return d.equals(parcelablecollaborator.d);
        }
    }

    public int hashCode()
    {
        return d.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Collaborator [isMe=").append(b).append(", isAnonymous=").append(c).append(", sessionId=").append(d).append(", userId=").append(e).append(", displayName=").append(f).append(", color=").append(g).append(", photoUrl=").append(h).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.realtime.internal.c.a(this, parcel, i);
    }

}
