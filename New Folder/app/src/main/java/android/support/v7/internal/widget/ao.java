// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            n, an, aj, k

class ao
    implements n
{

    final aj a;
    final an b;

    ao(an an1, aj aj1)
    {
        b = an1;
        a = aj1;
        super();
    }

    public void a(k k, View view, int i, long l)
    {
        b.b.a(i);
        if (b.b.t != null)
        {
            b.b.a(view, i, an.a(b).getItemId(i));
        }
        b.d();
    }
}
