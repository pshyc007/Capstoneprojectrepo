// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal:
//            ig

public class dy
{

    private Object a;
    private final Context b;

    public dy(Context context)
    {
        b = context;
    }

    public int a(String s, String s1)
    {
        int i;
        try
        {
            Class class1 = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            Class aclass[] = new Class[3];
            aclass[0] = Integer.TYPE;
            aclass[1] = java/lang/String;
            aclass[2] = java/lang/String;
            Method method = class1.getDeclaredMethod("consumePurchase", aclass);
            Object obj = class1.cast(a);
            Object aobj[] = new Object[3];
            aobj[0] = Integer.valueOf(3);
            aobj[1] = s;
            aobj[2] = s1;
            i = ((Integer)method.invoke(obj, aobj)).intValue();
        }
        catch (Exception exception)
        {
            ig.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", exception);
            return 5;
        }
        return i;
    }

    public Bundle a(String s, String s1, String s2)
    {
        Bundle bundle;
        try
        {
            Class class1 = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            Class aclass[] = new Class[5];
            aclass[0] = Integer.TYPE;
            aclass[1] = java/lang/String;
            aclass[2] = java/lang/String;
            aclass[3] = java/lang/String;
            aclass[4] = java/lang/String;
            Method method = class1.getDeclaredMethod("getBuyIntent", aclass);
            Object obj = class1.cast(a);
            Object aobj[] = new Object[5];
            aobj[0] = Integer.valueOf(3);
            aobj[1] = s;
            aobj[2] = s1;
            aobj[3] = "inapp";
            aobj[4] = s2;
            bundle = (Bundle)method.invoke(obj, aobj);
        }
        catch (Exception exception)
        {
            ig.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", exception);
            return null;
        }
        return bundle;
    }

    public void a()
    {
        a = null;
    }

    public void a(IBinder ibinder)
    {
        try
        {
            a = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] {
                android/os/IBinder
            }).invoke(null, new Object[] {
                ibinder
            });
            return;
        }
        catch (Exception exception)
        {
            ig.e("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
        }
    }

    public Bundle b(String s, String s1)
    {
        Bundle bundle;
        try
        {
            Class class1 = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            Class aclass[] = new Class[4];
            aclass[0] = Integer.TYPE;
            aclass[1] = java/lang/String;
            aclass[2] = java/lang/String;
            aclass[3] = java/lang/String;
            Method method = class1.getDeclaredMethod("getPurchases", aclass);
            Object obj = class1.cast(a);
            Object aobj[] = new Object[4];
            aobj[0] = Integer.valueOf(3);
            aobj[1] = s;
            aobj[2] = "inapp";
            aobj[3] = s1;
            bundle = (Bundle)method.invoke(obj, aobj);
        }
        catch (Exception exception)
        {
            ig.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", exception);
            return null;
        }
        return bundle;
    }
}
