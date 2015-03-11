// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

// Referenced classes of package android.support.v4.widget:
//            f, c, d, e

public abstract class a extends BaseAdapter
    implements f, Filterable
{

    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context d;
    protected int e;
    protected c f;
    protected DataSetObserver g;
    protected e h;
    protected FilterQueryProvider i;

    public a(Context context, Cursor cursor, boolean flag)
    {
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 2;
        }
        a(context, cursor, j);
    }

    public Cursor a()
    {
        return c;
    }

    public Cursor a(CharSequence charsequence)
    {
        if (i != null)
        {
            return i.runQuery(charsequence);
        } else
        {
            return c;
        }
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewgroup);

    void a(Context context, Cursor cursor, int j)
    {
        boolean flag = true;
        int k;
        if ((j & 1) == flag)
        {
            j |= 2;
            b = flag;
        } else
        {
            b = false;
        }
        if (cursor == null)
        {
            flag = false;
        }
        c = cursor;
        a = flag;
        d = context;
        if (flag)
        {
            k = cursor.getColumnIndexOrThrow("_id");
        } else
        {
            k = -1;
        }
        e = k;
        if ((j & 2) == 2)
        {
            f = new c(this);
            g = new d(this, null);
        } else
        {
            f = null;
            g = null;
        }
        if (flag)
        {
            if (f != null)
            {
                cursor.registerContentObserver(f);
            }
            if (g != null)
            {
                cursor.registerDataSetObserver(g);
            }
        }
    }

    public void a(Cursor cursor)
    {
        Cursor cursor1 = b(cursor);
        if (cursor1 != null)
        {
            cursor1.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public Cursor b(Cursor cursor)
    {
        if (cursor == c)
        {
            return null;
        }
        Cursor cursor1 = c;
        if (cursor1 != null)
        {
            if (f != null)
            {
                cursor1.unregisterContentObserver(f);
            }
            if (g != null)
            {
                cursor1.unregisterDataSetObserver(g);
            }
        }
        c = cursor;
        if (cursor != null)
        {
            if (f != null)
            {
                cursor.registerContentObserver(f);
            }
            if (g != null)
            {
                cursor.registerDataSetObserver(g);
            }
            e = cursor.getColumnIndexOrThrow("_id");
            a = true;
            notifyDataSetChanged();
            return cursor1;
        } else
        {
            e = -1;
            a = false;
            notifyDataSetInvalidated();
            return cursor1;
        }
    }

    public View b(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return a(context, cursor, viewgroup);
    }

    protected void b()
    {
        if (b && c != null && !c.isClosed())
        {
            a = c.requery();
        }
    }

    public CharSequence c(Cursor cursor)
    {
        if (cursor == null)
        {
            return "";
        } else
        {
            return cursor.toString();
        }
    }

    public int getCount()
    {
        if (a && c != null)
        {
            return c.getCount();
        } else
        {
            return 0;
        }
    }

    public View getDropDownView(int j, View view, ViewGroup viewgroup)
    {
        if (a)
        {
            c.moveToPosition(j);
            if (view == null)
            {
                view = b(d, c, viewgroup);
            }
            a(view, d, c);
            return view;
        } else
        {
            return null;
        }
    }

    public Filter getFilter()
    {
        if (h == null)
        {
            h = new e(this);
        }
        return h;
    }

    public Object getItem(int j)
    {
        if (a && c != null)
        {
            c.moveToPosition(j);
            return c;
        } else
        {
            return null;
        }
    }

    public long getItemId(int j)
    {
        long l = 0L;
        if (a && c != null && c.moveToPosition(j))
        {
            l = c.getLong(e);
        }
        return l;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        if (!a)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!c.moveToPosition(j))
        {
            throw new IllegalStateException((new StringBuilder()).append("couldn't move cursor to position ").append(j).toString());
        }
        if (view == null)
        {
            view = a(d, c, viewgroup);
        }
        a(view, d, c);
        return view;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
