// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.query.internal.LogicalFilter;

// Referenced classes of package com.google.android.gms.drive.query:
//            Query, SortOrder

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(Query query, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1000, query.d);
        c.a(parcel, 1, query.a, i, false);
        c.a(parcel, 3, query.b, false);
        c.a(parcel, 4, query.c, i, false);
        c.a(parcel, j);
    }

    public Query a(Parcel parcel)
    {
        SortOrder sortorder;
        int i;
        int j;
        String s;
        LogicalFilter logicalfilter;
        sortorder = null;
        i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        j = 0;
        s = null;
        logicalfilter = null;
_L7:
        int k;
        if (parcel.dataPosition() >= i)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        com.google.android.gms.common.internal.safeparcel.a.a(k);
        JVM INSTR lookupswitch 4: default 76
    //                   1: 145
    //                   3: 181
    //                   4: 211
    //                   1000: 115;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_211;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        SortOrder sortorder1;
        String s1;
        LogicalFilter logicalfilter1;
        int l;
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        sortorder1 = sortorder;
        s1 = s;
        logicalfilter1 = logicalfilter;
        l = j;
_L8:
        j = l;
        logicalfilter = logicalfilter1;
        s = s1;
        sortorder = sortorder1;
        if (true) goto _L7; else goto _L6
_L6:
        int i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        SortOrder sortorder3 = sortorder;
        s1 = s;
        logicalfilter1 = logicalfilter;
        l = i1;
        sortorder1 = sortorder3;
          goto _L8
_L2:
        LogicalFilter logicalfilter2 = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LogicalFilter.CREATOR);
        l = j;
        String s3 = s;
        logicalfilter1 = logicalfilter2;
        sortorder1 = sortorder;
        s1 = s3;
          goto _L8
_L3:
        String s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
        logicalfilter1 = logicalfilter;
        l = j;
        SortOrder sortorder2 = sortorder;
        s1 = s2;
        sortorder1 = sortorder2;
          goto _L8
        sortorder1 = (SortOrder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, SortOrder.CREATOR);
        s1 = s;
        logicalfilter1 = logicalfilter;
        l = j;
          goto _L8
        if (parcel.dataPosition() != i)
        {
            throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            return new Query(j, logicalfilter, s, sortorder);
        }
    }

    public Query[] a(int i)
    {
        return new Query[i];
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
