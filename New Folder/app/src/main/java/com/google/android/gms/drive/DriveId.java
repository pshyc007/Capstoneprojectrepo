// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.d;
import com.google.android.gms.internal.lr;
import com.google.android.gms.internal.ok;

// Referenced classes of package com.google.android.gms.drive:
//            b

public class DriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;
    final String b;
    final long c;
    final long d;
    private volatile String e;

    DriveId(int i, String s, long l, long l1)
    {
label0:
        {
            super();
            e = null;
            a = i;
            b = s;
            boolean flag;
            boolean flag1;
            if (!"".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            lr.b(flag);
            if (s == null)
            {
                int j = l != -1L;
                flag1 = false;
                if (j == 0)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        lr.b(flag1);
        c = l;
        d = l1;
    }

    public final String a()
    {
        if (e == null)
        {
            String s = Base64.encodeToString(b(), 10);
            e = (new StringBuilder()).append("DriveId:").append(s).toString();
        }
        return e;
    }

    final byte[] b()
    {
        d d1 = new d();
        d1.a = a;
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        d1.b = s;
        d1.c = c;
        d1.d = d;
        return ok.a(d1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DriveId)
        {
            DriveId driveid = (DriveId)obj;
            if (driveid.d != d)
            {
                Log.w("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if (driveid.c == -1L && c == -1L)
            {
                return driveid.b.equals(b);
            }
            if (driveid.c == c)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        if (c == -1L)
        {
            return b.hashCode();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(d)).append(String.valueOf(c)).toString().hashCode();
        }
    }

    public String toString()
    {
        return a();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.b.a(this, parcel, i);
    }

}
