// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ok, om, og

public abstract class oj extends ok
{

    protected List e;

    public oj()
    {
    }

    public void a(og og1)
    {
        int i;
        int j;
        if (e == null)
        {
            i = 0;
        } else
        {
            i = e.size();
        }
        for (j = 0; j < i; j++)
        {
            om om1 = (om)e.get(j);
            og1.e(om1.a);
            og1.b(om1.b);
        }

    }

    protected int b()
    {
        int i;
        int j;
        int k;
        if (e == null)
        {
            i = 0;
        } else
        {
            i = e.size();
        }
        j = 0;
        k = 0;
        for (; j < i; j++)
        {
            om om1 = (om)e.get(j);
            k = k + og.f(om1.a) + om1.b.length;
        }

        return k;
    }
}
