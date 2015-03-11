// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hy, me, lr, ib, 
//            mj, mg, mk, mf

public class ie extends hy
    implements SafeParcelable
{

    public static final me CREATOR = new me();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final ib d;
    private final String e;
    private int f;
    private int g;

    ie(int i, Parcel parcel, ib ib1)
    {
        a = i;
        b = (Parcel)com.google.android.gms.internal.lr.a(parcel);
        d = ib1;
        if (d == null)
        {
            e = null;
        } else
        {
            e = d.d();
        }
        f = 2;
    }

    public static HashMap a(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static HashMap a(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = hashmap.entrySet().iterator(); iterator.hasNext(); hashmap1.put(Integer.valueOf(((hy.a)entry.getValue()).g()), entry))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return hashmap1;
    }

    private void a(StringBuilder stringbuilder, int i, Object obj)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type = ").append(i).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            stringbuilder.append(obj);
            return;

        case 7: // '\007'
            stringbuilder.append("\"").append(com.google.android.gms.internal.mj.a(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(com.google.android.gms.internal.mg.a((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(com.google.android.gms.internal.mg.b((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.mk.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, hy.a a1, Parcel parcel, int i)
    {
        switch (a1.d())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(a1.d()).toString());

        case 0: // '\0'
            a(stringbuilder, a1, a(a1, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i))));
            return;

        case 1: // '\001'
            a(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.k(parcel, i)));
            return;

        case 2: // '\002'
            a(stringbuilder, a1, a(a1, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i))));
            return;

        case 3: // '\003'
            a(stringbuilder, a1, a(a1, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i))));
            return;

        case 4: // '\004'
            a(stringbuilder, a1, a(a1, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.m(parcel, i))));
            return;

        case 5: // '\005'
            a(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.n(parcel, i)));
            return;

        case 6: // '\006'
            a(stringbuilder, a1, a(a1, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i))));
            return;

        case 7: // '\007'
            a(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.o(parcel, i)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            a(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.r(parcel, i)));
            return;

        case 10: // '\n'
            a(stringbuilder, a1, a(a1, a(com.google.android.gms.common.internal.safeparcel.a.q(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, hy.a a1, Object obj)
    {
        if (a1.c())
        {
            a(stringbuilder, a1, (ArrayList)obj);
            return;
        } else
        {
            a(stringbuilder, a1.b(), obj);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, hy.a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int i = arraylist.size();
        for (int j = 0; j < i; j++)
        {
            if (j != 0)
            {
                stringbuilder.append(",");
            }
            a(stringbuilder, a1.b(), arraylist.get(j));
        }

        stringbuilder.append("]");
    }

    private void a(StringBuilder stringbuilder, String s, hy.a a1, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (a1.j())
        {
            a(stringbuilder, a1, parcel, i);
            return;
        } else
        {
            b(stringbuilder, a1, parcel, i);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, HashMap hashmap, Parcel parcel)
    {
        HashMap hashmap1 = a(hashmap);
        stringbuilder.append('{');
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)hashmap1.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.a(j)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, (String)entry.getKey(), (hy.a)entry.getValue(), parcel, j);
                flag = true;
            }
        } while (true);
        if (parcel.dataPosition() != i)
        {
            throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    private void b(StringBuilder stringbuilder, hy.a a1, Parcel parcel, int i)
    {
        if (!a1.e()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        a1.d();
        JVM INSTR tableswitch 0 11: default 80
    //                   0 91
    //                   1 110
    //                   2 123
    //                   3 136
    //                   4 149
    //                   5 162
    //                   6 175
    //                   7 188
    //                   8 201
    //                   9 201
    //                   10 201
    //                   11 212;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        com.google.android.gms.internal.mf.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, i));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        com.google.android.gms.internal.mf.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, i));
        continue; /* Loop/switch isn't completed */
_L6:
        com.google.android.gms.internal.mf.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.v(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        com.google.android.gms.internal.mf.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.x(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        com.google.android.gms.internal.mf.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.y(parcel, i));
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.mf.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.z(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        com.google.android.gms.internal.mf.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.mf.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.A(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        Parcel aparcel[] = com.google.android.gms.common.internal.safeparcel.a.D(parcel, i);
        int j = aparcel.length;
        int k = 0;
        while (k < j) 
        {
            if (k > 0)
            {
                stringbuilder.append(",");
            }
            aparcel[k].setDataPosition(0);
            a(stringbuilder, a1.l(), aparcel[k]);
            k++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (a1.d())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.m(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.n(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i));
            return;

        case 7: // '\007'
            String s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.mj.a(s1)).append("\"");
            return;

        case 8: // '\b'
            byte abyte1[] = com.google.android.gms.common.internal.safeparcel.a.r(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.mg.a(abyte1)).append("\"");
            return;

        case 9: // '\t'
            byte abyte0[] = com.google.android.gms.common.internal.safeparcel.a.r(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.mg.b(abyte0));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            Bundle bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i);
            Set set = bundle.keySet();
            set.size();
            stringbuilder.append("{");
            Iterator iterator = set.iterator();
            for (boolean flag = true; iterator.hasNext(); flag = false)
            {
                String s = (String)iterator.next();
                if (!flag)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append("\"").append(s).append("\"");
                stringbuilder.append(":");
                stringbuilder.append("\"").append(com.google.android.gms.internal.mj.a(bundle.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            Parcel parcel1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, i);
            parcel1.setDataPosition(0);
            a(stringbuilder, a1.l(), parcel1);
            return;
        }
    }

    public int a()
    {
        return a;
    }

    protected Object a(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public HashMap b()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.a(e);
        }
    }

    protected boolean b(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents()
    {
        me _tmp = CREATOR;
        return 0;
    }

    public Parcel e()
    {
        f;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return b;
_L2:
        g = com.google.android.gms.common.internal.safeparcel.c.a(b);
        com.google.android.gms.common.internal.safeparcel.c.a(b, g);
        f = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.c.a(b, g);
        f = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    ib f()
    {
        switch (c)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(c).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return d;

        case 2: // '\002'
            return d;
        }
    }

    public String toString()
    {
        com.google.android.gms.internal.lr.a(d, "Cannot convert to JSON on client side.");
        Parcel parcel = e();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, d.a(e), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        me _tmp = CREATOR;
        com.google.android.gms.internal.me.a(this, parcel, i);
    }

}
