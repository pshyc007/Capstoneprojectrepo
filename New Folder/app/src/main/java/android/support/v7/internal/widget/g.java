// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.r;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, i

class g
    implements android.view.View.OnClickListener
{

    final ActionBarView a;

    g(ActionBarView actionbarview)
    {
        a = actionbarview;
        super();
    }

    public void onClick(View view)
    {
        r r1 = ActionBarView.b(a).b;
        if (r1 != null)
        {
            r1.collapseActionView();
        }
    }
}
