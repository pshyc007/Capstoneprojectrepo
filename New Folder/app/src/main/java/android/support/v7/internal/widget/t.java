// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            ab, aa, z, x, 
//            u, w, v, y

public class t
{

    private boolean A;
    int a;
    private Context b;
    private PopupWindow c;
    private ListAdapter d;
    private w e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private View m;
    private int n;
    private DataSetObserver o;
    private View p;
    private Drawable q;
    private android.widget.AdapterView.OnItemClickListener r;
    private android.widget.AdapterView.OnItemSelectedListener s;
    private final ab t = new ab(this, null);
    private final aa u = new aa(this, null);
    private final z v = new z(this, null);
    private final x w = new x(this, null);
    private Runnable x;
    private Handler y;
    private Rect z;

    public t(Context context, AttributeSet attributeset, int i1)
    {
        f = -2;
        g = -2;
        k = false;
        l = false;
        a = 0x7fffffff;
        n = 0;
        y = new Handler();
        z = new Rect();
        b = context;
        c = new PopupWindow(context, attributeset, i1);
        c.setInputMethodMode(1);
        java.util.Locale _tmp = b.getResources().getConfiguration().locale;
    }

    static w a(t t1)
    {
        return t1.e;
    }

    static PopupWindow b(t t1)
    {
        return t1.c;
    }

    static ab c(t t1)
    {
        return t1.t;
    }

    static Handler d(t t1)
    {
        return t1.y;
    }

    private void i()
    {
        if (m != null)
        {
            android.view.ViewParent viewparent = m.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(m);
            }
        }
    }

    private int j()
    {
        boolean flag = true;
        if (e != null) goto _L2; else goto _L1
_L1:
        int i1;
        w w1;
        View view1;
        Object obj;
        android.widget.LinearLayout.LayoutParams layoutparams1;
        int k2;
        Context context = b;
        x = new u(this);
        Drawable drawable;
        boolean flag1;
        android.widget.LinearLayout.LayoutParams layoutparams2;
        if (!A)
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        e = new w(context, flag1);
        if (q != null)
        {
            e.setSelector(q);
        }
        e.setAdapter(d);
        e.setOnItemClickListener(r);
        e.setFocusable(flag);
        e.setFocusableInTouchMode(flag);
        e.setOnItemSelectedListener(new v(this));
        e.setOnScrollListener(v);
        if (s != null)
        {
            e.setOnItemSelectedListener(s);
        }
        w1 = e;
        view1 = m;
        if (view1 == null) goto _L4; else goto _L3
_L3:
        obj = new LinearLayout(context);
        ((LinearLayout) (obj)).setOrientation(flag);
        layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        n;
        JVM INSTR tableswitch 0 1: default 224
    //                   0 445
    //                   1 426;
           goto _L5 _L6 _L7
_L5:
        Log.e("ListPopupWindow", (new StringBuilder()).append("Invalid hint position ").append(n).toString());
_L9:
        view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(g, 0x80000000), 0);
        layoutparams2 = (android.widget.LinearLayout.LayoutParams)view1.getLayoutParams();
        k2 = view1.getMeasuredHeight() + layoutparams2.topMargin + layoutparams2.bottomMargin;
_L15:
        c.setContentView(((View) (obj)));
        i1 = k2;
_L10:
        drawable = c.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(z);
            int j2 = z.top + z.bottom;
            View view;
            int j1;
            int k1;
            int l1;
            int i2;
            android.widget.LinearLayout.LayoutParams layoutparams;
            if (!j)
            {
                i = -z.top;
                j1 = j2;
            } else
            {
                j1 = j2;
            }
        } else
        {
            z.setEmpty();
            j1 = 0;
        }
        if (c.getInputMethodMode() != 2)
        {
            flag = false;
        }
        k1 = a(b(), i, flag);
        if (k || f == -1)
        {
            return k1 + j1;
        }
          goto _L8
_L7:
        ((LinearLayout) (obj)).addView(w1, layoutparams1);
        ((LinearLayout) (obj)).addView(view1);
          goto _L9
_L6:
        ((LinearLayout) (obj)).addView(view1);
        ((LinearLayout) (obj)).addView(w1, layoutparams1);
          goto _L9
_L2:
        (ViewGroup)c.getContentView();
        view = m;
        if (view != null)
        {
            layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
            i1 = view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
        } else
        {
            i1 = 0;
        }
          goto _L10
_L8:
        g;
        JVM INSTR tableswitch -2 -1: default 560
    //                   -2 609
    //                   -1 648;
           goto _L11 _L12 _L13
_L11:
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(g, 0x40000000);
_L14:
        i2 = e.a(l1, 0, -1, k1 - i1, -1);
        if (i2 > 0)
        {
            i1 += j1;
        }
        return i2 + i1;
_L12:
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (z.left + z.right), 0x80000000);
        continue; /* Loop/switch isn't completed */
_L13:
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (z.left + z.right), 0x40000000);
        if (true) goto _L14; else goto _L4
