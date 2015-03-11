// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hy, nq

public final class kn extends hy
    implements SafeParcelable, a
{

    public static final nq CREATOR = new nq();
    private static final HashMap a;
    private String A;
    private String B;
    private String C;
    private String D;
    private kn E;
    private String F;
    private String G;
    private String H;
    private String I;
    private kn J;
    private double K;
    private kn L;
    private double M;
    private String N;
    private kn O;
    private List P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private kn U;
    private String V;
    private String W;
    private String X;
    private kn Y;
    private String Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private final Set b;
    private final int c;
    private kn d;
    private List e;
    private kn f;
    private String g;
    private String h;
    private String i;
    private List j;
    private int k;
    private List l;
    private kn m;
    private List n;
    private String o;
    private String p;
    private kn q;
    private String r;
    private String s;
    private String t;
    private List u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public kn()
    {
        c = 1;
        b = new HashSet();
    }

    kn(Set set, int i1, kn kn1, List list, kn kn2, String s1, String s2, 
            String s3, List list1, int j1, List list2, kn kn3, List list3, String s4, 
            String s5, kn kn4, String s6, String s7, String s8, List list4, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            String s17, kn kn5, String s18, String s19, String s20, String s21, kn kn6, 
            double d1, kn kn7, double d2, String s22, kn kn8, 
            List list5, String s23, String s24, String s25, String s26, kn kn9, String s27, 
            String s28, String s29, kn kn10, String s30, String s31, String s32, String s33, 
            String s34, String s35)
    {
        b = set;
        c = i1;
        d = kn1;
        e = list;
        f = kn2;
        g = s1;
        h = s2;
        i = s3;
        j = list1;
        k = j1;
        l = list2;
        m = kn3;
        n = list3;
        o = s4;
        p = s5;
        q = kn4;
        r = s6;
        s = s7;
        t = s8;
        u = list4;
        v = s9;
        w = s10;
        x = s11;
        y = s12;
        z = s13;
        A = s14;
        B = s15;
        C = s16;
        D = s17;
        E = kn5;
        F = s18;
        G = s19;
        H = s20;
        I = s21;
        J = kn6;
        K = d1;
        L = kn7;
        M = d2;
        N = s22;
        O = kn8;
        P = list5;
        Q = s23;
        R = s24;
        S = s25;
        T = s26;
        U = kn9;
        V = s27;
        W = s28;
        X = s29;
        Y = kn10;
        Z = s30;
        aa = s31;
        ab = s32;
        ac = s33;
        ad = s34;
        ae = s35;
    }

    public String A()
    {
        return x;
    }

    public String B()
    {
        return y;
    }

    public String C()
    {
        return z;
    }

    public String D()
    {
        return A;
    }

    public String E()
    {
        return B;
    }

    public String F()
    {
        return C;
    }

    public String G()
    {
        return D;
    }

    kn H()
    {
        return E;
    }

    public String I()
    {
        return F;
    }

    public String J()
    {
        return G;
    }

    public String K()
    {
        return H;
    }

    public String L()
    {
        return I;
    }

    kn M()
    {
        return J;
    }

    public double N()
    {
        return K;
    }

    kn O()
    {
        return L;
    }

    public double P()
    {
        return M;
    }

    public String Q()
    {
        return N;
    }

    kn R()
    {
        return O;
    }

    List S()
    {
        return P;
    }

    public String T()
    {
        return Q;
    }

    public String U()
    {
        return R;
    }

    public String V()
    {
        return S;
    }

    public String W()
    {
        return T;
    }

    kn X()
    {
        return U;
    }

    public String Y()
    {
        return V;
    }

    public String Z()
    {
        return W;
    }

    public Object a()
    {
        return ai();
    }

    protected Object a(String s1)
    {
        return null;
    }

    protected boolean a(hy.a a1)
    {
        return b.contains(Integer.valueOf(a1.g()));
    }

    public String aa()
    {
        return X;
    }

    kn ab()
    {
        return Y;
    }

    public String ac()
    {
        return Z;
    }

    public String ad()
    {
        return aa;
    }

    public String ae()
    {
        return ab;
    }

    public String af()
    {
        return ac;
    }

    public String ag()
    {
        return ad;
    }

    public String ah()
    {
        return ae;
    }

    public kn ai()
    {
        return this;
    }

    protected Object b(hy.a a1)
    {
        switch (a1.g())
        {
        case 35: // '#'
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
            return h;

        case 7: // '\007'
            return i;

        case 8: // '\b'
            return j;

        case 9: // '\t'
            return Integer.valueOf(k);

        case 10: // '\n'
            return l;

        case 11: // '\013'
            return m;

        case 12: // '\f'
            return n;

        case 13: // '\r'
            return o;

        case 14: // '\016'
            return p;

        case 15: // '\017'
            return q;

        case 16: // '\020'
            return r;

        case 17: // '\021'
            return s;

        case 18: // '\022'
            return t;

        case 19: // '\023'
            return u;

        case 20: // '\024'
            return v;

        case 21: // '\025'
            return w;

        case 22: // '\026'
            return x;

        case 23: // '\027'
            return y;

        case 24: // '\030'
            return z;

        case 25: // '\031'
            return A;

        case 26: // '\032'
            return B;

        case 27: // '\033'
            return C;

        case 28: // '\034'
            return D;

        case 29: // '\035'
            return E;

        case 30: // '\036'
            return F;

        case 31: // '\037'
            return G;

        case 32: // ' '
            return H;

        case 33: // '!'
            return I;

        case 34: // '"'
            return J;

        case 36: // '$'
            return Double.valueOf(K);

        case 37: // '%'
            return L;

        case 38: // '&'
            return Double.valueOf(M);

        case 39: // '\''
            return N;

        case 40: // '('
            return O;

        case 41: // ')'
            return P;

        case 42: // '*'
            return Q;

        case 43: // '+'
            return R;

        case 44: // ','
            return S;

        case 45: // '-'
            return T;

        case 46: // '.'
            return U;

        case 47: // '/'
            return V;

        case 48: // '0'
            return W;

        case 49: // '1'
            return X;

        case 50: // '2'
            return Y;

        case 51: // '3'
            return Z;

        case 52: // '4'
            return aa;

        case 53: // '5'
            return ab;

        case 54: // '6'
            return ac;

        case 55: // '7'
            return ad;

        case 56: // '8'
            return ae;
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
        nq _tmp = CREATOR;
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
            if (!(obj instanceof kn))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            kn kn1 = (kn)obj;
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
                    if (kn1.a(a1))
                    {
                        if (!b(a1).equals(kn1.b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!kn1.a(a1));
            return false;
        }
        return true;
    }

    int f()
    {
        return c;
    }

    kn g()
    {
        return d;
    }

    public List h()
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

    kn i()
    {
        return f;
    }

    public String j()
    {
        return g;
    }

    public String k()
    {
        return h;
    }

    public String l()
    {
        return i;
    }

    List m()
    {
        return j;
    }

    public int n()
    {
        return k;
    }

    List o()
    {
        return l;
    }

    kn p()
    {
        return m;
    }

    List q()
    {
        return n;
    }

    public String r()
    {
        return o;
    }

    public String s()
    {
        return p;
    }

    kn t()
    {
        return q;
    }

    public String u()
    {
        return r;
    }

    public String v()
    {
        return s;
    }

    public String w()
    {
        return t;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        nq _tmp = CREATOR;
        com.google.android.gms.internal.nq.a(this, parcel, i1);
    }

    List x()
    {
        return u;
    }

    public String y()
    {
        return v;
    }

    public String z()
    {
        return w;
    }

    static 
    {
        a = new HashMap();
        a.put("about", com.google.android.gms.internal.hy.a.a("about", 2, com/google/android/gms/internal/kn));
        a.put("additionalName", hy.a.e("additionalName", 3));
        a.put("address", com.google.android.gms.internal.hy.a.a("address", 4, com/google/android/gms/internal/kn));
        a.put("addressCountry", hy.a.d("addressCountry", 5));
        a.put("addressLocality", hy.a.d("addressLocality", 6));
        a.put("addressRegion", hy.a.d("addressRegion", 7));
        a.put("associated_media", hy.a.b("associated_media", 8, com/google/android/gms/internal/kn));
        a.put("attendeeCount", com.google.android.gms.internal.hy.a.a("attendeeCount", 9));
        a.put("attendees", hy.a.b("attendees", 10, com/google/android/gms/internal/kn));
        a.put("audio", com.google.android.gms.internal.hy.a.a("audio", 11, com/google/android/gms/internal/kn));
        a.put("author", hy.a.b("author", 12, com/google/android/gms/internal/kn));
        a.put("bestRating", hy.a.d("bestRating", 13));
        a.put("birthDate", hy.a.d("birthDate", 14));
        a.put("byArtist", com.google.android.gms.internal.hy.a.a("byArtist", 15, com/google/android/gms/internal/kn));
        a.put("caption", hy.a.d("caption", 16));
        a.put("contentSize", hy.a.d("contentSize", 17));
        a.put("contentUrl", hy.a.d("contentUrl", 18));
        a.put("contributor", hy.a.b("contributor", 19, com/google/android/gms/internal/kn));
        a.put("dateCreated", hy.a.d("dateCreated", 20));
        a.put("dateModified", hy.a.d("dateModified", 21));
        a.put("datePublished", hy.a.d("datePublished", 22));
        a.put("description", hy.a.d("description", 23));
        a.put("duration", hy.a.d("duration", 24));
        a.put("embedUrl", hy.a.d("embedUrl", 25));
        a.put("endDate", hy.a.d("endDate", 26));
        a.put("familyName", hy.a.d("familyName", 27));
        a.put("gender", hy.a.d("gender", 28));
        a.put("geo", com.google.android.gms.internal.hy.a.a("geo", 29, com/google/android/gms/internal/kn));
        a.put("givenName", hy.a.d("givenName", 30));
        a.put("height", hy.a.d("height", 31));
        a.put("id", hy.a.d("id", 32));
        a.put("image", hy.a.d("image", 33));
        a.put("inAlbum", com.google.android.gms.internal.hy.a.a("inAlbum", 34, com/google/android/gms/internal/kn));
        a.put("latitude", hy.a.b("latitude", 36));
        a.put("location", com.google.android.gms.internal.hy.a.a("location", 37, com/google/android/gms/internal/kn));
        a.put("longitude", hy.a.b("longitude", 38));
        a.put("name", hy.a.d("name", 39));
        a.put("partOfTVSeries", com.google.android.gms.internal.hy.a.a("partOfTVSeries", 40, com/google/android/gms/internal/kn));
        a.put("performers", hy.a.b("performers", 41, com/google/android/gms/internal/kn));
        a.put("playerType", hy.a.d("playerType", 42));
        a.put("postOfficeBoxNumber", hy.a.d("postOfficeBoxNumber", 43));
        a.put("postalCode", hy.a.d("postalCode", 44));
        a.put("ratingValue", hy.a.d("ratingValue", 45));
        a.put("reviewRating", com.google.android.gms.internal.hy.a.a("reviewRating", 46, com/google/android/gms/internal/kn));
        a.put("startDate", hy.a.d("startDate", 47));
        a.put("streetAddress", hy.a.d("streetAddress", 48));
        a.put("text", hy.a.d("text", 49));
        a.put("thumbnail", com.google.android.gms.internal.hy.a.a("thumbnail", 50, com/google/android/gms/internal/kn));
        a.put("thumbnailUrl", hy.a.d("thumbnailUrl", 51));
        a.put("tickerSymbol", hy.a.d("tickerSymbol", 52));
        a.put("type", hy.a.d("type", 53));
        a.put("url", hy.a.d("url", 54));
        a.put("width", hy.a.d("width", 55));
        a.put("worstRating", hy.a.d("worstRating", 56));
    }
}
