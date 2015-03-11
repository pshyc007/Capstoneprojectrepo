// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Player;

public interface Event
    extends Parcelable, d
{

    public abstract String c();

    public abstract String c_();

    public abstract String d();

    public abstract Uri e();

    public abstract String f();

    public abstract Player g();

    public abstract long h();

    public abstract String i();

    public abstract boolean j();
}
