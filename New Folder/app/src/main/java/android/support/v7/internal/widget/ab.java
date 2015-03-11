// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            t, w, u

class ab
    implements Runnable
{

    final t a;

    private ab(t t1)
    {
        a = t1;
        super();
    }

    ab(t t1, u u)
    {
        this(t1);
    }

    public void run()
    {
        if (t.a(a) != null && t.a(a).getCount() > t.a(a).getChildCount() && t.a(a).getChildCount() <= a.a)
        {
            t.b(a).setInputMethodMode(2);
            a.c();
        }
    }
}
