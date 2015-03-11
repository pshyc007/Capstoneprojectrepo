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
//            l, n, r, x

class m extends BaseAdapter
{

    final l a;
    private int b;

    public m(l l1)
    {
        a = l1;
        super();
        b = -1;
        a();
    }

    public r a(int i)
    {
        ArrayList arraylist = a.c.k();
        int j = i + l.a(a);
        if (b >= 0 && j >= b)
        {
            j++;
        }
        return (r)arraylist.get(j);
    }

    void a()
    {
        r r1 = a.c.q();
        if (r1 != null)
        {
            ArrayList arraylist = a.c.k();
            int i = arraylist.size();
            for (int j = 0; j < i; j++)
            {
                if ((r)arraylist.get(j) == r1)
                {
                    b = j;
                    return;
                }
            }

        }
        b = -1;
    }

    public int getCount()
    {
        int i = a.c.k().size() - l.a(a);
        if (b < 0)
        {
            return i;
        } else
        {
            return i - 1;
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
        if (view == null)
        {
            view1 = a.b.inflate(a.e, viewgroup, false);
        } else
        {
            view1 = view;
        }
        ((x)view1).a(a(i), 0);
        return view1;
    }

    public void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
