// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.a.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView, ag

class ah extends BaseAdapter
{

    final ScrollingTabContainerView a;

    private ah(ScrollingTabContainerView scrollingtabcontainerview)
    {
        a = scrollingtabcontainerview;
        super();
    }

    ah(ScrollingTabContainerView scrollingtabcontainerview, ag ag)
    {
        this(scrollingtabcontainerview);
    }

    public int getCount()
    {
        return ScrollingTabContainerView.a(a).getChildCount();
    }

    public Object getItem(int i)
    {
        return ((ScrollingTabContainerView.TabView)ScrollingTabContainerView.a(a).getChildAt(i)).getTab();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return ScrollingTabContainerView.a(a, (d)getItem(i), true);
        } else
        {
            ((ScrollingTabContainerView.TabView)view).a((d)getItem(i));
            return view;
        }
    }
}
