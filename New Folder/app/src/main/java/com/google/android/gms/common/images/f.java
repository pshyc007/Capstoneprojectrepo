// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.ln;

final class f
{

    public final Uri a;

    public f(Uri uri)
    {
        a = uri;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof f))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        } else
        {
            return ln.a(((f)obj).a, a);
        }
    }

    public int hashCode()
    {
        Object aobj[] = new Object[1];
        aobj[0] = a;
        return ln.a(aobj);
    }
}
