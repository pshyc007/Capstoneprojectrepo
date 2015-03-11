// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            ii, dd

final class df
{

    public final int a;
    public final android.view.ViewGroup.LayoutParams b;
    public final ViewGroup c;

    public df(ii ii1)
    {
        b = ii1.getLayoutParams();
        android.view.ViewParent viewparent = ii1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            c = (ViewGroup)viewparent;
            a = c.indexOfChild(ii1);
            c.removeView(ii1);
            ii1.a(true);
            return;
        } else
        {
            throw new dd("Could not get the parent of the WebView for an overlay.");
        }
    }
}
