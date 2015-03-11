// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            lr, lo

public final class lp
{

    private final List a;
    private final Object b;

    private lp(Object obj)
    {
        b = lr.a(obj);
        a = new ArrayList();
    }

    lp(Object obj, lo lo)
    {
        this(obj);
    }

    public lp a(String s, Object obj)
    {
        a.add((new StringBuilder()).append((String)lr.a(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(b.getClass().getSimpleName()).append('{');
        int i = a.size();
        for (int j = 0; j < i; j++)
        {
            stringbuilder.append((String)a.get(j));
            if (j < i - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }
}
