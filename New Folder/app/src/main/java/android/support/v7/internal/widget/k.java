// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

// Referenced classes of package android.support.v7.internal.widget:
//            p, n, q

abstract class k extends ViewGroup
{

    int A;
    int B;
    long C;
    boolean D;
    private int a;
    private View b;
    private boolean c;
    private boolean d;
    private q e;
    int k;
    int l;
    int m;
    long n;
    long o;
    boolean p;
    int q;
    boolean r;
    p s;
    n t;
    boolean u;
    int v;
    long w;
    int x;
    long y;
    int z;

    k(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = 0;
        n = 0x8000000000000000L;
        p = false;
        r = false;
        v = -1;
        w = 0x8000000000000000L;
        x = -1;
        y = 0x8000000000000000L;
        B = -1;
        C = 0x8000000000000000L;
        D = false;
    }

    static Parcelable a(k k1)
    {
        return k1.onSaveInstanceState();
    }

    private void a()
    {
        if (s == null)
        {
            return;
        }
        int i1 = f();
        if (i1 >= 0)
        {
            View view = c();
            s.a(this, view, i1, e().getItemId(i1));
            return;
        } else
        {
            s.a(this);
            return;
        }
    }

    static void a(k k1, Parcelable parcelable)
    {
        k1.onRestoreInstanceState(parcelable);
    }

    private void a(boolean flag)
    {
        if (h())
        {
            flag = false;
        }
        if (flag)
        {
            if (b != null)
            {
                b.setVisibility(0);
                setVisibility(8);
            } else
            {
                setVisibility(0);
            }
            if (u)
            {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }
            return;
        }
        if (b != null)
        {
            b.setVisibility(8);
        }
        setVisibility(0);
    }

    static void b(k k1)
    {
        k1.a();
    }

    public void a(n n1)
    {
        t = n1;
    }

    public void a(p p1)
    {
        s = p1;
    }

    public boolean a(View view, int i1, long l1)
    {
        n n1 = t;
        boolean flag = false;
        if (n1 != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            t.a(this, view, i1, l1);
            flag = true;
        }
        return flag;
    }

    public void addView(View view)
    {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i1)
    {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    int b(int i1, boolean flag)
    {
        return i1;
    }

    public long b(int i1)
    {
        Adapter adapter = e();
        if (adapter == null || i1 < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i1);
        }
    }

    public abstract View c();

    void c(int i1)
    {
        x = i1;
        y = b(i1);
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && z > 0;
    }

