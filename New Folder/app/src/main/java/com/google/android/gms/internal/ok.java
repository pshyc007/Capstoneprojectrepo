// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            og, ol

public abstract class ok
{

    protected volatile int f;

    public ok()
    {
        f = -1;
    }

    public static final void a(ok ok1, byte abyte0[], int i, int j)
    {
        try
        {
            og og1 = og.a(abyte0, i, j);
            ok1.a(og1);
            og1.b();
            return;
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ioexception);
        }
    }

    public static final byte[] a(ok ok1)
    {
        byte abyte0[] = new byte[ok1.c()];
        a(ok1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public void a(og og1)
    {
    }

    protected int b()
    {
        return 0;
    }

    public int c()
    {
        int i = b();
        f = i;
        return i;
    }

    public String toString()
    {
        return ol.a(this);
    }
}
