// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import java.util.List;

public interface Quest
    extends Parcelable, d
{

    public static final int b_[] = {
        1, 2, 3, 4, 6, 5
    };
    public static final String c_[] = as;

    public abstract String c();

    public abstract String d();

    public abstract Uri e();

    public abstract String f();

    public abstract Uri g();

    public abstract String h();

    public abstract List i();

    public abstract Game j();

    public abstract int k();

    public abstract String k_();

    public abstract int l();

    public abstract long m();

    public abstract long n();

    public abstract long o();

    public abstract long p();

    public abstract long q();

    
    {
        String as[] = new String[3];
        as[0] = Integer.toString(1);
        as[1] = Integer.toString(2);
        as[2] = Integer.toString(3);
    }
}
