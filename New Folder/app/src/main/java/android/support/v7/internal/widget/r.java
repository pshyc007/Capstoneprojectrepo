// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            s

public class r extends TextView
{

    public r(Context context)
    {
        this(context, null);
    }

    public r(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public r(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.CompatTextView, i, 0);
        boolean flag = typedarray.getBoolean(0, false);
        typedarray.recycle();
        if (flag)
        {
            setTransformationMethod(new s(context));
        }
    }
}
