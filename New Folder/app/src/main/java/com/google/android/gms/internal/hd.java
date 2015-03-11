// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ai, ii, bl, by, 
//            bm, bo, al

public final class hd
{

    public final ai a;
    public final ii b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final JSONObject j;
    public final boolean k;
    public final bl l;
    public final by m;
    public final String n;
    public final bm o;
    public final bo p;
    public final long q;
    public final al r;
    public final long s;
    public final long t;
    public final long u;
    public final String v;

    public hd(ai ai, ii ii, List list, int i1, List list1, List list2, int j1, 
            long l1, String s1, boolean flag, bl bl, by by, String s2, 
            bm bm, bo bo, long l2, al al, long l3, 
            long l4, long l5, String s3, JSONObject jsonobject)
    {
        a = ai;
        b = ii;
        List list3;
        List list4;
        List list5;
        if (list != null)
        {
            list3 = Collections.unmodifiableList(list);
        } else
        {
            list3 = null;
        }
        c = list3;
        d = i1;
        if (list1 != null)
        {
            list4 = Collections.unmodifiableList(list1);
        } else
        {
            list4 = null;
        }
        e = list4;
        if (list2 != null)
        {
            list5 = Collections.unmodifiableList(list2);
        } else
        {
            list5 = null;
        }
        f = list5;
        g = j1;
        h = l1;
        i = s1;
        k = flag;
        l = bl;
        m = by;
        n = s2;
        o = bm;
        p = bo;
        q = l2;
        r = al;
        s = l3;
        t = l4;
        u = l5;
        v = s3;
        j = jsonobject;
    }
}
