// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.widget:
//            a, b

class d extends DataSetObserver
{

    final a a;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, b b)
    {
        this(a1);
    }

    public void onChanged()
    {
        a.a = true;
        a.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        a.a = false;
        a.notifyDataSetInvalidated();
    }
}
