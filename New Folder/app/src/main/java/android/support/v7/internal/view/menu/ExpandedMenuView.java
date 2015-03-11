// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            p, w, n, r

public final class ExpandedMenuView extends ListView
    implements p, w, android.widget.AdapterView.OnItemClickListener
{

    private n a;
    private int b;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
    }

    public void a(n n1)
    {
        a = n1;
    }

    public boolean a(r r1)
    {
        return a.a(r1, 0);
    }

    public int getWindowAnimations()
    {
        return b;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a((r)getAdapter().getItem(i));
    }
}
