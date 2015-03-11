// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.if;

public final class AdSize
{

    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    private final int a;
    private final int b;
    private final String c;

    public AdSize(int i, int j)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        StringBuilder stringbuilder1;
        String s1;
        if (i == -1)
        {
            s = "FULL";
        } else
        {
            s = String.valueOf(i);
        }
        stringbuilder1 = stringbuilder.append(s).append("x");
        if (j == -2)
        {
            s1 = "AUTO";
        } else
        {
            s1 = String.valueOf(j);
        }
        this(i, j, stringbuilder1.append(s1).append("_as").toString());
    }

    AdSize(int i, int j, String s)
    {
        if (i < 0 && i != -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid width for AdSize: ").append(i).toString());
        }
        if (j < 0 && j != -2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid height for AdSize: ").append(j).toString());
        } else
        {
            a = i;
            b = j;
            c = s;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AdSize))
            {
                return false;
            }
            AdSize adsize = (AdSize)obj;
            if (a != adsize.a || b != adsize.b || !c.equals(adsize.c))
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return b;
    }

    public int getHeightInPixels(Context context)
    {
        if (b == -2)
        {
            return al.b(context.getResources().getDisplayMetrics());
        } else
        {
            return com.google.android.gms.internal.if.a(context, b);
        }
    }

    public int getWidth()
    {
        return a;
    }

    public int getWidthInPixels(Context context)
    {
        if (a == -1)
        {
            return al.a(context.getResources().getDisplayMetrics());
        } else
        {
            return com.google.android.gms.internal.if.a(context, a);
        }
    }

    public int hashCode()
    {
        return c.hashCode();
    }

    public boolean isAutoHeight()
    {
        return b == -2;
    }

    public boolean isFullWidth()
    {
        return a == -1;
    }

    public String toString()
    {
        return c;
    }

}
