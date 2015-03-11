// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kg;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            b

public class CastDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    String a;
    private final int b;
    private String c;
    private Inet4Address d;
    private String e;
    private String f;
    private String g;
    private int h;
    private List i;
    private int j;

    private CastDevice()
    {
        this(2, null, null, null, null, null, -1, ((List) (new ArrayList())), 0);
    }

    CastDevice(int k, String s, String s1, String s2, String s3, String s4, int l, 
            List list, int i1)
    {
        b = k;
        c = s;
        a = s1;
        if (a != null)
        {
            try
            {
                InetAddress inetaddress = InetAddress.getByName(a);
                if (inetaddress instanceof Inet4Address)
                {
                    d = (Inet4Address)inetaddress;
                }
            }
            catch (UnknownHostException unknownhostexception)
            {
                d = null;
            }
        }
        e = s2;
        f = s3;
        g = s4;
        h = l;
        i = list;
        j = i1;
    }

    int a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return e;
    }

    public String d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        CastDevice castdevice;
        if (!(obj instanceof CastDevice))
        {
            return false;
        }
        castdevice = (CastDevice)obj;
        if (b() != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (castdevice.b() == null) goto _L1; else goto _L3
_L3:
        return false;
        if (kg.a(c, castdevice.c) && kg.a(d, castdevice.d) && kg.a(f, castdevice.f) && kg.a(e, castdevice.e) && kg.a(g, castdevice.g) && h == castdevice.h && kg.a(i, castdevice.i) && j == castdevice.j) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int f()
    {
        return h;
    }

    public List g()
    {
        return Collections.unmodifiableList(i);
    }

    public int h()
    {
        return j;
    }

    public int hashCode()
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c.hashCode();
        }
    }

    public String toString()
    {
        Object aobj[] = new Object[2];
        aobj[0] = e;
        aobj[1] = c;
        return String.format("\"%s\" (%s)", aobj);
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.cast.b.a(this, parcel, k);
    }

}
