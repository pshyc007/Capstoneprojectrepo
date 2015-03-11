// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kc, fm

public class fp
    implements SafeParcelable
{

    public static final kc CREATOR = new kc();
    final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final String g;
    public final fm h[];
    final int i[];
    public final String j;

    fp(int k, String s, String s1, boolean flag, int l, boolean flag1, String s2, 
            fm afm[], int ai[], String s3)
    {
        a = k;
        b = s;
        c = s1;
        d = flag;
        e = l;
        f = flag1;
        g = s2;
        h = afm;
        i = ai;
        j = s3;
    }

    public int describeContents()
    {
        kc _tmp = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag = obj instanceof fp;
        boolean flag1 = false;
        if (flag)
        {
            fp fp1 = (fp)obj;
            boolean flag2 = b.equals(fp1.b);
            flag1 = false;
            if (flag2)
            {
                boolean flag3 = c.equals(fp1.c);
                flag1 = false;
                if (flag3)
                {
                    boolean flag4 = d;
                    boolean flag5 = fp1.d;
                    flag1 = false;
                    if (flag4 == flag5)
                    {
                        flag1 = true;
                    }
                }
            }
        }
        return flag1;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        kc _tmp = CREATOR;
        kc.a(this, parcel, k);
    }

}
