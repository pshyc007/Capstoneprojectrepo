// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            ViewPager, bb

class bj extends DataSetObserver
{

    final ViewPager a;

    private bj(ViewPager viewpager)
    {
        a = viewpager;
        super();
    }

    bj(ViewPager viewpager, bb bb)
    {
        this(viewpager);
    }

    public void onChanged()
    {
        a.a();
    }

    public void onInvalidated()
    {
        a.a();
    }
}
