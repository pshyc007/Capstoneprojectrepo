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
//            OnListParentsResponse

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(OnListParentsResponse onlistparentsresponse, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, onlistparentsresponse.a);
        c.a(parcel, 2, onlistparentsresponse.b, i, false);
        c.a(parcel, k);
    }

    public OnListParentsResponse a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        DataHolder dataholder = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    dataholder = (DataHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DataHolder.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new OnListParentsResponse(k, dataholder);
            }
        } while (true);
    }

    public OnListParentsResponse[] a(int i)
    {
        return new OnListParentsResponse[i];
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
