// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.ah;

// Referenced classes of package com.google.android.gms.ads.search:
//            a

public final class SearchAdRequest
{

    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final ah a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final String j;
    private final int k;
    private final String l;
    private final int m;
    private final int n;
    private final String o;

    private SearchAdRequest(Builder builder)
    {
        b = Builder.a(builder);
        c = Builder.b(builder);
        d = Builder.c(builder);
        e = Builder.d(builder);
        f = Builder.e(builder);
        g = Builder.f(builder);
        h = Builder.g(builder);
        i = Builder.h(builder);
        j = Builder.i(builder);
        k = Builder.j(builder);
        l = Builder.k(builder);
        m = Builder.l(builder);
        n = Builder.m(builder);
        o = Builder.n(builder);
        a = new ah(Builder.o(builder), this);
    }

    SearchAdRequest(Builder builder, a a1)
    {
        this(builder);
    }

    ah a()
    {
        return a;
    }

    public int getAnchorTextColor()
    {
        return b;
    }

    public int getBackgroundColor()
    {
        return c;
    }

    public int getBackgroundGradientBottom()
    {
        return d;
    }

    public int getBackgroundGradientTop()
    {
        return e;
    }

    public int getBorderColor()
    {
        return f;
    }

    public int getBorderThickness()
    {
        return g;
    }

    public int getBorderType()
    {
        return h;
    }

    public int getCallButtonColor()
    {
        return i;
    }

    public String getCustomChannels()
    {
        return j;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return a.c(class1);
    }

    public int getDescriptionTextColor()
    {
        return k;
    }

    public String getFontFace()
    {
        return l;
    }

    public int getHeaderTextColor()
    {
        return m;
    }

    public int getHeaderTextSize()
    {
        return n;
    }

    public Location getLocation()
    {
        return a.e();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return a.a(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return a.b(class1);
    }

    public String getQuery()
    {
        return o;
    }

    public boolean isTestDevice(Context context)
    {
        return a.a(context);
    }

    static 
    {
        DEVICE_ID_EMULATOR = ah.a;
    }

    private class Builder
    {

        private final aj a = new aj();
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private String j;
        private int k;
        private String l;
        private int m;
        private int n;
        private String o;

        static int a(Builder builder)
        {
            return builder.b;
        }

        static int b(Builder builder)
        {
            return builder.c;
        }

        static int c(Builder builder)
        {
            return builder.d;
        }

        static int d(Builder builder)
        {
            return builder.e;
        }

        static int e(Builder builder)
        {
            return builder.f;
        }

        static int f(Builder builder)
        {
            return builder.g;
        }

        static int g(Builder builder)
        {
            return builder.h;
        }

        static int h(Builder builder)
        {
            return builder.i;
        }

        static String i(Builder builder)
        {
            return builder.j;
        }

        static int j(Builder builder)
        {
            return builder.k;
        }

        static String k(Builder builder)
        {
            return builder.l;
        }

        static int l(Builder builder)
        {
            return builder.m;
        }

        static int m(Builder builder)
        {
            return builder.n;
        }

        static String n(Builder builder)
        {
            return builder.o;
        }

        static aj o(Builder builder)
        {
            return builder.a;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            a.b(class1, bundle);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            a.a(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            a.a(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            a.b(s);
            return this;
        }

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this, null);
        }

        public Builder setAnchorTextColor(int i1)
        {
            b = i1;
            return this;
        }

        public Builder setBackgroundColor(int i1)
        {
            c = i1;
            d = Color.argb(0, 0, 0, 0);
            e = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i1, int j1)
        {
            c = Color.argb(0, 0, 0, 0);
            d = j1;
            e = i1;
            return this;
        }

        public Builder setBorderColor(int i1)
        {
            f = i1;
            return this;
        }

        public Builder setBorderThickness(int i1)
        {
            g = i1;
            return this;
        }

        public Builder setBorderType(int i1)
        {
            h = i1;
            return this;
        }

        public Builder setCallButtonColor(int i1)
        {
            i = i1;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            j = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i1)
        {
            k = i1;
            return this;
        }

        public Builder setFontFace(String s)
        {
            l = s;
            return this;
        }

        public Builder setHeaderTextColor(int i1)
        {
            m = i1;
            return this;
        }

        public Builder setHeaderTextSize(int i1)
        {
            n = i1;
            return this;
        }

        public Builder setLocation(Location location)
        {
            a.a(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            o = s;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            a.b(flag);
            return this;
        }

        public Builder()
        {
            h = 0;
        }
    }

}