    void d(int i1)
    {
        v = i1;
        w = b(i1);
        if (p && q == 0 && i1 >= 0)
        {
            m = i1;
            n = w;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = c();
        return view != null && view.getVisibility() == 0 && view.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public abstract Adapter e();

    public int f()
    {
        return v;
    }

    public long g()
    {
        return w;
    }

    boolean h()
    {
        return false;
    }

    void i()
    {
label0:
        {
label1:
            {
                Adapter adapter = e();
                boolean flag;
                boolean flag1;
                boolean flag2;
                boolean flag3;
                boolean flag4;
                if (adapter == null || adapter.getCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || h())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1 && d)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                super.setFocusableInTouchMode(flag2);
                if (flag1 && c)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                super.setFocusable(flag3);
                if (b == null)
                {
                    break label0;
                }
                if (adapter != null)
                {
                    boolean flag5 = adapter.isEmpty();
                    flag4 = false;
                    if (!flag5)
                    {
                        break label1;
                    }
                }
                flag4 = true;
            }
            a(flag4);
        }
    }

    void j()
    {
        if (s != null)
        {
            if (r || D)
            {
                if (e == null)
                {
                    e = new q(this, null);
                }
                post(e);
            } else
            {
                a();
            }
        }
        if (x != -1 && isShown() && !isInTouchMode())
        {
            sendAccessibilityEvent(4);
        }
    }

    void k()
    {
        int i1;
        i1 = z;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (!p) goto _L2; else goto _L1
_L1:
        int i2;
        p = false;
        i2 = m();
        if (i2 < 0 || b(i2, true) != i2) goto _L2; else goto _L3
_L3:
        boolean flag1;
        d(i2);
        flag1 = true;
_L8:
        if (flag1) goto _L5; else goto _L4
_L4:
        boolean flag;
        int j1 = f();
        if (j1 >= i1)
        {
            j1 = i1 - 1;
        }
        if (j1 < 0)
        {
            j1 = 0;
        }
        int k1 = b(j1, true);
        int l1;
        if (k1 < 0)
        {
            l1 = b(j1, false);
        } else
        {
            l1 = k1;
        }
        if (l1 < 0) goto _L5; else goto _L6
_L6:
        d(l1);
        l();
        flag = true;
_L7:
        if (!flag)
        {
            x = -1;
            y = 0x8000000000000000L;
            v = -1;
            w = 0x8000000000000000L;
            p = false;
            l();
        }
        return;
_L5:
        flag = flag1;
          goto _L7
_L2:
        flag1 = false;
          goto _L8
        flag = false;
          goto _L7
    }

    void l()
    {
        if (x != B || y != C)
        {
            j();
            B = x;
            C = y;
        }
    }

    int m()
    {
        int i1 = z;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        int i3 = -1;
_L4:
        return i3;
_L2:
        long l1;
        int i2;
        long l2;
        Adapter adapter;
        l1 = n;
        int j1 = m;
        if (l1 == 0x8000000000000000L)
        {
            return -1;
        }
        int k1 = Math.max(0, j1);
        i2 = Math.min(i1 - 1, k1);
        l2 = 100L + SystemClock.uptimeMillis();
        adapter = e();
        if (adapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_209;
_L6:
        int j2;
        int k2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (flag2 || flag && !flag1)
        {
            int j3 = j2 + 1;
            j2 = j3;
            i3 = j3;
            flag = false;
        } else
        if (flag1 || !flag && !flag2)
        {
            int k3 = k2 - 1;
            k2 = k3;
            i3 = k3;
            flag = true;
        }
_L7:
        if (SystemClock.uptimeMillis() > l2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (adapter.getItemId(i3) == l1) goto _L4; else goto _L3
_L3:
        if (j2 == i1 - 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (k2 == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag1 || !flag2) goto _L6; else goto _L5
_L5:
        return -1;
        j2 = i2;
        k2 = i2;
        i3 = i2;
        flag = false;
          goto _L7
    }

    void n()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                p = true;
                o = a;
                if (x < 0)
                {
                    break label0;
                }
                View view1 = getChildAt(x - k);
                n = w;
                m = v;
                if (view1 != null)
                {
                    l = view1.getTop();
                }
                q = 0;
            }
            return;
        }
        View view = getChildAt(0);
        Adapter adapter = e();
        if (k >= 0 && k < adapter.getCount())
        {
            n = adapter.getItemId(k);
        } else
        {
            n = -1L;
        }
        m = k;
        if (view != null)
        {
            l = view.getTop();
        }
        q = 1;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(e);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        a = getHeight();
    }

    public void removeAllViews()
    {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public void removeView(View view)
    {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int i1)
    {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public void setFocusable(boolean flag)
    {
        boolean flag1 = true;
        Adapter adapter = e();
        boolean flag2;
        if (adapter == null || adapter.getCount() == 0)
        {
            flag2 = flag1;
        } else
        {
            flag2 = false;
        }
        c = flag;
        if (!flag)
        {
            d = false;
        }
        if (!flag || flag2 && !h())
        {
            flag1 = false;
        }
        super.setFocusable(flag1);
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        boolean flag1 = true;
        Adapter adapter = e();
        boolean flag2;
        if (adapter == null || adapter.getCount() == 0)
        {
            flag2 = flag1;
        } else
        {
            flag2 = false;
        }
        d = flag;
        if (flag)
        {
            c = flag1;
        }
        if (!flag || flag2 && !h())
        {
            flag1 = false;
        }
        super.setFocusableInTouchMode(flag1);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }
}
