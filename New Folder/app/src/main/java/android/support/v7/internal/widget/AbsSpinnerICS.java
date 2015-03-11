// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            k, d, m

abstract class AbsSpinnerICS extends k
{

    private DataSetObserver E;
    SpinnerAdapter a;
    int b;
    int c;
    boolean d;
    int e;
    int f;
    int g;
    int h;
    final Rect i = new Rect();
    final d j = new d(this);

    AbsSpinnerICS(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        o();
    }

    static void a(AbsSpinnerICS absspinnerics, View view, boolean flag)
    {
        absspinnerics.removeDetachedView(view, flag);
    }

    private void o()
    {
        setFocusable(true);
        setWillNotDraw(false);
    }

    int a(View view)
    {
        return view.getMeasuredHeight();
    }

    void a()
    {
        u = false;
        p = false;
        removeAllViewsInLayout();
        B = -1;
        C = 0x8000000000000000L;
        c(-1);
        d(-1);
        invalidate();
    }

    public void a(int l)
    {
        d(l);
        requestLayout();
        invalidate();
    }

    abstract void a(int l, boolean flag);

    public void a(SpinnerAdapter spinneradapter)
    {
        int l = -1;
        if (a != null)
        {
            a.unregisterDataSetObserver(E);
            a();
        }
        a = spinneradapter;
        B = l;
        C = 0x8000000000000000L;
        if (a != null)
        {
            A = z;
            z = a.getCount();
            i();
            E = new m(this);
            a.registerDataSetObserver(E);
            if (z > 0)
            {
                l = 0;
            }
            c(l);
            d(l);
            if (z == 0)
            {
                l();
            }
        } else
        {
            i();
            a();
            l();
        }
        requestLayout();
    }

    int b(View view)
    {
        return view.getMeasuredWidth();
    }

    void b()
    {
        int l = getChildCount();
        d d1 = j;
        int i1 = k;
        for (int j1 = 0; j1 < l; j1++)
        {
            View view = getChildAt(j1);
            d1.a(i1 + j1, view);
        }

    }

    public View c()
    {
        if (z > 0 && x >= 0)
        {
            return getChildAt(x - k);
        } else
        {
            return null;
        }
    }

    public SpinnerAdapter d()
    {
        return a;
    }

    public Adapter e()
    {
        return d();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    protected void onMeasure(int l, int i1)
    {
        boolean flag;
        int k3;
        int l3;
        int j1 = android.view.View.MeasureSpec.getMode(l);
        int k1 = getPaddingLeft();
        int l1 = getPaddingTop();
        int i2 = getPaddingRight();
        int j2 = getPaddingBottom();
        Rect rect = i;
        Rect rect1;
        int k2;
        Rect rect2;
        int l2;
        Rect rect3;
        int i3;
        int j3;
        int i4;
        int j4;
        int k4;
        View view;
        if (k1 <= e)
        {
            k1 = e;
        }
        rect.left = k1;
        rect1 = i;
        if (l1 > f)
        {
            k2 = l1;
        } else
        {
            k2 = f;
        }
        rect1.top = k2;
        rect2 = i;
        if (i2 > g)
        {
            l2 = i2;
        } else
        {
            l2 = g;
        }
        rect2.right = l2;
        rect3 = i;
        if (j2 > h)
        {
            i3 = j2;
        } else
        {
            i3 = h;
        }
        rect3.bottom = i3;
        if (u)
        {
            k();
        }
        j3 = f();
        if (j3 < 0 || a == null || j3 >= a.getCount()) goto _L2; else goto _L1
_L1:
        view = j.a(j3);
        if (view == null)
        {
            view = a.getView(j3, null, this);
        }
        if (view != null)
        {
            j.a(j3, view);
        }
        if (view == null) goto _L2; else goto _L3
_L3:
        if (view.getLayoutParams() == null)
        {
            d = true;
            view.setLayoutParams(generateDefaultLayoutParams());
            d = false;
        }
        measureChild(view, l, i1);
        l3 = a(view) + i.top + i.bottom;
        k3 = b(view) + i.left + i.right;
        flag = false;
_L5:
        if (flag)
        {
            l3 = i.top + i.bottom;
            if (j1 == 0)
            {
                k3 = i.left + i.right;
            }
        }
        i4 = Math.max(l3, getSuggestedMinimumHeight());
        j4 = Math.max(k3, getSuggestedMinimumWidth());
        k4 = resolveSize(i4, i1);
        setMeasuredDimension(resolveSize(j4, l), k4);
        b = i1;
        c = l;
        return;
_L2:
        flag = true;
        k3 = 0;
        l3 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (savedstate.a >= 0L)
        {
            u = true;
            p = true;
            n = savedstate.a;
            m = savedstate.b;
            q = 0;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = g();
        if (savedstate.a >= 0L)
        {
            savedstate.b = f();
            return savedstate;
        } else
        {
            savedstate.b = -1;
            return savedstate;
        }
    }

    public void requestLayout()
    {
        if (!d)
        {
            super.requestLayout();
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new e();
        long a;
        int b;

        public String toString()
        {
            return (new StringBuilder()).append("AbsSpinner.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(a).append(" position=").append(b).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            super.writeToParcel(parcel, l);
            parcel.writeLong(a);
            parcel.writeInt(b);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readLong();
            b = parcel.readInt();
        }

        SavedState(Parcel parcel, c c1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
