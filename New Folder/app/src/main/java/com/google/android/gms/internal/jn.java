// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            ik, hq, ii, ig, 
//            al, ev

public class jn extends ik
{

    public jn(ii ii1, boolean flag)
    {
        super(ii1, flag);
    }

    protected WebResourceResponse a(Context context, String s, String s1)
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(s1)).openConnection();
        WebResourceResponse webresourceresponse;
        hq.a(context, s, true, httpurlconnection);
        httpurlconnection.connect();
        webresourceresponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(hq.a(new InputStreamReader(httpurlconnection.getInputStream())).getBytes("UTF-8")));
        httpurlconnection.disconnect();
        return webresourceresponse;
        Exception exception;
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        WebResourceResponse webresourceresponse;
        try
        {
            if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
            {
                return super.shouldInterceptRequest(webview, s);
            }
            if (!(webview instanceof ii))
            {
                ig.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            ii ii1 = (ii)webview;
            ii1.f().c();
            if (ii1.e().e)
            {
                ig.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return a(ii1.getContext(), a.h().b, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            }
            if (ii1.i())
            {
                ig.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return a(ii1.getContext(), a.h().b, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            }
            ig.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
            webresourceresponse = a(ii1.getContext(), a.h().b, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        }
        catch (IOException ioexception)
        {
            ig.e((new StringBuilder()).append("Could not fetching MRAID JS. ").append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
        return webresourceresponse;
    }
}
