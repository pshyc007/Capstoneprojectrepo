// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            km, ma, oi, op, 
//            oq, os, oo

public abstract class lz extends km
{

    static boolean d = false;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static Method k;
    private static Method l;
    private static String m;
    private static long n = 0L;
    private static op o;

    protected lz(Context context, oi oi1, oo oo)
    {
        super(context, oi1, oo);
    }

    static String a()
    {
        if (m == null)
        {
            throw new ma();
        } else
        {
            return m;
        }
    }

    static String a(Context context, oi oi1)
    {
        if (h == null)
        {
            throw new ma();
        }
        ByteBuffer bytebuffer;
        String s;
        try
        {
            bytebuffer = (ByteBuffer)h.invoke(null, new Object[] {
                context
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ma(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new ma(invocationtargetexception);
        }
        if (bytebuffer != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throw new ma();
        s = oi1.a(bytebuffer.array(), true);
        return s;
    }

    static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
    {
        if (i == null || motionevent == null)
        {
            throw new ma();
        }
        ArrayList arraylist;
        try
        {
            arraylist = (ArrayList)i.invoke(null, new Object[] {
                motionevent, displaymetrics
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ma(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new ma(invocationtargetexception);
        }
        return arraylist;
    }

    protected static void a(String s, Context context, oi oi1)
    {
        com/google/android/gms/internal/lz;
        JVM INSTR monitorenter ;
        boolean flag = d;
        Exception exception;
        if (!flag)
        {
            try
            {
                o = new op(oi1, null);
                m = s;
                h(context);
                n = b().longValue();
                d = true;
            }
            catch (ma ma1) { }
            catch (UnsupportedOperationException unsupportedoperationexception) { }
            finally
            {
                com/google/android/gms/internal/lz;
            }
        }
        com/google/android/gms/internal/lz;
        JVM INSTR monitorexit ;
        return;
        throw exception;
    }

    static Long b()
    {
        if (e == null)
        {
            throw new ma();
        }
        Long long1;
        try
        {
            long1 = (Long)e.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ma(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new ma(invocationtargetexception);
        }
        return long1;
    }

    static String b(Context context, oi oi1)
    {
        if (k == null)
        {
            throw new ma();
        }
        ByteBuffer bytebuffer;
        String s;
        try
        {
            bytebuffer = (ByteBuffer)k.invoke(null, new Object[] {
                context
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ma(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new ma(invocationtargetexception);
        }
        if (bytebuffer != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throw new ma();
        s = oi1.a(bytebuffer.array(), true);
        return s;
    }

    private static String b(byte abyte0[], String s)
    {
        String s1;
        try
        {
            s1 = new String(o.a(abyte0, s), "UTF-8");
        }
        catch (oq oq1)
        {
            throw new ma(oq1);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new ma(unsupportedencodingexception);
        }
        return s1;
    }

    static String c()
    {
        if (g == null)
        {
            throw new ma();
        }
        String s;
        try
        {
            s = (String)g.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ma(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new ma(invocationtargetexception);
        }
        return s;
    }

    static Long d()
    {
        if (f == null)
        {
            throw new ma();
        }
        Long long1;
        try
        {
            long1 = (Long)f.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ma(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new ma(invocationtargetexception);
        }
        return long1;
    }

    static String f(Context context)
    {
        String s;
        if (j == null)
        {
            throw new ma();
        }
        try
        {
            s = (String)j.invoke(null, new Object[] {
                context
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ma(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new ma(invocationtargetexception);
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new ma();
        return s;
    }

    static ArrayList g(Context context)
    {
        ArrayList arraylist;
        if (l == null)
        {
            throw new ma();
        }
        try
        {
            arraylist = (ArrayList)l.invoke(null, new Object[] {
                context
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ma(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new ma(invocationtargetexception);
        }
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (arraylist.size() == 2)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        throw new ma();
        return arraylist;
    }

    private static void h(Context context)
    {
        byte abyte0[];
        byte abyte1[];
        File file;
        File file1;
        File file2;
        FileOutputStream fileoutputstream;
        DexClassLoader dexclassloader;
        Exception exception;
        String s;
        Class class1;
        Class class2;
        Class class3;
        Class class4;
        Class class5;
        Class class6;
        Class class7;
        Class class8;
        String s1;
        try
        {
            abyte0 = o.a(os.a());
            abyte1 = o.a(abyte0, os.b());
            file = context.getCacheDir();
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new ma(filenotfoundexception);
        }
        catch (IOException ioexception)
        {
            throw new ma(ioexception);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new ma(classnotfoundexception);
        }
        catch (oq oq1)
        {
            throw new ma(oq1);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new ma(nosuchmethodexception);
        }
        catch (NullPointerException nullpointerexception)
        {
            throw new ma(nullpointerexception);
        }
        if (file != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        file = context.getDir("dex", 0);
        if (file != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        throw new ma();
        file1 = file;
        file2 = File.createTempFile("ads", ".jar", file1);
        fileoutputstream = new FileOutputStream(file2);
        fileoutputstream.write(abyte1, 0, abyte1.length);
        fileoutputstream.close();
        dexclassloader = new DexClassLoader(file2.getAbsolutePath(), file1.getAbsolutePath(), null, context.getClassLoader());
        class1 = dexclassloader.loadClass(b(abyte0, os.c()));
        class2 = dexclassloader.loadClass(b(abyte0, os.o()));
        class3 = dexclassloader.loadClass(b(abyte0, os.i()));
        class4 = dexclassloader.loadClass(b(abyte0, os.g()));
        class5 = dexclassloader.loadClass(b(abyte0, os.q()));
        class6 = dexclassloader.loadClass(b(abyte0, os.e()));
        class7 = dexclassloader.loadClass(b(abyte0, os.m()));
        class8 = dexclassloader.loadClass(b(abyte0, os.k()));
        e = class1.getMethod(b(abyte0, os.d()), new Class[0]);
        f = class2.getMethod(b(abyte0, os.p()), new Class[0]);
        g = class3.getMethod(b(abyte0, os.j()), new Class[0]);
        h = class4.getMethod(b(abyte0, os.h()), new Class[] {
            android/content/Context
        });
        i = class5.getMethod(b(abyte0, os.r()), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        j = class6.getMethod(b(abyte0, os.f()), new Class[] {
            android/content/Context
        });
        k = class7.getMethod(b(abyte0, os.n()), new Class[] {
            android/content/Context
        });
        l = class8.getMethod(b(abyte0, os.l()), new Class[] {
            android/content/Context
        });
        s1 = file2.getName();
        file2.delete();
        (new File(file1, s1.replace(".jar", ".dex"))).delete();
        return;
        exception;
        s = file2.getName();
        file2.delete();
        (new File(file1, s.replace(".jar", ".dex"))).delete();
        throw exception;
    }

    protected void c(Context context)
    {
        IOException ioexception;
        try
        {
            a(1, c());
        }
        catch (ma ma1) { }
        try
        {
            a(2, a());
        }
        catch (ma ma2) { }
        try
        {
            a(25, b().longValue());
        }
        catch (ma ma3) { }
        try
        {
            ArrayList arraylist = g(context);
            a(31, ((Long)arraylist.get(0)).longValue());
            a(32, ((Long)arraylist.get(1)).longValue());
        }
        catch (ma ma4) { }
        try
        {
            a(33, d().longValue());
            return;
        }
        catch (ma ma5)
        {
            return;
        }
        ioexception;
    }

    protected void e(Context context)
    {
        IOException ioexception;
        try
        {
            a(2, a());
        }
        catch (ma ma1) { }
        try
        {
            a(1, c());
        }
        catch (ma ma2) { }
        try
        {
            long l1 = b().longValue();
            a(25, l1);
            if (n != 0L)
            {
                a(17, l1 - n);
                a(23, n);
            }
        }
        catch (ma ma3) { }
        try
        {
            ArrayList arraylist = a(a, b);
            a(14, ((Long)arraylist.get(0)).longValue());
            a(15, ((Long)arraylist.get(1)).longValue());
            if (arraylist.size() >= 3)
            {
                a(16, ((Long)arraylist.get(2)).longValue());
            }
        }
        catch (ma ma4) { }
        try
        {
            a(27, a(context, c));
        }
        catch (ma ma5) { }
        try
        {
            a(29, b(context, c));
            return;
        }
        catch (ma ma6)
        {
            return;
        }
        ioexception;
    }

}
