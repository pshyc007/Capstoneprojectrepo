// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.internal.widget:
//            t, u

class y extends DataSetObserver
{

    final t a;

    private y(t t1)
    {
        a = t1;
        super();
    }

    y(t t1, u u)
    {
        this(t1);
    }

    public void onChanged()
    {
        if (a.f())
        {
            a.c();
        }
    }

    public void onInvalidated()
    {
        a.d();
    }
}
