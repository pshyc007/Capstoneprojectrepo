// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            AppVisibleCustomProperties

public class b
{

    private final Map a = new HashMap();

    public b()
    {
    }

    public AppVisibleCustomProperties a()
    {
        return new AppVisibleCustomProperties(a.values(), null);
    }
}
