// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.view.g;
import android.support.v4.view.h;
import android.support.v7.b.f;
import android.support.v7.internal.view.a;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            k, x, ActionMenuView, r, 
//            ActionMenuItemView, e, n, d, 
//            f, y, c, s, 
//            g, w

public class ActionMenuPresenter extends k
    implements h
{

    final android.support.v7.internal.view.menu.g a;
    int b;
    private View i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private final SparseBooleanArray t;
    private View u;
    private android.support.v7.internal.view.menu.f v;
    private c w;
    private d x;

    static c a(ActionMenuPresenter actionmenupresenter, c c1)
    {
        actionmenupresenter.w = c1;
        return c1;
    }

    static d a(ActionMenuPresenter actionmenupresenter, d d1)
    {
        actionmenupresenter.x = d1;
        return d1;
    }

    static android.support.v7.internal.view.menu.f a(ActionMenuPresenter actionmenupresenter, android.support.v7.internal.view.menu.f f1)
    {
        actionmenupresenter.v = f1;
        return f1;
    }

    private View a(MenuItem menuitem)
    {
        ViewGroup viewgroup = (ViewGroup)h;
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        int i1 = viewgroup.getChildCount();
        int j1 = 0;
label0:
        do
        {
label1:
            {
                if (j1 >= i1)
                {
                    break label1;
                }
                view = viewgroup.getChildAt(j1);
                if ((view instanceof x) && ((x)view).getItemData() == menuitem)
                {
                    break label0;
                }
                j1++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public w a(ViewGroup viewgroup)
    {
        w w1 = super.a(viewgroup);
        ((ActionMenuView)w1).setPresenter(this);
        return w1;
    }

    public View a(r r1, View view, ViewGroup viewgroup)
    {
        View view1 = r1.getActionView();
        if (view1 == null || r1.n())
        {
            if (!(view instanceof ActionMenuItemView))
            {
                view = null;
            }
            view1 = super.a(r1, view, viewgroup);
        }
        byte byte0;
        ActionMenuView actionmenuview;
        android.view.ViewGroup.LayoutParams layoutparams;
        if (r1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        actionmenuview = (ActionMenuView)viewgroup;
        layoutparams = view1.getLayoutParams();
        if (!actionmenuview.checkLayoutParams(layoutparams))
        {
            view1.setLayoutParams(actionmenuview.a(layoutparams));
        }
        return view1;
    }

    public void a(int i1)
    {
        n = i1;
        o = true;
    }

    public void a(int i1, boolean flag)
    {
        l = i1;
        p = flag;
        q = true;
    }

    public void a(Context context, n n1)
    {
        super.a(context, n1);
        Resources resources = context.getResources();
        a a1 = android.support.v7.internal.view.a.a(context);
        if (!k)
        {
            j = a1.b();
        }
        if (!q)
        {
            l = a1.c();
        }
        if (!o)
        {
            n = a1.a();
        }
        int i1 = l;
        if (j)
        {
            if (i == null)
            {
                i = new e(this, c);
                int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                i.measure(j1, j1);
            }
            i1 -= i.getMeasuredWidth();
        } else
        {
            i = null;
        }
        m = i1;
        s = (int)(56F * resources.getDisplayMetrics().density);
        u = null;
    }

    public void a(Configuration configuration)
    {
        if (!o)
        {
            n = d.getResources().getInteger(f.abc_max_action_buttons);
        }
        if (e != null)
        {
            e.b(true);
        }
    }

    public void a(n n1, boolean flag)
    {
        c();
        super.a(n1, flag);
    }

    public void a(r r1, x x1)
    {
        x1.a(r1, 0);
        ActionMenuView actionmenuview = (ActionMenuView)h;
        ((ActionMenuItemView)x1).setItemInvoker(actionmenuview);
    }

    public void a(boolean flag)
    {
        r = flag;
    }

    public boolean a()
    {
        if (j && !e() && e != null && h != null && x == null)
        {
            x = new d(this, new android.support.v7.internal.view.menu.f(this, d, e, i, true));
            ((View)h).post(x);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(int i1, r r1)
    {
        return r1.i();
    }

    public boolean a(y y1)
    {
        if (!y1.hasVisibleItems())
        {
            return false;
        }
        y y2;
        for (y2 = y1; y2.r() != e; y2 = (y)y2.r()) { }
        if (a(y2.getItem()) == null)
        {
            if (i == null)
            {
                return false;
            }
            View _tmp = i;
        }
        b = y1.getItem().getItemId();
        w = new c(this, y1);
        w.a(null);
        super.a(y1);
        return true;
    }

    public boolean a(ViewGroup viewgroup, int i1)
    {
        if (viewgroup.getChildAt(i1) == i)
        {
            return false;
        } else
        {
            return super.a(viewgroup, i1);
        }
    }

    public void b(boolean flag)
    {
        int i1 = 1;
        super.b(flag);
        if (h == null)
        {
            return;
        }
        if (e != null)
        {
            ArrayList arraylist1 = e.j();
            int i2 = arraylist1.size();
            for (int j2 = 0; j2 < i2; j2++)
            {
                g g1 = ((r)arraylist1.get(j2)).m();
                if (g1 != null)
                {
                    g1.a(this);
                }
            }

        }
        ArrayList arraylist;
        boolean flag1;
        int j1;
        if (e != null)
        {
            arraylist = e.k();
        } else
        {
            arraylist = null;
        }
        flag1 = j;
        j1 = 0;
        if (flag1)
        {
            j1 = 0;
            if (arraylist != null)
            {
                int k1 = arraylist.size();
                if (k1 == i1)
                {
                    ViewGroup viewgroup;
                    ActionMenuView actionmenuview;
                    int l1;
                    if (!((r)arraylist.get(0)).isActionViewExpanded())
                    {
                        l1 = i1;
                    } else
                    {
                        l1 = 0;
                    }
                    j1 = l1;
                } else
                {
                    if (k1 <= 0)
                    {
                        i1 = 0;
                    }
                    j1 = i1;
                }
            }
        }
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            i = new e(this, c);
        }
        viewgroup = (ViewGroup)i.getParent();
        if (viewgroup != h)
        {
            if (viewgroup != null)
            {
                viewgroup.removeView(i);
            }
            actionmenuview = (ActionMenuView)h;
            actionmenuview.addView(i, actionmenuview.b());
        }
_L4:
        ((ActionMenuView)h).setOverflowReserved(j);
        return;
_L2:
        if (i != null && i.getParent() == h)
        {
            ((ViewGroup)h).removeView(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b()
    {
        if (x != null && h != null)
        {
            ((View)h).removeCallbacks(x);
            x = null;
            return true;
        }
        android.support.v7.internal.view.menu.f f1 = v;
        if (f1 != null)
        {
            f1.b();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean c()
    {
        return b() | d();
    }

    public boolean d()
    {
        if (w != null)
        {
            w.a();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean e()
    {
        return v != null && v.c();
    }

    public boolean f()
    {
        if (!r1.j())
        {
            break MISSING_BLOCK_LABEL_793;
        }
        int i5 = r1.getGroupId();
        boolean flag1 = sparsebooleanarray.get(i5);
        boolean flag2;
        boolean flag3;
        int j5;
        int k5;
        if ((l2 > 0 || flag1) && k1 > 0 && (!p || i4 > 0))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            View view = a(r1, u, viewgroup);
            if (u == null)
            {
                u = view;
            }
            if (p)
            {
                int j7 = android.support.v7.internal.view.menu.ActionMenuView.a(view, j3, i4, l1, 0);
                int k7 = i4 - j7;
                int l5;
                int i6;
                int j6;
                int k6;
                r r2;
                boolean flag4;
                int l6;
                boolean flag5;
                int i7;
                boolean flag6;
                boolean flag7;
                if (j7 == 0)
                {
                    flag5 = false;
                } else
                {
                    flag5 = flag2;
                }
                l6 = k7;
            } else
            {
                view.measure(l1, l1);
                flag4 = flag2;
                l6 = i4;
                flag5 = flag4;
            }
            i7 = view.getMeasuredWidth();
            k1 -= i7;
            if (l3 == 0)
            {
                l3 = i7;
            }
            if (p)
            {
                if (k1 >= 0)
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
                flag3 = flag5 & flag7;
                j5 = l3;
                k5 = l6;
            } else
            {
                if (k1 + l3 > 0)
                {
                    flag6 = true;
                } else
                {
                    flag6 = false;
                }
                flag3 = flag5 & flag6;
                j5 = l3;
                k5 = l6;
            }
        } else
        {
            flag3 = flag2;
            j5 = l3;
            k5 = i4;
        }
        if (!flag3 || i5 == 0) goto _L2; else goto _L1
_L1:
        sparsebooleanarray.put(i5, true);
        l5 = l2;
_L4:
        if (flag3)
        {
            l5--;
        }
        r1.d(flag3);
        j4 = j5;
        k4 = k1;
        i6 = k5;
        l4 = l5;
        i4 = i6;
        break MISSING_BLOCK_LABEL_344;
        ArrayList arraylist = e.h();
        int i1 = arraylist.size();
        int j1 = n;
        int k1 = m;
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewgroup = (ViewGroup)h;
        int i2 = 0;
        int j2 = 0;
        boolean flag = false;
        int k2 = 0;
        while (k2 < i1) 
        {
            r r3 = (r)arraylist.get(k2);
            int k8;
            if (r3.k())
            {
                i2++;
            } else
            if (r3.j())
            {
                j2++;
            } else
            {
                flag = true;
            }
            int l2;
            SparseBooleanArray sparsebooleanarray;
            int i3;
            int j3;
            int k3;
            int l3;
            int i4;
            r r1;
            int j4;
            int k4;
            int l4;
            View view1;
            int l7;
            int i8;
            int j8;
            if (r && r3.isActionViewExpanded())
            {
                k8 = 0;
            } else
            {
                k8 = j1;
            }
            k2++;
            j1 = k8;
        }
        if (j && (flag || i2 + j2 > j1))
        {
            j1--;
        }
        l2 = j1 - i2;
        sparsebooleanarray = t;
        sparsebooleanarray.clear();
        if (p)
        {
            i3 = k1 / s;
            j8 = k1 % s;
            j3 = s + j8 / i3;
        } else
        {
            i3 = 0;
            j3 = 0;
        }
        k3 = 0;
        l3 = 0;
        i4 = i3;
        while (k3 < i1) 
        {
label0:
            {
                {
                    r1 = (r)arraylist.get(k3);
                    if (!r1.k())
                    {
                        break label0;
                    }
                    view1 = a(r1, u, viewgroup);
                    if (u == null)
                    {
                        u = view1;
                    }
                    if (p)
                    {
                        i4 -= android.support.v7.internal.view.menu.ActionMenuView.a(view1, j3, i4, l1, 0);
                    } else
                    {
                        view1.measure(l1, l1);
                    }
                    j4 = view1.getMeasuredWidth();
                    l7 = k1 - j4;
                    if (l3 != 0)
                    {
                        j4 = l3;
                    }
                    i8 = r1.getGroupId();
                    if (i8 != 0)
                    {
                        sparsebooleanarray.put(i8, true);
                    }
                    r1.d(true);
                    k4 = l7;
                    l4 = l2;
                }
                k3++;
                k1 = k4;
                l2 = l4;
                l3 = j4;
            }
        }
        return true;
_L2:
        if (flag1)
        {
            sparsebooleanarray.put(i5, false);
            j6 = l2;
            for (k6 = 0; k6 < k3; k6++)
            {
                r2 = (r)arraylist.get(k6);
                if (r2.getGroupId() == i5)
                {
                    if (r2.i())
                    {
                        j6++;
                    }
                    r2.d(false);
                }
            }

            l5 = j6;
            continue; /* Loop/switch isn't completed */
        }
        l5 = l2;
        if (true) goto _L4; else goto _L3
_L3:
        j4 = l3;
        k4 = k1;
        l4 = l2;
        break MISSING_BLOCK_LABEL_344;
    }
}
