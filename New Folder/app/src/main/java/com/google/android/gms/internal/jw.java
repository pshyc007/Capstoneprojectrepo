// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            nn, lr

public final class jw
    implements SafeParcelable
{

    public static final nn CREATOR = new nn();
    public static final jw a;
    public static final jw b;
    public static final Set c;
    final int d;
    final String e;
    final int f;

    jw(int i, String s, int j)
    {
        lr.a(s);
        d = i;
        e = s;
        f = j;
    }

    private static jw a(String s, int i)
    {
        return new jw(0, s, i);
    }

    public int describeContents()
    {
        nn _tmp = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jw))
            {
                return false;
            }
            jw jw1 = (jw)obj;
            if (!e.equals(jw1.e) || f != jw1.f)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return e.hashCode();
    }

    public String toString()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nn _tmp = CREATOR;
        nn.a(this, parcel, i);
    }

    static 
    {
        a = a("test_type", 1);
        b = a("saved_offers", 4);
        jw ajw[] = new jw[2];
        ajw[0] = a;
        ajw[1] = b;
        c = Collections.unmodifiableSet(new HashSet(Arrays.asList(ajw)));
    }
}
