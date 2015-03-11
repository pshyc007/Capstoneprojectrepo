// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            gk

public final class du
    implements SafeParcelable
{

    public static final gk CREATOR = new gk();
    public final int a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final List f;
    public final long g;
    public final boolean h;
    public final long i;
    public final List j;
    public final long k;
    public final int l;
    public final String m;
    public final long n;
    public final String o;
    public final boolean p;
    public final String q;
    public final String r;

    public du(int i1)
    {
        this(7, null, null, null, i1, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null);
    }

    public du(int i1, long l1)
    {
        this(7, null, null, null, i1, null, -1L, false, -1L, null, l1, -1, null, -1L, null, false, null, null);
    }

    du(int i1, String s, String s1, List list, int j1, List list1, long l1, boolean flag, long l2, List list2, long l3, 
            int k1, String s2, long l4, String s3, boolean flag1, String s4, 
            String s5)
    {
        a = i1;
        b = s;
        c = s1;
        List list3;
        List list4;
        List list5;
        if (list != null)
        {
            list3 = Collections.unmodifiableList(list);
        } else
        {
            list3 = null;
        }
        d = list3;
        e = j1;
        if (list1 != null)
        {
            list4 = Collections.unmodifiableList(list1);
        } else
        {
            list4 = null;
        }
        f = list4;
        g = l1;
        h = flag;
        i = l2;
        if (list2 != null)
        {
            list5 = Collections.unmodifiableList(list2);
        } else
        {
            list5 = null;
        }
        j = list5;
        k = l3;
        l = k1;
        m = s2;
        n = l4;
        o = s3;
        p = flag1;
        q = s4;
        r = s5;
    }

    public du(String s, String s1, List list, List list1, long l1, boolean flag, 
            long l2, List list2, long l3, int i1, String s2, 
            long l4, String s3, String s4)
    {
        this(7, s, s1, list, -2, list1, l1, flag, l2, list2, l3, i1, s2, l4, s3, false, null, s4);
    }

    public du(String s, String s1, List list, List list1, long l1, boolean flag, 
            long l2, List list2, long l3, int i1, String s2, 
            long l4, String s3, boolean flag1, String s4, String s5)
    {
        this(7, s, s1, list, -2, list1, l1, flag, l2, list2, l3, i1, s2, l4, s3, flag1, s4, s5);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        gk.a(this, parcel, i1);
    }

}
