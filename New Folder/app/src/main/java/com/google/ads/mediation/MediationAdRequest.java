// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

public final class MediationAdRequest
{

    private final Date a;
    private final com.google.ads.AdRequest.Gender b;
    private final Set c;
    private final boolean d;
    private final Location e;

    public MediationAdRequest(Date date, com.google.ads.AdRequest.Gender gender, Set set, boolean flag, Location location)
    {
        a = date;
        b = gender;
        c = set;
        d = flag;
        e = location;
    }

    public Integer getAgeInYears()
    {
        return null;
    }

    public Date getBirthday()
    {
        return a;
    }

    public com.google.ads.AdRequest.Gender getGender()
    {
        return b;
    }

    public Set getKeywords()
    {
        return c;
    }

    public Location getLocation()
    {
        return e;
    }

    public boolean isTesting()
    {
        return d;
    }
}
