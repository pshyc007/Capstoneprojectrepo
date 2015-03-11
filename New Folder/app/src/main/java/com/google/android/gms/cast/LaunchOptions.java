// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kg;
import com.google.android.gms.internal.ln;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            c

public class LaunchOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int a;
    private boolean b;
    private String c;

    public LaunchOptions()
    {
        this(1, false, kg.a(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean flag, String s)
    {
        a = i;
        b = flag;
        c = s;
    }

    int a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof LaunchOptions))
            {
                return false;
            }
            LaunchOptions launchoptions = (LaunchOptions)obj;
            if (b != launchoptions.b || !kg.a(c, launchoptions.c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[2];
        aobj[0] = Boolean.valueOf(b);
        aobj[1] = c;
        return ln.a(aobj);
    }

    public String toString()
    {
        Object aobj[] = new Object[2];
        aobj[0] = Boolean.valueOf(b);
        aobj[1] = c;
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", aobj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.cast.c.a(this, parcel, i);
    }

}
