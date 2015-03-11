// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.b.b;
import android.support.v7.b.c;
import android.support.v7.b.d;
import android.support.v7.b.f;
import android.support.v7.b.j;
import android.util.DisplayMetrics;

public class a
{

    private Context a;

    private a(Context context)
    {
        a = context;
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public int a()
    {
        return a.getResources().getInteger(f.abc_max_action_buttons);
    }

    public boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public int c()
    {
        return a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean d()
    {
        return a.getResources().getBoolean(c.abc_action_bar_embed_tabs_pre_jb);
    }

    public int e()
    {
        TypedArray typedarray = a.obtainStyledAttributes(null, j.ActionBar, b.actionBarStyle, 0);
        int i = typedarray.getLayoutDimension(0, 0);
        Resources resources = a.getResources();
        if (!d())
        {
            i = Math.min(i, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        typedarray.recycle();
        return i;
    }

    public int f()
    {
        return a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
    }
}
