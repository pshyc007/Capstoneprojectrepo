// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            np, ln, lp

public class ka
    implements SafeParcelable
{

    public static final np CREATOR = new np();
    public final int a;
    public final String b;
    public final String c;

    public ka(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public int describeContents()
    {
        np _tmp = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof ka))
            {
                return false;
            }
            ka ka1 = (ka)obj;
            if (!c.equals(ka1.c) || !b.equals(ka1.b))
            {
                return false;
            }
        }
        return true;
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
        return ln.a(this).a("clientPackageName", b).a("locale", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        np _tmp = CREATOR;
        np.a(this, parcel, i);
    }

}
