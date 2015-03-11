// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            lh, lr, ko

public final class ku extends lh
{

    private ko a;

    public ku(ko ko1)
    {
        a = ko1;
    }

    public void a(int i, IBinder ibinder, Bundle bundle)
    {
        lr.a("onPostInitComplete can be called only once per call to getServiceFromBroker", a);
        a.a(i, ibinder, bundle);
        a = null;
    }
}
