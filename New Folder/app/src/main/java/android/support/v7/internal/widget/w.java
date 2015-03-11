// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.b.b;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

class w extends ListView
{

    private boolean a;
    private boolean b;

    public w(Context context, boolean flag)
    {
        super(context, null, b.dropDownListViewStyle);
        b = flag;
        setCacheColorHint(0);
    }

    static boolean a(w w1, boolean flag)
    {
        w1.a = flag;
        return flag;
    }

    final int a(int i, int j, int k, int l, int i1)
    {
        int j1;
        int k1;
        int l1;
        android.graphics.drawable.Drawable drawable;
        ListAdapter listadapter;
        j1 = getListPaddingTop();
        k1 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        l1 = getDividerHeight();
        drawable = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        l = j1 + k1;
_L4:
        return l;
_L2:
        int i2 = k1 + j1;
        int j2;
        View view;
        int k2;
        int l2;
        int i3;
        if (l1 <= 0 || drawable == null)
        {
            l1 = 0;
        }
        j2 = 0;
        view = null;
        k2 = 0;
        l2 = listadapter.getCount();
        i3 = 0;
        while (i3 < l2) 
        {
            int j3 = listadapter.getItemViewType(i3);
            View view1;
            android.view.ViewGroup.LayoutParams layoutparams;
            int k3;
            int l3;
            int i4;
            if (j3 != k2)
            {
                view1 = null;
                k2 = j3;
            } else
            {
                view1 = view;
            }
            view = listadapter.getView(i3, view1, this);
            layoutparams = view.getLayoutParams();
            if (layoutparams != null && layoutparams.height > 0)
            {
                k3 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
            } else
            {
                k3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, k3);
            if (i3 > 0)
            {
                l3 = i2 + l1;
            } else
            {
                l3 = i2;
            }
            i4 = l3 + view.getMeasuredHeight();
            if (i4 >= l)
            {
                if (i1 >= 0 && i3 > i1 && j2 > 0 && i4 != l)
                {
                    return j2;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (i1 >= 0 && i3 >= i1)
            {
                j2 = i4;
            }
            i3++;
            i2 = i4;
        }
        return i2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean hasFocus()
    {
        return b || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return b || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return b || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return b && a || super.isInTouchMode();
    }
}
