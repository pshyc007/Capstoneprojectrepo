// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ig, ii

final class az
    implements bb
{

    az()
    {
    }

    public void a(ii ii, Map map)
    {
        ig.c((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
    }
}
