// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.lr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            c, b, a

public final class AppVisibleCustomProperties
    implements SafeParcelable, Iterable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    public static final AppVisibleCustomProperties a = (new b()).a();
    final int b;
    final List c;

    AppVisibleCustomProperties(int i, Collection collection)
    {
        b = i;
        lr.a(collection);
        c = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection collection)
    {
        this(1, collection);
    }

    AppVisibleCustomProperties(Collection collection, a a1)
    {
        this(collection);
    }

    public int describeContents()
    {
        return 0;
    }

    public Iterator iterator()
    {
        return c.iterator();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.metadata.internal.c.a(this, parcel, i);
    }

}
