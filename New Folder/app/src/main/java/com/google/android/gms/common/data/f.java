// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class f
{

    protected final DataHolder a;
    protected int b;
    private int c;

    public f(DataHolder dataholder, int j)
    {
        a = (DataHolder)lr.a(dataholder);
        a(j);
    }

    protected void a(int j)
    {
        boolean flag;
        if (j >= 0 && j < a.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lr.a(flag);
        b = j;
        c = a.a(b);
    }

    public boolean a(String s)
    {
        return a.a(s);
    }

    protected int b()
    {
        return b;
    }

    protected long b(String s)
    {
        return a.a(s, b, c);
    }

    protected int c(String s)
    {
        return a.b(s, b, c);
    }

    protected boolean d(String s)
    {
        return a.d(s, b, c);
    }

    protected String e(String s)
    {
        return a.c(s, b, c);
    }

    public boolean equals(Object obj)
    {
        boolean flag = obj instanceof f;
        boolean flag1 = false;
        if (flag)
        {
            f f1 = (f)obj;
            boolean flag2 = ln.a(Integer.valueOf(f1.b), Integer.valueOf(b));
            flag1 = false;
            if (flag2)
            {
                boolean flag3 = ln.a(Integer.valueOf(f1.c), Integer.valueOf(c));
                flag1 = false;
                if (flag3)
                {
                    DataHolder dataholder = f1.a;
                    DataHolder dataholder1 = a;
                    flag1 = false;
                    if (dataholder == dataholder1)
                    {
                        flag1 = true;
                    }
                }
            }
        }
        return flag1;
    }

    protected float f(String s)
    {
        return a.e(s, b, c);
    }

    protected byte[] g(String s)
    {
        return a.f(s, b, c);
    }

    protected Uri h(String s)
    {
        return a.g(s, b, c);
    }

    public int hashCode()
    {
        Object aobj[] = new Object[3];
        aobj[0] = Integer.valueOf(b);
        aobj[1] = Integer.valueOf(c);
        aobj[2] = a;
        return ln.a(aobj);
    }

    protected boolean i(String s)
    {
        return a.h(s, b, c);
    }
}
