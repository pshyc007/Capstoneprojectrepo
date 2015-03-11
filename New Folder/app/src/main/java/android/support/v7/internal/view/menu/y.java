// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            n, r

public class y extends n
    implements SubMenu
{

    private n d;
    private r e;

    public y(Context context, n n1, r r1)
    {
        super(context);
        d = n1;
        e = r1;
    }

    public boolean a()
    {
        return d.a();
    }

    public boolean a(n n1, MenuItem menuitem)
    {
        return super.a(n1, menuitem) || d.a(n1, menuitem);
    }

    public boolean b()
    {
        return d.b();
    }

    public boolean c(r r1)
    {
        return d.c(r1);
    }

    public void clearHeader()
    {
    }

    public boolean d(r r1)
    {
        return d.d(r1);
    }

    public MenuItem getItem()
    {
        return e;
    }

    public n o()
    {
        return d;
    }

    public Menu r()
    {
        return d;
    }

    public SubMenu setHeaderIcon(int i)
    {
        super.a(d().getResources().getDrawable(i));
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        super.a(d().getResources().getString(i));
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.a(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        super.a(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean flag)
    {
        d.setQwertyMode(flag);
    }
}
