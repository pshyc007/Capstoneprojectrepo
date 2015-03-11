// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            fd

final class jt
    implements android.os.Parcelable.Creator
{

    jt()
    {
    }

    public fd a(Parcel parcel)
    {
        return new fd(parcel);
    }

    public fd[] a(int i)
    {
        return new fd[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
