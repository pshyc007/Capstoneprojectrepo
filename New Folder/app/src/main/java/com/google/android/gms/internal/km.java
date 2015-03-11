// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// Referenced classes of package com.google.android.gms.internal:
//            ke, oo, iv, oi, 
//            of

public abstract class km
    implements ke
{

    protected MotionEvent a;
    protected DisplayMetrics b;
    protected oi c;
    private oo d;

    protected km(Context context, oi oi1, oo oo1)
    {
        c = oi1;
        d = oo1;
        try
        {
            b = context.getResources().getDisplayMetrics();
            return;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            b = new DisplayMetrics();
        }
        b.density = 1.0F;
    }

    private String a(Context context, String s, boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        a();
        if (!flag) goto _L2; else goto _L1
_L1:
        e(context);
_L3:
        byte abyte0[] = b();
        this;
        JVM INSTR monitorexit ;
        String s2;
        if (abyte0.length != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        s2 = Integer.toString(5);
        return s2;
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        d(context);
          goto _L3
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        String s1;
        try
        {
            throw exception;
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            return Integer.toString(7);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return Integer.toString(7);
        }
        catch (IOException ioexception)
        {
            return Integer.toString(3);
        }
        c(context);
          goto _L3
        s1 = a(abyte0, s);
        return s1;
    }

    private void a()
    {
        d.a();
    }

    private byte[] b()
    {
        return d.b();
    }

    public String a(Context context)
    {
        return a(context, null, false, false);
    }

    public String a(Context context, String s)
    {
        return a(context, s, true, false);
    }

    String a(byte abyte0[], String s)
    {
        if (abyte0.length > 239)
        {
            a();
            a(20, 1L);
            abyte0 = b();
        }
        byte abyte1[];
        MessageDigest messagedigest;
        byte abyte2[];
        byte abyte3[];
        byte abyte4[];
        if (abyte0.length < 239)
        {
            byte abyte5[] = new byte[239 - abyte0.length];
            (new SecureRandom()).nextBytes(abyte5);
            abyte1 = ByteBuffer.allocate(240).put((byte)abyte0.length).put(abyte0).put(abyte5).array();
        } else
        {
            abyte1 = ByteBuffer.allocate(240).put((byte)abyte0.length).put(abyte0).array();
        }
        messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.update(abyte1);
        abyte2 = messagedigest.digest();
        abyte3 = ByteBuffer.allocate(256).put(abyte2).put(abyte1).array();
        abyte4 = new byte[256];
        (new iv()).a(abyte3, abyte4);
        if (s != null && s.length() > 0)
        {
            a(s, abyte4);
        }
        return c.a(abyte4, true);
    }

    public void a(int i, int j, int k)
    {
        if (a != null)
        {
            a.recycle();
        }
        a = MotionEvent.obtain(0L, k, 1, (float)i * b.density, (float)j * b.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    }

    protected void a(int i, long l)
    {
        d.a(i, l);
    }

    protected void a(int i, String s)
    {
        d.a(i, s);
    }

    public void a(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            if (a != null)
            {
                a.recycle();
            }
            a = MotionEvent.obtain(motionevent);
        }
    }

    void a(String s, byte abyte0[])
    {
        if (s.length() > 32)
        {
            s = s.substring(0, 32);
        }
        (new of(s.getBytes("UTF-8"))).a(abyte0);
    }

    public String b(Context context)
    {
        return a(context, null, false, true);
    }

    protected abstract void c(Context context);

    protected abstract void d(Context context);

    protected abstract void e(Context context);
}
