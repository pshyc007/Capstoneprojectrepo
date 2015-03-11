// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantEntity, ParticipantResult

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(ParticipantEntity participantentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, participantentity.k(), false);
        c.a(parcel, 1000, participantentity.n());
        c.a(parcel, 2, participantentity.f(), false);
        c.a(parcel, 3, participantentity.g(), i, false);
        c.a(parcel, 4, participantentity.i(), i, false);
        c.a(parcel, 5, participantentity.g_());
        c.a(parcel, 6, participantentity.c(), false);
        c.a(parcel, 7, participantentity.e());
        c.a(parcel, 8, participantentity.l(), i, false);
        c.a(parcel, 9, participantentity.d());
        c.a(parcel, 10, participantentity.m(), i, false);
        c.a(parcel, 11, participantentity.h(), false);
        c.a(parcel, 12, participantentity.j(), false);
        c.a(parcel, j);
    }

    public ParticipantEntity a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        String s = null;
        String s1 = null;
        Uri uri = null;
        Uri uri1 = null;
        int k = 0;
        String s2 = null;
        boolean flag = false;
        PlayerEntity playerentity = null;
        int l = 0;
        ParticipantResult participantresult = null;
        String s3 = null;
        String s4 = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 8: // '\b'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 9: // '\t'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 10: // '\n'
                    participantresult = (ParticipantResult)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ParticipantResult.CREATOR);
                    break;

                case 11: // '\013'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 12: // '\f'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new ParticipantEntity(j, s, s1, uri, uri1, k, s2, flag, playerentity, l, participantresult, s3, s4);
            }
        } while (true);
    }

    public ParticipantEntity[] a(int i)
    {
        return new ParticipantEntity[i];
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
