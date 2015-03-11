// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

class a
{

    private Method a;
    private Method b;
    private Method c;
    private Method d;

    a()
    {
        try
        {
            a = android/widget/AutoCompleteTextView.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            a.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception) { }
        try
        {
            b = android/widget/AutoCompleteTextView.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            b.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception1) { }
        try
        {
            Class aclass1[] = new Class[1];
            aclass1[0] = Boolean.TYPE;
            c = android/widget/AutoCompleteTextView.getMethod("ensureImeVisible", aclass1);
            c.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception2) { }
        try
        {
            Class aclass[] = new Class[2];
            aclass[0] = Integer.TYPE;
            aclass[1] = android/os/ResultReceiver;
            d = android/view/inputmethod/InputMethodManager.getMethod("showSoftInputUnchecked", aclass);
            d.setAccessible(true);
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception3)
        {
            return;
        }
    }

    void a(AutoCompleteTextView autocompletetextview)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        a.invoke(autocompletetextview, new Object[0]);
        return;
        Exception exception;
        exception;
    }

    void a(AutoCompleteTextView autocompletetextview, boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        Method method = c;
        Object aobj[] = new Object[1];
        aobj[0] = Boolean.valueOf(flag);
        method.invoke(autocompletetextview, aobj);
        return;
        Exception exception;
        exception;
    }

    void b(AutoCompleteTextView autocompletetextview)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        b.invoke(autocompletetextview, new Object[0]);
        return;
        Exception exception;
        exception;
    }
}
