// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class gx
{

    private final List a;
    private final List b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final boolean h;
    private final int i;

    public gx(Map map)
    {
        g = (String)map.get("url");
        d = (String)map.get("base_uri");
        e = (String)map.get("post_parameters");
        h = a((String)map.get("drt_include"));
        c = (String)map.get("activation_overlay_url");
        b = b((String)map.get("check_packages"));
        i = c((String)map.get("request_id"));
        f = (String)map.get("type");
        a = b((String)map.get("errors"));
    }

    private static boolean a(String s)
    {
        return s != null && (s.equals("1") || s.equals("true"));
    }

    private List b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Arrays.asList(s.split(","));
        }
    }

    private int c(String s)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return Integer.parseInt(s);
        }
    }

    public List a()
    {
        return a;
    }

    public String b()
    {
        return e;
    }

    public String c()
    {
        return g;
    }

    public String d()
    {
        return f;
    }

    public boolean e()
    {
        return h;
    }
}
