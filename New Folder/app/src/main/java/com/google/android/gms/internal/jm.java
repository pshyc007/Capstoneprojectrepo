// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ni, ln, lp

public final class jm
    implements SafeParcelable
{

    public static final ni CREATOR = new ni();
    final int a;
    final List b;
    final List c;
    final List d;
    private final String e;
    private final boolean f;
    private final String g;
    private final Set h;
    private final Set i;
    private final Set j;

    jm(int k, List list, String s, boolean flag, List list1, String s1, List list2)
    {
        a = k;
        List list3;
        List list4;
        List list5;
        if (list == null)
        {
            list3 = Collections.emptyList();
        } else
        {
            list3 = Collections.unmodifiableList(list);
        }
        b = list3;
        if (s == null)
        {
            s = "";
        }
        e = s;
        f = flag;
        if (list1 == null)
        {
            list4 = Collections.emptyList();
        } else
        {
            list4 = Collections.unmodifiableList(list1);
        }
        c = list4;
        if (s1 == null)
        {
            s1 = "";
        }
        g = s1;
        if (list2 == null)
        {
            list5 = Collections.emptyList();
        } else
        {
            list5 = Collections.unmodifiableList(list2);
        }
        d = list5;
        h = a(b);
        i = a(c);
        j = a(d);
    }

    private static Set a(List list)
    {
        if (list.isEmpty())
        {
            return Collections.emptySet();
        } else
        {
            return Collections.unmodifiableSet(new HashSet(list));
        }
    }

    public String a()
    {
        return e;
    }

    public boolean b()
    {
        return f;
    }

    public String c()
    {
        return g;
    }

    public int describeContents()
    {
        ni _tmp = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jm))
            {
                return false;
            }
            jm jm1 = (jm)obj;
            if (!h.equals(jm1.h) || f != jm1.f || !g.equals(jm1.g) || !i.equals(jm1.i) || !j.equals(jm1.j))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[5];
        aobj[0] = h;
        aobj[1] = Boolean.valueOf(f);
        aobj[2] = i;
        aobj[3] = g;
        aobj[4] = j;
        return ln.a(aobj);
    }

    public String toString()
    {
        return ln.a(this).a("types", h).a("placeIds", j).a("requireOpenNow", Boolean.valueOf(f)).a("userAccountName", g).a("requestedUserDataTypes", i).toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        ni _tmp = CREATOR;
        ni.a(this, parcel, k);
    }

}
