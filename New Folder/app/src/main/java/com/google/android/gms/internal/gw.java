// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ig, hq, du

public final class gw
{

    private String a;
    private String b;
    private String c;
    private List d;
    private String e;
    private String f;
    private List g;
    private long h;
    private boolean i;
    private final long j = -1L;
    private List k;
    private long l;
    private int m;

    public gw()
    {
        h = -1L;
        i = false;
        l = -1L;
        m = -1;
    }

    private static String a(Map map, String s)
    {
        List list = (List)map.get(s);
        if (list != null && !list.isEmpty())
        {
            return (String)list.get(0);
        } else
        {
            return null;
        }
    }

    private static long b(Map map, String s)
    {
        String s1;
        List list = (List)map.get(s);
        if (list == null || list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        s1 = (String)list.get(0);
        float f1 = Float.parseFloat(s1);
        return (long)(f1 * 1000F);
        NumberFormatException numberformatexception;
        numberformatexception;
        ig.e((new StringBuilder()).append("Could not parse float from ").append(s).append(" header: ").append(s1).toString());
        return -1L;
    }

    private void b(Map map)
    {
        a = a(map, "X-Afma-Ad-Size");
    }

    private static List c(Map map, String s)
    {
        List list = (List)map.get(s);
        if (list != null && !list.isEmpty())
        {
            String s1 = (String)list.get(0);
            if (s1 != null)
            {
                return Arrays.asList(s1.trim().split("\\s+"));
            }
        }
        return null;
    }

    private void c(Map map)
    {
        List list = c(map, "X-Afma-Click-Tracking-Urls");
        if (list != null)
        {
            d = list;
        }
    }

    private void d(Map map)
    {
        List list = (List)map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty())
        {
            e = (String)list.get(0);
        }
    }

    private void e(Map map)
    {
        List list = c(map, "X-Afma-Tracking-Urls");
        if (list != null)
        {
            g = list;
        }
    }

    private void f(Map map)
    {
        long l1 = b(map, "X-Afma-Interstitial-Timeout");
        if (l1 != -1L)
        {
            h = l1;
        }
    }

    private void g(Map map)
    {
        f = a(map, "X-Afma-ActiveView");
    }

    private void h(Map map)
    {
        List list = (List)map.get("X-Afma-Mediation");
        if (list != null && !list.isEmpty())
        {
            i = Boolean.valueOf((String)list.get(0)).booleanValue();
        }
    }

    private void i(Map map)
    {
        List list = c(map, "X-Afma-Manual-Tracking-Urls");
        if (list != null)
        {
            k = list;
        }
    }

    private void j(Map map)
    {
        long l1 = b(map, "X-Afma-Refresh-Rate");
        if (l1 != -1L)
        {
            l = l1;
        }
    }

    private void k(Map map)
    {
        List list = (List)map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty())
        {
            String s = (String)list.get(0);
            if ("portrait".equalsIgnoreCase(s))
            {
                m = hq.c();
            } else
            if ("landscape".equalsIgnoreCase(s))
            {
                m = hq.b();
                return;
            }
        }
    }

    public du a(long l1)
    {
        return new du(b, c, d, g, h, i, -1L, k, l, m, a, l1, e, f);
    }

    public void a(String s, Map map, String s1)
    {
        b = s;
        c = s1;
        a(map);
    }

    public void a(Map map)
    {
        b(map);
        c(map);
        d(map);
        e(map);
        f(map);
        h(map);
        i(map);
        j(map);
        k(map);
        g(map);
    }
}
