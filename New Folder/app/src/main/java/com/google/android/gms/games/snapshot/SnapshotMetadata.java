// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;

public interface SnapshotMetadata
    extends Parcelable, d
{

    public abstract Player c();

    public abstract String d();

    public abstract Uri e();

    public abstract String f();

    public abstract float g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract long k();

    public abstract long l();

    public abstract Game l_();
}
