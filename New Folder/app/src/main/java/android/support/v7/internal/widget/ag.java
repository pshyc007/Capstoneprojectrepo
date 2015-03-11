// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

class ag
    implements Runnable
{

    final View a;
    final ScrollingTabContainerView b;

    ag(ScrollingTabContainerView scrollingtabcontainerview, View view)
    {
        b = scrollingtabcontainerview;
        a = view;
        super();
    }

    public void run()
    {
        int i = a.getLeft() - (b.getWidth() - a.getWidth()) / 2;
        b.smoothScrollTo(i, 0);
        b.a = null;
    }
}
