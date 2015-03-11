// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            lz, gv, or, ma, 
//            nf, oi, oo

public class ne extends lz
{

    protected ne(Context context, oi oi1, oo oo)
    {
        super(context, oi1, oo);
    }

    public static ne a(String s, Context context)
    {
        gv gv1 = new gv();
        a(s, context, ((oi) (gv1)));
        return new ne(context, gv1, new or(239));
    }

    protected void c(Context context)
    {
        super.c(context);
        nf nf1 = h(context);
        long l;
        String s;
        if (nf1.b())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        a(28, l);
        s = nf1.a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        a(26, 5L);
        a(24, s);
        return;
        e e1;
        e1;
        try
        {
            a(24, f(context));
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
        catch (ma ma1)
        {
            return;
        }
    }

    protected void d(Context context)
    {
        long l = 1L;
        super.c(context);
        e e1;
        IOException ioexception;
        nf nf1;
        String s;
        try
        {
            a(24, f(context));
        }
        catch (ma ma1) { }
        catch (IOException ioexception1)
        {
            return;
        }
        nf1 = h(context);
        if (!nf1.b())
        {
            l = 0L;
        }
        a(28, l);
        s = nf1.a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        a(30, s);
        return;
        ioexception;
        a(28, 1L);
        return;
        e1;
        return;
    }

    nf h(Context context)
    {
        int i = 0;
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        String s;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        }
        catch (f f1)
        {
            throw new IOException(f1);
        }
        s = info.getId();
        String s1;
        if (s != null && s.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$"))
        {
            byte abyte0[] = new byte[16];
            int j = 0;
            for (; i < s.length(); i += 2)
            {
                if (i == 8 || i == 13 || i == 18 || i == 23)
                {
                    i++;
                }
                abyte0[j] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
                j++;
            }

            s1 = c.a(abyte0, true);
        } else
        {
            s1 = s;
        }
        return new nf(this, s1, info.isLimitAdTrackingEnabled());
    }
}
