// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.internal.widget:
//            t, w

class v
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final t a;

    v(t t1)
    {
        a = t1;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i != -1)
        {
            w w1 = t.a(a);
            if (w1 != null)
            {
                w.a(w1, false);
            }
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }
}
