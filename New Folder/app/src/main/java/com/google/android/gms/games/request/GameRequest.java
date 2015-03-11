// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import java.util.List;

public interface GameRequest
    extends Parcelable, d
{

    public abstract int a_(String s);

    public abstract String d();

    public abstract Game e();

    public abstract Player f();

    public abstract byte[] h();

    public abstract int i();

    public abstract long j();

    public abstract long k();

    public abstract int l();

    public abstract List n();
}
