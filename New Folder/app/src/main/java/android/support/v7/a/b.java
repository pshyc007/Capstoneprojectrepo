// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.j;
import android.util.AttributeSet;

public class b extends android.view.ViewGroup.MarginLayoutParams
{

    public int a;

    public b(int i)
    {
        this(-2, -1, i);
    }

    public b(int i, int k, int l)
    {
        super(i, k);
        a = -1;
        a = l;
    }

    public b(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.ActionBarLayout);
        a = typedarray.getInt(0, -1);
        typedarray.recycle();
    }
}
