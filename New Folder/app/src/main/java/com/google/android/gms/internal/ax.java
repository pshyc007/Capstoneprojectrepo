// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ii, ig, db

final class ax
    implements bb
{

    ax()
    {
    }

    public void a(ii ii1, Map map)
    {
        db db1 = ii1.d();
        if (db1 == null)
        {
            ig.e("A GMSG tried to use a custom close button on something that wasn't an overlay.");
            return;
        } else
        {
            db1.b("1".equals(map.get("custom_close")));
            return;
        }
    }
}
