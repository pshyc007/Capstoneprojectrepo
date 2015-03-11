// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gi, gh, ai, al, 
//            ev

public final class ds
    implements SafeParcelable
{

    public static final gi CREATOR = new gi();
    public final int a;
    public final Bundle b;
    public final ai c;
    public final al d;
    public final String e;
    public final ApplicationInfo f;
    public final PackageInfo g;
    public final String h;
    public final String i;
    public final String j;
    public final ev k;
    public final Bundle l;
    public final String m;

    ds(int i1, Bundle bundle, ai ai, al al, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, ev ev, Bundle bundle1, String s4)
    {
        a = i1;
        b = bundle;
        c = ai;
        d = al;
        e = s;
        f = applicationinfo;
        g = packageinfo;
        h = s1;
        i = s2;
        j = s3;
        k = ev;
        l = bundle1;
        m = s4;
    }

    public ds(Bundle bundle, ai ai, al al, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, ev ev, Bundle bundle1, String s4)
    {
        this(3, bundle, ai, al, s, applicationinfo, packageinfo, s1, s2, s3, ev, bundle1, s4);
    }

    public ds(gh gh1, String s, String s1)
    {
        this(gh1.a, gh1.b, gh1.c, gh1.d, gh1.e, gh1.f, s, gh1.g, gh1.h, gh1.j, gh1.i, s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        gi.a(this, parcel, i1);
    }

}
