// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.b.g;
import android.support.v7.b.i;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            v, n, l, r

public class q
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, v
{

    private n a;
    l b;
    private AlertDialog c;
    private v d;

    public q(n n1)
    {
        a = n1;
    }

    public void a()
    {
        if (c != null)
        {
            c.dismiss();
        }
    }

    public void a(IBinder ibinder)
    {
        n n1 = a;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(n1.d());
        b = new l(g.abc_list_menu_item_layout, i.Theme_AppCompat_CompactMenu_Dialog);
        b.a(this);
        a.a(b);
        builder.setAdapter(b.a(), this);
        View view = n1.n();
        android.view.WindowManager.LayoutParams layoutparams;
        if (view != null)
        {
            builder.setCustomTitle(view);
        } else
        {
            builder.setIcon(n1.m()).setTitle(n1.l());
        }
        builder.setOnKeyListener(this);
        c = builder.create();
        c.setOnDismissListener(this);
        layoutparams = c.getWindow().getAttributes();
        layoutparams.type = 1003;
        if (ibinder != null)
        {
            layoutparams.token = ibinder;
        }
        layoutparams.flags = 0x20000 | layoutparams.flags;
        c.show();
    }

    public void a(n n1, boolean flag)
    {
        if (flag || n1 == a)
        {
            a();
        }
        if (d != null)
        {
            d.a(n1, flag);
        }
    }

    public boolean a(n n1)
    {
        if (d != null)
        {
            return d.a(n1);
        } else
        {
            return false;
        }
    }

    public void onClick(DialogInterface dialoginterface, int j)
    {
        a.a((r)b.a().getItem(j), 0);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        b.a(a, true);
    }

    public boolean onKey(DialogInterface dialoginterface, int j, KeyEvent keyevent)
    {
        if (j == 82 || j == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                Window window1 = c.getWindow();
                if (window1 != null)
                {
                    View view1 = window1.getDecorView();
                    if (view1 != null)
                    {
                        android.view.KeyEvent.DispatcherState dispatcherstate1 = view1.getKeyDispatcherState();
                        if (dispatcherstate1 != null)
                        {
                            dispatcherstate1.startTracking(keyevent, this);
                            return true;
                        }
                    }
                }
            } else
            if (keyevent.getAction() == 1 && !keyevent.isCanceled())
            {
                Window window = c.getWindow();
                if (window != null)
                {
                    View view = window.getDecorView();
                    if (view != null)
                    {
                        android.view.KeyEvent.DispatcherState dispatcherstate = view.getKeyDispatcherState();
                        if (dispatcherstate != null && dispatcherstate.isTracking(keyevent))
                        {
                            a.a(true);
                            dialoginterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return a.performShortcut(j, keyevent, 0);
    }
}
