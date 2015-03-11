// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

// Referenced classes of package com.google.android.gms.internal:
//            ia

public final class ic
{

    public static String a(Context context)
    {
        return WebSettings.getDefaultUserAgent(context);
    }

    public static void a(Context context, WebSettings websettings)
    {
        ia.a(context, websettings);
        websettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
