// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jt

public class fd
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jt();
    private String a;
    private String b;
    private String c;

    public fd()
    {
    }

    fd(Parcel parcel)
    {
        a(parcel);
    }

    private void a(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
