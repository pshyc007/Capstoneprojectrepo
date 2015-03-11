// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ig, id, ii, 
//            ev

final class ay
    implements bb
{

    ay()
    {
    }

    public void a(ii ii1, Map map)
    {
        String s = (String)map.get("u");
        if (s == null)
        {
            ig.e("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new id(ii1.getContext(), ii1.h().b, s)).e();
            return;
        }
    }
}
