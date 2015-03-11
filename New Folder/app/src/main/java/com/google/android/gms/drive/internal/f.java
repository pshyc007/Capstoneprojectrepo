// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnDownloadProgressResponse

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(OnDownloadProgressResponse ondownloadprogressresponse, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, ondownloadprogressresponse.a);
        c.a(parcel, 2, ondownloadprogressresponse.b);
        c.a(parcel, 3, ondownloadprogressresponse.c);
        c.a(parcel, j);
    }

    public OnDownloadProgressResponse a(Parcel parcel)
    {
        long l = 0L;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        long l1 = l;
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
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new OnDownloadProgressResponse(j, l1, l);
            }
        } while (true);
    }

    public OnDownloadProgressResponse[] a(int i)
    {
        return new OnDownloadProgressResponse[i];
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
