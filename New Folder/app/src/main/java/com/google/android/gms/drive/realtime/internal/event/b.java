// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEventList, ParcelableEvent, ParcelableObjectChangedEvent

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(ParcelableEventList parcelableeventlist, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, parcelableeventlist.a);
        c.a(parcel, 2, parcelableeventlist.b, i, false);
        c.a(parcel, 3, parcelableeventlist.c, i, false);
        c.a(parcel, 4, parcelableeventlist.d);
        c.a(parcel, 5, parcelableeventlist.e, i, false);
        c.a(parcel, j);
    }

    public ParcelableEventList a(Parcel parcel)
    {
        boolean flag = false;
        ParcelableObjectChangedEvent aparcelableobjectchangedevent[] = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        DataHolder dataholder = null;
        ParcelableEvent aparcelableevent[] = null;
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
                    aparcelableevent = (ParcelableEvent[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, ParcelableEvent.CREATOR);
                    break;

                case 3: // '\003'
                    dataholder = (DataHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataHolder.CREATOR);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    aparcelableobjectchangedevent = (ParcelableObjectChangedEvent[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, ParcelableObjectChangedEvent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new ParcelableEventList(j, aparcelableevent, dataholder, flag, aparcelableobjectchangedevent);
            }
        } while (true);
    }

    public ParcelableEventList[] a(int i)
    {
        return new ParcelableEventList[i];
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
