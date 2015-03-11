// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ii, no, ke, 
//            ig

final class ba
    implements bb
{

    ba()
    {
    }

    public void a(ii ii1, Map map)
    {
        String s = (String)map.get("tx");
        String s1 = (String)map.get("ty");
        String s2 = (String)map.get("td");
        int i;
        int j;
        int k;
        no no1;
        try
        {
            i = Integer.parseInt(s);
            j = Integer.parseInt(s1);
            k = Integer.parseInt(s2);
            no1 = ii1.g();
        }
        catch (NumberFormatException numberformatexception)
        {
            ig.e("Could not parse touch parameters from gmsg.");
            return;
        }
        if (no1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        no1.a().a(i, j, k);
    }
}
