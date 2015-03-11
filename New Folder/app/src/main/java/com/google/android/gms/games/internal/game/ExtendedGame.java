// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import java.util.ArrayList;

public interface ExtendedGame
    extends Parcelable, d
{

    public abstract ArrayList c();

    public abstract int d();

    public abstract Game d_();

    public abstract boolean e();

    public abstract int f();

    public abstract long g();

    public abstract long h();

    public abstract String i();

    public abstract long j();

    public abstract String k();

    public abstract SnapshotMetadata l();
}
