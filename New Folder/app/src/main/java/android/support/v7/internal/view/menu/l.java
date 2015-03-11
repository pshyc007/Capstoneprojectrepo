// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            u, m, v, y, 
//            q, n, r

public class l
    implements u, android.widget.AdapterView.OnItemClickListener
{

    Context a;
    LayoutInflater b;
    n c;
    int d;
    int e;
    m f;
    private int g;
    private v h;

    public l(int i, int j)
    {
        e = i;
        d = j;
    }

    static int a(l l1)
    {
        return l1.g;
    }

    public ListAdapter a()
    {
        if (f == null)
        {
            f = new m(this);
        }
        return f;
    }

    public void a(Context context, n n1)
    {
        if (d == 0) goto _L2; else goto _L1
_L1:
        a = new ContextThemeWrapper(context, d);
        b = LayoutInflater.from(a);
_L4:
        c = n1;
        if (f != null)
        {
            f.notifyDataSetChanged();
        }
        return;
_L2:
        if (a != null)
        {
            a = context;
            if (b == null)
            {
                b = LayoutInflater.from(a);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(n n1, boolean flag)
    {
        if (h != null)
        {
            h.a(n1, flag);
        }
    }

    public void a(v v1)
    {
        h = v1;
    }

    public boolean a(n n1, r r)
    {
        return false;
    }

    public boolean a(y y1)
    {
        if (!y1.hasVisibleItems())
        {
            return false;
        }
        (new q(y1)).a(null);
        if (h != null)
        {
            h.a(y1);
        }
        return true;
    }

    public void b(boolean flag)
    {
        if (f != null)
        {
            f.notifyDataSetChanged();
        }
    }

    public boolean b(n n1, r r)
    {
        return false;
    }

    public boolean f()
    {
        return false;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        c.a(f.a(i), 0);
    }
}
