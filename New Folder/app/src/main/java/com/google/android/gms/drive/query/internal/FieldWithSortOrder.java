// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            c

public class FieldWithSortOrder
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    final String a;
    final boolean b;
    final int c;

    FieldWithSortOrder(int i, String s, boolean flag)
    {
        c = i;
        a = s;
        b = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.c.a(this, parcel, i);
    }

}
