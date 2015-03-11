// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.b.b;
import android.support.v7.b.c;
import android.support.v7.b.e;
import android.support.v7.b.g;
import android.support.v7.b.h;
import android.support.v7.b.j;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.support.v7.internal.view.menu.a;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            a, f, g, h, 
//            ProgressBarICS, aj, ScrollingTabContainerView, ActionBarContextView, 
//            i, ActionBarContainer, p

public class ActionBarView extends android.support.v7.internal.widget.a
{

    private ProgressBarICS A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private n L;
    private ActionBarContextView M;
    private a N;
    private SpinnerAdapter O;
    private android.support.v7.a.c P;
    private Runnable Q;
    private i R;
    private final p S = new f(this);
    private final android.view.View.OnClickListener T = new android.support.v7.internal.widget.g(this);
    private final android.view.View.OnClickListener U = new android.support.v7.internal.widget.h(this);
    View g;
    android.view.Window.Callback h;
    private int i;
    private int j;
    private CharSequence k;
    private CharSequence l;
    private Drawable m;
    private Drawable n;
    private Context o;
    private HomeView p;
    private HomeView q;
    private LinearLayout r;
    private TextView s;
    private TextView t;
    private View u;
    private aj v;
    private LinearLayout w;
    private ScrollingTabContainerView x;
    private View y;
    private ProgressBarICS z;

