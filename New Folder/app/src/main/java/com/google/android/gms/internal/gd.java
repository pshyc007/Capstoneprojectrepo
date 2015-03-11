// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            gc, ao, bi, hc, 
//            go, ds, gb, gl

public final class gd extends gc
{

    private final Context a;

    public gd(Context context, ds ds, gb gb)
    {
        super(ds, gb);
        a = context;
    }

    public void c()
    {
    }

    public gl d()
    {
        ao ao1 = new ao();
        return go.a(a, ao1, new bi(), new hc());
    }
}
