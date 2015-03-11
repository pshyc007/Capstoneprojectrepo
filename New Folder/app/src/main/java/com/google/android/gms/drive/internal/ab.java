// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileIntentSenderRequest

public class ab
    implements android.os.Parcelable.Creator
{

    public ab()
    {
    }

    static void a(CreateFileIntentSenderRequest createfileintentsenderrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, createfileintentsenderrequest.a);
        c.a(parcel, 2, createfileintentsenderrequest.b, i, false);
        c.a(parcel, 3, createfileintentsenderrequest.c);
        c.a(parcel, 4, createfileintentsenderrequest.d, false);
        c.a(parcel, 5, createfileintentsenderrequest.e, i, false);
        c.a(parcel, 6, createfileintentsenderrequest.f, false);
        c.a(parcel, j);
    }

    public CreateFileIntentSenderRequest a(Parcel parcel)
    {
        int i = 0;
        Integer integer = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        DriveId driveid = null;
        String s = null;
        MetadataBundle metadatabundle = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < j)
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
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, MetadataBundle.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 5: // '\005'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DriveId.CREATOR);
                    break;

                case 6: // '\006'
                    integer = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CreateFileIntentSenderRequest(k, metadatabundle, i, s, driveid, integer);
            }
        } while (true);
    }

    public CreateFileIntentSenderRequest[] a(int i)
    {
        return new CreateFileIntentSenderRequest[i];
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
