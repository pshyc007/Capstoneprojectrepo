// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.aa;
import android.support.v4.view.al;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ab, aa, z, v, 
//            u, y, ac, w

public class SlidingPaneLayout extends ViewGroup
{

    static final y a;
    private int b;
    private int c;
    private Drawable d;
    private Drawable e;
    private final int f;
    private boolean g;
    private View h;
    private float i;
    private float j;
    private int k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private w p;
    private final ac q;
    private boolean r;
    private boolean s;
    private final Rect t;
    private final ArrayList u;

    static ArrayList a(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.u;
    }

    private void a(float f1)
    {
        boolean flag;
        boolean flag1;
        flag = f();
        v v1 = (v)h.getLayoutParams();
        if (v1.c)
        {
label0:
            {
                int i1;
                int j1;
                int i2;
                if (flag)
                {
                    i2 = v1.rightMargin;
                } else
                {
                    i2 = v1.leftMargin;
                }
                if (i2 <= 0)
                {
                    flag1 = true;
                    break label0;
                }
            }
        }
        flag1 = false;
        continue;
        while (true) 
        {
            i1 = getChildCount();
            j1 = 0;
            while (j1 < i1) 
            {
                View view = getChildAt(j1);
                if (view != h)
                {
                    int k1 = (int)((1.0F - j) * (float)m);
                    j = f1;
                    int l1 = k1 - (int)((1.0F - f1) * (float)m);
                    if (flag)
                    {
                        l1 = -l1;
                    }
                    view.offsetLeftAndRight(l1);
                    if (flag1)
                    {
                        float f2;
                        if (flag)
                        {
                            f2 = j - 1.0F;
                        } else
                        {
                            f2 = 1.0F - j;
                        }
                        a(view, f2, c);
                    }
                }
                j1++;
            }
            return;
        }
    }

