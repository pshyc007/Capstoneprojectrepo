// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fs, du, ii, ik, 
//            ig, hq

class fv
    implements Runnable
{

    final fs a;

    fv(fs fs1)
    {
        a = fs1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (fs.a(a))
            {
                if (fs.c(a).e == -2)
                {
                    break label0;
                }
            }
            return;
        }
        fs.d(a).f().a(a);
        if (fs.c(a).e != -3)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        ig.d((new StringBuilder()).append("Loading URL in WebView: ").append(fs.c(a).b).toString());
        fs.d(a).loadUrl(fs.c(a).b);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        ig.d("Loading HTML in WebView.");
        fs.d(a).loadDataWithBaseURL(hq.a(fs.c(a).b), fs.c(a).c, "text/html", "UTF-8", null);
          goto _L1
    }
}
