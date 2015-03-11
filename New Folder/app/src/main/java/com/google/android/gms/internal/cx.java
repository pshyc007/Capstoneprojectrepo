// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.a;
import java.util.Date;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            cy, al, ai

public final class cx
{

    public static int a(com.google.ads.AdRequest.ErrorCode errorcode)
    {
        switch (cy.b[errorcode.ordinal()])
        {
        default:
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 2;

        case 4: // '\004'
            return 3;
        }
    }

    public static com.google.ads.AdRequest.Gender a(int i)
    {
        switch (i)
        {
        default:
            return com.google.ads.AdRequest.Gender.UNKNOWN;

        case 2: // '\002'
            return com.google.ads.AdRequest.Gender.FEMALE;

        case 1: // '\001'
            return com.google.ads.AdRequest.Gender.MALE;
        }
    }

    public static AdSize a(al al1)
    {
        int i = 0;
        AdSize aadsize[] = new AdSize[6];
        aadsize[0] = AdSize.SMART_BANNER;
        aadsize[1] = AdSize.BANNER;
        aadsize[2] = AdSize.IAB_MRECT;
        aadsize[3] = AdSize.IAB_BANNER;
        aadsize[4] = AdSize.IAB_LEADERBOARD;
        aadsize[5] = AdSize.IAB_WIDE_SKYSCRAPER;
        for (; i < aadsize.length; i++)
        {
            if (aadsize[i].getWidth() == al1.f && aadsize[i].getHeight() == al1.c)
            {
                return aadsize[i];
            }
        }

        return new AdSize(com.google.android.gms.ads.a.a(al1.f, al1.c, al1.b));
    }

    public static MediationAdRequest a(ai ai1)
    {
        HashSet hashset;
        if (ai1.e != null)
        {
            hashset = new HashSet(ai1.e);
        } else
        {
            hashset = null;
        }
        return new MediationAdRequest(new Date(ai1.b), a(ai1.d), hashset, ai1.f, ai1.k);
    }
}
