// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            hq, eh, ig, ej

public class ei
{

    private final String a;

    public ei(String s)
    {
        a = s;
    }

    public String a()
    {
        return hq.d();
    }

    public boolean a(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = eh.b(intent);
            String s2 = eh.c(intent);
            if (s1 != null && s2 != null)
            {
                if (!s.equals(eh.a(s1)))
                {
                    ig.e("Developer payload not match.");
                    return false;
                }
                if (a != null && !ej.a(a, s1, s2))
                {
                    ig.e("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }
}
