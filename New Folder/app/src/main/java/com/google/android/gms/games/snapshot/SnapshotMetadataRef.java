// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntity

public final class SnapshotMetadataRef extends f
    implements SnapshotMetadata
{

    private final Game c;
    private final Player d;

    public Object a()
    {
        return m();
    }

    public Player c()
    {
        return d;
    }

    public String d()
    {
        return e("external_snapshot_id");
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return h("cover_icon_image_uri");
    }

    public boolean equals(Object obj)
    {
        return SnapshotMetadataEntity.a(this, obj);
    }

    public String f()
    {
        return e("cover_icon_image_url");
    }

    public float g()
    {
        float f1 = f("cover_icon_image_height");
        float f2 = f("cover_icon_image_width");
        if (f1 == 0.0F)
        {
            return 0.0F;
        } else
        {
            return f2 / f1;
        }
    }

    public String h()
    {
        return e("unique_name");
    }

    public int hashCode()
    {
        return SnapshotMetadataEntity.a(this);
    }

    public String i()
    {
        return e("title");
    }

    public String j()
    {
        return e("description");
    }

    public long k()
    {
        return b("last_modified_timestamp");
    }

    public long l()
    {
        return b("duration");
    }

    public Game l_()
    {
        return c;
    }

    public SnapshotMetadata m()
    {
        return new SnapshotMetadataEntity(this);
    }

    public String toString()
    {
        return SnapshotMetadataEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ((SnapshotMetadataEntity)m()).writeToParcel(parcel, i1);
    }
}
