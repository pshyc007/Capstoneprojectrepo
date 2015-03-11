// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            ae, DrawerLayout, ac, i

class k extends ae
{

    final DrawerLayout a;
    private final int b;
    private ac c;
    private final Runnable d;

    private void b()
    {
        byte byte0 = 3;
        if (b == byte0)
        {
            byte0 = 5;
        }
        View view = a.a(byte0);
        if (view != null)
        {
            a.i(view);
        }
    }

    public int a(View view)
    {
        return view.getWidth();
    }

    public int a(View view, int j, int l)
    {
        if (a.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(j, 0));
        } else
        {
            int i1 = a.getWidth();
            return Math.max(i1 - view.getWidth(), Math.min(j, i1));
        }
    }

    public void a()
    {
        a.removeCallbacks(d);
    }

    public void a(int j)
    {
        a.a(b, j, c.c());
    }

    public void a(int j, int l)
    {
        a.postDelayed(d, 160L);
    }

    public void a(View view, float f, float f1)
    {
        float f2;
        int j;
        f2 = a.d(view);
        j = view.getWidth();
        if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
        int l;
        if (f > 0.0F || f == 0.0F && f2 > 0.5F)
        {
            l = 0;
        } else
        {
            l = -j;
        }
_L4:
        c.a(l, view.getTop());
        a.invalidate();
        return;
_L2:
        l = a.getWidth();
        if (f < 0.0F || f == 0.0F && f2 > 0.5F)
        {
            l -= j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(View view, int j, int l, int i1, int j1)
    {
        int k1 = view.getWidth();
        float f;
        byte byte0;
        if (a.a(view, 3))
        {
            f = (float)(k1 + j) / (float)k1;
        } else
        {
            f = (float)(a.getWidth() - j) / (float)k1;
        }
        a.b(view, f);
        if (f == 0.0F)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        a.invalidate();
    }

    public boolean a(View view, int j)
    {
        return a.g(view) && a.a(view, b) && a.a(view) == 0;
    }

    public int b(View view, int j, int l)
    {
        return view.getTop();
    }

    public void b(int j, int l)
    {
        View view;
        if ((j & 1) == 1)
        {
            view = a.a(3);
        } else
        {
            view = a.a(5);
        }
        if (view != null && a.a(view) == 0)
        {
            c.a(view, l);
        }
    }

    public void b(View view, int j)
    {
        ((i)view.getLayoutParams()).c = false;
        b();
    }

    public boolean b(int j)
    {
        return false;
    }
}
