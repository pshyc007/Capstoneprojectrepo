// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            u, w, x, v, 
//            n, r, y

public abstract class k
    implements u
{

    private v a;
    private int b;
    protected Context c;
    protected Context d;
    protected n e;
    protected LayoutInflater f;
    protected LayoutInflater g;
    protected w h;
    private int i;

    public w a(ViewGroup viewgroup)
    {
        if (h == null)
        {
            h = (w)f.inflate(b, viewgroup, false);
            h.a(e);
            b(true);
        }
        return h;
    }

    public View a(r r1, View view, ViewGroup viewgroup)
    {
        x x1;
        if (view instanceof x)
        {
            x1 = (x)view;
        } else
        {
            x1 = b(viewgroup);
        }
        a(r1, x1);
        return (View)x1;
    }

    public void a(Context context, n n1)
    {
        d = context;
        g = LayoutInflater.from(d);
        e = n1;
    }

    public void a(n n1, boolean flag)
    {
        if (a != null)
        {
            a.a(n1, flag);
        }
    }

    public abstract void a(r r1, x x1);

    public void a(v v1)
    {
        a = v1;
    }

    protected void a(View view, int j)
    {
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(view);
        }
        ((ViewGroup)h).addView(view, j);
    }

    public boolean a(int j, r r1)
    {
        return true;
    }

    public boolean a(n n1, r r1)
    {
        return false;
    }

    public boolean a(y y)
    {
        if (a != null)
        {
            return a.a(y);
        } else
        {
            return false;
        }
    }

    protected boolean a(ViewGroup viewgroup, int j)
    {
        viewgroup.removeViewAt(j);
        return true;
    }

    public x b(ViewGroup viewgroup)
    {
        return (x)f.inflate(i, viewgroup, false);
    }

    public void b(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)h;
        if (viewgroup != null)
        {
            int j;
            if (e != null)
            {
                e.i();
                ArrayList arraylist = e.h();
                int l = arraylist.size();
                int i1 = 0;
                j = 0;
                while (i1 < l) 
                {
                    r r1 = (r)arraylist.get(i1);
                    int j1;
                    if (a(j, r1))
                    {
                        View view = viewgroup.getChildAt(j);
                        r r2;
                        View view1;
                        if (view instanceof x)
                        {
                            r2 = ((x)view).getItemData();
                        } else
                        {
                            r2 = null;
                        }
                        view1 = a(r1, view, viewgroup);
                        if (r1 != r2)
                        {
                            view1.setPressed(false);
                        }
                        if (view1 != view)
                        {
                            a(view1, j);
                        }
                        j1 = j + 1;
                    } else
                    {
                        j1 = j;
                    }
                    i1++;
                    j = j1;
                }
            } else
            {
                j = 0;
            }
            while (j < viewgroup.getChildCount()) 
            {
                if (!a(viewgroup, j))
                {
                    j++;
                }
            }
        }
    }

    public boolean b(n n1, r r1)
    {
        return false;
    }

    public boolean f()
    {
        return false;
    }
}
