// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            fg, fk

public class jv
    implements android.os.Parcelable.Creator
{

    public jv()
    {
    }

    static void a(fg fg1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, fg1.b, i, false);
        c.a(parcel, 1000, fg1.a);
        c.a(parcel, 2, fg1.c, false);
        c.a(parcel, 3, fg1.d);
        c.a(parcel, j);
    }

    public fg a(Parcel parcel)
    {
        String s;
        boolean flag;
        int i;
        fk afk[];
        int j;
        s = null;
        flag = false;
        i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        afk = null;
        j = 0;
_L7:
        int k;
        if (parcel.dataPosition() >= i)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        com.google.android.gms.common.internal.safeparcel.a.a(k);
        JVM INSTR lookupswitch 4: default 80
    //                   1: 117
    //                   2: 181
    //                   3: 211
    //                   1000: 152;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_211;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        boolean flag1;
        String s1;
        fk afk1[];
        int l;
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        flag1 = flag;
        s1 = s;
        afk1 = afk;
        l = j;
_L8:
        j = l;
        afk = afk1;
        s = s1;
        flag = flag1;
        if (true) goto _L7; else goto _L6
_L6:
        fk afk2[] = (fk[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, fk.CREATOR);
        l = j;
        String s3 = s;
        afk1 = afk2;
        flag1 = flag;
        s1 = s3;
          goto _L8
_L5:
        int i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        boolean flag3 = flag;
        s1 = s;
        afk1 = afk;
        l = i1;
        flag1 = flag3;
          goto _L8
_L3:
        String s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
        afk1 = afk;
        l = j;
        boolean flag2 = flag;
        s1 = s2;
        flag1 = flag2;
          goto _L8
        flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
        s1 = s;
        afk1 = afk;
        l = j;
          goto _L8
        if (parcel.dataPosition() != i)
        {
            throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            return new fg(j, afk, s, flag);
        }
    }

    public fg[] a(int i)
    {
        return new fg[i];
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
