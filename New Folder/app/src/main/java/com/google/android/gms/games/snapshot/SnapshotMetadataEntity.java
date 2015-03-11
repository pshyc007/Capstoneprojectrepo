// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, c

public final class SnapshotMetadataEntity
    implements SafeParcelable, SnapshotMetadata
{

    public static final c CREATOR = new c();
    private final int a;
    private final GameEntity b;
    private final PlayerEntity c;
    private final String d;
    private final Uri e;
    private final String f;
    private final String g;
    private final String h;
    private final long i;
    private final long j;
    private final float k;
    private final String l;

    SnapshotMetadataEntity(int i1, GameEntity gameentity, PlayerEntity playerentity, String s, Uri uri, String s1, String s2, 
            String s3, long l1, long l2, float f1, String s4)
    {
        a = i1;
        b = gameentity;
        c = playerentity;
        d = s;
        e = uri;
        f = s1;
        k = f1;
        g = s2;
        h = s3;
        i = l1;
        j = l2;
        l = s4;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotmetadata)
    {
        a = 3;
        b = new GameEntity(snapshotmetadata.l_());
        c = new PlayerEntity(snapshotmetadata.c());
        d = snapshotmetadata.d();
        e = snapshotmetadata.e();
        f = snapshotmetadata.f();
        k = snapshotmetadata.g();
        g = snapshotmetadata.i();
        h = snapshotmetadata.j();
        i = snapshotmetadata.k();
        j = snapshotmetadata.l();
        l = snapshotmetadata.h();
    }

    static int a(SnapshotMetadata snapshotmetadata)
    {
        Object aobj[] = new Object[10];
        aobj[0] = snapshotmetadata.l_();
        aobj[1] = snapshotmetadata.c();
        aobj[2] = snapshotmetadata.d();
        aobj[3] = snapshotmetadata.e();
        aobj[4] = Float.valueOf(snapshotmetadata.g());
        aobj[5] = snapshotmetadata.i();
        aobj[6] = snapshotmetadata.j();
        aobj[7] = Long.valueOf(snapshotmetadata.k());
        aobj[8] = Long.valueOf(snapshotmetadata.l());
        aobj[9] = snapshotmetadata.h();
        return ln.a(aobj);
    }

    static boolean a(SnapshotMetadata snapshotmetadata, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof SnapshotMetadata))
        {
            flag = false;
        } else
        if (snapshotmetadata != obj)
        {
            SnapshotMetadata snapshotmetadata1 = (SnapshotMetadata)obj;
            if (!ln.a(snapshotmetadata1.l_(), snapshotmetadata.l_()) || !ln.a(snapshotmetadata1.c(), snapshotmetadata.c()) || !ln.a(snapshotmetadata1.d(), snapshotmetadata.d()) || !ln.a(snapshotmetadata1.e(), snapshotmetadata.e()) || !ln.a(Float.valueOf(snapshotmetadata1.g()), Float.valueOf(snapshotmetadata.g())) || !ln.a(snapshotmetadata1.i(), snapshotmetadata.i()) || !ln.a(snapshotmetadata1.j(), snapshotmetadata.j()) || !ln.a(Long.valueOf(snapshotmetadata1.k()), Long.valueOf(snapshotmetadata.k())) || !ln.a(Long.valueOf(snapshotmetadata1.l()), Long.valueOf(snapshotmetadata.l())) || !ln.a(snapshotmetadata1.h(), snapshotmetadata.h()))
            {
                return false;
            }
        }
        return flag;
    }

    static String b(SnapshotMetadata snapshotmetadata)
    {
        return ln.a(snapshotmetadata).a("Game", snapshotmetadata.l_()).a("Owner", snapshotmetadata.c()).a("SnapshotId", snapshotmetadata.d()).a("CoverImageUri", snapshotmetadata.e()).a("CoverImageUrl", snapshotmetadata.f()).a("CoverImageAspectRatio", Float.valueOf(snapshotmetadata.g())).a("Description", snapshotmetadata.j()).a("LastModifiedTimestamp", Long.valueOf(snapshotmetadata.k())).a("PlayedTime", Long.valueOf(snapshotmetadata.l())).a("UniqueName", snapshotmetadata.h()).toString();
    }

    public Object a()
    {
        return n();
    }

    public Player c()
    {
        return c;
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

    public float g()
    {
        return k;
    }

    public String h()
    {
        return l;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String i()
    {
        return g;
    }

    public String j()
    {
        return h;
    }

    public long k()
    {
        return i;
    }

    public long l()
    {
        return j;
    }

    public Game l_()
    {
        return b;
    }

    public int m()
    {
        return a;
    }

    public SnapshotMetadata n()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.games.snapshot.c.a(this, parcel, i1);
    }

}
