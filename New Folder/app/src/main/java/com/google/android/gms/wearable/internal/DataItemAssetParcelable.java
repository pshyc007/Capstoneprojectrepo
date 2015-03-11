// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.lr;
import com.google.android.gms.wearable.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            o

public class DataItemAssetParcelable
    implements SafeParcelable, b
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    final int a;
    private final String b;
    private final String c;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public DataItemAssetParcelable(b b1)
    {
        a = 1;
        b = (String)lr.a(b1.b());
        c = (String)lr.a(b1.c());
    }

    public Object a()
    {
        return d();
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public b d()
    {
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (b == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(b);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(c);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
