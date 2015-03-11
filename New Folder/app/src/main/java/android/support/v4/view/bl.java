// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            bf

class bl
    implements Comparator
{

    bl()
    {
    }

    public int a(View view, View view1)
    {
        bf bf1 = (bf)view.getLayoutParams();
        bf bf2 = (bf)view1.getLayoutParams();
        if (bf1.a != bf2.a)
        {
            return !bf1.a ? -1 : 1;
        } else
        {
            return bf1.e - bf2.e;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((View)obj, (View)obj1);
    }
}
