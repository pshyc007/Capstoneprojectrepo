// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.internal.ml;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nd;
import java.util.HashMap;
import java.util.Map;

public final class g
{

    private static Map a = new HashMap();

    public static a a(String s)
    {
        return (a)a.get(s);
    }

    private static void a(a a1)
    {
        if (a.containsKey(a1.a()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate field name registered: ").append(a1.a()).toString());
        } else
        {
            a.put(a1.a(), a1);
            return;
        }
    }

    static 
    {
        a(ml.a);
        a(ml.y);
        a(ml.r);
        a(ml.w);
        a(ml.z);
        a(ml.l);
        a(ml.m);
        a(ml.j);
        a(ml.o);
        a(ml.u);
        a(ml.b);
        a(ml.t);
        a(ml.d);
        a(ml.k);
        a(ml.e);
        a(ml.f);
        a(ml.g);
        a(ml.q);
        a(ml.n);
        a(ml.s);
        a(ml.v);
        a(ml.A);
        a(ml.B);
        a(ml.i);
        a(ml.h);
        a(ml.x);
        a(ml.p);
        a(ml.c);
        a(ml.C);
        a(mw.a);
        a(mw.c);
        a(mw.d);
        a(mw.e);
        a(mw.b);
        a(nd.a);
        a(nd.b);
    }
}
