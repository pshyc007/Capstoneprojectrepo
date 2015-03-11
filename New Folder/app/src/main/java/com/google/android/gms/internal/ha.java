// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class ha
    implements SafeParcelable
{

    private static final Object a = new Object();
    private static ClassLoader b = null;
    private static Integer c = null;
    private boolean d;

    public ha()
    {
        d = false;
    }

    protected static ClassLoader B()
    {
        ClassLoader classloader;
        synchronized (a)
        {
            classloader = b;
        }
        return classloader;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static Integer C()
    {
        Integer integer;
        synchronized (a)
        {
            integer = c;
        }
        return integer;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static boolean a(Class class1)
    {
        boolean flag;
        try
        {
            flag = "SAFE_PARCELABLE_NULL_STRING".equals(class1.getField("NULL").get(null));
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return false;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return false;
        }
        return flag;
    }

    protected static boolean b(String s)
    {
        ClassLoader classloader = B();
        if (classloader == null)
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = a(classloader.loadClass(s));
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    protected boolean D()
    {
        return d;
    }

}
