// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.b.c;
import android.support.v7.b.j;
import android.support.v7.internal.widget.r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i, x, b, r, 
//            p

public class ActionMenuItemView extends r
    implements i, x, android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private android.support.v7.internal.view.menu.r a;
    private CharSequence b;
    private Drawable c;
    private p d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;

    public ActionMenuItemView(Context context)
    {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        e = context.getResources().getBoolean(c.abc_config_allowActionMenuItemTextWithIcon);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.ActionMenuItemView, 0, 0);
        g = typedarray.getDimensionPixelSize(0, 0);
        typedarray.recycle();
        setOnClickListener(this);
        setOnLongClickListener(this);
        setTransformationMethod(new b(this));
        h = -1;
    }

    private void e()
    {
        CharSequence charsequence;
label0:
        {
            boolean flag;
            boolean flag1;
            if (!TextUtils.isEmpty(b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (c != null)
            {
                boolean flag2 = a.l();
                flag1 = false;
                if (!flag2)
                {
                    break label0;
                }
                if (!e)
                {
                    boolean flag3 = f;
                    flag1 = false;
                    if (!flag3)
                    {
                        break label0;
                    }
                }
            }
            flag1 = true;
        }
        if (flag & flag1)
        {
            charsequence = b;
        } else
        {
            charsequence = null;
        }
        setText(charsequence);
    }

    public void a(android.support.v7.internal.view.menu.r r1, int k)
    {
        a = r1;
        setIcon(r1.getIcon());
        setTitle(r1.a(this));
        setId(r1.getItemId());
        int l;
        if (r1.isVisible())
        {
            l = 0;
        } else
        {
            l = 8;
        }
        setVisibility(l);
        setEnabled(r1.isEnabled());
    }

    public boolean a()
    {
        return true;
    }

    public boolean b()
    {
        return !TextUtils.isEmpty(getText());
    }

    public boolean c()
    {
        return b() && a.getIcon() == null;
    }

    public boolean d()
    {
        return b();
    }

    public android.support.v7.internal.view.menu.r getItemData()
    {
        return a;
    }

    public void onClick(View view)
    {
        if (d != null)
        {
            d.a(a);
        }
    }

    public boolean onLongClick(View view)
    {
        if (b())
        {
            return false;
        }
        int ai[] = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(ai);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int k = getWidth();
        int l = getHeight();
        int i1 = ai[1] + l / 2;
        int j1 = context.getResources().getDisplayMetrics().widthPixels;
        Toast toast = Toast.makeText(context, a.getTitle(), 0);
        if (i1 < rect.height())
        {
            toast.setGravity(53, j1 - ai[0] - k / 2, l);
        } else
        {
            toast.setGravity(81, 0, l);
        }
        toast.show();
        return true;
    }

    protected void onMeasure(int k, int l)
    {
        boolean flag = b();
        if (flag && h >= 0)
        {
            super.setPadding(h, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(k, l);
        int i1 = android.view.View.MeasureSpec.getMode(k);
        int j1 = android.view.View.MeasureSpec.getSize(k);
        int k1 = getMeasuredWidth();
        int l1;
        if (i1 == 0x80000000)
        {
            l1 = Math.min(j1, g);
        } else
        {
            l1 = g;
        }
        if (i1 != 0x40000000 && g > 0 && k1 < l1)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), l);
        }
        if (!flag && c != null)
        {
            super.setPadding((getMeasuredWidth() - c.getIntrinsicWidth()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setCheckable(boolean flag)
    {
    }

    public void setChecked(boolean flag)
    {
    }

    public void setExpandedFormat(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            if (a != null)
            {
                a.g();
            }
        }
    }

    public void setIcon(Drawable drawable)
    {
        c = drawable;
        setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(p p1)
    {
        d = p1;
    }

    public void setPadding(int k, int l, int i1, int j1)
    {
        h = k;
        super.setPadding(k, l, i1, j1);
    }

    public void setTitle(CharSequence charsequence)
    {
        b = charsequence;
        setContentDescription(b);
        e();
    }
}
