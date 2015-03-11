// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutICS extends LinearLayout
{

    private final Drawable a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public LinearLayoutICS(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.LinearLayoutICS);
        a = typedarray.getDrawable(0);
        if (a != null)
        {
            b = a.getIntrinsicWidth();
            c = a.getIntrinsicHeight();
        } else
        {
            b = 0;
            c = 0;
        }
        d = typedarray.getInt(flag, 0);
        e = typedarray.getDimensionPixelSize(2, 0);
        typedarray.recycle();
        if (a != null)
        {
            flag = false;
        }
        setWillNotDraw(flag);
    }

    void a(Canvas canvas)
    {
        int i = getChildCount();
        for (int k = 0; k < i; k++)
        {
            View view1 = getChildAt(k);
            if (view1 != null && view1.getVisibility() != 8 && a(k))
            {
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view1.getLayoutParams();
                a(canvas, view1.getTop() - layoutparams.topMargin);
            }
        }

        if (a(i))
        {
            View view = getChildAt(i - 1);
            int l;
            if (view == null)
            {
                l = getHeight() - getPaddingBottom() - c;
            } else
            {
                l = view.getBottom();
            }
            a(canvas, l);
        }
    }

    void a(Canvas canvas, int i)
    {
        a.setBounds(getPaddingLeft() + e, i, getWidth() - getPaddingRight() - e, i + c);
        a.draw(canvas);
    }

    protected boolean a(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        if ((1 & d) == 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i != getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((4 & d) == 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if ((2 & d) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = i - 1;
        do
        {
            if (k < 0)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            if (getChildAt(k).getVisibility() != 8)
            {
                break;
            }
            k--;
        } while (true);
        if (true) goto _L3; else goto _L6
_L6:
        return false;
        return false;
    }

    void b(Canvas canvas)
    {
        int i = getChildCount();
        for (int k = 0; k < i; k++)
        {
            View view1 = getChildAt(k);
            if (view1 != null && view1.getVisibility() != 8 && a(k))
            {
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view1.getLayoutParams();
                b(canvas, view1.getLeft() - layoutparams.leftMargin);
            }
        }

        if (a(i))
        {
            View view = getChildAt(i - 1);
            int l;
            if (view == null)
            {
                l = getWidth() - getPaddingRight() - b;
            } else
            {
                l = view.getRight();
            }
            b(canvas, l);
        }
    }

    void b(Canvas canvas, int i)
    {
        a.setBounds(i, getPaddingTop() + e, i + b, getHeight() - getPaddingBottom() - e);
        a.draw(canvas);
    }

    public int getSupportDividerWidth()
    {
        return b;
    }

    protected void measureChildWithMargins(View view, int i, int k, int l, int i1)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        android.widget.LinearLayout.LayoutParams layoutparams;
        j1 = indexOfChild(view);
        k1 = getChildCount();
        layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        if (getOrientation() != 1) goto _L4; else goto _L3
_L3:
        if (!a(j1)) goto _L6; else goto _L5
_L5:
        layoutparams.topMargin = c;
_L2:
        super.measureChildWithMargins(view, i, k, l, i1);
        return;
_L6:
        if (j1 == k1 - 1 && a(k1))
        {
            layoutparams.bottomMargin = c;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (a(j1))
        {
            layoutparams.leftMargin = b;
        } else
        if (j1 == k1 - 1 && a(k1))
        {
            layoutparams.rightMargin = b;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected void onDraw(Canvas canvas)
    {
        if (a == null)
        {
            return;
        }
        if (getOrientation() == 1)
        {
            a(canvas);
            return;
        } else
        {
            b(canvas);
            return;
        }
    }
}
