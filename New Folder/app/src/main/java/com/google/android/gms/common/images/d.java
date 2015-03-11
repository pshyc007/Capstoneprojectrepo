// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.kl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            e, ImageManager, g, b, 
//            f

final class d
    implements Runnable
{

    final ImageManager a;
    private final Uri b;
    private final Bitmap c;
    private final CountDownLatch d;
    private boolean e;

    public d(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        a = imagemanager;
        super();
        b = uri;
        c = bitmap;
        e = flag;
        d = countdownlatch;
    }

    private void a(ImageManager.ImageReceiver imagereceiver, boolean flag)
    {
        ArrayList arraylist = ImageManager.ImageReceiver.a(imagereceiver);
        int i = arraylist.size();
        int j = 0;
        while (j < i) 
        {
            e e1 = (e)arraylist.get(j);
            if (flag)
            {
                e1.a(ImageManager.b(a), c, false);
            } else
            {
                ImageManager.d(a).put(b, Long.valueOf(SystemClock.elapsedRealtime()));
                e1.a(ImageManager.b(a), ImageManager.c(a), false);
            }
            if (!(e1 instanceof g))
            {
                ImageManager.a(a).remove(e1);
            }
            j++;
        }
    }

    public void run()
    {
        kl.a("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ImageManager.h(a) != null)
        {
            if (e)
            {
                ImageManager.h(a).a();
                System.gc();
                e = false;
                ImageManager.g(a).post(this);
                return;
            }
            if (flag)
            {
                ImageManager.h(a).b(new f(b), c);
            }
        }
        ImageManager.ImageReceiver imagereceiver = (ImageManager.ImageReceiver)ImageManager.e(a).remove(b);
        if (imagereceiver != null)
        {
            a(imagereceiver, flag);
        }
        d.countDown();
        synchronized (ImageManager.a())
        {
            ImageManager.b().remove(b);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
