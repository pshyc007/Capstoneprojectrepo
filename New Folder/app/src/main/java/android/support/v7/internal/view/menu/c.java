// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;

// Referenced classes of package android.support.v7.internal.view.menu:
//            q, ActionMenuPresenter, y

class c extends q
{

    final ActionMenuPresenter a;

    public c(ActionMenuPresenter actionmenupresenter, y y)
    {
        a = actionmenupresenter;
        super(y);
        actionmenupresenter.a(actionmenupresenter.a);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        ActionMenuPresenter.a(a, null);
        a.b = 0;
    }
}
