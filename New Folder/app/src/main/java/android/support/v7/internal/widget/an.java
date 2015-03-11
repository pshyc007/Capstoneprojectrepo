// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            t, ap, o, ao, 
//            aj

class an extends t
    implements ap
{

    final aj b;
    private CharSequence c;
    private ListAdapter d;

    public an(aj aj1, Context context, AttributeSet attributeset, int i)
    {
        b = aj1;
        super(context, attributeset, i);
        a(aj1);
        a(true);
        a(0);
        a(new o(aj1, new ao(this, aj1)));
    }

    static ListAdapter a(an an1)
    {
        return an1.d;
    }

    public void a(ListAdapter listadapter)
    {
        super.a(listadapter);
        d = listadapter;
    }

    public void a(CharSequence charsequence)
    {
        c = charsequence;
    }

    public void c()
    {
        int i = b.getPaddingLeft();
        Drawable drawable;
        int j;
        if (b.E == -2)
        {
            int i1 = b.getWidth();
            int j1 = b.getPaddingRight();
            e(Math.max(b.a((SpinnerAdapter)d, a()), i1 - i - j1));
        } else
        if (b.E == -1)
        {
            int k = b.getWidth();
            int l = b.getPaddingRight();
            e(k - i - l);
        } else
        {
            e(b.E);
        }
        drawable = a();
        j = 0;
        if (drawable != null)
        {
            drawable.getPadding(aj.a(b));
            j = -aj.a(b).left;
        }
        b(j + i);
        f(2);
        super.c();
        h().setChoiceMode(1);
        g(b.f());
    }
}
