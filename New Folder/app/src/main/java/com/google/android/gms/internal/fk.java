// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jy, kb, lr, fp

public class fk
    implements SafeParcelable
{

    public static final jy CREATOR = new jy();
    public static final int a = Integer.parseInt("-1");
    final int b;
    public final String c;
    final fp d;
    public final int e;
    public final byte f[];

    fk(int i, String s, fp fp, int j, byte abyte0[])
    {
        boolean flag;
        String s1;
        if (j == a || kb.a(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lr.b(flag, (new StringBuilder()).append("Invalid section type ").append(j).toString());
        b = i;
        c = s;
        d = fp;
        e = j;
        f = abyte0;
        s1 = a();
        if (s1 != null)
        {
            throw new IllegalArgumentException(s1);
        } else
        {
            return;
        }
    }

    public String a()
    {
        if (e != a && kb.a(e) == null)
        {
            return (new StringBuilder()).append("Invalid section type ").append(e).toString();
        }
        if (c != null && f != null)
        {
            return "Both content and blobContent set";
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        jy _tmp = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jy _tmp = CREATOR;
        jy.a(this, parcel, i);
    }

}