    public ActionBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = -1;
        o = context;
        setBackgroundResource(0);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.ActionBar, b.actionBarStyle, 0);
        ApplicationInfo applicationinfo = context.getApplicationInfo();
        PackageManager packagemanager = context.getPackageManager();
        i = typedarray.getInt(2, 0);
        k = typedarray.getText(1);
        l = typedarray.getText(4);
        n = typedarray.getDrawable(8);
        if (n == null && android.os.Build.VERSION.SDK_INT >= 9)
        {
            LayoutInflater layoutinflater;
            int i1;
            int j1;
            if (context instanceof Activity)
            {
                try
                {
                    n = packagemanager.getActivityLogo(((Activity)context).getComponentName());
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1)
                {
                    Log.e("ActionBarView", "Activity component name not found!", namenotfoundexception1);
                }
            }
            if (n == null)
            {
                n = applicationinfo.loadLogo(packagemanager);
            }
        }
        m = typedarray.getDrawable(7);
        if (m == null)
        {
            if (context instanceof Activity)
            {
                try
                {
                    m = packagemanager.getActivityIcon(((Activity)context).getComponentName());
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    Log.e("ActionBarView", "Activity component name not found!", namenotfoundexception);
                }
            }
            if (m == null)
            {
                m = applicationinfo.loadIcon(packagemanager);
            }
        }
        layoutinflater = LayoutInflater.from(context);
        i1 = typedarray.getResourceId(14, g.abc_action_bar_home);
        p = (HomeView)layoutinflater.inflate(i1, this, false);
        q = (HomeView)layoutinflater.inflate(i1, this, false);
        q.a(true);
        q.setOnClickListener(T);
        q.setContentDescription(getResources().getText(h.abc_action_bar_up_description));
        D = typedarray.getResourceId(5, 0);
        E = typedarray.getResourceId(6, 0);
        F = typedarray.getResourceId(15, 0);
        G = typedarray.getResourceId(16, 0);
        B = typedarray.getDimensionPixelOffset(17, 0);
        C = typedarray.getDimensionPixelOffset(18, 0);
        setDisplayOptions(typedarray.getInt(3, 0));
        j1 = typedarray.getResourceId(13, 0);
        if (j1 != 0)
        {
            y = layoutinflater.inflate(j1, this, false);
            i = 0;
            setDisplayOptions(0x10 | j);
        }
        f = typedarray.getLayoutDimension(0, 0);
        typedarray.recycle();
        N = new a(context, 0, 0x102002c, 0, 0, k);
        p.setOnClickListener(U);
        p.setClickable(true);
        p.setFocusable(true);
    }

    static android.support.v7.a.c a(ActionBarView actionbarview)
    {
        return actionbarview.P;
    }

    static i b(ActionBarView actionbarview)
    {
        return actionbarview.R;
    }

    static a c(ActionBarView actionbarview)
    {
        return actionbarview.N;
    }

    static Drawable d(ActionBarView actionbarview)
    {
        return actionbarview.m;
    }

    static HomeView e(ActionBarView actionbarview)
    {
        return actionbarview.q;
    }

    static HomeView f(ActionBarView actionbarview)
    {
        return actionbarview.p;
    }

    static LinearLayout g(ActionBarView actionbarview)
    {
        return actionbarview.r;
    }

    private void g()
    {
        boolean flag = true;
        if (r == null)
        {
            r = (LinearLayout)LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this, false);
            s = (TextView)r.findViewById(e.action_bar_title);
            t = (TextView)r.findViewById(e.action_bar_subtitle);
            u = r.findViewById(e.up);
            r.setOnClickListener(U);
            if (D != 0)
            {
                s.setTextAppearance(o, D);
            }
            if (k != null)
            {
                s.setText(k);
            }
            if (E != 0)
            {
                t.setTextAppearance(o, E);
            }
            if (l != null)
            {
                t.setText(l);
                t.setVisibility(0);
            }
            boolean flag1;
            boolean flag2;
            View view;
            int i1;
            LinearLayout linearlayout;
            if ((4 & j) != 0)
            {
                flag1 = flag;
            } else
            {
                flag1 = false;
            }
            if ((2 & j) != 0)
            {
                flag2 = flag;
            } else
            {
                flag2 = false;
            }
            view = u;
            if (!flag2)
            {
                if (flag1)
                {
                    i1 = 0;
                } else
                {
                    i1 = 4;
                }
            } else
            {
                i1 = 8;
            }
            view.setVisibility(i1);
            linearlayout = r;
            if (!flag1 || flag2)
            {
                flag = false;
            }
            linearlayout.setEnabled(flag);
        }
        addView(r);
        if (g != null || TextUtils.isEmpty(k) && TextUtils.isEmpty(l))
        {
            r.setVisibility(8);
        }
    }

    static ScrollingTabContainerView h(ActionBarView actionbarview)
    {
        return actionbarview.x;
    }

    static aj i(ActionBarView actionbarview)
    {
        return actionbarview.v;
    }

    static View j(ActionBarView actionbarview)
    {
        return actionbarview.y;
    }

    static int k(ActionBarView actionbarview)
    {
        return actionbarview.j;
    }

    static void l(ActionBarView actionbarview)
    {
        actionbarview.g();
    }

    static int m(ActionBarView actionbarview)
    {
        return actionbarview.i;
    }

    private void setTitleImpl(CharSequence charsequence)
    {
        k = charsequence;
        if (s != null)
        {
            s.setText(charsequence);
            boolean flag;
            LinearLayout linearlayout;
            int i1;
            if (g == null && (8 & j) != 0 && (!TextUtils.isEmpty(k) || !TextUtils.isEmpty(l)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            linearlayout = r;
            i1 = 0;
            if (!flag)
            {
                i1 = 8;
            }
            linearlayout.setVisibility(i1);
        }
        if (N != null)
        {
            N.setTitle(charsequence);
        }
    }

    public volatile boolean a()
    {
        return super.a();
    }

    public volatile void b()
    {
        super.b();
    }

    public volatile boolean c()
    {
        return super.c();
    }

    public void d()
    {
        z = new ProgressBarICS(o, null, 0, F);
        z.setId(e.progress_horizontal);
        z.setMax(10000);
        z.setVisibility(8);
        addView(z);
    }

    public void e()
    {
        A = new ProgressBarICS(o, null, 0, G);
        A.setId(e.progress_circular);
        A.setVisibility(8);
        addView(A);
    }

    public boolean f()
    {
        return K;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.support.v7.a.b(19);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.support.v7.a.b(getContext(), attributeset);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        return layoutparams;
    }

    public volatile int getAnimatedVisibility()
    {
        return super.getAnimatedVisibility();
    }

    public volatile int getContentHeight()
    {
        return super.getContentHeight();
    }

    public View getCustomNavigationView()
    {
        return y;
    }

    public int getDisplayOptions()
    {
        return j;
    }

    public SpinnerAdapter getDropdownAdapter()
    {
        return O;
    }

    public int getDropdownSelectedPosition()
    {
        return v.f();
    }

    public int getNavigationMode()
    {
        return i;
    }

    public CharSequence getSubtitle()
    {
        return l;
    }

    public CharSequence getTitle()
    {
        return k;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        s = null;
        t = null;
        u = null;
        if (r != null && r.getParent() == this)
        {
            removeView(r);
        }
        r = null;
        if ((8 & j) != 0)
        {
            g();
        }
        if (x != null && I)
        {
            android.view.ViewGroup.LayoutParams layoutparams = x.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.width = -2;
                layoutparams.height = -1;
            }
            x.setAllowCollapse(true);
        }
        if (z != null)
        {
            removeView(z);
            d();
        }
        if (A != null)
        {
            removeView(A);
            e();
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(Q);
        if (b != null)
        {
            b.b();
            b.d();
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        addView(p);
        if (y != null && (0x10 & j) != 0)
        {
            android.view.ViewParent viewparent = y.getParent();
            if (viewparent != this)
            {
                if (viewparent instanceof ViewGroup)
                {
                    ((ViewGroup)viewparent).removeView(y);
                }
                addView(y);
            }
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int k2;
        i2 = getPaddingLeft();
        j2 = getPaddingTop();
        k2 = l1 - j1 - getPaddingTop() - getPaddingBottom();
        if (k2 > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        HomeView homeview;
        int l2;
        int i3;
        int j3;
        int k3;
        View view;
        int l3;
        android.view.ViewGroup.LayoutParams layoutparams;
        android.support.v7.a.b b1;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        int j7;
        int k7;
        int l7;
        int i8;
        int j8;
        boolean flag1;
        if (g != null)
        {
            homeview = q;
        } else
        {
            homeview = p;
        }
        int i7;
        if (homeview.getVisibility() != 8)
        {
            int k8 = homeview.a();
            l2 = i2 + (k8 + b(homeview, i2 + k8, j2, k2));
        } else
        {
            l2 = i2;
        }
        if (g != null) goto _L4; else goto _L3
_L3:
        if (r != null && r.getVisibility() != 8 && (8 & j) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            l2 += b(r, l2, j2, k2);
        }
        i;
        JVM INSTR tableswitch 0 2: default 180
    //                   0 640
    //                   1 647
    //                   2 695;
           goto _L4 _L5 _L6 _L7
_L4:
        i3 = l2;
_L17:
        j3 = k1 - i1 - getPaddingRight();
        if (a != null && a.getParent() == this)
        {
            c(a, j3, j2, k2);
            j3 -= a.getMeasuredWidth();
        }
        if (A != null && A.getVisibility() != 8)
        {
            c(A, j3, j2, k2);
            k3 = j3 - A.getMeasuredWidth();
        } else
        {
            k3 = j3;
        }
        if (g != null)
        {
            view = g;
        } else
        if ((0x10 & j) != 0 && y != null)
        {
            view = y;
        } else
        {
            view = null;
        }
        if (view == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams = view.getLayoutParams();
        if (layoutparams instanceof android.support.v7.a.b)
        {
            b1 = (android.support.v7.a.b)layoutparams;
        } else
        {
            b1 = null;
        }
        if (b1 != null)
        {
            i4 = b1.a;
        } else
        {
            i4 = 19;
        }
        j4 = view.getMeasuredWidth();
        if (b1 != null)
        {
            k7 = i3 + b1.leftMargin;
            l7 = k3 - b1.rightMargin;
            i8 = b1.topMargin;
            j8 = b1.bottomMargin;
            j5 = i8;
            k4 = l7;
            l4 = k7;
            i5 = j8;
        } else
        {
            k4 = k3;
            l4 = i3;
            i5 = 0;
            j5 = 0;
        }
        k5 = i4 & 7;
        if (k5 == 1)
        {
            j7 = (getWidth() - j4) / 2;
            if (j7 < l4)
            {
                k5 = 3;
            } else
            if (j7 + j4 > k4)
            {
                k5 = 5;
            }
            l5 = k5;
        } else
        if (i4 == -1)
        {
            l5 = 3;
        } else
        {
            l5 = k5;
        }
        l5;
        JVM INSTR tableswitch 1 5: default 476
    //                   1 810
    //                   2 476
    //                   3 824
    //                   4 476
    //                   5 831;
           goto _L8 _L9 _L8 _L10 _L8 _L11
_L8:
        i6 = 0;
_L20:
        j6 = i4 & 0x70;
        if (i4 == -1)
        {
            j6 = 16;
        }
        k6 = 0;
        j6;
        JVM INSTR lookupswitch 3: default 536
    //                   16: 841
    //                   48: 872
    //                   80: 884;
           goto _L12 _L13 _L14 _L15
_L12:
        l6 = view.getMeasuredWidth();
        view.layout(i6, k6, i6 + l6, k6 + view.getMeasuredHeight());
        l4 + l6;
        if (z == null) goto _L1; else goto _L16
_L16:
        z.bringToFront();
        l3 = z.getMeasuredHeight() / 2;
        z.layout(B, -l3, B + z.getMeasuredWidth(), l3);
        return;
_L5:
        i3 = l2;
          goto _L17
_L6:
        if (w == null) goto _L4; else goto _L18
_L18:
        if (flag1)
        {
            l2 += C;
        }
        i3 = l2 + (b(w, l2, j2, k2) + C);
          goto _L17
_L7:
        if (x == null) goto _L4; else goto _L19
_L19:
        if (flag1)
        {
            l2 += C;
        }
        i3 = l2 + (b(x, l2, j2, k2) + C);
          goto _L17
_L9:
        i6 = (getWidth() - j4) / 2;
          goto _L20
_L10:
        i6 = l4;
          goto _L20
_L11:
        i6 = k4 - j4;
          goto _L20
_L13:
        i7 = getPaddingTop();
        k6 = (getHeight() - getPaddingBottom() - i7 - view.getMeasuredHeight()) / 2;
          goto _L12
_L14:
        k6 = j5 + getPaddingTop();
          goto _L12
_L15:
        k6 = getHeight() - getPaddingBottom() - view.getMeasuredHeight() - i5;
          goto _L12
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = getChildCount();
        if (!J) goto _L2; else goto _L1
_L1:
        int i11;
        i11 = 0;
        for (int j11 = 0; j11 < k1; j11++)
        {
            View view1 = getChildAt(j11);
            if (view1.getVisibility() != 8 && (view1 != a || a.getChildCount() != 0))
            {
                i11++;
            }
        }

        if (i11 != 0) goto _L2; else goto _L3
_L3:
        setMeasuredDimension(0, 0);
        K = true;
_L12:
        return;
_L2:
        K = false;
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"MATCH_PARENT\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j1) != 0x80000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
        }
        int l1 = android.view.View.MeasureSpec.getSize(i1);
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        HomeView homeview;
        int i4;
        int j4;
        boolean flag;
        int k4;
        int l4;
        View view;
        int i5;
        int k5;
        android.view.ViewGroup.LayoutParams layoutparams;
        android.support.v7.a.b b1;
        int j6;
        int l6;
        int i7;
        int j7;
        int k7;
        int l7;
        if (f > 0)
        {
            i2 = f;
        } else
        {
            i2 = android.view.View.MeasureSpec.getSize(j1);
        }
        j2 = getPaddingTop() + getPaddingBottom();
        k2 = getPaddingLeft();
        l2 = getPaddingRight();
        i3 = i2 - j2;
        j3 = android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x80000000);
        k3 = l1 - k2 - l2;
        l3 = k3 / 2;
        if (g != null)
        {
            homeview = q;
        } else
        {
            homeview = p;
        }
        int i8;
        int j8;
        int k8;
        int l8;
        int i9;
        int j9;
        int k9;
        int l9;
        int i10;
        int j10;
        if (homeview.getVisibility() != 8)
        {
            android.view.ViewGroup.LayoutParams layoutparams1 = homeview.getLayoutParams();
            int j5;
            int l5;
            int i6;
            int k6;
            int k10;
            int l10;
            if (layoutparams1.width < 0)
            {
                k10 = android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x80000000);
            } else
            {
                k10 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.width, 0x40000000);
            }
            homeview.measure(k10, android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x40000000));
            l10 = homeview.getMeasuredWidth() + homeview.a();
            j4 = Math.max(0, k3 - l10);
            i4 = Math.max(0, j4 - l10);
        } else
        {
            i4 = l3;
            j4 = k3;
        }
        if (a != null && a.getParent() == this)
        {
            j4 = a(a, j4, j3, 0);
            l3 = Math.max(0, l3 - a.getMeasuredWidth());
        }
        if (A != null && A.getVisibility() != 8)
        {
            j4 = a(A, j4, j3, 0);
            l3 = Math.max(0, l3 - A.getMeasuredWidth());
        }
        if (r != null && r.getVisibility() != 8 && (8 & j) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (g != null) goto _L5; else goto _L4
_L4:
        i;
        JVM INSTR tableswitch 1 2: default 528
    //                   1 918
    //                   2 1030;
           goto _L5 _L6 _L7
_L5:
        k4 = i4;
        l4 = j4;
          goto _L8
_L6:
        if (w == null) goto _L5; else goto _L9
_L9:
        if (flag)
        {
            j9 = 2 * C;
        } else
        {
            j9 = C;
        }
        k9 = Math.max(0, j4 - j9);
        l9 = Math.max(0, i4 - j9);
        w.measure(android.view.View.MeasureSpec.makeMeasureSpec(k9, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x40000000));
        i10 = w.getMeasuredWidth();
        j10 = Math.max(0, k9 - i10);
        k4 = Math.max(0, l9 - i10);
        l4 = j10;
          goto _L8
_L7:
        if (x == null) goto _L5; else goto _L10
_L10:
        if (flag)
        {
            i8 = 2 * C;
        } else
        {
            i8 = C;
        }
        j8 = Math.max(0, j4 - i8);
        k8 = Math.max(0, i4 - i8);
        x.measure(android.view.View.MeasureSpec.makeMeasureSpec(j8, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x40000000));
        l8 = x.getMeasuredWidth();
        i9 = Math.max(0, j8 - l8);
        k4 = Math.max(0, k8 - l8);
        l4 = i9;
_L8:
        if (g != null)
        {
            view = g;
        } else
        if ((0x10 & j) != 0 && y != null)
        {
            view = y;
        } else
        {
            view = null;
        }
        if (view != null)
        {
            layoutparams = generateLayoutParams(view.getLayoutParams());
            if (layoutparams instanceof android.support.v7.a.b)
            {
                b1 = (android.support.v7.a.b)layoutparams;
            } else
            {
                b1 = null;
            }
            l5 = 0;
            i6 = 0;
            if (b1 != null)
            {
                i6 = b1.leftMargin + b1.rightMargin;
                l5 = b1.topMargin + b1.bottomMargin;
            }
            if (f <= 0)
            {
                j6 = 0x80000000;
            } else
            if (layoutparams.height != -2)
            {
                j6 = 0x40000000;
            } else
            {
                j6 = 0x80000000;
            }
            if (layoutparams.height >= 0)
            {
                i3 = Math.min(layoutparams.height, i3);
            }
            k6 = Math.max(0, i3 - l5);
            if (layoutparams.width != -2)
            {
                l6 = 0x40000000;
            } else
            {
                l6 = 0x80000000;
            }
            if (layoutparams.width >= 0)
            {
                i7 = Math.min(layoutparams.width, l4);
            } else
            {
                i7 = l4;
            }
            j7 = Math.max(0, i7 - i6);
            if (b1 != null)
            {
                k7 = b1.a;
            } else
            {
                k7 = 19;
            }
            if ((k7 & 7) == 1 && layoutparams.width == -1)
            {
                l7 = 2 * Math.min(k4, l3);
            } else
            {
                l7 = j7;
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l7, l6), android.view.View.MeasureSpec.makeMeasureSpec(k6, j6));
            l4 -= i6 + view.getMeasuredWidth();
        }
        if (g == null && flag)
        {
            a(r, l4, android.view.View.MeasureSpec.makeMeasureSpec(f, 0x40000000), 0);
            Math.max(0, k4 - r.getMeasuredWidth());
        }
        if (f > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i5 = 0;
        j5 = 0;
        while (j5 < k1) 
        {
            k5 = j2 + getChildAt(j5).getMeasuredHeight();
            if (k5 <= i5)
            {
                k5 = i5;
            }
            j5++;
            i5 = k5;
        }
        setMeasuredDimension(l1, i5);
_L13:
        if (M != null)
        {
            M.setContentHeight(getMeasuredHeight());
        }
        if (z != null && z.getVisibility() != 8)
        {
            z.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - 2 * B, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x80000000));
            return;
        }
        if (true) goto _L12; else goto _L11
_L11:
        setMeasuredDimension(l1, i2);
          goto _L13
        if (true) goto _L12; else goto _L14
_L14:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (savedstate.a != 0 && R != null && L != null)
        {
            android.support.v4.b.a.b b1 = (android.support.v4.b.a.b)L.findItem(savedstate.a);
            if (b1 != null)
            {
                b1.expandActionView();
            }
        }
        if (savedstate.b)
        {
            b();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (R != null && R.b != null)
        {
            savedstate.a = R.b.getItemId();
        }
        savedstate.b = c();
        return savedstate;
    }

    public void setCallback(android.support.v7.a.c c1)
    {
        P = c1;
    }

    public void setCollapsable(boolean flag)
    {
        J = flag;
    }

    public volatile void setContentHeight(int i1)
    {
        super.setContentHeight(i1);
    }

    public void setContextView(ActionBarContextView actionbarcontextview)
    {
        M = actionbarcontextview;
    }

    public void setCustomNavigationView(View view)
    {
        boolean flag;
        if ((0x10 & j) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (y != null && flag)
        {
            removeView(y);
        }
        y = view;
        if (y != null && flag)
        {
            addView(y);
        }
    }

    public void setDisplayOptions(int i1)
    {
        byte byte0 = 8;
        int j1 = -1;
        boolean flag = true;
        if (j != j1)
        {
            j1 = i1 ^ j;
        }
        j = i1;
        if ((j1 & 0x1f) != 0)
        {
            boolean flag1;
            int k1;
            if ((i1 & 2) != 0)
            {
                flag1 = flag;
            } else
            {
                flag1 = false;
            }
            if (flag1 && g == null)
            {
                k1 = 0;
            } else
            {
                k1 = byte0;
            }
            p.setVisibility(k1);
            if ((j1 & 4) != 0)
            {
                View view;
                LinearLayout linearlayout;
                HomeView homeview;
                boolean flag4;
                if ((i1 & 4) != 0)
                {
                    flag4 = flag;
                } else
                {
                    flag4 = false;
                }
                p.a(flag4);
                if (flag4)
                {
                    setHomeButtonEnabled(flag);
                }
            }
            if ((j1 & 1) != 0)
            {
                boolean flag3;
                Drawable drawable;
                if (n != null && (i1 & 1) != 0)
                {
                    flag3 = flag;
                } else
                {
                    flag3 = false;
                }
                homeview = p;
                if (flag3)
                {
                    drawable = n;
                } else
                {
                    drawable = m;
                }
                homeview.a(drawable);
            }
            if ((j1 & 8) != 0)
            {
                if ((i1 & 8) != 0)
                {
                    g();
                } else
                {
                    removeView(r);
                }
            }
            if (r != null && (j1 & 6) != 0)
            {
                boolean flag2;
                if ((4 & j) != 0)
                {
                    flag2 = flag;
                } else
                {
                    flag2 = false;
                }
                view = u;
                if (!flag1)
                {
                    if (flag2)
                    {
                        byte0 = 0;
                    } else
                    {
                        byte0 = 4;
                    }
                }
                view.setVisibility(byte0);
                linearlayout = r;
                if (flag1 || !flag2)
                {
                    flag = false;
                }
                linearlayout.setEnabled(flag);
            }
            if ((j1 & 0x10) != 0 && y != null)
            {
                if ((i1 & 0x10) != 0)
                {
                    addView(y);
                } else
                {
                    removeView(y);
                }
            }
            requestLayout();
        } else
        {
            invalidate();
        }
        if (!p.isEnabled())
        {
            p.setContentDescription(null);
            return;
        }
        if ((i1 & 4) != 0)
        {
            p.setContentDescription(o.getResources().getText(h.abc_action_bar_up_description));
            return;
        } else
        {
            p.setContentDescription(o.getResources().getText(h.abc_action_bar_home_description));
            return;
        }
    }

    public void setDropdownAdapter(SpinnerAdapter spinneradapter)
    {
        O = spinneradapter;
        if (v != null)
        {
            v.a(spinneradapter);
        }
    }

    public void setDropdownSelectedPosition(int i1)
    {
        v.a(i1);
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (x != null)
        {
            removeView(x);
        }
        x = scrollingtabcontainerview;
        boolean flag;
        if (scrollingtabcontainerview != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        I = flag;
        if (I && i == 2)
        {
            addView(x);
            android.view.ViewGroup.LayoutParams layoutparams = x.getLayoutParams();
            layoutparams.width = -2;
            layoutparams.height = -1;
            scrollingtabcontainerview.setAllowCollapse(true);
        }
    }

    public void setHomeAsUpIndicator(int i1)
    {
        p.a(i1);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        p.b(drawable);
    }

    public void setHomeButtonEnabled(boolean flag)
    {
        p.setEnabled(flag);
        p.setFocusable(flag);
        if (!flag)
        {
            p.setContentDescription(null);
            return;
        }
        if ((4 & j) != 0)
        {
            p.setContentDescription(o.getResources().getText(h.abc_action_bar_up_description));
            return;
        } else
        {
            p.setContentDescription(o.getResources().getText(h.abc_action_bar_home_description));
            return;
        }
    }

    public void setIcon(int i1)
    {
        setIcon(o.getResources().getDrawable(i1));
    }

    public void setIcon(Drawable drawable)
    {
        m = drawable;
        if (drawable != null && ((1 & j) == 0 || n == null))
        {
            p.a(drawable);
        }
        if (g != null)
        {
            q.a(m.getConstantState().newDrawable(getResources()));
        }
    }

    public void setLogo(int i1)
    {
        setLogo(o.getResources().getDrawable(i1));
    }

    public void setLogo(Drawable drawable)
    {
        n = drawable;
        if (drawable != null && (1 & j) != 0)
        {
            p.a(drawable);
        }
    }

    public void setNavigationMode(int i1)
    {
        int j1 = i;
        if (i1 == j1) goto _L2; else goto _L1
_L1:
        j1;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 66
    //                   2 84;
           goto _L3 _L4 _L5
_L3:
        i1;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 109
    //                   2 232;
           goto _L6 _L7 _L8
_L6:
        i = i1;
        requestLayout();
_L2:
        return;
_L4:
        if (w != null)
        {
            removeView(w);
        }
          goto _L3
_L5:
        if (x != null && I)
        {
            removeView(x);
        }
          goto _L3
_L7:
        if (v == null)
        {
            v = new aj(o, null, b.actionDropDownStyle);
            w = (LinearLayout)LayoutInflater.from(o).inflate(g.abc_action_bar_view_list_nav_layout, null);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            layoutparams.gravity = 17;
            w.addView(v, layoutparams);
        }
        if (v.d() != O)
        {
            v.a(O);
        }
        v.a(S);
        addView(w);
          goto _L6
_L8:
        if (x != null && I)
        {
            addView(x);
        }
          goto _L6
    }

    public void setSplitActionBar(boolean flag)
    {
        if (d != flag)
        {
            if (a != null)
            {
                ViewGroup viewgroup = (ViewGroup)a.getParent();
                if (viewgroup != null)
                {
                    viewgroup.removeView(a);
                }
                ActionBarContainer actionbarcontainer;
                if (flag)
                {
                    if (c != null)
                    {
                        c.addView(a);
                    }
                    a.getLayoutParams().width = -1;
                } else
                {
                    addView(a);
                    a.getLayoutParams().width = -2;
                }
                a.requestLayout();
            }
            if (c != null)
            {
                actionbarcontainer = c;
                int i1;
                if (flag)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                actionbarcontainer.setVisibility(i1);
            }
            if (b != null)
            {
                if (!flag)
                {
                    b.a(getResources().getBoolean(c.abc_action_bar_expanded_action_views_exclusive));
                } else
                {
                    b.a(false);
                    b.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    b.a(0x7fffffff);
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
        l = charsequence;
        if (t != null)
        {
            t.setText(charsequence);
            TextView textview = t;
            int i1;
            boolean flag;
            LinearLayout linearlayout;
            int j1;
            if (charsequence != null)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            textview.setVisibility(i1);
            if (g == null && (8 & j) != 0 && (!TextUtils.isEmpty(k) || !TextUtils.isEmpty(l)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            linearlayout = r;
            j1 = 0;
            if (!flag)
            {
                j1 = 8;
            }
            linearlayout.setVisibility(j1);
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        H = true;
        setTitleImpl(charsequence);
    }

    public volatile void setVisibility(int i1)
    {
        super.setVisibility(i1);
    }

    public void setWindowCallback(android.view.Window.Callback callback)
    {
        h = callback;
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        if (!H)
        {
            setTitleImpl(charsequence);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    private class HomeView extends FrameLayout
    {

        private ImageView a;
        private ImageView b;
        private int c;
        private int d;
        private Drawable e;

        public int a()
        {
            if (a.getVisibility() == 8)
            {
                return c;
            } else
            {
                return 0;
            }
        }

        public void a(int i1)
        {
            d = i1;
            ImageView imageview = a;
            Drawable drawable;
            if (i1 != 0)
            {
                drawable = getResources().getDrawable(i1);
            } else
            {
                drawable = e;
            }
            imageview.setImageDrawable(drawable);
        }

        public void a(Drawable drawable)
        {
            b.setImageDrawable(drawable);
        }

        public void a(boolean flag)
        {
            ImageView imageview = a;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            imageview.setVisibility(i1);
        }

        public void b(Drawable drawable)
        {
            ImageView imageview = a;
            if (drawable == null)
            {
                drawable = e;
            }
            imageview.setImageDrawable(drawable);
            d = 0;
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            CharSequence charsequence = getContentDescription();
            if (!TextUtils.isEmpty(charsequence))
            {
                accessibilityevent.getText().add(charsequence);
            }
            return true;
        }

        protected void onConfigurationChanged(Configuration configuration)
        {
            super.onConfigurationChanged(configuration);
            if (d != 0)
            {
                a(d);
            }
        }

        protected void onFinishInflate()
        {
            a = (ImageView)findViewById(e.up);
            b = (ImageView)findViewById(e.home);
            e = a.getDrawable();
        }

        protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
        {
            int i2 = (l1 - j1) / 2;
            int j2 = k1 - i1;
            int k2 = a.getVisibility();
            int l2 = 0;
            if (k2 != 8)
            {
                android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)a.getLayoutParams();
                int j4 = a.getMeasuredHeight();
                int k4 = a.getMeasuredWidth();
                int l4 = i2 - j4 / 2;
                a.layout(0, l4, k4, j4 + l4);
                int i5 = k4 + layoutparams1.leftMargin + layoutparams1.rightMargin;
                int _tmp = j2 - i5;
                i1 += i5;
                l2 = i5;
            }
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)b.getLayoutParams();
            int i3 = b.getMeasuredHeight();
            int j3 = b.getMeasuredWidth();
            int k3 = (k1 - i1) / 2;
            int l3 = l2 + Math.max(layoutparams.leftMargin, k3 - j3 / 2);
            int i4 = Math.max(layoutparams.topMargin, i2 - i3 / 2);
            b.layout(l3, i4, j3 + l3, i3 + i4);
        }

        protected void onMeasure(int i1, int j1)
        {
            int i2;
            int j2;
            int i3;
            int j3;
            measureChildWithMargins(a, i1, 0, j1, 0);
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)a.getLayoutParams();
            c = layoutparams.leftMargin + a.getMeasuredWidth() + layoutparams.rightMargin;
            int k1;
            int l1;
            android.widget.FrameLayout.LayoutParams layoutparams1;
            int k2;
            int l2;
            if (a.getVisibility() == 8)
            {
                k1 = 0;
            } else
            {
                k1 = c;
            }
            l1 = layoutparams.topMargin + a.getMeasuredHeight() + layoutparams.bottomMargin;
            measureChildWithMargins(b, i1, k1, j1, 0);
            layoutparams1 = (android.widget.FrameLayout.LayoutParams)b.getLayoutParams();
            i2 = k1 + (layoutparams1.leftMargin + b.getMeasuredWidth() + layoutparams1.rightMargin);
            j2 = Math.max(l1, layoutparams1.topMargin + b.getMeasuredHeight() + layoutparams1.bottomMargin);
            k2 = android.view.View.MeasureSpec.getMode(i1);
            l2 = android.view.View.MeasureSpec.getMode(j1);
            i3 = android.view.View.MeasureSpec.getSize(i1);
            j3 = android.view.View.MeasureSpec.getSize(j1);
            k2;
            JVM INSTR lookupswitch 2: default 204
        //                       -2147483648: 258
        //                       1073741824: 208;
               goto _L1 _L2 _L3
_L1:
            i3 = i2;
_L3:
            l2;
            JVM INSTR lookupswitch 2: default 236
        //                       -2147483648: 270
        //                       1073741824: 240;
               goto _L4 _L5 _L6
_L6:
            break; /* Loop/switch isn't completed */
_L4:
            j3 = j2;
_L7:
            setMeasuredDimension(i3, j3);
            return;
_L2:
            i3 = Math.min(i2, i3);
              goto _L3
_L5:
            j3 = Math.min(j2, j3);
              goto _L7
        }

        public HomeView(Context context)
        {
            this(context, null);
        }

        public HomeView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.support.v7.internal.widget.j();
        int a;
        boolean b;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            int j1;
            if (b)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
        }

        SavedState(Parcel parcel, f f1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
