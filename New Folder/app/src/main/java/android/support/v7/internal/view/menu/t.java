// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            s, n, r, x, 
//            ListMenuItemView

class t extends BaseAdapter
{

    final s a;
    private n b;
    private int c;

    public t(s s1, n n1)
    {
        a = s1;
        super();
        c = -1;
        b = n1;
        a();
    }

    static n a(t t1)
    {
        return t1.b;
    }

    public r a(int i)
    {
        ArrayList arraylist;
        if (s.a(a))
        {
            arraylist = b.k();
        } else
        {
            arraylist = b.h();
        }
        if (c >= 0 && i >= c)
        {
            i++;
        }
        return (r)arraylist.get(i);
    }

    void a()
    {
        r r1 = s.c(a).q();
        if (r1 != null)
        {
            ArrayList arraylist = s.c(a).k();
            int i = arraylist.size();
            for (int j = 0; j < i; j++)
            {
                if ((r)arraylist.get(j) == r1)
                {
                    c = j;
                    return;
                }
            }

        }
        c = -1;
    }

    public int getCount()
    {
        ArrayList arraylist;
        if (s.a(a))
        {
            arraylist = b.k();
        } else
        {
            arraylist = b.h();
        }
        if (c < 0)
        {
            return arraylist.size();
        } else
        {
            return -1 + arraylist.size();
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        x x1;
        if (view == null)
        {
            view1 = s.b(a).inflate(s.b, viewgroup, false);
        } else
        {
            view1 = view;
        }
        x1 = (x)view1;
        if (a.c)
        {
            ((ListMenuItemView)view1).setForceShowIcon(true);
        }
        x1.a(a(i), 0);
        return view1;
    }

    public void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
