// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            c

class e extends BroadcastReceiver
{

    final c a;

    e(c c1)
    {
        a = c1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        a.b(false);
    }
}
