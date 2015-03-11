// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerICS, ap, al, an, 
//            d, am, n

class aj extends AbsSpinnerICS
    implements android.content.DialogInterface.OnClickListener
{

    int E;
    private ap F;
    private am G;
    private int H;
    private Rect I;

    aj(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, -1);
    }

    aj(Context context, AttributeSet attributeset, int i, int k)
    {
        TypedArray typedarray;
        super(context, attributeset, i);
        I = new Rect();
        typedarray = context.obtainStyledAttributes(attributeset, j.Spinner, i, 0);
        if (k == -1)
        {
            k = typedarray.getInt(7, 0);
        }
        k;
        JVM INSTR tableswitch 0 1: default 72
    //                   0 131
    //                   1 147;
           goto _L1 _L2 _L3
_L1:
        H = typedarray.getInt(0, 17);
        F.a(typedarray.getString(6));
        typedarray.recycle();
        if (G != null)
        {
            F.a(G);
            G = null;
        }
        return;
_L2:
        F = new al(this, null);
        continue; /* Loop/switch isn't completed */
_L3:
        an an1 = new an(this, context, attributeset, i);
        E = typedarray.getLayoutDimension(3, -2);
        an1.a(typedarray.getDrawable(2));
        int l = typedarray.getDimensionPixelOffset(5, 0);
        if (l != 0)
        {
            an1.c(l);
        }
        int i1 = typedarray.getDimensionPixelOffset(4, 0);
        if (i1 != 0)
        {
            an1.b(i1);
        }
        F = an1;
        if (true) goto _L1; else goto _L4
_L4:
    }

    static Rect a(aj aj1)
    {
        return aj1.I;
    }

    private void c(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, 0, layoutparams);
        view.setSelected(hasFocus());
        int i = ViewGroup.getChildMeasureSpec(b, this.i.top + this.i.bottom, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(c, this.i.left + this.i.right, layoutparams.width), i);
        int k = this.i.top + (getMeasuredHeight() - this.i.bottom - this.i.top - view.getMeasuredHeight()) / 2;
        int l = k + view.getMeasuredHeight();
        view.layout(0, k, 0 + view.getMeasuredWidth(), l);
    }

    private View e(int i)
    {
        if (!u)
        {
            View view1 = j.a(i);
            if (view1 != null)
            {
                c(view1);
                return view1;
            }
        }
        View view = a.getView(i, null, this);
        c(view);
        return view;
    }

    int a(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        if (spinneradapter == null)
        {
            return 0;
        }
        int i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int l = Math.max(0, f());
        int i1 = Math.min(spinneradapter.getCount(), l + 15);
        int j1 = Math.max(0, l - (15 - (i1 - l)));
        View view = null;
        int k1 = 0;
        int l1 = 0;
        while (j1 < i1) 
        {
            int i2 = spinneradapter.getItemViewType(j1);
            View view1;
            if (i2 != l1)
            {
                view1 = null;
            } else
            {
                i2 = l1;
                view1 = view;
            }
            view = spinneradapter.getView(j1, view1, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(i, k);
            k1 = Math.max(k1, view.getMeasuredWidth());
            j1++;
            l1 = i2;
        }
        if (drawable != null)
        {
            drawable.getPadding(I);
            return k1 + (I.left + I.right);
        } else
        {
            return k1;
        }
    }

    void a(int i, boolean flag)
    {
        int k;
        int l;
        View view;
        int i1;
        k = this.i.left;
        l = getRight() - getLeft() - this.i.left - this.i.right;
        if (u)
        {
            k();
        }
        if (z == 0)
        {
            a();
            return;
        }
        if (v >= 0)
        {
            c(v);
        }
        b();
        removeAllViewsInLayout();
        this.k = x;
        view = e(x);
        i1 = view.getMeasuredWidth();
        7 & H;
        JVM INSTR lookupswitch 2: default 140
    //                   1: 180
    //                   5: 195;
           goto _L1 _L2 _L3
_L1:
        view.offsetLeftAndRight(k);
        j.a();
        invalidate();
        l();
        u = false;
        p = false;
        d(x);
        return;
_L2:
        k = (k + l / 2) - i1 / 2;
        continue; /* Loop/switch isn't completed */
_L3:
        k = (k + l) - i1;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(n n)
    {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    public void a(SpinnerAdapter spinneradapter)
    {
        super.a(spinneradapter);
        if (F != null)
        {
            F.a(new am(spinneradapter));
            return;
        } else
        {
            G = new am(spinneradapter);
            return;
        }
    }

    void b(n n)
    {
        super.a(n);
    }

    public int getBaseline()
    {
        int i = -1;
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
_L4:
        if (view != null)
        {
            int l = view.getBaseline();
            if (l >= 0)
            {
                i = l + view.getTop();
            }
        }
        return i;
_L2:
        SpinnerAdapter spinneradapter = a;
        view = null;
        if (spinneradapter != null)
        {
            int k = a.getCount();
            view = null;
            if (k > 0)
            {
                view = e(0);
                j.a(0, view);
                removeAllViewsInLayout();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a(i);
        dialoginterface.dismiss();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (F != null && F.f())
        {
            F.d();
        }
    }

    protected void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        super.onLayout(flag, i, k, l, i1);
        r = true;
        a(0, false);
        r = false;
    }

    protected void onMeasure(int i, int k)
    {
        super.onMeasure(i, k);
        if (F != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(d(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick()
    {
        boolean flag = super.performClick();
        if (!flag)
        {
            flag = true;
            if (!F.f())
            {
                F.c();
            }
        }
        return flag;
    }
}
