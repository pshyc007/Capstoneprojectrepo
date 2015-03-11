// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ah, aw, ai

public class q
{

    public static final q a = new q();

    private q()
    {
    }

    public static q a()
    {
        return a;
    }

    public ai a(Context context, ah ah1)
    {
        Date date = ah1.a();
        long l;
        String s;
        int i;
        Set set;
        java.util.List list;
        boolean flag;
        int j;
        android.location.Location location;
        android.os.Bundle bundle;
        boolean flag1;
        String s1;
        com.google.android.gms.ads.search.SearchAdRequest searchadrequest;
        aw aw1;
        if (date != null)
        {
            l = date.getTime();
        } else
        {
            l = -1L;
        }
        s = ah1.b();
        i = ah1.c();
        set = ah1.d();
        if (!set.isEmpty())
        {
            list = Collections.unmodifiableList(new ArrayList(set));
        } else
        {
            list = null;
        }
        flag = ah1.a(context);
        j = ah1.k();
        location = ah1.e();
        bundle = ah1.b(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = ah1.f();
        s1 = ah1.g();
        searchadrequest = ah1.h();
        if (searchadrequest != null)
        {
            aw1 = new aw(searchadrequest);
        } else
        {
            aw1 = null;
        }
        return new ai(4, l, bundle, i, list, flag, j, flag1, s1, aw1, location, s, ah1.j());
    }

}
