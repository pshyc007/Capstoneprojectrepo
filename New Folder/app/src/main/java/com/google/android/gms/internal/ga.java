// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.g;

// Referenced classes of package com.google.android.gms.internal:
//            ds, ev, ig, gd, 
//            gf, gb, hl

public final class ga
{

    public static hl a(Context context, ds ds1, gb gb)
    {
        if (ds1.k.e)
        {
            return b(context, ds1, gb);
        } else
        {
            return c(context, ds1, gb);
        }
    }

    private static hl b(Context context, ds ds1, gb gb)
    {
        ig.a("Fetching ad response from local ad request service.");
        gd gd1 = new gd(context, ds1, gb);
        gd1.e();
        return gd1;
    }

    private static hl c(Context context, ds ds1, gb gb)
    {
        ig.a("Fetching ad response from remote ad request service.");
        if (g.a(context) != 0)
        {
            ig.e("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new gf(context, ds1, gb);
        }
    }
}
