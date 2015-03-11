// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class of
{

    private final byte a[] = new byte[256];
    private int b;
    private int c;

    public of(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            a[i] = (byte)i;
        }

        int j = 0;
        for (int k = 0; k < 256; k++)
        {
            j = 0xff & j + a[k] + abyte0[k % abyte0.length];
            byte byte0 = a[k];
            a[k] = a[j];
            a[j] = byte0;
        }

        b = 0;
        c = 0;
    }

    public void a(byte abyte0[])
    {
        int i = b;
        int j = c;
        for (int k = 0; k < abyte0.length; k++)
        {
            i = 0xff & i + 1;
            j = 0xff & j + a[i];
            byte byte0 = a[i];
            a[i] = a[j];
            a[j] = byte0;
            abyte0[k] = (byte)(abyte0[k] ^ a[0xff & a[i] + a[j]]);
        }

        b = i;
        c = j;
    }
}
