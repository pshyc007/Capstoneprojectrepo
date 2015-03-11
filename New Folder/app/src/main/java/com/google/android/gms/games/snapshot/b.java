// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(SnapshotMetadataChange snapshotmetadatachange, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, snapshotmetadatachange.b(), false);
        c.a(parcel, 1000, snapshotmetadatachange.a());
        c.a(parcel, 2, snapshotmetadatachange.c(), false);
        c.a(parcel, 4, snapshotmetadatachange.e(), i, false);
        c.a(parcel, 5, snapshotmetadatachange.d(), i, false);
        c.a(parcel, j);
    }

    public SnapshotMetadataChange a(Parcel parcel)
    {
        Uri uri = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        com.google.android.gms.common.data.a a1 = null;
        Long long1 = null;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    long1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    a1 = (com.google.android.gms.common.data.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, com.google.android.gms.common.data.a.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new SnapshotMetadataChange(j, s, long1, a1, uri);
            }
        } while (true);
    }

    public SnapshotMetadataChange[] a(int i)
    {
        return new SnapshotMetadataChange[i];
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