    static void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        slidingpanelayout.d(view);
    }

    private void a(View view, float f1, int i1)
    {
        v v1 = (v)view.getLayoutParams();
        if (f1 > 0.0F && i1 != 0)
        {
            int j1 = (int)(f1 * (float)((0xff000000 & i1) >>> 24)) << 24 | 0xffffff & i1;
            if (v1.d == null)
            {
                v1.d = new Paint();
            }
            v1.d.setColorFilter(new PorterDuffColorFilter(j1, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (al.c(view) != 2)
            {
                al.a(view, 2, v1.d);
            }
            d(view);
        } else
        if (al.c(view) != 0)
        {
            if (v1.d != null)
            {
                v1.d.setColorFilter(null);
            }
            u u1 = new u(this, view);
            u.add(u1);
            al.a(this, u1);
            return;
        }
    }

    private boolean a(View view, int i1)
    {
        boolean flag;
label0:
        {
            if (!s)
            {
                boolean flag1 = a(0.0F, i1);
                flag = false;
                if (!flag1)
                {
                    break label0;
                }
            }
            r = false;
            flag = true;
        }
        return flag;
    }

    private boolean b(View view, int i1)
    {
        if (s || a(1.0F, i1))
        {
            r = true;
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean c(View view)
    {
        if (!al.e(view))
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                return false;
            }
            Drawable drawable = view.getBackground();
            if (drawable != null)
            {
                if (drawable.getOpacity() != -1)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    private void d(View view)
    {
        a.a(this, view);
    }

    private boolean f()
    {
        return al.d(this) == 1;
    }

    void a()
    {
        int i1 = getChildCount();
        for (int j1 = 0; j1 < i1; j1++)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    void a(View view)
    {
        boolean flag = f();
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (flag)
        {
            i1 = getWidth() - getPaddingRight();
        } else
        {
            i1 = getPaddingLeft();
        }
        if (flag)
        {
            j1 = getPaddingLeft();
        } else
        {
            j1 = getWidth() - getPaddingRight();
        }
        k1 = getPaddingTop();
        l1 = getHeight() - getPaddingBottom();
        if (view != null && c(view))
        {
            l2 = view.getLeft();
            k2 = view.getRight();
            j2 = view.getTop();
            i2 = view.getBottom();
        } else
        {
            i2 = 0;
            j2 = 0;
            k2 = 0;
            l2 = 0;
        }
        i3 = getChildCount();
        j3 = 0;
        do
        {
            View view1;
label0:
            {
                if (j3 < i3)
                {
                    view1 = getChildAt(j3);
                    if (view1 != view)
                    {
                        break label0;
                    }
                }
                return;
            }
            int k3;
            int l3;
            int i4;
            int j4;
            int k4;
            int l4;
            byte byte0;
            if (flag)
            {
                k3 = j1;
            } else
            {
                k3 = i1;
            }
            l3 = Math.max(k3, view1.getLeft());
            i4 = Math.max(k1, view1.getTop());
            if (flag)
            {
                j4 = i1;
            } else
            {
                j4 = j1;
            }
            k4 = Math.min(j4, view1.getRight());
            l4 = Math.min(l1, view1.getBottom());
            if (l3 >= l2 && i4 >= j2 && k4 <= k2 && l4 <= i2)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            view1.setVisibility(byte0);
            j3++;
        } while (true);
    }

    boolean a(float f1, int i1)
    {
        if (!g)
        {
            return false;
        }
        boolean flag = f();
        v v1 = (v)h.getLayoutParams();
        int j1;
        if (flag)
        {
            int k1 = getPaddingRight() + v1.rightMargin;
            int l1 = h.getWidth();
            j1 = (int)((float)getWidth() - ((float)k1 + f1 * (float)k + (float)l1));
        } else
        {
            j1 = (int)((float)(getPaddingLeft() + v1.leftMargin) + f1 * (float)k);
        }
        if (q.a(h, j1, h.getTop()))
        {
            a();
            al.b(this);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b()
    {
        return b(h, 0);
    }

    boolean b(View view)
    {
        if (view == null)
        {
            return false;
        }
        v v1 = (v)view.getLayoutParams();
        boolean flag;
        if (g && v1.c && i > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public boolean c()
    {
        return a(h, 0);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof v) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
label0:
        {
            if (q.a(true))
            {
                if (g)
                {
                    break label0;
                }
                q.f();
            }
            return;
        }
        al.b(this);
    }

    public boolean d()
    {
        return !g || i == 1.0F;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        Drawable drawable;
        View view;
        if (f())
        {
            drawable = e;
        } else
        {
            drawable = d;
        }
        if (getChildCount() > 1)
        {
            view = getChildAt(1);
        } else
        {
            view = null;
        }
        if (view == null || drawable == null)
        {
            return;
        }
        int i1 = view.getTop();
        int j1 = view.getBottom();
        int k1 = drawable.getIntrinsicWidth();
        int l1;
        int i2;
        if (f())
        {
            i2 = view.getRight();
            l1 = i2 + k1;
        } else
        {
            l1 = view.getLeft();
            i2 = l1 - k1;
        }
        drawable.setBounds(i2, i1, l1, j1);
        drawable.draw(canvas);
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        v v1 = (v)view.getLayoutParams();
        int i1 = canvas.save(2);
        boolean flag;
        if (g && !v1.b && h != null)
        {
            canvas.getClipBounds(t);
            if (f())
            {
                t.left = Math.max(t.left, h.getRight());
            } else
            {
                t.right = Math.min(t.right, h.getLeft());
            }
            canvas.clipRect(t);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = super.drawChild(canvas, view, l1);
        } else
        if (v1.c && i > 0.0F)
        {
            if (!view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(true);
            }
            android.graphics.Bitmap bitmap = view.getDrawingCache();
            if (bitmap != null)
            {
                canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), v1.d);
                flag = false;
            } else
            {
                Log.e("SlidingPaneLayout", (new StringBuilder()).append("drawChild: child view ").append(view).append(" returned null drawing cache").toString());
                flag = super.drawChild(canvas, view, l1);
            }
        } else
        {
            if (view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(false);
            }
            flag = super.drawChild(canvas, view, l1);
        }
        canvas.restoreToCount(i1);
        return flag;
    }

    public boolean e()
    {
        return g;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new v();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new v(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new v((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new v(layoutparams);
        }
    }

    public int getCoveredFadeColor()
    {
        return c;
    }

    public int getParallaxDistance()
    {
        return m;
    }

    public int getSliderFadeColor()
    {
        return b;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        s = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        s = true;
        int i1 = u.size();
        for (int j1 = 0; j1 < i1; j1++)
        {
            ((u)u.get(j1)).run();
        }

        u.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        i1 = aa.a(motionevent);
        if (!g && i1 == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                boolean flag2;
                if (!q.b(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                r = flag2;
            }
        }
        if (g && (!l || i1 == 0)) goto _L2; else goto _L1
_L1:
        q.e();
        flag = super.onInterceptTouchEvent(motionevent);
_L7:
        return flag;
_L2:
        if (i1 == 3 || i1 == 1)
        {
            q.e();
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 2: default 152
    //                   0 175
    //                   1 152
    //                   2 241;
           goto _L3 _L4 _L3 _L5
_L3:
        boolean flag1 = false;
_L9:
        if (q.a(motionevent))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = false;
        if (!flag1) goto _L7; else goto _L6
_L6:
        return true;
_L4:
        float f5;
        float f6;
        l = false;
        f5 = motionevent.getX();
        f6 = motionevent.getY();
        n = f5;
        o = f6;
        if (!q.b(h, (int)f5, (int)f6) || !b(h)) goto _L3; else goto _L8
_L8:
        flag1 = true;
          goto _L9
_L5:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        float f3 = Math.abs(f1 - n);
        float f4 = Math.abs(f2 - o);
        if (f3 > (float)q.d() && f4 > f3)
        {
            q.e();
            l = true;
            return false;
        }
          goto _L3
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = f();
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (flag1)
        {
            q.a(2);
        } else
        {
            q.a(1);
        }
        i2 = k1 - i1;
        if (flag1)
        {
            j2 = getPaddingRight();
        } else
        {
            j2 = getPaddingLeft();
        }
        if (flag1)
        {
            k2 = getPaddingLeft();
        } else
        {
            k2 = getPaddingRight();
        }
        l2 = getPaddingTop();
        i3 = getChildCount();
        if (s)
        {
            int j3;
            float f1;
            if (g && r)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            i = f1;
        }
        j3 = 0;
        k3 = j2;
        while (j3 < i3) 
        {
            View view = getChildAt(j3);
            int j5;
            int k5;
            if (view.getVisibility() == 8)
            {
                j5 = j2;
                k5 = k3;
            } else
            {
                v v1 = (v)view.getLayoutParams();
                int i4 = view.getMeasuredWidth();
                int j4;
                int k4;
                int l4;
                int i5;
                if (v1.b)
                {
                    int l5 = v1.leftMargin + v1.rightMargin;
                    int i6 = Math.min(j2, i2 - k2 - f) - k3 - l5;
                    k = i6;
                    int j6;
                    boolean flag2;
                    int k6;
                    if (flag1)
                    {
                        j6 = v1.rightMargin;
                    } else
                    {
                        j6 = v1.leftMargin;
                    }
                    if (i6 + (k3 + j6) + i4 / 2 > i2 - k2)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    v1.c = flag2;
                    k6 = (int)((float)i6 * i);
                    j4 = k3 + (j6 + k6);
                    i = (float)k6 / (float)k;
                    k4 = 0;
                } else
                if (g && m != 0)
                {
                    k4 = (int)((1.0F - i) * (float)m);
                    j4 = j2;
                } else
                {
                    j4 = j2;
                    k4 = 0;
                }
                if (flag1)
                {
                    i5 = k4 + (i2 - j4);
                    l4 = i5 - i4;
                } else
                {
                    l4 = j4 - k4;
                    i5 = l4 + i4;
                }
                view.layout(l4, l2, i5, l2 + view.getMeasuredHeight());
                j5 = j2 + view.getWidth();
                k5 = j4;
            }
            j3++;
            j2 = j5;
            k3 = k5;
        }
        if (s)
        {
            if (g)
            {
                if (m != 0)
                {
                    a(i);
                }
                if (((v)h.getLayoutParams()).c)
                {
                    a(h, i, b);
                }
            } else
            {
                int l3 = 0;
                while (l3 < i3) 
                {
                    a(getChildAt(l3), 0.0F, b);
                    l3++;
                }
            }
            a(h);
        }
        s = false;
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int j2;
        k1 = android.view.View.MeasureSpec.getMode(i1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        i2 = android.view.View.MeasureSpec.getMode(j1);
        j2 = android.view.View.MeasureSpec.getSize(j1);
        if (k1 == 0x40000000) goto _L2; else goto _L1
_L1:
        if (!isInEditMode()) goto _L4; else goto _L3
_L3:
        if (k1 != 0x80000000) goto _L6; else goto _L5
_L5:
        int k2;
        int l2;
        int i3;
        k2 = i2;
        l2 = l1;
        i3 = j2;
_L16:
        k2;
        JVM INSTR lookupswitch 2: default 84
    //                   -2147483648: 324
    //                   1073741824: 303;
           goto _L7 _L8 _L9
_L7:
        int j3;
        int k3;
        k3 = 0;
        j3 = -1;
_L13:
        boolean flag;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        float f1;
        flag = false;
        l3 = l2 - getPaddingLeft() - getPaddingRight();
        i4 = getChildCount();
        if (i4 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        h = null;
        j4 = 0;
        k4 = l3;
        l4 = k3;
        f1 = 0.0F;
_L11:
        View view1;
        v v2;
        int k8;
        int l8;
        boolean flag4;
        float f3;
        if (j4 >= i4)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = getChildAt(j4);
        v2 = (v)view1.getLayoutParams();
        if (view1.getVisibility() == 8)
        {
            v2.c = false;
            k8 = k4;
            f3 = f1;
            l8 = l4;
            flag4 = flag;
        } else
        {
label0:
            {
                if (v2.a <= 0.0F)
                {
                    break label0;
                }
                f1 += v2.a;
                if (v2.width != 0)
                {
                    break label0;
                }
                k8 = k4;
                f3 = f1;
                l8 = l4;
                flag4 = flag;
            }
        }
_L14:
        j4++;
        flag = flag4;
        l4 = l8;
        f1 = f3;
        k4 = k8;
        if (true) goto _L11; else goto _L10
_L6:
        if (k1 == 0)
        {
            k2 = i2;
            l2 = 300;
            i3 = j2;
            continue; /* Loop/switch isn't completed */
        }
          goto _L12
_L4:
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
        if (i2 == 0)
        {
            if (isInEditMode())
            {
                if (i2 == 0)
                {
                    k2 = 0x80000000;
                    l2 = l1;
                    i3 = 300;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
          goto _L12
_L9:
        k3 = i3 - getPaddingTop() - getPaddingBottom();
        j3 = k3;
          goto _L13
_L8:
        j3 = i3 - getPaddingTop() - getPaddingBottom();
        k3 = 0;
          goto _L13
        int i7 = v2.leftMargin + v2.rightMargin;
        int j7;
        int k7;
        int l7;
        int i8;
        int j8;
        boolean flag2;
        boolean flag3;
        float f2;
        if (v2.width == -2)
        {
            j7 = android.view.View.MeasureSpec.makeMeasureSpec(l3 - i7, 0x80000000);
        } else
        if (v2.width == -1)
        {
            j7 = android.view.View.MeasureSpec.makeMeasureSpec(l3 - i7, 0x40000000);
        } else
        {
            j7 = android.view.View.MeasureSpec.makeMeasureSpec(v2.width, 0x40000000);
        }
        if (v2.height == -2)
        {
            k7 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x80000000);
        } else
        if (v2.height == -1)
        {
            k7 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000);
        } else
        {
            k7 = android.view.View.MeasureSpec.makeMeasureSpec(v2.height, 0x40000000);
        }
        view1.measure(j7, k7);
        l7 = view1.getMeasuredWidth();
        i8 = view1.getMeasuredHeight();
        if (k2 == 0x80000000 && i8 > l4)
        {
            l4 = Math.min(i8, j3);
        }
        j8 = k4 - l7;
        if (j8 < 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        v2.b = flag2;
        flag3 = flag2 | flag;
        if (v2.b)
        {
            h = view1;
        }
        k8 = j8;
        l8 = l4;
        f2 = f1;
        flag4 = flag3;
        f3 = f2;
          goto _L14
_L10:
        if (flag || f1 > 0.0F)
        {
            int i5 = l3 - f;
            int j5 = 0;
            while (j5 < i4) 
            {
                View view = getChildAt(j5);
                if (view.getVisibility() != 8)
                {
                    v v1 = (v)view.getLayoutParams();
                    if (view.getVisibility() != 8)
                    {
                        boolean flag1;
                        int k5;
                        if (v1.width == 0 && v1.a > 0.0F)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag1)
                        {
                            k5 = 0;
                        } else
                        {
                            k5 = view.getMeasuredWidth();
                        }
                        if (flag && view != h)
                        {
                            if (v1.width < 0 && (k5 > i5 || v1.a > 0.0F))
                            {
                                int l6;
                                if (flag1)
                                {
                                    if (v1.height == -2)
                                    {
                                        l6 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x80000000);
                                    } else
                                    if (v1.height == -1)
                                    {
                                        l6 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000);
                                    } else
                                    {
                                        l6 = android.view.View.MeasureSpec.makeMeasureSpec(v1.height, 0x40000000);
                                    }
                                } else
                                {
                                    l6 = android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000);
                                }
                                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i5, 0x40000000), l6);
                            }
                        } else
                        if (v1.a > 0.0F)
                        {
                            int l5;
                            if (v1.width == 0)
                            {
                                if (v1.height == -2)
                                {
                                    l5 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x80000000);
                                } else
                                if (v1.height == -1)
                                {
                                    l5 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000);
                                } else
                                {
                                    l5 = android.view.View.MeasureSpec.makeMeasureSpec(v1.height, 0x40000000);
                                }
                            } else
                            {
                                l5 = android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000);
                            }
                            if (flag)
                            {
                                int j6 = l3 - (v1.leftMargin + v1.rightMargin);
                                int k6 = android.view.View.MeasureSpec.makeMeasureSpec(j6, 0x40000000);
                                if (k5 != j6)
                                {
                                    view.measure(k6, l5);
                                }
                            } else
                            {
                                int i6 = Math.max(0, k4);
                                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k5 + (int)((v1.a * (float)i6) / f1), 0x40000000), l5);
                            }
                        }
                    }
                }
                j5++;
            }
        }
        setMeasuredDimension(l2, l4 + getPaddingTop() + getPaddingBottom());
        g = flag;
        if (q.a() != 0 && !flag)
        {
            q.f();
        }
        return;
_L12:
        k2 = i2;
        l2 = l1;
        i3 = j2;
        if (true) goto _L16; else goto _L15
_L15:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (savedstate.a)
        {
            b();
        } else
        {
            c();
        }
        r = savedstate.a;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (e())
        {
            flag = d();
        } else
        {
            flag = r;
        }
        savedstate.a = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            s = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        if (!g)
        {
            flag = super.onTouchEvent(motionevent);
        } else
        {
            q.b(motionevent);
            int i1 = motionevent.getAction();
            flag = true;
            switch (i1 & 0xff)
            {
            default:
                return flag;

            case 0: // '\0'
                float f5 = motionevent.getX();
                float f6 = motionevent.getY();
                n = f5;
                o = f6;
                return flag;

            case 1: // '\001'
                break;
            }
            if (b(h))
            {
                float f1 = motionevent.getX();
                float f2 = motionevent.getY();
                float f3 = f1 - n;
                float f4 = f2 - o;
                int j1 = q.d();
                if (f3 * f3 + f4 * f4 < (float)(j1 * j1) && q.b(h, (int)f1, (int)f2))
                {
                    a(h, 0);
                    return flag;
                }
            }
        }
        return flag;
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && !g)
        {
            boolean flag;
            if (view == h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            r = flag;
        }
    }

    public void setCoveredFadeColor(int i1)
    {
        c = i1;
    }

    public void setPanelSlideListener(w w)
    {
        p = w;
    }

    public void setParallaxDistance(int i1)
    {
        m = i1;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable)
    {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable)
    {
        d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable)
    {
        e = drawable;
    }

    public void setShadowResource(int i1)
    {
        setShadowDrawable(getResources().getDrawable(i1));
    }

    public void setShadowResourceLeft(int i1)
    {
        setShadowDrawableLeft(getResources().getDrawable(i1));
    }

    public void setShadowResourceRight(int i1)
    {
        setShadowDrawableRight(getResources().getDrawable(i1));
    }

    public void setSliderFadeColor(int i1)
    {
        b = i1;
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 17)
        {
            a = new ab();
        } else
        if (i1 >= 16)
        {
            a = new android.support.v4.widget.aa();
        } else
        {
            a = new z();
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new x();
        boolean a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            int j1;
            if (a)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        SavedState(Parcel parcel, t t1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
