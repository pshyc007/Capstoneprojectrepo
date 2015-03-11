// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.b.e;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, ScrollingTabContainerView

public class ActionBarContainer extends FrameLayout
{

    private boolean a;
    private View b;
    private ActionBarView c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    private boolean g;
    private boolean h;

    public ActionBarContainer(Context context)
    {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeset)
    {
        boolean flag;
        flag = true;
        super(context, attributeset);
        setBackgroundDrawable(null);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.ActionBar);
        d = typedarray.getDrawable(10);
        e = typedarray.getDrawable(11);
        if (getId() == e.split_action_bar)
        {
            g = flag;
            f = typedarray.getDrawable(12);
        }
        typedarray.recycle();
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Drawable drawable, Canvas canvas)
    {
        Rect rect = drawable.getBounds();
        if ((drawable instanceof ColorDrawable) && !rect.isEmpty() && android.os.Build.VERSION.SDK_INT < 11)
        {
            canvas.save();
            canvas.clipRect(rect);
            drawable.draw(canvas);
            canvas.restore();
            return;
        } else
        {
            drawable.draw(canvas);
            return;
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (d != null && d.isStateful())
        {
            d.setState(getDrawableState());
        }
        if (e != null && e.isStateful())
        {
            e.setState(getDrawableState());
        }
        if (f != null && f.isStateful())
        {
            f.setState(getDrawableState());
        }
    }

    public View getTabContainer()
    {
        return b;
    }

    public void onDraw(Canvas canvas)
    {
        if (getWidth() != 0 && getHeight() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f != null)
        {
            a(f, canvas);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (d != null)
        {
            a(d, canvas);
        }
        if (e != null && h)
        {
            a(e, canvas);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        c = (ActionBarView)findViewById(e.action_bar);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return a || super.onInterceptTouchEvent(motionevent);
    }

    public void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        boolean flag1;
        boolean flag2;
        int j1;
        int k1;
        View view;
        flag1 = true;
        super.onLayout(flag, i, k, l, i1);
        int l1;
        int i2;
        if (b != null && b.getVisibility() != 8)
        {
            flag2 = flag1;
        } else
        {
            flag2 = false;
        }
        if (b == null || b.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        j1 = getMeasuredHeight();
        k1 = b.getMeasuredHeight();
        if ((2 & c.getDisplayOptions()) != 0)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        l1 = getChildCount();
        i2 = 0;
        if (i2 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(i2);
        if (view != b && !c.f())
        {
            view.offsetTopAndBottom(k1);
        }
        i2++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_92;
_L1:
        b.layout(i, 0, l, k1);
_L3:
        if (g)
        {
            if (f != null)
            {
                f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else
            {
                flag1 = false;
            }
        } else
        {
            boolean flag3;
            boolean flag4;
            if (d != null)
            {
                d.setBounds(c.getLeft(), c.getTop(), c.getRight(), c.getBottom());
                flag3 = flag1;
            } else
            {
                flag3 = false;
            }
            flag4 = false;
            if (flag2)
            {
                Drawable drawable = e;
                flag4 = false;
                if (drawable != null)
                {
                    flag4 = flag1;
                }
            }
            h = flag4;
            if (flag4)
            {
                e.setBounds(b.getLeft(), b.getTop(), b.getRight(), b.getBottom());
            } else
            {
                flag1 = flag3;
            }
        }
        if (flag1)
        {
            invalidate();
        }
        return;
        b.layout(i, j1 - k1, l, j1);
          goto _L3
    }

    public void onMeasure(int i, int k)
    {
        super.onMeasure(i, k);
        if (c != null)
        {
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)c.getLayoutParams();
            int l;
            if (c.f())
            {
                l = 0;
            } else
            {
                l = c.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
            }
            if (b != null && b.getVisibility() != 8 && android.view.View.MeasureSpec.getMode(k) == 0x80000000)
            {
                int i1 = android.view.View.MeasureSpec.getSize(k);
                setMeasuredDimension(getMeasuredWidth(), Math.min(l + b.getMeasuredHeight(), i1));
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (d != null)
        {
            d.setCallback(null);
            unscheduleDrawable(d);
        }
        d = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (c != null)
            {
                d.setBounds(c.getLeft(), c.getTop(), c.getRight(), c.getBottom());
            }
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSplitBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (f != null)
        {
            f.setCallback(null);
            unscheduleDrawable(f);
        }
        f = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (g && f != null)
            {
                f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setStackedBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (e != null)
        {
            e.setCallback(null);
            unscheduleDrawable(e);
        }
        e = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (h && e != null)
            {
                e.setBounds(b.getLeft(), b.getTop(), b.getRight(), b.getBottom());
            }
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (b != null)
        {
            removeView(b);
        }
        b = scrollingtabcontainerview;
        if (scrollingtabcontainerview != null)
        {
            addView(scrollingtabcontainerview);
            android.view.ViewGroup.LayoutParams layoutparams = scrollingtabcontainerview.getLayoutParams();
            layoutparams.width = -1;
            layoutparams.height = -2;
            scrollingtabcontainerview.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean flag)
    {
        a = flag;
        int i;
        if (flag)
        {
            i = 0x60000;
        } else
        {
            i = 0x40000;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d != null)
        {
            d.setVisible(flag, false);
        }
        if (e != null)
        {
            e.setVisible(flag, false);
        }
        if (f != null)
        {
            f.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == d && !g || drawable == e && h || drawable == f && g || super.verifyDrawable(drawable);
    }
}
