// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ki;
import com.google.android.gms.internal.kj;
import com.google.android.gms.internal.kk;
import com.google.android.gms.internal.kl;

// Referenced classes of package com.google.android.gms.common.images:
//            f

public abstract class e
{

    final f a;
    protected int b;
    protected int c;

    private Drawable a(Context context, kj kj1, int i)
    {
        Resources resources = context.getResources();
        if (c > 0)
        {
            kk kk1 = new kk(i, c);
            Drawable drawable = (Drawable)kj1.a(kk1);
            if (drawable == null)
            {
                drawable = resources.getDrawable(i);
                if ((1 & c) != 0)
                {
                    drawable = a(resources, drawable);
                }
                kj1.b(kk1, drawable);
            }
            return drawable;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return ki.a(resources, drawable);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        kl.a(bitmap);
        if ((1 & c) != 0)
        {
            bitmap = ki.a(bitmap);
        }
        a(((Drawable) (new BitmapDrawable(context.getResources(), bitmap))), flag, false, true);
    }

    void a(Context context, kj kj1, boolean flag)
    {
        int i = b;
        Drawable drawable = null;
        if (i != 0)
        {
            drawable = a(context, kj1, b);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);
}
