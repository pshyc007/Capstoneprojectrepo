// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

// Referenced classes of package android.support.v4.widget:
//            f

class e extends Filter
{

    f a;

    e(f f1)
    {
        a = f1;
    }

    public CharSequence convertResultToString(Object obj)
    {
        return a.c((Cursor)obj);
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        Cursor cursor = a.a(charsequence);
        android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
        if (cursor != null)
        {
            filterresults.count = cursor.getCount();
            filterresults.values = cursor;
            return filterresults;
        } else
        {
            filterresults.count = 0;
            filterresults.values = null;
            return filterresults;
        }
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
        Cursor cursor = a.a();
        if (filterresults.values != null && filterresults.values != cursor)
        {
            a.a((Cursor)filterresults.values);
        }
    }
}
