// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.a.d;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView, ag

class ai
    implements android.view.View.OnClickListener
{

    final ScrollingTabContainerView a;

    private ai(ScrollingTabContainerView scrollingtabcontainerview)
    {
        a = scrollingtabcontainerview;
        super();
    }

    ai(ScrollingTabContainerView scrollingtabcontainerview, ag ag)
    {
        this(scrollingtabcontainerview);
    }

    public void onClick(View view)
    {
        ((ScrollingTabContainerView.TabView)view).getTab().d();
        int i = ScrollingTabContainerView.a(a).getChildCount();
        int j = 0;
        while (j < i) 
        {
            View view1 = ScrollingTabContainerView.a(a).getChildAt(j);
            boolean flag;
            if (view1 == view)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            j++;
        }
    }
}
