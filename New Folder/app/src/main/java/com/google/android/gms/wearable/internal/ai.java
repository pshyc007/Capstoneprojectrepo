// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            g

public class ai
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    final int a;
    private final String b;
    private final String c;

    ai(int i, String s, String s1)
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
        return 0;
    }

    public boolean equals(Object obj)
    {
        ai ai1;
        if (obj instanceof ai)
        {
            if ((ai1 = (ai)obj).b.equals(b) && ai1.c.equals(c))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return 37 * (629 + b.hashCode()) + c.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("NodeParcelable{").append(b).append(",").append(c).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
