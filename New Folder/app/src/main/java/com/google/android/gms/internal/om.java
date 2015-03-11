// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

public final class om
{

    final int a;
    final byte b[];

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof om))
            {
                return false;
            }
            om om1 = (om)obj;
            if (a != om1.a || !Arrays.equals(b, om1.b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return 31 * (527 + a) + Arrays.hashCode(b);
    }
}
