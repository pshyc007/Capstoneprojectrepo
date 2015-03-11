// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfo

public interface Player
    extends Parcelable, d
{

    public abstract String b_();

    public abstract String c();

    public abstract Uri d();

    public abstract String e();

    public abstract Uri f();

    public abstract String g();

    public abstract long h();

    public abstract long i();

    public abstract int j();

    public abstract boolean k();

    public abstract String l();

    public abstract PlayerLevelInfo m();

    public abstract MostRecentGameInfo n();
}
