// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.gms.internal:
//            if

public final class dl extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final Activity a;
    private final ImageButton b;

    public dl(Activity activity, int i)
    {
        super(activity);
        a = activity;
        setOnClickListener(this);
        b = new ImageButton(activity);
        b.setImageResource(0x1080017);
        b.setBackgroundColor(0);
        b.setOnClickListener(this);
        b.setPadding(0, 0, 0, 0);
        int j = com.google.android.gms.internal.if.a(activity, i);
        addView(b, new android.widget.FrameLayout.LayoutParams(j, j, 17));
    }

    public void a(boolean flag)
    {
        ImageButton imagebutton = b;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        imagebutton.setVisibility(byte0);
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
