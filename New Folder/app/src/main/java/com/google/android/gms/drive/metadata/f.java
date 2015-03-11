// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import com.google.android.gms.internal.lr;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            a

public abstract class f
    implements a
{

    private final String a;
    private final Set b;
    private final Set c;
    private final int d;

    protected f(String s, int i)
    {
        a = (String)lr.a(s, "fieldName");
        b = Collections.singleton(s);
        c = Collections.emptySet();
        d = i;
    }

    protected f(String s, Collection collection, Collection collection1, int i)
    {
        a = (String)lr.a(s, "fieldName");
        b = Collections.unmodifiableSet(new HashSet(collection));
        c = Collections.unmodifiableSet(new HashSet(collection1));
        d = i;
    }

    public final String a()
    {
        return a;
    }

    public String toString()
    {
        return a;
    }
}
