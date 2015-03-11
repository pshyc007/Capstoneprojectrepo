// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.lr;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            h

public class CustomPropertyKey
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    final int a;
    final String b;
    final int c;

    CustomPropertyKey(int i, String s, int j)
    {
        boolean flag = true;
        super();
        a = i;
        lr.a(s, "key");
        if (j != 0 && j != flag)
        {
            flag = false;
        }
        lr.a(flag, "visibility must be either PUBLIC or PRIVATE");
        b = s;
        c = j;
    }

    public String a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (obj != null)
        {
            if (obj == this)
            {
                return flag;
            }
            if (obj instanceof CustomPropertyKey)
            {
                CustomPropertyKey custompropertykey = (CustomPropertyKey)obj;
                if (!custompropertykey.a().equals(b) || custompropertykey.b() != c)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (new StringBuilder()).append(b).append(c).toString().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("CustomPropertyKey(").append(b).append(",").append(c).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
