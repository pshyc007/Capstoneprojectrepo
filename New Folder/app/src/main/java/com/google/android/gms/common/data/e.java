// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.data:
//            a

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(com.google.android.gms.common.data.a a1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, a1.a);
        c.a(parcel, 2, a1.b, i, false);
        c.a(parcel, 3, a1.c);
        c.a(parcel, j);
    }

    public com.google.android.gms.common.data.a a(Parcel parcel)
    {
        int i;
        int j;
        ParcelFileDescriptor parcelfiledescriptor;
        int k;
        i = 0;
        j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        parcelfiledescriptor = null;
        k = 0;
_L6:
        int l;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        com.google.android.gms.common.internal.safeparcel.a.a(l);
        JVM INSTR tableswitch 1 3: default 60
    //                   1 91
    //                   2 117
    //                   3 145;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_145;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        int i1;
        ParcelFileDescriptor parcelfiledescriptor1;
        int j1;
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
        i1 = i;
        parcelfiledescriptor1 = parcelfiledescriptor;
        j1 = k;
_L7:
        k = j1;
        parcelfiledescriptor = parcelfiledescriptor1;
        i = i1;
        if (true) goto _L6; else goto _L5
_L5:
        int k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
        int l1 = i;
        parcelfiledescriptor1 = parcelfiledescriptor;
        j1 = k1;
        i1 = l1;
          goto _L7
_L3:
        ParcelFileDescriptor parcelfiledescriptor2 = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ParcelFileDescriptor.CREATOR);
        j1 = k;
        i1 = i;
        parcelfiledescriptor1 = parcelfiledescriptor2;
          goto _L7
        i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
        parcelfiledescriptor1 = parcelfiledescriptor;
        j1 = k;
          goto _L7
        if (parcel.dataPosition() != j)
        {
            throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new com.google.android.gms.common.data.a(k, parcelfiledescriptor, i);
        }
    }

    public com.google.android.gms.common.data.a[] a(int i)
    {
        return new com.google.android.gms.common.data.a[i];
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
