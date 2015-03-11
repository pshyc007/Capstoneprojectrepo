// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.support.v7.a.d;
import android.support.v7.b.b;
import android.support.v7.b.g;
import android.support.v7.internal.view.a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            n, ai, aj, ah, 
//            ag, k

public class ScrollingTabContainerView extends HorizontalScrollView
    implements n
{

    Runnable a;
    int b;
    int c;
    private ai d;
    private LinearLayout e;
    private aj f;
    private boolean g;
    private final LayoutInflater h;
    private int i;
    private int j;

    private TabView a(d d1, boolean flag)
    {
        TabView tabview = (TabView)h.inflate(g.abc_action_bar_tab, e, false);
        tabview.a(this, d1, flag);
        if (flag)
        {
            tabview.setBackgroundDrawable(null);
            tabview.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i));
            return tabview;
        }
        tabview.setFocusable(true);
        if (d == null)
        {
            d = new ai(this, null);
        }
        tabview.setOnClickListener(d);
        return tabview;
    }

    static TabView a(ScrollingTabContainerView scrollingtabcontainerview, d d1, boolean flag)
    {
        return scrollingtabcontainerview.a(d1, flag);
    }

    static LinearLayout a(ScrollingTabContainerView scrollingtabcontainerview)
    {
        return scrollingtabcontainerview.e;
    }

    private boolean a()
    {
        return f != null && f.getParent() == this;
    }

    private void b()
    {
        if (a())
        {
            return;
        }
        if (f == null)
        {
            f = d();
        }
        removeView(e);
        addView(f, new android.view.ViewGroup.LayoutParams(-2, -1));
        if (f.d() == null)
        {
            f.a(new ah(this, null));
        }
        if (a != null)
        {
            removeCallbacks(a);
            a = null;
        }
        f.a(j);
    }

    private boolean c()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(f);
            addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(f.f());
            return false;
        }
    }

    private aj d()
    {
        aj aj1 = new aj(getContext(), null, b.actionDropDownStyle);
        aj1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        aj1.b(this);
        return aj1;
    }

    public void a(int k)
    {
        View view = e.getChildAt(k);
        if (a != null)
        {
            removeCallbacks(a);
        }
        a = new ag(this, view);
        post(a);
    }

    public void a(k k, View view, int l, long l1)
    {
        ((TabView)view).getTab().d();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            post(a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        a a1 = android.support.v7.internal.view.a.a(getContext());
        setContentHeight(a1.e());
        c = a1.f();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public void onMeasure(int k, int l)
    {
        int i1 = 1;
        int j1 = android.view.View.MeasureSpec.getMode(k);
        boolean flag;
        int k1;
        if (j1 == 0x40000000)
        {
            flag = i1;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        k1 = e.getChildCount();
        if (k1 > i1 && (j1 == 0x40000000 || j1 == 0x80000000))
        {
            int l1;
            int i2;
            int j2;
            if (k1 > 2)
            {
                b = (int)(0.4F * (float)android.view.View.MeasureSpec.getSize(k));
            } else
            {
                b = android.view.View.MeasureSpec.getSize(k) / 2;
            }
            b = Math.min(b, c);
        } else
        {
            b = -1;
        }
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        if (flag || !g)
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            e.measure(0, l1);
            if (e.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(k))
            {
                b();
            } else
            {
                c();
            }
        } else
        {
            c();
        }
        i2 = getMeasuredWidth();
        super.onMeasure(k, l1);
        j2 = getMeasuredWidth();
        if (flag && i2 != j2)
        {
            setTabSelected(j);
        }
    }

    public void setAllowCollapse(boolean flag)
    {
        g = flag;
    }

    public void setContentHeight(int k)
    {
        i = k;
        requestLayout();
    }

    public void setTabSelected(int k)
    {
        j = k;
        int l = e.getChildCount();
        int i1 = 0;
        while (i1 < l) 
        {
            View view = e.getChildAt(i1);
            boolean flag;
            if (i1 == k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (flag)
            {
                a(k);
            }
            i1++;
        }
        if (f != null && k >= 0)
        {
            f.a(k);
        }
    }

    private class TabView extends LinearLayout
    {

        private d a;
        private TextView b;
        private ImageView c;
        private View d;
        private ScrollingTabContainerView e;

        public void a()
        {
            d d1 = a;
            View view = d1.c();
            if (view != null)
            {
                android.view.ViewParent viewparent = view.getParent();
                if (viewparent != this)
                {
                    if (viewparent != null)
                    {
                        ((ViewGroup)viewparent).removeView(view);
                    }
                    addView(view);
                }
                d = view;
                if (b != null)
                {
                    b.setVisibility(8);
                }
                if (c != null)
                {
                    c.setVisibility(8);
                    c.setImageDrawable(null);
                }
            } else
            {
                if (d != null)
                {
                    removeView(d);
                    d = null;
                }
                android.graphics.drawable.Drawable drawable = d1.a();
                CharSequence charsequence = d1.b();
                if (drawable != null)
                {
                    if (c == null)
                    {
                        ImageView imageview = new ImageView(getContext());
                        android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutparams1.gravity = 16;
                        imageview.setLayoutParams(layoutparams1);
                        addView(imageview, 0);
                        c = imageview;
                    }
                    c.setImageDrawable(drawable);
                    c.setVisibility(0);
                } else
                if (c != null)
                {
                    c.setVisibility(8);
                    c.setImageDrawable(null);
                }
                if (charsequence != null)
                {
                    if (b == null)
                    {
                        r r1 = new r(getContext(), null, b.actionBarTabTextStyle);
                        r1.setEllipsize(android.text.TextUtils.TruncateAt.END);
                        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutparams.gravity = 16;
                        r1.setLayoutParams(layoutparams);
                        addView(r1);
                        b = r1;
                    }
                    b.setText(charsequence);
                    b.setVisibility(0);
                } else
                if (b != null)
                {
                    b.setVisibility(8);
                    b.setText(null);
                }
                if (c != null)
                {
                    c.setContentDescription(d1.e());
                    return;
                }
            }
        }

        public void a(d d1)
        {
            a = d1;
            a();
        }

        void a(ScrollingTabContainerView scrollingtabcontainerview, d d1, boolean flag)
        {
            e = scrollingtabcontainerview;
            a = d1;
            if (flag)
            {
                setGravity(19);
            }
            a();
        }

        public d getTab()
        {
            return a;
        }

        public void onMeasure(int k, int l)
        {
            super.onMeasure(k, l);
            int i1;
            if (e != null)
            {
                i1 = e.b;
            } else
            {
                i1 = 0;
            }
            if (i1 > 0 && getMeasuredWidth() > i1)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), l);
            }
        }

        public TabView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }

}
