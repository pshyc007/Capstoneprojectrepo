// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            dg, ow, dh, ii, 
//            aq, dm, bc, ce, 
//            ev, v

public final class ch
    implements SafeParcelable
{

    public static final dg CREATOR = new dg();
    public final int a;
    public final ce b;
    public final ow c;
    public final dh d;
    public final ii e;
    public final aq f;
    public final String g;
    public final boolean h;
    public final String i;
    public final dm j;
    public final int k;
    public final int l;
    public final String m;
    public final ev n;
    public final bc o;
    public final String p;
    public final v q;

    ch(int i1, ce ce, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j1, int k1, String s2, ev ev, 
            IBinder ibinder5, String s3, v v)
    {
        a = i1;
        b = ce;
        c = (ow)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder));
        d = (dh)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder1));
        e = (ii)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder2));
        f = (aq)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder3));
        g = s;
        h = flag;
        i = s1;
        j = (dm)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder4));
        k = j1;
        l = k1;
        m = s2;
        n = ev;
        o = (bc)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(ibinder5));
        p = s3;
        q = v;
    }

    public ch(ce ce, ow ow1, dh dh1, dm dm1, ev ev)
    {
        a = 4;
        b = ce;
        c = ow1;
        d = dh1;
        e = null;
        f = null;
        g = null;
        h = false;
        i = null;
        j = dm1;
        k = -1;
        l = 4;
        m = null;
        n = ev;
        o = null;
        p = null;
        q = null;
    }

    public ch(ow ow1, dh dh1, aq aq1, dm dm1, ii ii1, boolean flag, int i1, 
            String s, ev ev, bc bc1)
    {
        a = 4;
        b = null;
        c = ow1;
        d = dh1;
        e = ii1;
        f = aq1;
        g = null;
        h = flag;
        i = null;
        j = dm1;
        k = i1;
        l = 3;
        m = s;
        n = ev;
        o = bc1;
        p = null;
        q = null;
    }

    public ch(ow ow1, dh dh1, aq aq1, dm dm1, ii ii1, boolean flag, int i1, 
            String s, String s1, ev ev, bc bc1)
    {
        a = 4;
        b = null;
        c = ow1;
        d = dh1;
        e = ii1;
        f = aq1;
        g = s1;
        h = flag;
        i = s;
        j = dm1;
        k = i1;
        l = 3;
        m = null;
        n = ev;
        o = bc1;
        p = null;
        q = null;
    }

    public ch(ow ow1, dh dh1, dm dm1, ii ii1, int i1, ev ev, String s, 
            v v)
    {
        a = 4;
        b = null;
        c = ow1;
        d = dh1;
        e = ii1;
        f = null;
        g = null;
        h = false;
        i = null;
        j = dm1;
        k = i1;
        l = 1;
        m = null;
        n = ev;
        o = null;
        p = s;
        q = v;
    }

    public ch(ow ow1, dh dh1, dm dm1, ii ii1, boolean flag, int i1, ev ev)
    {
        a = 4;
        b = null;
        c = ow1;
        d = dh1;
        e = ii1;
        f = null;
        g = null;
        h = flag;
        i = null;
        j = dm1;
        k = i1;
        l = 2;
        m = null;
        n = ev;
        o = null;
        p = null;
        q = null;
    }

    public static ch a(Intent intent)
    {
        ch ch1;
        try
        {
            Bundle bundle = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundle.setClassLoader(com/google/android/gms/internal/ch.getClassLoader());
            ch1 = (ch)bundle.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        catch (Exception exception)
        {
            return null;
        }
        return ch1;
    }

    public static void a(Intent intent, ch ch1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", ch1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder a()
    {
        return com.google.android.gms.a.d.a(c).asBinder();
    }

    IBinder b()
    {
        return com.google.android.gms.a.d.a(d).asBinder();
    }

    IBinder c()
    {
        return com.google.android.gms.a.d.a(e).asBinder();
    }

    IBinder d()
    {
        return com.google.android.gms.a.d.a(f).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    IBinder e()
    {
        return com.google.android.gms.a.d.a(o).asBinder();
    }

    IBinder f()
    {
        return com.google.android.gms.a.d.a(j).asBinder();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.internal.dg.a(this, parcel, i1);
    }

}
