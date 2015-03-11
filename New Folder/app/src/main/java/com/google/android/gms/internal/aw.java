// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            an

public final class aw
    implements SafeParcelable
{

    public static final an CREATOR = new an();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final String o;

    aw(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, int i3, String s, int j3, String s1, int k3, int l3, 
            String s2)
    {
        a = i1;
        b = j1;
        c = k1;
        d = l1;
        e = i2;
        f = j2;
        g = k2;
        h = l2;
        i = i3;
        j = s;
        k = j3;
        l = s1;
        m = k3;
        n = l3;
        o = s2;
    }

    public aw(SearchAdRequest searchadrequest)
    {
        a = 1;
        b = searchadrequest.getAnchorTextColor();
        c = searchadrequest.getBackgroundColor();
        d = searchadrequest.getBackgroundGradientBottom();
        e = searchadrequest.getBackgroundGradientTop();
        f = searchadrequest.getBorderColor();
        g = searchadrequest.getBorderThickness();
        h = searchadrequest.getBorderType();
        i = searchadrequest.getCallButtonColor();
        j = searchadrequest.getCustomChannels();
        k = searchadrequest.getDescriptionTextColor();
        l = searchadrequest.getFontFace();
        m = searchadrequest.getHeaderTextColor();
        n = searchadrequest.getHeaderTextSize();
        o = searchadrequest.getQuery();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        an.a(this, parcel, i1);
    }

}
