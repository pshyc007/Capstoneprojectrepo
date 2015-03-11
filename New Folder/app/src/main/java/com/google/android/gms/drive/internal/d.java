// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.og;
import com.google.android.gms.internal.oj;
import java.util.List;

public final class d extends oj
{

    public int a;
    public String b;
    public long c;
    public long d;

    public d()
    {
        a();
    }

    public d a()
    {
        a = 1;
        b = "";
        c = -1L;
        d = -1L;
        e = null;
        f = -1;
        return this;
    }

    public void a(og og1)
    {
        og1.a(1, a);
        og1.a(2, b);
        og1.b(3, c);
        og1.b(4, d);
        super.a(og1);
    }

    protected int b()
    {
        return super.b() + og.b(1, a) + og.b(2, b) + og.c(3, c) + og.c(4, d);
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L4:
        return flag1;
_L2:
        boolean flag;
        flag = obj instanceof d;
        flag1 = false;
        if (!flag) goto _L4; else goto _L3
_L3:
        d d1;
        int i;
        int j;
        d1 = (d)obj;
        i = a;
        j = d1.a;
        flag1 = false;
        if (i != j) goto _L4; else goto _L5
_L5:
        String s;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        s = d1.b;
        flag1 = false;
        if (s != null) goto _L4; else goto _L6
_L6:
        int k;
        k = c != d1.c;
        flag1 = false;
        if (k != 0) goto _L4; else goto _L7
_L7:
        int l;
        l = d != d1.d;
        flag1 = false;
        if (l != 0) goto _L4; else goto _L8
_L8:
        boolean flag2;
        if (e != null && !e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (d1.e == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = d1.e.isEmpty();
        flag1 = false;
        if (!flag2) goto _L4; else goto _L9
_L9:
        return true;
        if (!b.equals(d1.b))
        {
            return false;
        }
          goto _L6
        return e.equals(d1.e);
    }

    public int hashCode()
    {
        int i = 31 * (527 + a);
        int j;
        int k;
        List list;
        int l;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        k = 31 * (31 * (31 * (j + i) + (int)(c ^ c >>> 32)) + (int)(d ^ d >>> 32));
        list = e;
        l = 0;
        if (list != null)
        {
            boolean flag = e.isEmpty();
            l = 0;
            if (!flag)
            {
                l = e.hashCode();
            }
        }
        return k + l;
    }
}
