// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hq, hx, hz

public final class hw
{

    private final Context a;
    private String b;
    private final float c;
    private float d;
    private float e;
    private float f;
    private int g;

    public hw(Context context)
    {
        g = 0;
        a = context;
        c = context.getResources().getDisplayMetrics().density;
    }

    public hw(Context context, String s)
    {
        this(context);
        b = s;
    }

    static Context a(hw hw1)
    {
        return hw1.a;
    }

    private void a()
    {
        String s;
        if (!TextUtils.isEmpty(b))
        {
            android.net.Uri uri = (new android.net.Uri.Builder()).encodedQuery(b).build();
            StringBuilder stringbuilder = new StringBuilder();
            Map map = hq.a(uri);
            String s1;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); stringbuilder.append(s1).append(" = ").append((String)map.get(s1)).append("\n\n"))
            {
                s1 = (String)iterator.next();
            }

            s = stringbuilder.toString().trim();
            android.app.AlertDialog.Builder builder;
            if (TextUtils.isEmpty(s))
            {
                s = "No debug information";
            }
        } else
        {
            s = "No debug information";
        }
        builder = new android.app.AlertDialog.Builder(a);
        builder.setMessage(s);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new hx(this, s));
        builder.setNegativeButton("Close", new hz(this));
        builder.create().show();
    }

    private void a(int i, float f1, float f2)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        g = 0;
        d = f1;
        e = f2;
        f = f2;
_L4:
        return;
_L2:
        if (g == -1) goto _L4; else goto _L3
_L3:
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f2 <= e) goto _L6; else goto _L5
_L5:
        e = f2;
_L8:
        if (e - f > 30F * c)
        {
            g = -1;
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (f2 < f)
        {
            f = f2;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (g == 0 || g == 2)
        {
            if (f1 - d >= 50F * c)
            {
                d = f1;
                g = 1 + g;
            }
        } else
        if ((g == 1 || g == 3) && f1 - d <= -50F * c)
        {
            d = f1;
            g = 1 + g;
        }
        if (g != 1 && g != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 <= d) goto _L4; else goto _L9
_L9:
        d = f1;
        return;
        if (g != 2 || f1 >= d) goto _L4; else goto _L10
_L10:
        d = f1;
        return;
        if (i != 1 || g != 4) goto _L4; else goto _L11
_L11:
        a();
        return;
    }

    public void a(MotionEvent motionevent)
    {
        int i = motionevent.getHistorySize();
        for (int j = 0; j < i; j++)
        {
            a(motionevent.getActionMasked(), motionevent.getHistoricalX(0, j), motionevent.getHistoricalY(0, j));
        }

        a(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
    }

    public void a(String s)
    {
        b = s;
    }
}
