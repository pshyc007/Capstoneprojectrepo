// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.b.b;
import android.support.v7.b.j;
import android.support.v7.internal.widget.LinearLayoutICS;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.internal.view.menu:
//            p, w, j, ActionMenuItemView, 
//            i, n, ActionMenuPresenter, r

public class ActionMenuView extends LinearLayoutICS
    implements p, w
{

    private n a;
    private boolean b;
    private ActionMenuPresenter c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBaselineAligned(false);
        float f1 = context.getResources().getDisplayMetrics().density;
        f = (int)(56F * f1);
        g = (int)(f1 * 4F);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.ActionBar, b.actionBarStyle, 0);
        i = typedarray.getDimensionPixelSize(0, 0);
        typedarray.recycle();
    }

    static int a(View view, int k, int l, int i1, int j1)
    {
        android.support.v7.internal.view.menu.j j2 = (android.support.v7.internal.view.menu.j)view.getLayoutParams();
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i1) - j1, android.view.View.MeasureSpec.getMode(i1));
        ActionMenuItemView actionmenuitemview;
        boolean flag;
        int l1;
        boolean flag1;
        boolean flag2;
        if (view instanceof ActionMenuItemView)
        {
            actionmenuitemview = (ActionMenuItemView)view;
        } else
        {
            actionmenuitemview = null;
        }
        if (actionmenuitemview != null && actionmenuitemview.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l > 0 && (!flag || l >= 2))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k * l, 0x80000000), k1);
            int i2 = view.getMeasuredWidth();
            l1 = i2 / k;
            if (i2 % k != 0)
            {
                l1++;
            }
            if (flag && l1 < 2)
            {
                l1 = 2;
            }
        } else
        {
            l1 = 0;
        }
        flag1 = j2.a;
        flag2 = false;
        if (!flag1)
        {
            flag2 = false;
            if (flag)
            {
                flag2 = true;
            }
        }
        j2.d = flag2;
        j2.b = l1;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 * k, 0x40000000), k1);
        return l1;
    }

    private void a(int k, int l)
    {
        int i1 = android.view.View.MeasureSpec.getMode(l);
        int j1 = android.view.View.MeasureSpec.getSize(k);
        int k1 = android.view.View.MeasureSpec.getSize(l);
        int l1 = getPaddingLeft() + getPaddingRight();
        int i2 = getPaddingTop() + getPaddingBottom();
        int j2;
        int k2;
        int l2;
        int i3;
        if (i1 == 0x40000000)
        {
            j2 = android.view.View.MeasureSpec.makeMeasureSpec(k1 - i2, 0x40000000);
        } else
        {
            j2 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i, k1 - i2), 0x80000000);
        }
        k2 = j1 - l1;
        l2 = k2 / f;
        i3 = k2 % f;
        if (l2 == 0)
        {
            setMeasuredDimension(k2, 0);
            return;
        }
        int j3 = f + i3 / l2;
        int k3 = 0;
        int l3 = 0;
        int i4 = 0;
        int j4 = 0;
        boolean flag = false;
        long l4 = 0L;
        int k4 = getChildCount();
        int i5 = 0;
        while (i5 < k4) 
        {
            View view3 = getChildAt(i5);
            int k13;
            int i14;
            int j14;
            int k14;
            long l14;
            if (view3.getVisibility() == 8)
            {
                k14 = j4;
                l14 = l4;
                i14 = k3;
                j14 = l2;
                k13 = l3;
            } else
            {
                boolean flag6 = view3 instanceof ActionMenuItemView;
                int i11 = j4 + 1;
                if (flag6)
                {
                    view3.setPadding(g, 0, g, 0);
                }
                android.support.v7.internal.view.menu.j j12 = (android.support.v7.internal.view.menu.j)view3.getLayoutParams();
                j12.f = false;
                j12.c = 0;
                j12.b = 0;
                j12.d = false;
                j12.leftMargin = 0;
                j12.rightMargin = 0;
                boolean flag7;
                int k11;
                int l11;
                int i12;
                int k12;
                boolean flag8;
                int l12;
                int i13;
                int j13;
                if (flag6 && ((ActionMenuItemView)view3).b())
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
                j12.e = flag7;
                if (j12.a)
                {
                    k11 = 1;
                } else
                {
                    k11 = l2;
                }
                l11 = a(view3, j3, k11, j2, i2);
                i12 = Math.max(l3, l11);
                boolean flag1;
                boolean flag2;
                long l5;
                int j5;
                long l6;
                boolean flag3;
                boolean flag4;
                int k5;
                int i6;
                View view;
                android.support.v7.internal.view.menu.j j6;
                int k6;
                float f1;
                float f2;
                int i7;
                int j7;
                View view1;
                android.support.v7.internal.view.menu.j j8;
                boolean flag5;
                int k7;
                long l7;
                int i8;
                int k8;
                long l8;
                int i9;
                int j9;
                int k9;
                long l9;
                View view2;
                android.support.v7.internal.view.menu.j j10;
                int i10;
                android.support.v7.internal.view.menu.j j11;
                int k10;
                int l10;
                if (j12.d)
                {
                    k12 = i4 + 1;
                } else
                {
                    k12 = i4;
                }
                if (j12.a)
                {
                    flag8 = true;
                } else
                {
                    flag8 = flag;
                }
                l12 = l2 - l11;
                i13 = view3.getMeasuredHeight();
                j13 = Math.max(k3, i13);
                if (l11 == 1)
                {
                    long l15 = l4 | (long)(1 << i5);
                    i14 = j13;
                    j14 = l12;
                    k14 = i11;
                    flag = flag8;
                    k13 = i12;
                    i4 = k12;
                    l14 = l15;
                } else
                {
                    i4 = k12;
                    k13 = i12;
                    long l13 = l4;
                    i14 = j13;
                    j14 = l12;
                    flag = flag8;
                    k14 = i11;
                    l14 = l13;
                }
            }
            i5++;
            l3 = k13;
            k3 = i14;
            l2 = j14;
            l4 = l14;
            j4 = k14;
        }
        if (flag && j4 == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = false;
        l5 = l4;
        j5 = l2;
        if (i4 <= 0 || j5 <= 0)
        {
            break MISSING_BLOCK_LABEL_1328;
        }
        k7 = 0x7fffffff;
        l7 = 0L;
        i8 = 0;
        k8 = 0;
        while (k8 < k4) 
        {
            j11 = (android.support.v7.internal.view.menu.j)getChildAt(k8).getLayoutParams();
            if (!j11.d)
            {
                k10 = i8;
                l10 = k7;
            } else
            if (j11.b < k7)
            {
                l10 = j11.b;
                l7 = 1 << k8;
                k10 = 1;
            } else
            if (j11.b == k7)
            {
                l7 |= 1 << k8;
                k10 = i8 + 1;
                l10 = k7;
            } else
            {
                k10 = i8;
                l10 = k7;
            }
            k8++;
            k7 = l10;
            i8 = k10;
        }
        l8 = l5 | l7;
        if (i8 <= j5) goto _L2; else goto _L1
_L1:
        l6 = l8;
_L7:
        if (!flag && j4 == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (j5 > 0 && l6 != 0L)
        {
            k6 = j4 - 1;
            if (j5 < k6 || flag3 || l3 > 1)
            {
                break MISSING_BLOCK_LABEL_711;
            }
        }
        flag4 = flag2;
        k5 = j5;
          goto _L3
_L2:
        i9 = k7 + 1;
        j9 = 0;
        k9 = j5;
        l9 = l8;
        while (j9 < k4) 
        {
            view2 = getChildAt(j9);
            j10 = (android.support.v7.internal.view.menu.j)view2.getLayoutParams();
            if ((l7 & (long)(1 << j9)) == 0L)
            {
                if (j10.b == i9)
                {
                    l9 |= 1 << j9;
                    i10 = k9;
                } else
                {
                    i10 = k9;
                }
            } else
            {
                if (flag1 && j10.e && k9 == 1)
                {
                    view2.setPadding(j3 + g, 0, g, 0);
                }
                j10.b = 1 + j10.b;
                j10.f = true;
                i10 = k9 - 1;
            }
            j9++;
            k9 = i10;
        }
        l5 = l9;
        flag2 = true;
        j5 = k9;
        break MISSING_BLOCK_LABEL_500;
        f1 = Long.bitCount(l6);
        if (!flag3)
        {
label0:
            {
                if ((1L & l6) != 0L && !((android.support.v7.internal.view.menu.j)getChildAt(0).getLayoutParams()).e)
                {
                    f1 -= 0.5F;
                }
                if ((l6 & (long)(1 << k4 - 1)) != 0L && !((android.support.v7.internal.view.menu.j)getChildAt(k4 - 1).getLayoutParams()).e)
                {
                    f2 = f1 - 0.5F;
                    break label0;
                }
            }
        }
        f2 = f1;
        if (f2 > 0.0F)
        {
            i7 = (int)((float)(j5 * j3) / f2);
        } else
        {
            i7 = 0;
        }
        j7 = 0;
        flag4 = flag2;
        while (j7 < k4) 
        {
            if ((l6 & (long)(1 << j7)) == 0L)
            {
                flag5 = flag4;
            } else
            {
                view1 = getChildAt(j7);
                j8 = (android.support.v7.internal.view.menu.j)view1.getLayoutParams();
                if (view1 instanceof ActionMenuItemView)
                {
                    j8.c = i7;
                    j8.f = true;
                    if (j7 == 0 && !j8.e)
                    {
                        j8.leftMargin = -i7 / 2;
                    }
                    flag5 = true;
                } else
                if (j8.a)
                {
                    j8.c = i7;
                    j8.f = true;
                    j8.rightMargin = -i7 / 2;
                    flag5 = true;
                } else
                {
                    if (j7 != 0)
                    {
                        j8.leftMargin = i7 / 2;
                    }
                    if (j7 != k4 - 1)
                    {
                        j8.rightMargin = i7 / 2;
                    }
                    flag5 = flag4;
                }
            }
            j7++;
            flag4 = flag5;
        }
        k5 = 0;
_L5:
        if (flag4)
        {
            i6 = 0;
            while (i6 < k4) 
            {
                view = getChildAt(i6);
                j6 = (android.support.v7.internal.view.menu.j)view.getLayoutParams();
                if (j6.f)
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j3 * j6.b + j6.c, 0x40000000), j2);
                }
                i6++;
            }
        }
        if (i1 == 0x40000000)
        {
            k3 = k1;
        }
        setMeasuredDimension(k2, k3);
        h = k5 * j3;
        return;
