// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ln

public final class kk
{

    public final int a;
    public final int b;

    public kk(int i, int j)
    {
        a = i;
        b = j;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof kk))
        {
            flag = false;
        } else
        if (this != obj)
        {
            kk kk1 = (kk)obj;
            if (kk1.a != a || kk1.b != b)
            {
                return false;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[2];
        aobj[0] = Integer.valueOf(a);
        aobj[1] = Integer.valueOf(b);
        return ln.a(aobj);
    }
}
