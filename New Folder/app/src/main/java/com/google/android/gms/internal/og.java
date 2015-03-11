// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            on, oh

public final class og
{

    private final byte a[];
    private final int b;
    private int c;

    private og(byte abyte0[], int i, int j)
    {
        a = abyte0;
        c = i;
        b = i + j;
    }

    public static og a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static og a(byte abyte0[], int i, int j)
    {
        return new og(abyte0, i, j);
    }

    public static int b(int i)
    {
        if (i >= 0)
        {
            return f(i);
        } else
        {
            return 10;
        }
    }

    public static int b(int i, int j)
    {
        return d(i) + b(j);
    }

    public static int b(int i, String s)
    {
        return d(i) + b(s);
    }

    public static int b(String s)
    {
        int i;
        int j;
        try
        {
            byte abyte0[] = s.getBytes("UTF-8");
            i = f(abyte0.length);
            j = abyte0.length;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return j + i;
    }

    public static int c(int i, long l)
    {
        return d(i) + c(l);
    }

    public static int c(long l)
    {
        return e(f(l));
    }

    public static int d(int i)
    {
        return f(on.a(i, 0));
    }

    public static int e(long l)
    {
        if ((-128L & l) == 0L)
        {
            return 1;
        }
        if ((-16384L & l) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l) != 0L ? 10 : 9;
    }

    public static int f(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    public static long f(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public int a()
    {
        return b - c;
    }

    public void a(byte byte0)
    {
        if (c == b)
        {
            throw new oh(c, b);
        } else
        {
            byte abyte0[] = a;
            int i = c;
            c = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    public void a(int i)
    {
        if (i >= 0)
        {
            e(i);
            return;
        } else
        {
            d(i);
            return;
        }
    }

    public void a(int i, int j)
    {
        c(i, 0);
        a(j);
    }

    public void a(int i, long l)
    {
        c(i, 0);
        a(l);
    }

    public void a(int i, String s)
    {
        c(i, 2);
        a(s);
    }

    public void a(long l)
    {
        d(l);
    }

    public void a(String s)
    {
        byte abyte0[] = s.getBytes("UTF-8");
        e(abyte0.length);
        b(abyte0);
    }

    public void b()
    {
        if (a() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public void b(int i, long l)
    {
        c(i, 0);
        b(l);
    }

    public void b(long l)
    {
        d(f(l));
    }

    public void b(byte abyte0[])
    {
        b(abyte0, 0, abyte0.length);
    }

    public void b(byte abyte0[], int i, int j)
    {
        if (b - c >= j)
        {
            System.arraycopy(abyte0, i, a, c, j);
            c = j + c;
            return;
        } else
        {
            throw new oh(c, b);
        }
    }

    public void c(int i)
    {
        a((byte)i);
    }

    public void c(int i, int j)
    {
        e(on.a(i, j));
    }

    public void d(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                c((int)l);
                return;
            }
            c(0x80 | 0x7f & (int)l);
            l >>>= 7;
        } while (true);
    }

    public void e(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                c(i);
                return;
            }
            c(0x80 | i & 0x7f);
            i >>>= 7;
        } while (true);
    }
}
