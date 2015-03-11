// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.c;

public final class kt
    implements c
{

    private final com.google.android.gms.common.c a;

    public kt(com.google.android.gms.common.c c1)
    {
        a = c1;
    }

    public void a(int i)
    {
        a.m_();
    }

    public void a(Bundle bundle)
    {
        a.a(bundle);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof kt)
        {
            return a.equals(((kt)obj).a);
        } else
        {
            return a.equals(obj);
        }
    }
}
