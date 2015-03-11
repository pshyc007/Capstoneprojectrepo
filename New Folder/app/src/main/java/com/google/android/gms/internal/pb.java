// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            al, no, pa, oz, 
//            ev, u, hl, hd, 
//            he, ae, fa, en, 
//            ei, hj

final class pb
{

    public final oz a;
    public final String b;
    public final Context c;
    public final no d = new no(new pa(this));
    public final ev e;
    public u f;
    public hl g;
    public al h;
    public hd i;
    public he j;
    public ae k;
    public fa l;
    public en m;
    public ei n;
    public hj o;
    public boolean p;
    private HashSet q;

    public pb(Context context, al al1, String s, ev ev)
    {
        o = null;
        p = false;
        q = null;
        if (al1.e)
        {
            a = null;
        } else
        {
            a = new oz(context);
            a.setMinimumWidth(al1.g);
            a.setMinimumHeight(al1.d);
            a.setVisibility(4);
        }
        h = al1;
        b = s;
        c = context;
        e = ev;
    }

    public HashSet a()
    {
        return q;
    }

    public void a(HashSet hashset)
    {
        q = hashset;
    }
}
