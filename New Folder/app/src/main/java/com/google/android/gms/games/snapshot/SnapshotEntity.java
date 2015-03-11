// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            Snapshot, a, SnapshotMetadataEntity, SnapshotMetadata

public final class SnapshotEntity
    implements SafeParcelable, Snapshot
{

    public static final a CREATOR = new a();
    private static final Object a = new Object();
    private final int b;
    private final SnapshotMetadataEntity c;
    private Contents d;

    SnapshotEntity(int i, SnapshotMetadata snapshotmetadata, Contents contents)
    {
        b = i;
        c = new SnapshotMetadataEntity(snapshotmetadata);
        d = contents;
    }

    static int a(Snapshot snapshot)
    {
        Object aobj[] = new Object[2];
        aobj[0] = snapshot.b();
        aobj[1] = snapshot.c();
        return ln.a(aobj);
    }

    static boolean a(Snapshot snapshot, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Snapshot))
        {
            flag = false;
        } else
        if (snapshot != obj)
        {
            Snapshot snapshot1 = (Snapshot)obj;
            if (!ln.a(snapshot1.b(), snapshot.b()) || !ln.a(snapshot1.c(), snapshot.c()))
            {
                return false;
            }
        }
        return flag;
    }

    static String b(Snapshot snapshot)
    {
        lp lp1 = ln.a(snapshot).a("Metadata", snapshot.b());
        boolean flag;
        if (snapshot.c() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return lp1.a("HasContents", Boolean.valueOf(flag)).toString();
    }

    public Object a()
    {
        return e();
    }

    public SnapshotMetadata b()
    {
        return c;
    }

    public Contents c()
    {
        return d;
    }

    public int d()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public Snapshot e()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public int hashCode()
    {
        return a(this);
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.snapshot.a.a(this, parcel, i);
    }

}
