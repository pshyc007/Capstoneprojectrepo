// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerICS

class d
{

    final AbsSpinnerICS a;
    private final SparseArray b = new SparseArray();

    d(AbsSpinnerICS absspinnerics)
    {
        a = absspinnerics;
        super();
    }

    View a(int i)
    {
        View view = (View)b.get(i);
        if (view != null)
        {
            b.delete(i);
        }
        return view;
    }

    void a()
    {
        SparseArray sparsearray = b;
        int i = sparsearray.size();
        for (int j = 0; j < i; j++)
        {
            View view = (View)sparsearray.valueAt(j);
            if (view != null)
            {
                AbsSpinnerICS.a(a, view, true);
            }
        }

        sparsearray.clear();
    }

    public void a(int i, View view)
    {
        b.put(i, view);
    }
}
