// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            t, u

class aa
    implements android.view.View.OnTouchListener
{

    final t a;

    private aa(t t1)
    {
        a = t1;
        super();
    }

    aa(t t1, u u)
    {
        this(t1);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getAction();
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (i != 0 || t.b(a) == null || !t.b(a).isShowing() || j < 0 || j >= t.b(a).getWidth() || k < 0 || k >= t.b(a).getHeight()) goto _L2; else goto _L1
_L1:
        t.d(a).postDelayed(t.c(a), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            t.d(a).removeCallbacks(t.c(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
