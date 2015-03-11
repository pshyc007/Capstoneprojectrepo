// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, be, ii

public class bd
    implements bb
{

    private final be a;

    public bd(be be1)
    {
        a = be1;
    }

    public void a(ii ii, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        a.a(flag);
    }
}
