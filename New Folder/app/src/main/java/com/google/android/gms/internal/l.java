// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            j, al, ii, hq, 
//            m, ik, ev, k, 
//            bb

public class l
    implements j
{

    private final ii a;

    public l(Context context, ev ev)
    {
        a = ii.a(context, new al(), false, false, null, ev);
    }

    public void a()
    {
        hq.a(a);
    }

    public void a(k k)
    {
        a.f().a(new m(this, k));
    }

    public void a(String s)
    {
        a.loadUrl(s);
    }

    public void a(String s, bb bb)
    {
        a.f().a(s, bb);
    }

    public void a(String s, JSONObject jsonobject)
    {
        a.a(s, jsonobject);
    }

    public void b()
    {
        hq.b(a);
    }

    public void b(String s)
    {
        a.f().a(s, null);
    }
}
