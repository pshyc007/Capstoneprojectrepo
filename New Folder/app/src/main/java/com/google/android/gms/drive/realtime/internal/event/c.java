// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableObjectChangedEvent

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(ParcelableObjectChangedEvent parcelableobjectchangedevent, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, parcelableobjectchangedevent.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, parcelableobjectchangedevent.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, parcelableobjectchangedevent.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, parcelableobjectchangedevent.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, parcelableobjectchangedevent.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, parcelableobjectchangedevent.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, parcelableobjectchangedevent.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, parcelableobjectchangedevent.h);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }

    public ParcelableObjectChangedEvent a(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        String s1 = null;
        boolean flag = false;
        String s2 = null;
        String s3 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ParcelableObjectChangedEvent(l, s3, s2, flag, s1, s, k, i);
            }
        } while (true);
    }

    public ParcelableObjectChangedEvent[] a(int i)
    {
        return new ParcelableObjectChangedEvent[i];
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
