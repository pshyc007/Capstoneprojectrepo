// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.b.b;
import android.support.v7.b.d;
import android.support.v7.b.g;
import android.support.v7.internal.widget.t;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            u, n, v, t, 
//            y, r

public class s
    implements u, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    static final int b;
    private Context a;
    boolean c;
    private LayoutInflater d;
    private t e;
    private n f;
    private int g;
    private View h;
    private boolean i;
    private ViewTreeObserver j;
    private android.support.v7.internal.view.menu.t k;
    private v l;
    private ViewGroup m;

    public s(Context context, n n1, View view, boolean flag)
    {
        a = context;
        d = LayoutInflater.from(context);
        f = n1;
        i = flag;
        Resources resources = context.getResources();
        g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        h = view;
        n1.a(this);
    }

    private int a(ListAdapter listadapter)
    {
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k1 = listadapter.getCount();
        int l1 = 0;
        int i2 = 0;
        View view = null;
        int j2 = 0;
        while (l1 < k1) 
        {
            int k2 = listadapter.getItemViewType(l1);
            View view1;
            if (k2 != i2)
            {
                view1 = null;
            } else
            {
                k2 = i2;
                view1 = view;
            }
            if (m == null)
            {
                m = new FrameLayout(a);
            }
            view = listadapter.getView(l1, view1, m);
            view.measure(i1, j1);
            j2 = Math.max(j2, view.getMeasuredWidth());
            l1++;
            i2 = k2;
        }
        return j2;
    }

    static boolean a(s s1)
    {
        return s1.i;
    }

    static LayoutInflater b(s s1)
    {
        return s1.d;
    }

    static n c(s s1)
    {
        return s1.f;
    }

    public void a(Context context, n n1)
    {
    }

    public void a(n n1, boolean flag)
    {
        if (n1 == f)
        {
            b();
            if (l != null)
            {
                l.a(n1, flag);
                return;
            }
        }
    }

    public void a(v v1)
    {
        l = v1;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean a()
    {
        e = new t(a, null, b.popupMenuStyle);
        e.a(this);
        e.a(this);
        k = new android.support.v7.internal.view.menu.t(this, f);
        e.a(k);
        e.a(true);
        View view = h;
        if (view != null)
        {
            ViewTreeObserver viewtreeobserver = j;
            boolean flag = false;
            if (viewtreeobserver == null)
            {
                flag = true;
            }
            j = view.getViewTreeObserver();
            if (flag)
            {
                j.addOnGlobalLayoutListener(this);
            }
            e.a(view);
            e.e(Math.min(a(((ListAdapter) (k))), g));
            e.f(2);
            e.c();
            e.h().setOnKeyListener(this);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(n n1, r r)
    {
        return false;
    }

    public boolean a(y y1)
    {
        if (!y1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        s s1;
        int i1;
        int j1;
        s1 = new s(a, y1, h, false);
        s1.a(l);
        i1 = y1.size();
        j1 = 0;
_L5:
        MenuItem menuitem;
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        menuitem = y1.getItem(j1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        s1.a(flag);
        if (s1.a())
        {
            if (l != null)
            {
                l.a(y1);
            }
            return true;
        }
          goto _L2
_L4:
        j1++;
          goto _L5
_L2:
        return false;
        flag = false;
          goto _L6
    }

    public void b()
    {
        if (c())
        {
            e.d();
        }
    }

    public void b(boolean flag)
    {
        if (k != null)
        {
            k.notifyDataSetChanged();
        }
    }

    public boolean b(n n1, r r)
    {
        return false;
    }

    public boolean c()
    {
        return e != null && e.f();
    }

    public boolean f()
    {
        return false;
    }

    public void onDismiss()
    {
        e = null;
        f.close();
        if (j != null)
        {
            if (!j.isAlive())
            {
                j = h.getViewTreeObserver();
            }
            j.removeGlobalOnLayoutListener(this);
            j = null;
        }
    }

    public void onGlobalLayout()
    {
        if (c())
        {
            View view = h;
            if (view == null || !view.isShown())
            {
                b();
            } else
            if (c())
            {
                e.c();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        android.support.v7.internal.view.menu.t t1 = k;
        t.a(t1).a(t1.a(i1), 0);
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            b();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        b = g.abc_popup_menu_item_layout;
    }
}
