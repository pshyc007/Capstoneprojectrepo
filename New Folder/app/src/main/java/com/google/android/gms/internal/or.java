// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            oo, og

class or
    implements oo
{

    private og a;
    private byte b[];
    private final int c;

    public or(int i)
    {
        c = i;
        a();
    }

    public void a()
    {
        b = new byte[c];
        a = og.a(b);
    }

    public void a(int i, long l)
    {
        a.a(i, l);
    }

    public void a(int i, String s)
    {
        a.a(i, s);
    }

    public byte[] b()
    {
        int i = a.a();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return b;
        } else
        {
            byte abyte0[] = new byte[b.length - i];
            System.arraycopy(b, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }
}
