// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import java.util.Set;

class e
{

    static a a(MetadataBundle metadatabundle)
    {
        Set set = metadatabundle.a();
        if (set.size() != 1)
        {
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        } else
        {
            return (a)set.iterator().next();
        }
    }
}
