// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.drive.internal:
//            GetDriveIdFromUniqueIdentifierRequest

public class ah
    implements android.os.Parcelable.Creator
{

    public ah()
    {
    }

    static void a(GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, getdriveidfromuniqueidentifierrequest.a);
        c.a(parcel, 2, getdriveidfromuniqueidentifierrequest.b, false);
        c.a(parcel, 3, getdriveidfromuniqueidentifierrequest.c);
        c.a(parcel, j);
    }

    public GetDriveIdFromUniqueIdentifierRequest a(Parcel parcel)
    {
        boolean flag = false;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new GetDriveIdFromUniqueIdentifierRequest(j, s, flag);
            }
        } while (true);
    }

    public GetDriveIdFromUniqueIdentifierRequest[] a(int i)
    {
        return new GetDriveIdFromUniqueIdentifierRequest[i];
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
