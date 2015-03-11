// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            t, ab, u

class z
    implements android.widget.AbsListView.OnScrollListener
{

    final t a;

    private z(t t1)
    {
        a = t1;
        super();
    }

    z(t t1, u u)
    {
        this(t1);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.g() && t.b(a).getContentView() != null)
        {
            t.d(a).removeCallbacks(t.c(a));
            t.c(a).run();
        }
    }
}
