// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            im, ig, ii

final class gq
    implements im
{

    final String a;

    gq(String s)
    {
        a = s;
        super();
    }

    public void a(ii ii1)
    {
        Object aobj[] = new Object[2];
        aobj[0] = "AFMA_buildAdURL";
        aobj[1] = a;
        String s = String.format("javascript:%s(%s);", aobj);
        ig.d((new StringBuilder()).append("About to execute: ").append(s).toString());
        ii1.loadUrl(s);
    }
}
