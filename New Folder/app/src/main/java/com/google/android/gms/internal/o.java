// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;
import com.google.android.gms.a.f;
import com.google.android.gms.common.g;

// Referenced classes of package com.google.android.gms.internal:
//            ig, ox, ev, ab, 
//            z, ac, al, bu, 
//            y

public final class o extends e
{

    private static final o a = new o();

    private o()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static y a(Context context, al al, String s, bu bu)
    {
        Object obj;
label0:
        {
            if (g.a(context) == 0)
            {
                obj = a.b(context, al, s, bu);
                if (obj != null)
                {
                    break label0;
                }
            }
            ig.a("Using AdManager from the client jar.");
            obj = new ox(context, al, s, bu, new ev(0x4da6e8, 0x4da6e8, true));
        }
        return ((y) (obj));
    }

    private y b(Context context, al al, String s, bu bu)
    {
        y y;
        try
        {
            com.google.android.gms.a.a a1 = d.a(context);
            y = z.a(((ab)a(context)).a(a1, al, s, bu, 0x4da6e8));
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not create remote AdManager.", remoteexception);
            return null;
        }
        catch (f f1)
        {
            ig.c("Could not create remote AdManager.", f1);
            return null;
        }
        return y;
    }

    protected Object a(IBinder ibinder)
    {
        return b(ibinder);
    }

    protected ab b(IBinder ibinder)
    {
        return ac.a(ibinder);
    }

}
