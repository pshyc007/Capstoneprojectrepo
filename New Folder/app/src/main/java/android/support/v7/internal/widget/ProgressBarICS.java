// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v7.internal.widget:
//            ae

public class ProgressBarICS extends View
{

    private static final int f[] = {
        0x1010136, 0x1010137, 0x1010138, 0x1010139, 0x101013a, 0x101013b, 0x101013c, 0x101013d, 0x101013e, 0x101013f, 
        0x101011f, 0x1010140, 0x1010120, 0x1010141
    };
    int a;
    int b;
    int c;
    int d;
    Bitmap e;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private Transformation n;
    private AlphaAnimation o;
    private Drawable p;
    private Drawable q;
    private Drawable r;
    private boolean s;
    private Interpolator t;
    private ae u;
    private long v;
    private boolean w;
    private long x;
    private boolean y;

    public ProgressBarICS(Context context, AttributeSet attributeset, int i1, int j1)
    {
        boolean flag1;
label0:
        {
            super(context, attributeset, i1);
            v = Thread.currentThread().getId();
            c();
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, f, i1, j1);
            s = true;
            setMax(typedarray.getInt(0, i));
            setProgress(typedarray.getInt(1, g));
            setSecondaryProgress(typedarray.getInt(2, h));
            boolean flag = typedarray.getBoolean(3, l);
            m = typedarray.getBoolean(4, m);
            Drawable drawable = typedarray.getDrawable(5);
            if (drawable != null)
            {
                setIndeterminateDrawable(a(drawable));
            }
            Drawable drawable1 = typedarray.getDrawable(6);
            if (drawable1 != null)
            {
                setProgressDrawable(a(drawable1, false));
            }
            k = typedarray.getInt(7, k);
            j = typedarray.getInt(8, j);
            a = typedarray.getDimensionPixelSize(9, a);
            b = typedarray.getDimensionPixelSize(10, b);
            c = typedarray.getDimensionPixelSize(11, c);
            d = typedarray.getDimensionPixelSize(12, d);
            int k1 = typedarray.getResourceId(13, 0x10a000b);
            if (k1 > 0)
            {
                a(context, k1);
            }
            typedarray.recycle();
            s = false;
            if (!m)
            {
                flag1 = false;
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        setIndeterminate(flag1);
    }

    private Drawable a(Drawable drawable)
    {
        if (drawable instanceof AnimationDrawable)
        {
            AnimationDrawable animationdrawable = (AnimationDrawable)drawable;
            int i1 = animationdrawable.getNumberOfFrames();
            AnimationDrawable animationdrawable1 = new AnimationDrawable();
            animationdrawable1.setOneShot(animationdrawable.isOneShot());
            for (int j1 = 0; j1 < i1; j1++)
            {
                Drawable drawable1 = a(animationdrawable.getFrame(j1), true);
                drawable1.setLevel(10000);
                animationdrawable1.addFrame(drawable1, animationdrawable.getDuration(j1));
            }

            animationdrawable1.setLevel(10000);
            drawable = animationdrawable1;
        }
        return drawable;
    }

    private Drawable a(Drawable drawable, boolean flag)
    {
label0:
        {
            ShapeDrawable shapedrawable;
label1:
            {
                int i1 = 0;
                Object obj;
                if (drawable instanceof LayerDrawable)
                {
                    LayerDrawable layerdrawable = (LayerDrawable)drawable;
                    int j1 = layerdrawable.getNumberOfLayers();
                    Drawable adrawable[] = new Drawable[j1];
                    int k1 = 0;
                    while (k1 < j1) 
                    {
                        int l1 = layerdrawable.getId(k1);
                        Drawable drawable1 = layerdrawable.getDrawable(k1);
                        boolean flag1;
                        if (l1 == 0x102000d || l1 == 0x102000f)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        adrawable[k1] = a(drawable1, flag1);
                        k1++;
                    }
                    obj = new LayerDrawable(adrawable);
                    for (; i1 < j1; i1++)
                    {
                        ((LayerDrawable) (obj)).setId(i1, layerdrawable.getId(i1));
                    }

                } else
                {
                    if (!(drawable instanceof BitmapDrawable))
                    {
                        break label0;
                    }
                    Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();
                    if (e == null)
                    {
                        e = bitmap;
                    }
                    shapedrawable = new ShapeDrawable(getDrawableShape());
                    BitmapShader bitmapshader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
                    shapedrawable.getPaint().setShader(bitmapshader);
                    if (!flag)
                    {
                        break label1;
                    }
                    obj = new ClipDrawable(shapedrawable, 3, 1);
                }
                return ((Drawable) (obj));
            }
            return shapedrawable;
        }
        return drawable;
    }

    static ae a(ProgressBarICS progressbarics, ae ae1)
    {
        progressbarics.u = ae1;
        return ae1;
    }

    private void a(int i1, int j1)
    {
        int k1;
        int l1;
        k1 = i1 - getPaddingRight() - getPaddingLeft();
        l1 = j1 - getPaddingBottom() - getPaddingTop();
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        if (!m || (p instanceof AnimationDrawable)) goto _L2; else goto _L1
_L1:
        float f1;
        float f2;
        int i3 = p.getIntrinsicWidth();
        int j3 = p.getIntrinsicHeight();
        f1 = (float)i3 / (float)j3;
        f2 = (float)i1 / (float)j1;
        if (f1 == f2) goto _L2; else goto _L3
_L3:
        int i2;
        int j2;
        int k2;
        int l2;
        if (f2 > f1)
        {
            int j4 = (int)(f1 * (float)j1);
            k2 = (i1 - j4) / 2;
            i2 = j4 + k2;
            j2 = l1;
            l2 = 0;
        } else
        {
            int k3 = (int)((float)i1 * (1.0F / f1));
            int l3 = (j1 - k3) / 2;
            int i4 = k3 + l3;
            i2 = k1;
            j2 = i4;
            l2 = l3;
            k2 = 0;
        }
_L4:
        p.setBounds(k2, l2, i2, j2);
_L5:
        if (q != null)
        {
            q.setBounds(0, 0, i2, j2);
        }
        return;
_L2:
        i2 = k1;
        j2 = l1;
        k2 = 0;
        l2 = 0;
          goto _L4
        i2 = k1;
        j2 = l1;
          goto _L5
    }

    private void a(int i1, int j1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (v != Thread.currentThread().getId()) goto _L2; else goto _L1
_L1:
        a(i1, j1, flag, true);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ae ae1;
        if (u == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ae1 = u;
        u = null;
        ae1.a(i1, j1, flag);
_L5:
        post(ae1);
        if (true) goto _L4; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        ae1 = new ae(this, i1, j1, flag);
          goto _L5
    }

    private void a(int i1, int j1, boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (i <= 0) goto _L2; else goto _L1
_L1:
        float f1 = (float)j1 / (float)i;
_L5:
        Drawable drawable = r;
        if (drawable == null) goto _L4; else goto _L3
_L3:
        boolean flag2 = drawable instanceof LayerDrawable;
        Drawable drawable1;
        drawable1 = null;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        drawable1 = ((LayerDrawable)drawable).findDrawableByLayerId(i1);
        break MISSING_BLOCK_LABEL_90;
_L7:
        int k1;
        drawable.setLevel(k1);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f1 = 0.0F;
          goto _L5
_L4:
        invalidate();
          goto _L6
        Exception exception;
        exception;
        throw exception;
        k1 = (int)(f1 * 10000F);
        if (drawable1 != null)
        {
            drawable = drawable1;
        }
          goto _L7
    }

    static void a(ProgressBarICS progressbarics, int i1, int j1, boolean flag, boolean flag1)
    {
        progressbarics.a(i1, j1, flag, flag1);
    }

    private void c()
    {
        i = 100;
        g = 0;
        h = 0;
        l = false;
        m = false;
        k = 4000;
        j = 1;
        a = 24;
        b = 48;
        c = 24;
        d = 48;
    }

    private void d()
    {
        int ai[] = getDrawableState();
        if (q != null && q.isStateful())
        {
            q.setState(ai);
        }
        if (p != null && p.isStateful())
        {
            p.setState(ai);
        }
    }

    void a()
    {
        if (getVisibility() != 0)
        {
            return;
        }
        if (p instanceof Animatable)
        {
            w = true;
            o = null;
        } else
        {
            if (t == null)
            {
                t = new LinearInterpolator();
            }
            n = new Transformation();
            o = new AlphaAnimation(0.0F, 1.0F);
            o.setRepeatMode(j);
            o.setRepeatCount(-1);
            o.setDuration(k);
            o.setInterpolator(t);
            o.setStartTime(-1L);
        }
        postInvalidate();
    }

    void a(int i1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = l;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Exception exception;
        int j1;
        if (i1 < 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
        }
        if (j1 > i)
        {
            j1 = i;
        }
        if (j1 != g)
        {
            g = j1;
            a(0x102000d, g, flag);
        }
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public void a(Context context, int i1)
    {
        setInterpolator(AnimationUtils.loadInterpolator(context, i1));
    }

    void b()
    {
        o = null;
        n = null;
        if (p instanceof Animatable)
        {
            ((Animatable)p).stop();
            w = false;
        }
        postInvalidate();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        d();
    }

    Shape getDrawableShape()
    {
        return new RoundRectShape(new float[] {
            5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
        }, null, null);
    }

    public Drawable getIndeterminateDrawable()
    {
        return p;
    }

    public Interpolator getInterpolator()
    {
        return t;
    }

    public int getMax()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = i;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public int getProgress()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i1;
_L2:
        i1 = g;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public Drawable getProgressDrawable()
    {
        return q;
    }

    public int getSecondaryProgress()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i1;
_L2:
        i1 = h;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void invalidateDrawable(Drawable drawable)
    {
label0:
        {
            if (!y)
            {
                if (!verifyDrawable(drawable))
                {
                    break label0;
                }
                Rect rect = drawable.getBounds();
                int i1 = getScrollX() + getPaddingLeft();
                int j1 = getScrollY() + getPaddingTop();
                invalidate(i1 + rect.left, j1 + rect.top, i1 + rect.right, j1 + rect.bottom);
            }
            return;
        }
        super.invalidateDrawable(drawable);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (l)
        {
            a();
        }
    }

    protected void onDetachedFromWindow()
    {
        if (l)
        {
            b();
        }
        if (u != null)
        {
            removeCallbacks(u);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        Drawable drawable;
        super.onDraw(canvas);
        drawable = r;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        float f1;
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        long l1 = getDrawingTime();
        if (o == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        o.getTransformation(l1, n);
        f1 = n.getAlpha();
        y = true;
        drawable.setLevel((int)(f1 * 10000F));
        y = false;
        if (SystemClock.uptimeMillis() - x >= 200L)
        {
            x = SystemClock.uptimeMillis();
            postInvalidateDelayed(200L);
        }
        drawable.draw(canvas);
        canvas.restore();
        if (w && (drawable instanceof Animatable))
        {
            ((Animatable)drawable).start();
            w = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        y = false;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onMeasure(int i1, int j1)
    {
        this;
        JVM INSTR monitorenter ;
        Drawable drawable = r;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        int k1;
        int l1;
        k1 = Math.max(a, Math.min(b, drawable.getIntrinsicWidth()));
        l1 = Math.max(c, Math.min(d, drawable.getIntrinsicHeight()));
_L1:
        d();
        int i2 = k1 + (getPaddingLeft() + getPaddingRight());
        int j2 = l1 + (getPaddingTop() + getPaddingBottom());
        setMeasuredDimension(resolveSize(i2, i1), resolveSize(j2, j1));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
        l1 = 0;
        k1 = 0;
          goto _L1
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        setProgress(savedstate.a);
        setSecondaryProgress(savedstate.b);
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = g;
        savedstate.b = h;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        a(i1, j1);
    }

    protected void onVisibilityChanged(View view, int i1)
    {
label0:
        {
            super.onVisibilityChanged(view, i1);
            if (l)
            {
                if (i1 != 8 && i1 != 4)
                {
                    break label0;
                }
                b();
            }
            return;
        }
        a();
    }

    public void postInvalidate()
    {
        if (!s)
        {
            super.postInvalidate();
        }
    }

    public void setIndeterminate(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (m && l || flag == l) goto _L2; else goto _L1
_L1:
        l = flag;
        if (!flag) goto _L4; else goto _L3
_L3:
        r = p;
        a();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        r = q;
        b();
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public void setIndeterminateDrawable(Drawable drawable)
    {
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        p = drawable;
        if (l)
        {
            r = drawable;
            postInvalidate();
        }
    }

    public void setInterpolator(Interpolator interpolator)
    {
        t = interpolator;
    }

    public void setMax(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (i1 < 0)
        {
            i1 = 0;
        }
        if (i1 != i)
        {
            i = i1;
            postInvalidate();
            if (g > i1)
            {
                g = i1;
            }
            a(0x102000d, g, false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgress(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        a(i1, false);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgressDrawable(Drawable drawable)
    {
        boolean flag;
        if (q != null && drawable != q)
        {
            q.setCallback(null);
            flag = true;
        } else
        {
            flag = false;
        }
        if (drawable != null)
        {
            drawable.setCallback(this);
            int i1 = drawable.getMinimumHeight();
            if (d < i1)
            {
                d = i1;
                requestLayout();
            }
        }
        q = drawable;
        if (!l)
        {
            r = drawable;
            postInvalidate();
        }
        if (flag)
        {
            a(getWidth(), getHeight());
            d();
            a(0x102000d, g, false, false);
            a(0x102000f, h, false, false);
        }
    }

    public void setSecondaryProgress(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j1 = 0;
        Exception exception;
        if (i1 >= 0)
        {
            j1 = i1;
        }
        if (j1 > i)
        {
            j1 = i;
        }
        if (j1 != h)
        {
            h = j1;
            a(0x102000f, h, false);
        }
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public void setVisibility(int i1)
    {
label0:
        {
            if (getVisibility() != i1)
            {
                super.setVisibility(i1);
                if (l)
                {
                    if (i1 != 8 && i1 != 4)
                    {
                        break label0;
                    }
                    b();
                }
            }
            return;
        }
        a();
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == q || drawable == p || super.verifyDrawable(drawable);
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new af();
        int a;
        int b;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            parcel.writeInt(b);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
            b = parcel.readInt();
        }

        SavedState(Parcel parcel, ad ad)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
