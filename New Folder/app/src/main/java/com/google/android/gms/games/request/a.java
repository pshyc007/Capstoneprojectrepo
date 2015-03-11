// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequestEntity

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GameRequestEntity gamerequestentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, gamerequestentity.e(), i, false);
        c.a(parcel, 1000, gamerequestentity.b());
        c.a(parcel, 2, gamerequestentity.f(), i, false);
        c.a(parcel, 3, gamerequestentity.h(), false);
        c.a(parcel, 4, gamerequestentity.d(), false);
        c.b(parcel, 5, gamerequestentity.n(), false);
        c.a(parcel, 7, gamerequestentity.i());
        c.a(parcel, 9, gamerequestentity.j());
        c.a(parcel, 10, gamerequestentity.k());
        c.a(parcel, 11, gamerequestentity.c(), false);
        c.a(parcel, 12, gamerequestentity.l());
        c.a(parcel, j);
    }

    public GameRequestEntity a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        GameEntity gameentity = null;
        PlayerEntity playerentity = null;
        byte abyte0[] = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        int k = 0;
        long l = 0L;
        long l1 = 0L;
        android.os.Bundle bundle = null;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, PlayerEntity.CREATOR);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, j1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, PlayerEntity.CREATOR);
                    break;

                case 7: // '\007'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 9: // '\t'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 10: // '\n'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 11: // '\013'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, j1);
                    break;

                case 12: // '\f'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new GameRequestEntity(j, gameentity, playerentity, abyte0, s, arraylist, k, l, l1, bundle, i1);
            }
        } while (true);
    }

    public GameRequestEntity[] a(int i)
    {
        return new GameRequestEntity[i];
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
