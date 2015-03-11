// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            v, y, n, ActionMenuPresenter

class g
    implements v
{

    final ActionMenuPresenter a;

    public void a(n n1, boolean flag)
    {
        if (n1 instanceof y)
        {
            ((y)n1).o().a(false);
        }
    }

    public boolean a(n n1)
    {
        if (n1 == null)
        {
            return false;
        } else
        {
            a.b = ((y)n1).getItem().getItemId();
            return false;
        }
    }
}
