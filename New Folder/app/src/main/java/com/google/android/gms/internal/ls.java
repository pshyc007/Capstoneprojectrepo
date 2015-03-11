// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class ls
{

    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    private int c(Object obj, Object obj1)
    {
        int i = a(obj, obj1);
        if (i < 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("Negative size: ").append(obj).append("=").append(obj1).toString());
        } else
        {
            return i;
        }
    }

    protected int a(Object obj, Object obj1)
    {
        return 1;
    }

    public final Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = a.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        g = 1 + g;
        this;
        JVM INSTR monitorexit ;
        return obj1;
        h = 1 + h;
        this;
        JVM INSTR monitorexit ;
        Object obj2;
        obj2 = b(obj);
        if (obj2 == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_74;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorenter ;
        Object obj3;
        e = 1 + e;
        obj3 = a.put(obj, obj2);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        a.put(obj, obj3);
_L1:
        this;
        JVM INSTR monitorexit ;
        Exception exception1;
        if (obj3 != null)
        {
            a(false, obj, obj2, obj3);
            return obj3;
        } else
        {
            a(c);
            return obj2;
        }
        b = b + c(obj, obj2);
          goto _L1
        exception1;
        this;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void a()
    {
        a(-1);
    }

    public void a(int i)
    {
_L2:
        this;
        JVM INSTR monitorenter ;
        if (b < 0 || a.isEmpty() && b != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (b > i && !a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        Object obj1;
        java.util.Map.Entry entry = (java.util.Map.Entry)a.entrySet().iterator().next();
        obj = entry.getKey();
        obj1 = entry.getValue();
        a.remove(obj);
        b = b - c(obj, obj1);
        f = 1 + f;
        this;
        JVM INSTR monitorexit ;
        a(true, obj, obj1, null);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
    }

    protected Object b(Object obj)
    {
        return null;
    }

    public final Object b(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            throw new NullPointerException("key == null || value == null");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        d = 1 + d;
        b = b + c(obj, obj1);
        obj2 = a.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        b = b - c(obj, obj2);
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            a(false, obj, obj2, obj1);
        }
        a(c);
        return obj2;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String toString()
    {
        this;
        JVM INSTR monitorenter ;
        int i = g + h;
        int j;
        j = 0;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        j = (100 * g) / i;
        String s;
        Object aobj[] = new Object[4];
        aobj[0] = Integer.valueOf(c);
        aobj[1] = Integer.valueOf(g);
        aobj[2] = Integer.valueOf(h);
        aobj[3] = Integer.valueOf(j);
        s = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", aobj);
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
