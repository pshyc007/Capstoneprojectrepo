// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.internal.widget:
//            n, k

class o
    implements android.widget.AdapterView.OnItemClickListener
{

    final k a;
    private final n b;

    public o(k k, n n1)
    {
        a = k;
        super();
        b = n1;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.a(a, view, i, l);
    }
}
