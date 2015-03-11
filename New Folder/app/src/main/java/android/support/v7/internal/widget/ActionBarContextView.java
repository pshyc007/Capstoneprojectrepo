// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.b;
import android.support.v7.b.e;
import android.support.v7.b.g;
import android.support.v7.b.j;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            a, ActionBarContainer

public class ActionBarContextView extends a
{

    private CharSequence g;
    private CharSequence h;
    private View i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TextView m;
    private int n;
    private int o;
    private Drawable p;
    private boolean q;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.ActionMode, i1, 0);
        setBackgroundDrawable(typedarray.getDrawable(3));
        n = typedarray.getResourceId(1, 0);
        o = typedarray.getResourceId(2, 0);
        f = typedarray.getLayoutDimension(0, 0);
        p = typedarray.getDrawable(4);
        typedarray.recycle();
    }

    private void d()
    {
        byte byte0 = 8;
        boolean flag = true;
        if (k == null)
        {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            k = (LinearLayout)getChildAt(-1 + getChildCount());
            l = (TextView)k.findViewById(e.action_bar_title);
            m = (TextView)k.findViewById(e.action_bar_subtitle);
            if (n != 0)
            {
                l.setTextAppearance(getContext(), n);
            }
            if (o != 0)
            {
                m.setTextAppearance(getContext(), o);
            }
        }
        l.setText(g);
        m.setText(h);
        boolean flag1;
        TextView textview;
        int i1;
        LinearLayout linearlayout;
        if (!TextUtils.isEmpty(g))
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        if (TextUtils.isEmpty(h))
        {
            flag = false;
        }
        textview = m;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = byte0;
        }
        textview.setVisibility(i1);
        linearlayout = k;
        if (flag1 || flag)
        {
            byte0 = 0;
        }
        linearlayout.setVisibility(byte0);
        if (k.getParent() == null)
        {
            addView(k);
        }
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

    public volatile void b()
    {
        super.b();
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

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    public volatile int getAnimatedVisibility()
    {
        return super.getAnimatedVisibility();
    }

    public volatile int getContentHeight()
    {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle()
    {
        return h;
    }

    public CharSequence getTitle()
    {
        return g;
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (b != null)
        {
            b.b();
            b.d();
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2 = getPaddingLeft();
        int j2 = getPaddingTop();
        int k2 = l1 - j1 - getPaddingTop() - getPaddingBottom();
        int l2;
        int i3;
        if (i != null && i.getVisibility() != 8)
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams();
            int j3 = i2 + marginlayoutparams.leftMargin;
            l2 = j3 + b(i, j3, j2, k2) + marginlayoutparams.rightMargin;
        } else
        {
            l2 = i2;
        }
        if (k != null && j == null && k.getVisibility() != 8)
        {
            l2 += b(k, l2, j2, k2);
        }
        if (j != null)
        {
            int _tmp = l2 + b(j, l2, j2, k2);
        }
        i3 = k1 - i1 - getPaddingRight();
        if (a != null)
        {
            int _tmp1 = i3 - c(a, i3, j2, k2);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = 0x40000000;
        int l1 = 0;
        if (android.view.View.MeasureSpec.getMode(i1) != k1)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"FILL_PARENT\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j1) == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
        }
        int i2 = android.view.View.MeasureSpec.getSize(i1);
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (f > 0)
        {
            j2 = f;
        } else
        {
            j2 = android.view.View.MeasureSpec.getSize(j1);
        }
        k2 = getPaddingTop() + getPaddingBottom();
        l2 = i2 - getPaddingLeft() - getPaddingRight();
        i3 = j2 - k2;
        j3 = android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x80000000);
        if (i != null)
        {
            int k5 = a(i, l2, j3, 0);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams();
            l2 = k5 - (marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
        }
        if (a != null && a.getParent() == this)
        {
            l2 = a(a, l2, j3, 0);
        }
        if (k != null && j == null)
        {
            if (q)
            {
                int l4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                k.measure(l4, j3);
                int i5 = k.getMeasuredWidth();
                int k3;
                android.view.ViewGroup.LayoutParams layoutparams;
                boolean flag;
                LinearLayout linearlayout;
                int j5;
                if (i5 <= l2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    l2 -= i5;
                }
                linearlayout = k;
                if (flag)
                {
                    j5 = 0;
                } else
                {
                    j5 = 8;
                }
                linearlayout.setVisibility(j5);
            } else
            {
                l2 = a(k, l2, j3, 0);
            }
        }
        if (j != null)
        {
            layoutparams = j.getLayoutParams();
            int j4;
            int k4;
            if (layoutparams.width != -2)
            {
                j4 = k1;
            } else
            {
                j4 = 0x80000000;
            }
            if (layoutparams.width >= 0)
            {
                l2 = Math.min(layoutparams.width, l2);
            }
            if (layoutparams.height == -2)
            {
                k1 = 0x80000000;
            }
            if (layoutparams.height >= 0)
            {
                k4 = Math.min(layoutparams.height, i3);
            } else
            {
                k4 = i3;
            }
            j.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, j4), android.view.View.MeasureSpec.makeMeasureSpec(k4, k1));
        }
        if (f <= 0)
        {
            k3 = getChildCount();
            int l3 = 0;
            while (l1 < k3) 
            {
                int i4 = k2 + getChildAt(l1).getMeasuredHeight();
                if (i4 <= l3)
                {
                    i4 = l3;
                }
                l1++;
                l3 = i4;
            }
            setMeasuredDimension(i2, l3);
            return;
        } else
        {
            setMeasuredDimension(i2, j2);
            return;
        }
    }

    public void setContentHeight(int i1)
    {
        f = i1;
    }

    public void setCustomView(View view)
    {
        if (j != null)
        {
            removeView(j);
        }
        j = view;
        if (k != null)
        {
            removeView(k);
            k = null;
        }
        if (view != null)
        {
            addView(view);
        }
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
        if (d != flag)
        {
            if (b != null)
            {
                android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
                if (!flag)
                {
                    a = (ActionMenuView)b.a(this);
                    a.setBackgroundDrawable(null);
                    ViewGroup viewgroup1 = (ViewGroup)a.getParent();
                    if (viewgroup1 != null)
                    {
                        viewgroup1.removeView(a);
                    }
                    addView(a, layoutparams);
                } else
                {
                    b.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    b.a(0x7fffffff);
                    layoutparams.width = -1;
                    layoutparams.height = f;
                    a = (ActionMenuView)b.a(this);
                    a.setBackgroundDrawable(p);
                    ViewGroup viewgroup = (ViewGroup)a.getParent();
                    if (viewgroup != null)
                    {
                        viewgroup.removeView(a);
                    }
                    c.addView(a, layoutparams);
                }
            }
            super.setSplitActionBar(flag);
        }
    }

    public volatile void setSplitView(ActionBarContainer actionbarcontainer)
    {
        super.setSplitView(actionbarcontainer);
    }

    public volatile void setSplitWhenNarrow(boolean flag)
    {
        super.setSplitWhenNarrow(flag);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        h = charsequence;
        d();
    }

    public void setTitle(CharSequence charsequence)
    {
        g = charsequence;
        d();
    }

    public void setTitleOptional(boolean flag)
    {
        if (flag != q)
        {
            requestLayout();
        }
        q = flag;
    }

    public volatile void setVisibility(int i1)
    {
        super.setVisibility(i1);
    }
}
