// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            pc

public final class v
    implements SafeParcelable
{

    public static final pc CREATOR = new pc();
    public final int a;
    public final boolean b;
    public final boolean c;

    v(int i, boolean flag, boolean flag1)
    {
        a = i;
        b = flag;
        c = flag1;
    }

    public v(boolean flag, boolean flag1)
    {
        a = 1;
        b = flag;
        c = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        pc.a(this, parcel, i);
    }

}
