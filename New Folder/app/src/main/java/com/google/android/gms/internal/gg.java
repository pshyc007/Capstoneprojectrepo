// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            ko, gm, lk, gl, 
//            ku

public class gg extends ko
{

    final int a;

    public gg(Context context, c c1, d d, int i)
    {
        super(context, c1, d, new String[0]);
        a = i;
    }

    protected gl a(IBinder ibinder)
    {
        return gm.a(ibinder);
    }

    protected String a()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected void a(lk lk1, ku ku)
    {
        Bundle bundle = new Bundle();
        lk1.g(ku, a, j().getPackageName(), bundle);
    }

    protected IInterface b(IBinder ibinder)
    {
        return a(ibinder);
    }

    protected String b()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public gl c()
    {
        return (gl)super.m();
    }
}
