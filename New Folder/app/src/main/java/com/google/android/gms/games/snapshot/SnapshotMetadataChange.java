// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            b

public final class SnapshotMetadataChange
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    public static final SnapshotMetadataChange a = new SnapshotMetadataChange();
    private final int b;
    private final String c;
    private final Long d;
    private final Uri e;
    private a f;

    SnapshotMetadataChange()
    {
        this(4, null, null, null, null);
    }

    SnapshotMetadataChange(int i, String s, Long long1, a a1, Uri uri)
    {
        boolean flag = true;
        super();
        b = i;
        c = s;
        d = long1;
        f = a1;
        e = uri;
        if (f != null)
        {
            if (e != null)
            {
                flag = false;
            }
            lr.a(flag, "Cannot set both a URI and an image");
        } else
        if (e != null)
        {
            if (f != null)
            {
                flag = false;
            }
            lr.a(flag, "Cannot set both a URI and an image");
            return;
        }
    }

    public int a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public Long c()
    {
        return d;
    }

    public a d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.snapshot.b.a(this, parcel, i);
    }

}
