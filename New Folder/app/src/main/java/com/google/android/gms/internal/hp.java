// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class hp
    implements ThreadFactory
{

    private final AtomicInteger a = new AtomicInteger(1);

    hp()
    {
    }

    public Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append("AdWorker #").append(a.getAndIncrement()).toString());
    }
}
