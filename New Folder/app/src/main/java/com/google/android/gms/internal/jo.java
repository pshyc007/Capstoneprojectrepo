// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            nj, ln, lp

public class jo
    implements SafeParcelable
{

    public static final nj CREATOR = new nj();
    final int a;
    private final String b;
    private final String c;

    jo(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int describeContents()
    {
        nj _tmp = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        jo jo1;
        if (obj instanceof jo)
        {
            if (ln.a(b, (jo1 = (jo)obj).b) && ln.a(c, jo1.c))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[2];
        aobj[0] = b;
        aobj[1] = c;
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("mPlaceId", b).a("mTag", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nj _tmp = CREATOR;
        nj.a(this, parcel, i);
    }

}
