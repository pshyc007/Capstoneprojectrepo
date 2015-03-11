// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, c, a, ig, 
//            ii

class g
    implements bb
{

    final c a;

    g(c c1)
    {
        a = c1;
        super();
    }

    public void a(ii ii, Map map)
    {
        if (map.containsKey("pingType") && "unloadPing".equals(map.get("pingType")))
        {
            a.c(c.a(a));
            ig.c((new StringBuilder()).append("Unregistered GMSG handlers for: ").append(c.b(a).d()).toString());
        }
    }
}
