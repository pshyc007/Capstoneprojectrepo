// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ig, aq, ii

public final class ap
    implements bb
{

    private final aq a;

    public ap(aq aq1)
    {
        a = aq1;
    }

    public void a(ii ii, Map map)
    {
        String s = (String)map.get("name");
        if (s == null)
        {
            ig.e("App event with no name parameter.");
            return;
        } else
        {
            a.a(s, (String)map.get("info"));
            return;
        }
    }
}
