// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.event:
//            EventEntity

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(EventEntity evententity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, evententity.c_(), false);
        c.a(parcel, 1000, evententity.k());
        c.a(parcel, 2, evententity.c(), false);
        c.a(parcel, 3, evententity.d(), false);
        c.a(parcel, 4, evententity.e(), i, false);
        c.a(parcel, 5, evententity.f(), false);
        c.a(parcel, 6, evententity.g(), i, false);
        c.a(parcel, 7, evententity.h());
        c.a(parcel, 8, evententity.i(), false);
        c.a(parcel, 9, evententity.j());
        c.a(parcel, j);
    }

    public EventEntity a(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long l = 0L;
        PlayerEntity playerentity = null;
        String s1 = null;
        Uri uri = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
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
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PlayerEntity.CREATOR);
                    break;

                case 7: // '\007'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new EventEntity(j, s4, s3, s2, uri, s1, playerentity, l, s, flag);
            }
        } while (true);
    }

    public EventEntity[] a(int i)
    {
        return new EventEntity[i];
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
