// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchEntity

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(TurnBasedMatchEntity turnbasedmatchentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, turnbasedmatchentity.i_(), i, false);
        c.a(parcel, 2, turnbasedmatchentity.c(), false);
        c.a(parcel, 3, turnbasedmatchentity.d(), false);
        c.a(parcel, 4, turnbasedmatchentity.e());
        c.a(parcel, 5, turnbasedmatchentity.j(), false);
        c.a(parcel, 6, turnbasedmatchentity.k());
        c.a(parcel, 7, turnbasedmatchentity.m(), false);
        c.a(parcel, 8, turnbasedmatchentity.f());
        c.a(parcel, 10, turnbasedmatchentity.i());
        c.a(parcel, 11, turnbasedmatchentity.o());
        c.a(parcel, 12, turnbasedmatchentity.n(), false);
        c.b(parcel, 13, turnbasedmatchentity.l(), false);
        c.a(parcel, 14, turnbasedmatchentity.p(), false);
        c.a(parcel, 15, turnbasedmatchentity.q(), false);
        c.a(parcel, 17, turnbasedmatchentity.s(), false);
        c.a(parcel, 16, turnbasedmatchentity.r());
        c.a(parcel, 1000, turnbasedmatchentity.w());
        c.a(parcel, 19, turnbasedmatchentity.u());
        c.a(parcel, 18, turnbasedmatchentity.g());
        c.a(parcel, 21, turnbasedmatchentity.v(), false);
        c.a(parcel, 20, turnbasedmatchentity.h(), false);
        c.a(parcel, j);
    }

    public TurnBasedMatchEntity a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        GameEntity gameentity = null;
        String s = null;
        String s1 = null;
        long l = 0L;
        String s2 = null;
        long l1 = 0L;
        String s3 = null;
        int k = 0;
        int i1 = 0;
        int j1 = 0;
        byte abyte0[] = null;
        java.util.ArrayList arraylist = null;
        String s4 = null;
        byte abyte1[] = null;
        int k1 = 0;
        android.os.Bundle bundle = null;
        int i2 = 0;
        boolean flag = false;
        String s5 = null;
        String s6 = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int j2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j2))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j2);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j2, GameEntity.CREATOR);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j2);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
                    break;

                case 6: // '\006'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j2);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
                    break;

                case 8: // '\b'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j2);
                    break;

                case 10: // '\n'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j2);
                    break;

                case 11: // '\013'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j2);
                    break;

                case 12: // '\f'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, j2);
                    break;

                case 13: // '\r'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j2, ParticipantEntity.CREATOR);
                    break;

                case 14: // '\016'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
                    break;

                case 15: // '\017'
                    abyte1 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, j2);
                    break;

                case 17: // '\021'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, j2);
                    break;

                case 16: // '\020'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j2);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j2);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j2);
                    break;

                case 18: // '\022'
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j2);
                    break;

                case 21: // '\025'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
                    break;

                case 20: // '\024'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new TurnBasedMatchEntity(j, gameentity, s, s1, l, s2, l1, s3, k, i1, j1, abyte0, arraylist, s4, abyte1, k1, bundle, i2, flag, s5, s6);
            }
        } while (true);
    }

    public TurnBasedMatchEntity[] a(int i)
    {
        return new TurnBasedMatchEntity[i];
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
