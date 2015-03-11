// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            s, ActionMenuPresenter, n

class f extends s
{

    final ActionMenuPresenter a;

    public f(ActionMenuPresenter actionmenupresenter, Context context, n n1, View view, boolean flag)
    {
        a = actionmenupresenter;
        super(context, n1, view, flag);
        a(actionmenupresenter.a);
    }

    public void onDismiss()
    {
        super.onDismiss();
        a.e.close();
        ActionMenuPresenter.a(a, null);
    }
}