_L3:
        if (true) goto _L5; else goto _L4
_L4:
        l6 = l5;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected android.support.v7.internal.view.menu.j a()
    {
        android.support.v7.internal.view.menu.j j1 = new android.support.v7.internal.view.menu.j(-2, -2);
        j1.gravity = 16;
        return j1;
    }

    public android.support.v7.internal.view.menu.j a(AttributeSet attributeset)
    {
        return new android.support.v7.internal.view.menu.j(getContext(), attributeset);
    }

    protected android.support.v7.internal.view.menu.j a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.support.v7.internal.view.menu.j)
        {
            android.support.v7.internal.view.menu.j j1 = new android.support.v7.internal.view.menu.j((android.support.v7.internal.view.menu.j)layoutparams);
            if (j1.gravity <= 0)
            {
                j1.gravity = 16;
            }
            return j1;
        } else
        {
            return a();
        }
    }

    public void a(n n1)
    {
        a = n1;
    }

    protected boolean a(int k)
    {
        View view = getChildAt(k - 1);
        View view1 = getChildAt(k);
        int l = getChildCount();
        boolean flag = false;
        if (k < l)
        {
            boolean flag1 = view instanceof i;
            flag = false;
            if (flag1)
            {
                flag = false | ((i)view).d();
            }
        }
        if (k > 0 && (view1 instanceof i))
        {
            return flag | ((i)view1).c();
        } else
        {
            return flag;
        }
    }

    public boolean a(r r)
    {
        return a.a(r, 0);
    }

    public android.support.v7.internal.view.menu.j b()
    {
        android.support.v7.internal.view.menu.j j1 = a();
        j1.a = true;
        return j1;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof android.support.v7.internal.view.menu.j);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return a();
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return a();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public int getWindowAnimations()
    {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        c.b(false);
        if (c != null && c.e())
        {
            c.b();
            c.a();
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c.c();
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        if (!d)
        {
            super.onLayout(flag, k, l, i1, j1);
        } else
        {
            int k1 = getChildCount();
            int l1 = (l + j1) / 2;
            int i2 = getSupportDividerWidth();
            int j2 = 0;
            int k2 = 0;
            int l2 = i1 - k - getPaddingRight() - getPaddingLeft();
            boolean flag1 = false;
            int i3 = 0;
            while (i3 < k1) 
            {
                View view2 = getChildAt(i3);
                int k8;
                int l8;
                int i9;
                boolean flag3;
                if (view2.getVisibility() == 8)
                {
                    flag3 = flag1;
                    k8 = l2;
                    l8 = k2;
                    i9 = j2;
                } else
                {
                    android.support.v7.internal.view.menu.j j7 = (android.support.v7.internal.view.menu.j)view2.getLayoutParams();
                    if (j7.a)
                    {
                        int j9 = view2.getMeasuredWidth();
                        if (a(i3))
                        {
                            j9 += i2;
                        }
                        int k9 = view2.getMeasuredHeight();
                        int l9 = getWidth() - getPaddingRight() - j7.rightMargin;
                        int i10 = l9 - j9;
                        int j10 = l1 - k9 / 2;
                        view2.layout(i10, j10, l9, k9 + j10);
                        k8 = l2 - j9;
                        flag3 = true;
                        l8 = k2;
                        i9 = j2;
                    } else
                    {
                        int k7 = view2.getMeasuredWidth() + j7.leftMargin + j7.rightMargin;
                        int l7 = j2 + k7;
                        int i8 = l2 - k7;
                        if (a(i3))
                        {
                            l7 += i2;
                        }
                        int j8 = k2 + 1;
                        boolean flag2 = flag1;
                        k8 = i8;
                        l8 = j8;
                        i9 = l7;
                        flag3 = flag2;
                    }
                }
                i3++;
                j2 = i9;
                k2 = l8;
                l2 = k8;
                flag1 = flag3;
            }
            if (k1 == 1 && !flag1)
            {
                View view1 = getChildAt(0);
                int j6 = view1.getMeasuredWidth();
                int k6 = view1.getMeasuredHeight();
                int l6 = (i1 - k) / 2 - j6 / 2;
                int i7 = l1 - k6 / 2;
                view1.layout(l6, i7, j6 + l6, k6 + i7);
                return;
            }
            int j3;
            int k3;
            int l3;
            int i4;
            int j4;
            int k4;
            if (flag1)
            {
                j3 = 0;
            } else
            {
                j3 = 1;
            }
            k3 = k2 - j3;
            if (k3 > 0)
            {
                l3 = l2 / k3;
            } else
            {
                l3 = 0;
            }
            i4 = Math.max(0, l3);
            j4 = getPaddingLeft();
            k4 = 0;
            while (k4 < k1) 
            {
                View view = getChildAt(k4);
                android.support.v7.internal.view.menu.j j5 = (android.support.v7.internal.view.menu.j)view.getLayoutParams();
                int l4;
                if (view.getVisibility() != 8)
                {
                    if (j5.a)
                    {
                        l4 = j4;
                    } else
                    {
                        int i5 = j4 + j5.leftMargin;
                        int k5 = view.getMeasuredWidth();
                        int l5 = view.getMeasuredHeight();
                        int i6 = l1 - l5 / 2;
                        view.layout(i5, i6, i5 + k5, l5 + i6);
                        l4 = i5 + (i4 + (k5 + j5.rightMargin));
                    }
                } else
                {
                    l4 = j4;
                }
                k4++;
                j4 = l4;
            }
        }
    }

    protected void onMeasure(int k, int l)
    {
        boolean flag = d;
        boolean flag1;
        int i1;
        if (android.view.View.MeasureSpec.getMode(k) == 0x40000000)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        d = flag1;
        if (flag != d)
        {
            e = 0;
        }
        i1 = android.view.View.MeasureSpec.getMode(k);
        if (d && a != null && i1 != e)
        {
            e = i1;
            a.b(true);
        }
        if (d)
        {
            a(k, l);
            return;
        }
        int j1 = getChildCount();
        for (int k1 = 0; k1 < j1; k1++)
        {
            android.support.v7.internal.view.menu.j j2 = (android.support.v7.internal.view.menu.j)getChildAt(k1).getLayoutParams();
            j2.rightMargin = 0;
            j2.leftMargin = 0;
        }

        super.onMeasure(k, l);
    }

    public void setOverflowReserved(boolean flag)
    {
        b = flag;
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        c = actionmenupresenter;
    }
}
