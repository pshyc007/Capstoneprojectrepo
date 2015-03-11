// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.a.c;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            p, ActionBarView, k

class f
    implements p
{

    final ActionBarView a;

    f(ActionBarView actionbarview)
    {
        a = actionbarview;
        super();
    }

    public void a(k k)
    {
    }

    public void a(k k, View view, int i, long l)
    {
        if (ActionBarView.a(a) != null)
        {
            ActionBarView.a(a).a(i, l);
        }
    }
}
