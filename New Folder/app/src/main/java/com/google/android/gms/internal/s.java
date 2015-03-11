// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

// Referenced classes of package com.google.android.gms.internal:
//            af

public final class s extends af
{

    private final AppEventListener a;

    public s(AppEventListener appeventlistener)
    {
        a = appeventlistener;
    }

    public void a(String s1, String s2)
    {
        a.onAppEvent(s1, s2);
    }
}
