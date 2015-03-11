// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            gm, ig, bh, gz, 
//            du, gs, ds, ai, 
//            gr, ao, if, gp, 
//            gx, hb, ev, gw, 
//            hq, gq, im

public final class go extends gm
{

    private static final Object a = new Object();
    private static go b;
    private final Context c;
    private final hb d;
    private final bh e;
    private final ao f;

    go(Context context, ao ao1, bh bh1, hb hb1)
    {
        c = context;
        d = hb1;
        e = bh1;
        f = ao1;
    }

    private static du a(Context context, ao ao1, bh bh1, hb hb1, ds ds1)
    {
        ig.a("Starting ad request from service.");
        bh1.a();
        gz gz1 = new gz(context);
        if (gz1.l == -1)
        {
            ig.a("Device is offline.");
            return new du(2);
        }
        gs gs1 = new gs(ds1.f.packageName);
        if (ds1.c.c != null)
        {
            String s3 = ds1.c.c.getString("_ad");
            if (s3 != null)
            {
                return gr.a(context, ds1, s3);
            }
        }
        android.location.Location location = bh1.a(250L);
        String s = ao1.a();
        String s1 = gr.a(ds1, gz1, location, ao1.b());
        if (s1 == null)
        {
            return new du(0);
        }
        im im = a(s1);
        if.a.post(new gp(context, ds1, gs1, im, s));
        gx gx1 = gs1.b();
        if (gx1 == null || TextUtils.isEmpty(gx1.c()))
        {
            return new du(gs1.a());
        }
        boolean flag = gx1.e();
        String s2 = null;
        if (flag)
        {
            s2 = hb1.a(ds1.g.packageName);
        }
        return a(context, ds1.k.b, gx1.c(), s2, gx1);
    }

    public static du a(Context context, String s, String s1, String s2, gx gx1)
    {
        HttpURLConnection httpurlconnection;
        gw gw1;
        URL url;
        long l;
        URL url1;
        int i;
        int j;
        Map map;
        du du1;
        String s3;
        du du2;
        du du3;
        String s4;
        String s5;
        du du4;
        byte abyte0[];
        BufferedOutputStream bufferedoutputstream;
        try
        {
            gw1 = new gw();
            url = new URL(s1);
            l = SystemClock.elapsedRealtime();
        }
        catch (IOException ioexception)
        {
            ig.e((new StringBuilder()).append("Error while connecting to ad server: ").append(ioexception.getMessage()).toString());
            return new du(2);
        }
        url1 = url;
        i = 0;
        httpurlconnection = (HttpURLConnection)url1.openConnection();
        hq.a(context, s, false, httpurlconnection);
        if (!TextUtils.isEmpty(s2))
        {
            httpurlconnection.addRequestProperty("x-afma-drt-cookie", s2);
        }
        if (gx1 == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (!TextUtils.isEmpty(gx1.b()))
        {
            httpurlconnection.setDoOutput(true);
            abyte0 = gx1.b().getBytes();
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        s4 = url1.toString();
        s5 = hq.a(new InputStreamReader(httpurlconnection.getInputStream()));
        a(s4, map, s5, j);
        gw1.a(s4, map, s5);
        du4 = gw1.a(l);
        httpurlconnection.disconnect();
        return du4;
        a(url1.toString(), map, ((String) (null)), j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        s3 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s3))
        {
            break MISSING_BLOCK_LABEL_294;
        }
        ig.e("No location header to follow redirect.");
        du3 = new du(0);
        httpurlconnection.disconnect();
        return du3;
        url1 = new URL(s3);
        if (++i <= 5)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        ig.e("Too many redirects.");
        du2 = new du(0);
        httpurlconnection.disconnect();
        return du2;
        ig.e((new StringBuilder()).append("Received error HTTP response code: ").append(j).toString());
        du1 = new du(0);
        httpurlconnection.disconnect();
        return du1;
        gw1.a(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public static go a(Context context, ao ao1, bh bh1, hb hb1)
    {
        go go1;
        synchronized (a)
        {
            if (b == null)
            {
                b = new go(context.getApplicationContext(), ao1, bh1, hb1);
            }
            go1 = b;
        }
        return go1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static im a(String s)
    {
        return new gq(s);
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (ig.a(2))
        {
            ig.d((new StringBuilder()).append("Http Response: {\n  URL:\n    ").append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
                {
                    String s2 = (String)iterator.next();
                    ig.d((new StringBuilder()).append("    ").append(s2).append(":").toString());
                    Iterator iterator1 = ((List)map.get(s2)).iterator();
                    while (iterator1.hasNext()) 
                    {
                        String s3 = (String)iterator1.next();
                        ig.d((new StringBuilder()).append("      ").append(s3).toString());
                    }
                }

            }
            ig.d("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    ig.d(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                ig.d("    null");
            }
            ig.d((new StringBuilder()).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    public du a(ds ds1)
    {
        return a(c, f, e, d, ds1);
    }

}
