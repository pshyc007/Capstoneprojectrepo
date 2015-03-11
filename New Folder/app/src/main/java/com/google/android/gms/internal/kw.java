// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.a;
import com.google.android.gms.common.api.d;

public final class kw
    implements d
{

    private final com.google.android.gms.common.d a;

    public kw(com.google.android.gms.common.d d1)
    {
        a = d1;
    }

    public void a(a a1)
    {
        a.a(a1);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof kw)
        {
            return a.equals(((kw)obj).a);
        } else
        {
            return a.equals(obj);
        }
    }
}
