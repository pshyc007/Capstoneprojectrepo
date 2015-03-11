// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnListEntriesResponse

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(OnListEntriesResponse onlistentriesresponse, Parcel parcel, int j)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, onlistentriesresponse.a);
        c.a(parcel, 2, onlistentriesresponse.b, j, false);
        c.a(parcel, 3, onlistentriesresponse.c);
        c.a(parcel, k);
    }

    public OnListEntriesResponse a(Parcel parcel)
    {
        boolean flag;
        int j;
        DataHolder dataholder;
        int k;
        flag = false;
        j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        dataholder = null;
        k = 0;
_L6:
        int l;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        com.google.android.gms.common.internal.safeparcel.a.a(l);
        JVM INSTR tableswitch 1 3: default 60
    //                   1 91
    //                   2 117
    //                   3 145;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_145;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        boolean flag1;
        DataHolder dataholder1;
        int i1;
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
        flag1 = flag;
        dataholder1 = dataholder;
        i1 = k;
_L7:
        k = i1;
        dataholder = dataholder1;
        flag = flag1;
        if (true) goto _L6; else goto _L5
_L5:
        int j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
        boolean flag2 = flag;
        dataholder1 = dataholder;
        i1 = j1;
        flag1 = flag2;
          goto _L7
_L3:
        DataHolder dataholder2 = (DataHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DataHolder.CREATOR);
        i1 = k;
        flag1 = flag;
        dataholder1 = dataholder2;
          goto _L7
        flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
        dataholder1 = dataholder;
        i1 = k;
          goto _L7
        if (parcel.dataPosition() != j)
        {
            throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new OnListEntriesResponse(k, dataholder, flag);
        }
    }

    public OnListEntriesResponse[] a(int j)
    {
        return new OnListEntriesResponse[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
