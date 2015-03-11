// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class cf
    implements MediationAdRequest
{

    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final int e;

    public cf(Date date, int i, Set set, boolean flag, int j)
    {
        a = date;
        b = i;
        c = set;
        d = flag;
        e = j;
    }

    public Date getBirthday()
    {
        return a;
    }

    public int getGender()
    {
        return b;
    }

    public Set getKeywords()
    {
        return c;
    }

    public boolean isTesting()
    {
        return d;
    }

    public int taggedForChildDirectedTreatment()
    {
        return e;
    }
}
