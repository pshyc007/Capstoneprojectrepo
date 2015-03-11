// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, if, ig, ii, 
//            db, di

public final class bg
    implements bb
{

    public bg()
    {
    }

    private static int a(DisplayMetrics displaymetrics, Map map, String s, int i)
    {
        String s1 = (String)map.get(s);
        if (s1 != null)
        {
            int j;
            try
            {
                j = com.google.android.gms.internal.if.a(displaymetrics, Integer.parseInt(s1));
            }
            catch (NumberFormatException numberformatexception)
            {
                ig.e((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(s1).toString());
                return i;
            }
            i = j;
        }
        return i;
    }

    public void a(ii ii1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            ig.e("Action missing from video GMSG.");
            return;
        }
        db db1 = ii1.d();
        if (db1 == null)
        {
            ig.e("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            DisplayMetrics displaymetrics = ii1.getContext().getResources().getDisplayMetrics();
            int i = a(displaymetrics, map, "x", 0);
            int j = a(displaymetrics, map, "y", 0);
            int k = a(displaymetrics, map, "w", -1);
            int l = a(displaymetrics, map, "h", -1);
            if (flag && db1.b() == null)
            {
                db1.b(i, j, k, l);
                return;
            } else
            {
                db1.a(i, j, k, l);
                return;
            }
        }
        di di1 = db1.b();
        if (di1 == null)
        {
            di.a(ii1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            DisplayMetrics displaymetrics1 = ii1.getContext().getResources().getDisplayMetrics();
            int i1 = a(displaymetrics1, map, "x", 0);
            int j1 = a(displaymetrics1, map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 0, i1, j1, 0);
            di1.a(motionevent);
            motionevent.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            String s2 = (String)map.get("enabled");
            if (s2 == null)
            {
                ig.e("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                di1.a(Boolean.parseBoolean(s2));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            String s1 = (String)map.get("time");
            if (s1 == null)
            {
                ig.e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                di1.a((int)(1000F * Float.parseFloat(s1)));
                return;
            }
            catch (NumberFormatException numberformatexception)
            {
                ig.e((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(s1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            di1.setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            di1.b();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            di1.c();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            di1.d();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            di1.setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            di1.a((String)map.get("src"));
            return;
        } else
        {
            ig.e((new StringBuilder()).append("Unknown video action: ").append(s).toString());
            return;
        }
    }
}
