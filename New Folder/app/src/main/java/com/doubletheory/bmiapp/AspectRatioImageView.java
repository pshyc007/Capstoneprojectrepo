// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.doubletheory.bmiapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AspectRatioImageView extends ImageView
{

    public AspectRatioImageView(Context context)
    {
        super(context);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag = true;
        super.onMeasure(i, j);
        if (getDrawable() != null)
        {
            int k = android.view.View.MeasureSpec.getMode(i);
            int l = android.view.View.MeasureSpec.getMode(j);
            int i1 = getDrawable().getIntrinsicWidth();
            int j1 = getDrawable().getIntrinsicHeight();
            if (i1 <= 0)
            {
                i1 = ((flag) ? 1 : 0);
            }
            if (j1 <= 0)
            {
                j1 = ((flag) ? 1 : 0);
            }
            float f = (float)i1 / (float)j1;
            boolean flag1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            if (k != 0x40000000)
            {
                flag1 = flag;
            } else
            {
                flag1 = false;
            }
            if (l == 0x40000000)
            {
                flag = false;
            }
            k1 = getPaddingLeft();
            l1 = getPaddingRight();
            i2 = getPaddingTop();
            j2 = getPaddingBottom();
            k2 = getMeasuredWidth();
            l2 = getMeasuredHeight();
            if (flag1 && !flag)
            {
                setMeasuredDimension(l1 + (k1 + (int)(f * (float)(l2 - i2 - j2))), l2);
                return;
            }
            if (flag && !flag1)
            {
                setMeasuredDimension(k2, j2 + (i2 + (int)((float)(k2 - k1 - l1) / f)));
                return;
            }
        }
    }
}
