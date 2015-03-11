// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.b.e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;

class <init> extends FrameLayout
{

    private ImageView a;
    private ImageView b;
    private int c;
    private int d;
    private Drawable e;

    public int a()
    {
        if (a.getVisibility() == 8)
        {
            return c;
        } else
        {
            return 0;
        }
    }

    public void a(int i)
    {
        d = i;
        ImageView imageview = a;
        Drawable drawable;
        if (i != 0)
        {
            drawable = getResources().getDrawable(i);
        } else
        {
            drawable = e;
        }
        imageview.setImageDrawable(drawable);
    }

    public void a(Drawable drawable)
    {
        b.setImageDrawable(drawable);
    }

    public void a(boolean flag)
    {
        ImageView imageview = a;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    public void b(Drawable drawable)
    {
        ImageView imageview = a;
        if (drawable == null)
        {
            drawable = e;
        }
        imageview.setImageDrawable(drawable);
        d = 0;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        CharSequence charsequence = getContentDescription();
        if (!TextUtils.isEmpty(charsequence))
        {
            accessibilityevent.getText().add(charsequence);
        }
        return true;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (d != 0)
        {
            a(d);
        }
    }

    protected void onFinishInflate()
    {
        a = (ImageView)findViewById(e.up);
        b = (ImageView)findViewById(e.home);
        e = a.getDrawable();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1 = (l - j) / 2;
        int j1 = k - i;
        int k1 = a.getVisibility();
        int l1 = 0;
        if (k1 != 8)
        {
            android.widget.s s1 = (android.widget.s)a.getLayoutParams();
            int j3 = a.getMeasuredHeight();
            int k3 = a.getMeasuredWidth();
            int l3 = i1 - j3 / 2;
            a.layout(0, l3, k3, j3 + l3);
            int i4 = k3 + s1.leftMargin + s1.rightMargin;
            int _tmp = j1 - i4;
            i += i4;
            l1 = i4;
        }
        android.widget.s s = (android.widget.s)b.getLayoutParams();
        int i2 = b.getMeasuredHeight();
        int j2 = b.getMeasuredWidth();
        int k2 = (k - i) / 2;
        int l2 = l1 + Math.max(s.leftMargin, k2 - j2 / 2);
        int i3 = Math.max(s.topMargin, i1 - i2 / 2);
        b.layout(l2, i3, j2 + l2, i2 + i3);
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
        int j1;
        int i2;
        int j2;
        measureChildWithMargins(a, i, 0, j, 0);
        android.widget.s s = (android.widget.s)a.getLayoutParams();
        c = s.leftMargin + a.getMeasuredWidth() + s.rightMargin;
        int k;
        int l;
        android.widget.s s1;
        int k1;
        int l1;
        if (a.getVisibility() == 8)
        {
            k = 0;
        } else
        {
            k = c;
        }
        l = s.topMargin + a.getMeasuredHeight() + s.bottomMargin;
        measureChildWithMargins(b, i, k, j, 0);
        s1 = (android.widget.s)b.getLayoutParams();
        i1 = k + (s1.leftMargin + b.getMeasuredWidth() + s1.rightMargin);
        j1 = Math.max(l, s1.topMargin + b.getMeasuredHeight() + s1.bottomMargin);
        k1 = android.view.e(i);
        l1 = android.view.e(j);
        i2 = android.view.e(i);
        j2 = android.view.e(j);
        k1;
        JVM INSTR lookupswitch 2: default 204
    //                   -2147483648: 258
    //                   1073741824: 208;
           goto _L1 _L2 _L3
_L1:
        i2 = i1;
_L3:
        l1;
        JVM INSTR lookupswitch 2: default 236
    //                   -2147483648: 270
    //                   1073741824: 240;
           goto _L4 _L5 _L6
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        j2 = j1;
_L7:
        setMeasuredDimension(i2, j2);
        return;
_L2:
        i2 = Math.min(i1, i2);
          goto _L3
_L5:
        j2 = Math.min(j1, j2);
          goto _L7
    }

    public (Context context)
    {
        this(context, null);
    }

    public <init>(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }
}
