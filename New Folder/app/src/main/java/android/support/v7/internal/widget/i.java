// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.support.v7.c.a;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.r;
import android.support.v7.internal.view.menu.u;
import android.support.v7.internal.view.menu.y;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, ScrollingTabContainerView, aj

class i
    implements u
{

    n a;
    r b;
    final ActionBarView c;

    public void a(Context context, n n1)
    {
        if (a != null && b != null)
        {
            a.d(b);
        }
        a = n1;
    }

    public void a(n n1, boolean flag)
    {
    }

    public boolean a(n n1, r r1)
    {
        c.g = r1.getActionView();
        ActionBarView.e(c).a(ActionBarView.d(c).getConstantState().newDrawable(c.getResources()));
        b = r1;
        if (c.g.getParent() != c)
        {
            c.addView(c.g);
        }
        if (ActionBarView.e(c).getParent() != c)
        {
            c.addView(ActionBarView.e(c));
        }
        ActionBarView.f(c).setVisibility(8);
        if (ActionBarView.g(c) != null)
        {
            ActionBarView.g(c).setVisibility(8);
        }
        if (ActionBarView.h(c) != null)
        {
            ActionBarView.h(c).setVisibility(8);
        }
        if (ActionBarView.i(c) != null)
        {
            ActionBarView.i(c).setVisibility(8);
        }
        if (ActionBarView.j(c) != null)
        {
            ActionBarView.j(c).setVisibility(8);
        }
        c.requestLayout();
        r1.e(true);
        if (c.g instanceof a)
        {
            ((a)c.g).a();
        }
        return true;
    }

    public boolean a(y y)
    {
        return false;
    }

    public void b(boolean flag)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        j = a.size();
        k = 0;
_L5:
        if (k >= j)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if ((b)a.getItem(k) != b) goto _L4; else goto _L3
_L3:
        boolean flag1 = true;
_L6:
        if (!flag1)
        {
            b(a, b);
        }
_L2:
        return;
_L4:
        k++;
          goto _L5
        flag1 = false;
          goto _L6
    }

    public boolean b(n n1, r r1)
    {
        if (c.g instanceof a)
        {
            ((a)c.g).b();
        }
        c.removeView(c.g);
        c.removeView(ActionBarView.e(c));
        c.g = null;
        if ((2 & ActionBarView.k(c)) != 0)
        {
            ActionBarView.f(c).setVisibility(0);
        }
        if ((8 & ActionBarView.k(c)) != 0)
        {
            if (ActionBarView.g(c) == null)
            {
                ActionBarView.l(c);
            } else
            {
                ActionBarView.g(c).setVisibility(0);
            }
        }
        if (ActionBarView.h(c) != null && ActionBarView.m(c) == 2)
        {
            ActionBarView.h(c).setVisibility(0);
        }
        if (ActionBarView.i(c) != null && ActionBarView.m(c) == 1)
        {
            ActionBarView.i(c).setVisibility(0);
        }
        if (ActionBarView.j(c) != null && (0x10 & ActionBarView.k(c)) != 0)
        {
            ActionBarView.j(c).setVisibility(0);
        }
        ActionBarView.e(c).a(null);
        b = null;
        c.requestLayout();
        r1.e(false);
        return true;
    }

    public boolean f()
    {
        return false;
    }
}
