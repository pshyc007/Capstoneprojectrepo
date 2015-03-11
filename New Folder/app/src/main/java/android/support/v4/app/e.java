// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            k, Fragment

class e
    implements k
{

    final Fragment a;

    e(Fragment fragment)
    {
        a = fragment;
        super();
    }

    public View a(int i)
    {
        if (a.I == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return a.I.findViewById(i);
        }
    }
}
