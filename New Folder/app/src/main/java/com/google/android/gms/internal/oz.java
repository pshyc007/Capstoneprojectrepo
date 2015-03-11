// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

// Referenced classes of package com.google.android.gms.internal:
//            hw

final class oz extends ViewSwitcher
{

    private final hw a;

    public oz(Context context)
    {
        super(context);
        a = new hw(context);
    }

    static hw a(oz oz1)
    {
        return oz1.a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.a(motionevent);
        return false;
    }
}
