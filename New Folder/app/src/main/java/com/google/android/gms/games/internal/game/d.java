// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadgeEntity

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(GameBadgeEntity gamebadgeentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, gamebadgeentity.e_());
        c.a(parcel, 1000, gamebadgeentity.f());
        c.a(parcel, 2, gamebadgeentity.c(), false);
        c.a(parcel, 3, gamebadgeentity.d(), false);
        c.a(parcel, 4, gamebadgeentity.e(), i, false);
        c.a(parcel, j);
    }

    public GameBadgeEntity a(Parcel parcel)
    {
        int i = 0;
        Uri uri = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s = null;
        String s1 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GameBadgeEntity(k, i, s1, s, uri);
            }
        } while (true);
    }

    public GameBadgeEntity[] a(int i)
    {
        return new GameBadgeEntity[i];
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
