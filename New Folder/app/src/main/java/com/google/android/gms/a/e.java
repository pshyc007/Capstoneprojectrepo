// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.a:
//            f

public abstract class e
{

    private final String a;
    private Object b;

    protected e(String s)
    {
        a = s;
    }

    protected final Object a(Context context)
    {
        if (b == null)
        {
            lr.a(context);
            Context context1 = g.c(context);
            if (context1 == null)
            {
                throw new f("Could not get remote context.");
            }
            ClassLoader classloader = context1.getClassLoader();
            try
            {
                b = a((IBinder)classloader.loadClass(a).newInstance());
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                throw new f("Could not load creator class.");
            }
            catch (InstantiationException instantiationexception)
            {
                throw new f("Could not instantiate creator.");
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                throw new f("Could not access creator.");
            }
        }
        return b;
    }

    protected abstract Object a(IBinder ibinder);
}