_L4:
        obj = w1;
        k2 = 0;
          goto _L15
    }

    public int a(View view, int i1, boolean flag)
    {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int j1 = rect.bottom;
        if (flag)
        {
            j1 = view.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        int k1 = Math.max(j1 - (ai[1] + view.getHeight()) - i1, i1 + (ai[1] - rect.top));
        if (c.getBackground() != null)
        {
            c.getBackground().getPadding(z);
            k1 -= z.top + z.bottom;
        }
        return k1;
    }

    public Drawable a()
    {
        return c.getBackground();
    }

    public void a(int i1)
    {
        n = i1;
    }

    public void a(Drawable drawable)
    {
        c.setBackgroundDrawable(drawable);
    }

    public void a(View view)
    {
        p = view;
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        r = onitemclicklistener;
    }

    public void a(ListAdapter listadapter)
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        o = new y(this, null);
_L4:
        d = listadapter;
        if (d != null)
        {
            listadapter.registerDataSetObserver(o);
        }
        if (e != null)
        {
            e.setAdapter(d);
        }
        return;
_L2:
        if (d != null)
        {
            d.unregisterDataSetObserver(o);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        c.setOnDismissListener(ondismisslistener);
    }

    public void a(boolean flag)
    {
        A = true;
        c.setFocusable(flag);
    }

    public View b()
    {
        return p;
    }

    public void b(int i1)
    {
        h = i1;
    }

    public void c()
    {
        boolean flag;
        byte byte0;
        int i1;
        boolean flag1;
        flag = true;
        byte0 = -1;
        i1 = j();
        flag1 = g();
        if (!c.isShowing()) goto _L2; else goto _L1
_L1:
        int j1;
        if (g == byte0)
        {
            j1 = byte0;
        } else
        if (g == -2)
        {
            j1 = b().getWidth();
        } else
        {
            j1 = g;
        }
        if (f != byte0) goto _L4; else goto _L3
_L3:
        if (!flag1)
        {
            i1 = byte0;
        }
        if (flag1)
        {
            PopupWindow popupwindow3 = c;
            PopupWindow popupwindow1;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            if (g != byte0)
            {
                byte0 = 0;
            }
            popupwindow3.setWindowLayoutMode(byte0, 0);
        } else
        {
            PopupWindow popupwindow2 = c;
            byte byte3;
            if (g == byte0)
            {
                byte3 = byte0;
            } else
            {
                byte3 = 0;
            }
            popupwindow2.setWindowLayoutMode(byte3, byte0);
        }
_L8:
        popupwindow1 = c;
        flag2 = l;
        flag3 = false;
        if (!flag2)
        {
            flag4 = k;
            flag3 = false;
            if (!flag4)
            {
                flag3 = flag;
            }
        }
        popupwindow1.setOutsideTouchable(flag3);
        c.update(b(), h, i, j1, i1);
_L6:
        return;
_L4:
        if (f != -2)
        {
            i1 = f;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        byte byte1;
        byte byte2;
        PopupWindow popupwindow;
        if (g == byte0)
        {
            byte1 = byte0;
        } else
        if (g == -2)
        {
            c.setWidth(b().getWidth());
            byte1 = 0;
        } else
        {
            c.setWidth(g);
            byte1 = 0;
        }
        if (f == byte0)
        {
            byte2 = byte0;
        } else
        if (f == -2)
        {
            c.setHeight(i1);
            byte2 = 0;
        } else
        {
            c.setHeight(f);
            byte2 = 0;
        }
        c.setWindowLayoutMode(byte1, byte2);
        popupwindow = c;
        if (l || k)
        {
            flag = false;
        }
        popupwindow.setOutsideTouchable(flag);
        c.setTouchInterceptor(u);
        c.showAsDropDown(b(), h, i);
        e.setSelection(byte0);
        if (!A || e.isInTouchMode())
        {
            e();
        }
        if (A) goto _L6; else goto _L5
_L5:
        y.post(w);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void c(int i1)
    {
        i = i1;
        j = true;
    }

    public void d()
    {
        c.dismiss();
        i();
        c.setContentView(null);
        e = null;
        y.removeCallbacks(t);
    }

    public void d(int i1)
    {
        g = i1;
    }

    public void e()
    {
        w w1 = e;
        if (w1 != null)
        {
            android.support.v7.internal.widget.w.a(w1, true);
            w1.requestLayout();
        }
    }

    public void e(int i1)
    {
        Drawable drawable = c.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(z);
            g = i1 + (z.left + z.right);
            return;
        } else
        {
            d(i1);
            return;
        }
    }

    public void f(int i1)
    {
        c.setInputMethodMode(i1);
    }

    public boolean f()
    {
        return c.isShowing();
    }

    public void g(int i1)
    {
        w w1 = e;
        if (f() && w1 != null)
        {
            android.support.v7.internal.widget.w.a(w1, false);
            w1.setSelection(i1);
            if (w1.getChoiceMode() != 0)
            {
                w1.setItemChecked(i1, true);
            }
        }
    }

    public boolean g()
    {
        return c.getInputMethodMode() == 2;
    }

    public ListView h()
    {
        return e;
    }
}
