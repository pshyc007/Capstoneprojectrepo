// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, nz, ig, ii, 
//            no, id, ev

final class au
    implements bb
{

    au()
    {
    }

    public void a(ii ii1, Map map)
    {
        String s;
        Uri uri;
        s = (String)map.get("u");
        if (s == null)
        {
            ig.e("URL missing from click GMSG.");
            return;
        }
        uri = Uri.parse(s);
        no no1 = ii1.g();
        if (no1 == null) goto _L2; else goto _L1
_L1:
        if (!no1.b(uri)) goto _L2; else goto _L3
_L3:
        Uri uri2 = no1.a(uri, ii1.getContext());
        Uri uri1 = uri2;
_L5:
        String s1 = uri1.toString();
        (new id(ii1.getContext(), ii1.h().b, s1)).e();
        return;
        nz nz1;
        nz1;
        ig.e((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
_L2:
        uri1 = uri;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
