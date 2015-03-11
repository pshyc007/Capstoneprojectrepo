// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.b.b;
import android.support.v7.b.c;
import android.support.v7.b.j;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            b, ActionBarContainer

abstract class a extends ViewGroup
{

    protected ActionMenuView a;
    protected ActionMenuPresenter b;
    protected ActionBarContainer c;
    protected boolean d;
    protected boolean e;
    protected int f;

    a(Context context)
    {
        super(context);
    }

    a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected int a(View view, int i, int k, int l)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), k);
        return Math.max(0, i - view.getMeasuredWidth() - l);
    }

    public boolean a()
    {
        if (b != null)
        {
            return b.a();
        } else
        {
            return false;
        }
    }

    protected int b(View view, int i, int k, int l)
    {
        int i1 = view.getMeasuredWidth();
        int j1 = view.getMeasuredHeight();
        int k1 = k + (l - j1) / 2;
        view.layout(i, k1, i + i1, j1 + k1);
        return i1;
    }

    public void b()
    {
        post(new android.support.v7.internal.widget.b(this));
    }

    protected int c(View view, int i, int k, int l)
    {
        int i1 = view.getMeasuredWidth();
        int j1 = view.getMeasuredHeight();
        int k1 = k + (l - j1) / 2;
        view.layout(i - i1, k1, i, j1 + k1);
        return i1;
    }

    public boolean c()
    {
        if (b != null)
        {
            return b.e();
        } else
        {
            return false;
        }
    }

    public int getAnimatedVisibility()
    {
        return getVisibility();
    }

    public int getContentHeight()
    {
        return f;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        TypedArray typedarray = getContext().obtainStyledAttributes(null, j.ActionBar, b.actionBarStyle, 0);
        setContentHeight(typedarray.getLayoutDimension(0, 0));
        typedarray.recycle();
        if (e)
        {
            setSplitActionBar(getContext().getResources().getBoolean(c.abc_split_action_bar_is_narrow));
        }
        if (b != null)
        {
            b.a(configuration);
        }
    }

    public void setContentHeight(int i)
    {
        f = i;
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
        d = flag;
    }

    public void setSplitView(ActionBarContainer actionbarcontainer)
    {
        c = actionbarcontainer;
    }

    public void setSplitWhenNarrow(boolean flag)
    {
        e = flag;
    }

    public void setVisibility(int i)
    {
        if (i != getVisibility())
        {
            super.setVisibility(i);
        }
    }
}
