// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hy, ns, hv

public final class ks extends hy
    implements SafeParcelable, a
{

    public static final ns CREATOR = new ns();
    private static final HashMap a;
    private boolean A;
    private final Set b;
    private final int c;
    private String d;
    private a e;
    private String f;
    private String g;
    private int h;
    private b i;
    private String j;
    private String k;
    private int l;
    private String m;
    private c n;
    private boolean o;
    private String p;
    private d q;
    private String r;
    private int s;
    private List t;
    private List u;
    private int v;
    private int w;
    private String x;
    private String y;
    private List z;

    public ks()
    {
        c = 2;
        b = new HashSet();
    }

    ks(Set set, int i1, String s1, a a1, String s2, String s3, int j1, 
            b b1, String s4, String s5, int k1, String s6, c c1, boolean flag, 
            String s7, d d1, String s8, int l1, List list, List list1, int i2, 
            int j2, String s9, String s10, List list2, boolean flag1)
    {
        b = set;
        c = i1;
        d = s1;
        e = a1;
        f = s2;
        g = s3;
        h = j1;
        i = b1;
        j = s4;
        k = s5;
        l = k1;
        m = s6;
        n = c1;
        o = flag;
        p = s7;
        q = d1;
        r = s8;
        s = l1;
        t = list;
        u = list1;
        v = i2;
        w = j2;
        x = s9;
        y = s10;
        z = list2;
        A = flag1;
    }

    public String A()
    {
        return x;
    }

    public String B()
    {
        return y;
    }

    List C()
    {
        return z;
    }

    public boolean D()
    {
        return A;
    }

    public ks E()
    {
        return this;
    }

    public Object a()
    {
        return E();
    }

    protected Object a(String s1)
    {
        return null;
    }

    protected boolean a(hy.a a1)
    {
        return b.contains(Integer.valueOf(a1.g()));
    }

    protected Object b(hy.a a1)
    {
        switch (a1.g())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.g()).toString());

        case 2: // '\002'
            return d;

        case 3: // '\003'
            return e;

        case 4: // '\004'
            return f;

        case 5: // '\005'
            return g;

        case 6: // '\006'
            return Integer.valueOf(h);

        case 7: // '\007'
            return i;

        case 8: // '\b'
            return j;

        case 9: // '\t'
            return k;

        case 12: // '\f'
            return Integer.valueOf(l);

        case 14: // '\016'
            return m;

        case 15: // '\017'
            return n;

        case 16: // '\020'
            return Boolean.valueOf(o);

        case 18: // '\022'
            return p;

        case 19: // '\023'
            return q;

        case 20: // '\024'
            return r;

        case 21: // '\025'
            return Integer.valueOf(s);

        case 22: // '\026'
            return t;

        case 23: // '\027'
            return u;

        case 24: // '\030'
            return Integer.valueOf(v);

        case 25: // '\031'
            return Integer.valueOf(w);

        case 26: // '\032'
            return x;

        case 27: // '\033'
            return y;

        case 28: // '\034'
            return z;

        case 29: // '\035'
            return Boolean.valueOf(A);
        }
    }

    public HashMap b()
    {
        return a;
    }

    protected boolean b(String s1)
    {
        return false;
    }

    public int describeContents()
    {
        ns _tmp = CREATOR;
        return 0;
    }

    Set e()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof ks))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            ks ks1 = (ks)obj;
            hy.a a1;
label1:
            do
            {
                for (Iterator iterator = a.values().iterator(); iterator.hasNext();)
                {
                    a1 = (hy.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (ks1.a(a1))
                    {
                        if (!b(a1).equals(ks1.b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!ks1.a(a1));
            return false;
        }
        return true;
    }

    int f()
    {
        return c;
    }

    public String g()
    {
        return d;
    }

    a h()
    {
        return e;
    }

    public int hashCode()
    {
        Iterator iterator = a.values().iterator();
        int i1 = 0;
        while (iterator.hasNext()) 
        {
            hy.a a1 = (hy.a)iterator.next();
            int j1;
            if (a(a1))
            {
                j1 = i1 + a1.g() + b(a1).hashCode();
            } else
            {
                j1 = i1;
            }
            i1 = j1;
        }
        return i1;
    }

    public String i()
    {
        return f;
    }

    public String j()
    {
        return g;
    }

    public int k()
    {
        return h;
    }

    b l()
    {
        return i;
    }

    public String m()
    {
        return j;
    }

    public String n()
    {
        return k;
    }

    public int o()
    {
        return l;
    }

    public String p()
    {
        return m;
    }

    c q()
    {
        return n;
    }

    public boolean r()
    {
        return o;
    }

    public String s()
    {
        return p;
    }

    d t()
    {
        return q;
    }

    public String u()
    {
        return r;
    }

    public int v()
    {
        return s;
    }

    List w()
    {
        return t;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ns _tmp = CREATOR;
        com.google.android.gms.internal.ns.a(this, parcel, i1);
    }

    List x()
    {
        return u;
    }

    public int y()
    {
        return v;
    }

    public int z()
    {
        return w;
    }

    static 
    {
        a = new HashMap();
        a.put("aboutMe", hy.a.d("aboutMe", 2));
        a.put("ageRange", com.google.android.gms.internal.hy.a.a("ageRange", 3, com/google/android/gms/internal/ks$a));
        a.put("birthday", hy.a.d("birthday", 4));
        a.put("braggingRights", hy.a.d("braggingRights", 5));
        a.put("circledByCount", com.google.android.gms.internal.hy.a.a("circledByCount", 6));
        a.put("cover", com.google.android.gms.internal.hy.a.a("cover", 7, com/google/android/gms/internal/ks$b));
        a.put("currentLocation", hy.a.d("currentLocation", 8));
        a.put("displayName", hy.a.d("displayName", 9));
        a.put("gender", com.google.android.gms.internal.hy.a.a("gender", 12, (new hv()).a("male", 0).a("female", 1).a("other", 2), false));
        a.put("id", hy.a.d("id", 14));
        a.put("image", com.google.android.gms.internal.hy.a.a("image", 15, com/google/android/gms/internal/ks$c));
        a.put("isPlusUser", hy.a.c("isPlusUser", 16));
        a.put("language", hy.a.d("language", 18));
        a.put("name", com.google.android.gms.internal.hy.a.a("name", 19, com/google/android/gms/internal/ks$d));
        a.put("nickname", hy.a.d("nickname", 20));
        a.put("objectType", com.google.android.gms.internal.hy.a.a("objectType", 21, (new hv()).a("person", 0).a("page", 1), false));
        a.put("organizations", hy.a.b("organizations", 22, com/google/android/gms/internal/ks$f));
        a.put("placesLived", hy.a.b("placesLived", 23, com/google/android/gms/internal/ks$g));
        a.put("plusOneCount", com.google.android.gms.internal.hy.a.a("plusOneCount", 24));
        a.put("relationshipStatus", com.google.android.gms.internal.hy.a.a("relationshipStatus", 25, (new hv()).a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8), false));
        a.put("tagline", hy.a.d("tagline", 26));
        a.put("url", hy.a.d("url", 27));
        a.put("urls", hy.a.b("urls", 28, com/google/android/gms/internal/ks$h));
        a.put("verified", hy.a.c("verified", 29));
    }
}
