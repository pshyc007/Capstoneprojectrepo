// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.internal:
//            ox, pb, hd, ii

class oy
    implements ComponentCallbacks
{

    final ox a;

    oy(ox ox1)
    {
        a = ox1;
        super();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (ox.a(a) != null && ox.a(a).i != null && ox.a(a).i.b != null)
        {
            ox.a(a).i.b.a();
        }
    }

    public void onLowMemory()
    {
    }
}
