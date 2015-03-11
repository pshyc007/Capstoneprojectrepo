// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class i
    implements ServiceConnection
{

    boolean a;
    private final BlockingQueue b = new LinkedBlockingQueue();

    public i()
    {
        a = false;
    }

    public IBinder a()
    {
        if (a)
        {
            throw new IllegalStateException();
        } else
        {
            a = true;
            return (IBinder)b.take();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            b.put(ibinder);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }
}
