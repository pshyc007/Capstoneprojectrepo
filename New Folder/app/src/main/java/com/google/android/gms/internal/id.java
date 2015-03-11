// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            hl, ig, hq

public final class id extends hl
{

    private final String a;
    private final Context b;
    private final String c;

    public id(Context context, String s, String s1)
    {
        b = context;
        a = s;
        c = s1;
    }

    public void a()
    {
        HttpURLConnection httpurlconnection;
        ig.d((new StringBuilder()).append("Pinging URL: ").append(c).toString());
        httpurlconnection = (HttpURLConnection)(new URL(c)).openConnection();
        int i;
        hq.a(b, a, true, httpurlconnection);
        i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        ig.e((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(c).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            ig.e((new StringBuilder()).append("Error while parsing ping URL: ").append(c).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            ig.e((new StringBuilder()).append("Error while pinging URL: ").append(c).append(". ").append(ioexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_204;
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public void b()
    {
    }
}
