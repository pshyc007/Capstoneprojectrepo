// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.ah;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads:
//            b

public final class AdRequest
{

    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final ah a;

    private AdRequest(Builder builder)
    {
        a = new ah(Builder.a(builder));
    }

    AdRequest(Builder builder, b b)
    {
        this(builder);
    }

    ah a()
    {
        return a;
    }

    public Date getBirthday()
    {
        return a.a();
    }

    public String getContentUrl()
    {
        return a.b();
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return a.c(class1);
    }

    public int getGender()
    {
        return a.c();
    }

    public Set getKeywords()
    {
        return a.d();
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

        static aj a(Builder builder)
        {
            return builder.a;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            a.b(class1, bundle);
            return this;
        }

        public Builder addKeyword(String s)
        {
            a.a(s);
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

        public AdRequest build()
        {
            return new AdRequest(this, null);
        }

        public Builder setBirthday(Date date)
        {
            a.a(date);
            return this;
        }

        public Builder setContentUrl(String s)
        {
            lr.a(s, "Content URL must be non-null.");
            lr.a(s, "Content URL must be non-empty.");
            boolean flag;
            Object aobj[];
            if (s.length() <= 512)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aobj = new Object[2];
            aobj[0] = Integer.valueOf(512);
            aobj[1] = Integer.valueOf(s.length());
            lr.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", aobj);
            a.c(s);
            return this;
        }

        public Builder setGender(int i)
        {
            a.a(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            a.a(location);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            a.b(flag);
            return this;
        }

        public Builder()
        {
        }
    }

}
