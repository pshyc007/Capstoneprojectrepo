// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ap, aj, ak

class al
    implements android.content.DialogInterface.OnClickListener, ap
{

    final aj a;
    private AlertDialog b;
    private ListAdapter c;
    private CharSequence d;

    private al(aj aj1)
    {
        a = aj1;
        super();
    }

    al(aj aj1, ak ak)
    {
        this(aj1);
    }

    public void a(ListAdapter listadapter)
    {
        c = listadapter;
    }

    public void a(CharSequence charsequence)
    {
        d = charsequence;
    }

    public void c()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a.getContext());
        if (d != null)
        {
            builder.setTitle(d);
        }
        b = builder.setSingleChoiceItems(c, a.f(), this).show();
    }

    public void d()
    {
        b.dismiss();
        b = null;
    }

    public boolean f()
    {
        if (b != null)
        {
            return b.isShowing();
        } else
        {
            return false;
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(i);
        if (a.t != null)
        {
            a.a(null, i, c.getItemId(i));
        }
        d();
    }
}
