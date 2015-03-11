// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            d, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter, HasFilter

public class FilterHolder
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int a;
    final ComparisonFilter b;
    final FieldOnlyFilter c;
    final LogicalFilter d;
    final NotFilter e;
    final InFilter f;
    final MatchAllFilter g;
    final HasFilter h;
    private final a i;

    FilterHolder(int j, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter, MatchAllFilter matchallfilter, 
            HasFilter hasfilter)
    {
        a = j;
        b = comparisonfilter;
        c = fieldonlyfilter;
        d = logicalfilter;
        e = notfilter;
        f = infilter;
        g = matchallfilter;
        h = hasfilter;
        if (b != null)
        {
            i = b;
            return;
        }
        if (c != null)
        {
            i = c;
            return;
        }
        if (d != null)
        {
            i = d;
            return;
        }
        if (e != null)
        {
            i = e;
            return;
        }
        if (f != null)
        {
            i = f;
            return;
        }
        if (g != null)
        {
            i = g;
            return;
        }
        if (h != null)
        {
            i = h;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.drive.query.internal.d.a(this, parcel, j);
    }

}
