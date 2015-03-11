// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGameEntity, GameBadgeEntity

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(ExtendedGameEntity extendedgameentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, extendedgameentity.n(), i, false);
        c.a(parcel, 1000, extendedgameentity.m());
        c.a(parcel, 2, extendedgameentity.d());
        c.a(parcel, 3, extendedgameentity.e());
        c.a(parcel, 4, extendedgameentity.f());
        c.a(parcel, 5, extendedgameentity.g());
        c.a(parcel, 6, extendedgameentity.h());
        c.a(parcel, 7, extendedgameentity.i(), false);
        c.a(parcel, 8, extendedgameentity.j());
        c.a(parcel, 9, extendedgameentity.k(), false);
        c.b(parcel, 10, extendedgameentity.c(), false);
        c.a(parcel, 11, extendedgameentity.l(), i, false);
        c.a(parcel, j);
    }

    public ExtendedGameEntity a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        GameEntity gameentity = null;
        int k = 0;
        boolean flag = false;
        int l = 0;
        long l1 = 0L;
        long l2 = 0L;
        String s = null;
        long l3 = 0L;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        SnapshotMetadataEntity snapshotmetadataentity = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 6: // '\006'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 8: // '\b'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, GameBadgeEntity.CREATOR);
                    break;

                case 11: // '\013'
                    snapshotmetadataentity = (SnapshotMetadataEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, SnapshotMetadataEntity.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new ExtendedGameEntity(j, gameentity, k, flag, l, l1, l2, s, l3, s1, arraylist, snapshotmetadataentity);
            }
        } while (true);
    }

    public ExtendedGameEntity[] a(int i)
    {
        return new ExtendedGameEntity[i];
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
