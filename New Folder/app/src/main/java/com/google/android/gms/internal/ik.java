// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            bb, hq, ig, ii, 
//            al, ch, db, ap, 
//            ar, bf, bd, if, 
//            il, im, nz, no, 
//            ce, ow, dh, aq, 
//            bc, be, dm

public class ik extends WebViewClient
{

    protected final ii a;
    private final HashMap b = new HashMap();
    private final Object c = new Object();
    private ow d;
    private dh e;
    private im f;
    private aq g;
    private boolean h;
    private bc i;
    private be j;
    private boolean k;
    private dm l;

    public ik(ii ii1, boolean flag)
    {
        h = false;
        a = ii1;
        k = flag;
    }

    private static boolean a(Uri uri)
    {
        String s = uri.getScheme();
        return "http".equalsIgnoreCase(s) || "https".equalsIgnoreCase(s);
    }

    private void b(Uri uri)
    {
        String s = uri.getPath();
        bb bb1 = (bb)b.get(s);
        if (bb1 != null)
        {
            Map map = hq.a(uri);
            if (ig.a(2))
            {
                ig.d((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ig.d((new StringBuilder()).append("  ").append(s1).append(": ").append((String)map.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            bb1.a(a, map);
            return;
        } else
        {
            ig.d((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
            return;
        }
    }

    public final void a(ce ce1)
    {
        boolean flag = a.i();
        ow ow;
        dh dh;
        if (flag && !a.e().e)
        {
            ow = null;
        } else
        {
            ow = d;
        }
        dh = null;
        if (!flag)
        {
            dh = e;
        }
        a(new ch(ce1, ow, dh, l, a.h()));
    }

    protected void a(ch ch1)
    {
        db.a(a.getContext(), ch1);
    }

    public final void a(im im1)
    {
        f = im1;
    }

    public void a(ow ow, dh dh, aq aq, dm dm, boolean flag, bc bc)
    {
        a("/appEvent", ((bb) (new ap(aq))));
        a("/canOpenURLs", ar.b);
        a("/click", ar.c);
        a("/close", ar.d);
        a("/customClose", ar.e);
        a("/httpTrack", ar.f);
        a("/log", ar.g);
        a("/open", ((bb) (new bf(bc))));
        a("/touch", ar.h);
        a("/video", ar.i);
        d = ow;
        e = dh;
        g = aq;
        i = bc;
        l = dm;
        a(flag);
    }

    public void a(ow ow, dh dh, aq aq, dm dm, boolean flag, bc bc, be be)
    {
        a(ow, dh, aq, dm, flag, bc);
        a("/setInterstitialProperties", ((bb) (new bd(be))));
        j = be;
    }

    public final void a(String s, bb bb1)
    {
        b.put(s, bb1);
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final void a(boolean flag, int i1)
    {
        ow ow;
        if (a.i() && !a.e().e)
        {
            ow = null;
        } else
        {
            ow = d;
        }
        a(new ch(ow, e, l, a, flag, i1, a.h()));
    }

    public final void a(boolean flag, int i1, String s)
    {
        boolean flag1 = a.i();
        ow ow;
        dh dh;
        if (flag1 && !a.e().e)
        {
            ow = null;
        } else
        {
            ow = d;
        }
        dh = null;
        if (!flag1)
        {
            dh = e;
        }
        a(new ch(ow, dh, g, l, a, flag, i1, s, a.h(), i));
    }

    public final void a(boolean flag, int i1, String s, String s1)
    {
        boolean flag1 = a.i();
        ow ow;
        dh dh;
        if (flag1 && !a.e().e)
        {
            ow = null;
        } else
        {
            ow = d;
        }
        if (flag1)
        {
            dh = null;
        } else
        {
            dh = e;
        }
        a(new ch(ow, dh, g, l, a, flag, i1, s, s1, a.h(), i));
    }

    public boolean a()
    {
        boolean flag;
        synchronized (c)
        {
            flag = k;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (c)
        {
            b.clear();
            d = null;
            e = null;
            f = null;
            g = null;
            h = false;
            k = false;
            i = null;
            l = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        db db1;
        h = false;
        k = true;
        db1 = a.d();
        if (db1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (com.google.android.gms.internal.if.b())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if.a.post(new il(this, db1));
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        db1.k();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoadResource(WebView webview, String s)
    {
        ig.d((new StringBuilder()).append("Loading resource: ").append(s).toString());
        Uri uri = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost()))
        {
            b(uri);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (f != null)
        {
            f.a(a);
            f = null;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri;
        ig.d((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        b(uri);
_L7:
        return true;
_L2:
        if (h && webview == a && a(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (a.willNotDraw()) goto _L4; else goto _L3
_L3:
        no no1 = a.g();
        if (no1 == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        Uri uri2;
        if (!no1.b(uri))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        uri2 = no1.a(uri, a.getContext());
        uri = uri2;
        Uri uri1 = uri;
_L5:
        a(new ce("android.intent.action.VIEW", uri1.toString(), null, null, null, null, null));
        continue; /* Loop/switch isn't completed */
        nz nz1;
        nz1;
        ig.e((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
        uri1 = uri;
        if (true) goto _L5; else goto _L4
_L4:
        ig.e((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L7; else goto _L6
_L6:
    }
}
